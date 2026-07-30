package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class GCMUtil {

    /* JADX INFO: renamed from: E1 */
    private static final int f10300E1 = -520093696;
    private static final long E1L = -2233785415175766016L;
    private static final int[] LOOKUP = generateLookup();

    public static byte[] asBytes(int[] iArr) {
        byte[] bArr = new byte[16];
        Pack.intToBigEndian(iArr, bArr, 0);
        return bArr;
    }

    public static int[] asInts(byte[] bArr) {
        int[] iArr = new int[4];
        Pack.bigEndianToInt(bArr, 0, iArr);
        return iArr;
    }

    public static long[] asLongs(byte[] bArr) {
        long[] jArr = new long[2];
        Pack.bigEndianToLong(bArr, 0, jArr);
        return jArr;
    }

    private static int[] generateLookup() {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            int i2 = 0;
            for (int i3 = 7; i3 >= 0; i3--) {
                if (((1 << i3) & i) != 0) {
                    i2 ^= f10300E1 >>> (7 - i3);
                }
            }
            iArr[i] = i2;
        }
        return iArr;
    }

    public static void multiply(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = iArr2[i9];
            for (int i11 = 0; i11 < 32; i11++) {
                int i12 = i10 >> 31;
                i10 <<= 1;
                i5 ^= i & i12;
                i6 ^= i2 & i12;
                i7 ^= i3 & i12;
                i8 ^= i12 & i4;
                int i13 = (i4 << 31) >> 8;
                i4 = (i4 >>> 1) | (i3 << 31);
                i3 = (i3 >>> 1) | (i2 << 31);
                i2 = (i2 >>> 1) | (i << 31);
                i = (i >>> 1) ^ (i13 & f10300E1);
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        iArr[2] = i7;
        iArr[3] = i8;
    }

    public static void multiplyP(int[] iArr) {
        int iShiftRight = shiftRight(iArr) >> 8;
        iArr[0] = (iShiftRight & f10300E1) ^ iArr[0];
    }

    public static void multiplyP8(int[] iArr) {
        int iShiftRightN = shiftRightN(iArr, 8);
        iArr[0] = LOOKUP[iShiftRightN >>> 24] ^ iArr[0];
    }

    public static byte[] oneAsBytes() {
        byte[] bArr = new byte[16];
        bArr[0] = -128;
        return bArr;
    }

    public static int[] oneAsInts() {
        int[] iArr = new int[4];
        iArr[0] = Integer.MIN_VALUE;
        return iArr;
    }

    public static long[] oneAsLongs() {
        return new long[]{Long.MIN_VALUE, 0};
    }

    public static int shiftRight(int[] iArr) {
        int i = iArr[0];
        iArr[0] = i >>> 1;
        int i2 = iArr[1];
        iArr[1] = (i << 31) | (i2 >>> 1);
        int i3 = i2 << 31;
        int i4 = iArr[2];
        iArr[2] = i3 | (i4 >>> 1);
        int i5 = i4 << 31;
        int i6 = iArr[3];
        iArr[3] = i5 | (i6 >>> 1);
        return i6 << 31;
    }

    public static int shiftRightN(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = 32 - i;
        iArr[0] = i2 >>> i;
        int i4 = iArr[1];
        iArr[1] = (i2 << i3) | (i4 >>> i);
        int i5 = i4 << i3;
        int i6 = iArr[2];
        iArr[2] = i5 | (i6 >>> i);
        int i7 = i6 << i3;
        int i8 = iArr[3];
        iArr[3] = (i8 >>> i) | i7;
        return i8 << i3;
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i + 2;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i + 3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i += 4;
        } while (i < 16);
    }

    public static void asInts(byte[] bArr, int[] iArr) {
        Pack.bigEndianToInt(bArr, 0, iArr);
    }

    public static void asLongs(byte[] bArr, long[] jArr) {
        Pack.bigEndianToLong(bArr, 0, jArr);
    }

    public static void asBytes(int[] iArr, byte[] bArr) {
        Pack.intToBigEndian(iArr, bArr, 0);
    }

    public static byte[] asBytes(long[] jArr) {
        byte[] bArr = new byte[16];
        Pack.longToBigEndian(jArr, bArr, 0);
        return bArr;
    }

    public static void asBytes(long[] jArr, byte[] bArr) {
        Pack.longToBigEndian(jArr, bArr, 0);
    }

    public static void multiplyP(int[] iArr, int[] iArr2) {
        int iShiftRight = shiftRight(iArr, iArr2) >> 8;
        iArr2[0] = (iShiftRight & f10300E1) ^ iArr2[0];
    }

    public static void multiplyP8(int[] iArr, int[] iArr2) {
        int iShiftRightN = shiftRightN(iArr, 8, iArr2);
        iArr2[0] = LOOKUP[iShiftRightN >>> 24] ^ iArr2[0];
    }

    public static int shiftRight(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        iArr2[0] = i >>> 1;
        int i2 = iArr[1];
        iArr2[1] = (i << 31) | (i2 >>> 1);
        int i3 = i2 << 31;
        int i4 = iArr[2];
        iArr2[2] = i3 | (i4 >>> 1);
        int i5 = iArr[3];
        iArr2[3] = (i4 << 31) | (i5 >>> 1);
        return i5 << 31;
    }

    public static int shiftRightN(int[] iArr, int i, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = 32 - i;
        iArr2[0] = i2 >>> i;
        int i4 = iArr[1];
        iArr2[1] = (i2 << i3) | (i4 >>> i);
        int i5 = i4 << i3;
        int i6 = iArr[2];
        iArr2[2] = i5 | (i6 >>> i);
        int i7 = iArr[3];
        iArr2[3] = (i7 >>> i) | (i6 << i3);
        return i7 << i3;
    }

    public static void xor(byte[] bArr, byte[] bArr2, int i, int i2) {
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            }
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = 0;
        do {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i + 2;
            bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i + 3;
            bArr3[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i += 4;
        } while (i < 16);
    }

    public static long shiftRight(long[] jArr) {
        long j = jArr[0];
        jArr[0] = j >>> 1;
        long j2 = jArr[1];
        jArr[1] = (j << 63) | (j2 >>> 1);
        return j2 << 63;
    }

    public static void xor(int[] iArr, int[] iArr2) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        iArr[2] = iArr[2] ^ iArr2[2];
        iArr[3] = iArr2[3] ^ iArr[3];
    }

    public static long shiftRight(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        jArr2[0] = j >>> 1;
        long j2 = jArr[1];
        jArr2[1] = (j << 63) | (j2 >>> 1);
        return j2 << 63;
    }

    public static void xor(int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[0] = iArr[0] ^ iArr2[0];
        iArr3[1] = iArr[1] ^ iArr2[1];
        iArr3[2] = iArr[2] ^ iArr2[2];
        iArr3[3] = iArr[3] ^ iArr2[3];
    }

    public static void xor(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] ^ jArr2[0];
        jArr[1] = jArr[1] ^ jArr2[1];
    }

    public static void xor(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void multiply(byte[] bArr, byte[] bArr2) {
        int[] iArrAsInts = asInts(bArr);
        multiply(iArrAsInts, asInts(bArr2));
        asBytes(iArrAsInts, bArr);
    }

    public static void multiply(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = 0;
        long j4 = 0;
        for (int i = 0; i < 2; i++) {
            long j5 = jArr2[i];
            for (int i2 = 0; i2 < 64; i2++) {
                long j6 = j5 >> 63;
                j5 <<= 1;
                j3 ^= j & j6;
                j4 ^= j6 & j2;
                long j7 = (j2 << 63) >> 8;
                j2 = (j2 >>> 1) | (j << 63);
                j = (j >>> 1) ^ (j7 & E1L);
            }
        }
        jArr[0] = j3;
        jArr[1] = j4;
    }
}
