package org.spongycastle.crypto.engines;

import l.ig3;
import l.qkq0;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.RC2Parameters;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.p012ec.Tnaf;
import p003l.C0303g;
import p003l.npk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RC2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 8;
    private static byte[] piTable = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, 11, -16, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 18, 117, -54, 31, HttpTokens.SEMI_COLON, -66, -28, -47, 66, 61, -44, 48, -93, 60, -74, 38, 111, -65, 14, -38, 70, 105, 7, 87, 39, -14, 29, -101, PSSSigner.TRAILER_IMPLICIT, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, -128, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, HttpTokens.COLON, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, Tnaf.POW_2_WIDTH, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, HttpTokens.CARRIAGE_RETURN, 56, 52, 27, -85, 51, -1, -80, -69, 72, 12, 95, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, HttpTokens.SPACE, 104, -2, 127, -63, -83};
    private boolean encrypting;
    private int[] workingKey;

    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iRotateWordLeft = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int iRotateWordLeft2 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
        int iRotateWordLeft3 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int iRotateWordLeft4 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
        for (int i3 = 60; i3 >= 44; i3 -= 4) {
            iRotateWordLeft = rotateWordLeft(iRotateWordLeft, 11) - ((((~iRotateWordLeft2) & iRotateWordLeft4) + (iRotateWordLeft3 & iRotateWordLeft2)) + this.workingKey[i3 + 3]);
            iRotateWordLeft2 = rotateWordLeft(iRotateWordLeft2, 13) - ((((~iRotateWordLeft3) & iRotateWordLeft) + (iRotateWordLeft4 & iRotateWordLeft3)) + this.workingKey[i3 + 2]);
            iRotateWordLeft3 = rotateWordLeft(iRotateWordLeft3, 14) - ((((~iRotateWordLeft4) & iRotateWordLeft2) + (iRotateWordLeft & iRotateWordLeft4)) + this.workingKey[i3 + 1]);
            iRotateWordLeft4 = rotateWordLeft(iRotateWordLeft4, 15) - ((((~iRotateWordLeft) & iRotateWordLeft3) + (iRotateWordLeft2 & iRotateWordLeft)) + this.workingKey[i3]);
        }
        int[] iArr = this.workingKey;
        int iRotateWordLeft5 = iRotateWordLeft - iArr[iRotateWordLeft2 & 63];
        int iRotateWordLeft6 = iRotateWordLeft2 - iArr[iRotateWordLeft3 & 63];
        int iRotateWordLeft7 = iRotateWordLeft3 - iArr[iRotateWordLeft4 & 63];
        int iRotateWordLeft8 = iRotateWordLeft4 - iArr[iRotateWordLeft5 & 63];
        for (int i4 = 40; i4 >= 20; i4 -= 4) {
            iRotateWordLeft5 = rotateWordLeft(iRotateWordLeft5, 11) - ((((~iRotateWordLeft6) & iRotateWordLeft8) + (iRotateWordLeft7 & iRotateWordLeft6)) + this.workingKey[i4 + 3]);
            iRotateWordLeft6 = rotateWordLeft(iRotateWordLeft6, 13) - ((((~iRotateWordLeft7) & iRotateWordLeft5) + (iRotateWordLeft8 & iRotateWordLeft7)) + this.workingKey[i4 + 2]);
            iRotateWordLeft7 = rotateWordLeft(iRotateWordLeft7, 14) - ((((~iRotateWordLeft8) & iRotateWordLeft6) + (iRotateWordLeft5 & iRotateWordLeft8)) + this.workingKey[i4 + 1]);
            iRotateWordLeft8 = rotateWordLeft(iRotateWordLeft8, 15) - ((((~iRotateWordLeft5) & iRotateWordLeft7) + (iRotateWordLeft6 & iRotateWordLeft5)) + this.workingKey[i4]);
        }
        int[] iArr2 = this.workingKey;
        int iRotateWordLeft9 = iRotateWordLeft5 - iArr2[iRotateWordLeft6 & 63];
        int iRotateWordLeft10 = iRotateWordLeft6 - iArr2[iRotateWordLeft7 & 63];
        int iRotateWordLeft11 = iRotateWordLeft7 - iArr2[iRotateWordLeft8 & 63];
        int iRotateWordLeft12 = iRotateWordLeft8 - iArr2[iRotateWordLeft9 & 63];
        for (int i5 = 16; i5 >= 0; i5 -= 4) {
            iRotateWordLeft9 = rotateWordLeft(iRotateWordLeft9, 11) - ((((~iRotateWordLeft10) & iRotateWordLeft12) + (iRotateWordLeft11 & iRotateWordLeft10)) + this.workingKey[i5 + 3]);
            iRotateWordLeft10 = rotateWordLeft(iRotateWordLeft10, 13) - ((((~iRotateWordLeft11) & iRotateWordLeft9) + (iRotateWordLeft12 & iRotateWordLeft11)) + this.workingKey[i5 + 2]);
            iRotateWordLeft11 = rotateWordLeft(iRotateWordLeft11, 14) - ((((~iRotateWordLeft12) & iRotateWordLeft10) + (iRotateWordLeft9 & iRotateWordLeft12)) + this.workingKey[i5 + 1]);
            iRotateWordLeft12 = rotateWordLeft(iRotateWordLeft12, 15) - ((((~iRotateWordLeft9) & iRotateWordLeft11) + (iRotateWordLeft10 & iRotateWordLeft9)) + this.workingKey[i5]);
        }
        bArr2[i2] = (byte) iRotateWordLeft12;
        bArr2[i2 + 1] = (byte) (iRotateWordLeft12 >> 8);
        bArr2[i2 + 2] = (byte) iRotateWordLeft11;
        bArr2[i2 + 3] = (byte) (iRotateWordLeft11 >> 8);
        bArr2[i2 + 4] = (byte) iRotateWordLeft10;
        bArr2[i2 + 5] = (byte) (iRotateWordLeft10 >> 8);
        bArr2[i2 + 6] = (byte) iRotateWordLeft9;
        bArr2[i2 + 7] = (byte) (iRotateWordLeft9 >> 8);
    }

    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr;
        int[] iArr2;
        int iRotateWordLeft = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int iRotateWordLeft2 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
        int iRotateWordLeft3 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int iRotateWordLeft4 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
        int i3 = 0;
        while (true) {
            iArr = this.workingKey;
            if (i3 > 16) {
                break;
            }
            iRotateWordLeft4 = rotateWordLeft(iRotateWordLeft4 + ((~iRotateWordLeft) & iRotateWordLeft3) + (iRotateWordLeft2 & iRotateWordLeft) + iArr[i3], 1);
            iRotateWordLeft3 = rotateWordLeft(iRotateWordLeft3 + ((~iRotateWordLeft4) & iRotateWordLeft2) + (iRotateWordLeft & iRotateWordLeft4) + this.workingKey[i3 + 1], 2);
            iRotateWordLeft2 = rotateWordLeft(iRotateWordLeft2 + ((~iRotateWordLeft3) & iRotateWordLeft) + (iRotateWordLeft4 & iRotateWordLeft3) + this.workingKey[i3 + 2], 3);
            iRotateWordLeft = rotateWordLeft(iRotateWordLeft + ((~iRotateWordLeft2) & iRotateWordLeft4) + (iRotateWordLeft3 & iRotateWordLeft2) + this.workingKey[i3 + 3], 5);
            i3 += 4;
        }
        int iRotateWordLeft5 = iRotateWordLeft4 + iArr[iRotateWordLeft & 63];
        int iRotateWordLeft6 = iRotateWordLeft3 + iArr[iRotateWordLeft5 & 63];
        int iRotateWordLeft7 = iRotateWordLeft2 + iArr[iRotateWordLeft6 & 63];
        int iRotateWordLeft8 = iRotateWordLeft + iArr[iRotateWordLeft7 & 63];
        int i4 = 20;
        while (true) {
            iArr2 = this.workingKey;
            if (i4 > 40) {
                break;
            }
            iRotateWordLeft5 = rotateWordLeft(iRotateWordLeft5 + ((~iRotateWordLeft8) & iRotateWordLeft6) + (iRotateWordLeft7 & iRotateWordLeft8) + iArr2[i4], 1);
            iRotateWordLeft6 = rotateWordLeft(iRotateWordLeft6 + ((~iRotateWordLeft5) & iRotateWordLeft7) + (iRotateWordLeft8 & iRotateWordLeft5) + this.workingKey[i4 + 1], 2);
            iRotateWordLeft7 = rotateWordLeft(iRotateWordLeft7 + ((~iRotateWordLeft6) & iRotateWordLeft8) + (iRotateWordLeft5 & iRotateWordLeft6) + this.workingKey[i4 + 2], 3);
            iRotateWordLeft8 = rotateWordLeft(iRotateWordLeft8 + ((~iRotateWordLeft7) & iRotateWordLeft5) + (iRotateWordLeft6 & iRotateWordLeft7) + this.workingKey[i4 + 3], 5);
            i4 += 4;
        }
        int iRotateWordLeft9 = iRotateWordLeft5 + iArr2[iRotateWordLeft8 & 63];
        int iRotateWordLeft10 = iRotateWordLeft6 + iArr2[iRotateWordLeft9 & 63];
        int iRotateWordLeft11 = iRotateWordLeft7 + iArr2[iRotateWordLeft10 & 63];
        int iRotateWordLeft12 = iRotateWordLeft8 + iArr2[iRotateWordLeft11 & 63];
        for (int i5 = 44; i5 < 64; i5 += 4) {
            iRotateWordLeft9 = rotateWordLeft(iRotateWordLeft9 + ((~iRotateWordLeft12) & iRotateWordLeft10) + (iRotateWordLeft11 & iRotateWordLeft12) + this.workingKey[i5], 1);
            iRotateWordLeft10 = rotateWordLeft(iRotateWordLeft10 + ((~iRotateWordLeft9) & iRotateWordLeft11) + (iRotateWordLeft12 & iRotateWordLeft9) + this.workingKey[i5 + 1], 2);
            iRotateWordLeft11 = rotateWordLeft(iRotateWordLeft11 + ((~iRotateWordLeft10) & iRotateWordLeft12) + (iRotateWordLeft9 & iRotateWordLeft10) + this.workingKey[i5 + 2], 3);
            iRotateWordLeft12 = rotateWordLeft(iRotateWordLeft12 + ((~iRotateWordLeft11) & iRotateWordLeft9) + (iRotateWordLeft10 & iRotateWordLeft11) + this.workingKey[i5 + 3], 5);
        }
        bArr2[i2] = (byte) iRotateWordLeft9;
        bArr2[i2 + 1] = (byte) (iRotateWordLeft9 >> 8);
        bArr2[i2 + 2] = (byte) iRotateWordLeft10;
        bArr2[i2 + 3] = (byte) (iRotateWordLeft10 >> 8);
        bArr2[i2 + 4] = (byte) iRotateWordLeft11;
        bArr2[i2 + 5] = (byte) (iRotateWordLeft11 >> 8);
        bArr2[i2 + 6] = (byte) iRotateWordLeft12;
        bArr2[i2 + 7] = (byte) (iRotateWordLeft12 >> 8);
    }

    private int[] generateWorkingKey(byte[] bArr, int i) {
        int[] iArr = new int[128];
        for (int i2 = 0; i2 != bArr.length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i3 = iArr[length - 1];
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                i3 = piTable[(i3 + iArr[i4]) & 255] & 255;
                int i6 = length + 1;
                iArr[length] = i3;
                if (i6 >= 128) {
                    break;
                }
                length = i6;
                i4 = i5;
            }
        }
        int i7 = (i + 7) >> 3;
        int i8 = 128 - i7;
        int i9 = piTable[(255 >> ((-i) & 7)) & iArr[i8]] & 255;
        iArr[i8] = i9;
        for (int i10 = 127 - i7; i10 >= 0; i10--) {
            i9 = piTable[i9 ^ iArr[i10 + i7]] & 255;
            iArr[i10] = i9;
        }
        int[] iArr2 = new int[64];
        for (int i11 = 0; i11 != 64; i11++) {
            int i12 = i11 * 2;
            iArr2[i11] = iArr[i12] + (iArr[i12 + 1] << 8);
        }
        return iArr2;
    }

    private int rotateWordLeft(int i, int i2) {
        int i3 = 65535 & i;
        return (i3 >> (16 - i2)) | (i3 << i2);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        this.encrypting = z;
        if (cipherParameters instanceof RC2Parameters) {
            RC2Parameters rC2Parameters = (RC2Parameters) cipherParameters;
            this.workingKey = generateWorkingKey(rC2Parameters.getKey(), rC2Parameters.getEffectiveKeyBits());
        } else if (!(cipherParameters instanceof KeyParameter)) {
            ig3.a("invalid parameter passed to RC2 init - ".concat(cipherParameters.getClass().getName()));
        } else {
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.workingKey = generateWorkingKey(key, key.length * 8);
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.workingKey == null) {
            qkq0.a("RC2 engine not initialised");
            return 0;
        }
        if (i + 8 > bArr.length) {
            npk0.m6558a("input buffer too short");
            return 0;
        }
        if (i2 + 8 > bArr2.length) {
            C0303g.m4499a("output buffer too short");
            return 0;
        }
        if (this.encrypting) {
            encryptBlock(bArr, i, bArr2, i2);
            return 8;
        }
        decryptBlock(bArr, i, bArr2, i2);
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
