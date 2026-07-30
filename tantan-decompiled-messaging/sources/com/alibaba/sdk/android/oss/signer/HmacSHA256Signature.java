package com.alibaba.sdk.android.oss.signer;

import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import java.io.UnsupportedEncodingException;
import javax.crypto.Mac;
import p149l.pkq0;

/* JADX INFO: loaded from: classes.dex */
public class HmacSHA256Signature extends ServiceSignature {
    private static final String ALGORITHM = "HmacSHA256";
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final Object LOCK = new Object();
    private static final String VERSION = "1";
    private static Mac macInstance;

    static {
        try {
            macInstance = Mac.getInstance(ALGORITHM);
        } catch (Throwable unused) {
        }
    }

    @Override // com.alibaba.sdk.android.oss.signer.ServiceSignature
    public byte[] computeHash(byte[] bArr, byte[] bArr2) {
        return sign(bArr, bArr2, macInstance, LOCK, ALGORITHM);
    }

    @Override // com.alibaba.sdk.android.oss.signer.ServiceSignature
    public String computeSignature(String str, String str2) {
        try {
            return BinaryUtil.toBase64String(sign(str.getBytes("UTF-8"), str2.getBytes("UTF-8"), macInstance, LOCK, ALGORITHM));
        } catch (UnsupportedEncodingException e) {
            pkq0.m170054a("Unsupported algorithm: UTF-8", e);
            return null;
        }
    }

    @Override // com.alibaba.sdk.android.oss.signer.ServiceSignature
    public String getAlgorithm() {
        return ALGORITHM;
    }

    @Override // com.alibaba.sdk.android.oss.signer.ServiceSignature
    public String getVersion() {
        return "1";
    }
}
