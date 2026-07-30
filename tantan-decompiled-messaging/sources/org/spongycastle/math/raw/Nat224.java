package org.spongycastle.math.raw;

import java.math.BigInteger;
import org.spongycastle.util.Pack;
import p149l.x9g0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Nat224 {

    /* JADX INFO: renamed from: M */
    private static final long f206874M = 4294967295L;

    public static int add(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & f206874M) + (((long) iArr2[i2]) & f206874M);
        iArr3[i3] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & f206874M) + (((long) iArr2[i2 + 1]) & f206874M);
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & f206874M) + (((long) iArr2[i2 + 2]) & f206874M);
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & f206874M) + (((long) iArr2[i2 + 3]) & f206874M);
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & f206874M) + (((long) iArr2[i2 + 4]) & f206874M);
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & f206874M) + (((long) iArr2[i2 + 5]) & f206874M);
        iArr3[i3 + 5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & f206874M) + (((long) iArr2[i2 + 6]) & f206874M);
        iArr3[i3 + 6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & f206874M) + (((long) iArr2[i2]) & f206874M) + (((long) iArr3[i3]) & f206874M);
        iArr3[i3] = (int) j;
        int i4 = i3 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & f206874M) + (((long) iArr2[i2 + 1]) & f206874M) + (((long) iArr3[i4]) & f206874M);
        iArr3[i4] = (int) j2;
        int i5 = i3 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & f206874M) + (((long) iArr2[i2 + 2]) & f206874M) + (((long) iArr3[i5]) & f206874M);
        iArr3[i5] = (int) j3;
        int i6 = i3 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & f206874M) + (((long) iArr2[i2 + 3]) & f206874M) + (((long) iArr3[i6]) & f206874M);
        iArr3[i6] = (int) j4;
        int i7 = i3 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & f206874M) + (((long) iArr2[i2 + 4]) & f206874M) + (((long) iArr3[i7]) & f206874M);
        iArr3[i7] = (int) j5;
        int i8 = i3 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & f206874M) + (((long) iArr2[i2 + 5]) & f206874M) + (((long) iArr3[i8]) & f206874M);
        iArr3[i8] = (int) j6;
        int i9 = i3 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & f206874M) + (((long) iArr2[i2 + 6]) & f206874M) + (((long) iArr3[i9]) & f206874M);
        iArr3[i9] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (((long) i3) & f206874M) + (((long) iArr[i]) & f206874M) + (((long) iArr2[i2]) & f206874M);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & f206874M) + (((long) iArr2[i4]) & f206874M);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & f206874M) + (((long) iArr2[i5]) & f206874M);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & f206874M) + (((long) iArr2[i6]) & f206874M);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & f206874M) + (((long) iArr2[i7]) & f206874M);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & f206874M) + (((long) iArr2[i8]) & f206874M);
        iArr2[i8] = (int) j6;
        int i9 = i2 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & f206874M) + (f206874M & ((long) iArr2[i9]));
        iArr2[i9] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr[i]) & f206874M) + (((long) iArr2[i2]) & f206874M);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i4]) & f206874M) + (((long) iArr2[i5]) & f206874M);
        int i6 = (int) j2;
        iArr[i4] = i6;
        iArr2[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i7]) & f206874M) + (((long) iArr2[i8]) & f206874M);
        int i9 = (int) j3;
        iArr[i7] = i9;
        iArr2[i8] = i9;
        int i10 = i + 3;
        int i11 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i10]) & f206874M) + (((long) iArr2[i11]) & f206874M);
        int i12 = (int) j4;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        int i13 = i + 4;
        int i14 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i13]) & f206874M) + (((long) iArr2[i14]) & f206874M);
        int i15 = (int) j5;
        iArr[i13] = i15;
        iArr2[i14] = i15;
        int i16 = i + 5;
        int i17 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i16]) & f206874M) + (((long) iArr2[i17]) & f206874M);
        int i18 = (int) j6;
        iArr[i16] = i18;
        iArr2[i17] = i18;
        int i19 = i + 6;
        int i20 = i2 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i19]) & f206874M) + (f206874M & ((long) iArr2[i20]));
        int i21 = (int) j7;
        iArr[i19] = i21;
        iArr2[i20] = i21;
        return (int) (j7 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static int[] create() {
        return new int[7];
    }

    public static int[] createExt() {
        return new int[14];
    }

    public static boolean diff(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean zGte = gte(iArr, i, iArr2, i2);
        if (zGte) {
            sub(iArr, i, iArr2, i2, iArr3, i3);
            return zGte;
        }
        sub(iArr2, i2, iArr, i, iArr3, i3);
        return zGte;
    }

    /* JADX INFO: renamed from: eq */
    public static boolean m221230eq(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            x9g0.m207497a();
            return null;
        }
        int[] iArrCreate = create();
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArrCreate[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArrCreate;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 7) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 6; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & f206874M;
        long j2 = ((long) iArr2[i2 + 1]) & f206874M;
        long j3 = ((long) iArr2[i2 + 2]) & f206874M;
        long j4 = ((long) iArr2[i2 + 3]) & f206874M;
        long j5 = ((long) iArr2[i2 + 4]) & f206874M;
        long j6 = ((long) iArr2[i2 + 5]) & f206874M;
        long j7 = ((long) iArr2[i2 + 6]) & f206874M;
        long j8 = ((long) iArr[i]) & f206874M;
        long j9 = j8 * j;
        iArr3[i3] = (int) j9;
        long j10 = (j9 >>> 32) + (j8 * j2);
        iArr3[i3 + 1] = (int) j10;
        long j11 = (j10 >>> 32) + (j8 * j3);
        iArr3[i3 + 2] = (int) j11;
        long j12 = (j11 >>> 32) + (j8 * j4);
        iArr3[i3 + 3] = (int) j12;
        long j13 = (j12 >>> 32) + (j8 * j5);
        iArr3[i3 + 4] = (int) j13;
        long j14 = (j13 >>> 32) + (j8 * j6);
        iArr3[i3 + 5] = (int) j14;
        long j15 = (j14 >>> 32) + (j8 * j7);
        iArr3[i3 + 6] = (int) j15;
        iArr3[i3 + 7] = (int) (j15 >>> 32);
        int i4 = 1;
        int i5 = i3;
        while (i4 < 7) {
            int i6 = i5 + 1;
            int i7 = i5;
            long j16 = ((long) iArr[i + i4]) & f206874M;
            long j17 = (j16 * j) + (((long) iArr3[i6]) & f206874M);
            iArr3[i6] = (int) j17;
            int i8 = i7 + 2;
            long j18 = (j17 >>> 32) + (j16 * j2) + (((long) iArr3[i8]) & f206874M);
            iArr3[i8] = (int) j18;
            int i9 = i7 + 3;
            long j19 = (j18 >>> 32) + (j16 * j3) + (((long) iArr3[i9]) & f206874M);
            iArr3[i9] = (int) j19;
            int i10 = i7 + 4;
            long j20 = (j19 >>> 32) + (j16 * j4) + (((long) iArr3[i10]) & f206874M);
            iArr3[i10] = (int) j20;
            int i11 = i7 + 5;
            long j21 = (j20 >>> 32) + (j16 * j5) + (((long) iArr3[i11]) & f206874M);
            iArr3[i11] = (int) j21;
            int i12 = i7 + 6;
            long j22 = (j21 >>> 32) + (j16 * j6) + (((long) iArr3[i12]) & f206874M);
            iArr3[i12] = (int) j22;
            int i13 = i7 + 7;
            long j23 = (j22 >>> 32) + (j16 * j7) + (((long) iArr3[i13]) & f206874M);
            iArr3[i13] = (int) j23;
            iArr3[i7 + 8] = (int) (j23 >>> 32);
            i4++;
            i5 = i6;
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = ((long) i) & f206874M;
        long j2 = ((long) iArr[i2]) & f206874M;
        long j3 = (j * j2) + (((long) iArr2[i3]) & f206874M);
        iArr3[i4] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & f206874M;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (((long) iArr2[i3 + 1]) & f206874M);
        iArr3[i4 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = ((long) iArr[i2 + 2]) & f206874M;
        long j8 = j6 + (j * j7) + j4 + (((long) iArr2[i3 + 2]) & f206874M);
        iArr3[i4 + 2] = (int) j8;
        long j9 = ((long) iArr[i2 + 3]) & f206874M;
        long j10 = (j8 >>> 32) + (j * j9) + j7 + (((long) iArr2[i3 + 3]) & f206874M);
        iArr3[i4 + 3] = (int) j10;
        long j11 = ((long) iArr[i2 + 4]) & f206874M;
        long j12 = (j10 >>> 32) + (j * j11) + j9 + (((long) iArr2[i3 + 4]) & f206874M);
        iArr3[i4 + 4] = (int) j12;
        long j13 = ((long) iArr[i2 + 5]) & f206874M;
        long j14 = (j12 >>> 32) + (j * j13) + j11 + (((long) iArr2[i3 + 5]) & f206874M);
        iArr3[i4 + 5] = (int) j14;
        long j15 = ((long) iArr[i2 + 6]) & f206874M;
        long j16 = (j14 >>> 32) + (j * j15) + j13 + (f206874M & ((long) iArr2[i3 + 6]));
        iArr3[i4 + 6] = (int) j16;
        return (j16 >>> 32) + j15;
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & f206874M;
        long j3 = j & f206874M;
        long j4 = (j2 * j3) + (((long) iArr[i2]) & f206874M);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        int i3 = i2 + 1;
        long j7 = (j4 >>> 32) + j6 + (((long) iArr[i3]) & f206874M);
        iArr[i3] = (int) j7;
        int i4 = i2 + 2;
        long j8 = (j7 >>> 32) + j5 + (((long) iArr[i4]) & f206874M);
        iArr[i4] = (int) j8;
        long j9 = j8 >>> 32;
        int i5 = i2 + 3;
        long j10 = j9 + (((long) iArr[i5]) & f206874M);
        iArr[i5] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i2, 4);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = ((long) i) & f206874M;
        long j2 = ((long) i2) & f206874M;
        long j3 = (j * j2) + (((long) iArr[i3]) & f206874M);
        iArr[i3] = (int) j3;
        int i4 = i3 + 1;
        long j4 = (j3 >>> 32) + j2 + (((long) iArr[i4]) & f206874M);
        iArr[i4] = (int) j4;
        long j5 = j4 >>> 32;
        int i5 = i3 + 2;
        long j6 = j5 + (((long) iArr[i5]) & f206874M);
        iArr[i5] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & f206874M;
        long j2 = ((long) iArr2[i2 + 1]) & f206874M;
        long j3 = ((long) iArr2[i2 + 2]) & f206874M;
        long j4 = ((long) iArr2[i2 + 3]) & f206874M;
        long j5 = ((long) iArr2[i2 + 4]) & f206874M;
        long j6 = ((long) iArr2[i2 + 5]) & f206874M;
        long j7 = ((long) iArr2[i2 + 6]) & f206874M;
        int i4 = 0;
        int i5 = i3;
        long j8 = 0;
        while (i4 < 7) {
            int i6 = i4;
            long j9 = ((long) iArr[i + i4]) & f206874M;
            long j10 = (j9 * j) + (((long) iArr3[i5]) & f206874M);
            long j11 = j2;
            iArr3[i5] = (int) j10;
            int i7 = i5 + 1;
            long j12 = (j10 >>> 32) + (j9 * j11) + (((long) iArr3[i7]) & f206874M);
            iArr3[i7] = (int) j12;
            int i8 = i5 + 2;
            long j13 = (j12 >>> 32) + (j9 * j3) + (((long) iArr3[i8]) & f206874M);
            iArr3[i8] = (int) j13;
            int i9 = i5 + 3;
            long j14 = (j13 >>> 32) + (j9 * j4) + (((long) iArr3[i9]) & f206874M);
            iArr3[i9] = (int) j14;
            int i10 = i5 + 4;
            long j15 = (j14 >>> 32) + (j9 * j5) + (((long) iArr3[i10]) & f206874M);
            iArr3[i10] = (int) j15;
            int i11 = i5 + 5;
            long j16 = (j15 >>> 32) + (j9 * j6) + (((long) iArr3[i11]) & f206874M);
            iArr3[i11] = (int) j16;
            int i12 = i5 + 6;
            long j17 = (j16 >>> 32) + (j9 * j7) + (((long) iArr3[i12]) & f206874M);
            iArr3[i12] = (int) j17;
            int i13 = i5 + 7;
            long j18 = (j17 >>> 32) + j8 + (((long) iArr3[i13]) & f206874M);
            iArr3[i13] = (int) j18;
            j8 = j18 >>> 32;
            i4 = i6 + 1;
            i5 = i7;
            j2 = j11;
        }
        return (int) j8;
    }

    public static int mulByWord(int i, int[] iArr) {
        long j = ((long) i) & f206874M;
        long j2 = (((long) iArr[0]) & f206874M) * j;
        iArr[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((((long) iArr[1]) & f206874M) * j);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr[2]) & f206874M) * j);
        iArr[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr[3]) & f206874M) * j);
        iArr[3] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr[4]) & f206874M) * j);
        iArr[4] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr[5]) & f206874M) * j);
        iArr[5] = (int) j7;
        long j8 = (j7 >>> 32) + (j * (f206874M & ((long) iArr[6])));
        iArr[6] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int mulByWordAddTo(int i, int[] iArr, int[] iArr2) {
        long j = ((long) i) & f206874M;
        long j2 = ((((long) iArr2[0]) & f206874M) * j) + (((long) iArr[0]) & f206874M);
        iArr2[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((((long) iArr2[1]) & f206874M) * j) + (((long) iArr[1]) & f206874M);
        iArr2[1] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr2[2]) & f206874M) * j) + (((long) iArr[2]) & f206874M);
        iArr2[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr2[3]) & f206874M) * j) + (((long) iArr[3]) & f206874M);
        iArr2[3] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr2[4]) & f206874M) * j) + (((long) iArr[4]) & f206874M);
        iArr2[4] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr2[5]) & f206874M) * j) + (((long) iArr[5]) & f206874M);
        iArr2[5] = (int) j7;
        long j8 = (j7 >>> 32) + (j * (((long) iArr2[6]) & f206874M)) + (f206874M & ((long) iArr[6]));
        iArr2[6] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = ((long) i) & f206874M;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = j2 + ((((long) iArr[i3]) & f206874M) * j);
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 7);
        return (int) j2;
    }

    public static int mulWordAddTo(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = ((long) i) & f206874M;
        long j2 = ((((long) iArr[i2]) & f206874M) * j) + (((long) iArr2[i3]) & f206874M);
        iArr2[i3] = (int) j2;
        int i4 = i3 + 1;
        long j3 = (j2 >>> 32) + ((((long) iArr[i2 + 1]) & f206874M) * j) + (((long) iArr2[i4]) & f206874M);
        iArr2[i4] = (int) j3;
        int i5 = i3 + 2;
        long j4 = (j3 >>> 32) + ((((long) iArr[i2 + 2]) & f206874M) * j) + (((long) iArr2[i5]) & f206874M);
        iArr2[i5] = (int) j4;
        int i6 = i3 + 3;
        long j5 = (j4 >>> 32) + ((((long) iArr[i2 + 3]) & f206874M) * j) + (((long) iArr2[i6]) & f206874M);
        iArr2[i6] = (int) j5;
        int i7 = i3 + 4;
        long j6 = (j5 >>> 32) + ((((long) iArr[i2 + 4]) & f206874M) * j) + (((long) iArr2[i7]) & f206874M);
        iArr2[i7] = (int) j6;
        int i8 = i3 + 5;
        long j7 = (j6 >>> 32) + ((((long) iArr[i2 + 5]) & f206874M) * j) + (((long) iArr2[i8]) & f206874M);
        iArr2[i8] = (int) j7;
        int i9 = i3 + 6;
        long j8 = (j7 >>> 32) + (j * (((long) iArr[i2 + 6]) & f206874M)) + (((long) iArr2[i9]) & f206874M);
        iArr2[i9] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & f206874M;
        long j3 = ((j & f206874M) * j2) + (((long) iArr[i2]) & f206874M);
        iArr[i2] = (int) j3;
        long j4 = j2 * (j >>> 32);
        int i3 = i2 + 1;
        long j5 = (j3 >>> 32) + j4 + (((long) iArr[i3]) & f206874M);
        iArr[i3] = (int) j5;
        int i4 = i2 + 2;
        long j6 = (j5 >>> 32) + (((long) iArr[i4]) & f206874M);
        iArr[i4] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i2, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i]) & f206874M;
        int i3 = 0;
        int i4 = 14;
        int i5 = 6;
        while (true) {
            int i6 = i5 - 1;
            long j2 = ((long) iArr[i + i5]) & f206874M;
            long j3 = j2 * j2;
            iArr2[i2 + (i4 - 1)] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 -= 2;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i3 << 31)) & f206874M);
                iArr2[i2] = (int) j4;
                int i7 = ((int) (j4 >>> 32)) & 1;
                long j6 = ((long) iArr[i + 1]) & f206874M;
                int i8 = i2 + 2;
                long j7 = ((long) iArr2[i8]) & f206874M;
                long j8 = j5 + (j6 * j);
                int i9 = (int) j8;
                iArr2[i2 + 1] = (i9 << 1) | i7;
                int i10 = i9 >>> 31;
                long j9 = j7 + (j8 >>> 32);
                long j10 = ((long) iArr[i + 2]) & f206874M;
                int i11 = i2 + 3;
                long j11 = ((long) iArr2[i11]) & f206874M;
                int i12 = i2 + 4;
                long j12 = ((long) iArr2[i12]) & f206874M;
                long j13 = j9 + (j10 * j);
                int i13 = (int) j13;
                iArr2[i8] = (i13 << 1) | i10;
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = j12 + (j14 >>> 32);
                long j16 = j14 & f206874M;
                long j17 = ((long) iArr[i + 3]) & f206874M;
                int i14 = i2 + 5;
                long j18 = ((long) iArr2[i14]) & f206874M;
                int i15 = i2 + 6;
                long j19 = ((long) iArr2[i15]) & f206874M;
                long j20 = j16 + (j17 * j);
                int i16 = (int) j20;
                iArr2[i11] = (i16 << 1) | (i13 >>> 31);
                int i17 = i16 >>> 31;
                long j21 = j15 + (j20 >>> 32) + (j17 * j6);
                long j22 = j18 + (j21 >>> 32) + (j17 * j10);
                long j23 = j21 & f206874M;
                long j24 = j19 + (j22 >>> 32);
                long j25 = j22 & f206874M;
                long j26 = ((long) iArr[i + 4]) & f206874M;
                int i18 = i2 + 7;
                long j27 = ((long) iArr2[i18]) & f206874M;
                int i19 = i2 + 8;
                long j28 = ((long) iArr2[i19]) & f206874M;
                long j29 = j23 + (j26 * j);
                int i20 = (int) j29;
                iArr2[i12] = (i20 << 1) | i17;
                int i21 = i20 >>> 31;
                long j30 = j25 + (j29 >>> 32) + (j26 * j6);
                long j31 = j24 + (j30 >>> 32) + (j26 * j10);
                long j32 = j30 & f206874M;
                long j33 = j27 + (j31 >>> 32) + (j26 * j17);
                long j34 = j31 & f206874M;
                long j35 = j28 + (j33 >>> 32);
                long j36 = j33 & f206874M;
                long j37 = ((long) iArr[i + 5]) & f206874M;
                int i22 = i2 + 9;
                long j38 = ((long) iArr2[i22]) & f206874M;
                int i23 = i2 + 10;
                long j39 = ((long) iArr2[i23]) & f206874M;
                long j40 = j32 + (j37 * j);
                int i24 = (int) j40;
                iArr2[i14] = (i24 << 1) | i21;
                int i25 = i24 >>> 31;
                long j41 = j34 + (j40 >>> 32) + (j37 * j6);
                long j42 = j36 + (j41 >>> 32) + (j37 * j10);
                long j43 = j41 & f206874M;
                long j44 = j35 + (j42 >>> 32) + (j37 * j17);
                long j45 = j42 & f206874M;
                long j46 = j38 + (j44 >>> 32) + (j37 * j26);
                long j47 = j44 & f206874M;
                long j48 = j39 + (j46 >>> 32);
                long j49 = j46 & f206874M;
                long j50 = ((long) iArr[i + 6]) & f206874M;
                int i26 = i2 + 11;
                long j51 = ((long) iArr2[i26]) & f206874M;
                int i27 = i2 + 12;
                long j52 = ((long) iArr2[i27]) & f206874M;
                long j53 = j43 + (j50 * j);
                int i28 = (int) j53;
                iArr2[i15] = (i28 << 1) | i25;
                long j54 = j45 + (j53 >>> 32) + (j50 * j6);
                long j55 = j47 + (j54 >>> 32) + (j50 * j10);
                long j56 = j49 + (j55 >>> 32) + (j50 * j17);
                long j57 = j48 + (j56 >>> 32) + (j50 * j26);
                long j58 = j51 + (j57 >>> 32) + (j50 * j37);
                long j59 = j52 + (j58 >>> 32);
                int i29 = (int) j54;
                iArr2[i18] = (i28 >>> 31) | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j55;
                iArr2[i19] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) j56;
                iArr2[i22] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j57;
                iArr2[i23] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j58;
                iArr2[i26] = i36 | (i37 << 1);
                int i38 = i37 >>> 31;
                int i39 = (int) j59;
                iArr2[i27] = i38 | (i39 << 1);
                int i40 = i39 >>> 31;
                int i41 = i2 + 13;
                iArr2[i41] = i40 | ((iArr2[i41] + ((int) (j59 >> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & f206874M) - (((long) iArr2[i2]) & f206874M);
        iArr3[i3] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[i + 1]) & f206874M) - (((long) iArr2[i2 + 1]) & f206874M));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 2]) & f206874M) - (((long) iArr2[i2 + 2]) & f206874M));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 3]) & f206874M) - (((long) iArr2[i2 + 3]) & f206874M));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[i + 4]) & f206874M) - (((long) iArr2[i2 + 4]) & f206874M));
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[i + 5]) & f206874M) - (((long) iArr2[i2 + 5]) & f206874M));
        iArr3[i3 + 5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[i + 6]) & f206874M) - (((long) iArr2[i2 + 6]) & f206874M));
        iArr3[i3 + 6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr3[0]) & f206874M) - (((long) iArr[0]) & f206874M)) - (((long) iArr2[0]) & f206874M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + (((((long) iArr3[1]) & f206874M) - (((long) iArr[1]) & f206874M)) - (((long) iArr2[1]) & f206874M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + (((((long) iArr3[2]) & f206874M) - (((long) iArr[2]) & f206874M)) - (((long) iArr2[2]) & f206874M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + (((((long) iArr3[3]) & f206874M) - (((long) iArr[3]) & f206874M)) - (((long) iArr2[3]) & f206874M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + (((((long) iArr3[4]) & f206874M) - (((long) iArr[4]) & f206874M)) - (((long) iArr2[4]) & f206874M));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + (((((long) iArr3[5]) & f206874M) - (((long) iArr[5]) & f206874M)) - (((long) iArr2[5]) & f206874M));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + (((((long) iArr3[6]) & f206874M) - (((long) iArr[6]) & f206874M)) - (((long) iArr2[6]) & f206874M));
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr2[i2]) & f206874M) - (((long) iArr[i]) & f206874M);
        iArr2[i2] = (int) j;
        int i3 = i2 + 1;
        long j2 = (j >> 32) + ((((long) iArr2[i3]) & f206874M) - (((long) iArr[i + 1]) & f206874M));
        iArr2[i3] = (int) j2;
        int i4 = i2 + 2;
        long j3 = (j2 >> 32) + ((((long) iArr2[i4]) & f206874M) - (((long) iArr[i + 2]) & f206874M));
        iArr2[i4] = (int) j3;
        int i5 = i2 + 3;
        long j4 = (j3 >> 32) + ((((long) iArr2[i5]) & f206874M) - (((long) iArr[i + 3]) & f206874M));
        iArr2[i5] = (int) j4;
        int i6 = i2 + 4;
        long j5 = (j4 >> 32) + ((((long) iArr2[i6]) & f206874M) - (((long) iArr[i + 4]) & f206874M));
        iArr2[i6] = (int) j5;
        int i7 = i2 + 5;
        long j6 = (j5 >> 32) + ((((long) iArr2[i7]) & f206874M) - (((long) iArr[i + 5]) & f206874M));
        iArr2[i7] = (int) j6;
        int i8 = i2 + 6;
        long j7 = (j6 >> 32) + ((((long) iArr2[i8]) & f206874M) - (((long) iArr[i + 6]) & f206874M));
        iArr2[i8] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & f206874M) - (((long) iArr[0]) & f206874M);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & f206874M) - (((long) iArr[1]) & f206874M));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & f206874M) - (((long) iArr[2]) & f206874M));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & f206874M) - (((long) iArr[3]) & f206874M));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & f206874M) - (((long) iArr[4]) & f206874M));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & f206874M) - (((long) iArr[5]) & f206874M));
        iArr2[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr2[6]) & f206874M) - (f206874M & ((long) iArr[6])));
        iArr2[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[0]) & f206874M) + (((long) iArr2[0]) & f206874M);
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f206874M) + (((long) iArr2[1]) & f206874M);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f206874M) + (((long) iArr2[2]) & f206874M);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f206874M) + (((long) iArr2[3]) & f206874M);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f206874M) + (((long) iArr2[4]) & f206874M);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & f206874M) + (((long) iArr2[5]) & f206874M);
        iArr2[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & f206874M) + (f206874M & ((long) iArr2[6]));
        iArr2[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f206874M) + (((long) iArr2[0]) & f206874M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f206874M) + (((long) iArr2[1]) & f206874M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f206874M) + (((long) iArr2[2]) & f206874M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f206874M) + (((long) iArr2[3]) & f206874M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f206874M) + (((long) iArr2[4]) & f206874M);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & f206874M) + (((long) iArr2[5]) & f206874M);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & f206874M) + (((long) iArr2[6]) & f206874M);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f206874M) - (((long) iArr2[0]) & f206874M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & f206874M) - (((long) iArr2[1]) & f206874M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & f206874M) - (((long) iArr2[2]) & f206874M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & f206874M) - (((long) iArr2[3]) & f206874M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & f206874M) - (((long) iArr2[4]) & f206874M));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[5]) & f206874M) - (((long) iArr2[5]) & f206874M));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[6]) & f206874M) - (((long) iArr2[6]) & f206874M));
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f206874M) + (((long) iArr2[0]) & f206874M) + (((long) iArr3[0]) & f206874M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f206874M) + (((long) iArr2[1]) & f206874M) + (((long) iArr3[1]) & f206874M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f206874M) + (((long) iArr2[2]) & f206874M) + (((long) iArr3[2]) & f206874M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f206874M) + (((long) iArr2[3]) & f206874M) + (((long) iArr3[3]) & f206874M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f206874M) + (((long) iArr2[4]) & f206874M) + (((long) iArr3[4]) & f206874M);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & f206874M) + (((long) iArr2[5]) & f206874M) + (((long) iArr3[5]) & f206874M);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & f206874M) + (((long) iArr2[6]) & f206874M) + (((long) iArr3[6]) & f206874M);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & f206874M;
        long j2 = ((long) iArr2[1]) & f206874M;
        long j3 = ((long) iArr2[2]) & f206874M;
        long j4 = ((long) iArr2[3]) & f206874M;
        long j5 = ((long) iArr2[4]) & f206874M;
        long j6 = ((long) iArr2[5]) & f206874M;
        long j7 = ((long) iArr2[6]) & f206874M;
        long j8 = 0;
        int i = 0;
        while (i < 7) {
            long j9 = j7;
            long j10 = ((long) iArr[i]) & f206874M;
            long j11 = (((long) iArr3[i]) & f206874M) + (j10 * j);
            iArr3[i] = (int) j11;
            int i2 = i + 1;
            long j12 = (j11 >>> 32) + (j10 * j2) + (((long) iArr3[i2]) & f206874M);
            iArr3[i2] = (int) j12;
            int i3 = i + 2;
            long j13 = (j12 >>> 32) + (j10 * j3) + (((long) iArr3[i3]) & f206874M);
            int i4 = i;
            iArr3[i3] = (int) j13;
            int i5 = i4 + 3;
            long j14 = (j13 >>> 32) + (j10 * j4) + (((long) iArr3[i5]) & f206874M);
            iArr3[i5] = (int) j14;
            int i6 = i4 + 4;
            long j15 = (j14 >>> 32) + (j10 * j5) + (((long) iArr3[i6]) & f206874M);
            iArr3[i6] = (int) j15;
            int i7 = i4 + 5;
            long j16 = (j15 >>> 32) + (j10 * j6) + (((long) iArr3[i7]) & f206874M);
            iArr3[i7] = (int) j16;
            int i8 = i4 + 6;
            long j17 = (j16 >>> 32) + (j10 * j9) + (((long) iArr3[i8]) & f206874M);
            iArr3[i8] = (int) j17;
            int i9 = i4 + 7;
            long j18 = (j17 >>> 32) + j8 + (((long) iArr3[i9]) & f206874M);
            iArr3[i9] = (int) j18;
            j8 = j18 >>> 32;
            i = i2;
            j7 = j9;
        }
        return (int) j8;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & f206874M;
        long j2 = ((long) iArr2[1]) & f206874M;
        long j3 = ((long) iArr2[2]) & f206874M;
        long j4 = ((long) iArr2[3]) & f206874M;
        long j5 = ((long) iArr2[4]) & f206874M;
        long j6 = ((long) iArr2[5]) & f206874M;
        long j7 = ((long) iArr2[6]) & f206874M;
        long j8 = ((long) iArr[0]) & f206874M;
        long j9 = j8 * j;
        iArr3[0] = (int) j9;
        long j10 = (j9 >>> 32) + (j8 * j2);
        iArr3[1] = (int) j10;
        long j11 = (j10 >>> 32) + (j8 * j3);
        iArr3[2] = (int) j11;
        long j12 = (j11 >>> 32) + (j8 * j4);
        iArr3[3] = (int) j12;
        long j13 = (j12 >>> 32) + (j8 * j5);
        iArr3[4] = (int) j13;
        long j14 = (j13 >>> 32) + (j8 * j6);
        iArr3[5] = (int) j14;
        long j15 = (j14 >>> 32) + (j8 * j7);
        iArr3[6] = (int) j15;
        iArr3[7] = (int) (j15 >>> 32);
        int i = 1;
        for (int i2 = 7; i < i2; i2 = 7) {
            long j16 = ((long) iArr[i]) & f206874M;
            long j17 = (j16 * j) + (((long) iArr3[i]) & f206874M);
            iArr3[i] = (int) j17;
            int i3 = i + 1;
            long j18 = j5;
            long j19 = (j17 >>> 32) + (j16 * j2) + (((long) iArr3[i3]) & f206874M);
            iArr3[i3] = (int) j19;
            int i4 = i + 2;
            long j20 = (j19 >>> 32) + (j16 * j3) + (((long) iArr3[i4]) & f206874M);
            iArr3[i4] = (int) j20;
            int i5 = i + 3;
            long j21 = (j20 >>> 32) + (j16 * j4) + (((long) iArr3[i5]) & f206874M);
            iArr3[i5] = (int) j21;
            int i6 = i + 4;
            long j22 = (j21 >>> 32) + (j16 * j18) + (((long) iArr3[i6]) & f206874M);
            iArr3[i6] = (int) j22;
            int i7 = i + 5;
            long j23 = (j22 >>> 32) + (j16 * j6) + (((long) iArr3[i7]) & f206874M);
            iArr3[i7] = (int) j23;
            int i8 = i + 6;
            long j24 = (j23 >>> 32) + (j16 * j7) + (((long) iArr3[i8]) & f206874M);
            iArr3[i8] = (int) j24;
            iArr3[i + 7] = (int) (j24 >>> 32);
            i = i3;
            j5 = j18;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & f206874M;
        int i = 14;
        int i2 = 0;
        int i3 = 6;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & f206874M;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i2 << 31)) & f206874M);
                iArr2[0] = (int) j4;
                long j6 = ((long) iArr[1]) & f206874M;
                long j7 = ((long) iArr2[2]) & f206874M;
                long j8 = j5 + (j6 * j);
                int i5 = (int) j8;
                iArr2[1] = (i5 << 1) | (((int) (j4 >>> 32)) & 1);
                long j9 = j7 + (j8 >>> 32);
                long j10 = ((long) iArr[2]) & f206874M;
                long j11 = ((long) iArr2[3]) & f206874M;
                long j12 = ((long) iArr2[4]) & f206874M;
                long j13 = j9 + (j10 * j);
                int i6 = (int) j13;
                iArr2[2] = (i6 << 1) | (i5 >>> 31);
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = j12 + (j14 >>> 32);
                long j16 = j14 & f206874M;
                long j17 = ((long) iArr[3]) & f206874M;
                long j18 = ((long) iArr2[5]) & f206874M;
                long j19 = ((long) iArr2[6]) & f206874M;
                long j20 = j16 + (j17 * j);
                int i7 = (int) j20;
                iArr2[3] = (i7 << 1) | (i6 >>> 31);
                int i8 = i7 >>> 31;
                long j21 = j15 + (j20 >>> 32) + (j17 * j6);
                long j22 = j18 + (j21 >>> 32) + (j17 * j10);
                long j23 = j21 & f206874M;
                long j24 = j19 + (j22 >>> 32);
                long j25 = j22 & f206874M;
                long j26 = ((long) iArr[4]) & f206874M;
                long j27 = ((long) iArr2[7]) & f206874M;
                long j28 = ((long) iArr2[8]) & f206874M;
                long j29 = j23 + (j26 * j);
                int i9 = (int) j29;
                iArr2[4] = (i9 << 1) | i8;
                int i10 = i9 >>> 31;
                long j30 = j25 + (j29 >>> 32) + (j26 * j6);
                long j31 = j24 + (j30 >>> 32) + (j26 * j10);
                long j32 = j30 & f206874M;
                long j33 = j27 + (j31 >>> 32) + (j26 * j17);
                long j34 = j31 & f206874M;
                long j35 = j28 + (j33 >>> 32);
                long j36 = j33 & f206874M;
                long j37 = ((long) iArr[5]) & f206874M;
                long j38 = ((long) iArr2[9]) & f206874M;
                long j39 = ((long) iArr2[10]) & f206874M;
                long j40 = j32 + (j37 * j);
                int i11 = (int) j40;
                iArr2[5] = (i11 << 1) | i10;
                int i12 = i11 >>> 31;
                long j41 = j34 + (j40 >>> 32) + (j37 * j6);
                long j42 = j36 + (j41 >>> 32) + (j37 * j10);
                long j43 = j41 & f206874M;
                long j44 = j35 + (j42 >>> 32) + (j37 * j17);
                long j45 = j42 & f206874M;
                long j46 = j38 + (j44 >>> 32) + (j37 * j26);
                long j47 = j44 & f206874M;
                long j48 = j39 + (j46 >>> 32);
                long j49 = j46 & f206874M;
                long j50 = ((long) iArr[6]) & f206874M;
                long j51 = ((long) iArr2[11]) & f206874M;
                long j52 = ((long) iArr2[12]) & f206874M;
                long j53 = j43 + (j50 * j);
                int i13 = (int) j53;
                iArr2[6] = (i13 << 1) | i12;
                int i14 = i13 >>> 31;
                long j54 = j45 + (j53 >>> 32) + (j50 * j6);
                long j55 = j47 + (j54 >>> 32) + (j50 * j10);
                long j56 = j49 + (j55 >>> 32) + (j50 * j17);
                long j57 = j48 + (j56 >>> 32) + (j50 * j26);
                long j58 = j51 + (j57 >>> 32) + (j50 * j37);
                long j59 = j52 + (j58 >>> 32);
                int i15 = (int) j54;
                iArr2[7] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j55;
                iArr2[8] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) j56;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = (int) j57;
                iArr2[10] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j58;
                iArr2[11] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j59;
                iArr2[12] = i23 | (i24 << 1);
                iArr2[13] = ((iArr2[13] + ((int) (j59 >> 32))) << 1) | (i24 >>> 31);
                return;
            }
            i3 = i4;
        }
    }
}
