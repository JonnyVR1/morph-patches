package com.momo.xengine.mestatistics;

import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes8.dex */
final class EncryptionTool {
    private static String SHA(String str, String str2) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] SHA256(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
    }

    public static String SHA512(String str) {
        return SHA(str, "SHA-512");
    }

    public static byte[] aes_encrypt(String str, byte[] bArr) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec("GUgemWNhGTrh6kSM".getBytes()));
        return cipher.doFinal(str.getBytes("UTF-8"));
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

    public static byte[] rsa_encrypt(String str, String str2) throws Exception {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, rSAPublicKey);
        return cipher.doFinal(str.getBytes("UTF-8"));
    }

    public static byte[] aes_encrypt(String str, SecretKey secretKey) throws Exception {
        return aes_encrypt(str, secretKey.getEncoded());
    }
}
