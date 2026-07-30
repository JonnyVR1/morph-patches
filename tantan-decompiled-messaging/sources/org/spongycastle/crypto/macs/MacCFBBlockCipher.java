package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithIV;
import p149l.npk0;

/* JADX INFO: loaded from: classes3.dex */
class MacCFBBlockCipher {

    /* JADX INFO: renamed from: IV */
    private byte[] f206618IV;
    private int blockSize;
    private byte[] cfbOutV;
    private byte[] cfbV;
    private BlockCipher cipher;

    public MacCFBBlockCipher(BlockCipher blockCipher, int i) {
        this.cipher = blockCipher;
        this.blockSize = i / 8;
        this.f206618IV = new byte[blockCipher.getBlockSize()];
        this.cfbV = new byte[blockCipher.getBlockSize()];
        this.cfbOutV = new byte[blockCipher.getBlockSize()];
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CFB" + (this.blockSize * 8);
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    public void getMacBlock(byte[] bArr) {
        this.cipher.processBlock(this.cfbV, 0, bArr, 0);
    }

    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            reset();
            this.cipher.init(true, cipherParameters);
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        int length = iv.length;
        byte[] bArr = this.f206618IV;
        if (length < bArr.length) {
            System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
        } else {
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
        }
        reset();
        this.cipher.init(true, parametersWithIV.getParameters());
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3 = this.blockSize;
        if (i + i3 > bArr.length) {
            npk0.m160508a("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            npk0.m160508a("output buffer too short");
            return 0;
        }
        this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        int i4 = 0;
        while (true) {
            int i5 = this.blockSize;
            if (i4 >= i5) {
                byte[] bArr3 = this.cfbV;
                System.arraycopy(bArr3, i5, bArr3, 0, bArr3.length - i5);
                byte[] bArr4 = this.cfbV;
                int length = bArr4.length;
                int i6 = this.blockSize;
                System.arraycopy(bArr2, i2, bArr4, length - i6, i6);
                return this.blockSize;
            }
            bArr2[i2 + i4] = (byte) (this.cfbOutV[i4] ^ bArr[i + i4]);
            i4++;
        }
    }

    public void reset() {
        byte[] bArr = this.f206618IV;
        System.arraycopy(bArr, 0, this.cfbV, 0, bArr.length);
        this.cipher.reset();
    }
}
