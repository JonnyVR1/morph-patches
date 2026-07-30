package com.heytap.mcssdk.utils;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DESUtil {
    public static String decrypt(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(2, getDesKey(str2));
        return new String(cipher.doFinal(Base64.decode(str, 0)), Charset.defaultCharset()).trim();
    }

    public static String encrypt(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        SecureRandom secureRandom = new SecureRandom();
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(1, getDesKey(str2), secureRandom);
        return new String(Base64.encode(cipher.doFinal(str.getBytes("UTF-8")), 0), Charset.defaultCharset()).trim();
    }

    private static Key getDesKey(String str) {
        return SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(Base64.decode(str, 0)));
    }
}
