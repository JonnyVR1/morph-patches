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
        Pack.longToBigEndian(this.f206381H1, bArr, i);
        Pack.longToBigEndian(this.f206382H2, bArr, i + 8);
        Pack.longToBigEndian(this.f206383H3, bArr, i + 16);
        Pack.longToBigEndian(this.f206384H4, bArr, i + 24);
        Pack.longToBigEndian(this.f206385H5, bArr, i + 32);
        Pack.longToBigEndian(this.f206386H6, bArr, i + 40);
        Pack.longToBigEndian(this.f206387H7, bArr, i + 48);
        Pack.longToBigEndian(this.f206388H8, bArr, i + 56);
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
        this.f206381H1 = 7640891576956012808L;
        this.f206382H2 = -4942790177534073029L;
        this.f206383H3 = 4354685564936845355L;
        this.f206384H4 = -6534734903238641935L;
        this.f206385H5 = 5840696475078001361L;
        this.f206386H6 = -7276294671716946913L;
        this.f206387H7 = 2270897969802886507L;
        this.f206388H8 = 6620516959819538809L;
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
