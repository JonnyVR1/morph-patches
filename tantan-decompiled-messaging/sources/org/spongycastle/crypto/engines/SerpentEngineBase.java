package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import p149l.C16968g;
import p149l.eke0;
import p149l.kjc0;
import p149l.npk0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SerpentEngineBase implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    static final int PHI = -1640531527;
    static final int ROUNDS = 32;

    /* JADX INFO: renamed from: X0 */
    protected int f206581X0;

    /* JADX INFO: renamed from: X1 */
    protected int f206582X1;

    /* JADX INFO: renamed from: X2 */
    protected int f206583X2;

    /* JADX INFO: renamed from: X3 */
    protected int f206584X3;
    protected boolean encrypting;
    protected int[] wKey;

    public static int rotateLeft(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static int rotateRight(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    /* JADX INFO: renamed from: LT */
    public final void m221214LT() {
        int iRotateLeft = rotateLeft(this.f206581X0, 13);
        int iRotateLeft2 = rotateLeft(this.f206583X2, 3);
        int i = (this.f206582X1 ^ iRotateLeft) ^ iRotateLeft2;
        int i2 = (this.f206584X3 ^ iRotateLeft2) ^ (iRotateLeft << 3);
        this.f206582X1 = rotateLeft(i, 1);
        int iRotateLeft3 = rotateLeft(i2, 7);
        this.f206584X3 = iRotateLeft3;
        this.f206581X0 = rotateLeft((iRotateLeft ^ this.f206582X1) ^ iRotateLeft3, 5);
        this.f206583X2 = rotateLeft((this.f206584X3 ^ iRotateLeft2) ^ (this.f206582X1 << 7), 22);
    }

    public abstract void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2);

    public abstract void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2);

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Serpent";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    public final void ib0(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i2 ^ i;
        int i7 = (i5 | i6) ^ i4;
        int i8 = i3 ^ i7;
        int i9 = i6 ^ i8;
        this.f206583X2 = i9;
        int i10 = (i6 & i4) ^ i5;
        int i11 = (i9 & i10) ^ i7;
        this.f206582X1 = i11;
        int i12 = (i & i7) ^ (i11 | i8);
        this.f206584X3 = i12;
        this.f206581X0 = i12 ^ (i10 ^ i8);
    }

    public final void ib1(int i, int i2, int i3, int i4) {
        int i5 = i4 ^ i2;
        int i6 = i ^ (i2 & i5);
        int i7 = i5 ^ i6;
        int i8 = i3 ^ i7;
        this.f206584X3 = i8;
        int i9 = i2 ^ (i5 & i6);
        int i10 = i6 ^ (i8 | i9);
        this.f206582X1 = i10;
        int i11 = ~i10;
        int i12 = i9 ^ i8;
        this.f206581X0 = i11 ^ i12;
        this.f206583X2 = (i11 | i12) ^ i7;
    }

    public final void ib2(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i4;
        int i6 = ~i5;
        int i7 = i ^ i3;
        int i8 = i3 ^ i5;
        int i9 = (i2 & i8) ^ i7;
        this.f206581X0 = i9;
        int i10 = (((i | i6) ^ i4) | i7) ^ i5;
        this.f206584X3 = i10;
        int i11 = ~i8;
        int i12 = i10 | i9;
        this.f206582X1 = i11 ^ i12;
        this.f206583X2 = (i12 ^ i7) ^ (i4 & i11);
    }

    public final void ib3(int i, int i2, int i3, int i4) {
        int i5 = i | i2;
        int i6 = i2 ^ i3;
        int i7 = i ^ (i2 & i6);
        int i8 = i3 ^ i7;
        int i9 = i4 | i7;
        int i10 = i6 ^ i9;
        this.f206581X0 = i10;
        int i11 = (i9 | i6) ^ i4;
        this.f206583X2 = i8 ^ i11;
        int i12 = i5 ^ i11;
        int i13 = i7 ^ (i10 & i12);
        this.f206584X3 = i13;
        this.f206582X1 = i13 ^ (i12 ^ i10);
    }

    public final void ib4(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ ((i3 | i4) & i);
        int i6 = i3 ^ (i & i5);
        int i7 = i4 ^ i6;
        this.f206582X1 = i7;
        int i8 = ~i;
        int i9 = (i6 & i7) ^ i5;
        this.f206584X3 = i9;
        int i10 = i4 ^ (i7 | i8);
        this.f206581X0 = i9 ^ i10;
        this.f206583X2 = (i8 ^ i7) ^ (i5 & i10);
    }

    public final void ib5(int i, int i2, int i3, int i4) {
        int i5 = ~i3;
        int i6 = (i2 & i5) ^ i4;
        int i7 = i & i6;
        int i8 = (i2 ^ i5) ^ i7;
        this.f206584X3 = i8;
        int i9 = i8 | i2;
        this.f206582X1 = i6 ^ (i & i9);
        int i10 = i4 | i;
        this.f206581X0 = (i5 ^ i9) ^ i10;
        this.f206583X2 = ((i ^ i3) | i7) ^ (i2 & i10);
    }

    public final void ib6(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i3 ^ i6;
        int i8 = (i3 | i5) ^ i4;
        this.f206582X1 = i7 ^ i8;
        int i9 = i6 ^ (i7 & i8);
        int i10 = i8 ^ (i2 | i9);
        this.f206584X3 = i10;
        int i11 = i2 | i10;
        this.f206581X0 = i9 ^ i11;
        this.f206583X2 = (i4 & i5) ^ (i11 ^ i7);
    }

    public final void ib7(int i, int i2, int i3, int i4) {
        int i5 = (i & i2) | i3;
        int i6 = (i | i2) & i4;
        int i7 = i5 ^ i6;
        this.f206584X3 = i7;
        int i8 = i2 ^ i6;
        int i9 = ((i7 ^ (~i4)) | i8) ^ i;
        this.f206582X1 = i9;
        int i10 = (i8 ^ i3) ^ (i4 | i9);
        this.f206581X0 = i10;
        this.f206583X2 = ((i & i7) ^ i10) ^ (i5 ^ i9);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            eke0.m116959a("invalid parameter passed to ", getAlgorithmName(), " init - ", cipherParameters.getClass().getName());
        } else {
            this.encrypting = z;
            this.wKey = makeWorkingKey(((KeyParameter) cipherParameters).getKey());
        }
    }

    public final void inverseLT() {
        int iRotateRight = (rotateRight(this.f206583X2, 22) ^ this.f206584X3) ^ (this.f206582X1 << 7);
        int iRotateRight2 = rotateRight(this.f206581X0, 5) ^ this.f206582X1;
        int i = this.f206584X3;
        int i2 = iRotateRight2 ^ i;
        int iRotateRight3 = rotateRight(i, 7);
        int iRotateRight4 = rotateRight(this.f206582X1, 1);
        this.f206584X3 = (iRotateRight3 ^ iRotateRight) ^ (i2 << 3);
        this.f206582X1 = (iRotateRight4 ^ i2) ^ iRotateRight;
        this.f206583X2 = rotateRight(iRotateRight, 3);
        this.f206581X0 = rotateRight(i2, 13);
    }

    public abstract int[] makeWorkingKey(byte[] bArr);

    @Override // org.spongycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.wKey == null) {
            kjc0.m146216a(getAlgorithmName(), " not initialised");
            return 0;
        }
        if (i + 16 > bArr.length) {
            npk0.m160508a("input buffer too short");
            return 0;
        }
        if (i2 + 16 > bArr2.length) {
            C16968g.m123940a("output buffer too short");
            return 0;
        }
        if (this.encrypting) {
            encryptBlock(bArr, i, bArr2, i2);
            return 16;
        }
        decryptBlock(bArr, i, bArr2, i2);
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    public final void sb0(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ i5;
        int i7 = i2 ^ i6;
        int i8 = (i4 & i) ^ i7;
        this.f206584X3 = i8;
        int i9 = i ^ (i2 & i5);
        this.f206583X2 = (i3 | i9) ^ i7;
        int i10 = (i6 ^ i9) & i8;
        this.f206582X1 = (~i6) ^ i10;
        this.f206581X0 = (~i9) ^ i10;
    }

    public final void sb1(int i, int i2, int i3, int i4) {
        int i5 = (~i) ^ i2;
        int i6 = (i | i5) ^ i3;
        int i7 = i4 ^ i6;
        this.f206583X2 = i7;
        int i8 = i2 ^ (i4 | i5);
        int i9 = i7 ^ i5;
        int i10 = (i6 & i8) ^ i9;
        this.f206584X3 = i10;
        int i11 = i8 ^ i6;
        this.f206582X1 = i10 ^ i11;
        this.f206581X0 = i6 ^ (i11 & i9);
    }

    public final void sb2(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i2 ^ i4;
        int i7 = (i3 & i5) ^ i6;
        this.f206581X0 = i7;
        int i8 = i3 ^ i5;
        int i9 = i2 & (i3 ^ i7);
        int i10 = i8 ^ i9;
        this.f206584X3 = i10;
        int i11 = i ^ ((i9 | i4) & (i7 | i8));
        this.f206583X2 = i11;
        this.f206582X1 = (i11 ^ (i4 | i5)) ^ (i6 ^ i10);
    }

    public final void sb3(int i, int i2, int i3, int i4) {
        int i5 = i ^ i2;
        int i6 = i & i3;
        int i7 = i | i4;
        int i8 = i3 ^ i4;
        int i9 = i6 | (i5 & i7);
        int i10 = i8 ^ i9;
        this.f206583X2 = i10;
        int i11 = (i7 ^ i2) ^ i9;
        int i12 = i5 ^ (i8 & i11);
        this.f206581X0 = i12;
        int i13 = i12 & i10;
        this.f206582X1 = i11 ^ i13;
        this.f206584X3 = (i2 | i4) ^ (i8 ^ i13);
    }

    public final void sb4(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ (i4 & i5);
        int i7 = i2 | i6;
        this.f206584X3 = i5 ^ i7;
        int i8 = ~i2;
        int i9 = (i5 | i8) ^ i6;
        this.f206581X0 = i9;
        int i10 = i8 ^ i5;
        int i11 = (i7 & i10) ^ (i9 & i);
        this.f206583X2 = i11;
        this.f206582X1 = (i ^ i6) ^ (i10 & i11);
    }

    public final void sb5(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i ^ i4;
        int i8 = (i3 ^ i5) ^ (i6 | i7);
        this.f206581X0 = i8;
        int i9 = i4 & i8;
        int i10 = (i6 ^ i8) ^ i9;
        this.f206582X1 = i10;
        int i11 = i7 ^ (i8 | i5);
        this.f206583X2 = (i6 | i9) ^ i11;
        this.f206584X3 = (i11 & i10) ^ (i2 ^ i9);
    }

    public final void sb6(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i ^ i4;
        int i7 = i2 ^ i6;
        int i8 = i3 ^ (i5 | i6);
        int i9 = i2 ^ i8;
        this.f206582X1 = i9;
        int i10 = (i6 | i9) ^ i4;
        int i11 = (i8 & i10) ^ i7;
        this.f206583X2 = i11;
        int i12 = i10 ^ i8;
        this.f206581X0 = i11 ^ i12;
        this.f206584X3 = (i12 & i7) ^ (~i8);
    }

    public final void sb7(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i3;
        int i6 = (i3 & i5) ^ i4;
        int i7 = i ^ i6;
        int i8 = i2 ^ ((i4 | i5) & i7);
        this.f206582X1 = i8;
        int i9 = (i & i7) ^ i5;
        this.f206584X3 = i9;
        int i10 = (i8 | i6) ^ i7;
        int i11 = i6 ^ (i9 & i10);
        this.f206583X2 = i11;
        this.f206581X0 = (i9 & i11) ^ (~i10);
    }
}
