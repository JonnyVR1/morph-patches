package org.spongycastle.crypto;

import p153l.tyk0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class BufferedAsymmetricBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    private final AsymmetricBlockCipher cipher;

    public BufferedAsymmetricBlockCipher(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.cipher = asymmetricBlockCipher;
    }

    public byte[] doFinal() throws InvalidCipherTextException {
        byte[] bArrProcessBlock = this.cipher.processBlock(this.buf, 0, this.bufOff);
        reset();
        return bArrProcessBlock;
    }

    public int getBufferPosition() {
        return this.bufOff;
    }

    public int getInputBlockSize() {
        return this.cipher.getInputBlockSize();
    }

    public int getOutputBlockSize() {
        return this.cipher.getOutputBlockSize();
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        reset();
        this.cipher.init(z, cipherParameters);
        this.buf = new byte[this.cipher.getInputBlockSize() + (z ? 1 : 0)];
        this.bufOff = 0;
    }

    public void processByte(byte b) {
        int i = this.bufOff;
        byte[] bArr = this.buf;
        if (i >= bArr.length) {
            tyk0.m193596a("attempt to process message too long for cipher");
        } else {
            this.bufOff = i + 1;
            bArr[i] = b;
        }
    }

    public void processBytes(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        if (i2 < 0) {
            wg3.m206174a("Can't have a negative input length!");
            return;
        }
        int i3 = this.bufOff;
        int i4 = i3 + i2;
        byte[] bArr2 = this.buf;
        if (i4 > bArr2.length) {
            tyk0.m193596a("attempt to process message too long for cipher");
        } else {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.bufOff += i2;
        }
    }

    public void reset() {
        if (this.buf != null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.buf;
                if (i >= bArr.length) {
                    break;
                }
                bArr[i] = 0;
                i++;
            }
        }
        this.bufOff = 0;
    }
}
