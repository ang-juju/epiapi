package com.css.component.epiapi;

import com.css.component.epiapi.common.utils.AesUtil;
import com.css.component.epiapi.common.utils.HashUtil;
import com.css.component.epiapi.config.CustomConfig;
import com.css.component.epiapi.pojo.EntInfoRes;
import com.css.component.epiapi.pojo.EntInfoResContent;
import com.css.component.epiapi.pojo.Entinfo;
import com.css.component.epiapi.pojo.EntinfoSHAREHOLDER;
import com.css.component.epic.WSInterface;
import com.thoughtworks.xstream.XStream;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@RestController
@RequestMapping("/")
@Api(tags = "企业详情信息查询服务")
@DependsOn("customConfig")
public class ApiController {
    private static WSInterface wsInterface;
    private static String ASE_HASH;

    public ApiController() throws FileNotFoundException, UnsupportedEncodingException {
        String classPath = URLDecoder.decode(ResourceUtils.getURL("classpath:").getPath(), "utf-8");
        //企业个人信息平台接口初始化
        System.setProperty("javax.net.ssl.trustStore", classPath + CustomConfig.PATH); //key路径
        System.setProperty("javax.net.ssl.trustStorePassword", CustomConfig.PASSWORD);//密码
        System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
        java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setAddress(CustomConfig.URL);
        wsInterface = factoryBean.create(WSInterface.class);
        //计算hash
        ASE_HASH = HashUtil.hash(CustomConfig.RANDOM + CustomConfig.KEY).substring(0, 16);
    }

    /**
     * 微服务网关服务健康检测
     */
    @GetMapping("/")
    public void checkHealth() {
    }

    /**
     * eid、creditcode、regno、name、orgcode 节点至少填一项，
     * 当同时传入这五个参数的时候，匹配优先级依次是：eid,creditcode,regno,name,orgcode
     */
    @ApiOperation(value = "企业详情信息查询接口", notes = "eid、creditcode、regno、name、orgcode 节点至少填一项,当同时传入这五个参数的时候，匹配优先级依次是：eid,creditcode,regno,name,orgcode")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "eid", value = "企业ID", dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "creditcode", value = "统一信用代码", dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "regno", value = "企业注册号", dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "name", value = "企业名称", dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "orgcode", value = "组织机构代码", dataType = "String"),
    })
    @GetMapping("/queryEnterpriseInfo")
    public EntInfoResContent queryEnterpriseInfo(Entinfo entinfo) throws Exception {
        XStream xs = new XStream();
        xs.alias("entinfo", Entinfo.class);
        String xml = xs.toXML(entinfo);
        String checkContent = AesUtil.encrypt(xml, ASE_HASH, CustomConfig.OFFSET);
        String checkHash = HashUtil.hash(xml);
        String result = wsInterface.epicIdentity(CustomConfig.RANDOM, checkContent, checkHash, CustomConfig.LOGIN_NAME);
        EntInfoResContent entInfoResContent = new EntInfoResContent();
        if (result != null) {
            XStream xs2 = new XStream();
            xs2.alias("EntInfoRes", EntInfoRes.class);
            EntInfoRes entInfoRes = (EntInfoRes) xs2.fromXML(result);
            String entInfoResStr = entInfoRes.getENTINFO();
            String encrypt = AesUtil.decrypt(entInfoResStr, ASE_HASH, CustomConfig.OFFSET);
            if (encrypt != null) {
                XStream xs3 = new XStream();
                xs3.alias("EntInfoResContent", EntInfoResContent.class);
                xs3.alias("SHAREHOLDER", EntinfoSHAREHOLDER.class);
                xs3.aliasAttribute(EntInfoResContent.class, "SHAREHOLDERS", "SHAREHOLDERS");
                entInfoResContent = (EntInfoResContent) xs3.fromXML(encrypt);
            }
        }
        return entInfoResContent;
    }
}
