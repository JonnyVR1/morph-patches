package org.spongycastle.crypto.engines;

import l.ig3;
import l.qkq0;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import p003l.C0303g;
import p003l.npk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DESedeEngine extends DESEngine {
    protected static final int BLOCK_SIZE = 8;
    private boolean forEncryption;
    private int[] workingKey1 = null;
    private int[] workingKey2 = null;
    private int[] workingKey3 = null;

    @Override // org.spongycastle.crypto.engines.DESEngine, org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // org.spongycastle.crypto.engines.DESEngine, org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.engines.DESEngine, org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            ig3.a("invalid parameter passed to DESede init - ".concat(cipherParameters.getClass().getName()));
            return;
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 24 && key.length != 16) {
            ig3.a("key size must be 16 or 24 bytes.");
            return;
        }
        this.forEncryption = z;
        byte[] bArr = new byte[8];
        System.arraycopy(key, 0, bArr, 0, 8);
        this.workingKey1 = generateWorkingKey(z, bArr);
        byte[] bArr2 = new byte[8];
        System.arraycopy(key, 8, bArr2, 0, 8);
        this.workingKey2 = generateWorkingKey(!z, bArr2);
        if (key.length != 24) {
            this.workingKey3 = this.workingKey1;
            return;
        }
        byte[] bArr3 = new byte[8];
        System.arraycopy(key, 16, bArr3, 0, 8);
        this.workingKey3 = generateWorkingKey(z, bArr3);
    }

    @Override // org.spongycastle.crypto.engines.DESEngine, org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.workingKey1;
        if (iArr == null) {
            qkq0.a("DESede engine not initialised");
            return 0;
        }
        if (i + 8 > bArr.length) {
            npk0.m6558a("input buffer too short");
            return 0;
        }
        if (i2 + 8 > bArr2.length) {
            C0303g.m4499a("output buffer too short");
            return 0;
        }
        byte[] bArr3 = new byte[8];
        if (this.forEncryption) {
            desFunc(iArr, bArr, i, bArr3, 0);
            desFunc(this.workingKey2, bArr3, 0, bArr3, 0);
            desFunc(this.workingKey3, bArr3, 0, bArr2, i2);
        } else {
            desFunc(this.workingKey3, bArr, i, bArr3, 0);
            desFunc(this.workingKey2, bArr3, 0, bArr3, 0);
            desFunc(this.workingKey1, bArr3, 0, bArr2, i2);
        }
        return 8;
    }

    @Override // org.spongycastle.crypto.engines.DESEngine, org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
