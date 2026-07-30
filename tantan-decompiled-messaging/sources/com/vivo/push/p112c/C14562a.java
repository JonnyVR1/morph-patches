package com.vivo.push.p112c;

import android.security.keystore.KeyGenParameterSpec;
import com.vivo.push.util.C14647p;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: com.vivo.push.c.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14562a implements InterfaceC14564c {

    /* JADX INFO: renamed from: a */
    private KeyStore f60950a;

    /* JADX INFO: renamed from: b */
    private SecretKey f60951b;

    public C14562a() {
        m84786a();
        m84787b();
    }

    /* JADX INFO: renamed from: a */
    private void m84786a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f60950a = keyStore;
            keyStore.load(null);
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85008a("AesSecurity", "initKeyStore error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private SecretKey m84787b() {
        try {
            SecretKey secretKey = this.f60951b;
            if (secretKey != null) {
                return secretKey;
            }
            if (m84788c()) {
                this.f60951b = m84789d();
            } else {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder("AesKeyAlias", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
                this.f60951b = keyGenerator.generateKey();
            }
            return this.f60951b;
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85008a("AesSecurity", "getSecretKey error" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m84788c() {
        try {
            if (this.f60950a == null) {
                m84786a();
            }
            return this.f60950a.containsAlias("AesKeyAlias");
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85008a("AesSecurity", "hasAESKey error" + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private SecretKey m84789d() {
        try {
            return ((KeyStore.SecretKeyEntry) this.f60950a.getEntry("AesKeyAlias", null)).getSecretKey();
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85008a("AesSecurity", "getAESSecretKey error" + e.getMessage());
            return null;
        }
    }
}
