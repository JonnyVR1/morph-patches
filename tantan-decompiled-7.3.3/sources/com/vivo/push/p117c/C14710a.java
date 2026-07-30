package com.vivo.push.p117c;

import android.security.keystore.KeyGenParameterSpec;
import com.vivo.push.util.C14795p;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: com.vivo.push.c.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14710a implements InterfaceC14712c {

    /* JADX INFO: renamed from: a */
    private KeyStore f61797a;

    /* JADX INFO: renamed from: b */
    private SecretKey f61798b;

    public C14710a() {
        m85957a();
        m85958b();
    }

    /* JADX INFO: renamed from: a */
    private void m85957a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f61797a = keyStore;
            keyStore.load(null);
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86179a("AesSecurity", "initKeyStore error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private SecretKey m85958b() {
        try {
            SecretKey secretKey = this.f61798b;
            if (secretKey != null) {
                return secretKey;
            }
            if (m85959c()) {
                this.f61798b = m85960d();
            } else {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder("AesKeyAlias", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
                this.f61798b = keyGenerator.generateKey();
            }
            return this.f61798b;
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86179a("AesSecurity", "getSecretKey error" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m85959c() {
        try {
            if (this.f61797a == null) {
                m85957a();
            }
            return this.f61797a.containsAlias("AesKeyAlias");
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86179a("AesSecurity", "hasAESKey error" + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private SecretKey m85960d() {
        try {
            return ((KeyStore.SecretKeyEntry) this.f61797a.getEntry("AesKeyAlias", null)).getSecretKey();
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86179a("AesSecurity", "getAESSecretKey error" + e.getMessage());
            return null;
        }
    }
}
