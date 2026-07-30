package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import p153l.C17103g;
import p153l.tyk0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class RC6Engine implements BlockCipher {
    private static final int LGW = 5;
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private static final int _noRounds = 20;
    private static final int bytesPerWord = 4;
    private static final int wordSize = 32;

    /* JADX INFO: renamed from: _S */
    private int[] f207488_S = null;
    private boolean forEncryption;

    private int bytesToWord(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 3; i3 >= 0; i3--) {
            i2 = (i2 << 8) + (bArr[i3 + i] & 255);
        }
        return i2;
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBytesToWord = bytesToWord(bArr, i);
        int iBytesToWord2 = bytesToWord(bArr, i + 4);
        int iBytesToWord3 = bytesToWord(bArr, i + 8);
        int iBytesToWord4 = bytesToWord(bArr, i + 12);
        int[] iArr = this.f207488_S;
        int i3 = iBytesToWord3 - iArr[43];
        int iRotateRight = iBytesToWord - iArr[42];
        int i4 = 20;
        while (i4 >= 1) {
            int iRotateLeft = rotateLeft(((iRotateRight * 2) + 1) * iRotateRight, 5);
            int iRotateLeft2 = rotateLeft(((i3 * 2) + 1) * i3, 5);
            int i5 = i4 * 2;
            int iRotateRight2 = rotateRight(iBytesToWord2 - this.f207488_S[i5 + 1], iRotateLeft) ^ iRotateLeft2;
            i4--;
            int i6 = iRotateRight;
            iRotateRight = rotateRight(iBytesToWord4 - this.f207488_S[i5], iRotateLeft2) ^ iRotateLeft;
            iBytesToWord4 = i3;
            i3 = iRotateRight2;
            iBytesToWord2 = i6;
        }
        int[] iArr2 = this.f207488_S;
        int i7 = iBytesToWord4 - iArr2[1];
        int i8 = iBytesToWord2 - iArr2[0];
        wordToBytes(iRotateRight, bArr2, i2);
        wordToBytes(i8, bArr2, i2 + 4);
        wordToBytes(i3, bArr2, i2 + 8);
        wordToBytes(i7, bArr2, i2 + 12);
        return 16;
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBytesToWord = bytesToWord(bArr, i);
        int iBytesToWord2 = bytesToWord(bArr, i + 4);
        int iBytesToWord3 = bytesToWord(bArr, i + 8);
        int iBytesToWord4 = bytesToWord(bArr, i + 12);
        int[] iArr = this.f207488_S;
        int i3 = iBytesToWord2 + iArr[0];
        int i4 = iBytesToWord4 + iArr[1];
        int i5 = 1;
        while (i5 <= 20) {
            int iRotateLeft = rotateLeft(((i3 * 2) + 1) * i3, 5);
            int iRotateLeft2 = rotateLeft(((i4 * 2) + 1) * i4, 5);
            int i6 = i5 * 2;
            int iRotateLeft3 = rotateLeft(iBytesToWord ^ iRotateLeft, iRotateLeft2) + this.f207488_S[i6];
            int iRotateLeft4 = rotateLeft(iBytesToWord3 ^ iRotateLeft2, iRotateLeft) + this.f207488_S[i6 + 1];
            i5++;
            iBytesToWord3 = i4;
            i4 = iRotateLeft3;
            iBytesToWord = i3;
            i3 = iRotateLeft4;
        }
        int[] iArr2 = this.f207488_S;
        int i7 = iBytesToWord + iArr2[42];
        int i8 = iBytesToWord3 + iArr2[43];
        wordToBytes(i7, bArr2, i2);
        wordToBytes(i3, bArr2, i2 + 4);
        wordToBytes(i8, bArr2, i2 + 8);
        wordToBytes(i4, bArr2, i2 + 12);
        return 16;
    }

    private int rotateLeft(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    private int rotateRight(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = bArr.length;
        int length2 = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length2];
        for (int length3 = bArr.length - 1; length3 >= 0; length3--) {
            int i = length3 / 4;
            iArr2[i] = (iArr2[i] << 8) + (bArr[length3] & 255);
        }
        int[] iArr3 = new int[44];
        this.f207488_S = iArr3;
        iArr3[0] = P32;
        int i2 = 1;
        while (true) {
            iArr = this.f207488_S;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = iArr[i2 - 1] + Q32;
            i2++;
        }
        int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
        int length5 = 0;
        int iRotateLeft = 0;
        int iRotateLeft2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length4; i4++) {
            int[] iArr4 = this.f207488_S;
            iRotateLeft = rotateLeft(iArr4[length5] + iRotateLeft + iRotateLeft2, 3);
            iArr4[length5] = iRotateLeft;
            iRotateLeft2 = rotateLeft(iArr2[i3] + iRotateLeft + iRotateLeft2, iRotateLeft2 + iRotateLeft);
            iArr2[i3] = iRotateLeft2;
            length5 = (length5 + 1) % this.f207488_S.length;
            i3 = (i3 + 1) % length2;
        }
    }

    private void wordToBytes(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3 + i2] = (byte) i;
            i >>>= 8;
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC6";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            wg3.m206174a("invalid parameter passed to RC6 init - ".concat(cipherParameters.getClass().getName()));
        } else {
            this.forEncryption = z;
            setKey(((KeyParameter) cipherParameters).getKey());
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int blockSize = getBlockSize();
        if (this.f207488_S == null) {
            wtq0.m207906a("RC6 engine not initialised");
            return 0;
        }
        if (i + blockSize > bArr.length) {
            tyk0.m193596a("input buffer too short");
            return 0;
        }
        if (blockSize + i2 <= bArr2.length) {
            return this.forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
        }
        C17103g.m128363a("output buffer too short");
        return 0;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
