package com.css.component.epiapi.pojo;

/**
 * 企业详情查询接口响应消息股东及出资信息实体类
 */
public class EntinfoSHAREHOLDER {
    private Long entinfoId;
    private String ACCONAM;//实缴出资额(万元)
    private String CONDATE;//出资日期
    private String CONFORM;//出资方式
    private String CONFORMCODE;//出资方式代码
    private String CREDITCODE;//股东统一社会信用代码
    private String CURRENCYCODE;//认缴出资币种代码
    private String FUNDEDRATIO;//出资比例
    private String INVTYPE;//股东类型
    private String INVTYPECODE;//股东类型代码
    private String REGCAPCUR;//认缴出资币种
    private String REGNO;//股东注册号
    private String SHANAME;//股东名称
    private String SUBCONAM;//认缴出资额（万元）

    public void setACCONAM(String ACCONAM) {
        if (("").equals(ACCONAM.trim())) {
            this.ACCONAM = null;
        } else {
            this.ACCONAM = ACCONAM;
        }
    }

    public String getACCONAM() {
        return ACCONAM;
    }

    public void setCONDATE(String CONDATE) {
        if (("").equals(CONDATE.trim())) {
            this.CONDATE = null;
        } else {
            this.CONDATE = CONDATE;
        }
    }

    public String getCONDATE() {
        return CONDATE;
    }

    public void setCONFORM(String CONFORM) {
        if (("").equals(CONFORM.trim())) {
            this.CONFORM = null;
        } else {
            this.CONFORM = CONFORM;
        }
    }

    public String getCONFORM() {
        return CONFORM;
    }

    public void setCONFORMCODE(String CONFORMCODE) {
        if (("").equals(CONFORMCODE.trim())) {
            this.CONFORMCODE = null;
        } else {
            this.CONFORMCODE = CONFORMCODE;
        }
    }

    public String getCONFORMCODE() {
        return CONFORMCODE;
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

    public void setCURRENCYCODE(String CURRENCYCODE) {
        if (("").equals(CURRENCYCODE.trim())) {
            this.CURRENCYCODE = null;
        } else {
            this.CURRENCYCODE = CURRENCYCODE;
        }
    }

    public String getCURRENCYCODE() {
        return CURRENCYCODE;
    }

    public void setFUNDEDRATIO(String FUNDEDRATIO) {
        if (("").equals(FUNDEDRATIO.trim())) {
            this.FUNDEDRATIO = null;
        } else {
            this.FUNDEDRATIO = FUNDEDRATIO;
        }
    }

    public String getFUNDEDRATIO() {
        return FUNDEDRATIO;
    }

    public void setINVTYPE(String INVTYPE) {
        if (("").equals(INVTYPE.trim())) {
            this.INVTYPE = null;
        } else {
            this.INVTYPE = INVTYPE;
        }
    }

    public String getINVTYPE() {
        return INVTYPE;
    }

    public void setINVTYPECODE(String INVTYPECODE) {
        if (("").equals(INVTYPECODE.trim())) {
            this.INVTYPECODE = null;
        } else {
            this.INVTYPECODE = INVTYPECODE;
        }
    }

    public String getINVTYPECODE() {
        return INVTYPECODE;
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

    public void setSHANAME(String SHANAME) {
        if (("").equals(SHANAME.trim())) {
            this.SHANAME = null;
        } else {
            this.SHANAME = SHANAME;
        }
    }

    public String getSHANAME() {
        return SHANAME;
    }

    public void setSUBCONAM(String SUBCONAM) {
        if (("").equals(SUBCONAM.trim())) {
            this.SUBCONAM = null;
        } else {
            this.SUBCONAM = SUBCONAM;
        }
    }

    public String getSUBCONAM() {
        return SUBCONAM;
    }

    @Override
    public String toString() {
        return "EntinfoSHAREHOLDER [ACCONAM=" + ACCONAM + ", CONDATE=" + CONDATE + ", CONFORM=" + CONFORM + ", CONFORMCODE=" + CONFORMCODE + ", CREDITCODE=" + CREDITCODE + ", CURRENCYCODE=" + CURRENCYCODE + ", FUNDEDRATIO=" + FUNDEDRATIO + ", INVTYPE=" + INVTYPE + ", INVTYPECODE=" + INVTYPECODE + ", REGCAPCUR=" + REGCAPCUR + ", REGNO=" + REGNO + ", SHANAME=" + SHANAME + ", SUBCONAM=" + SUBCONAM + "]";
    }

}

