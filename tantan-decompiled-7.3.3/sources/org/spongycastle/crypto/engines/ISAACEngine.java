package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Pack;
import p153l.C17103g;
import p153l.rrc0;
import p153l.tyk0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class ISAACEngine implements StreamCipher {
    private final int sizeL = 8;
    private final int stateArraySize = 256;
    private int[] engineState = null;
    private int[] results = null;

    /* JADX INFO: renamed from: a */
    private int f207479a = 0;

    /* JADX INFO: renamed from: b */
    private int f207480b = 0;

    /* JADX INFO: renamed from: c */
    private int f207481c = 0;
    private int index = 0;
    private byte[] keyStream = new byte[1024];
    private byte[] workingKey = null;
    private boolean initialised = false;

    private void isaac() {
        int i = this.f207480b;
        int i2 = this.f207481c + 1;
        this.f207481c = i2;
        this.f207480b = i + i2;
        for (int i3 = 0; i3 < 256; i3++) {
            int[] iArr = this.engineState;
            int i4 = iArr[i3];
            int i5 = i3 & 3;
            if (i5 == 0) {
                int i6 = this.f207479a;
                this.f207479a = i6 ^ (i6 << 13);
            } else if (i5 == 1) {
                int i7 = this.f207479a;
                this.f207479a = i7 ^ (i7 >>> 6);
            } else if (i5 == 2) {
                int i8 = this.f207479a;
                this.f207479a = i8 ^ (i8 << 2);
            } else if (i5 == 3) {
                int i9 = this.f207479a;
                this.f207479a = i9 ^ (i9 >>> 16);
            }
            int i10 = this.f207479a + iArr[(i3 + 128) & 255];
            this.f207479a = i10;
            int i11 = iArr[(i4 >>> 2) & 255] + i10 + this.f207480b;
            iArr[i3] = i11;
            int[] iArr2 = this.results;
            int i12 = iArr[(i11 >>> 10) & 255] + i4;
            this.f207480b = i12;
            iArr2[i3] = i12;
        }
    }

    private void mix(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = i ^ (i2 << 11);
        iArr[0] = i3;
        int i4 = iArr[3] + i3;
        iArr[3] = i4;
        int i5 = iArr[2];
        int i6 = i2 + i5;
        iArr[1] = i6;
        int i7 = i6 ^ (i5 >>> 2);
        iArr[1] = i7;
        int i8 = iArr[4] + i7;
        iArr[4] = i8;
        int i9 = i5 + i4;
        iArr[2] = i9;
        int i10 = i9 ^ (i4 << 8);
        iArr[2] = i10;
        int i11 = iArr[5] + i10;
        iArr[5] = i11;
        int i12 = i4 + i8;
        iArr[3] = i12;
        int i13 = i12 ^ (i8 >>> 16);
        iArr[3] = i13;
        int i14 = iArr[6] + i13;
        iArr[6] = i14;
        int i15 = i8 + i11;
        iArr[4] = i15;
        int i16 = (i11 << 10) ^ i15;
        iArr[4] = i16;
        int i17 = iArr[7] + i16;
        iArr[7] = i17;
        int i18 = i11 + i14;
        iArr[5] = i18;
        int i19 = (i14 >>> 4) ^ i18;
        iArr[5] = i19;
        int i20 = i3 + i19;
        iArr[0] = i20;
        int i21 = i14 + i17;
        iArr[6] = i21;
        int i22 = (i17 << 8) ^ i21;
        iArr[6] = i22;
        int i23 = i7 + i22;
        iArr[1] = i23;
        int i24 = i17 + i20;
        iArr[7] = i24;
        int i25 = (i20 >>> 9) ^ i24;
        iArr[7] = i25;
        iArr[2] = i10 + i25;
        iArr[0] = i20 + i23;
    }

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        if (this.engineState == null) {
            this.engineState = new int[256];
        }
        if (this.results == null) {
            this.results = new int[256];
        }
        for (int i = 0; i < 256; i++) {
            int[] iArr = this.engineState;
            this.results[i] = 0;
            iArr[i] = 0;
        }
        this.f207481c = 0;
        this.f207480b = 0;
        this.f207479a = 0;
        this.index = 0;
        int length = bArr.length + (bArr.length & 3);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i2 = 0; i2 < length; i2 += 4) {
            this.results[i2 >>> 2] = Pack.littleEndianToInt(bArr2, i2);
        }
        int[] iArr2 = new int[8];
        for (int i3 = 0; i3 < 8; i3++) {
            iArr2[i3] = -1640531527;
        }
        for (int i4 = 0; i4 < 4; i4++) {
            mix(iArr2);
        }
        int i5 = 0;
        while (i5 < 2) {
            for (int i6 = 0; i6 < 256; i6 += 8) {
                for (int i7 = 0; i7 < 8; i7++) {
                    iArr2[i7] = iArr2[i7] + (i5 < 1 ? this.results[i6 + i7] : this.engineState[i6 + i7]);
                }
                mix(iArr2);
                for (int i8 = 0; i8 < 8; i8++) {
                    this.engineState[i6 + i8] = iArr2[i8];
                }
            }
            i5++;
        }
        isaac();
        this.initialised = true;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ISAAC";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            setKey(((KeyParameter) cipherParameters).getKey());
        } else {
            wg3.m206174a("invalid parameter passed to ISAAC init - ".concat(cipherParameters.getClass().getName()));
        }
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
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
            if (this.index == 0) {
                isaac();
                this.keyStream = Pack.intToBigEndian(this.results);
            }
            byte[] bArr3 = this.keyStream;
            int i5 = this.index;
            bArr2[i4 + i3] = (byte) (bArr3[i5] ^ bArr[i4 + i]);
            this.index = (i5 + 1) & 1023;
        }
        return i2;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        if (this.index == 0) {
            isaac();
            this.keyStream = Pack.intToBigEndian(this.results);
        }
        byte[] bArr = this.keyStream;
        int i = this.index;
        byte b2 = (byte) (b ^ bArr[i]);
        this.index = (i + 1) & 1023;
        return b2;
    }
}
