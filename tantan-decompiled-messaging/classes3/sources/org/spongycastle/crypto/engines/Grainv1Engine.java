package org.spongycastle.crypto.engines;

import l.ig3;
import l.kjc0;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import p003l.C0303g;
import p003l.npk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Grainv1Engine implements StreamCipher {
    private static final int STATE_SIZE = 5;
    private int index = 2;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 1) {
            oneRound();
            this.index = 0;
        }
        byte[] bArr = this.out;
        int i = this.index;
        this.index = i + 1;
        return bArr[i];
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 1) | (i2 << 15);
        int i4 = (i >>> 2) | (i2 << 14);
        int i5 = (i >>> 4) | (i2 << 12);
        int i6 = (i >>> 10) | (i2 << 6);
        int i7 = iArr[2];
        int i8 = (i2 >>> 15) | (i7 << 1);
        int i9 = iArr[3];
        int i10 = (i7 >>> 11) | (i9 << 5);
        int i11 = iArr[4];
        int i12 = (i9 >>> 8) | (i11 << 8);
        int i13 = (i11 << 1) | (i9 >>> 15);
        int[] iArr2 = this.lfsr;
        int i14 = iArr2[0] >>> 3;
        int i15 = iArr2[1];
        int i16 = i14 | (i15 << 13);
        int i17 = iArr2[2];
        int i18 = (i15 >>> 9) | (i17 << 7);
        int i19 = (iArr2[3] << 2) | (i17 >>> 14);
        int i20 = iArr2[4];
        int i21 = i19 & i20;
        int i22 = ((((i18 ^ i13) ^ (i16 & i20)) ^ i21) ^ (i20 & i13)) ^ ((i16 & i18) & i19);
        int i23 = i16 & i19;
        return ((((((((((((i20 & i23) ^ i22) ^ (i23 & i13)) ^ ((i18 & i19) & i13)) ^ (i13 & i21)) ^ i3) ^ i4) ^ i5) ^ i6) ^ i8) ^ i10) ^ i12) & 65535;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 13) | (i2 << 3);
        int i4 = iArr[2];
        int i5 = (i2 >>> 7) | (i4 << 9);
        int i6 = iArr[3];
        int i7 = (i4 >>> 6) | (i6 << 10);
        int i8 = iArr[4];
        int i9 = (i6 >>> 3) | (i8 << 13);
        return (((i8 << 2) | (i6 >>> 14)) ^ ((((i ^ i3) ^ i5) ^ i7) ^ i9)) & 65535;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 9) | (i2 << 7);
        int i4 = (i >>> 14) | (i2 << 2);
        int i5 = (i >>> 15) | (i2 << 1);
        int i6 = iArr[2];
        int i7 = (i2 >>> 5) | (i6 << 11);
        int i8 = (i2 >>> 12) | (i6 << 4);
        int i9 = iArr[3];
        int i10 = (i6 >>> 1) | (i9 << 15);
        int i11 = (i6 >>> 5) | (i9 << 11);
        int i12 = (i6 >>> 13) | (i9 << 3);
        int i13 = iArr[4];
        int i14 = (i9 >>> 4) | (i13 << 12);
        int i15 = (i9 >>> 12) | (i13 << 4);
        int i16 = (i9 >>> 14) | (i13 << 2);
        int i17 = (i13 << 1) | (i9 >>> 15);
        int i18 = i17 & i15;
        int i19 = (((i ^ (((((((((i16 ^ i15) ^ i14) ^ i12) ^ i11) ^ i10) ^ i8) ^ i7) ^ i4) ^ i3)) ^ i18) ^ (i11 & i10)) ^ (i5 & i3);
        int i20 = i15 & i14;
        int i21 = i10 & i8 & i7;
        return (((((((((i17 & i12) & i8) & i3) ^ ((i19 ^ (i20 & i12)) ^ i21)) ^ ((i20 & i11) & i10)) ^ ((i18 & i7) & i5)) ^ (((i18 & i14) & i12) & i11)) ^ ((i21 & i5) & i3)) ^ (((((i14 & i12) & i11) & i10) & i8) & i7)) & 65535;
    }

    private void initGrain() {
        for (int i = 0; i < 10; i++) {
            this.output = getOutput();
            this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) ^ this.output);
            this.lfsr = shift(this.lfsr, getOutputLFSR() ^ this.output);
        }
        this.initialised = true;
    }

    private void oneRound() {
        int output = getOutput();
        this.output = output;
        byte[] bArr = this.out;
        bArr[0] = (byte) output;
        bArr[1] = (byte) (output >> 8);
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[8] = -1;
        bArr2[9] = -1;
        this.workingKey = bArr;
        this.workingIV = bArr2;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.nfsr;
            if (i >= iArr.length) {
                return;
            }
            byte[] bArr3 = this.workingKey;
            int i3 = i2 + 1;
            iArr[i] = ((bArr3[i2] & 255) | (bArr3[i3] << 8)) & 65535;
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i] = ((bArr4[i2] & 255) | (bArr4[i3] << 8)) & 65535;
            i2 += 2;
            i++;
        }
    }

    private int[] shift(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i;
        return iArr;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain v1";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            ig3.a("Grain v1 Init parameters must include an IV");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 8) {
            ig3.a("Grain v1 requires exactly 8 bytes of IV");
            return;
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            ig3.a("Grain v1 Init parameters must include a key");
            return;
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        this.workingIV = new byte[keyParameter.getKey().length];
        this.workingKey = new byte[keyParameter.getKey().length];
        this.lfsr = new int[5];
        this.nfsr = new int[5];
        this.out = new byte[2];
        System.arraycopy(iv, 0, this.workingIV, 0, iv.length);
        System.arraycopy(keyParameter.getKey(), 0, this.workingKey, 0, keyParameter.getKey().length);
        reset();
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (!this.initialised) {
            kjc0.a(getAlgorithmName(), " not initialised");
            return 0;
        }
        if (i + i2 > bArr.length) {
            npk0.m6558a("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            C0303g.m4499a("output buffer too short");
            return 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ getKeyStream());
        }
        return i2;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        this.index = 2;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        if (this.initialised) {
            return (byte) (getKeyStream() ^ b);
        }
        kjc0.a(getAlgorithmName(), " not initialised");
        return (byte) 0;
    }
}
