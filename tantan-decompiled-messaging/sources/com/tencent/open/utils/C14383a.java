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
public class C14383a {

    /* JADX INFO: renamed from: a */
    private KeyStore f60312a;

    /* JADX INFO: renamed from: b */
    private SharedPreferences f60313b;

    public C14383a(Context context) {
        try {
            this.f60313b = context.getSharedPreferences("KEYSTORE_SETTING", 0);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f60312a = keyStore;
            keyStore.load(null);
            if (this.f60312a.containsAlias("KEYSTORE_AES")) {
                return;
            }
            m84373c("");
            m84370a(context);
            m84369a();
        } catch (Exception e) {
            SLog.m84306d("KEYSTORE", "Exception", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84370a(Context context) throws Exception {
        SLog.m84305d("KEYSTORE", "Build.VERSION.SDK_INT=" + Build.VERSION.SDK_INT);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("KEYSTORE_AES", 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("PKCS1Padding").build());
        keyPairGenerator.generateKeyPair();
    }

    /* JADX INFO: renamed from: c */
    private SecretKeySpec m84372c() throws Exception {
        String string = this.f60313b.getString("PREF_KEY_AES", "");
        PrivateKey privateKey = (PrivateKey) this.f60312a.getKey("KEYSTORE_AES", null);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, privateKey);
        return new SecretKeySpec(cipher.doFinal(Base64.decode(string, 0)), "AES/GCM/NoPadding");
    }

    /* JADX INFO: renamed from: d */
    private void m84374d(String str) {
        this.f60313b.edit().putString("PREF_KEY_AES", str).apply();
    }

    /* JADX INFO: renamed from: b */
    public String m84376b(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, m84372c(), new IvParameterSpec(m84371b()));
            return new String(cipher.doFinal(bArrDecode));
        } catch (Exception e) {
            SLog.m84308e("KEYSTORE", "Exception", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private void m84373c(String str) {
        this.f60313b.edit().putString("PREF_KEY_IV", str).apply();
    }

    /* JADX INFO: renamed from: b */
    private byte[] m84371b() {
        return Base64.decode(this.f60313b.getString("PREF_KEY_IV", ""), 0);
    }

    /* JADX INFO: renamed from: a */
    public String m84375a(String str) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, m84372c(), new IvParameterSpec(m84371b()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            SLog.m84308e("KEYSTORE", "Exception", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84369a() throws Exception {
        byte[] bArr = new byte[16];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(bArr);
        m84373c(Base64.encodeToString(secureRandom.generateSeed(12), 0));
        PublicKey publicKey = this.f60312a.getCertificate("KEYSTORE_AES").getPublicKey();
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKey);
        m84374d(Base64.encodeToString(cipher.doFinal(bArr), 0));
    }
}
