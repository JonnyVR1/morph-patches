package org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes2.dex */
public class StringUtils {
    public static byte[] getBytesIso8859_1(String str) {
        return getBytesUnchecked(str, "ISO-8859-1");
    }

    public static byte[] getBytesUnchecked(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            throw newIllegalStateException(str2, e);
        }
    }

    public static byte[] getBytesUsAscii(String str) {
        return getBytesUnchecked(str, CharEncoding.US_ASCII);
    }

    public static byte[] getBytesUtf16(String str) {
        return getBytesUnchecked(str, "UTF-16");
    }

    public static byte[] getBytesUtf16Be(String str) {
        return getBytesUnchecked(str, CharEncoding.UTF_16BE);
    }

    public static byte[] getBytesUtf16Le(String str) {
        return getBytesUnchecked(str, CharEncoding.UTF_16LE);
    }

    public static byte[] getBytesUtf8(String str) {
        return getBytesUnchecked(str, "UTF-8");
    }

    private static IllegalStateException newIllegalStateException(String str, UnsupportedEncodingException unsupportedEncodingException) {
        return new IllegalStateException(str + ": " + unsupportedEncodingException);
    }

    public static String newString(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            throw newIllegalStateException(str, e);
        }
    }

    public static String newStringIso8859_1(byte[] bArr) {
        return newString(bArr, "ISO-8859-1");
    }

    public static String newStringUsAscii(byte[] bArr) {
        return newString(bArr, CharEncoding.US_ASCII);
    }

    public static String newStringUtf16(byte[] bArr) {
        return newString(bArr, "UTF-16");
    }

    public static String newStringUtf16Be(byte[] bArr) {
        return newString(bArr, CharEncoding.UTF_16BE);
    }

    public static String newStringUtf16Le(byte[] bArr) {
        return newString(bArr, CharEncoding.UTF_16LE);
    }

    public static String newStringUtf8(byte[] bArr) {
        return newString(bArr, "UTF-8");
    }
}
