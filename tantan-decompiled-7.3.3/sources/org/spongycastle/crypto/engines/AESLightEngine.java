package org.spongycastle.crypto.engines;

import com.alibaba.fastjson.asm.Opcodes;
import java.lang.reflect.Array;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import org.spongycastle.util.Pack;
import p153l.C17103g;
import p153l.tyk0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* JADX INFO: renamed from: m1 */
    private static final int f207438m1 = -2139062144;

    /* JADX INFO: renamed from: m2 */
    private static final int f207439m2 = 2139062143;

    /* JADX INFO: renamed from: m3 */
    private static final int f207440m3 = 27;

    /* JADX INFO: renamed from: m4 */
    private static final int f207441m4 = -1061109568;

    /* JADX INFO: renamed from: m5 */
    private static final int f207442m5 = 1061109567;

    /* JADX INFO: renamed from: C0 */
    private int f207443C0;

    /* JADX INFO: renamed from: C1 */
    private int f207444C1;

    /* JADX INFO: renamed from: C2 */
    private int f207445C2;

    /* JADX INFO: renamed from: C3 */
    private int f207446C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;

    /* JADX INFO: renamed from: S */
    private static final byte[] f207436S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, Utf8.REPLACEMENT_BYTE, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, -128, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, HttpTokens.SEMI_COLON, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, HttpTokens.SPACE, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, Tnaf.POW_2_WIDTH, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, HttpTokens.COLON, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, HttpTokens.CARRIAGE_RETURN, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};

    /* JADX INFO: renamed from: Si */
    private static final byte[] f207437Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, Utf8.REPLACEMENT_BYTE, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, HttpTokens.COLON, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, HttpTokens.SPACE, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, Tnaf.POW_2_WIDTH, 89, 39, -128, -20, 95, 96, 81, 127, -87, 25, -75, 74, HttpTokens.CARRIAGE_RETURN, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, HttpTokens.SEMI_COLON, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 77, 154, 47, 94, 188, 99, Opcodes.IFNULL, 151, 53, 106, 212, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 125, 250, 239, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA};

    private static int FFmulX(int i) {
        return (((i & f207438m1) >>> 7) * 27) ^ ((f207439m2 & i) << 1);
    }

    private static int FFmulX2(int i) {
        int i2 = (f207442m5 & i) << 2;
        int i3 = i & f207441m4;
        int i4 = i3 ^ (i3 >>> 1);
        return (i4 >>> 5) ^ (i2 ^ (i4 >>> 2));
    }

    private void decryptBlock(int[][] iArr) {
        int i = this.f207443C0;
        int i2 = this.ROUNDS;
        int[] iArr2 = iArr[i2];
        int i3 = i ^ iArr2[0];
        int i4 = this.f207444C1 ^ iArr2[1];
        int i5 = this.f207445C2 ^ iArr2[2];
        int i6 = i2 - 1;
        int iInv_mcol = iArr2[3] ^ this.f207446C3;
        while (i6 > 1) {
            byte[] bArr = f207437Si;
            int iInv_mcol2 = inv_mcol((((bArr[i3 & 255] & 255) ^ ((bArr[(iInv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr[(i4 >> 24) & 255] << 24)) ^ iArr[i6][0];
            int iInv_mcol3 = inv_mcol((((bArr[i4 & 255] & 255) ^ ((bArr[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iInv_mcol >> 16) & 255] & 255) << 16)) ^ (bArr[(i5 >> 24) & 255] << 24)) ^ iArr[i6][1];
            int iInv_mcol4 = inv_mcol((((bArr[i5 & 255] & 255) ^ ((bArr[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr[(iInv_mcol >> 24) & 255] << 24)) ^ iArr[i6][2];
            int iInv_mcol5 = inv_mcol((bArr[(i3 >> 24) & 255] << 24) ^ (((bArr[iInv_mcol & 255] & 255) ^ ((bArr[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i4 >> 16) & 255] & 255) << 16)));
            int i7 = i6 - 1;
            int i8 = iInv_mcol5 ^ iArr[i6][3];
            int iInv_mcol6 = inv_mcol((((bArr[iInv_mcol2 & 255] & 255) ^ ((bArr[(i8 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iInv_mcol4 >> 16) & 255] & 255) << 16)) ^ (bArr[(iInv_mcol3 >> 24) & 255] << 24)) ^ iArr[i7][0];
            int iInv_mcol7 = inv_mcol((((bArr[iInv_mcol3 & 255] & 255) ^ ((bArr[(iInv_mcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i8 >> 16) & 255] & 255) << 16)) ^ (bArr[(iInv_mcol4 >> 24) & 255] << 24)) ^ iArr[i7][1];
            int iInv_mcol8 = inv_mcol((((bArr[iInv_mcol4 & 255] & 255) ^ ((bArr[(iInv_mcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iInv_mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr[(i8 >> 24) & 255] << 24)) ^ iArr[i7][2];
            i6 -= 2;
            iInv_mcol = iArr[i7][3] ^ inv_mcol((((bArr[i8 & 255] & 255) ^ ((bArr[(iInv_mcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iInv_mcol3 >> 16) & 255] & 255) << 16)) ^ (bArr[(iInv_mcol2 >> 24) & 255] << 24));
            i3 = iInv_mcol6;
            i4 = iInv_mcol7;
            i5 = iInv_mcol8;
        }
        byte[] bArr2 = f207437Si;
        int iInv_mcol9 = inv_mcol((((bArr2[i3 & 255] & 255) ^ ((bArr2[(iInv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i4 >> 24) & 255] << 24)) ^ iArr[i6][0];
        int iInv_mcol10 = inv_mcol((((bArr2[i4 & 255] & 255) ^ ((bArr2[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iInv_mcol >> 16) & 255] & 255) << 16)) ^ (bArr2[(i5 >> 24) & 255] << 24)) ^ iArr[i6][1];
        int iInv_mcol11 = inv_mcol((((bArr2[i5 & 255] & 255) ^ ((bArr2[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iInv_mcol >> 24) & 255] << 24)) ^ iArr[i6][2];
        int iInv_mcol12 = inv_mcol((bArr2[(i3 >> 24) & 255] << 24) ^ (((bArr2[iInv_mcol & 255] & 255) ^ ((bArr2[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i4 >> 16) & 255] & 255) << 16))) ^ iArr[i6][3];
        int i9 = (((bArr2[iInv_mcol9 & 255] & 255) ^ ((bArr2[(iInv_mcol12 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iInv_mcol11 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iInv_mcol10 >> 24) & 255] << 24);
        int[] iArr3 = iArr[0];
        this.f207443C0 = i9 ^ iArr3[0];
        this.f207444C1 = ((((bArr2[iInv_mcol10 & 255] & 255) ^ ((bArr2[(iInv_mcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iInv_mcol12 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iInv_mcol11 >> 24) & 255] << 24)) ^ iArr3[1];
        this.f207445C2 = ((((bArr2[iInv_mcol11 & 255] & 255) ^ ((bArr2[(iInv_mcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iInv_mcol9 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iInv_mcol12 >> 24) & 255] << 24)) ^ iArr3[2];
        this.f207446C3 = ((((bArr2[iInv_mcol12 & 255] & 255) ^ ((bArr2[(iInv_mcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iInv_mcol10 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iInv_mcol9 >> 24) & 255] << 24)) ^ iArr3[3];
    }

    private void encryptBlock(int[][] iArr) {
        int i = this.f207443C0;
        int[] iArr2 = iArr[0];
        int i2 = i ^ iArr2[0];
        int i3 = this.f207444C1 ^ iArr2[1];
        int i4 = this.f207445C2 ^ iArr2[2];
        int iMcol = iArr2[3] ^ this.f207446C3;
        int i5 = 1;
        while (i5 < this.ROUNDS - 1) {
            byte[] bArr = f207436S;
            int iMcol2 = mcol((((bArr[i2 & 255] & 255) ^ ((bArr[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i4 >> 16) & 255] & 255) << 16)) ^ (bArr[(iMcol >> 24) & 255] << 24)) ^ iArr[i5][0];
            int iMcol3 = mcol((((bArr[i3 & 255] & 255) ^ ((bArr[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iMcol >> 16) & 255] & 255) << 16)) ^ (bArr[(i2 >> 24) & 255] << 24)) ^ iArr[i5][1];
            int iMcol4 = mcol((((bArr[i4 & 255] & 255) ^ ((bArr[(iMcol >> 8) & 255] & 255) << 8)) ^ ((bArr[(i2 >> 16) & 255] & 255) << 16)) ^ (bArr[(i3 >> 24) & 255] << 24)) ^ iArr[i5][2];
            int iMcol5 = mcol(((((bArr[(i2 >> 8) & 255] & 255) << 8) ^ (bArr[iMcol & 255] & 255)) ^ ((bArr[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr[(i4 >> 24) & 255] << 24));
            int i6 = i5 + 1;
            int i7 = iMcol5 ^ iArr[i5][3];
            int iMcol6 = mcol((((bArr[iMcol2 & 255] & 255) ^ ((bArr[(iMcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iMcol4 >> 16) & 255] & 255) << 16)) ^ (bArr[(i7 >> 24) & 255] << 24)) ^ iArr[i6][0];
            int iMcol7 = mcol((((bArr[iMcol3 & 255] & 255) ^ ((bArr[(iMcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i7 >> 16) & 255] & 255) << 16)) ^ (bArr[(iMcol2 >> 24) & 255] << 24)) ^ iArr[i6][1];
            int iMcol8 = mcol((((bArr[iMcol4 & 255] & 255) ^ ((bArr[(i7 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iMcol2 >> 16) & 255] & 255) << 16)) ^ (bArr[(iMcol3 >> 24) & 255] << 24)) ^ iArr[i6][2];
            i5 += 2;
            iMcol = iArr[i6][3] ^ mcol((((bArr[i7 & 255] & 255) ^ ((bArr[(iMcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iMcol3 >> 16) & 255] & 255) << 16)) ^ (bArr[(iMcol4 >> 24) & 255] << 24));
            i2 = iMcol6;
            i3 = iMcol7;
            i4 = iMcol8;
        }
        byte[] bArr2 = f207436S;
        int iMcol9 = mcol((((bArr2[i2 & 255] & 255) ^ ((bArr2[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i4 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iMcol >> 24) & 255] << 24)) ^ iArr[i5][0];
        int iMcol10 = mcol((((bArr2[i3 & 255] & 255) ^ ((bArr2[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iMcol >> 16) & 255] & 255) << 16)) ^ (bArr2[(i2 >> 24) & 255] << 24)) ^ iArr[i5][1];
        int iMcol11 = mcol((((bArr2[i4 & 255] & 255) ^ ((bArr2[(iMcol >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i2 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i3 >> 24) & 255] << 24)) ^ iArr[i5][2];
        int iMcol12 = mcol(((((bArr2[(i2 >> 8) & 255] & 255) << 8) ^ (bArr2[iMcol & 255] & 255)) ^ ((bArr2[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i4 >> 24) & 255] << 24)) ^ iArr[i5][3];
        int i8 = (((bArr2[iMcol9 & 255] & 255) ^ ((bArr2[(iMcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iMcol11 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iMcol12 >> 24) & 255] << 24);
        int[] iArr3 = iArr[i5 + 1];
        this.f207443C0 = iArr3[0] ^ i8;
        this.f207444C1 = ((((bArr2[iMcol10 & 255] & 255) ^ ((bArr2[(iMcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iMcol12 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iMcol9 >> 24) & 255] << 24)) ^ iArr3[1];
        this.f207445C2 = ((((bArr2[iMcol11 & 255] & 255) ^ ((bArr2[(iMcol12 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iMcol9 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iMcol10 >> 24) & 255] << 24)) ^ iArr3[2];
        this.f207446C3 = ((((bArr2[iMcol12 & 255] & 255) ^ ((bArr2[(iMcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iMcol10 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iMcol11 >> 24) & 255] << 24)) ^ iArr3[3];
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z) {
        int i;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            wg3.m206174a("Key length not 128/192/256 bits.");
            return null;
        }
        int i2 = length >> 2;
        this.ROUNDS = i2 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2 + 7, 4);
        if (i2 == 4) {
            i = 1;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt2;
            int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt3;
            int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt4;
            for (int i3 = 1; i3 <= 10; i3++) {
                iLittleEndianToInt ^= subWord(shift(iLittleEndianToInt4, 8)) ^ rcon[i3 - 1];
                int[] iArr2 = iArr[i3];
                iArr2[0] = iLittleEndianToInt;
                iLittleEndianToInt2 ^= iLittleEndianToInt;
                iArr2[1] = iLittleEndianToInt2;
                iLittleEndianToInt3 ^= iLittleEndianToInt2;
                iArr2[2] = iLittleEndianToInt3;
                iLittleEndianToInt4 ^= iLittleEndianToInt3;
                iArr2[3] = iLittleEndianToInt4;
            }
        } else if (i2 == 6) {
            i = 1;
            int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt5;
            int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt6;
            int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt7;
            int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt8;
            int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt9;
            int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt10;
            int iSubWord = iLittleEndianToInt5 ^ (subWord(shift(iLittleEndianToInt10, 8)) ^ 1);
            int[] iArr3 = iArr[1];
            iArr3[2] = iSubWord;
            int i4 = iLittleEndianToInt6 ^ iSubWord;
            iArr3[3] = i4;
            int i5 = iLittleEndianToInt7 ^ i4;
            int[] iArr4 = iArr[2];
            iArr4[0] = i5;
            int i6 = iLittleEndianToInt8 ^ i5;
            iArr4[1] = i6;
            int i7 = iLittleEndianToInt9 ^ i6;
            iArr4[2] = i7;
            int i8 = iLittleEndianToInt10 ^ i7;
            iArr4[3] = i8;
            int i9 = 2;
            for (int i10 = 3; i10 < 12; i10 += 3) {
                int iSubWord2 = iSubWord ^ (subWord(shift(i8, 8)) ^ i9);
                int[] iArr5 = iArr[i10];
                iArr5[0] = iSubWord2;
                int i11 = i4 ^ iSubWord2;
                iArr5[1] = i11;
                int i12 = i5 ^ i11;
                iArr5[2] = i12;
                int i13 = i6 ^ i12;
                iArr5[3] = i13;
                int i14 = i7 ^ i13;
                int i15 = i10 + 1;
                int[] iArr6 = iArr[i15];
                iArr6[0] = i14;
                int i16 = i8 ^ i14;
                iArr6[1] = i16;
                int iSubWord3 = subWord(shift(i16, 8)) ^ (i9 << 1);
                i9 <<= 2;
                iSubWord = iSubWord2 ^ iSubWord3;
                int[] iArr7 = iArr[i15];
                iArr7[2] = iSubWord;
                i4 = i11 ^ iSubWord;
                iArr7[3] = i4;
                i5 = i12 ^ i4;
                int[] iArr8 = iArr[i10 + 2];
                iArr8[0] = i5;
                i6 = i13 ^ i5;
                iArr8[1] = i6;
                i7 = i14 ^ i6;
                iArr8[2] = i7;
                i8 = i16 ^ i7;
                iArr8[3] = i8;
            }
            int iSubWord4 = (subWord(shift(i8, 8)) ^ i9) ^ iSubWord;
            int[] iArr9 = iArr[12];
            iArr9[0] = iSubWord4;
            int i17 = iSubWord4 ^ i4;
            iArr9[1] = i17;
            int i18 = i17 ^ i5;
            iArr9[2] = i18;
            iArr9[3] = i18 ^ i6;
        } else {
            if (i2 != 8) {
                wtq0.m207906a("Should never get here");
                return null;
            }
            int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt11;
            int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt12;
            int iLittleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt13;
            int iLittleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt14;
            int iLittleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt15;
            int iLittleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt16;
            int iLittleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = iLittleEndianToInt17;
            int iLittleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = iLittleEndianToInt18;
            int i19 = 1;
            i = 1;
            for (int i20 = 2; i20 < 14; i20 += 2) {
                int iSubWord5 = subWord(shift(iLittleEndianToInt18, 8)) ^ i19;
                i19 <<= 1;
                iLittleEndianToInt11 ^= iSubWord5;
                int[] iArr10 = iArr[i20];
                iArr10[0] = iLittleEndianToInt11;
                iLittleEndianToInt12 ^= iLittleEndianToInt11;
                iArr10[1] = iLittleEndianToInt12;
                iLittleEndianToInt13 ^= iLittleEndianToInt12;
                iArr10[2] = iLittleEndianToInt13;
                iLittleEndianToInt14 ^= iLittleEndianToInt13;
                iArr10[3] = iLittleEndianToInt14;
                iLittleEndianToInt15 ^= subWord(iLittleEndianToInt14);
                int[] iArr11 = iArr[i20 + 1];
                iArr11[0] = iLittleEndianToInt15;
                iLittleEndianToInt16 ^= iLittleEndianToInt15;
                iArr11[1] = iLittleEndianToInt16;
                iLittleEndianToInt17 ^= iLittleEndianToInt16;
                iArr11[2] = iLittleEndianToInt17;
                iLittleEndianToInt18 ^= iLittleEndianToInt17;
                iArr11[3] = iLittleEndianToInt18;
            }
            int iSubWord6 = (subWord(shift(iLittleEndianToInt18, 8)) ^ i19) ^ iLittleEndianToInt11;
            int[] iArr12 = iArr[14];
            iArr12[0] = iSubWord6;
            int i21 = iSubWord6 ^ iLittleEndianToInt12;
            iArr12[1] = i21;
            int i22 = i21 ^ iLittleEndianToInt13;
            iArr12[2] = i22;
            iArr12[3] = i22 ^ iLittleEndianToInt14;
        }
        if (!z) {
            for (int i23 = i; i23 < this.ROUNDS; i23++) {
                for (int i24 = 0; i24 < 4; i24++) {
                    int[] iArr13 = iArr[i23];
                    iArr13[i24] = inv_mcol(iArr13[i24]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i) {
        int iShift = shift(i, 8) ^ i;
        int iFFmulX = i ^ FFmulX(iShift);
        int iFFmulX2 = iShift ^ FFmulX2(iFFmulX);
        return iFFmulX ^ (iFFmulX2 ^ shift(iFFmulX2, 16));
    }

    private static int mcol(int i) {
        int iShift = shift(i, 8);
        int i2 = i ^ iShift;
        return FFmulX(i2) ^ (iShift ^ shift(i2, 16));
    }

    private void packBlock(byte[] bArr, int i) {
        int i2 = this.f207443C0;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
        int i3 = this.f207444C1;
        bArr[i + 4] = (byte) i3;
        bArr[i + 5] = (byte) (i3 >> 8);
        bArr[i + 6] = (byte) (i3 >> 16);
        bArr[i + 7] = (byte) (i3 >> 24);
        int i4 = this.f207445C2;
        bArr[i + 8] = (byte) i4;
        bArr[i + 9] = (byte) (i4 >> 8);
        bArr[i + 10] = (byte) (i4 >> 16);
        bArr[i + 11] = (byte) (i4 >> 24);
        int i5 = this.f207446C3;
        bArr[i + 12] = (byte) i5;
        bArr[i + 13] = (byte) (i5 >> 8);
        bArr[i + 14] = (byte) (i5 >> 16);
        bArr[i + 15] = (byte) (i5 >> 24);
    }

    private static int shift(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private static int subWord(int i) {
        byte[] bArr = f207436S;
        return (bArr[(i >> 24) & 255] << 24) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }

    private void unpackBlock(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        this.f207443C0 = i2;
        int i3 = ((bArr[i + 1] & 255) << 8) | i2;
        this.f207443C0 = i3;
        int i4 = i3 | ((bArr[i + 2] & 255) << 16);
        this.f207443C0 = i4;
        this.f207443C0 = i4 | (bArr[i + 3] << 24);
        int i5 = bArr[i + 4] & 255;
        this.f207444C1 = i5;
        int i6 = ((bArr[i + 5] & 255) << 8) | i5;
        this.f207444C1 = i6;
        int i7 = i6 | ((bArr[i + 6] & 255) << 16);
        this.f207444C1 = i7;
        this.f207444C1 = i7 | (bArr[i + 7] << 24);
        int i8 = bArr[i + 8] & 255;
        this.f207445C2 = i8;
        int i9 = ((bArr[i + 9] & 255) << 8) | i8;
        this.f207445C2 = i9;
        int i10 = i9 | ((bArr[i + 10] & 255) << 16);
        this.f207445C2 = i10;
        this.f207445C2 = i10 | (bArr[i + 11] << 24);
        int i11 = bArr[i + 12] & 255;
        this.f207446C3 = i11;
        int i12 = ((bArr[i + 13] & 255) << 8) | i11;
        this.f207446C3 = i12;
        int i13 = i12 | ((bArr[i + 14] & 255) << 16);
        this.f207446C3 = i13;
        this.f207446C3 = (bArr[i + 15] << 24) | i13;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            wg3.m206174a("invalid parameter passed to AES init - ".concat(cipherParameters.getClass().getName()));
        } else {
            this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z);
            this.forEncryption = z;
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.WorkingKey == null) {
            wtq0.m207906a("AES engine not initialised");
            return 0;
        }
        if (i + 16 > bArr.length) {
            tyk0.m193596a("input buffer too short");
            return 0;
        }
        if (i2 + 16 > bArr2.length) {
            C17103g.m128363a("output buffer too short");
            return 0;
        }
        if (this.forEncryption) {
            unpackBlock(bArr, i);
            encryptBlock(this.WorkingKey);
            packBlock(bArr2, i2);
            return 16;
        }
        unpackBlock(bArr, i);
        decryptBlock(this.WorkingKey);
        packBlock(bArr2, i2);
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
