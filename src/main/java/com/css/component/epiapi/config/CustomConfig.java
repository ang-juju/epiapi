package com.css.component.epiapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomConfig {
    public static String PATH;
    public static String URL;
    public static String PASSWORD;
    public static String LOGIN_NAME;
    public static String RANDOM;
    public static String KEY;
    public static String OFFSET;


    @Value("${epic.path}")
    public void setEpicPath(String epicPath) {
        PATH = epicPath;
    }

    @Value("${epic.url}")
    public void setEpicUrl(String epicUrl) {
        URL = epicUrl;
    }

    @Value("${epic.password}")
    public void setEpicPassword(String epicPassword) {
        PASSWORD = epicPassword;
    }

    @Value("${epic.login-name}")
    public void setEpicLoginName(String epicLoginName) {
        LOGIN_NAME = epicLoginName;
    }

    @Value("${epic.random}")
    public void setEpicRandom(String epicRandom) {
        RANDOM = epicRandom;
    }

    @Value("${epic.key}")
    public void setEpicKey(String epicKey) {
        KEY = epicKey;
    }

    @Value("${epic.offset}")
    public void setEpicOffset(String epicOffset) {
        OFFSET = epicOffset;
    }
}
