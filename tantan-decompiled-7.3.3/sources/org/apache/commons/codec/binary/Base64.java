package org.apache.commons.codec.binary;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import java.math.BigInteger;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.mnd0;
import p153l.v1d0;

/* JADX INFO: loaded from: classes2.dex */
public class Base64 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int MASK_6BITS = 63;
    private int bitWorkArea;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;
    static final byte[] CHUNK_SEPARATOR = {HttpTokens.CARRIAGE_RETURN, 10};
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, HttpTokens.COLON, HttpTokens.SEMI_COLON, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, HttpTokens.CARRIAGE_RETURN, 14, 15, Tnaf.POW_2_WIDTH, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, 26, 27, 28, 29, 30, 31, HttpTokens.SPACE, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public Base64(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.decodeTable = DECODE_TABLE;
        if (bArr == null) {
            this.encodeSize = 4;
            this.lineSeparator = null;
        } else {
            if (containsAlphabetOrPad(bArr)) {
                v1d0.m199002a("lineSeparator must not contain base64 characters: [", StringUtils.newStringUtf8(bArr), Constants.AES_SUFFIX);
                throw null;
            }
            if (i > 0) {
                this.encodeSize = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.lineSeparator = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.encodeSize = 4;
                this.lineSeparator = null;
            }
        }
        this.decodeSize = this.encodeSize - 1;
        this.encodeTable = z ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z ? new Base64(z2) : new Base64(0, CHUNK_SEPARATOR, z2);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        if (bigInteger != null) {
            return encodeBase64(toIntegerBytes(bigInteger), false);
        }
        mnd0.m159157a("encodeInteger called with null parameter");
        return null;
    }

    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    public static boolean isBase64(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (!isBase64(bArr[i]) && !BaseNCodec.isWhiteSpace(bArr[i])) {
                return false;
            }
        }
        return true;
    }

    public static byte[] toIntegerBytes(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == iBitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i = 0;
        }
        int i2 = iBitLength / 8;
        int i3 = i2 - length;
        byte[] bArr = new byte[i2];
        System.arraycopy(byteArray, i, bArr, i3, length);
        return bArr;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void decode(byte[] bArr, int i, int i2) {
        byte b;
        if (this.eof) {
            return;
        }
        if (i2 < 0) {
            this.eof = true;
        }
        int i3 = 0;
        while (i3 < i2) {
            ensureBufferSize(this.decodeSize);
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == 61) {
                this.eof = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = DECODE_TABLE;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i5 = (this.modulus + 1) % 4;
                    this.modulus = i5;
                    int i6 = (this.bitWorkArea << 6) + b;
                    this.bitWorkArea = i6;
                    if (i5 == 0) {
                        byte[] bArr3 = this.buffer;
                        int i7 = this.pos;
                        int i8 = i7 + 1;
                        this.pos = i8;
                        bArr3[i7] = (byte) ((i6 >> 16) & 255);
                        int i9 = i7 + 2;
                        this.pos = i9;
                        bArr3[i8] = (byte) ((i6 >> 8) & 255);
                        this.pos = i7 + 3;
                        bArr3[i9] = (byte) (i6 & 255);
                    }
                }
            }
            i3++;
            i = i4;
        }
        if (!this.eof || this.modulus == 0) {
            return;
        }
        ensureBufferSize(this.decodeSize);
        int i10 = this.modulus;
        if (i10 == 2) {
            int i11 = this.bitWorkArea >> 4;
            this.bitWorkArea = i11;
            byte[] bArr4 = this.buffer;
            int i12 = this.pos;
            this.pos = i12 + 1;
            bArr4[i12] = (byte) (i11 & 255);
            return;
        }
        if (i10 != 3) {
            return;
        }
        int i13 = this.bitWorkArea;
        int i14 = i13 >> 2;
        this.bitWorkArea = i14;
        byte[] bArr5 = this.buffer;
        int i15 = this.pos;
        int i16 = i15 + 1;
        this.pos = i16;
        bArr5[i15] = (byte) ((i13 >> 10) & 255);
        this.pos = i15 + 2;
        bArr5[i16] = (byte) (i14 & 255);
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i, int i2) {
        if (this.eof) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                ensureBufferSize(this.encodeSize);
                int i4 = (this.modulus + 1) % 3;
                this.modulus = i4;
                int i5 = i + 1;
                int i6 = bArr[i];
                if (i6 < 0) {
                    i6 += 256;
                }
                int i7 = (this.bitWorkArea << 8) + i6;
                this.bitWorkArea = i7;
                if (i4 == 0) {
                    byte[] bArr2 = this.buffer;
                    int i8 = this.pos;
                    int i9 = i8 + 1;
                    this.pos = i9;
                    byte[] bArr3 = this.encodeTable;
                    bArr2[i8] = bArr3[(i7 >> 18) & 63];
                    int i10 = i8 + 2;
                    this.pos = i10;
                    bArr2[i9] = bArr3[(i7 >> 12) & 63];
                    int i11 = i8 + 3;
                    this.pos = i11;
                    bArr2[i10] = bArr3[(i7 >> 6) & 63];
                    int i12 = i8 + 4;
                    this.pos = i12;
                    bArr2[i11] = bArr3[i7 & 63];
                    int i13 = this.currentLinePos + 4;
                    this.currentLinePos = i13;
                    int i14 = this.lineLength;
                    if (i14 > 0 && i14 <= i13) {
                        byte[] bArr4 = this.lineSeparator;
                        System.arraycopy(bArr4, 0, bArr2, i12, bArr4.length);
                        this.pos += this.lineSeparator.length;
                        this.currentLinePos = 0;
                    }
                }
                i3++;
                i = i5;
            }
            return;
        }
        this.eof = true;
        if (this.modulus == 0 && this.lineLength == 0) {
            return;
        }
        ensureBufferSize(this.encodeSize);
        int i15 = this.pos;
        int i16 = this.modulus;
        if (i16 == 1) {
            byte[] bArr5 = this.buffer;
            int i17 = i15 + 1;
            this.pos = i17;
            byte[] bArr6 = this.encodeTable;
            int i18 = this.bitWorkArea;
            bArr5[i15] = bArr6[(i18 >> 2) & 63];
            int i19 = i15 + 2;
            this.pos = i19;
            bArr5[i17] = bArr6[(i18 << 4) & 63];
            if (bArr6 == STANDARD_ENCODE_TABLE) {
                int i20 = i15 + 3;
                this.pos = i20;
                bArr5[i19] = 61;
                this.pos = i15 + 4;
                bArr5[i20] = 61;
            }
        } else if (i16 == 2) {
            byte[] bArr7 = this.buffer;
            int i21 = i15 + 1;
            this.pos = i21;
            byte[] bArr8 = this.encodeTable;
            int i22 = this.bitWorkArea;
            bArr7[i15] = bArr8[(i22 >> 10) & 63];
            int i23 = i15 + 2;
            this.pos = i23;
            bArr7[i21] = bArr8[(i22 >> 4) & 63];
            int i24 = i15 + 3;
            this.pos = i24;
            bArr7[i23] = bArr8[(i22 << 2) & 63];
            if (bArr8 == STANDARD_ENCODE_TABLE) {
                this.pos = i15 + 4;
                bArr7[i24] = 61;
            }
        }
        int i25 = this.currentLinePos;
        int i26 = this.pos;
        int i27 = i25 + (i26 - i15);
        this.currentLinePos = i27;
        if (this.lineLength <= 0 || i27 <= 0) {
            return;
        }
        byte[] bArr9 = this.lineSeparator;
        System.arraycopy(bArr9, 0, this.buffer, i26, bArr9.length);
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

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    public static boolean isBase64(String str) {
        return isBase64(StringUtils.getBytesUtf8(str));
    }

    public static boolean isBase64(byte b) {
        if (b == 61) {
            return true;
        }
        if (b < 0) {
            return false;
        }
        byte[] bArr = DECODE_TABLE;
        return b < bArr.length && bArr[b] != -1;
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public Base64(boolean z) {
        this(76, CHUNK_SEPARATOR, z);
    }

    public Base64(int i) {
        this(i, CHUNK_SEPARATOR);
    }

    public Base64(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public Base64() {
        this(0);
    }
}
