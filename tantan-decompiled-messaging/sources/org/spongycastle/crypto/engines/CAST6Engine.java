package org.spongycastle.crypto.engines;

/* JADX INFO: loaded from: classes3.dex */
public final class CAST6Engine extends CAST5Engine {
    protected static final int BLOCK_SIZE = 16;
    protected static final int ROUNDS = 12;
    protected int[] _Kr = new int[48];
    protected int[] _Km = new int[48];
    protected int[] _Tr = new int[192];
    protected int[] _Tm = new int[192];
    private int[] _workingKey = new int[8];

    public final void CAST_Decipher(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6 = 0;
        while (true) {
            if (i6 >= 6) {
                break;
            }
            int i7 = (11 - i6) * 4;
            i3 ^= m221196F1(i4, this._Km[i7], this._Kr[i7]);
            int i8 = i7 + 1;
            i2 ^= m221197F2(i3, this._Km[i8], this._Kr[i8]);
            int i9 = i7 + 2;
            i ^= m221198F3(i2, this._Km[i9], this._Kr[i9]);
            int i10 = i7 + 3;
            i4 ^= m221196F1(i, this._Km[i10], this._Kr[i10]);
            i6++;
        }
        for (i5 = 6; i5 < 12; i5++) {
            int i11 = (11 - i5) * 4;
            int i12 = i11 + 3;
            i4 ^= m221196F1(i, this._Km[i12], this._Kr[i12]);
            int i13 = i11 + 2;
            i ^= m221198F3(i2, this._Km[i13], this._Kr[i13]);
            int i14 = i11 + 1;
            i2 ^= m221197F2(i3, this._Km[i14], this._Kr[i14]);
            i3 ^= m221196F1(i4, this._Km[i11], this._Kr[i11]);
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
    }

    public final void CAST_Encipher(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6 = 0;
        while (true) {
            if (i6 >= 6) {
                break;
            }
            int i7 = i6 * 4;
            i3 ^= m221196F1(i4, this._Km[i7], this._Kr[i7]);
            int i8 = i7 + 1;
            i2 ^= m221197F2(i3, this._Km[i8], this._Kr[i8]);
            int i9 = i7 + 2;
            i ^= m221198F3(i2, this._Km[i9], this._Kr[i9]);
            int i10 = i7 + 3;
            i4 ^= m221196F1(i, this._Km[i10], this._Kr[i10]);
            i6++;
        }
        for (i5 = 6; i5 < 12; i5++) {
            int i11 = i5 * 4;
            int i12 = i11 + 3;
            i4 ^= m221196F1(i, this._Km[i12], this._Kr[i12]);
            int i13 = i11 + 2;
            i ^= m221198F3(i2, this._Km[i13], this._Kr[i13]);
            int i14 = i11 + 1;
            i2 ^= m221197F2(i3, this._Km[i14], this._Kr[i14]);
            i3 ^= m221196F1(i4, this._Km[i11], this._Kr[i11]);
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
    }

    @Override // org.spongycastle.crypto.engines.CAST5Engine
    public int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[4];
        CAST_Decipher(BytesTo32bits(bArr, i), BytesTo32bits(bArr, i + 4), BytesTo32bits(bArr, i + 8), BytesTo32bits(bArr, i + 12), iArr);
        Bits32ToBytes(iArr[0], bArr2, i2);
        Bits32ToBytes(iArr[1], bArr2, i2 + 4);
        Bits32ToBytes(iArr[2], bArr2, i2 + 8);
        Bits32ToBytes(iArr[3], bArr2, i2 + 12);
        return 16;
    }

    @Override // org.spongycastle.crypto.engines.CAST5Engine
    public int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[4];
        CAST_Encipher(BytesTo32bits(bArr, i), BytesTo32bits(bArr, i + 4), BytesTo32bits(bArr, i + 8), BytesTo32bits(bArr, i + 12), iArr);
        Bits32ToBytes(iArr[0], bArr2, i2);
        Bits32ToBytes(iArr[1], bArr2, i2 + 4);
        Bits32ToBytes(iArr[2], bArr2, i2 + 8);
        Bits32ToBytes(iArr[3], bArr2, i2 + 12);
        return 16;
    }

    @Override // org.spongycastle.crypto.engines.CAST5Engine, org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "CAST6";
    }

    @Override // org.spongycastle.crypto.engines.CAST5Engine, org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.engines.CAST5Engine, org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.spongycastle.crypto.engines.CAST5Engine
    public void setKey(byte[] bArr) {
        int i = 1518500249;
        int i2 = 19;
        char c = 0;
        for (int i3 = 0; i3 < 24; i3++) {
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = (i3 * 8) + i4;
                this._Tm[i5] = i;
                i += 1859775393;
                this._Tr[i5] = i2;
                i2 = (i2 + 17) & 31;
            }
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i6 = 0; i6 < 8; i6++) {
            this._workingKey[i6] = BytesTo32bits(bArr2, i6 * 4);
        }
        int i7 = 0;
        while (i7 < 12) {
            int i8 = i7 * 16;
            int[] iArr = this._workingKey;
            iArr[6] = iArr[6] ^ m221196F1(iArr[7], this._Tm[i8], this._Tr[i8]);
            int[] iArr2 = this._workingKey;
            int i9 = i8 + 1;
            iArr2[5] = iArr2[5] ^ m221197F2(iArr2[6], this._Tm[i9], this._Tr[i9]);
            int[] iArr3 = this._workingKey;
            int i10 = i8 + 2;
            iArr3[4] = iArr3[4] ^ m221198F3(iArr3[5], this._Tm[i10], this._Tr[i10]);
            int[] iArr4 = this._workingKey;
            int i11 = i8 + 3;
            char c2 = c;
            iArr4[3] = m221196F1(iArr4[4], this._Tm[i11], this._Tr[i11]) ^ iArr4[3];
            int[] iArr5 = this._workingKey;
            int i12 = i8 + 4;
            iArr5[2] = m221197F2(iArr5[3], this._Tm[i12], this._Tr[i12]) ^ iArr5[2];
            int[] iArr6 = this._workingKey;
            int i13 = i8 + 5;
            iArr6[1] = m221198F3(iArr6[2], this._Tm[i13], this._Tr[i13]) ^ iArr6[1];
            int[] iArr7 = this._workingKey;
            int i14 = i8 + 6;
            iArr7[c2] = iArr7[c2] ^ m221196F1(iArr7[1], this._Tm[i14], this._Tr[i14]);
            int[] iArr8 = this._workingKey;
            int i15 = i8 + 7;
            iArr8[7] = m221197F2(iArr8[c2], this._Tm[i15], this._Tr[i15]) ^ iArr8[7];
            int i16 = ((i7 * 2) + 1) * 8;
            int[] iArr9 = this._workingKey;
            iArr9[6] = iArr9[6] ^ m221196F1(iArr9[7], this._Tm[i16], this._Tr[i16]);
            int[] iArr10 = this._workingKey;
            int i17 = i16 + 1;
            iArr10[5] = iArr10[5] ^ m221197F2(iArr10[6], this._Tm[i17], this._Tr[i17]);
            int[] iArr11 = this._workingKey;
            int i18 = i16 + 2;
            iArr11[4] = iArr11[4] ^ m221198F3(iArr11[5], this._Tm[i18], this._Tr[i18]);
            int[] iArr12 = this._workingKey;
            int i19 = i16 + 3;
            iArr12[3] = iArr12[3] ^ m221196F1(iArr12[4], this._Tm[i19], this._Tr[i19]);
            int[] iArr13 = this._workingKey;
            int i20 = i16 + 4;
            iArr13[2] = iArr13[2] ^ m221197F2(iArr13[3], this._Tm[i20], this._Tr[i20]);
            int[] iArr14 = this._workingKey;
            int i21 = i16 + 5;
            iArr14[1] = iArr14[1] ^ m221198F3(iArr14[2], this._Tm[i21], this._Tr[i21]);
            int[] iArr15 = this._workingKey;
            int i22 = i16 + 6;
            iArr15[c2] = iArr15[c2] ^ m221196F1(iArr15[1], this._Tm[i22], this._Tr[i22]);
            int[] iArr16 = this._workingKey;
            int i23 = i16 + 7;
            iArr16[7] = m221197F2(iArr16[c2], this._Tm[i23], this._Tr[i23]) ^ iArr16[7];
            int[] iArr17 = this._Kr;
            int i24 = i7 * 4;
            int[] iArr18 = this._workingKey;
            iArr17[i24] = iArr18[c2] & 31;
            int i25 = i24 + 1;
            iArr17[i25] = iArr18[2] & 31;
            int i26 = i24 + 2;
            iArr17[i26] = iArr18[4] & 31;
            int i27 = i24 + 3;
            iArr17[i27] = iArr18[6] & 31;
            int[] iArr19 = this._Km;
            iArr19[i24] = iArr18[7];
            iArr19[i25] = iArr18[5];
            iArr19[i26] = iArr18[3];
            iArr19[i27] = iArr18[1];
            i7++;
            c = c2;
        }
    }
}
