package com.alibaba.sdk.android.oss.common.auth;

import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p153l.azk0;

/* JADX INFO: loaded from: classes.dex */
public class HmacSHA1Signature {
    private static final String ALGORITHM = "HmacSHA1";
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final Object LOCK = new Object();
    private static final String VERSION = "1";
    private static Mac macInstance;

    private byte[] sign(byte[] bArr, byte[] bArr2) {
        Mac mac;
        try {
            if (macInstance == null) {
                synchronized (LOCK) {
                    try {
                        if (macInstance == null) {
                            macInstance = Mac.getInstance(getAlgorithm());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            try {
                mac = (Mac) macInstance.clone();
            } catch (CloneNotSupportedException unused) {
                mac = Mac.getInstance(getAlgorithm());
            }
            mac.init(new SecretKeySpec(bArr, getAlgorithm()));
            return mac.doFinal(bArr2);
        } catch (InvalidKeyException unused2) {
            azk0.m101074a("key must not be null");
            return null;
        } catch (NoSuchAlgorithmException unused3) {
            azk0.m101074a("Unsupported algorithm: HmacSHA1");
            return null;
        }
    }

    public String computeSignature(String str, String str2) {
        OSSLog.logDebug(getAlgorithm(), false);
        OSSLog.logDebug(getVersion(), false);
        try {
            OSSLog.logDebug("sign start");
            byte[] bArrSign = sign(str.getBytes("UTF-8"), str2.getBytes("UTF-8"));
            OSSLog.logDebug("base64 start");
            return BinaryUtil.toBase64String(bArrSign);
        } catch (UnsupportedEncodingException unused) {
            azk0.m101074a("Unsupported algorithm: UTF-8");
            return null;
        }
    }

    public String getAlgorithm() {
        return ALGORITHM;
    }

    public String getVersion() {
        return "1";
    }
}
