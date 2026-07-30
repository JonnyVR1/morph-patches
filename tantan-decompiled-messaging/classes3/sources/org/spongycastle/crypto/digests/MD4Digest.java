package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
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
    private int f10019H1;

    /* JADX INFO: renamed from: H2 */
    private int f10020H2;

    /* JADX INFO: renamed from: H3 */
    private int f10021H3;

    /* JADX INFO: renamed from: H4 */
    private int f10022H4;

    /* JADX INFO: renamed from: X */
    private int[] f10023X;
    private int xOff;

    public MD4Digest() {
        this.f10023X = new int[16];
        reset();
    }

    /* JADX INFO: renamed from: F */
    private int m9608F(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    /* JADX INFO: renamed from: G */
    private int m9609G(int i, int i2, int i3) {
        return ((i2 | i3) & i) | (i2 & i3);
    }

    /* JADX INFO: renamed from: H */
    private int m9610H(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private void copyIn(MD4Digest mD4Digest) {
        super.copyIn((GeneralDigest) mD4Digest);
        this.f10019H1 = mD4Digest.f10019H1;
        this.f10020H2 = mD4Digest.f10020H2;
        this.f10021H3 = mD4Digest.f10021H3;
        this.f10022H4 = mD4Digest.f10022H4;
        int[] iArr = mD4Digest.f10023X;
        System.arraycopy(iArr, 0, this.f10023X, 0, iArr.length);
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
        unpackWord(this.f10019H1, bArr, i);
        unpackWord(this.f10020H2, bArr, i + 4);
        unpackWord(this.f10021H3, bArr, i + 8);
        unpackWord(this.f10022H4, bArr, i + 12);
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
        int i = this.f10019H1;
        int i2 = this.f10020H2;
        int i3 = this.f10021H3;
        int i4 = this.f10022H4;
        int iRotateLeft = rotateLeft(i + m9608F(i2, i3, i4) + this.f10023X[0], 3);
        int iRotateLeft2 = rotateLeft(i4 + m9608F(iRotateLeft, i2, i3) + this.f10023X[1], 7);
        int iRotateLeft3 = rotateLeft(i3 + m9608F(iRotateLeft2, iRotateLeft, i2) + this.f10023X[2], 11);
        int iRotateLeft4 = rotateLeft(i2 + m9608F(iRotateLeft3, iRotateLeft2, iRotateLeft) + this.f10023X[3], 19);
        int iRotateLeft5 = rotateLeft(iRotateLeft + m9608F(iRotateLeft4, iRotateLeft3, iRotateLeft2) + this.f10023X[4], 3);
        int iRotateLeft6 = rotateLeft(iRotateLeft2 + m9608F(iRotateLeft5, iRotateLeft4, iRotateLeft3) + this.f10023X[5], 7);
        int iRotateLeft7 = rotateLeft(iRotateLeft3 + m9608F(iRotateLeft6, iRotateLeft5, iRotateLeft4) + this.f10023X[6], 11);
        int iRotateLeft8 = rotateLeft(iRotateLeft4 + m9608F(iRotateLeft7, iRotateLeft6, iRotateLeft5) + this.f10023X[7], 19);
        int iRotateLeft9 = rotateLeft(iRotateLeft5 + m9608F(iRotateLeft8, iRotateLeft7, iRotateLeft6) + this.f10023X[8], 3);
        int iRotateLeft10 = rotateLeft(iRotateLeft6 + m9608F(iRotateLeft9, iRotateLeft8, iRotateLeft7) + this.f10023X[9], 7);
        int iRotateLeft11 = rotateLeft(iRotateLeft7 + m9608F(iRotateLeft10, iRotateLeft9, iRotateLeft8) + this.f10023X[10], 11);
        int iRotateLeft12 = rotateLeft(iRotateLeft8 + m9608F(iRotateLeft11, iRotateLeft10, iRotateLeft9) + this.f10023X[11], 19);
        int iRotateLeft13 = rotateLeft(iRotateLeft9 + m9608F(iRotateLeft12, iRotateLeft11, iRotateLeft10) + this.f10023X[12], 3);
        int iRotateLeft14 = rotateLeft(iRotateLeft10 + m9608F(iRotateLeft13, iRotateLeft12, iRotateLeft11) + this.f10023X[13], 7);
        int iRotateLeft15 = rotateLeft(iRotateLeft11 + m9608F(iRotateLeft14, iRotateLeft13, iRotateLeft12) + this.f10023X[14], 11);
        int iRotateLeft16 = rotateLeft(iRotateLeft12 + m9608F(iRotateLeft15, iRotateLeft14, iRotateLeft13) + this.f10023X[15], 19);
        int iRotateLeft17 = rotateLeft(iRotateLeft13 + m9609G(iRotateLeft16, iRotateLeft15, iRotateLeft14) + this.f10023X[0] + 1518500249, 3);
        int iRotateLeft18 = rotateLeft(iRotateLeft14 + m9609G(iRotateLeft17, iRotateLeft16, iRotateLeft15) + this.f10023X[4] + 1518500249, 5);
        int iRotateLeft19 = rotateLeft(iRotateLeft15 + m9609G(iRotateLeft18, iRotateLeft17, iRotateLeft16) + this.f10023X[8] + 1518500249, 9);
        int iRotateLeft20 = rotateLeft(iRotateLeft16 + m9609G(iRotateLeft19, iRotateLeft18, iRotateLeft17) + this.f10023X[12] + 1518500249, 13);
        int iRotateLeft21 = rotateLeft(iRotateLeft17 + m9609G(iRotateLeft20, iRotateLeft19, iRotateLeft18) + this.f10023X[1] + 1518500249, 3);
        int iRotateLeft22 = rotateLeft(iRotateLeft18 + m9609G(iRotateLeft21, iRotateLeft20, iRotateLeft19) + this.f10023X[5] + 1518500249, 5);
        int iRotateLeft23 = rotateLeft(iRotateLeft19 + m9609G(iRotateLeft22, iRotateLeft21, iRotateLeft20) + this.f10023X[9] + 1518500249, 9);
        int iRotateLeft24 = rotateLeft(iRotateLeft20 + m9609G(iRotateLeft23, iRotateLeft22, iRotateLeft21) + this.f10023X[13] + 1518500249, 13);
        int iRotateLeft25 = rotateLeft(iRotateLeft21 + m9609G(iRotateLeft24, iRotateLeft23, iRotateLeft22) + this.f10023X[2] + 1518500249, 3);
        int iRotateLeft26 = rotateLeft(iRotateLeft22 + m9609G(iRotateLeft25, iRotateLeft24, iRotateLeft23) + this.f10023X[6] + 1518500249, 5);
        int iRotateLeft27 = rotateLeft(iRotateLeft23 + m9609G(iRotateLeft26, iRotateLeft25, iRotateLeft24) + this.f10023X[10] + 1518500249, 9);
        int iRotateLeft28 = rotateLeft(iRotateLeft24 + m9609G(iRotateLeft27, iRotateLeft26, iRotateLeft25) + this.f10023X[14] + 1518500249, 13);
        int iRotateLeft29 = rotateLeft(iRotateLeft25 + m9609G(iRotateLeft28, iRotateLeft27, iRotateLeft26) + this.f10023X[3] + 1518500249, 3);
        int iRotateLeft30 = rotateLeft(iRotateLeft26 + m9609G(iRotateLeft29, iRotateLeft28, iRotateLeft27) + this.f10023X[7] + 1518500249, 5);
        int iRotateLeft31 = rotateLeft(iRotateLeft27 + m9609G(iRotateLeft30, iRotateLeft29, iRotateLeft28) + this.f10023X[11] + 1518500249, 9);
        int iRotateLeft32 = rotateLeft(iRotateLeft28 + m9609G(iRotateLeft31, iRotateLeft30, iRotateLeft29) + this.f10023X[15] + 1518500249, 13);
        int iRotateLeft33 = rotateLeft(iRotateLeft29 + m9610H(iRotateLeft32, iRotateLeft31, iRotateLeft30) + this.f10023X[0] + 1859775393, 3);
        int iRotateLeft34 = rotateLeft(iRotateLeft30 + m9610H(iRotateLeft33, iRotateLeft32, iRotateLeft31) + this.f10023X[8] + 1859775393, 9);
        int iRotateLeft35 = rotateLeft(iRotateLeft31 + m9610H(iRotateLeft34, iRotateLeft33, iRotateLeft32) + this.f10023X[4] + 1859775393, 11);
        int iRotateLeft36 = rotateLeft(iRotateLeft32 + m9610H(iRotateLeft35, iRotateLeft34, iRotateLeft33) + this.f10023X[12] + 1859775393, 15);
        int iRotateLeft37 = rotateLeft(iRotateLeft33 + m9610H(iRotateLeft36, iRotateLeft35, iRotateLeft34) + this.f10023X[2] + 1859775393, 3);
        int iRotateLeft38 = rotateLeft(iRotateLeft34 + m9610H(iRotateLeft37, iRotateLeft36, iRotateLeft35) + this.f10023X[10] + 1859775393, 9);
        int iRotateLeft39 = rotateLeft(iRotateLeft35 + m9610H(iRotateLeft38, iRotateLeft37, iRotateLeft36) + this.f10023X[6] + 1859775393, 11);
        int iRotateLeft40 = rotateLeft(iRotateLeft36 + m9610H(iRotateLeft39, iRotateLeft38, iRotateLeft37) + this.f10023X[14] + 1859775393, 15);
        int iRotateLeft41 = rotateLeft(iRotateLeft37 + m9610H(iRotateLeft40, iRotateLeft39, iRotateLeft38) + this.f10023X[1] + 1859775393, 3);
        int iRotateLeft42 = rotateLeft(iRotateLeft38 + m9610H(iRotateLeft41, iRotateLeft40, iRotateLeft39) + this.f10023X[9] + 1859775393, 9);
        int iRotateLeft43 = rotateLeft(iRotateLeft39 + m9610H(iRotateLeft42, iRotateLeft41, iRotateLeft40) + this.f10023X[5] + 1859775393, 11);
        int iRotateLeft44 = rotateLeft(iRotateLeft40 + m9610H(iRotateLeft43, iRotateLeft42, iRotateLeft41) + this.f10023X[13] + 1859775393, 15);
        int iRotateLeft45 = rotateLeft(iRotateLeft41 + m9610H(iRotateLeft44, iRotateLeft43, iRotateLeft42) + this.f10023X[3] + 1859775393, 3);
        int iRotateLeft46 = rotateLeft(iRotateLeft42 + m9610H(iRotateLeft45, iRotateLeft44, iRotateLeft43) + this.f10023X[11] + 1859775393, 9);
        int iRotateLeft47 = rotateLeft(iRotateLeft43 + m9610H(iRotateLeft46, iRotateLeft45, iRotateLeft44) + this.f10023X[7] + 1859775393, 11);
        int iRotateLeft48 = rotateLeft(iRotateLeft44 + m9610H(iRotateLeft47, iRotateLeft46, iRotateLeft45) + this.f10023X[15] + 1859775393, 15);
        this.f10019H1 += iRotateLeft45;
        this.f10020H2 += iRotateLeft48;
        this.f10021H3 += iRotateLeft47;
        this.f10022H4 += iRotateLeft46;
        this.xOff = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f10023X;
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
        int[] iArr = this.f10023X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f10023X;
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
        this.f10019H1 = 1732584193;
        this.f10020H2 = -271733879;
        this.f10021H3 = -1732584194;
        this.f10022H4 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f10023X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public MD4Digest(MD4Digest mD4Digest) {
        super(mD4Digest);
        this.f10023X = new int[16];
        copyIn(mD4Digest);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD4Digest) memoable);
    }
}
