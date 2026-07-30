package org.spongycastle.crypto.modes;

import l.ig3;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import p003l.npk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class OldCTSBlockCipher extends BufferedBlockCipher {
    private int blockSize;

    public OldCTSBlockCipher(BlockCipher blockCipher) {
        if ((blockCipher instanceof OFBBlockCipher) || (blockCipher instanceof CFBBlockCipher)) {
            ig3.a("CTSBlockCipher can only accept ECB, or CBC ciphers");
            throw null;
        }
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.buf = new byte[blockSize * 2];
        this.bufOff = 0;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException, DataLengthException {
        if (this.bufOff + i > bArr.length) {
            npk0.m6558a("output buffer to small in doFinal");
            return 0;
        }
        int blockSize = this.cipher.getBlockSize();
        int i2 = this.bufOff - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (this.forEncryption) {
            this.cipher.processBlock(this.buf, 0, bArr2, 0);
            int i3 = this.bufOff;
            if (i3 < blockSize) {
                npk0.m6558a("need at least one block of input for CTS");
                return 0;
            }
            while (true) {
                byte[] bArr3 = this.buf;
                if (i3 == bArr3.length) {
                    break;
                }
                bArr3[i3] = bArr2[i3 - blockSize];
                i3++;
            }
            for (int i4 = blockSize; i4 != this.bufOff; i4++) {
                byte[] bArr4 = this.buf;
                bArr4[i4] = (byte) (bArr4[i4] ^ bArr2[i4 - blockSize]);
            }
            BlockCipher blockCipher = this.cipher;
            if (blockCipher instanceof CBCBlockCipher) {
                ((CBCBlockCipher) blockCipher).getUnderlyingCipher().processBlock(this.buf, blockSize, bArr, i);
            } else {
                blockCipher.processBlock(this.buf, blockSize, bArr, i);
            }
            System.arraycopy(bArr2, 0, bArr, i + blockSize, i2);
        } else {
            byte[] bArr5 = new byte[blockSize];
            BlockCipher blockCipher2 = this.cipher;
            if (blockCipher2 instanceof CBCBlockCipher) {
                ((CBCBlockCipher) blockCipher2).getUnderlyingCipher().processBlock(this.buf, 0, bArr2, 0);
            } else {
                blockCipher2.processBlock(this.buf, 0, bArr2, 0);
            }
            for (int i5 = blockSize; i5 != this.bufOff; i5++) {
                int i6 = i5 - blockSize;
                bArr5[i6] = (byte) (bArr2[i6] ^ this.buf[i5]);
            }
            System.arraycopy(this.buf, blockSize, bArr2, 0, i2);
            this.cipher.processBlock(bArr2, 0, bArr, i);
            System.arraycopy(bArr5, 0, bArr, i + blockSize, i2);
        }
        int i7 = this.bufOff;
        reset();
        return i7;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        return i + this.bufOff;
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
            byte[] bArr3 = this.buf;
            int i4 = this.blockSize;
            System.arraycopy(bArr3, i4, bArr3, 0, i4);
            this.bufOff = this.blockSize;
            i3 = iProcessBlock;
        }
        byte[] bArr4 = this.buf;
        int i5 = this.bufOff;
        this.bufOff = i5 + 1;
        bArr4[i5] = b;
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
            npk0.m6558a("output buffer too short");
            return 0;
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i4 = this.bufOff;
        int i5 = length - i4;
        int i6 = 0;
        if (i2 > i5) {
            System.arraycopy(bArr, i, bArr3, i4, i5);
            int iProcessBlock = this.cipher.processBlock(this.buf, 0, bArr2, i3);
            byte[] bArr4 = this.buf;
            System.arraycopy(bArr4, blockSize, bArr4, 0, blockSize);
            this.bufOff = blockSize;
            i2 -= i5;
            i += i5;
            while (i2 > blockSize) {
                System.arraycopy(bArr, i, this.buf, this.bufOff, blockSize);
                iProcessBlock += this.cipher.processBlock(this.buf, 0, bArr2, i3 + iProcessBlock);
                byte[] bArr5 = this.buf;
                System.arraycopy(bArr5, blockSize, bArr5, 0, blockSize);
                i2 -= blockSize;
                i += blockSize;
            }
            i6 = iProcessBlock;
        }
        System.arraycopy(bArr, i, this.buf, this.bufOff, i2);
        this.bufOff += i2;
        return i6;
    }
}
