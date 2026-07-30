package org.spongycastle.crypto.engines;

import l.ig3;
import l.kjc0;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import p003l.C0303g;
import p003l.npk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TEAEngine implements BlockCipher {
    private static final int block_size = 8;
    private static final int d_sum = -957401312;
    private static final int delta = -1640531527;
    private static final int rounds = 32;

    /* JADX INFO: renamed from: _a */
    private int f10211_a;

    /* JADX INFO: renamed from: _b */
    private int f10212_b;

    /* JADX INFO: renamed from: _c */
    private int f10213_c;

    /* JADX INFO: renamed from: _d */
    private int f10214_d;
    private boolean _forEncryption;
    private boolean _initialised = false;

    private int bytesToInt(byte[] bArr, int i) {
        int i2 = i + 2;
        return ((bArr[i + 1] & 255) << 16) | (bArr[i] << 24) | ((bArr[i2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBytesToInt = bytesToInt(bArr, i);
        int iBytesToInt2 = bytesToInt(bArr, i + 4);
        int i3 = d_sum;
        for (int i4 = 0; i4 != 32; i4++) {
            iBytesToInt2 -= (((iBytesToInt << 4) + this.f10213_c) ^ (iBytesToInt + i3)) ^ ((iBytesToInt >>> 5) + this.f10214_d);
            iBytesToInt -= (((iBytesToInt2 << 4) + this.f10211_a) ^ (iBytesToInt2 + i3)) ^ ((iBytesToInt2 >>> 5) + this.f10212_b);
            i3 += 1640531527;
        }
        unpackInt(iBytesToInt, bArr2, i2);
        unpackInt(iBytesToInt2, bArr2, i2 + 4);
        return 8;
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBytesToInt = bytesToInt(bArr, i);
        int iBytesToInt2 = bytesToInt(bArr, i + 4);
        int i3 = iBytesToInt;
        int i4 = 0;
        for (int i5 = 0; i5 != 32; i5++) {
            i4 -= 1640531527;
            i3 += (((iBytesToInt2 << 4) + this.f10211_a) ^ (iBytesToInt2 + i4)) ^ ((iBytesToInt2 >>> 5) + this.f10212_b);
            iBytesToInt2 += (((i3 << 4) + this.f10213_c) ^ (i3 + i4)) ^ ((i3 >>> 5) + this.f10214_d);
        }
        unpackInt(i3, bArr2, i2);
        unpackInt(iBytesToInt2, bArr2, i2 + 4);
        return 8;
    }

    private void setKey(byte[] bArr) {
        if (bArr.length != 16) {
            ig3.a("Key size must be 128 bits.");
            return;
        }
        this.f10211_a = bytesToInt(bArr, 0);
        this.f10212_b = bytesToInt(bArr, 4);
        this.f10213_c = bytesToInt(bArr, 8);
        this.f10214_d = bytesToInt(bArr, 12);
    }

    private void unpackInt(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "TEA";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            ig3.a("invalid parameter passed to TEA init - ".concat(cipherParameters.getClass().getName()));
            return;
        }
        this._forEncryption = z;
        this._initialised = true;
        setKey(((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this._initialised) {
            kjc0.a(getAlgorithmName(), " not initialised");
            return 0;
        }
        if (i + 8 > bArr.length) {
            npk0.m6558a("input buffer too short");
            return 0;
        }
        if (i2 + 8 <= bArr2.length) {
            return this._forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
        }
        C0303g.m4499a("output buffer too short");
        return 0;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
