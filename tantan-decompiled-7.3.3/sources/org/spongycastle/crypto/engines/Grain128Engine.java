package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.C17103g;
import p153l.rrc0;
import p153l.tyk0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class Grain128Engine implements StreamCipher {
    private static final int STATE_SIZE = 4;
    private int index = 4;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 3) {
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
        int i3 = (i >>> 2) | (i2 << 30);
        int i4 = (i >>> 12) | (i2 << 20);
        int i5 = (i >>> 15) | (i2 << 17);
        int i6 = iArr[2];
        int i7 = (i2 >>> 4) | (i6 << 28);
        int i8 = (i2 >>> 13) | (i6 << 19);
        int i9 = iArr[3];
        int i10 = (i6 >>> 9) | (i9 << 23);
        int i11 = (i6 >>> 25) | (i9 << 7);
        int i12 = (i9 << 1) | (i6 >>> 31);
        int[] iArr2 = this.lfsr;
        int i13 = iArr2[0];
        int i14 = iArr2[1];
        int i15 = (i13 >>> 8) | (i14 << 24);
        int i16 = (i13 >>> 13) | (i14 << 19);
        int i17 = (i13 >>> 20) | (i14 << 12);
        int i18 = iArr2[2];
        int i19 = iArr2[3];
        int i20 = (i18 >>> 15) | (i19 << 17);
        int i21 = i16 & i17;
        return (((((((((((i19 << 1) | (i18 >>> 31)) & (i12 & i4)) ^ (((i21 ^ (i4 & i15)) ^ (i12 & ((i14 >>> 10) | (i18 << 22)))) ^ (((i14 >>> 28) | (i18 << 4)) & i20))) ^ ((i18 >>> 29) | (i19 << 3))) ^ i3) ^ i5) ^ i7) ^ i8) ^ i6) ^ i10) ^ i11;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 7) | (i2 << 25);
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = (i4 >>> 6) | (i5 << 26);
        return i5 ^ ((((i ^ i3) ^ ((i2 >>> 6) | (i4 << 26))) ^ i6) ^ ((i4 >>> 17) | (i5 << 15)));
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 3) | (i2 << 29);
        int i4 = (i >>> 11) | (i2 << 21);
        int i5 = (i >>> 13) | (i2 << 19);
        int i6 = (i >>> 17) | (i2 << 15);
        int i7 = (i >>> 18) | (i2 << 14);
        int i8 = (i >>> 26) | (i2 << 6);
        int i9 = (i >>> 27) | (i2 << 5);
        int i10 = iArr[2];
        int i11 = (i2 >>> 8) | (i10 << 24);
        int i12 = (i2 >>> 16) | (i10 << 16);
        int i13 = (i2 >>> 24) | (i10 << 8);
        int i14 = (i2 >>> 27) | (i10 << 5);
        int i15 = (i2 >>> 29) | (i10 << 3);
        int i16 = iArr[3];
        return (((((((i16 ^ (((i ^ i8) ^ i13) ^ ((i10 >>> 27) | (i16 << 5)))) ^ (i3 & ((i10 >>> 3) | (i16 << 29)))) ^ (i4 & i5)) ^ (i6 & i7)) ^ (i9 & i14)) ^ (i11 & i12)) ^ (i15 & ((i10 >>> 1) | (i16 << 31)))) ^ (((i10 >>> 4) | (i16 << 28)) & ((i10 >>> 20) | (i16 << 12)));
    }

    private void initGrain() {
        for (int i = 0; i < 8; i++) {
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
        bArr[2] = (byte) (output >> 16);
        bArr[3] = (byte) (output >> 24);
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
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
            int i3 = i2 + 3;
            int i4 = i2 + 2;
            int i5 = i2 + 1;
            iArr[i] = (bArr3[i2] & 255) | (bArr3[i3] << 24) | ((bArr3[i4] << Tnaf.POW_2_WIDTH) & 16711680) | ((bArr3[i5] << 8) & 65280);
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i] = (bArr4[i2] & 255) | (bArr4[i3] << 24) | ((bArr4[i4] << Tnaf.POW_2_WIDTH) & 16711680) | ((bArr4[i5] << 8) & 65280);
            i2 += 4;
            i++;
        }
    }

    private int[] shift(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i;
        return iArr;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain-128";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            wg3.m206174a("Grain-128 Init parameters must include an IV");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 12) {
            wg3.m206174a("Grain-128  requires exactly 12 bytes of IV");
            return;
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            wg3.m206174a("Grain-128 Init parameters must include a key");
            return;
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        this.workingIV = new byte[keyParameter.getKey().length];
        this.workingKey = new byte[keyParameter.getKey().length];
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.out = new byte[4];
        System.arraycopy(iv, 0, this.workingIV, 0, iv.length);
        System.arraycopy(keyParameter.getKey(), 0, this.workingKey, 0, keyParameter.getKey().length);
        reset();
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (!this.initialised) {
            rrc0.m182720a(getAlgorithmName(), " not initialised");
            return 0;
        }
        if (i + i2 > bArr.length) {
            tyk0.m193596a("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            C17103g.m128363a("output buffer too short");
            return 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ getKeyStream());
        }
        return i2;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        this.index = 4;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        if (this.initialised) {
            return (byte) (getKeyStream() ^ b);
        }
        rrc0.m182720a(getAlgorithmName(), " not initialised");
        return (byte) 0;
    }
}
