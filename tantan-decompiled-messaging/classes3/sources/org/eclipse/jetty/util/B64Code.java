package org.eclipse.jetty.util;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import l.ctq0;
import l.ig3;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class B64Code {
    static final char pad = '=';
    static final char[] rfc1421alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    static final byte[] rfc1421nibbles = new byte[256];

    static {
        for (int i = 0; i < 256; i++) {
            rfc1421nibbles[i] = -1;
        }
        for (byte b = 0; b < 64; b = (byte) (b + 1)) {
            rfc1421nibbles[(byte) rfc1421alphabet[b]] = b;
        }
        rfc1421nibbles[61] = 0;
    }

    public static byte[] decode(char[] cArr) {
        int i;
        if (cArr == null) {
            return null;
        }
        int length = cArr.length;
        if (length % 4 != 0) {
            ig3.a("Input block size is not 4");
            return null;
        }
        int i2 = length - 1;
        while (i2 >= 0 && cArr[i2] == '=') {
            i2--;
        }
        int i3 = 0;
        if (i2 < 0) {
            return new byte[0];
        }
        int i4 = ((i2 + 1) * 3) / 4;
        byte[] bArr = new byte[i4];
        int i5 = (i4 / 3) * 3;
        int i6 = 0;
        while (i3 < i5) {
            try {
                byte[] bArr2 = rfc1421nibbles;
                i = i6 + 1;
                try {
                    byte b = bArr2[cArr[i6]];
                    int i7 = i6 + 2;
                    try {
                        byte b2 = bArr2[cArr[i]];
                        int i8 = i6 + 3;
                        try {
                            byte b3 = bArr2[cArr[i7]];
                            i6 += 4;
                            byte b4 = bArr2[cArr[i8]];
                            if (b < 0 || b2 < 0 || b3 < 0 || b4 < 0) {
                                throw new IllegalArgumentException("Not B64 encoded");
                            }
                            bArr[i3] = (byte) ((b << 2) | (b2 >>> 4));
                            int i9 = i3 + 2;
                            bArr[i3 + 1] = (byte) ((b2 << 4) | (b3 >>> 2));
                            i3 += 3;
                            bArr[i9] = (byte) ((b3 << 6) | b4);
                        } catch (IndexOutOfBoundsException unused) {
                            i6 = i8;
                            ctq0.a("char ", i6, " was not B64 encoded");
                            return null;
                        }
                    } catch (IndexOutOfBoundsException unused2) {
                        i6 = i7;
                    }
                } catch (IndexOutOfBoundsException unused3) {
                    i6 = i;
                }
            } catch (IndexOutOfBoundsException unused4) {
            }
        }
        if (i4 != i3) {
            int i10 = i4 % 3;
            try {
                if (i10 == 1) {
                    byte[] bArr3 = rfc1421nibbles;
                    int i11 = i6 + 1;
                    byte b5 = bArr3[cArr[i6]];
                    int i12 = i6 + 2;
                    byte b6 = bArr3[cArr[i11]];
                    if (b5 < 0 || b6 < 0) {
                        throw new IllegalArgumentException("Not B64 encoded");
                    }
                    bArr[i3] = (byte) ((b6 >>> 4) | (b5 << 2));
                    return bArr;
                }
                if (i10 == 2) {
                    byte[] bArr4 = rfc1421nibbles;
                    int i13 = i6 + 1;
                    byte b7 = bArr4[cArr[i6]];
                    i = i6 + 2;
                    byte b8 = bArr4[cArr[i13]];
                    int i14 = i6 + 3;
                    byte b9 = bArr4[cArr[i]];
                    if (b7 < 0 || b8 < 0 || b9 < 0) {
                        throw new IllegalArgumentException("Not B64 encoded");
                    }
                    bArr[i3] = (byte) ((b7 << 2) | (b8 >>> 4));
                    bArr[i3 + 1] = (byte) ((b9 >>> 2) | (b8 << 4));
                    return bArr;
                }
            } catch (IndexOutOfBoundsException unused5) {
                i6 = 1;
                ctq0.a("char ", i6, " was not B64 encoded");
                return null;
            }
        }
        return bArr;
    }

    public static char[] encode(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        int i = (length + 2) / 3;
        int i2 = i * 4;
        if (z) {
            i2 += ((i * 8) / 76) + 2;
        }
        char[] cArr = new char[i2];
        int i3 = (length / 3) * 3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i3) {
            byte b = bArr[i4];
            int i7 = i4 + 2;
            byte b2 = bArr[i4 + 1];
            i4 += 3;
            byte b3 = bArr[i7];
            char[] cArr2 = rfc1421alphabet;
            cArr[i5] = cArr2[(b >>> 2) & 63];
            cArr[i5 + 1] = cArr2[((b << 4) & 63) | ((b2 >>> 4) & 15)];
            cArr[i5 + 2] = cArr2[((b2 << 2) & 63) | ((b3 >>> 6) & 3)];
            int i8 = i5 + 4;
            cArr[i5 + 3] = cArr2[b3 & 63];
            i6 += 4;
            if (z && i6 % 76 == 0) {
                int i9 = i5 + 5;
                cArr[i8] = '\r';
                i5 += 6;
                cArr[i9] = '\n';
            } else {
                i5 = i8;
            }
        }
        if (length != i4) {
            int i10 = length % 3;
            if (i10 == 1) {
                byte b4 = bArr[i4];
                char[] cArr3 = rfc1421alphabet;
                cArr[i5] = cArr3[(b4 >>> 2) & 63];
                cArr[i5 + 1] = cArr3[(b4 << 4) & 63];
                int i11 = i5 + 3;
                cArr[i5 + 2] = pad;
                i5 += 4;
                cArr[i11] = pad;
            } else if (i10 == 2) {
                int i12 = i4 + 1;
                byte b5 = bArr[i4];
                byte b6 = bArr[i12];
                char[] cArr4 = rfc1421alphabet;
                cArr[i5] = cArr4[(b5 >>> 2) & 63];
                cArr[i5 + 1] = cArr4[((b5 << 4) & 63) | ((b6 >>> 4) & 15)];
                int i13 = i5 + 3;
                cArr[i5 + 2] = cArr4[(b6 << 2) & 63];
                i5 += 4;
                cArr[i13] = pad;
            }
        }
        if (z) {
            cArr[i5] = '\r';
            cArr[i5 + 1] = '\n';
        }
        return cArr;
    }

    public static String encode(String str, String str2) throws UnsupportedEncodingException {
        byte[] bytes;
        if (str2 == null) {
            bytes = str.getBytes("ISO-8859-1");
        } else {
            bytes = str.getBytes(str2);
        }
        return new String(encode(bytes));
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public static String encode(String str) {
        try {
            return encode(str, (String) null);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e.toString());
        }
    }

    public static String decode(String str, String str2) throws UnsupportedEncodingException {
        byte[] bArrDecode = decode(str);
        if (str2 == null) {
            return new String(bArrDecode);
        }
        return new String(bArrDecode, str2);
    }

    public static byte[] decode(String str) {
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[4];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() * 4) / 3);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt == '=') {
                break;
            }
            if (!Character.isWhitespace(cCharAt)) {
                byte b = rfc1421nibbles[cCharAt];
                if (b >= 0) {
                    int i4 = i2 + 1;
                    bArr[i2] = b;
                    if (i4 == 2) {
                        byteArrayOutputStream.write((bArr[1] >>> 4) | (bArr[0] << 2));
                    } else if (i4 == 3) {
                        byteArrayOutputStream.write((bArr[1] << 4) | (bArr[2] >>> 2));
                    } else if (i4 == 4) {
                        byteArrayOutputStream.write((bArr[2] << 6) | bArr[3]);
                        i2 = 0;
                    }
                    i2 = i4;
                } else {
                    ig3.a("Not B64 encoded");
                    return null;
                }
            }
            i = i3;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
