package org.eclipse.jetty.util.security;

import java.lang.reflect.Array;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
public class UnixCrypt {
    private static final long[][] CF6464;
    private static final long[][] IE3264;
    private static final long[][] PC1ROT;
    private static final long[][][] PC2ROT;
    private static final long[][] SPE;

    /* JADX INFO: renamed from: IP */
    private static final byte[] f205897IP = {HttpTokens.COLON, 50, 42, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, HttpTokens.SPACE, 24, Tnaf.POW_2_WIDTH, 8, 57, 49, 41, 33, 25, 17, 9, 1, HttpTokens.SEMI_COLON, 51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, HttpTokens.CARRIAGE_RETURN, 5, Utf8.REPLACEMENT_BYTE, 55, 47, 39, 31, 23, 15, 7};
    private static final byte[] ExpandTr = {HttpTokens.SPACE, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12, HttpTokens.CARRIAGE_RETURN, 12, HttpTokens.CARRIAGE_RETURN, 14, 15, Tnaf.POW_2_WIDTH, 17, Tnaf.POW_2_WIDTH, 17, 18, 19, 20, 21, 20, 21, 22, 23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31, HttpTokens.SPACE, 1};
    private static final byte[] PC1 = {57, 49, 41, 33, 25, 17, 9, 1, HttpTokens.COLON, 50, 42, 34, 26, 18, 10, 2, HttpTokens.SEMI_COLON, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, Utf8.REPLACEMENT_BYTE, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, HttpTokens.CARRIAGE_RETURN, 5, 28, 20, 12, 4};
    private static final byte[] Rotates = {1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1};
    private static final byte[] PC2 = {9, 18, 14, 17, 11, 24, 1, 5, 22, 25, 3, 28, 15, 6, 21, 10, 35, 38, 23, 19, 12, 4, 26, 8, 43, 54, Tnaf.POW_2_WIDTH, 7, 27, 20, HttpTokens.CARRIAGE_RETURN, 2, 0, 0, 41, 52, 31, 37, 47, 55, 0, 0, 30, 40, 51, 45, 33, 48, 0, 0, 44, 49, 39, 56, 34, 53, 0, 0, 46, 42, 50, 36, 29, HttpTokens.SPACE};

    /* JADX INFO: renamed from: S */
    private static final byte[][] f205898S = {new byte[]{14, 4, HttpTokens.CARRIAGE_RETURN, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7, 0, 15, 7, 4, 14, 2, HttpTokens.CARRIAGE_RETURN, 1, 10, 6, 12, 11, 9, 5, 3, 8, 4, 1, 14, 8, HttpTokens.CARRIAGE_RETURN, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0, 15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, HttpTokens.CARRIAGE_RETURN}, new byte[]{15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, HttpTokens.CARRIAGE_RETURN, 12, 0, 5, 10, 3, HttpTokens.CARRIAGE_RETURN, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5, 0, 14, 7, 11, 10, 4, HttpTokens.CARRIAGE_RETURN, 1, 5, 8, 12, 6, 9, 3, 2, 15, HttpTokens.CARRIAGE_RETURN, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9}, new byte[]{10, 0, 9, 14, 6, 3, 15, 5, 1, HttpTokens.CARRIAGE_RETURN, 12, 7, 11, 4, 2, 8, HttpTokens.CARRIAGE_RETURN, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1, HttpTokens.CARRIAGE_RETURN, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7, 1, 10, HttpTokens.CARRIAGE_RETURN, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12}, new byte[]{7, HttpTokens.CARRIAGE_RETURN, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15, HttpTokens.CARRIAGE_RETURN, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9, 10, 6, 9, 0, 12, 11, 7, HttpTokens.CARRIAGE_RETURN, 15, 1, 3, 14, 5, 2, 8, 4, 3, 15, 0, 6, 10, 1, HttpTokens.CARRIAGE_RETURN, 8, 9, 4, 5, 11, 12, 7, 2, 14}, new byte[]{2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, HttpTokens.CARRIAGE_RETURN, 0, 14, 9, 14, 11, 2, 12, 4, 7, HttpTokens.CARRIAGE_RETURN, 1, 5, 0, 15, 10, 3, 9, 8, 6, 4, 2, 1, 11, 10, HttpTokens.CARRIAGE_RETURN, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14, 11, 8, 12, 7, 1, 14, 2, HttpTokens.CARRIAGE_RETURN, 6, 15, 0, 9, 10, 4, 5, 3}, new byte[]{12, 1, 10, 15, 9, 2, 6, 8, 0, HttpTokens.CARRIAGE_RETURN, 3, 4, 14, 7, 5, 11, 10, 15, 4, 2, 7, 12, 9, 5, 6, 1, HttpTokens.CARRIAGE_RETURN, 14, 0, 11, 3, 8, 9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, HttpTokens.CARRIAGE_RETURN, 11, 6, 4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, HttpTokens.CARRIAGE_RETURN}, new byte[]{4, 11, 2, 14, 15, 0, 8, HttpTokens.CARRIAGE_RETURN, 3, 12, 9, 7, 5, 10, 6, 1, HttpTokens.CARRIAGE_RETURN, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6, 1, 4, 11, HttpTokens.CARRIAGE_RETURN, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2, 6, 11, HttpTokens.CARRIAGE_RETURN, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12}, new byte[]{HttpTokens.CARRIAGE_RETURN, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7, 1, 15, HttpTokens.CARRIAGE_RETURN, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2, 7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, HttpTokens.CARRIAGE_RETURN, 15, 3, 5, 8, 2, 1, 14, 7, 4, 10, 8, HttpTokens.CARRIAGE_RETURN, 15, 12, 9, 0, 3, 5, 6, 11}};
    private static final byte[] P32Tr = {Tnaf.POW_2_WIDTH, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10, 2, 8, 24, 14, HttpTokens.SPACE, 27, 3, 9, 19, HttpTokens.CARRIAGE_RETURN, 30, 6, 22, 11, 4, 25};
    private static final byte[] CIFP = {1, 2, 3, 4, 17, 18, 19, 20, 5, 6, 7, 8, 21, 22, 23, 24, 9, 10, 11, 12, 25, 26, 27, 28, HttpTokens.CARRIAGE_RETURN, 14, 15, Tnaf.POW_2_WIDTH, 29, 30, 31, HttpTokens.SPACE, 33, 34, 35, 36, 49, 50, 51, 52, 37, 38, 39, 40, 53, 54, 55, 56, 41, 42, 43, 44, 57, HttpTokens.COLON, HttpTokens.SEMI_COLON, 60, 45, 46, 47, 48, 61, 62, Utf8.REPLACEMENT_BYTE, 64};
    private static final byte[] ITOA64 = {46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] A64TOI = new byte[128];

    static {
        int i = 64;
        Class cls = Long.TYPE;
        PC1ROT = (long[][]) Array.newInstance((Class<?>) cls, 16, 16);
        PC2ROT = (long[][][]) Array.newInstance((Class<?>) cls, 2, 16, 16);
        IE3264 = (long[][]) Array.newInstance((Class<?>) cls, 8, 16);
        SPE = (long[][]) Array.newInstance((Class<?>) cls, 8, 64);
        CF6464 = (long[][]) Array.newInstance((Class<?>) cls, 16, 16);
        byte[] bArr = new byte[64];
        byte[] bArr2 = new byte[64];
        for (int i2 = 0; i2 < 64; i2++) {
            A64TOI[ITOA64[i2]] = (byte) i2;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            bArr[i3] = 0;
        }
        for (int i4 = 0; i4 < 64; i4++) {
            byte b = PC2[i4];
            if (b != 0) {
                byte b2 = Rotates[0];
                int i5 = b + (b2 - 1);
                if (i5 % 28 < b2) {
                    i5 -= 28;
                }
                int i6 = PC1[i5];
                if (i6 > 0) {
                    int i7 = i6 - 1;
                    i6 = ((i7 | 7) - (i7 & 7)) + 1;
                }
                bArr[i4] = (byte) i6;
            }
        }
        init_perm(PC1ROT, bArr, 8);
        for (int i8 = 0; i8 < 2; i8++) {
            for (int i9 = 0; i9 < 64; i9++) {
                bArr2[i9] = 0;
                bArr[i9] = 0;
            }
            for (int i10 = 0; i10 < 64; i10++) {
                byte b3 = PC2[i10];
                if (b3 != 0) {
                    bArr2[b3 - 1] = (byte) (i10 + 1);
                }
            }
            for (int i11 = 0; i11 < 64; i11++) {
                byte b4 = PC2[i11];
                if (b4 != 0) {
                    int i12 = b4 + i8;
                    if (i12 % 28 <= i8) {
                        i12 -= 28;
                    }
                    bArr[i11] = bArr2[i12];
                }
            }
            init_perm(PC2ROT[i8], bArr, 8);
        }
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = 0;
            while (i14 < 8) {
                int i15 = i14 < 2 ? 0 : f205897IP[ExpandTr[((i13 * 6) + i14) - 2] - 1];
                if (i15 > 32) {
                    i15 -= 32;
                } else if (i15 > 0) {
                    i15--;
                }
                if (i15 > 0) {
                    int i16 = i15 - 1;
                    i15 = ((i16 | 7) - (i16 & 7)) + 1;
                }
                bArr[(i13 * 8) + i14] = (byte) i15;
                i14++;
            }
        }
        init_perm(IE3264, bArr, 8);
        int i17 = 0;
        while (i17 < 64) {
            int i18 = f205897IP[CIFP[i17] - 1];
            if (i18 > 0) {
                int i19 = i18 - 1;
                i18 = ((i19 | 7) - (i19 & 7)) + 1;
            }
            i17++;
            bArr[i18 - 1] = (byte) i17;
        }
        init_perm(CF6464, bArr, 8);
        for (int i20 = 0; i20 < 48; i20++) {
            bArr[i20] = P32Tr[ExpandTr[i20] - 1];
        }
        int i21 = 0;
        while (i21 < 8) {
            int i22 = 0;
            while (i22 < i) {
                byte b5 = f205898S[i21][((i22 & 1) << 5) | (((i22 >> 1) & 1) << 3) | (((i22 >> 2) & 1) << 2) | (((i22 >> 3) & 1) << 1) | ((i22 >> 4) & 1) | (((i22 >> 5) & 1) << 4)];
                int i23 = ((b5 & 1) << 3) | ((b5 >> 3) & 1) | (((b5 >> 2) & 1) << 1) | (((b5 >> 1) & 1) << 2);
                for (int i24 = 0; i24 < 32; i24++) {
                    bArr2[i24] = 0;
                }
                for (int i25 = 0; i25 < 4; i25++) {
                    bArr2[(i21 * 4) + i25] = (byte) ((i23 >> i25) & 1);
                }
                int i26 = 24;
                long j = 0;
                while (true) {
                    int i27 = i26 - 1;
                    if (i27 >= 0) {
                        byte[] bArr3 = bArr;
                        j = (((long) bArr2[bArr[i27] - 1]) << 32) | (j << 1) | ((long) bArr2[bArr3[i26 + 23] - 1]);
                        i26 = i27;
                        bArr = bArr3;
                    }
                }
                SPE[i21][i22] = to_six_bit(j);
                i22++;
                i = 64;
            }
            i21++;
            i = 64;
        }
    }

    private UnixCrypt() {
    }

    public static String crypt(String str, String str2) {
        byte[] bArr = new byte[13];
        if (str == null || str2 == null) {
            return "*";
        }
        int length = str.length();
        int i = 0;
        long jCharAt = 0;
        while (i < 8) {
            jCharAt = (jCharAt << 8) | ((long) (i < length ? str.charAt(i) * 2 : 0));
            i++;
        }
        long[] jArrDes_setkey = des_setkey(jCharAt);
        int i2 = 0;
        int i3 = 2;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            char cCharAt = i3 < str2.length() ? str2.charAt(i3) : '.';
            bArr[i3] = (byte) cCharAt;
            i2 = (i2 << 6) | (A64TOI[cCharAt] & 255);
        }
        long jDes_cipher = des_cipher(0L, i2, 25, jArrDes_setkey);
        int i4 = 12;
        bArr[12] = ITOA64[(((int) jDes_cipher) << 2) & 63];
        char c = 4;
        while (true) {
            jDes_cipher >>= c;
            i4--;
            if (i4 < 2) {
                return new String(bArr, 0, 13);
            }
            bArr[i4] = ITOA64[((int) jDes_cipher) & 63];
            c = 6;
        }
    }

    private static long des_cipher(long j, int i, int i2, long[] jArr) {
        int i3 = to_six_bit(i);
        long j2 = j & 6148914691236517205L;
        char c = 1;
        long j3 = (j & (-6148914694099828736L)) | ((j >> 1) & 1431655765);
        char c2 = ' ';
        long j4 = 4294967295L;
        long[][] jArr2 = IE3264;
        long jPerm3264 = perm3264((int) (((((j2 << 32) | (j2 << 1)) & (-4294967296L)) | ((j3 | (j3 >> 32)) & 4294967295L)) >> 32), jArr2);
        long j5 = jPerm3264;
        long jPerm3265 = perm3264((int) jPerm3264, jArr2);
        int i4 = i2;
        while (true) {
            int i5 = i4 - 1;
            if (i5 < 0) {
                char c3 = c;
                return perm6464(((jPerm3265 >> 35) & 252645135) | ((jPerm3265 << c3) & 4042322160L) | ((((j5 >> 35) & 252645135) | ((j5 << c3) & 4042322160L)) << c2), CF6464);
            }
            int i6 = 0;
            while (i6 < 8) {
                int i7 = i6 << 1;
                char c4 = c;
                long j6 = i3;
                long j7 = ((jPerm3265 >> c2) ^ jPerm3265) & j6 & j4;
                long j8 = jArr[i7] ^ ((j7 | (j7 << c2)) ^ jPerm3265);
                long[][] jArr3 = SPE;
                long[] jArr4 = jArr3[0];
                long j9 = j4;
                long j10 = jArr4[(int) ((j8 >> 58) & 63)];
                long[] jArr5 = jArr3[c4];
                char c5 = c2;
                long j11 = j5;
                long j12 = j10 ^ jArr5[(int) ((j8 >> 50) & 63)];
                long[] jArr6 = jArr3[2];
                long j13 = j12 ^ jArr6[(int) ((j8 >> 42) & 63)];
                long[] jArr7 = jArr3[3];
                long j14 = j13 ^ jArr7[(int) ((j8 >> 34) & 63)];
                long[] jArr8 = jArr3[4];
                int i8 = i6;
                long j15 = j14 ^ jArr8[(int) ((j8 >> 26) & 63)];
                long[] jArr9 = jArr3[5];
                long j16 = j15 ^ jArr9[(int) ((j8 >> 18) & 63)];
                long[] jArr10 = jArr3[6];
                long j17 = j16 ^ jArr10[(int) ((j8 >> 10) & 63)];
                long[] jArr11 = jArr3[7];
                long j18 = j11 ^ (j17 ^ jArr11[(int) ((j8 >> 2) & 63)]);
                long j19 = ((j18 >> c5) ^ j18) & j6 & j9;
                long j20 = ((j19 | (j19 << c5)) ^ j18) ^ jArr[i7 + 1];
                jPerm3265 ^= (((((jArr6[(int) ((j20 >> 42) & 63)] ^ (jArr4[(int) ((j20 >> 58) & 63)] ^ jArr5[(int) ((j20 >> 50) & 63)])) ^ jArr7[(int) ((j20 >> 34) & 63)]) ^ jArr8[(int) ((j20 >> 26) & 63)]) ^ jArr9[(int) ((j20 >> 18) & 63)]) ^ jArr10[(int) ((j20 >> 10) & 63)]) ^ jArr11[(int) ((j20 >> 2) & 63)];
                i6 = i8 + 1;
                c2 = c5;
                c = c4;
                j5 = j18;
                i3 = i3;
                i5 = i5;
                j4 = j9;
            }
            int i9 = i3;
            long j21 = j5 ^ jPerm3265;
            jPerm3265 ^= j21;
            j5 = j21 ^ jPerm3265;
            i3 = i9;
            i4 = i5;
        }
    }

    private static long[] des_setkey(long j) {
        long jPerm6464 = perm6464(j, PC1ROT);
        long[] jArr = new long[16];
        jArr[0] = jPerm6464 & (-217020518463700993L);
        for (int i = 1; i < 16; i++) {
            jArr[i] = jPerm6464;
            jPerm6464 = perm6464(jPerm6464, PC2ROT[Rotates[i] - 1]);
            jArr[i] = jPerm6464 & (-217020518463700993L);
        }
        return jArr;
    }

    private static void init_perm(long[][] jArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 < i * 8; i2++) {
            int i3 = bArr[i2] - 1;
            if (i3 >= 0) {
                int i4 = i3 >> 2;
                int i5 = 1 << (i3 & 3);
                for (int i6 = 0; i6 < 16; i6++) {
                    int i7 = (i2 & 7) + ((7 - (i2 >> 3)) << 3);
                    if ((i6 & i5) != 0) {
                        long[] jArr2 = jArr[i4];
                        jArr2[i6] = jArr2[i6] | (1 << i7);
                    }
                }
            }
        }
    }

    public static void main(String[] strArr) {
        if (strArr.length != 2) {
            System.err.println("Usage - java org.eclipse.util.UnixCrypt <key> <salt>");
            System.exit(1);
        }
        System.err.println("Crypt=" + crypt(strArr[0], strArr[1]));
    }

    private static long perm3264(int i, long[][] jArr) {
        long j = 0;
        int i2 = 4;
        while (true) {
            i2--;
            if (i2 < 0) {
                return j;
            }
            int i3 = i2 << 1;
            j = j | jArr[i3][i & 15] | jArr[i3 + 1][(i & 255) >> 4];
            i >>= 8;
        }
    }

    private static long perm6464(long j, long[][] jArr) {
        long j2 = 0;
        int i = 8;
        while (true) {
            i--;
            if (i < 0) {
                return j2;
            }
            int i2 = (int) (255 & j);
            j >>= 8;
            int i3 = i << 1;
            j2 = j2 | jArr[i3][i2 & 15] | jArr[i3 + 1][i2 >> 4];
        }
    }

    private static long to_six_bit(long j) {
        return ((j >> 16) & 1082331758844L) | ((j << 26) & (-288230371923853312L)) | ((j << 12) & 70931694147600384L) | ((j >> 2) & 277076930264064L);
    }

    private static int to_six_bit(int i) {
        return ((i >> 16) & 252) | ((i << 26) & (-67108864)) | ((i << 12) & 16515072) | ((i >> 2) & 64512);
    }
}
