package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import p149l.C16968g;
import p149l.ig3;
import p149l.npk0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class IDEAEngine implements BlockCipher {
    private static final int BASE = 65537;
    protected static final int BLOCK_SIZE = 8;
    private static final int MASK = 65535;
    private int[] workingKey = null;

    private int bytesToWord(byte[] bArr, int i) {
        return ((bArr[i] << 8) & 65280) + (bArr[i + 1] & 255);
    }

    private int[] expandKey(byte[] bArr) {
        int i;
        int[] iArr = new int[52];
        int i2 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i2 >= 8) {
                break;
            }
            iArr[i2] = bytesToWord(bArr, i2 * 2);
            i2++;
        }
        for (i = 8; i < 52; i++) {
            int i3 = i & 7;
            if (i3 < 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 6] >> 7)) & 65535;
            } else if (i3 == 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            } else {
                iArr[i] = (((iArr[i - 15] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    private int[] generateWorkingKey(boolean z, byte[] bArr) {
        return z ? expandKey(bArr) : invertKey(expandKey(bArr));
    }

    private void ideaFunc(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBytesToWord = bytesToWord(bArr, i);
        int iBytesToWord2 = bytesToWord(bArr, i + 2);
        int iBytesToWord3 = bytesToWord(bArr, i + 4);
        int iBytesToWord4 = bytesToWord(bArr, i + 6);
        int i3 = 0;
        int i4 = iBytesToWord3;
        int i5 = iBytesToWord2;
        int i6 = iBytesToWord;
        int i7 = 0;
        while (i3 < 8) {
            int iMul = mul(i6, iArr[i7]);
            int i8 = (i5 + iArr[i7 + 1]) & 65535;
            int i9 = (i4 + iArr[i7 + 2]) & 65535;
            int iMul2 = mul(iBytesToWord4, iArr[i7 + 3]);
            int i10 = i7 + 5;
            int iMul3 = mul(i9 ^ iMul, iArr[i7 + 4]);
            i7 += 6;
            int iMul4 = mul(((i8 ^ iMul2) + iMul3) & 65535, iArr[i10]);
            int i11 = 65535 & (iMul3 + iMul4);
            i6 = iMul ^ iMul4;
            iBytesToWord4 = iMul2 ^ i11;
            int i12 = i9 ^ iMul4;
            i3++;
            i4 = i8 ^ i11;
            i5 = i12;
        }
        wordToBytes(mul(i6, iArr[i7]), bArr2, i2);
        wordToBytes(i4 + iArr[i7 + 1], bArr2, i2 + 2);
        wordToBytes(i5 + iArr[i7 + 2], bArr2, i2 + 4);
        wordToBytes(mul(iBytesToWord4, iArr[i7 + 3]), bArr2, i2 + 6);
    }

    private int[] invertKey(int[] iArr) {
        int[] iArr2 = new int[52];
        int iMulInv = mulInv(iArr[0]);
        int iAddInv = addInv(iArr[1]);
        int iAddInv2 = addInv(iArr[2]);
        iArr2[51] = mulInv(iArr[3]);
        iArr2[50] = iAddInv2;
        iArr2[49] = iAddInv;
        int i = 48;
        iArr2[48] = iMulInv;
        int i2 = 4;
        for (int i3 = 1; i3 < 8; i3++) {
            int i4 = iArr[i2];
            iArr2[i - 1] = iArr[i2 + 1];
            iArr2[i - 2] = i4;
            int iMulInv2 = mulInv(iArr[i2 + 2]);
            int iAddInv3 = addInv(iArr[i2 + 3]);
            int i5 = i2 + 5;
            int iAddInv4 = addInv(iArr[i2 + 4]);
            i2 += 6;
            iArr2[i - 3] = mulInv(iArr[i5]);
            iArr2[i - 4] = iAddInv3;
            iArr2[i - 5] = iAddInv4;
            i -= 6;
            iArr2[i] = iMulInv2;
        }
        int i6 = iArr[i2];
        iArr2[i - 1] = iArr[i2 + 1];
        iArr2[i - 2] = i6;
        int iMulInv3 = mulInv(iArr[i2 + 2]);
        int iAddInv5 = addInv(iArr[i2 + 3]);
        int iAddInv6 = addInv(iArr[i2 + 4]);
        iArr2[i - 3] = mulInv(iArr[i2 + 5]);
        iArr2[i - 4] = iAddInv6;
        iArr2[i - 5] = iAddInv5;
        iArr2[i - 6] = iMulInv3;
        return iArr2;
    }

    private int mul(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = BASE - i2;
        } else if (i2 == 0) {
            i3 = BASE - i;
        } else {
            int i4 = i * i2;
            int i5 = i4 & 65535;
            int i6 = i4 >>> 16;
            i3 = (i5 - i6) + (i5 < i6 ? 1 : 0);
        }
        return 65535 & i3;
    }

    private int mulInv(int i) {
        if (i < 2) {
            return i;
        }
        int i2 = BASE / i;
        int i3 = BASE % i;
        int i4 = 1;
        while (i3 != 1) {
            int i5 = i / i3;
            i %= i3;
            i4 = (i4 + (i5 * i2)) & 65535;
            if (i == 1) {
                return i4;
            }
            int i6 = i3 / i;
            i3 %= i;
            i2 = (i2 + (i6 * i4)) & 65535;
        }
        return (1 - i2) & 65535;
    }

    private void wordToBytes(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    public int addInv(int i) {
        return (0 - i) & 65535;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.workingKey = generateWorkingKey(z, ((KeyParameter) cipherParameters).getKey());
        } else {
            ig3.m135964a("invalid parameter passed to IDEA init - ".concat(cipherParameters.getClass().getName()));
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            qkq0.m175383a("IDEA engine not initialised");
            return 0;
        }
        if (i + 8 > bArr.length) {
            npk0.m160508a("input buffer too short");
            return 0;
        }
        if (i2 + 8 <= bArr2.length) {
            ideaFunc(iArr, bArr, i, bArr2, i2);
            return 8;
        }
        C16968g.m123940a("output buffer too short");
        return 0;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
