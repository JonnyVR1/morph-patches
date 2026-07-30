package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat256;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP256R1Field {

    /* JADX INFO: renamed from: M */
    private static final long f10467M = 4294967295L;

    /* JADX INFO: renamed from: P7 */
    private static final int f10469P7 = -1;
    private static final int PExt15 = -1;

    /* JADX INFO: renamed from: P */
    static final int[] f10468P = {-1, -1, -1, 0, 0, 0, 1, -1};
    static final int[] PExt = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && Nat256.gte(iArr3, f10468P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(16, iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, f10468P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j = (((long) iArr[0]) & f10467M) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & f10467M);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & f10467M);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + ((((long) iArr[3]) & f10467M) - 1);
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & f10467M);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & f10467M);
            iArr[5] = (int) j8;
            j6 = j8 >> 32;
        }
        long j9 = j6 + ((((long) iArr[6]) & f10467M) - 1);
        iArr[6] = (int) j9;
        iArr[7] = (int) ((j9 >> 32) + (f10467M & ((long) iArr[7])) + 1);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat256.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[7] == -1) {
            int[] iArr = f10468P;
            if (Nat256.gte(iArrFromBigInteger, iArr)) {
                Nat256.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(8, iArr2, Nat256.add(iArr, f10468P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat256.isZero(iArr)) {
            Nat256.zero(iArr2);
        } else {
            Nat256.sub(f10468P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[8]) & f10467M;
        long j2 = ((long) iArr[9]) & f10467M;
        long j3 = ((long) iArr[10]) & f10467M;
        long j4 = ((long) iArr[11]) & f10467M;
        long j5 = ((long) iArr[12]) & f10467M;
        long j6 = ((long) iArr[13]) & f10467M;
        long j7 = ((long) iArr[14]) & f10467M;
        long j8 = ((long) iArr[15]) & f10467M;
        long j9 = j - 6;
        long j10 = j9 + j2;
        long j11 = j2 + j3;
        long j12 = (j3 + j4) - j8;
        long j13 = j4 + j5;
        long j14 = j5 + j6;
        long j15 = j6 + j7;
        long j16 = j7 + j8;
        long j17 = (((((long) iArr[0]) & f10467M) + j10) - j13) - j15;
        iArr2[0] = (int) j17;
        long j18 = (j17 >> 32) + ((((((long) iArr[1]) & f10467M) + j11) - j14) - j16);
        iArr2[1] = (int) j18;
        long j19 = (j18 >> 32) + (((((long) iArr[2]) & f10467M) + j12) - j15);
        iArr2[2] = (int) j19;
        long j20 = (j19 >> 32) + (((((((long) iArr[3]) & f10467M) + (j13 << 1)) + j6) - j8) - j10);
        iArr2[3] = (int) j20;
        long j21 = (j20 >> 32) + ((((((long) iArr[4]) & f10467M) + (j14 << 1)) + j7) - j11);
        iArr2[4] = (int) j21;
        long j22 = (j21 >> 32) + (((((long) iArr[5]) & f10467M) + (j15 << 1)) - j12);
        iArr2[5] = (int) j22;
        long j23 = (j22 >> 32) + ((((((long) iArr[6]) & f10467M) + (j16 << 1)) + j15) - j10);
        iArr2[6] = (int) j23;
        long j24 = (j23 >> 32) + (((((((long) iArr[7]) & f10467M) + (j8 << 1)) + j9) - j12) - j14);
        iArr2[7] = (int) j24;
        reduce32((int) ((j24 >> 32) + 6), iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & f10467M;
            long j3 = (((long) iArr[0]) & f10467M) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & f10467M);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & f10467M);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = j4 + ((((long) iArr[3]) & f10467M) - j2);
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & f10467M);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & f10467M);
                iArr[5] = (int) j10;
                j8 = j10 >> 32;
            }
            long j11 = j8 + ((((long) iArr[6]) & f10467M) - j2);
            iArr[6] = (int) j11;
            long j12 = (j11 >> 32) + (f10467M & ((long) iArr[7])) + j2;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || (iArr[7] == -1 && Nat256.gte(iArr, f10468P))) {
            addPInvTo(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            Nat256.square(iArr2, iArrCreateExt);
            reduce(iArrCreateExt, iArr2);
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j = (((long) iArr[0]) & f10467M) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & f10467M);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & f10467M);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + (((long) iArr[3]) & f10467M) + 1;
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & f10467M);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & f10467M);
            iArr[5] = (int) j8;
            j6 = j8 >> 32;
        }
        long j9 = j6 + (((long) iArr[6]) & f10467M) + 1;
        iArr[6] = (int) j9;
        iArr[7] = (int) ((j9 >> 32) + ((f10467M & ((long) iArr[7])) - 1));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            Nat.addTo(16, PExt, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, f10468P))) {
            addPInvTo(iArr2);
        }
    }
}
