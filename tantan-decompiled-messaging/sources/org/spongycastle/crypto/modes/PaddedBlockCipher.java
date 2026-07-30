package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import p149l.dql;
import p149l.ig3;
import p149l.npk0;

/* JADX INFO: loaded from: classes3.dex */
public class PaddedBlockCipher extends BufferedBlockCipher {
    public PaddedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException, DataLengthException {
        int iProcessBlock;
        int iProcessBlock2;
        int blockSize = this.cipher.getBlockSize();
        boolean z = this.forEncryption;
        int i2 = this.bufOff;
        if (z) {
            if (i2 != blockSize) {
                iProcessBlock2 = 0;
            } else {
                if ((blockSize * 2) + i > bArr.length) {
                    npk0.m160508a("output buffer too short");
                    return 0;
                }
                iProcessBlock2 = this.cipher.processBlock(this.buf, 0, bArr, i);
                this.bufOff = 0;
            }
            byte b = (byte) (blockSize - this.bufOff);
            while (true) {
                int i3 = this.bufOff;
                if (i3 >= blockSize) {
                    break;
                }
                this.buf[i3] = b;
                this.bufOff = i3 + 1;
            }
            iProcessBlock = iProcessBlock2 + this.cipher.processBlock(this.buf, 0, bArr, i + iProcessBlock2);
        } else {
            if (i2 != blockSize) {
                npk0.m160508a("last block incomplete in decryption");
                return 0;
            }
            BlockCipher blockCipher = this.cipher;
            byte[] bArr2 = this.buf;
            int iProcessBlock3 = blockCipher.processBlock(bArr2, 0, bArr2, 0);
            this.bufOff = 0;
            byte[] bArr3 = this.buf;
            int i4 = bArr3[blockSize - 1] & 255;
            if (i4 < 0 || i4 > blockSize) {
                dql.m113082a("pad block corrupted");
                return 0;
            }
            iProcessBlock = iProcessBlock3 - i4;
            System.arraycopy(bArr3, 0, bArr, i, iProcessBlock);
        }
        reset();
        return iProcessBlock;
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
        return length == 0 ? i2 - bArr.length : i2 - length;
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
            ig3.m135964a("Can't have a negative input length!");
            return 0;
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i2);
        if (updateOutputSize > 0 && updateOutputSize + i3 > bArr2.length) {
            npk0.m160508a("output buffer too short");
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
}
