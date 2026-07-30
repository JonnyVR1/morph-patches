package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;

    /* JADX INFO: renamed from: T */
    private static final int[] f206465T = new int[64];

    /* JADX INFO: renamed from: V */
    private int[] f206466V;

    /* JADX INFO: renamed from: W */
    private int[] f206467W;

    /* JADX INFO: renamed from: W1 */
    private int[] f206468W1;
    private int[] inwords;
    private int xOff;

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            f206465T[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            f206465T[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public SM3Digest() {
        this.f206466V = new int[8];
        this.inwords = new int[16];
        this.f206467W = new int[68];
        this.f206468W1 = new int[64];
        reset();
    }

    private int FF0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int FF1(int i, int i2, int i3) {
        return ((i2 | i3) & i) | (i2 & i3);
    }

    private int GG0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int GG1(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    /* JADX INFO: renamed from: P0 */
    private int m221193P0(int i) {
        return (((i << 9) | (i >>> 23)) ^ i) ^ ((i << 17) | (i >>> 15));
    }

    /* JADX INFO: renamed from: P1 */
    private int m221194P1(int i) {
        return (((i << 15) | (i >>> 17)) ^ i) ^ ((i << 23) | (i >>> 9));
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.f206466V;
        int[] iArr2 = this.f206466V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.f206466V[0], bArr, i);
        Pack.intToBigEndian(this.f206466V[1], bArr, i + 4);
        Pack.intToBigEndian(this.f206466V[2], bArr, i + 8);
        Pack.intToBigEndian(this.f206466V[3], bArr, i + 12);
        Pack.intToBigEndian(this.f206466V[4], bArr, i + 16);
        Pack.intToBigEndian(this.f206466V[5], bArr, i + 20);
        Pack.intToBigEndian(this.f206466V[6], bArr, i + 24);
        Pack.intToBigEndian(this.f206466V[7], bArr, i + 28);
        reset();
        return 32;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 0; i < 16; i++) {
            this.f206467W[i] = this.inwords[i];
        }
        for (int i2 = 16; i2 < 68; i2++) {
            int[] iArr = this.f206467W;
            int i3 = iArr[i2 - 3];
            int i4 = iArr[i2 - 13];
            iArr[i2] = (m221194P1(((i3 >>> 17) | (i3 << 15)) ^ (iArr[i2 - 16] ^ iArr[i2 - 9])) ^ ((i4 >>> 25) | (i4 << 7))) ^ this.f206467W[i2 - 6];
        }
        for (int i5 = 0; i5 < 64; i5++) {
            int[] iArr2 = this.f206468W1;
            int[] iArr3 = this.f206467W;
            iArr2[i5] = iArr3[i5 + 4] ^ iArr3[i5];
        }
        int[] iArr4 = this.f206466V;
        int i6 = iArr4[0];
        int i7 = iArr4[1];
        int i8 = iArr4[2];
        int i9 = iArr4[3];
        int iM221193P0 = iArr4[4];
        int i10 = iArr4[5];
        int i11 = iArr4[6];
        int i12 = iArr4[7];
        int i13 = i11;
        int i14 = 0;
        while (i14 < 16) {
            int i15 = (i6 << 12) | (i6 >>> 20);
            int i16 = i15 + iM221193P0 + f206465T[i14];
            int i17 = (i16 << 7) | (i16 >>> 25);
            int iFF0 = FF0(i6, i7, i8) + i9 + (i17 ^ i15) + this.f206468W1[i14];
            int iGG0 = GG0(iM221193P0, i10, i13) + i12 + i17 + this.f206467W[i14];
            int i18 = (i7 << 9) | (i7 >>> 23);
            i14++;
            int i19 = iM221193P0;
            iM221193P0 = m221193P0(iGG0);
            i12 = i13;
            i13 = (i10 << 19) | (i10 >>> 13);
            i10 = i19;
            i7 = i6;
            i6 = iFF0;
            i9 = i8;
            i8 = i18;
        }
        int i20 = i12;
        int i21 = i13;
        int i22 = i6;
        int i23 = 16;
        while (i23 < 64) {
            int i24 = (i22 << 12) | (i22 >>> 20);
            int i25 = i24 + iM221193P0 + f206465T[i23];
            int i26 = (i25 << 7) | (i25 >>> 25);
            int iFF1 = FF1(i22, i7, i8) + i9 + (i26 ^ i24) + this.f206468W1[i23];
            int iGG1 = GG1(iM221193P0, i10, i21) + i20 + i26 + this.f206467W[i23];
            int i27 = (i7 << 9) | (i7 >>> 23);
            int i28 = (i10 << 19) | (i10 >>> 13);
            i23++;
            i10 = iM221193P0;
            iM221193P0 = m221193P0(iGG1);
            i9 = i8;
            i8 = i27;
            i20 = i21;
            i21 = i28;
            i7 = i22;
            i22 = iFF1;
        }
        int[] iArr5 = this.f206466V;
        iArr5[0] = iArr5[0] ^ i22;
        iArr5[1] = iArr5[1] ^ i7;
        iArr5[2] = iArr5[2] ^ i8;
        iArr5[3] = iArr5[3] ^ i9;
        iArr5[4] = iArr5[4] ^ iM221193P0;
        iArr5[5] = iArr5[5] ^ i10;
        iArr5[6] = i21 ^ iArr5[6];
        iArr5[7] = iArr5[7] ^ i20;
        this.xOff = 0;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        int i = this.xOff;
        if (i > 14) {
            this.inwords[i] = 0;
            this.xOff = i + 1;
            processBlock();
        }
        while (true) {
            int i2 = this.xOff;
            int[] iArr = this.inwords;
            if (i2 >= 14) {
                int i3 = i2 + 1;
                this.xOff = i3;
                iArr[i2] = (int) (j >>> 32);
                this.xOff = i2 + 2;
                iArr[i3] = (int) j;
                return;
            }
            iArr[i2] = 0;
            this.xOff = i2 + 1;
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.inwords;
        int i3 = this.xOff;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.xOff = i4;
        if (i4 >= 16) {
            processBlock();
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest, org.spongycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.f206466V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.f206466V = new int[8];
        this.inwords = new int[16];
        this.f206467W = new int[68];
        this.f206468W1 = new int[64];
        copyIn(sM3Digest);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }
}
