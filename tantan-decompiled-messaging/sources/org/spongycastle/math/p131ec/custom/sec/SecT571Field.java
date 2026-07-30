package org.spongycastle.math.p131ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Interleave;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat576;
import p149l.ohg0;

/* JADX INFO: loaded from: classes3.dex */
public class SecT571Field {
    private static final long M59 = 576460752303423487L;

    /* JADX INFO: renamed from: RM */
    private static final long f206864RM = -1190112520884487202L;
    private static final long[] ROOT_Z = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    private static void add(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            jArr3[i3 + i4] = jArr[i + i4] ^ jArr2[i2 + i4];
        }
    }

    private static void addBothTo(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr2[i] = jArr[i];
        }
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrFromBigInteger64 = Nat576.fromBigInteger64(bigInteger);
        reduce5(jArrFromBigInteger64, 0);
        return jArrFromBigInteger64;
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[144];
        System.arraycopy(jArr2, 0, jArr4, 9, 9);
        int i = 7;
        int i2 = 0;
        while (i > 0) {
            int i3 = i2 + 18;
            long[] jArr5 = jArr4;
            Nat.shiftUpBit64(9, jArr5, i3 >>> 1, 0L, jArr5, i3);
            jArr4 = jArr5;
            reduce5(jArr4, i3);
            add(jArr4, 9, jArr4, i3, jArr4, i2 + 27);
            i--;
            i2 = i3;
        }
        long[] jArr6 = new long[144];
        Nat.shiftUpBits64(144, jArr4, 0, 4, 0L, jArr6, 0);
        for (int i4 = 56; i4 >= 0; i4 -= 8) {
            for (int i5 = 1; i5 < 9; i5 += 2) {
                int i6 = (int) (jArr[i5] >>> i4);
                addBothTo(jArr4, (i6 & 15) * 9, jArr6, ((i6 >>> 4) & 15) * 9, jArr3, i5 - 1);
            }
            Nat.shiftUpBits64(16, jArr3, 0, 8, 0L);
        }
        for (int i7 = 56; i7 >= 0; i7 -= 8) {
            for (int i8 = 0; i8 < 9; i8 += 2) {
                int i9 = (int) (jArr[i8] >>> i7);
                addBothTo(jArr4, (i9 & 15) * 9, jArr6, ((i9 >>> 4) & 15) * 9, jArr3, i8);
            }
            if (i7 > 0) {
                Nat.shiftUpBits64(18, jArr3, 0, 8, 0L);
            }
        }
    }

    public static void implMulwAcc(long[] jArr, long j, long[] jArr2, int i) {
        long[] jArr3 = new long[32];
        jArr3[1] = j;
        for (int i2 = 2; i2 < 32; i2 += 2) {
            long j2 = jArr3[i2 >>> 1] << 1;
            jArr3[i2] = j2;
            jArr3[i2 + 1] = j2 ^ j;
        }
        int i3 = 0;
        long j3 = 0;
        while (i3 < 9) {
            long j4 = jArr[i3];
            long j5 = j3 ^ jArr3[((int) j4) & 31];
            int i4 = 60;
            long j6 = 0;
            do {
                long j7 = jArr3[((int) (j4 >>> i4)) & 31];
                j5 ^= j7 << i4;
                j6 ^= j7 >>> (-i4);
                i4 -= 5;
            } while (i4 > 0);
            for (int i5 = 0; i5 < 4; i5++) {
                j4 = (j4 & f206864RM) >>> 1;
                j6 ^= ((j << i5) >> 63) & j4;
            }
            int i6 = i + i3;
            jArr2[i6] = j5 ^ jArr2[i6];
            i3++;
            j3 = j6;
        }
        int i7 = i + 9;
        jArr2[i7] = jArr2[i7] ^ j3;
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 9; i++) {
            Interleave.expand64To128(jArr[i], jArr2, i << 1);
        }
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat576.isZero64(jArr)) {
            ohg0.m164364a();
            return;
        }
        long[] jArrCreate64 = Nat576.create64();
        long[] jArrCreate65 = Nat576.create64();
        long[] jArrCreate66 = Nat576.create64();
        square(jArr, jArrCreate66);
        square(jArrCreate66, jArrCreate64);
        square(jArrCreate64, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        multiply(jArrCreate64, jArrCreate66, jArrCreate64);
        squareN(jArrCreate64, 5, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 5, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 15, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate66);
        squareN(jArrCreate66, 30, jArrCreate64);
        squareN(jArrCreate64, 30, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 60, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 60, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 180, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 180, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        multiply(jArrCreate64, jArrCreate66, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (j3 << 15) ^ (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = M59 & j7;
    }

    public static void reduce5(long[] jArr, int i) {
        int i2 = i + 8;
        long j = jArr[i2];
        long j2 = j >>> 59;
        jArr[i] = ((j2 << 10) ^ (((j2 << 2) ^ j2) ^ (j2 << 5))) ^ jArr[i];
        jArr[i2] = j & M59;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat576.create64();
        long[] jArrCreate65 = Nat576.create64();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long jUnshuffle = Interleave.unshuffle(jArr[i]);
            i += 2;
            long jUnshuffle2 = Interleave.unshuffle(jArr[i3]);
            jArrCreate64[i2] = (4294967295L & jUnshuffle) | (jUnshuffle2 << 32);
            jArrCreate65[i2] = (jUnshuffle >>> 32) | ((-4294967296L) & jUnshuffle2);
        }
        long jUnshuffle3 = Interleave.unshuffle(jArr[i]);
        jArrCreate64[4] = 4294967295L & jUnshuffle3;
        jArrCreate65[4] = jUnshuffle3 >>> 32;
        multiply(jArrCreate65, ROOT_Z, jArr2);
        add(jArr2, jArrCreate64, jArr2);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
        }
    }

    public static int trace(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[8];
        return ((int) ((j ^ (j2 >>> 49)) ^ (j2 >>> 57))) & 1;
    }

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }
}
