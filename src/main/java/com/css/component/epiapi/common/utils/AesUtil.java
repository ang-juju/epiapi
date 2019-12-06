package com.css.component.epiapi.common.utils;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 默认加密模式:AES/CBC/PKCS5Padding
 * 用户消息加密
 * aes 128 密码位数必须16位,aes256 需要jce支持
 */
public class AesUtil {
    public static final byte[] iv = "\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0".getBytes();//指定偏移量

    /**
     * 加密二进制
     */
    public static byte[] encrypt(byte[] data, String password) throws Exception {
        SecretKeySpec key = new SecretKeySpec(password.getBytes(), "AES");//创建aes格式的密码
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");// 创建密码器(采用padding方式,解决明文长度不为16的倍数问题)
        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(iv));// 初始化
        byte[] result = cipher.doFinal(data);
        return result;// 加密
    }

    public static byte[] encrypt(byte[] data, String password, String offset) throws Exception {
        SecretKeySpec key = new SecretKeySpec(password.getBytes(), "AES");//创建aes格式的密码
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");// 创建密码器(采用padding方式,解决明文长度不为16的倍数问题)
        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(offset.getBytes("UTF-8")));// 初始化
        byte[] result = cipher.doFinal(data);
        return result;// 加密
    }

    /**
     * 解密二进制
     */
    public static byte[] decrypt(byte[] data, String password) throws Exception {
        SecretKeySpec key = new SecretKeySpec(password.getBytes(), "AES");//创建aes格式的密码
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");// 创建密码器(采用padding方式,解决明文长度不为16的倍数问题)
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));// 初始化
        byte[] result = cipher.doFinal(data);
        return result;// 加密
    }

    public static byte[] decrypt(byte[] data, String password, String offset) throws Exception {
        SecretKeySpec key = new SecretKeySpec(password.getBytes(), "AES");//创建aes格式的密码
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");// 创建密码器(采用padding方式,解决明文长度不为16的倍数问题)
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(offset.getBytes("UTF-8")));// 初始化
        byte[] result = cipher.doFinal(data);
        return result;// 加密
    }

    /**
     * 加密字符串
     */
    public static String encrypt(String data, String password) throws Exception {
        return Base64.encodeBase64String(encrypt(data.getBytes(), password));// 加密
    }

    public static String encrypt(String data, String password, String offset) throws Exception {
        return Base64.encodeBase64String(encrypt(data.getBytes(), password, offset));// 加密
    }

    /**
     * 解密字符串
     */
    public static String decrypt(String base64Data, String password) {
        try {
            byte[] decodeBase64 = Base64.decodeBase64(base64Data);
            byte[] decrypt = decrypt(decodeBase64, password);
            return new String(decrypt);
        } catch (Exception e) {
            return null;
        }
    }

    public static String decrypt(String base64Data, String password, String offset) {
        try {
            byte[] decodeBase64 = Base64.decodeBase64(base64Data);
            byte[] decrypt = decrypt(decodeBase64, password, offset);
            return new String(decrypt);
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] decryptToByte(String base64Data, String password) throws Exception {
        byte[] decodeBase64 = Base64.decodeBase64(base64Data);
        byte[] decrypt = decrypt(decodeBase64, password);
        return decrypt;
    }
}