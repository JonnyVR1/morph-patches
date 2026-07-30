package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat128;
import org.spongycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes3.dex */
public class SecP128R1Field {

    /* JADX INFO: renamed from: M */
    private static final long f207719M = 4294967295L;

    /* JADX INFO: renamed from: P3 */
    private static final int f207721P3 = -3;
    private static final int PExt7 = -4;

    /* JADX INFO: renamed from: P */
    static final int[] f207720P = {-1, -1, -1, -3};
    static final int[] PExt = {1, 0, 0, 4, -2, -1, 3, -4};
    private static final int[] PExtInv = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.add(iArr, iArr2, iArr3) != 0 || (iArr3[3] == -3 && Nat128.gte(iArr3, f207720P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -4 && Nat256.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(4, iArr, iArr2) != 0 || (iArr2[3] == -3 && Nat128.gte(iArr2, f207720P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j = (((long) iArr[0]) & f207719M) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & f207719M);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & f207719M);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) (j2 + (f207719M & ((long) iArr[3])) + 2);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat128.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[3] == -3) {
            int[] iArr = f207720P;
            if (Nat128.gte(iArrFromBigInteger, iArr)) {
                Nat128.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(4, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(4, iArr2, Nat128.add(iArr, f207720P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat128.createExt();
        Nat128.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -4 && Nat256.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat128.isZero(iArr)) {
            Nat128.zero(iArr2);
        } else {
            Nat128.sub(f207720P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & f207719M;
        long j2 = ((long) iArr[1]) & f207719M;
        long j3 = ((long) iArr[2]) & f207719M;
        long j4 = ((long) iArr[3]) & f207719M;
        long j5 = ((long) iArr[4]) & f207719M;
        long j6 = ((long) iArr[5]) & f207719M;
        long j7 = ((long) iArr[6]) & f207719M;
        long j8 = ((long) iArr[7]) & f207719M;
        long j9 = j4 + j8;
        long j10 = j7 + (j8 << 1);
        long j11 = j6 + (j10 << 1);
        long j12 = j2 + j11;
        long j13 = j5 + (j11 << 1);
        long j14 = j + j13;
        iArr2[0] = (int) j14;
        long j15 = j12 + (j14 >>> 32);
        iArr2[1] = (int) j15;
        long j16 = j3 + j10 + (j15 >>> 32);
        iArr2[2] = (int) j16;
        long j17 = j9 + (j13 << 1) + (j16 >>> 32);
        iArr2[3] = (int) j17;
        reduce32((int) (j17 >>> 32), iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        while (i != 0) {
            long j = ((long) i) & f207719M;
            long j2 = (((long) iArr[0]) & f207719M) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & f207719M);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & f207719M);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = j3 + (f207719M & ((long) iArr[3])) + (j << 1);
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat128.createExt();
        Nat128.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] iArrCreateExt = Nat128.createExt();
        Nat128.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            Nat128.square(iArr2, iArrCreateExt);
            reduce(iArrCreateExt, iArr2);
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j = (((long) iArr[0]) & f207719M) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & f207719M);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & f207719M);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) (j2 + ((f207719M & ((long) iArr[3])) - 2));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            Nat.subFrom(iArr4.length, iArr4, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(4, iArr, 0, iArr2) != 0 || (iArr2[3] == -3 && Nat128.gte(iArr2, f207720P))) {
            addPInvTo(iArr2);
        }
    }
}
