package com.vivo.push.p117c;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.text.TextUtils;
import android.util.Base64;
import androidx.room.RoomDatabase;
import com.vivo.push.util.C14795p;
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
public final class C14714e implements InterfaceC14711b {

    /* JADX INFO: renamed from: a */
    private static PrivateKey f61803a;

    /* JADX INFO: renamed from: b */
    private static PublicKey f61804b;

    /* JADX INFO: renamed from: c */
    private static KeyStore f61805c;

    /* JADX INFO: renamed from: d */
    private static X500Principal f61806d;

    /* JADX INFO: renamed from: e */
    private Context f61807e;

    public C14714e(Context context) {
        this.f61807e = context;
        try {
            m85968b();
            m85966a(context);
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86179a("RsaSecurity", "init error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m85966a(Context context) {
        try {
            if (context == null) {
                C14795p.m86192d("RsaSecurity", " generateRSAKeyPairSign context == null ");
                return;
            }
            if (m85969b("PushRsaKeyAlias")) {
                C14795p.m86192d("RsaSecurity", " generateRSAKeyPairSign this keyAlias PushRsaKeyAlias is Created ");
                return;
            }
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, RoomDatabase.MAX_BIND_PARAMETER_CNT);
            KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(context.getApplicationContext()).setAlias("PushRsaKeyAlias").setSubject(f61806d).setSerialNumber(BigInteger.valueOf(1337L)).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(keyPairGeneratorSpecBuild);
            keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86179a("RsaSecurity", "generateRSAKeyPairSign error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private static PrivateKey m85967b(Context context) {
        try {
            PrivateKey privateKey = f61803a;
            if (privateKey != null) {
                return privateKey;
            }
            if (context == null) {
                C14795p.m86192d("RsaSecurity", " getPrivateKeySigin context == null ");
                return null;
            }
            if (!m85969b("PushRsaKeyAlias")) {
                m85966a(context);
            }
            KeyStore.Entry entry = f61805c.getEntry("PushRsaKeyAlias", null);
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                PrivateKey privateKey2 = ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
                f61803a = privateKey2;
                return privateKey2;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86179a("RsaSecurity", "getPrivateKeySigin error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m85968b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f61805c = keyStore;
            keyStore.load(null);
            f61806d = new X500Principal("CN=Push SDK, OU=VIVO, O=VIVO PUSH, C=CN");
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86179a("RsaSecurity", "initKeyStore error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m85969b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (f61805c == null) {
                m85968b();
            }
            return f61805c.containsAlias(str);
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86179a("RsaSecurity", "getPrivateKeySigin error" + e.getMessage());
            return false;
        }
    }

    @Override // com.vivo.push.p117c.InterfaceC14711b
    /* JADX INFO: renamed from: a */
    public final boolean mo85963a(byte[] bArr, PublicKey publicKey, byte[] bArr2) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86179a("RsaSecurity", "verifyClientSDK error" + e.getMessage());
            return false;
        }
    }

    @Override // com.vivo.push.p117c.InterfaceC14711b
    /* JADX INFO: renamed from: a */
    public final String mo85961a(String str) {
        try {
            if (TextUtils.isEmpty(str) || m85967b(this.f61807e) == null) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            PrivateKey privateKeyM85967b = m85967b(this.f61807e);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privateKeyM85967b);
            signature.update(bytes);
            String strEncodeToString = Base64.encodeToString(signature.sign(), 2);
            C14795p.m86192d("RsaSecurity", str.hashCode() + " = " + strEncodeToString);
            return strEncodeToString;
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86179a("RsaSecurity", "signClientSDK error" + e.getMessage());
            return null;
        }
    }

    @Override // com.vivo.push.p117c.InterfaceC14711b
    /* JADX INFO: renamed from: a */
    public final PublicKey mo85962a() {
        try {
            PublicKey publicKey = f61804b;
            if (publicKey != null) {
                return publicKey;
            }
            if (!m85969b("PushRsaKeyAlias")) {
                m85966a(this.f61807e);
            }
            KeyStore.Entry entry = f61805c.getEntry("PushRsaKeyAlias", null);
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                PublicKey publicKey2 = ((KeyStore.PrivateKeyEntry) entry).getCertificate().getPublicKey();
                f61804b = publicKey2;
                return publicKey2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86179a("RsaSecurity", "getPublicKeySign error" + e.getMessage());
        }
        return null;
    }
}
