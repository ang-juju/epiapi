package com.css.component.epiapi.common.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;

import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

public class HashUtil {
    public static final Map<String, MessageDigest> hashIds = new HashMap<String, MessageDigest>();
    public static final String salt = "$1$2c406e";

    static {
        hashIds.put("0", DigestUtils.getMd5Digest());
    }

    public static String hash(String content) {
        return Base64.encodeBase64String(DigestUtils.getMd5Digest().digest(content.getBytes()));
    }

    public static String hash(byte[] content) {
        return Base64.encodeBase64String(DigestUtils.getMd5Digest().digest(content));
    }

    public static String pwdHashWithSalt(String contenet, String salt) {
        return Md5Crypt.md5Crypt(contenet.getBytes(), salt);
    }

}
