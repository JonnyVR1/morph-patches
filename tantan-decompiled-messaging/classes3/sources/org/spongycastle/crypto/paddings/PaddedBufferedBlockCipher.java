package org.spongycastle.crypto.paddings;

import l.ig3;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import p003l.C0303g;
import p003l.npk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PaddedBufferedBlockCipher extends BufferedBlockCipher {
    BlockCipherPadding padding;

    public PaddedBufferedBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        this.cipher = blockCipher;
        this.padding = blockCipherPadding;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException, DataLengthException {
        int iProcessBlock;
        int blockSize = this.cipher.getBlockSize();
        boolean z = this.forEncryption;
        int i2 = this.bufOff;
        if (z) {
            if (i2 != blockSize) {
                iProcessBlock = 0;
            } else {
                if ((blockSize * 2) + i > bArr.length) {
                    reset();
                    C0303g.m4499a("output buffer too short");
                    return 0;
                }
                iProcessBlock = this.cipher.processBlock(this.buf, 0, bArr, i);
                this.bufOff = 0;
            }
            this.padding.addPadding(this.buf, this.bufOff);
            int iProcessBlock2 = iProcessBlock + this.cipher.processBlock(this.buf, 0, bArr, i + iProcessBlock);
            reset();
            return iProcessBlock2;
        }
        if (i2 != blockSize) {
            reset();
            npk0.m6558a("last block incomplete in decryption");
            return 0;
        }
        BlockCipher blockCipher = this.cipher;
        byte[] bArr2 = this.buf;
        int iProcessBlock3 = blockCipher.processBlock(bArr2, 0, bArr2, 0);
        this.bufOff = 0;
        try {
            int iPadCount = iProcessBlock3 - this.padding.padCount(this.buf);
            System.arraycopy(this.buf, 0, bArr, i, iPadCount);
            return iPadCount;
        } finally {
            reset();
        }
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        int length;
        int i2 = i + this.bufOff;
        byte[] bArr = this.buf;
        int length2 = i2 % bArr.length;
        if (length2 != 0) {
            i2 -= length2;
            length = bArr.length;
        } else {
            if (!this.forEncryption) {
                return i2;
            }
            length = bArr.length;
        }
        return i2 + length;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.bufOff;
        byte[] bArr = this.buf;
        int length = i2 % bArr.length;
        return length == 0 ? Math.max(0, i2 - bArr.length) : i2 - length;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.forEncryption = z;
        reset();
        boolean z2 = cipherParameters instanceof ParametersWithRandom;
        BlockCipherPadding blockCipherPadding = this.padding;
        if (!z2) {
            blockCipherPadding.init(null);
            this.cipher.init(z, cipherParameters);
        } else {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            blockCipherPadding.init(parametersWithRandom.getRandom());
            this.cipher.init(z, parametersWithRandom.getParameters());
        }
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int processByte(byte b, byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        int i2 = this.bufOff;
        byte[] bArr2 = this.buf;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int iProcessBlock = this.cipher.processBlock(bArr2, 0, bArr, i);
            this.bufOff = 0;
            i3 = iProcessBlock;
        }
        byte[] bArr3 = this.buf;
        int i4 = this.bufOff;
        this.bufOff = i4 + 1;
        bArr3[i4] = b;
        return i3;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException {
        if (i2 < 0) {
            ig3.a("Can't have a negative input length!");
            return 0;
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i2);
        if (updateOutputSize > 0 && updateOutputSize + i3 > bArr2.length) {
            C0303g.m4499a("output buffer too short");
            return 0;
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i4 = this.bufOff;
        int i5 = length - i4;
        int iProcessBlock = 0;
        if (i2 > i5) {
            System.arraycopy(bArr, i, bArr3, i4, i5);
            int iProcessBlock2 = this.cipher.processBlock(this.buf, 0, bArr2, i3);
            this.bufOff = 0;
            i2 -= i5;
            i += i5;
            iProcessBlock = iProcessBlock2;
            while (i2 > this.buf.length) {
                iProcessBlock += this.cipher.processBlock(bArr, i, bArr2, i3 + iProcessBlock);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        System.arraycopy(bArr, i, this.buf, this.bufOff, i2);
        this.bufOff += i2;
        return iProcessBlock;
    }

    public PaddedBufferedBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, new PKCS7Padding());
    }
}
