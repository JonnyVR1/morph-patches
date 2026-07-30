package com.tencent.open.utils;

import android.util.Base64;
import com.tencent.open.log.SLog;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.tencent.open.utils.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14551f {

    /* JADX INFO: renamed from: a */
    private static final char[] f61175a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static String m85577a(String str, String str2, byte[] bArr) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            SLog.m85491e("DESUtils", "encryptAES", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m85579a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception e) {
            SLog.m85491e("DESUtils", "encryptSha", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m85578a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char[] cArr = new char[bArr.length * 2];
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                int i2 = i * 2;
                char[] cArr2 = f61175a;
                cArr[i2 + 1] = cArr2[b & 15];
                cArr[i2] = cArr2[((byte) (b >>> 4)) & 15];
            }
            return new String(cArr);
        }
        return "";
    }
}
