package org.spongycastle.crypto.digests;

import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.p012ec.Tnaf;
import org.spongycastle.util.Memoable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MD2Digest implements ExtendedDigest, Memoable {
    private static final int DIGEST_LENGTH = 16;

    /* JADX INFO: renamed from: S */
    private static final byte[] f10015S = {41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, PSSSigner.TRAILER_IMPLICIT, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, Tnaf.POW_2_WIDTH, -119, 11, 34, 95, 33, -128, 127, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, HttpTokens.SPACE, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, HttpTokens.COLON, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, HttpTokens.CARRIAGE_RETURN, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, HttpTokens.SEMI_COLON, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};

    /* JADX INFO: renamed from: C */
    private byte[] f10016C;
    private int COff;

    /* JADX INFO: renamed from: M */
    private byte[] f10017M;

    /* JADX INFO: renamed from: X */
    private byte[] f10018X;
    private int mOff;
    private int xOff;

    public MD2Digest() {
        this.f10018X = new byte[48];
        this.f10017M = new byte[16];
        this.f10016C = new byte[16];
        reset();
    }

    private void copyIn(MD2Digest mD2Digest) {
        byte[] bArr = mD2Digest.f10018X;
        System.arraycopy(bArr, 0, this.f10018X, 0, bArr.length);
        this.xOff = mD2Digest.xOff;
        byte[] bArr2 = mD2Digest.f10017M;
        System.arraycopy(bArr2, 0, this.f10017M, 0, bArr2.length);
        this.mOff = mD2Digest.mOff;
        byte[] bArr3 = mD2Digest.f10016C;
        System.arraycopy(bArr3, 0, this.f10016C, 0, bArr3.length);
        this.COff = mD2Digest.COff;
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new MD2Digest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        int length = this.f10017M.length;
        int i2 = this.mOff;
        byte b = (byte) (length - i2);
        while (true) {
            byte[] bArr2 = this.f10017M;
            if (i2 >= bArr2.length) {
                processCheckSum(bArr2);
                processBlock(this.f10017M);
                processBlock(this.f10016C);
                System.arraycopy(this.f10018X, this.xOff, bArr, i, 16);
                reset();
                return 16;
            }
            bArr2[i2] = b;
            i2++;
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD2";
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 16;
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    public void processBlock(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.f10018X;
            bArr2[i + 16] = bArr[i];
            bArr2[i + 32] = (byte) (bArr[i] ^ bArr2[i]);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 18; i3++) {
            for (int i4 = 0; i4 < 48; i4++) {
                byte[] bArr3 = this.f10018X;
                byte b = (byte) (f10015S[i2] ^ bArr3[i4]);
                bArr3[i4] = b;
                i2 = b & 255;
            }
            i2 = (i2 + i3) % 256;
        }
    }

    public void processCheckSum(byte[] bArr) {
        byte b = this.f10016C[15];
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.f10016C;
            b = (byte) (f10015S[(b ^ bArr[i]) & 255] ^ bArr2[i]);
            bArr2[i] = b;
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this.xOff = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f10018X;
            if (i == bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.mOff = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.f10017M;
            if (i2 == bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        this.COff = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.f10016C;
            if (i3 == bArr3.length) {
                return;
            }
            bArr3[i3] = 0;
            i3++;
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (this.mOff != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > 16) {
            System.arraycopy(bArr, i, this.f10017M, 0, 16);
            processCheckSum(this.f10017M);
            processBlock(this.f10017M);
            i2 -= 16;
            i += 16;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    public MD2Digest(MD2Digest mD2Digest) {
        this.f10018X = new byte[48];
        this.f10017M = new byte[16];
        this.f10016C = new byte[16];
        copyIn(mD2Digest);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD2Digest) memoable);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.f10017M;
        int i = this.mOff;
        int i2 = i + 1;
        this.mOff = i2;
        bArr[i] = b;
        if (i2 == 16) {
            processCheckSum(bArr);
            processBlock(this.f10017M);
            this.mOff = 0;
        }
    }
}
