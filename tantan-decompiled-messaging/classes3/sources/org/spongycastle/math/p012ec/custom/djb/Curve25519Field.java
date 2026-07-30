package org.spongycastle.math.p012ec.custom.djb;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat256;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Curve25519Field {

    /* JADX INFO: renamed from: M */
    private static final long f10416M = 4294967295L;
    private static final int PInv = 19;

    /* JADX INFO: renamed from: P7 */
    private static final int f10418P7 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: P */
    static final int[] f10417P = {-19, -1, -1, -1, -1, -1, -1, f10418P7};
    private static final int[] PExt = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.add(iArr, iArr2, iArr3);
        if (Nat256.gte(iArr3, f10417P)) {
            subPFrom(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat.add(16, iArr, iArr2, iArr3);
        if (Nat.gte(16, iArr3, PExt)) {
            subPExtFrom(iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        Nat.inc(8, iArr, iArr2);
        if (Nat256.gte(iArr2, f10417P)) {
            subPFrom(iArr2);
        }
    }

    private static int addPExtTo(int[] iArr) {
        long j = ((long) iArr[0]) & f10416M;
        int[] iArr2 = PExt;
        long j2 = j + (((long) iArr2[0]) & f10416M);
        iArr[0] = (int) j2;
        long jIncAt = j2 >> 32;
        if (jIncAt != 0) {
            jIncAt = Nat.incAt(8, iArr, 1);
        }
        long j3 = jIncAt + ((((long) iArr[8]) & f10416M) - 19);
        iArr[8] = (int) j3;
        long jDecAt = j3 >> 32;
        if (jDecAt != 0) {
            jDecAt = Nat.decAt(15, iArr, 9);
        }
        long j4 = jDecAt + (((long) iArr[15]) & f10416M) + (f10416M & ((long) (iArr2[15] + 1)));
        iArr[15] = (int) j4;
        return (int) (j4 >> 32);
    }

    private static int addPTo(int[] iArr) {
        long j = (((long) iArr[0]) & f10416M) - 19;
        iArr[0] = (int) j;
        long jDecAt = j >> 32;
        if (jDecAt != 0) {
            jDecAt = Nat.decAt(7, iArr, 1);
        }
        long j2 = jDecAt + (f10416M & ((long) iArr[7])) + IjkMediaMeta.AV_CH_WIDE_LEFT;
        iArr[7] = (int) j2;
        return (int) (j2 >> 32);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat256.fromBigInteger(bigInteger);
        while (true) {
            int[] iArr = f10417P;
            if (!Nat256.gte(iArrFromBigInteger, iArr)) {
                return iArrFromBigInteger;
            }
            Nat256.subFrom(iArr, iArrFromBigInteger);
        }
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat256.add(iArr, f10417P, iArr2);
            Nat.shiftDownBit(8, iArr2, 0);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.mulAddTo(iArr, iArr2, iArr3);
        if (Nat.gte(16, iArr3, PExt)) {
            subPExtFrom(iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat256.isZero(iArr)) {
            Nat256.zero(iArr2);
        } else {
            Nat256.sub(f10417P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        Nat.shiftUpBit(8, iArr, 8, i, iArr2, 0);
        int iMulByWordAddTo = Nat256.mulByWordAddTo(19, iArr, iArr2) << 1;
        int i2 = iArr2[7];
        iArr2[7] = (i2 & f10418P7) + Nat.addWordTo(7, (iMulByWordAddTo + ((i2 >>> 31) - (i >>> 31))) * 19, iArr2);
        if (Nat256.gte(iArr2, f10417P)) {
            subPFrom(iArr2);
        }
    }

    public static void reduce27(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = (i2 & f10418P7) + Nat.addWordTo(7, ((i << 1) | (i2 >>> 31)) * 19, iArr);
        if (Nat256.gte(iArr, f10417P)) {
            subPFrom(iArr);
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

    private static int subPExtFrom(int[] iArr) {
        long j = ((long) iArr[0]) & f10416M;
        int[] iArr2 = PExt;
        long j2 = j - (((long) iArr2[0]) & f10416M);
        iArr[0] = (int) j2;
        long jDecAt = j2 >> 32;
        if (jDecAt != 0) {
            jDecAt = Nat.decAt(8, iArr, 1);
        }
        long j3 = jDecAt + (((long) iArr[8]) & f10416M) + 19;
        iArr[8] = (int) j3;
        long jIncAt = j3 >> 32;
        if (jIncAt != 0) {
            jIncAt = Nat.incAt(15, iArr, 9);
        }
        long j4 = jIncAt + ((((long) iArr[15]) & f10416M) - (f10416M & ((long) (iArr2[15] + 1))));
        iArr[15] = (int) j4;
        return (int) (j4 >> 32);
    }

    private static int subPFrom(int[] iArr) {
        long j = (((long) iArr[0]) & f10416M) + 19;
        iArr[0] = (int) j;
        long jIncAt = j >> 32;
        if (jIncAt != 0) {
            jIncAt = Nat.incAt(7, iArr, 1);
        }
        long j2 = jIncAt + ((f10416M & ((long) iArr[7])) - IjkMediaMeta.AV_CH_WIDE_LEFT);
        iArr[7] = (int) j2;
        return (int) (j2 >> 32);
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            addPTo(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            addPExtTo(iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        Nat.shiftUpBit(8, iArr, 0, iArr2);
        if (Nat256.gte(iArr2, f10417P)) {
            subPFrom(iArr2);
        }
    }
}
