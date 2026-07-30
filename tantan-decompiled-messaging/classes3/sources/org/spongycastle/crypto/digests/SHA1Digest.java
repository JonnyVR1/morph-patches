package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;

    /* JADX INFO: renamed from: Y1 */
    private static final int f10060Y1 = 1518500249;

    /* JADX INFO: renamed from: Y2 */
    private static final int f10061Y2 = 1859775393;

    /* JADX INFO: renamed from: Y3 */
    private static final int f10062Y3 = -1894007588;

    /* JADX INFO: renamed from: Y4 */
    private static final int f10063Y4 = -899497514;

    /* JADX INFO: renamed from: H1 */
    private int f10064H1;

    /* JADX INFO: renamed from: H2 */
    private int f10065H2;

    /* JADX INFO: renamed from: H3 */
    private int f10066H3;

    /* JADX INFO: renamed from: H4 */
    private int f10067H4;

    /* JADX INFO: renamed from: H5 */
    private int f10068H5;

    /* JADX INFO: renamed from: X */
    private int[] f10069X;
    private int xOff;

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.f10069X = new int[80];
        this.f10064H1 = Pack.bigEndianToInt(bArr, 16);
        this.f10065H2 = Pack.bigEndianToInt(bArr, 20);
        this.f10066H3 = Pack.bigEndianToInt(bArr, 24);
        this.f10067H4 = Pack.bigEndianToInt(bArr, 28);
        this.f10068H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            this.f10069X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 40);
        }
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.f10064H1 = sHA1Digest.f10064H1;
        this.f10065H2 = sHA1Digest.f10065H2;
        this.f10066H3 = sHA1Digest.f10066H3;
        this.f10067H4 = sHA1Digest.f10067H4;
        this.f10068H5 = sHA1Digest.f10068H5;
        int[] iArr = sHA1Digest.f10069X;
        System.arraycopy(iArr, 0, this.f10069X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    /* JADX INFO: renamed from: f */
    private int m9645f(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    /* JADX INFO: renamed from: g */
    private int m9646g(int i, int i2, int i3) {
        return ((i2 | i3) & i) | (i2 & i3);
    }

    /* JADX INFO: renamed from: h */
    private int m9647h(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.f10064H1, bArr, i);
        Pack.intToBigEndian(this.f10065H2, bArr, i + 4);
        Pack.intToBigEndian(this.f10066H3, bArr, i + 8);
        Pack.intToBigEndian(this.f10067H4, bArr, i + 12);
        Pack.intToBigEndian(this.f10068H5, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.spongycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 40];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f10064H1, bArr, 16);
        Pack.intToBigEndian(this.f10065H2, bArr, 20);
        Pack.intToBigEndian(this.f10066H3, bArr, 24);
        Pack.intToBigEndian(this.f10067H4, bArr, 28);
        Pack.intToBigEndian(this.f10068H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            Pack.intToBigEndian(this.f10069X[i], bArr, (i * 4) + 40);
        }
        return bArr;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.f10069X;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int iM9647h = this.f10064H1;
        int iM9647h2 = this.f10065H2;
        int i3 = this.f10066H3;
        int i4 = this.f10067H4;
        int i5 = this.f10068H5;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int iM9645f = i5 + ((iM9647h << 5) | (iM9647h >>> 27)) + m9645f(iM9647h2, i3, i4) + this.f10069X[i6] + f10060Y1;
            int i8 = (iM9647h2 >>> 2) | (iM9647h2 << 30);
            int iM9645f2 = i4 + ((iM9645f << 5) | (iM9645f >>> 27)) + m9645f(iM9647h, i8, i3) + this.f10069X[i6 + 1] + f10060Y1;
            int i9 = (iM9647h >>> 2) | (iM9647h << 30);
            int iM9645f3 = i3 + ((iM9645f2 << 5) | (iM9645f2 >>> 27)) + m9645f(iM9645f, i9, i8) + this.f10069X[i6 + 2] + f10060Y1;
            i5 = (iM9645f >>> 2) | (iM9645f << 30);
            int i10 = i6 + 4;
            iM9647h2 = i8 + ((iM9645f3 << 5) | (iM9645f3 >>> 27)) + m9645f(iM9645f2, i5, i9) + this.f10069X[i6 + 3] + f10060Y1;
            i4 = (iM9645f2 >>> 2) | (iM9645f2 << 30);
            i6 += 5;
            iM9647h = i9 + ((iM9647h2 << 5) | (iM9647h2 >>> 27)) + m9645f(iM9645f3, i4, i5) + this.f10069X[i10] + f10060Y1;
            i3 = (iM9645f3 >>> 2) | (iM9645f3 << 30);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int iM9647h3 = i5 + ((iM9647h << 5) | (iM9647h >>> 27)) + m9647h(iM9647h2, i3, i4) + this.f10069X[i6] + f10061Y2;
            int i12 = (iM9647h2 >>> 2) | (iM9647h2 << 30);
            int iM9647h4 = i4 + ((iM9647h3 << 5) | (iM9647h3 >>> 27)) + m9647h(iM9647h, i12, i3) + this.f10069X[i6 + 1] + f10061Y2;
            int i13 = (iM9647h >>> 2) | (iM9647h << 30);
            int iM9647h5 = i3 + ((iM9647h4 << 5) | (iM9647h4 >>> 27)) + m9647h(iM9647h3, i13, i12) + this.f10069X[i6 + 2] + f10061Y2;
            i5 = (iM9647h3 >>> 2) | (iM9647h3 << 30);
            int i14 = i6 + 4;
            iM9647h2 = i12 + ((iM9647h5 << 5) | (iM9647h5 >>> 27)) + m9647h(iM9647h4, i5, i13) + this.f10069X[i6 + 3] + f10061Y2;
            i4 = (iM9647h4 >>> 2) | (iM9647h4 << 30);
            i6 += 5;
            iM9647h = i13 + ((iM9647h2 << 5) | (iM9647h2 >>> 27)) + m9647h(iM9647h5, i4, i5) + this.f10069X[i14] + f10061Y2;
            i3 = (iM9647h5 >>> 2) | (iM9647h5 << 30);
        }
        for (int i15 = 0; i15 < 4; i15++) {
            int iM9646g = i5 + ((iM9647h << 5) | (iM9647h >>> 27)) + m9646g(iM9647h2, i3, i4) + this.f10069X[i6] + f10062Y3;
            int i16 = (iM9647h2 >>> 2) | (iM9647h2 << 30);
            int iM9646g2 = i4 + ((iM9646g << 5) | (iM9646g >>> 27)) + m9646g(iM9647h, i16, i3) + this.f10069X[i6 + 1] + f10062Y3;
            int i17 = (iM9647h >>> 2) | (iM9647h << 30);
            int iM9646g3 = i3 + ((iM9646g2 << 5) | (iM9646g2 >>> 27)) + m9646g(iM9646g, i17, i16) + this.f10069X[i6 + 2] + f10062Y3;
            i5 = (iM9646g >>> 2) | (iM9646g << 30);
            int i18 = i6 + 4;
            iM9647h2 = i16 + ((iM9646g3 << 5) | (iM9646g3 >>> 27)) + m9646g(iM9646g2, i5, i17) + this.f10069X[i6 + 3] + f10062Y3;
            i4 = (iM9646g2 >>> 2) | (iM9646g2 << 30);
            i6 += 5;
            iM9647h = i17 + ((iM9647h2 << 5) | (iM9647h2 >>> 27)) + m9646g(iM9646g3, i4, i5) + this.f10069X[i18] + f10062Y3;
            i3 = (iM9646g3 >>> 2) | (iM9646g3 << 30);
        }
        for (int i19 = 0; i19 <= 3; i19++) {
            int iM9647h6 = i5 + ((iM9647h << 5) | (iM9647h >>> 27)) + m9647h(iM9647h2, i3, i4) + this.f10069X[i6] + f10063Y4;
            int i20 = (iM9647h2 >>> 2) | (iM9647h2 << 30);
            int iM9647h7 = i4 + ((iM9647h6 << 5) | (iM9647h6 >>> 27)) + m9647h(iM9647h, i20, i3) + this.f10069X[i6 + 1] + f10063Y4;
            int i21 = (iM9647h >>> 2) | (iM9647h << 30);
            int iM9647h8 = i3 + ((iM9647h7 << 5) | (iM9647h7 >>> 27)) + m9647h(iM9647h6, i21, i20) + this.f10069X[i6 + 2] + f10063Y4;
            i5 = (iM9647h6 >>> 2) | (iM9647h6 << 30);
            int i22 = i6 + 4;
            iM9647h2 = i20 + ((iM9647h8 << 5) | (iM9647h8 >>> 27)) + m9647h(iM9647h7, i5, i21) + this.f10069X[i6 + 3] + f10063Y4;
            i4 = (iM9647h7 >>> 2) | (iM9647h7 << 30);
            i6 += 5;
            iM9647h = i21 + ((iM9647h2 << 5) | (iM9647h2 >>> 27)) + m9647h(iM9647h8, i4, i5) + this.f10069X[i22] + f10063Y4;
            i3 = (iM9647h8 >>> 2) | (iM9647h8 << 30);
        }
        this.f10064H1 += iM9647h;
        this.f10065H2 += iM9647h2;
        this.f10066H3 += i3;
        this.f10067H4 += i4;
        this.f10068H5 += i5;
        this.xOff = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            this.f10069X[i23] = 0;
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f10069X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.f10069X;
        int i3 = this.xOff;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.xOff = i4;
        if (i4 == 16) {
            processBlock();
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest, org.spongycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f10064H1 = 1732584193;
        this.f10065H2 = -271733879;
        this.f10066H3 = -1732584194;
        this.f10067H4 = 271733878;
        this.f10068H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f10069X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.f10069X = new int[80];
        copyIn(sHA1Digest);
    }

    public SHA1Digest() {
        this.f10069X = new int[80];
        reset();
    }
}
