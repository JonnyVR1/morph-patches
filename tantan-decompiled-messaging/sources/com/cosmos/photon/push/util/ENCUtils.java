package com.cosmos.photon.push.util;

import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p149l.whq0;

/* JADX INFO: loaded from: classes.dex */
public class ENCUtils {
    private static final String PubKey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKbj7WvmhEVXZbeqvMGXdMDvGlD6/Aa/MRxkhtUzdMBtB1FzUGOs77Yo7Es3cxt4HQGrioAaPXCyNC4KX1L8qdcCAwEAAQ==";
    private static ENCUtils instance;
    private static char[] numbersAndLetters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static Random randGen = new Random();
    private IvParameterSpec ivspec = new IvParameterSpec("GUgemWNhGTrh6kSM".getBytes());
    private Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");

    private ENCUtils() throws NoSuchPaddingException, NoSuchAlgorithmException {
    }

    public static byte[] RSAEncode(byte[] bArr) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, getPublicKey(PubKey));
        return cipher.doFinal(bArr);
    }

    public static ENCUtils getInstance() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (instance == null) {
            instance = new ENCUtils();
        }
        return instance;
    }

    public static PublicKey getPublicKey(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes())));
    }

    private static byte[] hash256(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String random(int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = numbersAndLetters[randGen.nextInt(62)];
        }
        return new String(cArr);
    }

    public String decrypt(String str, String str2) throws Exception {
        if (str == null || str.length() == 0) {
            whq0.m203241a("Empty string");
            return null;
        }
        try {
            this.cipher.init(2, new SecretKeySpec(hash256(str2), "AES"), this.ivspec);
            return new String(this.cipher.doFinal(Base64.decode(str.getBytes())));
        } catch (Exception unused) {
            return null;
        }
    }

    public String encrypt(String str, String str2) {
        try {
            this.cipher.init(1, new SecretKeySpec(hash256(str2), "AES"), this.ivspec);
            return Base64.encode(this.cipher.doFinal(str.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }
}
