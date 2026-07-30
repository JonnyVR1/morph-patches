package com.alibaba.fastjson.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Base64 {

    /* JADX INFO: renamed from: CA */
    public static final char[] f3876CA;

    /* JADX INFO: renamed from: IA */
    public static final int[] f3877IA;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f3876CA = charArray;
        int[] iArr = new int[256];
        f3877IA = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            f3877IA[f3876CA[i]] = i;
        }
        f3877IA[61] = 0;
    }

    public static byte[] decodeFast(String str) {
        int i;
        int i2;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int i3 = length - 1;
        int i4 = 0;
        while (i4 < i3 && f3877IA[str.charAt(i4) & 255] < 0) {
            i4++;
        }
        while (i3 > 0 && f3877IA[str.charAt(i3) & 255] < 0) {
            i3--;
        }
        if (str.charAt(i3) == '=') {
            i = str.charAt(i3 + (-1)) == '=' ? 2 : 1;
        } else {
            i = 0;
        }
        int i5 = (i3 - i4) + 1;
        if (length > 76) {
            i2 = (str.charAt(76) == '\r' ? i5 / 78 : 0) << 1;
        } else {
            i2 = 0;
        }
        int i6 = (((i5 - i2) * 6) >> 3) - i;
        byte[] bArr = new byte[i6];
        int i7 = (i6 / 3) * 3;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int[] iArr = f3877IA;
            int i10 = i4 + 4;
            int i11 = iArr[str.charAt(i4 + 3)] | (iArr[str.charAt(i4 + 1)] << 12) | (iArr[str.charAt(i4)] << 18) | (iArr[str.charAt(i4 + 2)] << 6);
            bArr[i8] = (byte) (i11 >> 16);
            int i12 = i8 + 2;
            bArr[i8 + 1] = (byte) (i11 >> 8);
            i8 += 3;
            bArr[i12] = (byte) i11;
            if (i2 <= 0 || (i9 = i9 + 1) != 19) {
                i4 = i10;
            } else {
                i4 += 6;
                i9 = 0;
            }
        }
        if (i8 < i6) {
            int i13 = 0;
            int i14 = 0;
            while (i4 <= i3 - i) {
                i13 |= f3877IA[str.charAt(i4)] << (18 - (i14 * 6));
                i14++;
                i4++;
            }
            int i15 = 16;
            while (i8 < i6) {
                bArr[i8] = (byte) (i13 >> i15);
                i15 -= 8;
                i8++;
            }
        }
        return bArr;
    }

    public static byte[] decodeFast(String str, int i, int i2) {
        int i3;
        int i4;
        if (i2 == 0) {
            return new byte[0];
        }
        int i5 = (i + i2) - 1;
        int i6 = i;
        while (i6 < i5 && f3877IA[str.charAt(i6)] < 0) {
            i6++;
        }
        while (i5 > 0 && f3877IA[str.charAt(i5)] < 0) {
            i5--;
        }
        if (str.charAt(i5) == '=') {
            i3 = str.charAt(i5 + (-1)) == '=' ? 2 : 1;
        } else {
            i3 = 0;
        }
        int i7 = (i5 - i6) + 1;
        if (i2 > 76) {
            i4 = (str.charAt(76) == '\r' ? i7 / 78 : 0) << 1;
        } else {
            i4 = 0;
        }
        int i8 = (((i7 - i4) * 6) >> 3) - i3;
        byte[] bArr = new byte[i8];
        int i9 = (i8 / 3) * 3;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int[] iArr = f3877IA;
            int i12 = i6 + 4;
            int i13 = iArr[str.charAt(i6 + 3)] | (iArr[str.charAt(i6 + 1)] << 12) | (iArr[str.charAt(i6)] << 18) | (iArr[str.charAt(i6 + 2)] << 6);
            bArr[i10] = (byte) (i13 >> 16);
            int i14 = i10 + 2;
            bArr[i10 + 1] = (byte) (i13 >> 8);
            i10 += 3;
            bArr[i14] = (byte) i13;
            if (i4 <= 0 || (i11 = i11 + 1) != 19) {
                i6 = i12;
            } else {
                i6 += 6;
                i11 = 0;
            }
        }
        if (i10 < i8) {
            int i15 = 0;
            int i16 = 0;
            while (i6 <= i5 - i3) {
                i15 |= f3877IA[str.charAt(i6)] << (18 - (i16 * 6));
                i16++;
                i6++;
            }
            int i17 = 16;
            while (i10 < i8) {
                bArr[i10] = (byte) (i15 >> i17);
                i17 -= 8;
                i10++;
            }
        }
        return bArr;
    }

    public static byte[] decodeFast(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (i2 == 0) {
            return new byte[0];
        }
        int i6 = (i + i2) - 1;
        int i7 = i;
        while (i7 < i6 && f3877IA[cArr[i7]] < 0) {
            i7++;
        }
        while (i6 > 0 && f3877IA[cArr[i6]] < 0) {
            i6--;
        }
        if (cArr[i6] == '=') {
            i3 = cArr[i6 + (-1)] == '=' ? 2 : 1;
        } else {
            i3 = 0;
        }
        int i8 = (i6 - i7) + 1;
        if (i2 > 76) {
            i4 = (cArr[76] == '\r' ? i8 / 78 : 0) << 1;
        } else {
            i4 = 0;
        }
        int i9 = (((i8 - i4) * 6) >> 3) - i3;
        byte[] bArr = new byte[i9];
        int i10 = (i9 / 3) * 3;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int[] iArr = f3877IA;
            int i13 = i7 + 4;
            int i14 = iArr[cArr[i7 + 3]] | (iArr[cArr[i7 + 1]] << 12) | (iArr[cArr[i7]] << 18) | (iArr[cArr[i7 + 2]] << 6);
            bArr[i11] = (byte) (i14 >> 16);
            int i15 = i11 + 2;
            bArr[i11 + 1] = (byte) (i14 >> 8);
            i11 += 3;
            bArr[i15] = (byte) i14;
            if (i4 <= 0 || (i12 = i12 + 1) != 19) {
                i7 = i13;
            } else {
                i7 += 6;
                i12 = 0;
            }
        }
        if (i11 < i9) {
            int i16 = 0;
            while (i7 <= i6 - i3) {
                i5 |= f3877IA[cArr[i7]] << (18 - (i16 * 6));
                i16++;
                i7++;
            }
            int i17 = 16;
            while (i11 < i9) {
                bArr[i11] = (byte) (i5 >> i17);
                i17 -= 8;
                i11++;
            }
        }
        return bArr;
    }
}
