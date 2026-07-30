package com.heytap.mcssdk.utils;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class CryptoUtil {
    private static final int DEFAULT_RADIX = 16;
    public static final String DES_KEY = "com.nearme.mcs";

    public static String desDecrypt(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return DESUtil.decrypt(str, getDesKey());
        } catch (Exception e) {
            LogUtil.m18545e("desDecrypt-" + e.getMessage());
            return "";
        }
    }

    public static String desEncrypt(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return DESUtil.encrypt(str, getDesKey());
        } catch (Exception e) {
            LogUtil.m18545e("desEncrypt-" + e.getMessage());
            return "";
        }
    }

    private static String getDesKey() {
        byte[] bArrSwapBytes = swapBytes(getUTF8Bytes(DES_KEY));
        return bArrSwapBytes != null ? new String(bArrSwapBytes, Charset.forName("UTF-8")) : "";
    }

    public static byte[] getUTF8Bytes(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    public static String parseByte2HexStr(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            sb.append(hexString.toUpperCase(Locale.getDefault()));
        }
        return sb.toString();
    }

    public static byte[] parseHexStr2Byte(String str) {
        if (str.length() <= 0) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) ((Integer.parseInt(str.substring(i2, i3), 16) * 16) + Integer.parseInt(str.substring(i3, i2 + 2), 16));
        }
        return bArr;
    }

    public static byte[] swapBytes(byte[] bArr) {
        int length = bArr.length % 2 == 0 ? bArr.length : bArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }
}
