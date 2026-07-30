package com.vivo.push.p112c;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.text.TextUtils;
import android.util.Base64;
import androidx.room.RoomDatabase;
import com.vivo.push.util.C14647p;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: com.vivo.push.c.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C14566e implements InterfaceC14563b {

    /* JADX INFO: renamed from: a */
    private static PrivateKey f60956a;

    /* JADX INFO: renamed from: b */
    private static PublicKey f60957b;

    /* JADX INFO: renamed from: c */
    private static KeyStore f60958c;

    /* JADX INFO: renamed from: d */
    private static X500Principal f60959d;

    /* JADX INFO: renamed from: e */
    private Context f60960e;

    public C14566e(Context context) {
        this.f60960e = context;
        try {
            m84797b();
            m84795a(context);
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85008a("RsaSecurity", "init error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m84795a(Context context) {
        try {
            if (context == null) {
                C14647p.m85021d("RsaSecurity", " generateRSAKeyPairSign context == null ");
                return;
            }
            if (m84798b("PushRsaKeyAlias")) {
                C14647p.m85021d("RsaSecurity", " generateRSAKeyPairSign this keyAlias PushRsaKeyAlias is Created ");
                return;
            }
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, RoomDatabase.MAX_BIND_PARAMETER_CNT);
            KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(context.getApplicationContext()).setAlias("PushRsaKeyAlias").setSubject(f60959d).setSerialNumber(BigInteger.valueOf(1337L)).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(keyPairGeneratorSpecBuild);
            keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85008a("RsaSecurity", "generateRSAKeyPairSign error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private static PrivateKey m84796b(Context context) {
        try {
            PrivateKey privateKey = f60956a;
            if (privateKey != null) {
                return privateKey;
            }
            if (context == null) {
                C14647p.m85021d("RsaSecurity", " getPrivateKeySigin context == null ");
                return null;
            }
            if (!m84798b("PushRsaKeyAlias")) {
                m84795a(context);
            }
            KeyStore.Entry entry = f60958c.getEntry("PushRsaKeyAlias", null);
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                PrivateKey privateKey2 = ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
                f60956a = privateKey2;
                return privateKey2;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85008a("RsaSecurity", "getPrivateKeySigin error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m84797b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f60958c = keyStore;
            keyStore.load(null);
            f60959d = new X500Principal("CN=Push SDK, OU=VIVO, O=VIVO PUSH, C=CN");
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85008a("RsaSecurity", "initKeyStore error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m84798b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (f60958c == null) {
                m84797b();
            }
            return f60958c.containsAlias(str);
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85008a("RsaSecurity", "getPrivateKeySigin error" + e.getMessage());
            return false;
        }
    }

    @Override // com.vivo.push.p112c.InterfaceC14563b
    /* JADX INFO: renamed from: a */
    public final boolean mo84792a(byte[] bArr, PublicKey publicKey, byte[] bArr2) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85008a("RsaSecurity", "verifyClientSDK error" + e.getMessage());
            return false;
        }
    }

    @Override // com.vivo.push.p112c.InterfaceC14563b
    /* JADX INFO: renamed from: a */
    public final String mo84790a(String str) {
        try {
            if (TextUtils.isEmpty(str) || m84796b(this.f60960e) == null) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            PrivateKey privateKeyM84796b = m84796b(this.f60960e);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privateKeyM84796b);
            signature.update(bytes);
            String strEncodeToString = Base64.encodeToString(signature.sign(), 2);
            C14647p.m85021d("RsaSecurity", str.hashCode() + " = " + strEncodeToString);
            return strEncodeToString;
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85008a("RsaSecurity", "signClientSDK error" + e.getMessage());
            return null;
        }
    }

    @Override // com.vivo.push.p112c.InterfaceC14563b
    /* JADX INFO: renamed from: a */
    public final PublicKey mo84791a() {
        try {
            PublicKey publicKey = f60957b;
            if (publicKey != null) {
                return publicKey;
            }
            if (!m84798b("PushRsaKeyAlias")) {
                m84795a(this.f60960e);
            }
            KeyStore.Entry entry = f60958c.getEntry("PushRsaKeyAlias", null);
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                PublicKey publicKey2 = ((KeyStore.PrivateKeyEntry) entry).getCertificate().getPublicKey();
                f60957b = publicKey2;
                return publicKey2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85008a("RsaSecurity", "getPublicKeySign error" + e.getMessage());
        }
        return null;
    }
}
