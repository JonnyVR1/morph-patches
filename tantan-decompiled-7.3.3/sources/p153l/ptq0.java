package p153l;

/* JADX INFO: loaded from: classes2.dex */
public class ptq0 {

    /* JADX INFO: renamed from: a */
    private static final String f154104a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: b */
    private static char[] f154105b = new char[64];

    /* JADX INFO: renamed from: c */
    private static byte[] f154106c;

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            f154105b[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            f154105b[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = '0';
        while (c3 <= '9') {
            f154105b[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char[] cArr = f154105b;
        cArr[i] = '+';
        cArr[i + 1] = '/';
        f154106c = new byte[128];
        int i2 = 0;
        while (true) {
            byte[] bArr = f154106c;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            f154106c[f154105b[i3]] = (byte) i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m173773a(String str) {
        return new String(m173777e(str.getBytes()));
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m173774b(String str) {
        return m173775c(str.toCharArray());
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m173775c(char[] cArr) {
        return m173776d(cArr, 0, cArr.length);
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m173776d(char[] cArr, int i, int i2) {
        char c;
        if (i2 % 4 != 0) {
            wg3.m206174a("Length of Base64 encoded input string is not a multiple of 4.");
            return null;
        }
        while (i2 > 0 && cArr[(i + i2) - 1] == '=') {
            i2--;
        }
        int i3 = (i2 * 3) / 4;
        byte[] bArr = new byte[i3];
        int i4 = i2 + i;
        int i5 = 0;
        while (i < i4) {
            char c2 = cArr[i];
            int i6 = i + 2;
            char c3 = cArr[i + 1];
            char c4 = 'A';
            if (i6 < i4) {
                i += 3;
                c = cArr[i6];
            } else {
                i = i6;
                c = 'A';
            }
            if (i < i4) {
                c4 = cArr[i];
                i++;
            }
            if (c2 > 127 || c3 > 127 || c > 127 || c4 > 127) {
                wg3.m206174a("Illegal character in Base64 encoded data.");
                return null;
            }
            byte[] bArr2 = f154106c;
            byte b = bArr2[c2];
            byte b2 = bArr2[c3];
            byte b3 = bArr2[c];
            byte b4 = bArr2[c4];
            if (b < 0 || b2 < 0 || b3 < 0 || b4 < 0) {
                wg3.m206174a("Illegal character in Base64 encoded data.");
                return null;
            }
            int i7 = (b << 2) | (b2 >>> 4);
            int i8 = ((b2 & 15) << 4) | (b3 >>> 2);
            int i9 = ((b3 & 3) << 6) | b4;
            int i10 = i5 + 1;
            bArr[i5] = (byte) i7;
            if (i10 < i3) {
                bArr[i10] = (byte) i8;
                i10 = i5 + 2;
            }
            if (i10 < i3) {
                i5 = i10 + 1;
                bArr[i10] = (byte) i9;
            } else {
                i5 = i10;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    public static char[] m173777e(byte[] bArr) {
        return m173778f(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: f */
    public static char[] m173778f(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = ((i2 * 4) + 2) / 3;
        char[] cArr = new char[((i2 + 2) / 3) * 4];
        int i8 = i2 + i;
        int i9 = 0;
        while (i < i8) {
            int i10 = i + 1;
            byte b = bArr[i];
            int i11 = b & 255;
            if (i10 < i8) {
                i3 = i + 2;
                i4 = bArr[i10] & 255;
            } else {
                i3 = i10;
                i4 = 0;
            }
            if (i3 < i8) {
                i5 = i3 + 1;
                i6 = bArr[i3] & 255;
            } else {
                i5 = i3;
                i6 = 0;
            }
            int i12 = ((b & 3) << 4) | (i4 >>> 4);
            int i13 = ((i4 & 15) << 2) | (i6 >>> 6);
            int i14 = i6 & 63;
            char[] cArr2 = f154105b;
            cArr[i9] = cArr2[i11 >>> 2];
            int i15 = i9 + 2;
            cArr[i9 + 1] = cArr2[i12];
            char c = '=';
            cArr[i15] = i15 < i7 ? cArr2[i13] : '=';
            int i16 = i9 + 3;
            if (i16 < i7) {
                c = cArr2[i14];
            }
            cArr[i16] = c;
            i9 += 4;
            i = i5;
        }
        return cArr;
    }

    /* JADX INFO: renamed from: g */
    public static String m173779g(String str) {
        return new String(m173774b(str));
    }
}
