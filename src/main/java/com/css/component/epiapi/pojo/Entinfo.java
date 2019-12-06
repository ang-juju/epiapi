package com.css.component.epiapi.pojo;

/**
 * 企业详情查询接口请求实体类
 */
public class Entinfo {
    private String eid;//中数企业ID
    private String creditcode;//统一信用代码
    private String name;//企业名称
    private String orgcode;//组织机构代码
    private String regno;//企业注册号

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEid() {
        return eid;
    }

    public void setCreditcode(String creditcode) {
        this.creditcode = creditcode;
    }

    public String getCreditcode() {
        return creditcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getRegno() {
        return regno;
    }

    @Override
    public String toString() {
        return "Entinfo [eid=" + eid + ", creditcode=" + creditcode + ", name=" + name + ", orgcode=" + orgcode + ", regno=" + regno + "]";
    }


}

