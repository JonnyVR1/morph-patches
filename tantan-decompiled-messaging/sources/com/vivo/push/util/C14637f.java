package com.vivo.push.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: renamed from: com.vivo.push.util.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C14637f {
    /* JADX INFO: renamed from: a */
    public static byte[] m84977a(String str, String str2, byte[] bArr) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("utf-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(str.getBytes("utf-8")));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m84976a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (bArr[i] ^ Tnaf.POW_2_WIDTH);
        }
        return new String(cArr);
    }
}
