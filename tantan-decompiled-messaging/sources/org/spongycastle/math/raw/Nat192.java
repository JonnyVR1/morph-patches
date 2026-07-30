package org.spongycastle.math.raw;

import java.math.BigInteger;
import org.spongycastle.util.Pack;
import p149l.x9g0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Nat192 {

    /* JADX INFO: renamed from: M */
    private static final long f206873M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f206873M) + (((long) iArr2[0]) & f206873M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f206873M) + (((long) iArr2[1]) & f206873M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f206873M) + (((long) iArr2[2]) & f206873M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f206873M) + (((long) iArr2[3]) & f206873M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f206873M) + (((long) iArr2[4]) & f206873M);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & f206873M) + (((long) iArr2[5]) & f206873M);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f206873M) + (((long) iArr2[0]) & f206873M) + (((long) iArr3[0]) & f206873M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f206873M) + (((long) iArr2[1]) & f206873M) + (((long) iArr3[1]) & f206873M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f206873M) + (((long) iArr2[2]) & f206873M) + (((long) iArr3[2]) & f206873M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f206873M) + (((long) iArr2[3]) & f206873M) + (((long) iArr3[3]) & f206873M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f206873M) + (((long) iArr2[4]) & f206873M) + (((long) iArr3[4]) & f206873M);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & f206873M) + (((long) iArr2[5]) & f206873M) + (((long) iArr3[5]) & f206873M);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (((long) i3) & f206873M) + (((long) iArr[i]) & f206873M) + (((long) iArr2[i2]) & f206873M);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & f206873M) + (((long) iArr2[i4]) & f206873M);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & f206873M) + (((long) iArr2[i5]) & f206873M);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & f206873M) + (((long) iArr2[i6]) & f206873M);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & f206873M) + (((long) iArr2[i7]) & f206873M);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & f206873M) + (f206873M & ((long) iArr2[i8]));
        iArr2[i8] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr[i]) & f206873M) + (((long) iArr2[i2]) & f206873M);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i4]) & f206873M) + (((long) iArr2[i5]) & f206873M);
        int i6 = (int) j2;
        iArr[i4] = i6;
        iArr2[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i7]) & f206873M) + (((long) iArr2[i8]) & f206873M);
        int i9 = (int) j3;
        iArr[i7] = i9;
        iArr2[i8] = i9;
        int i10 = i + 3;
        int i11 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i10]) & f206873M) + (((long) iArr2[i11]) & f206873M);
        int i12 = (int) j4;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        int i13 = i + 4;
        int i14 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i13]) & f206873M) + (((long) iArr2[i14]) & f206873M);
        int i15 = (int) j5;
        iArr[i13] = i15;
        iArr2[i14] = i15;
        int i16 = i + 5;
        int i17 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i16]) & f206873M) + (f206873M & ((long) iArr2[i17]));
        int i18 = (int) j6;
        iArr[i16] = i18;
        iArr2[i17] = i18;
        return (int) (j6 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static int[] create() {
        return new int[6];
    }

    public static long[] create64() {
        return new long[3];
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
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
    public static boolean m221229eq(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
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

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            x9g0.m207497a();
            return null;
        }
        long[] jArrCreate64 = create64();
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArrCreate64[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArrCreate64;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 6) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 5; i3 >= 0; i3--) {
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
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & f206873M;
        long j2 = ((long) iArr2[i2 + 1]) & f206873M;
        long j3 = ((long) iArr2[i2 + 2]) & f206873M;
        long j4 = ((long) iArr2[i2 + 3]) & f206873M;
        long j5 = ((long) iArr2[i2 + 4]) & f206873M;
        long j6 = ((long) iArr2[i2 + 5]) & f206873M;
        long j7 = ((long) iArr[i]) & f206873M;
        long j8 = j7 * j;
        iArr3[i3] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j2);
        iArr3[i3 + 1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j3);
        iArr3[i3 + 2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j4);
        iArr3[i3 + 3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j5);
        iArr3[i3 + 4] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j6);
        iArr3[i3 + 5] = (int) j13;
        iArr3[i3 + 6] = (int) (j13 >>> 32);
        int i4 = 1;
        int i5 = i3;
        while (i4 < 6) {
            int i6 = i5 + 1;
            long j14 = ((long) iArr[i + i4]) & f206873M;
            int i7 = i5;
            long j15 = (j14 * j) + (((long) iArr3[i6]) & f206873M);
            iArr3[i6] = (int) j15;
            int i8 = i7 + 2;
            long j16 = (j15 >>> 32) + (j14 * j2) + (((long) iArr3[i8]) & f206873M);
            iArr3[i8] = (int) j16;
            int i9 = i7 + 3;
            long j17 = (j16 >>> 32) + (j14 * j3) + (((long) iArr3[i9]) & f206873M);
            iArr3[i9] = (int) j17;
            int i10 = i7 + 4;
            long j18 = (j17 >>> 32) + (j14 * j4) + (((long) iArr3[i10]) & f206873M);
            iArr3[i10] = (int) j18;
            int i11 = i7 + 5;
            long j19 = (j18 >>> 32) + (j14 * j5) + (((long) iArr3[i11]) & f206873M);
            iArr3[i11] = (int) j19;
            int i12 = i7 + 6;
            long j20 = (j19 >>> 32) + (j14 * j6) + (((long) iArr3[i12]) & f206873M);
            iArr3[i12] = (int) j20;
            iArr3[i7 + 7] = (int) (j20 >>> 32);
            i4++;
            i5 = i6;
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = ((long) i) & f206873M;
        long j2 = ((long) iArr[i2]) & f206873M;
        long j3 = (j * j2) + (((long) iArr2[i3]) & f206873M);
        iArr3[i4] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & f206873M;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (((long) iArr2[i3 + 1]) & f206873M);
        iArr3[i4 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = ((long) iArr[i2 + 2]) & f206873M;
        long j8 = j6 + (j * j7) + j4 + (((long) iArr2[i3 + 2]) & f206873M);
        iArr3[i4 + 2] = (int) j8;
        long j9 = ((long) iArr[i2 + 3]) & f206873M;
        long j10 = (j8 >>> 32) + (j * j9) + j7 + (((long) iArr2[i3 + 3]) & f206873M);
        iArr3[i4 + 3] = (int) j10;
        long j11 = ((long) iArr[i2 + 4]) & f206873M;
        long j12 = (j10 >>> 32) + (j * j11) + j9 + (((long) iArr2[i3 + 4]) & f206873M);
        iArr3[i4 + 4] = (int) j12;
        long j13 = ((long) iArr[i2 + 5]) & f206873M;
        long j14 = (j12 >>> 32) + (j * j13) + j11 + (f206873M & ((long) iArr2[i3 + 5]));
        iArr3[i4 + 5] = (int) j14;
        return (j14 >>> 32) + j13;
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & f206873M;
        long j3 = j & f206873M;
        long j4 = (j2 * j3) + (((long) iArr[i2]) & f206873M);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        int i3 = i2 + 1;
        long j7 = (j4 >>> 32) + j6 + (((long) iArr[i3]) & f206873M);
        iArr[i3] = (int) j7;
        int i4 = i2 + 2;
        long j8 = (j7 >>> 32) + j5 + (((long) iArr[i4]) & f206873M);
        iArr[i4] = (int) j8;
        long j9 = j8 >>> 32;
        int i5 = i2 + 3;
        long j10 = j9 + (((long) iArr[i5]) & f206873M);
        iArr[i5] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i2, 4);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = ((long) i) & f206873M;
        long j2 = ((long) i2) & f206873M;
        long j3 = (j * j2) + (((long) iArr[i3]) & f206873M);
        iArr[i3] = (int) j3;
        int i4 = i3 + 1;
        long j4 = (j3 >>> 32) + j2 + (((long) iArr[i4]) & f206873M);
        iArr[i4] = (int) j4;
        long j5 = j4 >>> 32;
        int i5 = i3 + 2;
        long j6 = j5 + (((long) iArr[i5]) & f206873M);
        iArr[i5] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & f206873M;
        long j2 = ((long) iArr2[i2 + 1]) & f206873M;
        long j3 = ((long) iArr2[i2 + 2]) & f206873M;
        long j4 = ((long) iArr2[i2 + 3]) & f206873M;
        long j5 = ((long) iArr2[i2 + 4]) & f206873M;
        long j6 = ((long) iArr2[i2 + 5]) & f206873M;
        long j7 = 0;
        int i4 = 0;
        int i5 = i3;
        while (i4 < 6) {
            long j8 = ((long) iArr[i + i4]) & f206873M;
            long j9 = (j8 * j) + (((long) iArr3[i5]) & f206873M);
            long j10 = j2;
            iArr3[i5] = (int) j9;
            int i6 = i5 + 1;
            long j11 = (j9 >>> 32) + (j8 * j10) + (((long) iArr3[i6]) & f206873M);
            iArr3[i6] = (int) j11;
            int i7 = i5 + 2;
            long j12 = (j11 >>> 32) + (j8 * j3) + (((long) iArr3[i7]) & f206873M);
            iArr3[i7] = (int) j12;
            int i8 = i5 + 3;
            long j13 = (j12 >>> 32) + (j8 * j4) + (((long) iArr3[i8]) & f206873M);
            iArr3[i8] = (int) j13;
            int i9 = i5 + 4;
            long j14 = (j13 >>> 32) + (j8 * j5) + (((long) iArr3[i9]) & f206873M);
            iArr3[i9] = (int) j14;
            int i10 = i5 + 5;
            long j15 = (j14 >>> 32) + (j8 * j6) + (((long) iArr3[i10]) & f206873M);
            iArr3[i10] = (int) j15;
            int i11 = i5 + 6;
            long j16 = (j15 >>> 32) + j7 + (((long) iArr3[i11]) & f206873M);
            iArr3[i11] = (int) j16;
            j7 = j16 >>> 32;
            i4++;
            i5 = i6;
            j2 = j10;
        }
        return (int) j7;
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = ((long) i) & f206873M;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = j2 + ((((long) iArr[i3]) & f206873M) * j);
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 6);
        return (int) j2;
    }

    public static int mulWordAddExt(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = ((long) i) & f206873M;
        long j2 = ((((long) iArr[i2]) & f206873M) * j) + (((long) iArr2[i3]) & f206873M);
        iArr2[i3] = (int) j2;
        int i4 = i3 + 1;
        long j3 = (j2 >>> 32) + ((((long) iArr[i2 + 1]) & f206873M) * j) + (((long) iArr2[i4]) & f206873M);
        iArr2[i4] = (int) j3;
        int i5 = i3 + 2;
        long j4 = (j3 >>> 32) + ((((long) iArr[i2 + 2]) & f206873M) * j) + (((long) iArr2[i5]) & f206873M);
        iArr2[i5] = (int) j4;
        int i6 = i3 + 3;
        long j5 = (j4 >>> 32) + ((((long) iArr[i2 + 3]) & f206873M) * j) + (((long) iArr2[i6]) & f206873M);
        iArr2[i6] = (int) j5;
        int i7 = i3 + 4;
        long j6 = (j5 >>> 32) + ((((long) iArr[i2 + 4]) & f206873M) * j) + (((long) iArr2[i7]) & f206873M);
        iArr2[i7] = (int) j6;
        int i8 = i3 + 5;
        long j7 = (j6 >>> 32) + (j * (((long) iArr[i2 + 5]) & f206873M)) + (((long) iArr2[i8]) & f206873M);
        iArr2[i8] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & f206873M;
        long j3 = ((j & f206873M) * j2) + (((long) iArr[i2]) & f206873M);
        iArr[i2] = (int) j3;
        long j4 = j2 * (j >>> 32);
        int i3 = i2 + 1;
        long j5 = (j3 >>> 32) + j4 + (((long) iArr[i3]) & f206873M);
        iArr[i3] = (int) j5;
        int i4 = i2 + 2;
        long j6 = (j5 >>> 32) + (((long) iArr[i4]) & f206873M);
        iArr[i4] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i2, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i]) & f206873M;
        int i3 = 0;
        int i4 = 12;
        int i5 = 5;
        while (true) {
            int i6 = i5 - 1;
            long j2 = ((long) iArr[i + i5]) & f206873M;
            long j3 = j2 * j2;
            iArr2[i2 + (i4 - 1)] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 -= 2;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i3 << 31)) & f206873M);
                iArr2[i2] = (int) j4;
                int i7 = ((int) (j4 >>> 32)) & 1;
                long j6 = ((long) iArr[i + 1]) & f206873M;
                int i8 = i2 + 2;
                long j7 = ((long) iArr2[i8]) & f206873M;
                long j8 = j5 + (j6 * j);
                int i9 = (int) j8;
                iArr2[i2 + 1] = (i9 << 1) | i7;
                int i10 = i9 >>> 31;
                long j9 = j7 + (j8 >>> 32);
                long j10 = ((long) iArr[i + 2]) & f206873M;
                int i11 = i2 + 3;
                long j11 = ((long) iArr2[i11]) & f206873M;
                int i12 = i2 + 4;
                long j12 = ((long) iArr2[i12]) & f206873M;
                long j13 = j9 + (j10 * j);
                int i13 = (int) j13;
                iArr2[i8] = (i13 << 1) | i10;
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = j12 + (j14 >>> 32);
                long j16 = j14 & f206873M;
                long j17 = ((long) iArr[i + 3]) & f206873M;
                int i14 = i2 + 5;
                long j18 = ((long) iArr2[i14]) & f206873M;
                int i15 = i2 + 6;
                long j19 = ((long) iArr2[i15]) & f206873M;
                long j20 = j16 + (j17 * j);
                int i16 = (int) j20;
                iArr2[i11] = (i16 << 1) | (i13 >>> 31);
                int i17 = i16 >>> 31;
                long j21 = j15 + (j20 >>> 32) + (j17 * j6);
                long j22 = j18 + (j21 >>> 32) + (j17 * j10);
                long j23 = j21 & f206873M;
                long j24 = j19 + (j22 >>> 32);
                long j25 = j22 & f206873M;
                long j26 = ((long) iArr[i + 4]) & f206873M;
                int i18 = i2 + 7;
                long j27 = ((long) iArr2[i18]) & f206873M;
                int i19 = i2 + 8;
                long j28 = ((long) iArr2[i19]) & f206873M;
                long j29 = j23 + (j26 * j);
                int i20 = (int) j29;
                iArr2[i12] = (i20 << 1) | i17;
                int i21 = i20 >>> 31;
                long j30 = j25 + (j29 >>> 32) + (j26 * j6);
                long j31 = j24 + (j30 >>> 32) + (j26 * j10);
                long j32 = j30 & f206873M;
                long j33 = j27 + (j31 >>> 32) + (j26 * j17);
                long j34 = j31 & f206873M;
                long j35 = j28 + (j33 >>> 32);
                long j36 = j33 & f206873M;
                long j37 = ((long) iArr[i + 5]) & f206873M;
                int i22 = i2 + 9;
                long j38 = ((long) iArr2[i22]) & f206873M;
                int i23 = i2 + 10;
                long j39 = ((long) iArr2[i23]) & f206873M;
                long j40 = j32 + (j37 * j);
                int i24 = (int) j40;
                iArr2[i14] = (i24 << 1) | i21;
                long j41 = j34 + (j40 >>> 32) + (j6 * j37);
                long j42 = j36 + (j41 >>> 32) + (j37 * j10);
                long j43 = j35 + (j42 >>> 32) + (j37 * j17);
                long j44 = j38 + (j43 >>> 32) + (j37 * j26);
                long j45 = j39 + (j44 >>> 32);
                int i25 = (int) j41;
                iArr2[i15] = (i24 >>> 31) | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j42;
                iArr2[i18] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j43;
                iArr2[i19] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j44;
                iArr2[i22] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) j45;
                iArr2[i23] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = i2 + 11;
                iArr2[i35] = i34 | ((iArr2[i35] + ((int) (j45 >> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & f206873M) - (((long) iArr2[i2]) & f206873M);
        iArr3[i3] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[i + 1]) & f206873M) - (((long) iArr2[i2 + 1]) & f206873M));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 2]) & f206873M) - (((long) iArr2[i2 + 2]) & f206873M));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 3]) & f206873M) - (((long) iArr2[i2 + 3]) & f206873M));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[i + 4]) & f206873M) - (((long) iArr2[i2 + 4]) & f206873M));
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[i + 5]) & f206873M) - (((long) iArr2[i2 + 5]) & f206873M));
        iArr3[i3 + 5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr3[0]) & f206873M) - (((long) iArr[0]) & f206873M)) - (((long) iArr2[0]) & f206873M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + (((((long) iArr3[1]) & f206873M) - (((long) iArr[1]) & f206873M)) - (((long) iArr2[1]) & f206873M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + (((((long) iArr3[2]) & f206873M) - (((long) iArr[2]) & f206873M)) - (((long) iArr2[2]) & f206873M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + (((((long) iArr3[3]) & f206873M) - (((long) iArr[3]) & f206873M)) - (((long) iArr2[3]) & f206873M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + (((((long) iArr3[4]) & f206873M) - (((long) iArr[4]) & f206873M)) - (((long) iArr2[4]) & f206873M));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + (((((long) iArr3[5]) & f206873M) - (((long) iArr[5]) & f206873M)) - (((long) iArr2[5]) & f206873M));
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr2[i2]) & f206873M) - (((long) iArr[i]) & f206873M);
        iArr2[i2] = (int) j;
        int i3 = i2 + 1;
        long j2 = (j >> 32) + ((((long) iArr2[i3]) & f206873M) - (((long) iArr[i + 1]) & f206873M));
        iArr2[i3] = (int) j2;
        int i4 = i2 + 2;
        long j3 = (j2 >> 32) + ((((long) iArr2[i4]) & f206873M) - (((long) iArr[i + 2]) & f206873M));
        iArr2[i4] = (int) j3;
        int i5 = i2 + 3;
        long j4 = (j3 >> 32) + ((((long) iArr2[i5]) & f206873M) - (((long) iArr[i + 3]) & f206873M));
        iArr2[i5] = (int) j4;
        int i6 = i2 + 4;
        long j5 = (j4 >> 32) + ((((long) iArr2[i6]) & f206873M) - (((long) iArr[i + 4]) & f206873M));
        iArr2[i6] = (int) j5;
        int i7 = i2 + 5;
        long j6 = (j5 >> 32) + ((((long) iArr2[i7]) & f206873M) - (((long) iArr[i + 5]) & f206873M));
        iArr2[i7] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (2 - i) << 3);
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
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
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
        long j = (((long) iArr2[0]) & f206873M) - (((long) iArr[0]) & f206873M);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & f206873M) - (((long) iArr[1]) & f206873M));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & f206873M) - (((long) iArr[2]) & f206873M));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & f206873M) - (((long) iArr[3]) & f206873M));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & f206873M) - (((long) iArr[4]) & f206873M));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & f206873M) - (f206873M & ((long) iArr[5])));
        iArr2[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[0]) & f206873M) + (((long) iArr2[0]) & f206873M);
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f206873M) + (((long) iArr2[1]) & f206873M);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f206873M) + (((long) iArr2[2]) & f206873M);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f206873M) + (((long) iArr2[3]) & f206873M);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f206873M) + (((long) iArr2[4]) & f206873M);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & f206873M) + (f206873M & ((long) iArr2[5]));
        iArr2[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f206873M) - (((long) iArr2[0]) & f206873M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & f206873M) - (((long) iArr2[1]) & f206873M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & f206873M) - (((long) iArr2[2]) & f206873M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & f206873M) - (((long) iArr2[3]) & f206873M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & f206873M) - (((long) iArr2[4]) & f206873M));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[5]) & f206873M) - (((long) iArr2[5]) & f206873M));
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = ((long) iArr2[0]) & f206873M;
        long j2 = ((long) iArr2[1]) & f206873M;
        long j3 = ((long) iArr2[2]) & f206873M;
        long j4 = ((long) iArr2[3]) & f206873M;
        long j5 = ((long) iArr2[4]) & f206873M;
        long j6 = ((long) iArr2[5]) & f206873M;
        long j7 = 0;
        while (i < 6) {
            long j8 = j;
            int i2 = i;
            long j9 = ((long) iArr[i]) & f206873M;
            long j10 = (((long) iArr3[i2]) & f206873M) + (j9 * j8);
            iArr3[i2] = (int) j10;
            int i3 = i2 + 1;
            long j11 = (j10 >>> 32) + (j9 * j2) + (((long) iArr3[i3]) & f206873M);
            iArr3[i3] = (int) j11;
            int i4 = i2 + 2;
            long j12 = (j11 >>> 32) + (j9 * j3) + (((long) iArr3[i4]) & f206873M);
            iArr3[i4] = (int) j12;
            int i5 = i2 + 3;
            long j13 = (j12 >>> 32) + (j9 * j4) + (((long) iArr3[i5]) & f206873M);
            iArr3[i5] = (int) j13;
            int i6 = i2 + 4;
            long j14 = (j13 >>> 32) + (j9 * j5) + (((long) iArr3[i6]) & f206873M);
            iArr3[i6] = (int) j14;
            int i7 = i2 + 5;
            long j15 = (j14 >>> 32) + (j9 * j6) + (((long) iArr3[i7]) & f206873M);
            iArr3[i7] = (int) j15;
            int i8 = i2 + 6;
            long j16 = (j15 >>> 32) + j7 + (((long) iArr3[i8]) & f206873M);
            iArr3[i8] = (int) j16;
            j7 = j16 >>> 32;
            i = i3;
            j = j8;
        }
        return (int) j7;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & f206873M;
        long j2 = ((long) iArr2[1]) & f206873M;
        long j3 = ((long) iArr2[2]) & f206873M;
        long j4 = ((long) iArr2[3]) & f206873M;
        long j5 = ((long) iArr2[4]) & f206873M;
        long j6 = ((long) iArr2[5]) & f206873M;
        int i = 1;
        long j7 = ((long) iArr[0]) & f206873M;
        long j8 = j7 * j;
        iArr3[0] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j2);
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j3);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j4);
        iArr3[3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j5);
        iArr3[4] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j6);
        iArr3[5] = (int) j13;
        int i2 = 6;
        iArr3[6] = (int) (j13 >>> 32);
        while (true) {
            int i3 = i;
            if (i3 >= i2) {
                return;
            }
            long j14 = ((long) iArr[i3]) & f206873M;
            long j15 = (j14 * j) + (((long) iArr3[i3]) & f206873M);
            iArr3[i3] = (int) j15;
            i = i3 + 1;
            long j16 = j5;
            long j17 = (j15 >>> 32) + (j14 * j2) + (((long) iArr3[i]) & f206873M);
            iArr3[i] = (int) j17;
            int i4 = i3 + 2;
            long j18 = (j17 >>> 32) + (j14 * j3) + (((long) iArr3[i4]) & f206873M);
            iArr3[i4] = (int) j18;
            int i5 = i3 + 3;
            long j19 = (j18 >>> 32) + (j14 * j4) + (((long) iArr3[i5]) & f206873M);
            iArr3[i5] = (int) j19;
            int i6 = i3 + 4;
            long j20 = (j19 >>> 32) + (j14 * j16) + (((long) iArr3[i6]) & f206873M);
            iArr3[i6] = (int) j20;
            int i7 = i3 + 5;
            long j21 = (j20 >>> 32) + (j14 * j6) + (((long) iArr3[i7]) & f206873M);
            iArr3[i7] = (int) j21;
            iArr3[i3 + 6] = (int) (j21 >>> 32);
            j5 = j16;
            i2 = 6;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & f206873M;
        int i = 12;
        int i2 = 0;
        int i3 = 5;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & f206873M;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i2 << 31)) & f206873M);
                iArr2[0] = (int) j4;
                long j6 = ((long) iArr[1]) & f206873M;
                long j7 = ((long) iArr2[2]) & f206873M;
                long j8 = j5 + (j6 * j);
                int i5 = (int) j8;
                iArr2[1] = (i5 << 1) | (((int) (j4 >>> 32)) & 1);
                long j9 = j7 + (j8 >>> 32);
                long j10 = ((long) iArr[2]) & f206873M;
                long j11 = ((long) iArr2[3]) & f206873M;
                long j12 = ((long) iArr2[4]) & f206873M;
                long j13 = j9 + (j10 * j);
                int i6 = (int) j13;
                iArr2[2] = (i6 << 1) | (i5 >>> 31);
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = j12 + (j14 >>> 32);
                long j16 = j14 & f206873M;
                long j17 = ((long) iArr[3]) & f206873M;
                long j18 = ((long) iArr2[5]) & f206873M;
                long j19 = ((long) iArr2[6]) & f206873M;
                long j20 = j16 + (j17 * j);
                int i7 = (int) j20;
                iArr2[3] = (i7 << 1) | (i6 >>> 31);
                int i8 = i7 >>> 31;
                long j21 = j15 + (j20 >>> 32) + (j17 * j6);
                long j22 = j18 + (j21 >>> 32) + (j17 * j10);
                long j23 = j21 & f206873M;
                long j24 = j19 + (j22 >>> 32);
                long j25 = j22 & f206873M;
                long j26 = ((long) iArr[4]) & f206873M;
                long j27 = ((long) iArr2[7]) & f206873M;
                long j28 = ((long) iArr2[8]) & f206873M;
                long j29 = j23 + (j26 * j);
                int i9 = (int) j29;
                iArr2[4] = (i9 << 1) | i8;
                int i10 = i9 >>> 31;
                long j30 = j25 + (j29 >>> 32) + (j26 * j6);
                long j31 = j24 + (j30 >>> 32) + (j26 * j10);
                long j32 = j30 & f206873M;
                long j33 = j27 + (j31 >>> 32) + (j26 * j17);
                long j34 = j31 & f206873M;
                long j35 = j28 + (j33 >>> 32);
                long j36 = j33 & f206873M;
                long j37 = ((long) iArr[5]) & f206873M;
                long j38 = ((long) iArr2[9]) & f206873M;
                long j39 = ((long) iArr2[10]) & f206873M;
                long j40 = j32 + (j37 * j);
                int i11 = (int) j40;
                iArr2[5] = (i11 << 1) | i10;
                long j41 = j34 + (j40 >>> 32) + (j37 * j6);
                long j42 = j36 + (j41 >>> 32) + (j10 * j37);
                long j43 = j35 + (j42 >>> 32) + (j37 * j17);
                long j44 = j38 + (j43 >>> 32) + (j26 * j37);
                long j45 = j39 + (j44 >>> 32);
                int i12 = (int) j41;
                iArr2[6] = (i11 >>> 31) | (i12 << 1);
                int i13 = (int) j42;
                iArr2[7] = (i12 >>> 31) | (i13 << 1);
                int i14 = (int) j43;
                iArr2[8] = (i13 >>> 31) | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) j44;
                iArr2[9] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) j45;
                iArr2[10] = i17 | (i18 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j45 >> 32))) << 1) | (i18 >>> 31);
                return;
            }
            i3 = i4;
        }
    }
}
