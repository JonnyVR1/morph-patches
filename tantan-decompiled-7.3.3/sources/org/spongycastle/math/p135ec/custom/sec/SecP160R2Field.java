package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat160;

/* JADX INFO: loaded from: classes3.dex */
public class SecP160R2Field {

    /* JADX INFO: renamed from: P4 */
    private static final int f207733P4 = -1;
    private static final int PExt9 = -1;
    private static final int PInv33 = 21389;

    /* JADX INFO: renamed from: P */
    static final int[] f207732P = {-21389, -2, -1, -1, -1};
    static final int[] PExt = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    private static final int[] PExtInv = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.add(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && Nat160.gte(iArr3, f207732P))) {
            Nat.add33To(5, PInv33, iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(10, iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && Nat.gte(10, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, f207732P))) {
            Nat.add33To(5, PInv33, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat160.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[4] == -1) {
            int[] iArr = f207732P;
            if (Nat160.gte(iArrFromBigInteger, iArr)) {
                Nat160.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(5, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(5, iArr2, Nat160.add(iArr, f207732P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat160.createExt();
        Nat160.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && Nat.gte(10, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat160.isZero(iArr)) {
            Nat160.zero(iArr2);
        } else {
            Nat160.sub(f207732P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        if (Nat160.mul33DWordAdd(PInv33, Nat160.mul33Add(PInv33, iArr, 5, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, f207732P))) {
            Nat.add33To(5, PInv33, iArr2);
        }
    }

    public static void reduce32(int i, int[] iArr) {
        if ((i == 0 || Nat160.mul33WordAdd(PInv33, i, iArr, 0) == 0) && !(iArr[4] == -1 && Nat160.gte(iArr, f207732P))) {
            return;
        }
        Nat.add33To(5, PInv33, iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat160.createExt();
        Nat160.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] iArrCreateExt = Nat160.createExt();
        Nat160.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            Nat160.square(iArr2, iArrCreateExt);
            reduce(iArrCreateExt, iArr2);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.sub(iArr, iArr2, iArr3) != 0) {
            Nat.sub33From(5, PInv33, iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, f207732P))) {
            Nat.add33To(5, PInv33, iArr2);
        }
    }
}
