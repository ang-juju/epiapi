package com.css.component.epiapi.pojo;

import java.util.List;

public class EntInfoResContent {
    private EntinfoBASIC BASIC;
    private List<EntinfoSHAREHOLDER> SHAREHOLDERS;

    public EntinfoBASIC getBASIC() {
        return BASIC;
    }

    public void setBASIC(EntinfoBASIC bASIC) {
        BASIC = bASIC;
    }

    public List<EntinfoSHAREHOLDER> getSHAREHOLDERS() {
        return SHAREHOLDERS;
    }

    public void setSHAREHOLDERS(List<EntinfoSHAREHOLDER> sHAREHOLDER) {
        SHAREHOLDERS = sHAREHOLDER;
    }

}
