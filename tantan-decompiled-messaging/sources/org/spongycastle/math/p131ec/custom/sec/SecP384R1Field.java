package org.spongycastle.math.p131ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat384;

/* JADX INFO: loaded from: classes3.dex */
public class SecP384R1Field {

    /* JADX INFO: renamed from: M */
    private static final long f206848M = 4294967295L;
    private static final int P11 = -1;
    private static final int PExt23 = -1;

    /* JADX INFO: renamed from: P */
    static final int[] f206849P = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    static final int[] PExt = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, f206849P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && Nat.gte(24, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, f206849P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j = (((long) iArr[0]) & f206848M) + 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & f206848M) - 1);
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[2]) & f206848M);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + (((long) iArr[3]) & f206848M) + 1;
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + (f206848M & ((long) iArr[4])) + 1;
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            Nat.incAt(12, iArr, 5);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat.fromBigInteger(384, bigInteger);
        if (iArrFromBigInteger[11] == -1) {
            int[] iArr = f206849P;
            if (Nat.gte(12, iArrFromBigInteger, iArr)) {
                Nat.subFrom(12, iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(12, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(12, iArr2, Nat.add(12, iArr, f206849P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = Nat.create(24);
        Nat384.mul(iArr, iArr2, iArrCreate);
        reduce(iArrCreate, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat.isZero(12, iArr)) {
            Nat.zero(12, iArr2);
        } else {
            Nat.sub(12, f206849P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[16]) & f206848M;
        long j2 = ((long) iArr[17]) & f206848M;
        long j3 = ((long) iArr[18]) & f206848M;
        long j4 = ((long) iArr[19]) & f206848M;
        long j5 = ((long) iArr[20]) & f206848M;
        long j6 = ((long) iArr[21]) & f206848M;
        long j7 = ((long) iArr[22]) & f206848M;
        long j8 = ((long) iArr[23]) & f206848M;
        long j9 = ((((long) iArr[12]) & f206848M) + j5) - 1;
        long j10 = (((long) iArr[13]) & f206848M) + j7;
        long j11 = (((long) iArr[14]) & f206848M) + j7 + j8;
        long j12 = (((long) iArr[15]) & f206848M) + j8;
        long j13 = j2 + j6;
        long j14 = j6 - j8;
        long j15 = j7 - j8;
        long j16 = (((long) iArr[0]) & f206848M) + j9 + j14;
        iArr2[0] = (int) j16;
        long j17 = (j16 >> 32) + (((((long) iArr[1]) & f206848M) + j8) - j9) + j10;
        iArr2[1] = (int) j17;
        long j18 = (j17 >> 32) + (((((long) iArr[2]) & f206848M) - j6) - j10) + j11;
        iArr2[2] = (int) j18;
        long j19 = (j18 >> 32) + (((((long) iArr[3]) & f206848M) + j9) - j11) + j12 + j14;
        iArr2[3] = (int) j19;
        long j20 = (j19 >> 32) + ((((((((long) iArr[4]) & f206848M) + j) + j6) + j9) + j10) - j12) + j14;
        iArr2[4] = (int) j20;
        long j21 = (j20 >> 32) + ((((long) iArr[5]) & f206848M) - j) + j10 + j11 + j13;
        iArr2[5] = (int) j21;
        long j22 = (j21 >> 32) + (((((long) iArr[6]) & f206848M) + j3) - j2) + j11 + j12;
        iArr2[6] = (int) j22;
        long j23 = (j22 >> 32) + ((((((long) iArr[7]) & f206848M) + j) + j4) - j3) + j12;
        iArr2[7] = (int) j23;
        long j24 = (j23 >> 32) + (((((((long) iArr[8]) & f206848M) + j) + j2) + j5) - j4);
        iArr2[8] = (int) j24;
        long j25 = (j24 >> 32) + (((((long) iArr[9]) & f206848M) + j3) - j5) + j13;
        iArr2[9] = (int) j25;
        long j26 = (j25 >> 32) + ((((((long) iArr[10]) & f206848M) + j3) + j4) - j14) + j15;
        iArr2[10] = (int) j26;
        long j27 = (j26 >> 32) + ((((((long) iArr[11]) & f206848M) + j4) + j5) - j15);
        iArr2[11] = (int) j27;
        reduce32((int) ((j27 >> 32) + 1), iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & f206848M;
            long j3 = (((long) iArr[0]) & f206848M) + j2;
            iArr[0] = (int) j3;
            long j4 = (j3 >> 32) + ((((long) iArr[1]) & f206848M) - j2);
            iArr[1] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (((long) iArr[2]) & f206848M);
                iArr[2] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = j5 + (((long) iArr[3]) & f206848M) + j2;
            iArr[3] = (int) j7;
            long j8 = (j7 >> 32) + (f206848M & ((long) iArr[4])) + j2;
            iArr[4] = (int) j8;
            j = j8 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || Nat.incAt(12, iArr, 5) == 0) && !(iArr[11] == -1 && Nat.gte(12, iArr, f206849P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreate = Nat.create(24);
        Nat384.square(iArr, iArrCreate);
        reduce(iArrCreate, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] iArrCreate = Nat.create(24);
        Nat384.square(iArr, iArrCreate);
        reduce(iArrCreate, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            Nat384.square(iArr2, iArrCreate);
            reduce(iArrCreate, iArr2);
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j = (((long) iArr[0]) & f206848M) - 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + (((long) iArr[1]) & f206848M) + 1;
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[2]) & f206848M);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + ((((long) iArr[3]) & f206848M) - 1);
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + ((f206848M & ((long) iArr[4])) - 1);
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            Nat.decAt(12, iArr, 5);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(24, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, f206849P))) {
            addPInvTo(iArr2);
        }
    }
}
