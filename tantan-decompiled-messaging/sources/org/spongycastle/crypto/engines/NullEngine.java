package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import p149l.C16968g;
import p149l.npk0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class NullEngine implements BlockCipher {
    protected static final int DEFAULT_BLOCK_SIZE = 1;
    private final int blockSize;
    private boolean initialised;

    public NullEngine(int i) {
        this.blockSize = i;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Null";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.initialised = true;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3 = 0;
        if (!this.initialised) {
            qkq0.m175383a("Null engine not initialised");
            return 0;
        }
        int i4 = this.blockSize;
        if (i + i4 > bArr.length) {
            npk0.m160508a("input buffer too short");
            return 0;
        }
        if (i4 + i2 > bArr2.length) {
            C16968g.m123940a("output buffer too short");
            return 0;
        }
        while (true) {
            int i5 = this.blockSize;
            if (i3 >= i5) {
                return i5;
            }
            bArr2[i2 + i3] = bArr[i + i3];
            i3++;
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    public NullEngine() {
        this(1);
    }
}
