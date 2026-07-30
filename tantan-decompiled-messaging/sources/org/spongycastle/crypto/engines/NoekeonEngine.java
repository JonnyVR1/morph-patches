package org.spongycastle.crypto.engines;

import com.alibaba.fastjson.asm.Opcodes;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.C16968g;
import p149l.ig3;
import p149l.kjc0;
import p149l.npk0;

/* JADX INFO: loaded from: classes3.dex */
public class NoekeonEngine implements BlockCipher {
    private static final int genericSize = 16;
    private static final int[] nullVector = {0, 0, 0, 0};
    private static final int[] roundConstants = {128, 27, 54, 108, 216, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 77, 154, 47, 94, 188, 99, Opcodes.IFNULL, 151, 53, 106, 212};
    private boolean _forEncryption;
    private int[] state = new int[4];
    private int[] subKeys = new int[4];
    private int[] decryptKeys = new int[4];
    private boolean _initialised = false;

    private int bytesToIntBig(byte[] bArr, int i) {
        int i2 = i + 2;
        return ((bArr[i + 1] & 255) << 16) | (bArr[i] << 24) | ((bArr[i2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.state[0] = bytesToIntBig(bArr, i);
        this.state[1] = bytesToIntBig(bArr, i + 4);
        this.state[2] = bytesToIntBig(bArr, i + 8);
        this.state[3] = bytesToIntBig(bArr, i + 12);
        int[] iArr = this.subKeys;
        System.arraycopy(iArr, 0, this.decryptKeys, 0, iArr.length);
        theta(this.decryptKeys, nullVector);
        int i3 = 16;
        while (true) {
            int[] iArr2 = this.state;
            if (i3 <= 0) {
                theta(iArr2, this.decryptKeys);
                int[] iArr3 = this.state;
                int i4 = roundConstants[i3] ^ iArr3[0];
                iArr3[0] = i4;
                intToBytesBig(i4, bArr2, i2);
                intToBytesBig(this.state[1], bArr2, i2 + 4);
                intToBytesBig(this.state[2], bArr2, i2 + 8);
                intToBytesBig(this.state[3], bArr2, i2 + 12);
                return 16;
            }
            theta(iArr2, this.decryptKeys);
            int[] iArr4 = this.state;
            iArr4[0] = iArr4[0] ^ roundConstants[i3];
            pi1(iArr4);
            gamma(this.state);
            pi2(this.state);
            i3--;
        }
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.state[0] = bytesToIntBig(bArr, i);
        this.state[1] = bytesToIntBig(bArr, i + 4);
        this.state[2] = bytesToIntBig(bArr, i + 8);
        this.state[3] = bytesToIntBig(bArr, i + 12);
        int i3 = 0;
        while (true) {
            int[] iArr = this.state;
            if (i3 >= 16) {
                iArr[0] = roundConstants[i3] ^ iArr[0];
                theta(iArr, this.subKeys);
                intToBytesBig(this.state[0], bArr2, i2);
                intToBytesBig(this.state[1], bArr2, i2 + 4);
                intToBytesBig(this.state[2], bArr2, i2 + 8);
                intToBytesBig(this.state[3], bArr2, i2 + 12);
                return 16;
            }
            iArr[0] = iArr[0] ^ roundConstants[i3];
            theta(iArr, this.subKeys);
            pi1(this.state);
            gamma(this.state);
            pi2(this.state);
            i3++;
        }
    }

    private void gamma(int[] iArr) {
        int i = iArr[1];
        int i2 = iArr[3];
        int i3 = ~i2;
        int i4 = iArr[2];
        int i5 = i ^ (i3 & (~i4));
        iArr[1] = i5;
        int i6 = iArr[0] ^ (i4 & i5);
        iArr[0] = i6;
        iArr[3] = i6;
        iArr[0] = i2;
        int i7 = ((i2 ^ i5) ^ i6) ^ i4;
        iArr[2] = i7;
        int i8 = i5 ^ ((~i6) & (~i7));
        iArr[1] = i8;
        iArr[0] = (i7 & i8) ^ i2;
    }

    private void intToBytesBig(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    private void pi1(int[] iArr) {
        iArr[1] = rotl(iArr[1], 1);
        iArr[2] = rotl(iArr[2], 5);
        iArr[3] = rotl(iArr[3], 2);
    }

    private void pi2(int[] iArr) {
        iArr[1] = rotl(iArr[1], 31);
        iArr[2] = rotl(iArr[2], 27);
        iArr[3] = rotl(iArr[3], 30);
    }

    private int rotl(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    private void setKey(byte[] bArr) {
        this.subKeys[0] = bytesToIntBig(bArr, 0);
        this.subKeys[1] = bytesToIntBig(bArr, 4);
        this.subKeys[2] = bytesToIntBig(bArr, 8);
        this.subKeys[3] = bytesToIntBig(bArr, 12);
    }

    private void theta(int[] iArr, int[] iArr2) {
        int i = iArr[0] ^ iArr[2];
        int iRotl = i ^ (rotl(i, 8) ^ rotl(i, 24));
        iArr[1] = iArr[1] ^ iRotl;
        iArr[3] = iRotl ^ iArr[3];
        for (int i2 = 0; i2 < 4; i2++) {
            iArr[i2] = iArr[i2] ^ iArr2[i2];
        }
        int i3 = iArr[1] ^ iArr[3];
        int iRotl2 = (rotl(i3, 24) ^ rotl(i3, 8)) ^ i3;
        iArr[0] = iArr[0] ^ iRotl2;
        iArr[2] = iRotl2 ^ iArr[2];
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            ig3.m135964a("invalid parameter passed to Noekeon init - ".concat(cipherParameters.getClass().getName()));
            return;
        }
        this._forEncryption = z;
        this._initialised = true;
        setKey(((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this._initialised) {
            kjc0.m146216a(getAlgorithmName(), " not initialised");
            return 0;
        }
        if (i + 16 > bArr.length) {
            npk0.m160508a("input buffer too short");
            return 0;
        }
        if (i2 + 16 <= bArr2.length) {
            return this._forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
        }
        C16968g.m123940a("output buffer too short");
        return 0;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
