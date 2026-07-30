package org.spongycastle.crypto.digests;

import l.ig3;
import org.spongycastle.crypto.ExtendedDigest;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ShortenedDigest implements ExtendedDigest {
    private ExtendedDigest baseDigest;
    private int length;

    public ShortenedDigest(ExtendedDigest extendedDigest, int i) {
        if (extendedDigest == null) {
            ig3.a("baseDigest must not be null");
            throw null;
        }
        if (i > extendedDigest.getDigestSize()) {
            ig3.a("baseDigest output not large enough to support length");
            throw null;
        }
        this.baseDigest = extendedDigest;
        this.length = i;
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = new byte[this.baseDigest.getDigestSize()];
        this.baseDigest.doFinal(bArr2, 0);
        System.arraycopy(bArr2, 0, bArr, i, this.length);
        return this.length;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.baseDigest.getAlgorithmName() + "(" + (this.length * 8) + ")";
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.baseDigest.getByteLength();
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return this.length;
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this.baseDigest.reset();
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b) {
        this.baseDigest.update(b);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        this.baseDigest.update(bArr, i, i2);
    }
}
