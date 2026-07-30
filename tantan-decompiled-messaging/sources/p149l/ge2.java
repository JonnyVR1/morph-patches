package p149l;

import com.google.android.gms.common.api.Api;
import com.google.android.vending.licensing.util.Base64DecoderException;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class ge2 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f102146a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: b */
    public static final byte[] f102147b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: c */
    public static final byte[] f102148c = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, HttpTokens.COLON, HttpTokens.SEMI_COLON, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, HttpTokens.CARRIAGE_RETURN, 14, 15, Tnaf.POW_2_WIDTH, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, HttpTokens.SPACE, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: d */
    public static final byte[] f102149d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, HttpTokens.COLON, HttpTokens.SEMI_COLON, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, HttpTokens.CARRIAGE_RETURN, 14, 15, Tnaf.POW_2_WIDTH, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, Utf8.REPLACEMENT_BYTE, -9, 26, 27, 28, 29, 30, 31, HttpTokens.SPACE, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: a */
    public static byte[] m125600a(String str) throws Base64DecoderException {
        byte[] bytes = str.getBytes();
        return m125601b(bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m125601b(byte[] bArr, int i, int i2) throws Base64DecoderException {
        return m125602c(bArr, i, i2, f102148c);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m125602c(byte[] bArr, int i, int i2, byte[] bArr2) throws Base64DecoderException {
        byte[] bArr3 = new byte[((i2 * 3) / 4) + 2];
        byte[] bArr4 = new byte[4];
        int i3 = 0;
        int iM125603d = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i4 + i;
            byte b = (byte) (bArr[i5] & 127);
            byte b2 = bArr2[b];
            if (b2 < -5) {
                throw new Base64DecoderException("Bad Base64 input character at " + i4 + ": " + ((int) bArr[i5]) + "(decimal)");
            }
            if (b2 >= -1) {
                if (b == 61) {
                    int i6 = i2 - i4;
                    byte b3 = (byte) (bArr[(i2 - 1) + i] & 127);
                    if (i3 == 0 || i3 == 1) {
                        throw new Base64DecoderException("invalid padding byte '=' at byte offset " + i4);
                    }
                    if ((i3 == 3 && i6 > 2) || (i3 == 4 && i6 > 1)) {
                        throw new Base64DecoderException("padding byte '=' falsely signals end of encoded value at offset " + i4);
                    }
                    if (b3 != 61 && b3 != 10) {
                        throw new Base64DecoderException("encoded value has invalid trailing byte");
                    }
                    break;
                    break;
                }
                int i7 = i3 + 1;
                bArr4[i3] = b;
                if (i7 == 4) {
                    iM125603d += m125603d(bArr4, 0, bArr3, iM125603d, bArr2);
                    i3 = 0;
                } else {
                    i3 = i7;
                }
            }
        }
        if (i3 != 0) {
            if (i3 == 1) {
                throw new Base64DecoderException("single trailing character at offset " + (i2 - 1));
            }
            bArr4[i3] = 61;
            iM125603d += m125603d(bArr4, 0, bArr3, iM125603d, bArr2);
        }
        byte[] bArr5 = new byte[iM125603d];
        System.arraycopy(bArr3, 0, bArr5, 0, iM125603d);
        return bArr5;
    }

    /* JADX INFO: renamed from: d */
    public static int m125603d(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3) {
        byte b = bArr[i + 2];
        if (b == 61) {
            bArr2[i2] = (byte) ((((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        byte b2 = bArr[i + 3];
        if (b2 == 61) {
            int i3 = ((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[b] << 24) >>> 18);
            bArr2[i2] = (byte) (i3 >>> 16);
            bArr2[i2 + 1] = (byte) (i3 >>> 8);
            return 2;
        }
        int i4 = ((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[b] << 24) >>> 18) | ((bArr3[b2] << 24) >>> 24);
        bArr2[i2] = (byte) (i4 >> 16);
        bArr2[i2 + 1] = (byte) (i4 >> 8);
        bArr2[i2 + 2] = (byte) i4;
        return 3;
    }

    /* JADX INFO: renamed from: e */
    public static String m125604e(byte[] bArr) {
        return m125605f(bArr, 0, bArr.length, f102146a, true);
    }

    /* JADX INFO: renamed from: f */
    public static String m125605f(byte[] bArr, int i, int i2, byte[] bArr2, boolean z) {
        byte[] bArrM125606g = m125606g(bArr, i, i2, bArr2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        int length = bArrM125606g.length;
        while (!z && length > 0 && bArrM125606g[length - 1] == 61) {
            length--;
        }
        return new String(bArrM125606g, 0, length);
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m125606g(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = ((i2 + 2) / 3) * 4;
        byte[] bArr3 = new byte[i4 + (i4 / i3)];
        int i5 = i2 - 2;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i5) {
            int i9 = ((bArr[i6 + i] << 24) >>> 8) | ((bArr[(i6 + 1) + i] << 24) >>> 16) | ((bArr[(i6 + 2) + i] << 24) >>> 24);
            bArr3[i7] = bArr2[i9 >>> 18];
            int i10 = i7 + 1;
            bArr3[i10] = bArr2[(i9 >>> 12) & 63];
            bArr3[i7 + 2] = bArr2[(i9 >>> 6) & 63];
            bArr3[i7 + 3] = bArr2[i9 & 63];
            i8 += 4;
            if (i8 == i3) {
                bArr3[i7 + 4] = 10;
                i8 = 0;
                i7 = i10;
            }
            i6 += 3;
            i7 += 4;
        }
        if (i6 < i2) {
            m125607h(bArr, i + i6, i2 - i6, bArr3, i7, bArr2);
            if (i8 + 4 == i3) {
                bArr3[i7 + 4] = 10;
            }
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m125607h(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3) {
        int i4 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = bArr3[i4 >>> 18];
            bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 == 2) {
            bArr2[i3] = bArr3[i4 >>> 18];
            bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 != 3) {
            return bArr2;
        }
        bArr2[i3] = bArr3[i4 >>> 18];
        bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
        bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
        bArr2[i3 + 3] = bArr3[i4 & 63];
        return bArr2;
    }
}
