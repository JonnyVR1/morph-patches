package com.sina.weibo.sdk.utils;

import okio.Utf8;
import p149l.upk0;

/* JADX INFO: loaded from: classes11.dex */
public final class Base64 {
    private static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
    private static byte[] codes = new byte[256];

    static {
        for (int i = 0; i < 256; i++) {
            codes[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            codes[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            codes[i3] = (byte) (i3 - 71);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            codes[i4] = (byte) (i4 + 4);
        }
        byte[] bArr = codes;
        bArr[43] = 62;
        bArr[47] = Utf8.REPLACEMENT_BYTE;
    }

    public static byte[] decode(byte[] bArr) {
        int length = ((bArr.length + 3) / 4) * 3;
        if (bArr.length > 0 && bArr[bArr.length - 1] == 61) {
            length--;
        }
        if (bArr.length > 1 && bArr[bArr.length - 2] == 61) {
            length--;
        }
        byte[] bArr2 = new byte[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (byte b : bArr) {
            byte b2 = codes[b & 255];
            if (b2 >= 0) {
                int i4 = i3 + 6;
                i2 = (i2 << 6) | b2;
                if (i4 >= 8) {
                    i3 -= 2;
                    bArr2[i] = (byte) ((i2 >> i3) & 255);
                    i++;
                } else {
                    i3 = i4;
                }
            }
        }
        if (i == length) {
            return bArr2;
        }
        upk0.m194883a("miscalculated data length!");
        return null;
    }

    public static char[] encode(byte[] bArr) {
        boolean z;
        char[] cArr = new char[((bArr.length + 2) / 3) * 4];
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = (bArr[i] & 255) << 8;
            int i4 = i + 1;
            boolean z2 = true;
            if (i4 < bArr.length) {
                i3 |= bArr[i4] & 255;
                z = true;
            } else {
                z = false;
            }
            int i5 = i3 << 8;
            int i6 = i + 2;
            if (i6 < bArr.length) {
                i5 |= bArr[i6] & 255;
            } else {
                z2 = false;
            }
            int i7 = i2 + 3;
            char[] cArr2 = alphabet;
            int i8 = 64;
            cArr[i7] = cArr2[z2 ? i5 & 63 : 64];
            int i9 = i5 >> 6;
            int i10 = i2 + 2;
            if (z) {
                i8 = i9 & 63;
            }
            cArr[i10] = cArr2[i8];
            cArr[i2 + 1] = cArr2[(i5 >> 12) & 63];
            cArr[i2] = cArr2[(i5 >> 18) & 63];
            i += 3;
            i2 += 4;
        }
        return cArr;
    }

    public static byte[] encodebyte(byte[] bArr) {
        boolean z;
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = (bArr[i] & 255) << 8;
            int i4 = i + 1;
            boolean z2 = true;
            if (i4 < bArr.length) {
                i3 |= bArr[i4] & 255;
                z = true;
            } else {
                z = false;
            }
            int i5 = i3 << 8;
            int i6 = i + 2;
            if (i6 < bArr.length) {
                i5 |= bArr[i6] & 255;
            } else {
                z2 = false;
            }
            int i7 = i2 + 3;
            char[] cArr = alphabet;
            int i8 = 64;
            bArr2[i7] = (byte) cArr[z2 ? i5 & 63 : 64];
            int i9 = i5 >> 6;
            int i10 = i2 + 2;
            if (z) {
                i8 = i9 & 63;
            }
            bArr2[i10] = (byte) cArr[i8];
            bArr2[i2 + 1] = (byte) cArr[(i5 >> 12) & 63];
            bArr2[i2] = (byte) cArr[(i5 >> 18) & 63];
            i += 3;
            i2 += 4;
        }
        return bArr2;
    }
}
