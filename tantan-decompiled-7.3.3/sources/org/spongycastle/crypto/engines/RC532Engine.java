package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.RC5Parameters;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class RC532Engine implements BlockCipher {
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private boolean forEncryption;
    private int _noRounds = 12;

    /* JADX INFO: renamed from: _S */
    private int[] f207486_S = null;

    private int bytesToWord(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBytesToWord = bytesToWord(bArr, i);
        int iBytesToWord2 = bytesToWord(bArr, i + 4);
        int i3 = this._noRounds;
        while (true) {
            int[] iArr = this.f207486_S;
            if (i3 < 1) {
                wordToBytes(iBytesToWord - iArr[0], bArr2, i2);
                wordToBytes(iBytesToWord2 - this.f207486_S[1], bArr2, i2 + 4);
                return 8;
            }
            int i4 = i3 * 2;
            iBytesToWord2 = rotateRight(iBytesToWord2 - iArr[i4 + 1], iBytesToWord) ^ iBytesToWord;
            iBytesToWord = rotateRight(iBytesToWord - this.f207486_S[i4], iBytesToWord2) ^ iBytesToWord2;
            i3--;
        }
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBytesToWord = bytesToWord(bArr, i) + this.f207486_S[0];
        int iBytesToWord2 = bytesToWord(bArr, i + 4) + this.f207486_S[1];
        for (int i3 = 1; i3 <= this._noRounds; i3++) {
            int i4 = i3 * 2;
            iBytesToWord = rotateLeft(iBytesToWord ^ iBytesToWord2, iBytesToWord2) + this.f207486_S[i4];
            iBytesToWord2 = rotateLeft(iBytesToWord2 ^ iBytesToWord, iBytesToWord) + this.f207486_S[i4 + 1];
        }
        wordToBytes(iBytesToWord, bArr2, i2);
        wordToBytes(iBytesToWord2, bArr2, i2 + 4);
        return 8;
    }

    private int rotateLeft(int i, int i2) {
        int i3 = i2 & 31;
        return (i >>> (32 - i3)) | (i << i3);
    }

    private int rotateRight(int i, int i2) {
        int i3 = i2 & 31;
        return (i << (32 - i3)) | (i >>> i3);
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 4;
            iArr2[i2] = iArr2[i2] + ((bArr[i] & 255) << ((i % 4) * 8));
        }
        int[] iArr3 = new int[(this._noRounds + 1) * 2];
        this.f207486_S = iArr3;
        iArr3[0] = P32;
        int i3 = 1;
        while (true) {
            iArr = this.f207486_S;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = iArr[i3 - 1] + Q32;
            i3++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int length3 = 0;
        int iRotateLeft = 0;
        int iRotateLeft2 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length2; i5++) {
            int[] iArr4 = this.f207486_S;
            iRotateLeft = rotateLeft(iArr4[length3] + iRotateLeft + iRotateLeft2, 3);
            iArr4[length3] = iRotateLeft;
            iRotateLeft2 = rotateLeft(iArr2[i4] + iRotateLeft + iRotateLeft2, iRotateLeft2 + iRotateLeft);
            iArr2[i4] = iRotateLeft2;
            length3 = (length3 + 1) % this.f207486_S.length;
            i4 = (i4 + 1) % length;
        }
    }

    private void wordToBytes(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC5-32";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof RC5Parameters) {
            RC5Parameters rC5Parameters = (RC5Parameters) cipherParameters;
            this._noRounds = rC5Parameters.getRounds();
            setKey(rC5Parameters.getKey());
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                wg3.m206174a("invalid parameter passed to RC532 init - ".concat(cipherParameters.getClass().getName()));
                return;
            }
            setKey(((KeyParameter) cipherParameters).getKey());
        }
        this.forEncryption = z;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return this.forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
