package org.spongycastle.crypto.engines;

import l.ig3;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.RC5Parameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RC564Engine implements BlockCipher {
    private static final long P64 = -5196783011329398165L;
    private static final long Q64 = -7046029254386353131L;
    private static final int bytesPerWord = 8;
    private static final int wordSize = 64;
    private boolean forEncryption;
    private int _noRounds = 12;

    /* JADX INFO: renamed from: _S */
    private long[] f10190_S = null;

    private long bytesToWord(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            j = (j << 8) + ((long) (bArr[i2 + i] & 255));
        }
        return j;
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        long jBytesToWord = bytesToWord(bArr, i);
        long jBytesToWord2 = bytesToWord(bArr, i + 8);
        int i3 = this._noRounds;
        while (true) {
            long[] jArr = this.f10190_S;
            if (i3 < 1) {
                wordToBytes(jBytesToWord - jArr[0], bArr2, i2);
                wordToBytes(jBytesToWord2 - this.f10190_S[1], bArr2, i2 + 8);
                return 16;
            }
            int i4 = i3 * 2;
            jBytesToWord2 = rotateRight(jBytesToWord2 - jArr[i4 + 1], jBytesToWord) ^ jBytesToWord;
            jBytesToWord = rotateRight(jBytesToWord - this.f10190_S[i4], jBytesToWord2) ^ jBytesToWord2;
            i3--;
        }
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        long jBytesToWord = bytesToWord(bArr, i) + this.f10190_S[0];
        long jBytesToWord2 = bytesToWord(bArr, i + 8) + this.f10190_S[1];
        for (int i3 = 1; i3 <= this._noRounds; i3++) {
            int i4 = i3 * 2;
            jBytesToWord = rotateLeft(jBytesToWord ^ jBytesToWord2, jBytesToWord2) + this.f10190_S[i4];
            jBytesToWord2 = rotateLeft(jBytesToWord2 ^ jBytesToWord, jBytesToWord) + this.f10190_S[i4 + 1];
        }
        wordToBytes(jBytesToWord, bArr2, i2);
        wordToBytes(jBytesToWord2, bArr2, i2 + 8);
        return 16;
    }

    private long rotateLeft(long j, long j2) {
        long j3 = j2 & 63;
        return (j >>> ((int) (64 - j3))) | (j << ((int) j3));
    }

    private long rotateRight(long j, long j2) {
        long j3 = j2 & 63;
        return (j << ((int) (64 - j3))) | (j >>> ((int) j3));
    }

    private void setKey(byte[] bArr) {
        long[] jArr;
        int length = (bArr.length + 7) / 8;
        long[] jArr2 = new long[length];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 8;
            jArr2[i2] = jArr2[i2] + (((long) (bArr[i] & 255)) << ((i % 8) * 8));
        }
        long[] jArr3 = new long[(this._noRounds + 1) * 2];
        this.f10190_S = jArr3;
        jArr3[0] = -5196783011329398165L;
        int i3 = 1;
        while (true) {
            jArr = this.f10190_S;
            if (i3 >= jArr.length) {
                break;
            }
            jArr[i3] = jArr[i3 - 1] + Q64;
            i3++;
        }
        int length2 = length > jArr.length ? length * 3 : jArr.length * 3;
        long jRotateLeft = 0;
        long jRotateLeft2 = 0;
        int length3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length2; i5++) {
            long[] jArr4 = this.f10190_S;
            jRotateLeft = rotateLeft(jArr4[length3] + jRotateLeft + jRotateLeft2, 3L);
            jArr4[length3] = jRotateLeft;
            jRotateLeft2 = rotateLeft(jArr2[i4] + jRotateLeft + jRotateLeft2, jRotateLeft2 + jRotateLeft);
            jArr2[i4] = jRotateLeft2;
            length3 = (length3 + 1) % this.f10190_S.length;
            i4 = (i4 + 1) % length;
        }
    }

    private void wordToBytes(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2 + i] = (byte) j;
            j >>>= 8;
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC5-64";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof RC5Parameters)) {
            ig3.a("invalid parameter passed to RC564 init - ".concat(cipherParameters.getClass().getName()));
            return;
        }
        RC5Parameters rC5Parameters = (RC5Parameters) cipherParameters;
        this.forEncryption = z;
        this._noRounds = rC5Parameters.getRounds();
        setKey(rC5Parameters.getKey());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return this.forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
