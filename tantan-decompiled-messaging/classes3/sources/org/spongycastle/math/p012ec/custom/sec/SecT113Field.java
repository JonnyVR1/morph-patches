package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ohg0;
import org.spongycastle.math.raw.Interleave;
import org.spongycastle.math.raw.Nat128;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecT113Field {
    private static final long M49 = 562949953421311L;
    private static final long M57 = 144115188075855871L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrFromBigInteger64 = Nat128.fromBigInteger64(bigInteger);
        reduce15(jArrFromBigInteger64, 0);
        return jArrFromBigInteger64;
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & M57;
        long j3 = j & M57;
        long j4 = jArr2[0];
        long j5 = ((jArr2[1] << 7) ^ (j4 >>> 57)) & M57;
        long j6 = j4 & M57;
        long[] jArr4 = new long[6];
        implMulw(j3, j6, jArr4, 0);
        implMulw(j2, j5, jArr4, 2);
        implMulw(j3 ^ j2, j6 ^ j5, jArr4, 4);
        long j7 = jArr4[1] ^ jArr4[2];
        long j8 = jArr4[0];
        long j9 = jArr4[3];
        long j10 = (jArr4[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr4[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    public static void implMulw(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        long j7 = jArr2[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = M57 & j7;
        jArr[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr[0], jArr2, 0);
        Interleave.expand64To128(jArr[1], jArr2, 2);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat128.isZero64(jArr)) {
            ohg0.a();
            return;
        }
        long[] jArrCreate64 = Nat128.create64();
        long[] jArrCreate65 = Nat128.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArrCreate65);
        multiply(jArrCreate65, jArr, jArrCreate65);
        squareN(jArrCreate65, 7, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 14, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        squareN(jArrCreate65, 28, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 56, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = M49 & j7;
    }

    public static void reduce15(long[] jArr, int i) {
        int i2 = i + 1;
        long j = jArr[i2];
        long j2 = j >>> 49;
        jArr[i] = (j2 ^ (j2 << 9)) ^ jArr[i];
        jArr[i2] = j & M49;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j = (4294967295L & jUnshuffle) | (jUnshuffle2 << 32);
        long j2 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        jArr2[0] = ((j2 << 57) ^ j) ^ (j2 << 5);
        jArr2[1] = (j2 >>> 59) ^ (j2 >>> 7);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
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
        return ((int) jArr[0]) & 1;
    }
}
