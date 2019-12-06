package com.css.component.epiapi.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * 企业详情查询接口响应消息企业基本信息实体类
 *
 * @author GR
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class EntinfoBASIC {
    private Long entinfoId;//企业ID
    private String ID;//企业ID
    private String ABUITEM;//许可经营项目
    private String ANCHEYEAR;//最后年检年度
    private String APPRDATE;//核准日期
    private String CANDATE;//注销日期
    private String CREDITCODE;//统一信用代码
    private String DOM;//住址
    private String DOMDISTRICT;//住所所在行政区划
    private String EMAIL;//邮箱
    private String ENTITYTYPE;//实体类型
    private String ENTNAME;//企业名称
    private String ENTNAME_OLD;//曾用名
    private String ENTSTATUS;//经营状态
    private String ENTSTATUSCODE;//经营状态编码
    private String ENTTYPE;//企业类型
    private String ENTTYPECODE;//企业(机构)类型编码
    private String ESDATE;//成立日期
    private String FRNAME;//法定代表人/负责人/执行事务合伙人
    private String OPFROM;//经营期限自
    private String OPTO;//经营期限至
    private String ORGCODES;//组织机构代码
    private String POSTALCODE;//邮编
    private String RECCAP;//实收资本(万元)
    private String REGCAP;//注册资本（企业:万元）
    private String REGCAPCUR;//注册资本币种
    private String REGCAPCURCODE;//注册资本币种代码
    private String REGCITY;//所在城市编码
    private String REGNO;//注册号
    private String REGORG;//登记机关
    private String REGORGCITY;//所在城市
    private String REGORGCODE;//注册地址行政编号
    private String REGORGDISTRICT;//所在区/县
    private String REGORGPROVINCE;//所在省份
    private String REVDATE;//吊销日期
    private String S_EXT_NODENUM;//所在省份编码
    private String ZSOPSCOPE;//经营业务范围

    public void setID(String ID) {
        if (("").equals(ID.trim())) {
            this.ID = null;
        } else {
            this.ID = ID;
        }
    }

    public String getID() {
        return ID;
    }

    public void setABUITEM(String ABUITEM) {
        if (("").equals(ABUITEM.trim())) {
            this.ABUITEM = null;
        } else {
            this.ABUITEM = ABUITEM;
        }
    }

    public String getABUITEM() {
        return ABUITEM;
    }

    public void setANCHEYEAR(String ANCHEYEAR) {
        if (("").equals(ANCHEYEAR.trim())) {
            this.ANCHEYEAR = null;
        } else {
            this.ANCHEYEAR = ANCHEYEAR;
        }
    }

    public String getANCHEYEAR() {
        return ANCHEYEAR;
    }

    public void setAPPRDATE(String APPRDATE) {
        if (("").equals(APPRDATE.trim())) {
            this.APPRDATE = null;
        } else {
            this.APPRDATE = APPRDATE;
        }
    }

    public String getAPPRDATE() {
        return APPRDATE;
    }

    public void setCANDATE(String CANDATE) {
        if (("").equals(CANDATE.trim())) {
            this.CANDATE = null;
        } else {
            this.CANDATE = CANDATE;
        }
    }

    public String getCANDATE() {
        return CANDATE;
    }

    public void setCREDITCODE(String CREDITCODE) {
        if (("").equals(CREDITCODE.trim())) {
            this.CREDITCODE = null;
        } else {
            this.CREDITCODE = CREDITCODE;
        }
    }

    public String getCREDITCODE() {
        return CREDITCODE;
    }

    public void setDOM(String DOM) {
        if (("").equals(DOM.trim())) {
            this.DOM = null;
        } else {
            this.DOM = DOM;
        }
    }

    public String getDOM() {
        return DOM;
    }

    public void setDOMDISTRICT(String DOMDISTRICT) {
        if (("").equals(DOMDISTRICT.trim())) {
            this.DOMDISTRICT = null;
        } else {
            this.DOMDISTRICT = DOMDISTRICT;
        }
    }

    public String getDOMDISTRICT() {
        return DOMDISTRICT;
    }

    public void setEMAIL(String EMAIL) {
        if (("").equals(EMAIL.trim())) {
            this.EMAIL = null;
        } else {
            this.EMAIL = EMAIL;
        }
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setENTITYTYPE(String ENTITYTYPE) {
        if (("").equals(ENTITYTYPE.trim())) {
            this.ENTITYTYPE = null;
        } else {
            this.ENTITYTYPE = ENTITYTYPE;
        }
    }

    public String getENTITYTYPE() {
        return ENTITYTYPE;
    }

    public void setENTNAME(String ENTNAME) {
        if (("").equals(ENTNAME.trim())) {
            this.ENTNAME = null;
        } else {
            this.ENTNAME = ENTNAME;
        }
    }

    public String getENTNAME() {
        return ENTNAME;
    }

    public void setENTNAME_OLD(String ENTNAME_OLD) {
        if (("").equals(ENTNAME_OLD.trim())) {
            this.ENTNAME_OLD = null;
        } else {
            this.ENTNAME_OLD = ENTNAME_OLD;
        }
    }

    public String getENTNAME_OLD() {
        return ENTNAME_OLD;
    }

    public void setENTSTATUS(String ENTSTATUS) {
        if (("").equals(ENTSTATUS.trim())) {
            this.ENTSTATUS = null;
        } else {
            this.ENTSTATUS = ENTSTATUS;
        }
    }

    public String getENTSTATUS() {
        return ENTSTATUS;
    }

    public void setENTSTATUSCODE(String ENTSTATUSCODE) {
        if (("").equals(ENTSTATUSCODE.trim())) {
            this.ENTSTATUSCODE = null;
        } else {
            this.ENTSTATUSCODE = ENTSTATUSCODE;
        }
    }

    public String getENTSTATUSCODE() {
        return ENTSTATUSCODE;
    }

    public void setENTTYPE(String ENTTYPE) {
        if (("").equals(ENTTYPE.trim())) {
            this.ENTTYPE = null;
        } else {
            this.ENTTYPE = ENTTYPE;
        }
    }

    public String getENTTYPE() {
        return ENTTYPE;
    }

    public void setENTTYPECODE(String ENTTYPECODE) {
        if (("").equals(ENTTYPECODE.trim())) {
            this.ENTTYPECODE = null;
        } else {
            this.ENTTYPECODE = ENTTYPECODE;
        }
    }

    public String getENTTYPECODE() {
        return ENTTYPECODE;
    }

    public void setESDATE(String ESDATE) {
        if (("").equals(ESDATE.trim())) {
            this.ESDATE = null;
        } else {
            this.ESDATE = ESDATE;
        }
    }

    public String getESDATE() {
        return ESDATE;
    }

    public void setFRNAME(String FRNAME) {
        if (("").equals(FRNAME.trim())) {
            this.FRNAME = null;
        } else {
            this.FRNAME = FRNAME;
        }
    }

    public String getFRNAME() {
        return FRNAME;
    }

    public void setOPFROM(String OPFROM) {
        if (("").equals(OPFROM.trim())) {
            this.OPFROM = null;
        } else {
            this.OPFROM = OPFROM;
        }
    }

    public String getOPFROM() {
        return OPFROM;
    }

    public void setOPTO(String OPTO) {
        if (("").equals(OPTO.trim())) {
            this.OPTO = null;
        } else {
            this.OPTO = OPTO;
        }
    }

    public String getOPTO() {
        return OPTO;
    }

    public void setORGCODES(String ORGCODES) {
        if (("").equals(ORGCODES.trim())) {
            this.ORGCODES = null;
        } else {
            this.ORGCODES = ORGCODES;
        }
    }

    public String getORGCODES() {
        return ORGCODES;
    }

    public void setPOSTALCODE(String POSTALCODE) {
        if (("").equals(POSTALCODE.trim())) {
            this.POSTALCODE = null;
        } else {
            this.POSTALCODE = POSTALCODE;
        }
    }

    public String getPOSTALCODE() {
        return POSTALCODE;
    }

    public void setRECCAP(String RECCAP) {
        if (("").equals(RECCAP.trim())) {
            this.RECCAP = null;
        } else {
            this.RECCAP = RECCAP;
        }
    }

    public String getRECCAP() {
        return RECCAP;
    }

    public void setREGCAP(String REGCAP) {
        if (("").equals(REGCAP.trim())) {
            this.REGCAP = null;
        } else {
            this.REGCAP = REGCAP;
        }
    }

    public String getREGCAP() {
        return REGCAP;
    }

    public void setREGCAPCUR(String REGCAPCUR) {
        if (("").equals(REGCAPCUR.trim())) {
            this.REGCAPCUR = null;
        } else {
            this.REGCAPCUR = REGCAPCUR;
        }
    }

    public String getREGCAPCUR() {
        return REGCAPCUR;
    }

    public void setREGCAPCURCODE(String REGCAPCURCODE) {
        if (("").equals(REGCAPCURCODE.trim())) {
            this.REGCAPCURCODE = null;
        } else {
            this.REGCAPCURCODE = REGCAPCURCODE;
        }
    }

    public String getREGCAPCURCODE() {
        return REGCAPCURCODE;
    }

    public void setREGCITY(String REGCITY) {
        if (("").equals(REGCITY.trim())) {
            this.REGCITY = null;
        } else {
            this.REGCITY = REGCITY;
        }
    }

    public String getREGCITY() {
        return REGCITY;
    }

    public void setREGNO(String REGNO) {
        if (("").equals(REGNO.trim())) {
            this.REGNO = null;
        } else {
            this.REGNO = REGNO;
        }
    }

    public String getREGNO() {
        return REGNO;
    }

    public void setREGORG(String REGORG) {
        if (("").equals(REGORG.trim())) {
            this.REGORG = null;
        } else {
            this.REGORG = REGORG;
        }
    }

    public String getREGORG() {
        return REGORG;
    }

    public void setREGORGCITY(String REGORGCITY) {
        if (("").equals(REGORGCITY.trim())) {
            this.REGORGCITY = null;
        } else {
            this.REGORGCITY = REGORGCITY;
        }
    }

    public String getREGORGCITY() {
        return REGORGCITY;
    }

    public void setREGORGCODE(String REGORGCODE) {
        if (("").equals(REGORGCODE.trim())) {
            this.REGORGCODE = null;
        } else {
            this.REGORGCODE = REGORGCODE;
        }
    }

    public String getREGORGCODE() {
        return REGORGCODE;
    }

    public void setREGORGDISTRICT(String REGORGDISTRICT) {
        if (("").equals(REGORGDISTRICT.trim())) {
            this.REGORGDISTRICT = null;
        } else {
            this.REGORGDISTRICT = REGORGDISTRICT;
        }
    }

    public String getREGORGDISTRICT() {
        return REGORGDISTRICT;
    }

    public void setREGORGPROVINCE(String REGORGPROVINCE) {
        if (("").equals(REGORGPROVINCE.trim())) {
            this.REGORGPROVINCE = null;
        } else {
            this.REGORGPROVINCE = REGORGPROVINCE;
        }
    }

    public String getREGORGPROVINCE() {
        return REGORGPROVINCE;
    }

    public void setREVDATE(String REVDATE) {
        if (("").equals(REVDATE.trim())) {
            this.REVDATE = null;
        } else {
            this.REVDATE = REVDATE;
        }
    }

    public String getREVDATE() {
        return REVDATE;
    }

    public void setS_EXT_NODENUM(String S_EXT_NODENUM) {
        if (("").equals(S_EXT_NODENUM.trim())) {
            this.S_EXT_NODENUM = null;
        } else {
            this.S_EXT_NODENUM = S_EXT_NODENUM;
        }
    }

    public String getS_EXT_NODENUM() {
        return S_EXT_NODENUM;
    }

    public void setZSOPSCOPE(String ZSOPSCOPE) {
        if (("").equals(ZSOPSCOPE.trim())) {
            this.ZSOPSCOPE = null;
        } else {
            this.ZSOPSCOPE = ZSOPSCOPE;
        }
    }

    public String getZSOPSCOPE() {
        return ZSOPSCOPE;
    }

    @Override
    public String toString() {
        return "EntinfoBASIC [ID=" + ID + ", ABUITEM=" + ABUITEM + ", ANCHEYEAR=" + ANCHEYEAR + ", APPRDATE=" + APPRDATE + ", CANDATE=" + CANDATE + ", CREDITCODE=" + CREDITCODE + ", DOM=" + DOM + ", DOMDISTRICT=" + DOMDISTRICT + ", EMAIL=" + EMAIL + ", ENTITYTYPE=" + ENTITYTYPE + ", ENTNAME=" + ENTNAME + ", ENTNAME_OLD=" + ENTNAME_OLD + ", ENTSTATUS=" + ENTSTATUS + ", ENTSTATUSCODE=" + ENTSTATUSCODE + ", ENTTYPE=" + ENTTYPE + ", ENTTYPECODE=" + ENTTYPECODE + ", ESDATE=" + ESDATE + ", FRNAME=" + FRNAME + ", OPFROM=" + OPFROM + ", OPTO=" + OPTO + ", ORGCODES=" + ORGCODES + ", POSTALCODE=" + POSTALCODE + ", RECCAP=" + RECCAP + ", REGCAP=" + REGCAP + ", REGCAPCUR=" + REGCAPCUR + ", REGCAPCURCODE=" + REGCAPCURCODE + ", REGCITY=" + REGCITY + ", REGNO=" + REGNO + ", REGORG=" + REGORG
                + ", REGORGCITY=" + REGORGCITY + ", REGORGCODE=" + REGORGCODE + ", REGORGDISTRICT=" + REGORGDISTRICT + ", REGORGPROVINCE=" + REGORGPROVINCE + ", REVDATE=" + REVDATE + ", S_EXT_NODENUM=" + S_EXT_NODENUM + ", ZSOPSCOPE=" + ZSOPSCOPE + "]";
    }

}

