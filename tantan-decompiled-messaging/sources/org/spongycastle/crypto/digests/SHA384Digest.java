package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SHA384Digest extends LongDigest {
    private static final int DIGEST_LENGTH = 48;

    public SHA384Digest(byte[] bArr) {
        restoreState(bArr);
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new SHA384Digest(this);
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
        reset();
        return 48;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-384";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 48;
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
        this.f206381H1 = -3766243637369397544L;
        this.f206382H2 = 7105036623409894663L;
        this.f206383H3 = -7973340178411365097L;
        this.f206384H4 = 1526699215303891257L;
        this.f206385H5 = 7436329637833083697L;
        this.f206386H6 = -8163818279084223215L;
        this.f206387H7 = -2662702644619276377L;
        this.f206388H8 = 5167115440072839076L;
    }

    public SHA384Digest(SHA384Digest sHA384Digest) {
        super(sHA384Digest);
    }

    public SHA384Digest() {
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        super.copyIn((SHA384Digest) memoable);
    }
}
