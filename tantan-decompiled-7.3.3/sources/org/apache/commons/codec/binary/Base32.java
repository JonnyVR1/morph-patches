package org.apache.commons.codec.binary;

import com.clevertap.android.sdk.Constants;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.i2r0;
import p153l.v1d0;

/* JADX INFO: loaded from: classes2.dex */
public class Base32 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 5;
    private static final int BYTES_PER_ENCODED_BLOCK = 8;
    private static final int BYTES_PER_UNENCODED_BLOCK = 5;
    private static final byte[] CHUNK_SEPARATOR = {HttpTokens.CARRIAGE_RETURN, 10};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, HttpTokens.CARRIAGE_RETURN, 14, 15, Tnaf.POW_2_WIDTH, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    private static final byte[] ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    private static final byte[] HEX_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, HttpTokens.CARRIAGE_RETURN, 14, 15, Tnaf.POW_2_WIDTH, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, HttpTokens.SPACE};
    private static final byte[] HEX_ENCODE_TABLE = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};
    private static final int MASK_5BITS = 31;
    private long bitWorkArea;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;

    public Base32(int i, byte[] bArr, boolean z) {
        super(5, 8, i, bArr == null ? 0 : bArr.length);
        if (z) {
            this.encodeTable = HEX_ENCODE_TABLE;
            this.decodeTable = HEX_DECODE_TABLE;
        } else {
            this.encodeTable = ENCODE_TABLE;
            this.decodeTable = DECODE_TABLE;
        }
        if (i <= 0) {
            this.encodeSize = 8;
            this.lineSeparator = null;
        } else {
            if (bArr == null) {
                i2r0.m138234a("lineLength ", i, " > 0, but lineSeparator is null");
                throw null;
            }
            if (containsAlphabetOrPad(bArr)) {
                v1d0.m199002a("lineSeparator must not contain Base32 characters: [", StringUtils.newStringUtf8(bArr), Constants.AES_SUFFIX);
                throw null;
            }
            this.encodeSize = bArr.length + 8;
            byte[] bArr2 = new byte[bArr.length];
            this.lineSeparator = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.decodeSize = this.encodeSize - 1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void decode(byte[] bArr, int i, int i2) {
        byte b;
        if (this.eof) {
            return;
        }
        ?? r2 = 1;
        if (i2 < 0) {
            this.eof = true;
        }
        int i3 = 0;
        int i4 = i;
        while (i3 < i2) {
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 == 61) {
                this.eof = r2;
                break;
            }
            ensureBufferSize(this.decodeSize);
            if (b2 >= 0) {
                byte[] bArr2 = this.decodeTable;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i6 = (this.modulus + r2) % 8;
                    this.modulus = i6;
                    long j = (this.bitWorkArea << 5) + ((long) b);
                    this.bitWorkArea = j;
                    if (i6 == 0) {
                        byte[] bArr3 = this.buffer;
                        int i7 = this.pos;
                        int i8 = i7 + 1;
                        this.pos = i8;
                        bArr3[i7] = (byte) ((j >> 32) & 255);
                        int i9 = i7 + 2;
                        this.pos = i9;
                        bArr3[i8] = (byte) ((j >> 24) & 255);
                        int i10 = i7 + 3;
                        this.pos = i10;
                        bArr3[i9] = (byte) ((j >> 16) & 255);
                        int i11 = i7 + 4;
                        this.pos = i11;
                        bArr3[i10] = (byte) ((j >> 8) & 255);
                        this.pos = i7 + 5;
                        bArr3[i11] = (byte) (j & 255);
                    }
                }
            }
            i3++;
            i4 = i5;
            r2 = r2;
        }
        ?? r17 = r2;
        if (!this.eof || this.modulus < 2) {
            return;
        }
        ensureBufferSize(this.decodeSize);
        switch (this.modulus) {
            case 2:
                byte[] bArr4 = this.buffer;
                int i12 = this.pos;
                this.pos = i12 + 1;
                bArr4[i12] = (byte) ((this.bitWorkArea >> 2) & 255);
                break;
            case 3:
                byte[] bArr5 = this.buffer;
                int i13 = this.pos;
                this.pos = i13 + 1;
                bArr5[i13] = (byte) ((this.bitWorkArea >> 7) & 255);
                break;
            case 4:
                long j2 = this.bitWorkArea;
                long j3 = j2 >> 4;
                this.bitWorkArea = j3;
                byte[] bArr6 = this.buffer;
                int i14 = this.pos;
                int i15 = i14 + 1;
                this.pos = i15;
                bArr6[i14] = (byte) ((j2 >> 12) & 255);
                this.pos = i14 + 2;
                bArr6[i15] = (byte) (j3 & 255);
                break;
            case 5:
                long j4 = this.bitWorkArea;
                long j5 = j4 >> (r17 == true ? 1L : 0L);
                this.bitWorkArea = j5;
                byte[] bArr7 = this.buffer;
                int i16 = this.pos;
                int i17 = i16 + 1;
                this.pos = i17;
                bArr7[i16] = (byte) ((j4 >> 17) & 255);
                int i18 = i16 + 2;
                this.pos = i18;
                bArr7[i17] = (byte) ((j4 >> 9) & 255);
                this.pos = i16 + 3;
                bArr7[i18] = (byte) (j5 & 255);
                break;
            case 6:
                long j6 = this.bitWorkArea;
                long j7 = j6 >> 6;
                this.bitWorkArea = j7;
                byte[] bArr8 = this.buffer;
                int i19 = this.pos;
                int i20 = i19 + 1;
                this.pos = i20;
                bArr8[i19] = (byte) ((j6 >> 22) & 255);
                int i21 = i19 + 2;
                this.pos = i21;
                bArr8[i20] = (byte) ((j6 >> 14) & 255);
                this.pos = i19 + 3;
                bArr8[i21] = (byte) (j7 & 255);
                break;
            case 7:
                long j8 = this.bitWorkArea;
                long j9 = j8 >> 3;
                this.bitWorkArea = j9;
                byte[] bArr9 = this.buffer;
                int i22 = this.pos;
                int i23 = i22 + 1;
                this.pos = i23;
                bArr9[i22] = (byte) ((j8 >> 27) & 255);
                int i24 = i22 + 2;
                this.pos = i24;
                bArr9[i23] = (byte) ((j8 >> 19) & 255);
                int i25 = i22 + 3;
                this.pos = i25;
                bArr9[i24] = (byte) ((j8 >> 11) & 255);
                this.pos = i22 + 4;
                bArr9[i25] = (byte) (j9 & 255);
                break;
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i, int i2) {
        int i3;
        if (this.eof) {
            return;
        }
        if (i2 >= 0) {
            int i4 = i;
            int i5 = 0;
            while (i5 < i2) {
                ensureBufferSize(this.encodeSize);
                int i6 = (this.modulus + 1) % 5;
                this.modulus = i6;
                int i7 = i4 + 1;
                int i8 = bArr[i4];
                if (i8 < 0) {
                    i8 += 256;
                }
                long j = (this.bitWorkArea << 8) + ((long) i8);
                this.bitWorkArea = j;
                if (i6 == 0) {
                    byte[] bArr2 = this.buffer;
                    int i9 = this.pos;
                    int i10 = i9 + 1;
                    this.pos = i10;
                    byte[] bArr3 = this.encodeTable;
                    bArr2[i9] = bArr3[((int) (j >> 35)) & 31];
                    int i11 = i9 + 2;
                    this.pos = i11;
                    i3 = i7;
                    bArr2[i10] = bArr3[((int) (j >> 30)) & 31];
                    int i12 = i9 + 3;
                    this.pos = i12;
                    bArr2[i11] = bArr3[((int) (j >> 25)) & 31];
                    int i13 = i9 + 4;
                    this.pos = i13;
                    bArr2[i12] = bArr3[((int) (j >> 20)) & 31];
                    int i14 = i9 + 5;
                    this.pos = i14;
                    bArr2[i13] = bArr3[((int) (j >> 15)) & 31];
                    int i15 = i9 + 6;
                    this.pos = i15;
                    bArr2[i14] = bArr3[((int) (j >> 10)) & 31];
                    int i16 = i9 + 7;
                    this.pos = i16;
                    bArr2[i15] = bArr3[((int) (j >> 5)) & 31];
                    int i17 = i9 + 8;
                    this.pos = i17;
                    bArr2[i16] = bArr3[((int) j) & 31];
                    int i18 = this.currentLinePos + 8;
                    this.currentLinePos = i18;
                    int i19 = this.lineLength;
                    if (i19 > 0 && i19 <= i18) {
                        byte[] bArr4 = this.lineSeparator;
                        System.arraycopy(bArr4, 0, bArr2, i17, bArr4.length);
                        this.pos += this.lineSeparator.length;
                        this.currentLinePos = 0;
                    }
                } else {
                    i3 = i7;
                }
                i5++;
                i4 = i3;
            }
            return;
        }
        this.eof = true;
        if (this.modulus == 0 && this.lineLength == 0) {
            return;
        }
        ensureBufferSize(this.encodeSize);
        int i20 = this.pos;
        int i21 = this.modulus;
        if (i21 == 1) {
            byte[] bArr5 = this.buffer;
            int i22 = i20 + 1;
            this.pos = i22;
            byte[] bArr6 = this.encodeTable;
            long j2 = this.bitWorkArea;
            bArr5[i20] = bArr6[((int) (j2 >> 3)) & 31];
            int i23 = i20 + 2;
            this.pos = i23;
            bArr5[i22] = bArr6[((int) (j2 << 2)) & 31];
            int i24 = i20 + 3;
            this.pos = i24;
            bArr5[i23] = 61;
            int i25 = i20 + 4;
            this.pos = i25;
            bArr5[i24] = 61;
            int i26 = i20 + 5;
            this.pos = i26;
            bArr5[i25] = 61;
            int i27 = i20 + 6;
            this.pos = i27;
            bArr5[i26] = 61;
            int i28 = i20 + 7;
            this.pos = i28;
            bArr5[i27] = 61;
            this.pos = i20 + 8;
            bArr5[i28] = 61;
        } else if (i21 == 2) {
            byte[] bArr7 = this.buffer;
            int i29 = i20 + 1;
            this.pos = i29;
            byte[] bArr8 = this.encodeTable;
            long j3 = this.bitWorkArea;
            bArr7[i20] = bArr8[((int) (j3 >> 11)) & 31];
            int i30 = i20 + 2;
            this.pos = i30;
            bArr7[i29] = bArr8[((int) (j3 >> 6)) & 31];
            int i31 = i20 + 3;
            this.pos = i31;
            bArr7[i30] = bArr8[((int) (j3 >> 1)) & 31];
            int i32 = i20 + 4;
            this.pos = i32;
            bArr7[i31] = bArr8[((int) (j3 << 4)) & 31];
            int i33 = i20 + 5;
            this.pos = i33;
            bArr7[i32] = 61;
            int i34 = i20 + 6;
            this.pos = i34;
            bArr7[i33] = 61;
            int i35 = i20 + 7;
            this.pos = i35;
            bArr7[i34] = 61;
            this.pos = i20 + 8;
            bArr7[i35] = 61;
        } else if (i21 == 3) {
            byte[] bArr9 = this.buffer;
            int i36 = i20 + 1;
            this.pos = i36;
            byte[] bArr10 = this.encodeTable;
            long j4 = this.bitWorkArea;
            bArr9[i20] = bArr10[((int) (j4 >> 19)) & 31];
            int i37 = i20 + 2;
            this.pos = i37;
            bArr9[i36] = bArr10[((int) (j4 >> 14)) & 31];
            int i38 = i20 + 3;
            this.pos = i38;
            bArr9[i37] = bArr10[((int) (j4 >> 9)) & 31];
            int i39 = i20 + 4;
            this.pos = i39;
            bArr9[i38] = bArr10[((int) (j4 >> 4)) & 31];
            int i40 = i20 + 5;
            this.pos = i40;
            bArr9[i39] = bArr10[((int) (j4 << 1)) & 31];
            int i41 = i20 + 6;
            this.pos = i41;
            bArr9[i40] = 61;
            int i42 = i20 + 7;
            this.pos = i42;
            bArr9[i41] = 61;
            this.pos = i20 + 8;
            bArr9[i42] = 61;
        } else if (i21 == 4) {
            byte[] bArr11 = this.buffer;
            int i43 = i20 + 1;
            this.pos = i43;
            byte[] bArr12 = this.encodeTable;
            long j5 = this.bitWorkArea;
            bArr11[i20] = bArr12[((int) (j5 >> 27)) & 31];
            int i44 = i20 + 2;
            this.pos = i44;
            bArr11[i43] = bArr12[((int) (j5 >> 22)) & 31];
            int i45 = i20 + 3;
            this.pos = i45;
            bArr11[i44] = bArr12[((int) (j5 >> 17)) & 31];
            int i46 = i20 + 4;
            this.pos = i46;
            bArr11[i45] = bArr12[((int) (j5 >> 12)) & 31];
            int i47 = i20 + 5;
            this.pos = i47;
            bArr11[i46] = bArr12[((int) (j5 >> 7)) & 31];
            int i48 = i20 + 6;
            this.pos = i48;
            bArr11[i47] = bArr12[((int) (j5 >> 2)) & 31];
            int i49 = i20 + 7;
            this.pos = i49;
            bArr11[i48] = bArr12[((int) (j5 << 3)) & 31];
            this.pos = i20 + 8;
            bArr11[i49] = 61;
        }
        int i50 = this.currentLinePos;
        int i51 = this.pos;
        int i52 = i50 + (i51 - i20);
        this.currentLinePos = i52;
        if (this.lineLength <= 0 || i52 <= 0) {
            return;
        }
        byte[] bArr13 = this.lineSeparator;
        System.arraycopy(bArr13, 0, this.buffer, i51, bArr13.length);
        this.pos += this.lineSeparator.length;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b) {
        if (b < 0) {
            return false;
        }
        byte[] bArr = this.decodeTable;
        return b < bArr.length && bArr[b] != -1;
    }

    public Base32(boolean z) {
        this(0, null, z);
    }

    public Base32(int i) {
        this(i, CHUNK_SEPARATOR);
    }

    public Base32(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public Base32() {
        this(false);
    }
}
