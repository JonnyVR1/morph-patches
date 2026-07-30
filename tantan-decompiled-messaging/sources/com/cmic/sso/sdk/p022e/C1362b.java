package com.cmic.sso.sdk.p022e;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.b */
/* JADX INFO: loaded from: classes.dex */
public class C1362b {

    /* JADX INFO: renamed from: a */
    private static byte[] f5695a;

    /* JADX INFO: renamed from: a */
    private static boolean m7226a(Context context) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("CMCC_SDK_V1", 3).setDigests("SHA-256", "SHA-512").setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setRandomizedEncryptionRequired(false).setKeySize(256).build());
            Thread.sleep(1000L);
            keyGenerator.generateKey();
            return true;
        } catch (Exception e) {
            C1363c.m7232a("KeystoreUtil", e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private static synchronized byte[] m7230b(Context context) {
        Cipher cipher;
        byte[] bArrDoFinal;
        Cipher cipher2;
        try {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (!m7227a(context, false)) {
                    return null;
                }
                String strM7228b = m7228b();
                if (TextUtils.isEmpty(strM7228b)) {
                    bArrDoFinal = C1377q.m7306a();
                    f5695a = C1377q.m7306a();
                    Key key = keyStore.getKey("CMCC_SDK_V1", null);
                    if (key instanceof SecretKey) {
                        C1363c.m7234b("KeystoreUtil", "随机生成aes秘钥");
                        cipher2 = Cipher.getInstance("AES/CBC/PKCS7Padding");
                        cipher2.init(1, key, new IvParameterSpec(f5695a));
                    } else {
                        if (!(key instanceof PrivateKey)) {
                            return null;
                        }
                        PublicKey publicKey = keyStore.getCertificate("CMCC_SDK_V1").getPublicKey();
                        cipher2 = Cipher.getInstance("RSA/ECB/OAEPWithSHA256AndMGF1Padding");
                        C1363c.m7234b("KeystoreUtil", "生成rsa密");
                        cipher2.init(1, publicKey);
                    }
                    String strEncodeToString = Base64.encodeToString(cipher2.doFinal(bArrDoFinal), 0);
                    String strEncodeToString2 = Base64.encodeToString(f5695a, 0);
                    HashMap map = new HashMap();
                    map.put("AES_IV", strEncodeToString2);
                    map.put("AES_KEY", strEncodeToString);
                    C1371k.m7279a(map);
                } else {
                    f5695a = Base64.decode(m7231c(), 0);
                    byte[] bArrDecode = Base64.decode(strM7228b, 0);
                    Key key2 = keyStore.getKey("CMCC_SDK_V1", null);
                    if (key2 == null) {
                        return null;
                    }
                    if (key2 instanceof SecretKey) {
                        cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                        cipher.init(2, key2, new IvParameterSpec(f5695a));
                        C1363c.m7234b("KeystoreUtil", "使用aes");
                    } else {
                        if (!(key2 instanceof PrivateKey)) {
                            return null;
                        }
                        cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA256AndMGF1Padding");
                        cipher.init(2, key2);
                        C1363c.m7234b("KeystoreUtil", "使用rsa");
                    }
                    bArrDoFinal = cipher.doFinal(bArrDecode);
                    StringBuilder sb = new StringBuilder("是否解密出秘钥：");
                    sb.append(!TextUtils.isEmpty(Base64.encodeToString(bArrDoFinal, 0)));
                    C1363c.m7234b("KeystoreUtil", sb.toString());
                }
                return bArrDoFinal;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m7231c() {
        return C1371k.m7281b("AES_IV", "");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7227a(Context context, boolean z) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (keyStore.getKey("CMCC_SDK_V1", null) != null) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (z) {
            return m7226a(context);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static String m7224a(Context context, String str) {
        m7225a();
        byte[] bArrM7230b = m7230b(context);
        if (bArrM7230b != null) {
            return C1361a.m7221a(bArrM7230b, str, f5695a);
        }
        m7225a();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m7225a() {
        C1371k.m7277a("AES_KEY");
    }

    /* JADX INFO: renamed from: b */
    public static String m7229b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bArrM7230b = m7230b(context);
        if (bArrM7230b != null) {
            return C1361a.m7223b(bArrM7230b, str, f5695a);
        }
        m7225a();
        return null;
    }

    /* JADX INFO: renamed from: b */
    private static String m7228b() {
        return C1371k.m7281b("AES_KEY", "");
    }
}
