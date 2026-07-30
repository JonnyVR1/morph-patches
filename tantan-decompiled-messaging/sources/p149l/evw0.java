package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class evw0 {
    /* JADX INFO: renamed from: a */
    public static byte[] m118334a(byte[] bArr, byte[] bArr2) {
        long jM118335b = m118335b(bArr, 0, 0);
        long jM118335b2 = m118335b(bArr, 3, 2) & 67108611;
        long jM118335b3 = m118335b(bArr, 6, 4) & 67092735;
        long jM118335b4 = m118335b(bArr, 9, 6) & 66076671;
        long jM118335b5 = m118335b(bArr, 12, 8) & 1048575;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 >= length) {
                long j6 = j + (j2 >> 26);
                long j7 = j6 & 67108863;
                long j8 = j3 + (j6 >> 26);
                long j9 = j8 & 67108863;
                long j10 = j4 + (j8 >> 26);
                long j11 = j10 & 67108863;
                long j12 = j5 + ((j10 >> 26) * 5);
                long j13 = j12 & 67108863;
                long j14 = j13 + 5;
                long j15 = (j2 & 67108863) + (j12 >> 26);
                long j16 = j15 + (j14 >> 26);
                long j17 = (j16 >> 26) + j7;
                long j18 = j9 + (j17 >> 26);
                long j19 = (j11 + (j18 >> 26)) - 67108864;
                long j20 = j19 >> 63;
                long j21 = ~j20;
                long j22 = (j15 & j20) | (j16 & 67108863 & j21);
                long j23 = (j7 & j20) | (j17 & 67108863 & j21);
                long j24 = (j9 & j20) | (j18 & 67108863 & j21);
                long j25 = (j11 & j20) | (j19 & j21);
                long jM118336c = (((j20 & j13) | (j14 & 67108863 & j21) | (j22 << 26)) & 4294967295L) + m118336c(bArr, 16);
                long jM118336c2 = (((j22 >> 6) | (j23 << 20)) & 4294967295L) + m118336c(bArr, 20);
                long jM118336c3 = (((j23 >> 12) | (j24 << 14)) & 4294967295L) + m118336c(bArr, 24);
                long jM118336c4 = (((j24 >> 18) | (j25 << 8)) & 4294967295L) + m118336c(bArr, 28);
                byte[] bArr4 = new byte[16];
                m118337d(bArr4, jM118336c & 4294967295L, 0);
                long j26 = jM118336c2 + (jM118336c >> 32);
                m118337d(bArr4, j26 & 4294967295L, 4);
                long j27 = jM118336c3 + (j26 >> 32);
                m118337d(bArr4, j27 & 4294967295L, 8);
                m118337d(bArr4, (jM118336c4 + (j27 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i, (byte) 0);
            }
            long j28 = jM118335b5 * 5;
            long j29 = jM118335b4 * 5;
            long j30 = jM118335b3 * 5;
            long jM118335b6 = j5 + m118335b(bArr3, 0, 0);
            long jM118335b7 = j2 + m118335b(bArr3, 3, 2);
            long jM118335b8 = j + m118335b(bArr3, 6, 4);
            long jM118335b9 = j3 + m118335b(bArr3, 9, 6);
            long jM118335b10 = j4 + (m118335b(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j31 = jM118335b7 * jM118335b;
            long j32 = jM118335b7 * jM118335b2;
            long j33 = jM118335b7 * jM118335b3;
            long j34 = jM118335b9 * jM118335b;
            long j35 = jM118335b7 * jM118335b4;
            long j36 = jM118335b10 * jM118335b;
            long j37 = (jM118335b6 * jM118335b) + (jM118335b7 * j28) + (jM118335b8 * j29) + (jM118335b9 * j30) + (jM118335b2 * 5 * jM118335b10);
            long j38 = (jM118335b6 * jM118335b2) + j31 + (jM118335b8 * j28) + (jM118335b9 * j29) + (j30 * jM118335b10) + (j37 >> 26);
            long j39 = (jM118335b6 * jM118335b3) + j32 + (jM118335b8 * jM118335b) + (jM118335b9 * j28) + (j29 * jM118335b10) + (j38 >> 26);
            long j40 = (jM118335b6 * jM118335b4) + j33 + (jM118335b8 * jM118335b2) + j34 + (jM118335b10 * j28) + (j39 >> 26);
            long j41 = (jM118335b6 * jM118335b5) + j35 + (jM118335b8 * jM118335b3) + (jM118335b9 * jM118335b2) + j36 + (j40 >> 26);
            long j42 = (j37 & 67108863) + ((j41 >> 26) * 5);
            j2 = (j38 & 67108863) + (j42 >> 26);
            i2 += 16;
            j = j39 & 67108863;
            j3 = j40 & 67108863;
            j4 = j41 & 67108863;
            i = 17;
            j5 = j42 & 67108863;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m118335b(byte[] bArr, int i, int i2) {
        return (m118336c(bArr, i) >> i2) & 67108863;
    }

    /* JADX INFO: renamed from: c */
    public static long m118336c(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((long) (((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16))) & 4294967295L;
    }

    /* JADX INFO: renamed from: d */
    public static void m118337d(byte[] bArr, long j, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }
}
