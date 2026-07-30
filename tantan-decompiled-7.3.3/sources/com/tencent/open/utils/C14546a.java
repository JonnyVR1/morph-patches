package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.tencent.open.log.SLog;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.tencent.open.utils.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14546a {

    /* JADX INFO: renamed from: a */
    private KeyStore f61160a;

    /* JADX INFO: renamed from: b */
    private SharedPreferences f61161b;

    public C14546a(Context context) {
        try {
            this.f61161b = context.getSharedPreferences("KEYSTORE_SETTING", 0);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f61160a = keyStore;
            keyStore.load(null);
            if (this.f61160a.containsAlias("KEYSTORE_AES")) {
                return;
            }
            m85556c("");
            m85553a(context);
            m85552a();
        } catch (Exception e) {
            SLog.m85489d("KEYSTORE", "Exception", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m85553a(Context context) throws Exception {
        SLog.m85488d("KEYSTORE", "Build.VERSION.SDK_INT=" + Build.VERSION.SDK_INT);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("KEYSTORE_AES", 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("PKCS1Padding").build());
        keyPairGenerator.generateKeyPair();
    }

    /* JADX INFO: renamed from: c */
    private SecretKeySpec m85555c() throws Exception {
        String string = this.f61161b.getString("PREF_KEY_AES", "");
        PrivateKey privateKey = (PrivateKey) this.f61160a.getKey("KEYSTORE_AES", null);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, privateKey);
        return new SecretKeySpec(cipher.doFinal(Base64.decode(string, 0)), "AES/GCM/NoPadding");
    }

    /* JADX INFO: renamed from: d */
    private void m85557d(String str) {
        this.f61161b.edit().putString("PREF_KEY_AES", str).apply();
    }

    /* JADX INFO: renamed from: b */
    public String m85559b(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, m85555c(), new IvParameterSpec(m85554b()));
            return new String(cipher.doFinal(bArrDecode));
        } catch (Exception e) {
            SLog.m85491e("KEYSTORE", "Exception", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private void m85556c(String str) {
        this.f61161b.edit().putString("PREF_KEY_IV", str).apply();
    }

    /* JADX INFO: renamed from: b */
    private byte[] m85554b() {
        return Base64.decode(this.f61161b.getString("PREF_KEY_IV", ""), 0);
    }

    /* JADX INFO: renamed from: a */
    public String m85558a(String str) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, m85555c(), new IvParameterSpec(m85554b()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            SLog.m85491e("KEYSTORE", "Exception", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private void m85552a() throws Exception {
        byte[] bArr = new byte[16];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(bArr);
        m85556c(Base64.encodeToString(secureRandom.generateSeed(12), 0));
        PublicKey publicKey = this.f61160a.getCertificate("KEYSTORE_AES").getPublicKey();
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKey);
        m85557d(Base64.encodeToString(cipher.doFinal(bArr), 0));
    }
}
