package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SHA512Digest extends LongDigest {
    private static final int DIGEST_LENGTH = 64;

    public SHA512Digest(byte[] bArr) {
        restoreState(bArr);
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new SHA512Digest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.longToBigEndian(this.f207303H1, bArr, i);
        Pack.longToBigEndian(this.f207304H2, bArr, i + 8);
        Pack.longToBigEndian(this.f207305H3, bArr, i + 16);
        Pack.longToBigEndian(this.f207306H4, bArr, i + 24);
        Pack.longToBigEndian(this.f207307H5, bArr, i + 32);
        Pack.longToBigEndian(this.f207308H6, bArr, i + 40);
        Pack.longToBigEndian(this.f207309H7, bArr, i + 48);
        Pack.longToBigEndian(this.f207310H8, bArr, i + 56);
        reset();
        return 64;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-512";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    @Override // org.spongycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[getEncodedStateSize()];
        super.populateState(bArr);
        return bArr;
    }

    @Override // org.spongycastle.crypto.digests.LongDigest, org.spongycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f207303H1 = 7640891576956012808L;
        this.f207304H2 = -4942790177534073029L;
        this.f207305H3 = 4354685564936845355L;
        this.f207306H4 = -6534734903238641935L;
        this.f207307H5 = 5840696475078001361L;
        this.f207308H6 = -7276294671716946913L;
        this.f207309H7 = 2270897969802886507L;
        this.f207310H8 = 6620516959819538809L;
    }

    public SHA512Digest(SHA512Digest sHA512Digest) {
        super(sHA512Digest);
    }

    public SHA512Digest() {
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((SHA512Digest) memoable);
    }
}
