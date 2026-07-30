package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import p153l.C17103g;
import p153l.tyk0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
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
            wg3.m206174a("invalid parameter passed to DESede init - ".concat(cipherParameters.getClass().getName()));
            return;
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 24 && key.length != 16) {
            wg3.m206174a("key size must be 16 or 24 bytes.");
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
            wtq0.m207906a("DESede engine not initialised");
            return 0;
        }
        if (i + 8 > bArr.length) {
            tyk0.m193596a("input buffer too short");
            return 0;
        }
        if (i2 + 8 > bArr2.length) {
            C17103g.m128363a("output buffer too short");
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
