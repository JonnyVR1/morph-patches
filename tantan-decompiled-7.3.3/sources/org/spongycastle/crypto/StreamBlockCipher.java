package org.spongycastle.crypto;

import p153l.tyk0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StreamBlockCipher implements BlockCipher, StreamCipher {
    private final BlockCipher cipher;

    public StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    public abstract byte calculateByte(byte b);

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (i3 + i2 > bArr2.length) {
            tyk0.m193596a("output buffer too short");
            return 0;
        }
        int i4 = i + i2;
        if (i4 > bArr.length) {
            tyk0.m193596a("input buffer too small");
            return 0;
        }
        while (i < i4) {
            bArr2[i3] = calculateByte(bArr[i]);
            i3++;
            i++;
        }
        return i2;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public final byte returnByte(byte b) {
        return calculateByte(b);
    }
}
