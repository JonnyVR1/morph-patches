package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SHA224Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 28;

    /* JADX INFO: renamed from: K */
    static final int[] f206445K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* JADX INFO: renamed from: H1 */
    private int f206446H1;

    /* JADX INFO: renamed from: H2 */
    private int f206447H2;

    /* JADX INFO: renamed from: H3 */
    private int f206448H3;

    /* JADX INFO: renamed from: H4 */
    private int f206449H4;

    /* JADX INFO: renamed from: H5 */
    private int f206450H5;

    /* JADX INFO: renamed from: H6 */
    private int f206451H6;

    /* JADX INFO: renamed from: H7 */
    private int f206452H7;

    /* JADX INFO: renamed from: H8 */
    private int f206453H8;

    /* JADX INFO: renamed from: X */
    private int[] f206454X;
    private int xOff;

    public SHA224Digest(byte[] bArr) {
        super(bArr);
        this.f206454X = new int[64];
        this.f206446H1 = Pack.bigEndianToInt(bArr, 16);
        this.f206447H2 = Pack.bigEndianToInt(bArr, 20);
        this.f206448H3 = Pack.bigEndianToInt(bArr, 24);
        this.f206449H4 = Pack.bigEndianToInt(bArr, 28);
        this.f206450H5 = Pack.bigEndianToInt(bArr, 32);
        this.f206451H6 = Pack.bigEndianToInt(bArr, 36);
        this.f206452H7 = Pack.bigEndianToInt(bArr, 40);
        this.f206453H8 = Pack.bigEndianToInt(bArr, 44);
        this.xOff = Pack.bigEndianToInt(bArr, 48);
        for (int i = 0; i != this.xOff; i++) {
            this.f206454X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 52);
        }
    }

    /* JADX INFO: renamed from: Ch */
    private int m221191Ch(int i, int i2, int i3) {
        return (i & i2) ^ ((~i) & i3);
    }

    private int Maj(int i, int i2, int i3) {
        return ((i & i2) ^ (i & i3)) ^ (i2 & i3);
    }

    private int Sum0(int i) {
        return (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19))) ^ ((i << 10) | (i >>> 22));
    }

    private int Sum1(int i) {
        return (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21))) ^ ((i << 7) | (i >>> 25));
    }

    private int Theta0(int i) {
        return (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14))) ^ (i >>> 3);
    }

    private int Theta1(int i) {
        return (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13))) ^ (i >>> 10);
    }

    private void doCopy(SHA224Digest sHA224Digest) {
        super.copyIn(sHA224Digest);
        this.f206446H1 = sHA224Digest.f206446H1;
        this.f206447H2 = sHA224Digest.f206447H2;
        this.f206448H3 = sHA224Digest.f206448H3;
        this.f206449H4 = sHA224Digest.f206449H4;
        this.f206450H5 = sHA224Digest.f206450H5;
        this.f206451H6 = sHA224Digest.f206451H6;
        this.f206452H7 = sHA224Digest.f206452H7;
        this.f206453H8 = sHA224Digest.f206453H8;
        int[] iArr = sHA224Digest.f206454X;
        System.arraycopy(iArr, 0, this.f206454X, 0, iArr.length);
        this.xOff = sHA224Digest.xOff;
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new SHA224Digest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.f206446H1, bArr, i);
        Pack.intToBigEndian(this.f206447H2, bArr, i + 4);
        Pack.intToBigEndian(this.f206448H3, bArr, i + 8);
        Pack.intToBigEndian(this.f206449H4, bArr, i + 12);
        Pack.intToBigEndian(this.f206450H5, bArr, i + 16);
        Pack.intToBigEndian(this.f206451H6, bArr, i + 20);
        Pack.intToBigEndian(this.f206452H7, bArr, i + 24);
        reset();
        return 28;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-224";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 28;
    }

    @Override // org.spongycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 52];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f206446H1, bArr, 16);
        Pack.intToBigEndian(this.f206447H2, bArr, 20);
        Pack.intToBigEndian(this.f206448H3, bArr, 24);
        Pack.intToBigEndian(this.f206449H4, bArr, 28);
        Pack.intToBigEndian(this.f206450H5, bArr, 32);
        Pack.intToBigEndian(this.f206451H6, bArr, 36);
        Pack.intToBigEndian(this.f206452H7, bArr, 40);
        Pack.intToBigEndian(this.f206453H8, bArr, 44);
        Pack.intToBigEndian(this.xOff, bArr, 48);
        for (int i = 0; i != this.xOff; i++) {
            Pack.intToBigEndian(this.f206454X[i], bArr, (i * 4) + 52);
        }
        return bArr;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f206454X;
            int iTheta1 = Theta1(iArr[i - 2]);
            int[] iArr2 = this.f206454X;
            iArr[i] = iTheta1 + iArr2[i - 7] + Theta0(iArr2[i - 15]) + this.f206454X[i - 16];
        }
        int iSum0 = this.f206446H1;
        int iSum1 = this.f206447H2;
        int iSum2 = this.f206448H3;
        int iSum3 = this.f206449H4;
        int i2 = this.f206450H5;
        int i3 = this.f206451H6;
        int i4 = this.f206452H7;
        int i5 = this.f206453H8;
        int i6 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            int iSum4 = Sum1(i2) + m221191Ch(i2, i3, i4);
            int[] iArr3 = f206445K;
            int i8 = i5 + iSum4 + iArr3[i6] + this.f206454X[i6];
            int i9 = iSum3 + i8;
            int iSum5 = i8 + Sum0(iSum0) + Maj(iSum0, iSum1, iSum2);
            int i10 = i6 + 1;
            int iSum6 = i4 + Sum1(i9) + m221191Ch(i9, i2, i3) + iArr3[i10] + this.f206454X[i10];
            int i11 = iSum2 + iSum6;
            int iSum7 = iSum6 + Sum0(iSum5) + Maj(iSum5, iSum0, iSum1);
            int i12 = i6 + 2;
            int iSum8 = i3 + Sum1(i11) + m221191Ch(i11, i9, i2) + iArr3[i12] + this.f206454X[i12];
            int i13 = iSum1 + iSum8;
            int iSum9 = iSum8 + Sum0(iSum7) + Maj(iSum7, iSum5, iSum0);
            int i14 = i6 + 3;
            int iSum10 = i2 + Sum1(i13) + m221191Ch(i13, i11, i9) + iArr3[i14] + this.f206454X[i14];
            int i15 = iSum0 + iSum10;
            int iSum11 = iSum10 + Sum0(iSum9) + Maj(iSum9, iSum7, iSum5);
            int i16 = i6 + 4;
            int iSum12 = i9 + Sum1(i15) + m221191Ch(i15, i13, i11) + iArr3[i16] + this.f206454X[i16];
            i5 = iSum5 + iSum12;
            iSum3 = iSum12 + Sum0(iSum11) + Maj(iSum11, iSum9, iSum7);
            int i17 = i6 + 5;
            int iSum13 = i11 + Sum1(i5) + m221191Ch(i5, i15, i13) + iArr3[i17] + this.f206454X[i17];
            i4 = iSum7 + iSum13;
            iSum2 = iSum13 + Sum0(iSum3) + Maj(iSum3, iSum11, iSum9);
            int i18 = i6 + 6;
            int iSum14 = i13 + Sum1(i4) + m221191Ch(i4, i5, i15) + iArr3[i18] + this.f206454X[i18];
            i3 = iSum9 + iSum14;
            iSum1 = iSum14 + Sum0(iSum2) + Maj(iSum2, iSum3, iSum11);
            int i19 = i6 + 7;
            int iSum15 = i15 + Sum1(i3) + m221191Ch(i3, i4, i5) + iArr3[i19] + this.f206454X[i19];
            i2 = iSum11 + iSum15;
            iSum0 = iSum15 + Sum0(iSum1) + Maj(iSum1, iSum2, iSum3);
            i6 += 8;
        }
        this.f206446H1 += iSum0;
        this.f206447H2 += iSum1;
        this.f206448H3 += iSum2;
        this.f206449H4 += iSum3;
        this.f206450H5 += i2;
        this.f206451H6 += i3;
        this.f206452H7 += i4;
        this.f206453H8 += i5;
        this.xOff = 0;
        for (int i20 = 0; i20 < 16; i20++) {
            this.f206454X[i20] = 0;
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f206454X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.f206454X;
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
        this.f206446H1 = -1056596264;
        this.f206447H2 = 914150663;
        this.f206448H3 = 812702999;
        this.f206449H4 = -150054599;
        this.f206450H5 = -4191439;
        this.f206451H6 = 1750603025;
        this.f206452H7 = 1694076839;
        this.f206453H8 = -1090891868;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f206454X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        doCopy((SHA224Digest) memoable);
    }

    public SHA224Digest(SHA224Digest sHA224Digest) {
        super(sHA224Digest);
        this.f206454X = new int[64];
        doCopy(sHA224Digest);
    }

    public SHA224Digest() {
        this.f206454X = new int[64];
        reset();
    }
}
