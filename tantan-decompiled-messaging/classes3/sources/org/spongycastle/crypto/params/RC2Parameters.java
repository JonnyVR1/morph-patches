package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RC2Parameters extends KeyParameter {
    private int bits;

    public RC2Parameters(byte[] bArr) {
        this(bArr, bArr.length > 128 ? 1024 : bArr.length * 8);
    }

    public int getEffectiveKeyBits() {
        return this.bits;
    }

    public RC2Parameters(byte[] bArr, int i) {
        super(bArr);
        this.bits = i;
    }
}
