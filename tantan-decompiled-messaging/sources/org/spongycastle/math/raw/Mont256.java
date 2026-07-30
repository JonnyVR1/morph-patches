package org.spongycastle.math.raw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Mont256 {

    /* JADX INFO: renamed from: M */
    private static final long f206869M = 4294967295L;

    public static int inverse32(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = i2 * (2 - (i * i2));
        int i4 = i3 * (2 - (i * i3));
        return i4 * (2 - (i * i4));
    }

    public static void multAdd(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        char c = 0;
        long j = iArr2[0];
        long j2 = f206869M;
        long j3 = j & f206869M;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 8) {
            long j4 = ((long) iArr3[c]) & j2;
            long j5 = ((long) iArr[i2]) & j2;
            long j6 = j5 * j3;
            long j7 = (j6 & j2) + j4;
            char c2 = c;
            long j8 = j2;
            long j9 = ((long) (((int) j7) * i)) & j8;
            long j10 = (((long) iArr4[c2]) & j8) * j9;
            char c3 = ' ';
            long j11 = ((j7 + (j10 & j8)) >>> 32) + (j6 >>> 32) + (j10 >>> 32);
            int i4 = 1;
            while (i4 < 8) {
                long j12 = (((long) iArr2[i4]) & j8) * j5;
                char c4 = c3;
                long j13 = (((long) iArr4[i4]) & j8) * j9;
                long j14 = j11 + (j12 & j8) + (j13 & j8) + (((long) iArr3[i4]) & j8);
                iArr3[i4 - 1] = (int) j14;
                j11 = (j14 >>> c4) + (j12 >>> c4) + (j13 >>> c4);
                i4++;
                c3 = c4;
                j3 = j3;
                j9 = j9;
            }
            char c5 = c3;
            long j15 = j11 + (((long) i3) & j8);
            iArr3[7] = (int) j15;
            i3 = (int) (j15 >>> c5);
            i2++;
            c = c2;
            j2 = j8;
            j3 = j3;
        }
        if (i3 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void multAddXF(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        char c = 0;
        long j = iArr2[0];
        long j2 = f206869M;
        long j3 = j & f206869M;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= 8) {
                break;
            }
            long j4 = ((long) iArr[i]) & j2;
            long j5 = (j4 * j3) + (((long) iArr3[c]) & j2);
            long j6 = j5 & j2;
            long j7 = (j5 >>> 32) + j6;
            int i3 = 1;
            for (int i4 = 8; i3 < i4; i4 = 8) {
                long j8 = j2;
                long j9 = (((long) iArr2[i3]) & j8) * j4;
                int i5 = i3;
                long j10 = (((long) iArr4[i3]) & j8) * j6;
                long j11 = j7 + (j9 & j8) + (j10 & j8) + (((long) iArr3[i5]) & j8);
                iArr3[i5 - 1] = (int) j11;
                j7 = (j11 >>> 32) + (j9 >>> 32) + (j10 >>> 32);
                i3 = i5 + 1;
                j2 = j8;
                j3 = j3;
            }
            long j12 = j7 + (((long) i2) & j2);
            iArr3[7] = (int) j12;
            i2 = (int) (j12 >>> 32);
            i++;
            j3 = j3;
            c = 0;
        }
        if (i2 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2, int i) {
        char c = 0;
        int i2 = 0;
        while (i2 < 8) {
            int i3 = iArr[c];
            long j = ((long) (i3 * i)) & f206869M;
            long j2 = (((((long) iArr2[c]) & f206869M) * j) + (((long) i3) & f206869M)) >>> 32;
            int i4 = 1;
            while (i4 < 8) {
                long j3 = j2 + ((((long) iArr2[i4]) & f206869M) * j) + (((long) iArr[i4]) & f206869M);
                iArr[i4 - 1] = (int) j3;
                j2 = j3 >>> 32;
                i4++;
                i2 = i2;
            }
            iArr[7] = (int) j2;
            i2++;
            c = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 8; i++) {
            long j = ((long) iArr[0]) & f206869M;
            long j2 = j;
            for (int i2 = 1; i2 < 8; i2++) {
                long j3 = j2 + ((((long) iArr2[i2]) & f206869M) * j) + (((long) iArr[i2]) & f206869M);
                iArr[i2 - 1] = (int) j3;
                j2 = j3 >>> 32;
            }
            iArr[7] = (int) j2;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}
