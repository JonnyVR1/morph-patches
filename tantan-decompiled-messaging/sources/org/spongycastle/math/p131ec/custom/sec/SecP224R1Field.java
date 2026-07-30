package org.spongycastle.math.p131ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat224;

/* JADX INFO: loaded from: classes3.dex */
public class SecP224R1Field {

    /* JADX INFO: renamed from: M */
    private static final long f206831M = 4294967295L;

    /* JADX INFO: renamed from: P6 */
    private static final int f206833P6 = -1;
    private static final int PExt13 = -1;

    /* JADX INFO: renamed from: P */
    static final int[] f206832P = {1, 0, 0, -1, -1, -1, -1};
    static final int[] PExt = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.add(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && Nat224.gte(iArr3, f206832P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, f206832P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j = (((long) iArr[0]) & f206831M) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & f206831M);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & f206831M);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + (f206831M & ((long) iArr[3])) + 1;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            Nat.incAt(7, iArr, 4);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat224.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[6] == -1) {
            int[] iArr = f206832P;
            if (Nat224.gte(iArrFromBigInteger, iArr)) {
                Nat224.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(7, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(7, iArr2, Nat224.add(iArr, f206832P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat224.isZero(iArr)) {
            Nat224.zero(iArr2);
        } else {
            Nat224.sub(f206832P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[10]) & f206831M;
        long j2 = ((long) iArr[11]) & f206831M;
        long j3 = ((long) iArr[12]) & f206831M;
        long j4 = ((long) iArr[13]) & f206831M;
        long j5 = ((((long) iArr[7]) & f206831M) + j2) - 1;
        long j6 = (((long) iArr[8]) & f206831M) + j3;
        long j7 = (((long) iArr[9]) & f206831M) + j4;
        long j8 = (((long) iArr[0]) & f206831M) - j5;
        long j9 = j8 & f206831M;
        long j10 = (j8 >> 32) + ((((long) iArr[1]) & f206831M) - j6);
        int i = (int) j10;
        iArr2[1] = i;
        long j11 = (j10 >> 32) + ((((long) iArr[2]) & f206831M) - j7);
        int i2 = (int) j11;
        iArr2[2] = i2;
        long j12 = (j11 >> 32) + (((((long) iArr[3]) & f206831M) + j5) - j);
        long j13 = j12 & f206831M;
        long j14 = (j12 >> 32) + (((((long) iArr[4]) & f206831M) + j6) - j2);
        iArr2[4] = (int) j14;
        long j15 = (j14 >> 32) + (((((long) iArr[5]) & f206831M) + j7) - j3);
        iArr2[5] = (int) j15;
        long j16 = (j15 >> 32) + (((((long) iArr[6]) & f206831M) + j) - j4);
        iArr2[6] = (int) j16;
        long j17 = (j16 >> 32) + 1;
        long j18 = j13 + j17;
        long j19 = j9 - j17;
        iArr2[0] = (int) j19;
        long j20 = j19 >> 32;
        if (j20 != 0) {
            long j21 = j20 + (((long) i) & f206831M);
            iArr2[1] = (int) j21;
            long j22 = (j21 >> 32) + (((long) i2) & f206831M);
            iArr2[2] = (int) j22;
            j18 += j22 >> 32;
        }
        iArr2[3] = (int) j18;
        if (((j18 >> 32) == 0 || Nat.incAt(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && Nat224.gte(iArr2, f206832P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & f206831M;
            long j3 = (((long) iArr[0]) & f206831M) - j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & f206831M);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & f206831M);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = j4 + (f206831M & ((long) iArr[3])) + j2;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || Nat.incAt(7, iArr, 4) == 0) && !(iArr[6] == -1 && Nat224.gte(iArr, f206832P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            Nat224.square(iArr2, iArrCreateExt);
            reduce(iArrCreateExt, iArr2);
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j = (((long) iArr[0]) & f206831M) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & f206831M);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & f206831M);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + ((f206831M & ((long) iArr[3])) - 1);
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            Nat.decAt(7, iArr, 4);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(14, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, f206832P))) {
            addPInvTo(iArr2);
        }
    }
}
