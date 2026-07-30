package org.spongycastle.crypto.macs;

import l.ig3;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.engines.DESEngine;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.paddings.BlockCipherPadding;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ISO9797Alg3Mac implements Mac {
    private byte[] buf;
    private int bufOff;
    private BlockCipher cipher;
    private KeyParameter lastKey2;
    private KeyParameter lastKey3;
    private byte[] mac;
    private int macSize;
    private BlockCipherPadding padding;

    public ISO9797Alg3Mac(BlockCipher blockCipher, int i, BlockCipherPadding blockCipherPadding) {
        if (i % 8 != 0) {
            ig3.a("MAC size must be multiple of 8");
            throw null;
        }
        if (!(blockCipher instanceof DESEngine)) {
            ig3.a("cipher must be instance of DESEngine");
            throw null;
        }
        this.cipher = new CBCBlockCipher(blockCipher);
        this.padding = blockCipherPadding;
        this.macSize = i / 8;
        this.mac = new byte[blockCipher.getBlockSize()];
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        int blockSize = this.cipher.getBlockSize();
        if (this.padding == null) {
            while (true) {
                int i2 = this.bufOff;
                if (i2 >= blockSize) {
                    break;
                }
                this.buf[i2] = 0;
                this.bufOff = i2 + 1;
            }
        } else {
            if (this.bufOff == blockSize) {
                this.cipher.processBlock(this.buf, 0, this.mac, 0);
                this.bufOff = 0;
            }
            this.padding.addPadding(this.buf, this.bufOff);
        }
        this.cipher.processBlock(this.buf, 0, this.mac, 0);
        DESEngine dESEngine = new DESEngine();
        dESEngine.init(false, this.lastKey2);
        byte[] bArr2 = this.mac;
        dESEngine.processBlock(bArr2, 0, bArr2, 0);
        dESEngine.init(true, this.lastKey3);
        byte[] bArr3 = this.mac;
        dESEngine.processBlock(bArr3, 0, bArr3, 0);
        System.arraycopy(this.mac, 0, bArr, i, this.macSize);
        reset();
        return this.macSize;
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return "ISO9797Alg3";
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        KeyParameter keyParameter;
        reset();
        boolean z = cipherParameters instanceof KeyParameter;
        if (!z && !(cipherParameters instanceof ParametersWithIV)) {
            ig3.a("params must be an instance of KeyParameter or ParametersWithIV");
            return;
        }
        byte[] key = (z ? (KeyParameter) cipherParameters : (KeyParameter) ((ParametersWithIV) cipherParameters).getParameters()).getKey();
        if (key.length == 16) {
            keyParameter = new KeyParameter(key, 0, 8);
            this.lastKey2 = new KeyParameter(key, 8, 8);
            this.lastKey3 = keyParameter;
        } else if (key.length != 24) {
            ig3.a("Key must be either 112 or 168 bit long");
            return;
        } else {
            keyParameter = new KeyParameter(key, 0, 8);
            this.lastKey2 = new KeyParameter(key, 8, 8);
            this.lastKey3 = new KeyParameter(key, 16, 8);
        }
        boolean z2 = cipherParameters instanceof ParametersWithIV;
        BlockCipher blockCipher = this.cipher;
        if (z2) {
            blockCipher.init(true, new ParametersWithIV(keyParameter, ((ParametersWithIV) cipherParameters).getIV()));
        } else {
            blockCipher.init(true, keyParameter);
        }
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

    public ISO9797Alg3Mac(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        this(blockCipher, blockCipher.getBlockSize() * 8, blockCipherPadding);
    }

    public ISO9797Alg3Mac(BlockCipher blockCipher, int i) {
        this(blockCipher, i, null);
    }

    public ISO9797Alg3Mac(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8, null);
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
