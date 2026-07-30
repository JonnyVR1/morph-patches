package org.spongycastle.crypto.digests;

import l.ig3;
import org.spongycastle.crypto.ExtendedDigest;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NonMemoableDigest implements ExtendedDigest {
    private ExtendedDigest baseDigest;

    public NonMemoableDigest(ExtendedDigest extendedDigest) {
        if (extendedDigest != null) {
            this.baseDigest = extendedDigest;
        } else {
            ig3.a("baseDigest must not be null");
            throw null;
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return this.baseDigest.doFinal(bArr, i);
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.baseDigest.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.baseDigest.getByteLength();
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return this.baseDigest.getDigestSize();
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
