package com.fasterxml.jackson.core.p030io;

import com.p051p1.mobile.putong.data.User;
import com.tencent.connect.common.Constants;
import com.tencent.liteav.TXLiteAVCode;

/* JADX INFO: loaded from: classes6.dex */
public final class NumberOutput {
    private static int BILLION = 1000000000;
    static final byte[] FULL_TRIPLETS_B;
    private static long MAX_INT_AS_LONG = 2147483647L;
    private static int MILLION = 1000000;
    private static long MIN_INT_AS_LONG = -2147483648L;

    /* JADX INFO: renamed from: NC */
    private static final char f6913NC = 0;
    private static long TEN_BILLION_L = 10000000000L;
    private static long THOUSAND_L = 1000;
    static final String[] sSmallIntStrs;
    static final String[] sSmallIntStrs2;
    static final String SMALLEST_LONG = String.valueOf(Long.MIN_VALUE);
    static final char[] LEAD_3 = new char[TXLiteAVCode.WARNING_START_CAPTURE_IGNORED];
    static final char[] FULL_3 = new char[TXLiteAVCode.WARNING_START_CAPTURE_IGNORED];

    static {
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            char c = (char) (i + 48);
            char c2 = i == 0 ? (char) 0 : c;
            int i3 = 0;
            while (i3 < 10) {
                char c3 = (char) (i3 + 48);
                char c4 = (i == 0 && i3 == 0) ? (char) 0 : c3;
                for (int i4 = 0; i4 < 10; i4++) {
                    char c5 = (char) (i4 + 48);
                    char[] cArr = LEAD_3;
                    cArr[i2] = c2;
                    int i5 = i2 + 1;
                    cArr[i5] = c4;
                    int i6 = i2 + 2;
                    cArr[i6] = c5;
                    char[] cArr2 = FULL_3;
                    cArr2[i2] = c;
                    cArr2[i5] = c3;
                    cArr2[i6] = c5;
                    i2 += 4;
                }
                i3++;
            }
            i++;
        }
        FULL_TRIPLETS_B = new byte[TXLiteAVCode.WARNING_START_CAPTURE_IGNORED];
        for (int i7 = 0; i7 < 4000; i7++) {
            FULL_TRIPLETS_B[i7] = (byte) FULL_3[i7];
        }
        sSmallIntStrs = new String[]{"0", "1", "2", "3", "4", "5", Constants.VIA_SHARE_TYPE_INFO, "7", Constants.VIA_SHARE_TYPE_PUBLISHVIDEO, Constants.VIA_SHARE_TYPE_MINI_PROGRAM, Constants.VIA_REPORT_TYPE_SHARE_TO_QQ};
        sSmallIntStrs2 = new String[]{User.ID_TEAM_ACCOUNT, "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    private static int calcLongStrLength(long j) {
        int i = 10;
        for (long j2 = TEN_BILLION_L; j >= j2 && i != 19; j2 = (j2 << 1) + (j2 << 3)) {
            i++;
        }
        return i;
    }

    private static int full3(int i, char[] cArr, int i2) {
        int i3 = i << 2;
        char[] cArr2 = FULL_3;
        cArr[i2] = cArr2[i3];
        int i4 = i2 + 2;
        cArr[i2 + 1] = cArr2[i3 + 1];
        int i5 = i2 + 3;
        cArr[i4] = cArr2[i3 + 2];
        return i5;
    }

    private static int leading3(int i, byte[] bArr, int i2) {
        int i3 = i << 2;
        char[] cArr = LEAD_3;
        int i4 = i3 + 1;
        char c = cArr[i3];
        if (c != 0) {
            bArr[i2] = (byte) c;
            i2++;
        }
        int i5 = i3 + 2;
        char c2 = cArr[i4];
        if (c2 != 0) {
            bArr[i2] = (byte) c2;
            i2++;
        }
        int i6 = i2 + 1;
        bArr[i2] = (byte) cArr[i5];
        return i6;
    }

    public static int outputInt(int i, char[] cArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return outputLong(i, cArr, i2);
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (i < MILLION) {
            if (i >= 1000) {
                int i4 = i / 1000;
                return full3(i - (i4 * 1000), cArr, leading3(i4, cArr, i2));
            }
            if (i >= 10) {
                return leading3(i, cArr, i2);
            }
            int i5 = i2 + 1;
            cArr[i2] = (char) (i + 48);
            return i5;
        }
        int i6 = BILLION;
        boolean z = i >= i6;
        if (z) {
            i -= i6;
            if (i >= i6) {
                i -= i6;
                i3 = i2 + 1;
                cArr[i2] = '2';
            } else {
                i3 = i2 + 1;
                cArr[i2] = '1';
            }
            i2 = i3;
        }
        int i7 = i / 1000;
        int i8 = i7 / 1000;
        return full3(i - (i7 * 1000), cArr, full3(i7 - (i8 * 1000), cArr, z ? full3(i8, cArr, i2) : leading3(i8, cArr, i2)));
    }

    public static int outputLong(long j, byte[] bArr, int i) {
        if (j < 0) {
            if (j > MIN_INT_AS_LONG) {
                return outputInt((int) j, bArr, i);
            }
            if (j == Long.MIN_VALUE) {
                int length = SMALLEST_LONG.length();
                int i2 = 0;
                while (i2 < length) {
                    bArr[i] = (byte) SMALLEST_LONG.charAt(i2);
                    i2++;
                    i++;
                }
                return i;
            }
            bArr[i] = 45;
            j = -j;
            i++;
        } else if (j <= MAX_INT_AS_LONG) {
            return outputInt((int) j, bArr, i);
        }
        int iCalcLongStrLength = calcLongStrLength(j) + i;
        int i3 = iCalcLongStrLength;
        while (j > MAX_INT_AS_LONG) {
            i3 -= 3;
            long j2 = THOUSAND_L;
            long j3 = j / j2;
            full3((int) (j - (j2 * j3)), bArr, i3);
            j = j3;
        }
        int i4 = (int) j;
        while (i4 >= 1000) {
            i3 -= 3;
            int i5 = i4 / 1000;
            full3(i4 - (i5 * 1000), bArr, i3);
            i4 = i5;
        }
        leading3(i4, bArr, i);
        return iCalcLongStrLength;
    }

    public static String toString(int i) {
        String[] strArr = sSmallIntStrs;
        if (i < strArr.length) {
            if (i >= 0) {
                return strArr[i];
            }
            int i2 = (-i) - 1;
            String[] strArr2 = sSmallIntStrs2;
            if (i2 < strArr2.length) {
                return strArr2[i2];
            }
        }
        return Integer.toString(i);
    }

    public static String toString(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return toString((int) j);
        }
        return Long.toString(j);
    }

    private static int full3(int i, byte[] bArr, int i2) {
        int i3 = i << 2;
        byte[] bArr2 = FULL_TRIPLETS_B;
        bArr[i2] = bArr2[i3];
        int i4 = i2 + 2;
        bArr[i2 + 1] = bArr2[i3 + 1];
        int i5 = i2 + 3;
        bArr[i4] = bArr2[i3 + 2];
        return i5;
    }

    public static String toString(double d) {
        return Double.toString(d);
    }

    private static int leading3(int i, char[] cArr, int i2) {
        int i3 = i << 2;
        char[] cArr2 = LEAD_3;
        int i4 = i3 + 1;
        char c = cArr2[i3];
        if (c != 0) {
            cArr[i2] = c;
            i2++;
        }
        int i5 = i3 + 2;
        char c2 = cArr2[i4];
        if (c2 != 0) {
            cArr[i2] = c2;
            i2++;
        }
        int i6 = i2 + 1;
        cArr[i2] = cArr2[i5];
        return i6;
    }

    public static int outputInt(int i, byte[] bArr, int i2) {
        int iLeading3;
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return outputLong(i, bArr, i2);
            }
            bArr[i2] = 45;
            i = -i;
            i2++;
        }
        if (i < MILLION) {
            if (i >= 1000) {
                int i4 = i / 1000;
                return full3(i - (i4 * 1000), bArr, leading3(i4, bArr, i2));
            }
            if (i < 10) {
                int i5 = i2 + 1;
                bArr[i2] = (byte) (i + 48);
                return i5;
            }
            return leading3(i, bArr, i2);
        }
        int i6 = BILLION;
        boolean z = i >= i6;
        if (z) {
            i -= i6;
            if (i >= i6) {
                i -= i6;
                i3 = i2 + 1;
                bArr[i2] = 50;
            } else {
                i3 = i2 + 1;
                bArr[i2] = 49;
            }
            i2 = i3;
        }
        int i7 = i / 1000;
        int i8 = i - (i7 * 1000);
        int i9 = i7 / 1000;
        int i10 = i7 - (i9 * 1000);
        if (z) {
            iLeading3 = full3(i9, bArr, i2);
        } else {
            iLeading3 = leading3(i9, bArr, i2);
        }
        return full3(i8, bArr, full3(i10, bArr, iLeading3));
    }

    public static int outputLong(long j, char[] cArr, int i) {
        if (j < 0) {
            if (j > MIN_INT_AS_LONG) {
                return outputInt((int) j, cArr, i);
            }
            if (j == Long.MIN_VALUE) {
                String str = SMALLEST_LONG;
                int length = str.length();
                str.getChars(0, length, cArr, i);
                return i + length;
            }
            cArr[i] = '-';
            j = -j;
            i++;
        } else if (j <= MAX_INT_AS_LONG) {
            return outputInt((int) j, cArr, i);
        }
        int iCalcLongStrLength = calcLongStrLength(j) + i;
        int i2 = iCalcLongStrLength;
        while (j > MAX_INT_AS_LONG) {
            i2 -= 3;
            long j2 = THOUSAND_L;
            long j3 = j / j2;
            full3((int) (j - (j2 * j3)), cArr, i2);
            j = j3;
        }
        int i3 = (int) j;
        while (i3 >= 1000) {
            i2 -= 3;
            int i4 = i3 / 1000;
            full3(i3 - (i4 * 1000), cArr, i2);
            i3 = i4;
        }
        leading3(i3, cArr, i);
        return iCalcLongStrLength;
    }
}
