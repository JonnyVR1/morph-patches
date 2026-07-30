package com.alibaba.sdk.android.oss.signer;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p149l.ibe;
import p149l.ptc0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ServiceSignature {
    public static ServiceSignature create(String str) {
        if ("HmacSHA256".equals(str)) {
            return new HmacSHA256Signature();
        }
        if ("HmacSHA1".equals(str)) {
            return new HmacSHA1Signature();
        }
        ibe.m135253a("Unsupported algorithm: ", str);
        return null;
    }

    public abstract byte[] computeHash(byte[] bArr, byte[] bArr2);

    public abstract String computeSignature(String str, String str2);

    public abstract String getAlgorithm();

    public abstract String getVersion();

    public byte[] sign(byte[] bArr, byte[] bArr2, Mac mac, Object obj, String str) {
        Mac mac2;
        if (mac == null) {
            try {
                synchronized (obj) {
                    if (mac == null) {
                        try {
                            mac = Mac.getInstance(str);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (InvalidKeyException e) {
                ptc0.m171306a("Invalid key: ", bArr, e);
                return null;
            } catch (NoSuchAlgorithmException e2) {
                ptc0.m171306a("Unsupported algorithm: ", str, e2);
                return null;
            }
        }
        try {
            mac2 = (Mac) mac.clone();
        } catch (CloneNotSupportedException unused) {
            mac2 = Mac.getInstance(str);
        }
        mac2.init(new SecretKeySpec(bArr, str));
        return mac2.doFinal(bArr2);
    }

    public static ServiceSignature create() {
        return new HmacSHA1Signature();
    }
}
