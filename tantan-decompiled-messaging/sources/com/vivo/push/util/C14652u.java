package com.vivo.push.util;

import android.util.Base64;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import p149l.whq0;

/* JADX INFO: renamed from: com.vivo.push.util.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C14652u {

    /* JADX INFO: renamed from: a */
    private static String f61135a = "RSA";

    /* JADX INFO: renamed from: a */
    public static PublicKey m85043a(String str) throws Exception {
        try {
            return KeyFactory.getInstance(f61135a).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 2)));
        } catch (NullPointerException unused) {
            whq0.m203241a("公钥数据为空");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            whq0.m203241a("无此算法");
            return null;
        } catch (InvalidKeySpecException unused3) {
            whq0.m203241a("公钥非法");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m85042a(Key key) {
        return Base64.encodeToString(key.getEncoded(), 2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85044a(byte[] bArr, PublicKey publicKey, byte[] bArr2) throws Exception {
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initVerify(publicKey);
        signature.update(bArr);
        return signature.verify(bArr2);
    }
}
