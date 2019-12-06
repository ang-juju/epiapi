package com.css.component.epiapi.pojo;

public class EntInfoRes {

    private String CODE;
    private String ENTINFO;
    private String MSK;

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String cODE) {
        if (("").equals(cODE.trim())) {
            this.CODE = null;
        } else {
            this.CODE = cODE;
        }
    }

    public String getMSK() {
        return MSK;
    }

    public void setMSK(String mSK) {
        if (("").equals(mSK.trim())) {
            this.MSK = null;
        } else {
            this.MSK = mSK;
        }
    }

    public String getENTINFO() {
        return ENTINFO;
    }

    public void setENTINFO(String eNTINFO) {
        if (("").equals(eNTINFO.trim())) {
            this.ENTINFO = null;
        } else {
            this.ENTINFO = eNTINFO;
        }
    }
}
