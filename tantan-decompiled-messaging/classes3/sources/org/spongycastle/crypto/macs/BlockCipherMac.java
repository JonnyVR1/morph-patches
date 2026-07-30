package org.spongycastle.crypto.macs;

import l.ig3;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.modes.CBCBlockCipher;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BlockCipherMac implements Mac {
    private byte[] buf;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] mac;
    private int macSize;

    public BlockCipherMac(BlockCipher blockCipher, int i) {
        if (i % 8 != 0) {
            ig3.a("MAC size must be multiple of 8");
            throw null;
        }
        this.cipher = new CBCBlockCipher(blockCipher);
        this.macSize = i / 8;
        this.mac = new byte[blockCipher.getBlockSize()];
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        int blockSize = this.cipher.getBlockSize();
        while (true) {
            int i2 = this.bufOff;
            if (i2 >= blockSize) {
                this.cipher.processBlock(this.buf, 0, this.mac, 0);
                System.arraycopy(this.mac, 0, bArr, i, this.macSize);
                reset();
                return this.macSize;
            }
            this.buf[i2] = 0;
            this.bufOff = i2 + 1;
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        reset();
        this.cipher.init(true, cipherParameters);
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            ig3.a("Can't have a negative input length!");
            return;
        }
        int blockSize = this.cipher.getBlockSize();
        int i3 = this.bufOff;
        int i4 = blockSize - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, this.buf, i3, i4);
            this.cipher.processBlock(this.buf, 0, this.mac, 0);
            this.bufOff = 0;
            i2 -= i4;
            i += i4;
            while (i2 > blockSize) {
                this.cipher.processBlock(bArr, i, this.mac, 0);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        System.arraycopy(bArr, i, this.buf, this.bufOff, i2);
        this.bufOff += i2;
    }

    public BlockCipherMac(BlockCipher blockCipher) {
        this(blockCipher, (blockCipher.getBlockSize() * 8) / 2);
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b) {
        int i = this.bufOff;
        byte[] bArr = this.buf;
        if (i == bArr.length) {
            this.cipher.processBlock(bArr, 0, this.mac, 0);
            this.bufOff = 0;
        }
        byte[] bArr2 = this.buf;
        int i2 = this.bufOff;
        this.bufOff = i2 + 1;
        bArr2[i2] = b;
    }
}
