package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;

/* JADX INFO: loaded from: classes3.dex */
public class MD4Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;
    private static final int S11 = 3;
    private static final int S12 = 7;
    private static final int S13 = 11;
    private static final int S14 = 19;
    private static final int S21 = 3;
    private static final int S22 = 5;
    private static final int S23 = 9;
    private static final int S24 = 13;
    private static final int S31 = 3;
    private static final int S32 = 9;
    private static final int S33 = 11;
    private static final int S34 = 15;

    /* JADX INFO: renamed from: H1 */
    private int f206394H1;

    /* JADX INFO: renamed from: H2 */
    private int f206395H2;

    /* JADX INFO: renamed from: H3 */
    private int f206396H3;

    /* JADX INFO: renamed from: H4 */
    private int f206397H4;

    /* JADX INFO: renamed from: X */
    private int[] f206398X;
    private int xOff;

    public MD4Digest() {
        this.f206398X = new int[16];
        reset();
    }

    /* JADX INFO: renamed from: F */
    private int m221151F(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    /* JADX INFO: renamed from: G */
    private int m221152G(int i, int i2, int i3) {
        return ((i2 | i3) & i) | (i2 & i3);
    }

    /* JADX INFO: renamed from: H */
    private int m221153H(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private void copyIn(MD4Digest mD4Digest) {
        super.copyIn((GeneralDigest) mD4Digest);
        this.f206394H1 = mD4Digest.f206394H1;
        this.f206395H2 = mD4Digest.f206395H2;
        this.f206396H3 = mD4Digest.f206396H3;
        this.f206397H4 = mD4Digest.f206397H4;
        int[] iArr = mD4Digest.f206398X;
        System.arraycopy(iArr, 0, this.f206398X, 0, iArr.length);
        this.xOff = mD4Digest.xOff;
    }

    private int rotateLeft(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    private void unpackWord(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new MD4Digest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f206394H1, bArr, i);
        unpackWord(this.f206395H2, bArr, i + 4);
        unpackWord(this.f206396H3, bArr, i + 8);
        unpackWord(this.f206397H4, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD4";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i = this.f206394H1;
        int i2 = this.f206395H2;
        int i3 = this.f206396H3;
        int i4 = this.f206397H4;
        int iRotateLeft = rotateLeft(i + m221151F(i2, i3, i4) + this.f206398X[0], 3);
        int iRotateLeft2 = rotateLeft(i4 + m221151F(iRotateLeft, i2, i3) + this.f206398X[1], 7);
        int iRotateLeft3 = rotateLeft(i3 + m221151F(iRotateLeft2, iRotateLeft, i2) + this.f206398X[2], 11);
        int iRotateLeft4 = rotateLeft(i2 + m221151F(iRotateLeft3, iRotateLeft2, iRotateLeft) + this.f206398X[3], 19);
        int iRotateLeft5 = rotateLeft(iRotateLeft + m221151F(iRotateLeft4, iRotateLeft3, iRotateLeft2) + this.f206398X[4], 3);
        int iRotateLeft6 = rotateLeft(iRotateLeft2 + m221151F(iRotateLeft5, iRotateLeft4, iRotateLeft3) + this.f206398X[5], 7);
        int iRotateLeft7 = rotateLeft(iRotateLeft3 + m221151F(iRotateLeft6, iRotateLeft5, iRotateLeft4) + this.f206398X[6], 11);
        int iRotateLeft8 = rotateLeft(iRotateLeft4 + m221151F(iRotateLeft7, iRotateLeft6, iRotateLeft5) + this.f206398X[7], 19);
        int iRotateLeft9 = rotateLeft(iRotateLeft5 + m221151F(iRotateLeft8, iRotateLeft7, iRotateLeft6) + this.f206398X[8], 3);
        int iRotateLeft10 = rotateLeft(iRotateLeft6 + m221151F(iRotateLeft9, iRotateLeft8, iRotateLeft7) + this.f206398X[9], 7);
        int iRotateLeft11 = rotateLeft(iRotateLeft7 + m221151F(iRotateLeft10, iRotateLeft9, iRotateLeft8) + this.f206398X[10], 11);
        int iRotateLeft12 = rotateLeft(iRotateLeft8 + m221151F(iRotateLeft11, iRotateLeft10, iRotateLeft9) + this.f206398X[11], 19);
        int iRotateLeft13 = rotateLeft(iRotateLeft9 + m221151F(iRotateLeft12, iRotateLeft11, iRotateLeft10) + this.f206398X[12], 3);
        int iRotateLeft14 = rotateLeft(iRotateLeft10 + m221151F(iRotateLeft13, iRotateLeft12, iRotateLeft11) + this.f206398X[13], 7);
        int iRotateLeft15 = rotateLeft(iRotateLeft11 + m221151F(iRotateLeft14, iRotateLeft13, iRotateLeft12) + this.f206398X[14], 11);
        int iRotateLeft16 = rotateLeft(iRotateLeft12 + m221151F(iRotateLeft15, iRotateLeft14, iRotateLeft13) + this.f206398X[15], 19);
        int iRotateLeft17 = rotateLeft(iRotateLeft13 + m221152G(iRotateLeft16, iRotateLeft15, iRotateLeft14) + this.f206398X[0] + 1518500249, 3);
        int iRotateLeft18 = rotateLeft(iRotateLeft14 + m221152G(iRotateLeft17, iRotateLeft16, iRotateLeft15) + this.f206398X[4] + 1518500249, 5);
        int iRotateLeft19 = rotateLeft(iRotateLeft15 + m221152G(iRotateLeft18, iRotateLeft17, iRotateLeft16) + this.f206398X[8] + 1518500249, 9);
        int iRotateLeft20 = rotateLeft(iRotateLeft16 + m221152G(iRotateLeft19, iRotateLeft18, iRotateLeft17) + this.f206398X[12] + 1518500249, 13);
        int iRotateLeft21 = rotateLeft(iRotateLeft17 + m221152G(iRotateLeft20, iRotateLeft19, iRotateLeft18) + this.f206398X[1] + 1518500249, 3);
        int iRotateLeft22 = rotateLeft(iRotateLeft18 + m221152G(iRotateLeft21, iRotateLeft20, iRotateLeft19) + this.f206398X[5] + 1518500249, 5);
        int iRotateLeft23 = rotateLeft(iRotateLeft19 + m221152G(iRotateLeft22, iRotateLeft21, iRotateLeft20) + this.f206398X[9] + 1518500249, 9);
        int iRotateLeft24 = rotateLeft(iRotateLeft20 + m221152G(iRotateLeft23, iRotateLeft22, iRotateLeft21) + this.f206398X[13] + 1518500249, 13);
        int iRotateLeft25 = rotateLeft(iRotateLeft21 + m221152G(iRotateLeft24, iRotateLeft23, iRotateLeft22) + this.f206398X[2] + 1518500249, 3);
        int iRotateLeft26 = rotateLeft(iRotateLeft22 + m221152G(iRotateLeft25, iRotateLeft24, iRotateLeft23) + this.f206398X[6] + 1518500249, 5);
        int iRotateLeft27 = rotateLeft(iRotateLeft23 + m221152G(iRotateLeft26, iRotateLeft25, iRotateLeft24) + this.f206398X[10] + 1518500249, 9);
        int iRotateLeft28 = rotateLeft(iRotateLeft24 + m221152G(iRotateLeft27, iRotateLeft26, iRotateLeft25) + this.f206398X[14] + 1518500249, 13);
        int iRotateLeft29 = rotateLeft(iRotateLeft25 + m221152G(iRotateLeft28, iRotateLeft27, iRotateLeft26) + this.f206398X[3] + 1518500249, 3);
        int iRotateLeft30 = rotateLeft(iRotateLeft26 + m221152G(iRotateLeft29, iRotateLeft28, iRotateLeft27) + this.f206398X[7] + 1518500249, 5);
        int iRotateLeft31 = rotateLeft(iRotateLeft27 + m221152G(iRotateLeft30, iRotateLeft29, iRotateLeft28) + this.f206398X[11] + 1518500249, 9);
        int iRotateLeft32 = rotateLeft(iRotateLeft28 + m221152G(iRotateLeft31, iRotateLeft30, iRotateLeft29) + this.f206398X[15] + 1518500249, 13);
        int iRotateLeft33 = rotateLeft(iRotateLeft29 + m221153H(iRotateLeft32, iRotateLeft31, iRotateLeft30) + this.f206398X[0] + 1859775393, 3);
        int iRotateLeft34 = rotateLeft(iRotateLeft30 + m221153H(iRotateLeft33, iRotateLeft32, iRotateLeft31) + this.f206398X[8] + 1859775393, 9);
        int iRotateLeft35 = rotateLeft(iRotateLeft31 + m221153H(iRotateLeft34, iRotateLeft33, iRotateLeft32) + this.f206398X[4] + 1859775393, 11);
        int iRotateLeft36 = rotateLeft(iRotateLeft32 + m221153H(iRotateLeft35, iRotateLeft34, iRotateLeft33) + this.f206398X[12] + 1859775393, 15);
        int iRotateLeft37 = rotateLeft(iRotateLeft33 + m221153H(iRotateLeft36, iRotateLeft35, iRotateLeft34) + this.f206398X[2] + 1859775393, 3);
        int iRotateLeft38 = rotateLeft(iRotateLeft34 + m221153H(iRotateLeft37, iRotateLeft36, iRotateLeft35) + this.f206398X[10] + 1859775393, 9);
        int iRotateLeft39 = rotateLeft(iRotateLeft35 + m221153H(iRotateLeft38, iRotateLeft37, iRotateLeft36) + this.f206398X[6] + 1859775393, 11);
        int iRotateLeft40 = rotateLeft(iRotateLeft36 + m221153H(iRotateLeft39, iRotateLeft38, iRotateLeft37) + this.f206398X[14] + 1859775393, 15);
        int iRotateLeft41 = rotateLeft(iRotateLeft37 + m221153H(iRotateLeft40, iRotateLeft39, iRotateLeft38) + this.f206398X[1] + 1859775393, 3);
        int iRotateLeft42 = rotateLeft(iRotateLeft38 + m221153H(iRotateLeft41, iRotateLeft40, iRotateLeft39) + this.f206398X[9] + 1859775393, 9);
        int iRotateLeft43 = rotateLeft(iRotateLeft39 + m221153H(iRotateLeft42, iRotateLeft41, iRotateLeft40) + this.f206398X[5] + 1859775393, 11);
        int iRotateLeft44 = rotateLeft(iRotateLeft40 + m221153H(iRotateLeft43, iRotateLeft42, iRotateLeft41) + this.f206398X[13] + 1859775393, 15);
        int iRotateLeft45 = rotateLeft(iRotateLeft41 + m221153H(iRotateLeft44, iRotateLeft43, iRotateLeft42) + this.f206398X[3] + 1859775393, 3);
        int iRotateLeft46 = rotateLeft(iRotateLeft42 + m221153H(iRotateLeft45, iRotateLeft44, iRotateLeft43) + this.f206398X[11] + 1859775393, 9);
        int iRotateLeft47 = rotateLeft(iRotateLeft43 + m221153H(iRotateLeft46, iRotateLeft45, iRotateLeft44) + this.f206398X[7] + 1859775393, 11);
        int iRotateLeft48 = rotateLeft(iRotateLeft44 + m221153H(iRotateLeft47, iRotateLeft46, iRotateLeft45) + this.f206398X[15] + 1859775393, 15);
        this.f206394H1 += iRotateLeft45;
        this.f206395H2 += iRotateLeft48;
        this.f206396H3 += iRotateLeft47;
        this.f206397H4 += iRotateLeft46;
        this.xOff = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f206398X;
            if (i5 == iArr.length) {
                return;
            }
            iArr[i5] = 0;
            i5++;
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f206398X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f206398X;
        int i2 = this.xOff;
        int i3 = i2 + 1;
        this.xOff = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest, org.spongycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f206394H1 = 1732584193;
        this.f206395H2 = -271733879;
        this.f206396H3 = -1732584194;
        this.f206397H4 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f206398X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public MD4Digest(MD4Digest mD4Digest) {
        super(mD4Digest);
        this.f206398X = new int[16];
        copyIn(mD4Digest);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD4Digest) memoable);
    }
}
