package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;

/* JADX INFO: loaded from: classes3.dex */
public class MD5Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;
    private static final int S11 = 7;
    private static final int S12 = 12;
    private static final int S13 = 17;
    private static final int S14 = 22;
    private static final int S21 = 5;
    private static final int S22 = 9;
    private static final int S23 = 14;
    private static final int S24 = 20;
    private static final int S31 = 4;
    private static final int S32 = 11;
    private static final int S33 = 16;
    private static final int S34 = 23;
    private static final int S41 = 6;
    private static final int S42 = 10;
    private static final int S43 = 15;
    private static final int S44 = 21;

    /* JADX INFO: renamed from: H1 */
    private int f207321H1;

    /* JADX INFO: renamed from: H2 */
    private int f207322H2;

    /* JADX INFO: renamed from: H3 */
    private int f207323H3;

    /* JADX INFO: renamed from: H4 */
    private int f207324H4;

    /* JADX INFO: renamed from: X */
    private int[] f207325X;
    private int xOff;

    public MD5Digest() {
        this.f207325X = new int[16];
        reset();
    }

    /* JADX INFO: renamed from: F */
    private int m222400F(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    /* JADX INFO: renamed from: G */
    private int m222401G(int i, int i2, int i3) {
        return (i & i3) | ((~i3) & i2);
    }

    /* JADX INFO: renamed from: H */
    private int m222402H(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* JADX INFO: renamed from: K */
    private int m222403K(int i, int i2, int i3) {
        return ((~i3) | i) ^ i2;
    }

    private void copyIn(MD5Digest mD5Digest) {
        super.copyIn((GeneralDigest) mD5Digest);
        this.f207321H1 = mD5Digest.f207321H1;
        this.f207322H2 = mD5Digest.f207322H2;
        this.f207323H3 = mD5Digest.f207323H3;
        this.f207324H4 = mD5Digest.f207324H4;
        int[] iArr = mD5Digest.f207325X;
        System.arraycopy(iArr, 0, this.f207325X, 0, iArr.length);
        this.xOff = mD5Digest.xOff;
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
        return new MD5Digest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f207321H1, bArr, i);
        unpackWord(this.f207322H2, bArr, i + 4);
        unpackWord(this.f207323H3, bArr, i + 8);
        unpackWord(this.f207324H4, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD5";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i = this.f207321H1;
        int i2 = this.f207322H2;
        int i3 = this.f207323H3;
        int i4 = this.f207324H4;
        int iRotateLeft = rotateLeft(((i + m222400F(i2, i3, i4)) + this.f207325X[0]) - 680876936, 7) + i2;
        int iRotateLeft2 = rotateLeft(((i4 + m222400F(iRotateLeft, i2, i3)) + this.f207325X[1]) - 389564586, 12) + iRotateLeft;
        int iRotateLeft3 = rotateLeft(i3 + m222400F(iRotateLeft2, iRotateLeft, i2) + this.f207325X[2] + 606105819, 17) + iRotateLeft2;
        int iRotateLeft4 = rotateLeft(((i2 + m222400F(iRotateLeft3, iRotateLeft2, iRotateLeft)) + this.f207325X[3]) - 1044525330, 22) + iRotateLeft3;
        int iRotateLeft5 = rotateLeft(((iRotateLeft + m222400F(iRotateLeft4, iRotateLeft3, iRotateLeft2)) + this.f207325X[4]) - 176418897, 7) + iRotateLeft4;
        int iRotateLeft6 = rotateLeft(iRotateLeft2 + m222400F(iRotateLeft5, iRotateLeft4, iRotateLeft3) + this.f207325X[5] + 1200080426, 12) + iRotateLeft5;
        int iRotateLeft7 = rotateLeft(((iRotateLeft3 + m222400F(iRotateLeft6, iRotateLeft5, iRotateLeft4)) + this.f207325X[6]) - 1473231341, 17) + iRotateLeft6;
        int iRotateLeft8 = rotateLeft(((iRotateLeft4 + m222400F(iRotateLeft7, iRotateLeft6, iRotateLeft5)) + this.f207325X[7]) - 45705983, 22) + iRotateLeft7;
        int iRotateLeft9 = rotateLeft(iRotateLeft5 + m222400F(iRotateLeft8, iRotateLeft7, iRotateLeft6) + this.f207325X[8] + 1770035416, 7) + iRotateLeft8;
        int iRotateLeft10 = rotateLeft(((iRotateLeft6 + m222400F(iRotateLeft9, iRotateLeft8, iRotateLeft7)) + this.f207325X[9]) - 1958414417, 12) + iRotateLeft9;
        int iRotateLeft11 = rotateLeft(((iRotateLeft7 + m222400F(iRotateLeft10, iRotateLeft9, iRotateLeft8)) + this.f207325X[10]) - 42063, 17) + iRotateLeft10;
        int iRotateLeft12 = rotateLeft(((iRotateLeft8 + m222400F(iRotateLeft11, iRotateLeft10, iRotateLeft9)) + this.f207325X[11]) - 1990404162, 22) + iRotateLeft11;
        int iRotateLeft13 = rotateLeft(iRotateLeft9 + m222400F(iRotateLeft12, iRotateLeft11, iRotateLeft10) + this.f207325X[12] + 1804603682, 7) + iRotateLeft12;
        int iRotateLeft14 = rotateLeft(((iRotateLeft10 + m222400F(iRotateLeft13, iRotateLeft12, iRotateLeft11)) + this.f207325X[13]) - 40341101, 12) + iRotateLeft13;
        int iRotateLeft15 = rotateLeft(((iRotateLeft11 + m222400F(iRotateLeft14, iRotateLeft13, iRotateLeft12)) + this.f207325X[14]) - 1502002290, 17) + iRotateLeft14;
        int iRotateLeft16 = rotateLeft(iRotateLeft12 + m222400F(iRotateLeft15, iRotateLeft14, iRotateLeft13) + this.f207325X[15] + 1236535329, 22) + iRotateLeft15;
        int iRotateLeft17 = rotateLeft(((iRotateLeft13 + m222401G(iRotateLeft16, iRotateLeft15, iRotateLeft14)) + this.f207325X[1]) - 165796510, 5) + iRotateLeft16;
        int iRotateLeft18 = rotateLeft(((iRotateLeft14 + m222401G(iRotateLeft17, iRotateLeft16, iRotateLeft15)) + this.f207325X[6]) - 1069501632, 9) + iRotateLeft17;
        int iRotateLeft19 = rotateLeft(iRotateLeft15 + m222401G(iRotateLeft18, iRotateLeft17, iRotateLeft16) + this.f207325X[11] + 643717713, 14) + iRotateLeft18;
        int iRotateLeft20 = rotateLeft(((iRotateLeft16 + m222401G(iRotateLeft19, iRotateLeft18, iRotateLeft17)) + this.f207325X[0]) - 373897302, 20) + iRotateLeft19;
        int iRotateLeft21 = rotateLeft(((iRotateLeft17 + m222401G(iRotateLeft20, iRotateLeft19, iRotateLeft18)) + this.f207325X[5]) - 701558691, 5) + iRotateLeft20;
        int iRotateLeft22 = rotateLeft(iRotateLeft18 + m222401G(iRotateLeft21, iRotateLeft20, iRotateLeft19) + this.f207325X[10] + 38016083, 9) + iRotateLeft21;
        int iRotateLeft23 = rotateLeft(((iRotateLeft19 + m222401G(iRotateLeft22, iRotateLeft21, iRotateLeft20)) + this.f207325X[15]) - 660478335, 14) + iRotateLeft22;
        int iRotateLeft24 = rotateLeft(((iRotateLeft20 + m222401G(iRotateLeft23, iRotateLeft22, iRotateLeft21)) + this.f207325X[4]) - 405537848, 20) + iRotateLeft23;
        int iRotateLeft25 = rotateLeft(iRotateLeft21 + m222401G(iRotateLeft24, iRotateLeft23, iRotateLeft22) + this.f207325X[9] + 568446438, 5) + iRotateLeft24;
        int iRotateLeft26 = rotateLeft(((iRotateLeft22 + m222401G(iRotateLeft25, iRotateLeft24, iRotateLeft23)) + this.f207325X[14]) - 1019803690, 9) + iRotateLeft25;
        int iRotateLeft27 = rotateLeft(((iRotateLeft23 + m222401G(iRotateLeft26, iRotateLeft25, iRotateLeft24)) + this.f207325X[3]) - 187363961, 14) + iRotateLeft26;
        int iRotateLeft28 = rotateLeft(iRotateLeft24 + m222401G(iRotateLeft27, iRotateLeft26, iRotateLeft25) + this.f207325X[8] + 1163531501, 20) + iRotateLeft27;
        int iRotateLeft29 = rotateLeft(((iRotateLeft25 + m222401G(iRotateLeft28, iRotateLeft27, iRotateLeft26)) + this.f207325X[13]) - 1444681467, 5) + iRotateLeft28;
        int iRotateLeft30 = rotateLeft(((iRotateLeft26 + m222401G(iRotateLeft29, iRotateLeft28, iRotateLeft27)) + this.f207325X[2]) - 51403784, 9) + iRotateLeft29;
        int iRotateLeft31 = rotateLeft(iRotateLeft27 + m222401G(iRotateLeft30, iRotateLeft29, iRotateLeft28) + this.f207325X[7] + 1735328473, 14) + iRotateLeft30;
        int iRotateLeft32 = rotateLeft(((iRotateLeft28 + m222401G(iRotateLeft31, iRotateLeft30, iRotateLeft29)) + this.f207325X[12]) - 1926607734, 20) + iRotateLeft31;
        int iRotateLeft33 = rotateLeft(((iRotateLeft29 + m222402H(iRotateLeft32, iRotateLeft31, iRotateLeft30)) + this.f207325X[5]) - 378558, 4) + iRotateLeft32;
        int iRotateLeft34 = rotateLeft(((iRotateLeft30 + m222402H(iRotateLeft33, iRotateLeft32, iRotateLeft31)) + this.f207325X[8]) - 2022574463, 11) + iRotateLeft33;
        int iRotateLeft35 = rotateLeft(iRotateLeft31 + m222402H(iRotateLeft34, iRotateLeft33, iRotateLeft32) + this.f207325X[11] + 1839030562, 16) + iRotateLeft34;
        int iRotateLeft36 = rotateLeft(((iRotateLeft32 + m222402H(iRotateLeft35, iRotateLeft34, iRotateLeft33)) + this.f207325X[14]) - 35309556, 23) + iRotateLeft35;
        int iRotateLeft37 = rotateLeft(((iRotateLeft33 + m222402H(iRotateLeft36, iRotateLeft35, iRotateLeft34)) + this.f207325X[1]) - 1530992060, 4) + iRotateLeft36;
        int iRotateLeft38 = rotateLeft(iRotateLeft34 + m222402H(iRotateLeft37, iRotateLeft36, iRotateLeft35) + this.f207325X[4] + 1272893353, 11) + iRotateLeft37;
        int iRotateLeft39 = rotateLeft(((iRotateLeft35 + m222402H(iRotateLeft38, iRotateLeft37, iRotateLeft36)) + this.f207325X[7]) - 155497632, 16) + iRotateLeft38;
        int iRotateLeft40 = rotateLeft(((iRotateLeft36 + m222402H(iRotateLeft39, iRotateLeft38, iRotateLeft37)) + this.f207325X[10]) - 1094730640, 23) + iRotateLeft39;
        int iRotateLeft41 = rotateLeft(iRotateLeft37 + m222402H(iRotateLeft40, iRotateLeft39, iRotateLeft38) + this.f207325X[13] + 681279174, 4) + iRotateLeft40;
        int iRotateLeft42 = rotateLeft(((iRotateLeft38 + m222402H(iRotateLeft41, iRotateLeft40, iRotateLeft39)) + this.f207325X[0]) - 358537222, 11) + iRotateLeft41;
        int iRotateLeft43 = rotateLeft(((iRotateLeft39 + m222402H(iRotateLeft42, iRotateLeft41, iRotateLeft40)) + this.f207325X[3]) - 722521979, 16) + iRotateLeft42;
        int iRotateLeft44 = rotateLeft(iRotateLeft40 + m222402H(iRotateLeft43, iRotateLeft42, iRotateLeft41) + this.f207325X[6] + 76029189, 23) + iRotateLeft43;
        int iRotateLeft45 = rotateLeft(((iRotateLeft41 + m222402H(iRotateLeft44, iRotateLeft43, iRotateLeft42)) + this.f207325X[9]) - 640364487, 4) + iRotateLeft44;
        int iRotateLeft46 = rotateLeft(((iRotateLeft42 + m222402H(iRotateLeft45, iRotateLeft44, iRotateLeft43)) + this.f207325X[12]) - 421815835, 11) + iRotateLeft45;
        int iRotateLeft47 = rotateLeft(iRotateLeft43 + m222402H(iRotateLeft46, iRotateLeft45, iRotateLeft44) + this.f207325X[15] + 530742520, 16) + iRotateLeft46;
        int iRotateLeft48 = rotateLeft(((iRotateLeft44 + m222402H(iRotateLeft47, iRotateLeft46, iRotateLeft45)) + this.f207325X[2]) - 995338651, 23) + iRotateLeft47;
        int iRotateLeft49 = rotateLeft(((iRotateLeft45 + m222403K(iRotateLeft48, iRotateLeft47, iRotateLeft46)) + this.f207325X[0]) - 198630844, 6) + iRotateLeft48;
        int iRotateLeft50 = rotateLeft(iRotateLeft46 + m222403K(iRotateLeft49, iRotateLeft48, iRotateLeft47) + this.f207325X[7] + 1126891415, 10) + iRotateLeft49;
        int iRotateLeft51 = rotateLeft(((iRotateLeft47 + m222403K(iRotateLeft50, iRotateLeft49, iRotateLeft48)) + this.f207325X[14]) - 1416354905, 15) + iRotateLeft50;
        int iRotateLeft52 = rotateLeft(((iRotateLeft48 + m222403K(iRotateLeft51, iRotateLeft50, iRotateLeft49)) + this.f207325X[5]) - 57434055, 21) + iRotateLeft51;
        int iRotateLeft53 = rotateLeft(iRotateLeft49 + m222403K(iRotateLeft52, iRotateLeft51, iRotateLeft50) + this.f207325X[12] + 1700485571, 6) + iRotateLeft52;
        int iRotateLeft54 = rotateLeft(((iRotateLeft50 + m222403K(iRotateLeft53, iRotateLeft52, iRotateLeft51)) + this.f207325X[3]) - 1894986606, 10) + iRotateLeft53;
        int iRotateLeft55 = rotateLeft(((iRotateLeft51 + m222403K(iRotateLeft54, iRotateLeft53, iRotateLeft52)) + this.f207325X[10]) - 1051523, 15) + iRotateLeft54;
        int iRotateLeft56 = rotateLeft(((iRotateLeft52 + m222403K(iRotateLeft55, iRotateLeft54, iRotateLeft53)) + this.f207325X[1]) - 2054922799, 21) + iRotateLeft55;
        int iRotateLeft57 = rotateLeft(iRotateLeft53 + m222403K(iRotateLeft56, iRotateLeft55, iRotateLeft54) + this.f207325X[8] + 1873313359, 6) + iRotateLeft56;
        int iRotateLeft58 = rotateLeft(((iRotateLeft54 + m222403K(iRotateLeft57, iRotateLeft56, iRotateLeft55)) + this.f207325X[15]) - 30611744, 10) + iRotateLeft57;
        int iRotateLeft59 = rotateLeft(((iRotateLeft55 + m222403K(iRotateLeft58, iRotateLeft57, iRotateLeft56)) + this.f207325X[6]) - 1560198380, 15) + iRotateLeft58;
        int iRotateLeft60 = rotateLeft(iRotateLeft56 + m222403K(iRotateLeft59, iRotateLeft58, iRotateLeft57) + this.f207325X[13] + 1309151649, 21) + iRotateLeft59;
        int iRotateLeft61 = rotateLeft(((iRotateLeft57 + m222403K(iRotateLeft60, iRotateLeft59, iRotateLeft58)) + this.f207325X[4]) - 145523070, 6) + iRotateLeft60;
        int iRotateLeft62 = rotateLeft(((iRotateLeft58 + m222403K(iRotateLeft61, iRotateLeft60, iRotateLeft59)) + this.f207325X[11]) - 1120210379, 10) + iRotateLeft61;
        int iRotateLeft63 = rotateLeft(iRotateLeft59 + m222403K(iRotateLeft62, iRotateLeft61, iRotateLeft60) + this.f207325X[2] + 718787259, 15) + iRotateLeft62;
        int iRotateLeft64 = rotateLeft(((iRotateLeft60 + m222403K(iRotateLeft63, iRotateLeft62, iRotateLeft61)) + this.f207325X[9]) - 343485551, 21) + iRotateLeft63;
        this.f207321H1 += iRotateLeft61;
        this.f207322H2 += iRotateLeft64;
        this.f207323H3 += iRotateLeft63;
        this.f207324H4 += iRotateLeft62;
        this.xOff = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f207325X;
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
        int[] iArr = this.f207325X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f207325X;
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
        this.f207321H1 = 1732584193;
        this.f207322H2 = -271733879;
        this.f207323H3 = -1732584194;
        this.f207324H4 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f207325X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public MD5Digest(MD5Digest mD5Digest) {
        super(mD5Digest);
        this.f207325X = new int[16];
        copyIn(mD5Digest);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD5Digest) memoable);
    }
}
