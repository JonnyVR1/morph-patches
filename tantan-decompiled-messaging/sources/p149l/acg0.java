package p149l;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes.dex */
public abstract class acg0 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f68799a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: b */
    public static final byte[] f68800b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: c */
    public static final byte[] f68801c = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f68802d = true;

    /* JADX INFO: renamed from: a */
    public static String m95722a(byte[] bArr) {
        String strM95723b;
        try {
            strM95723b = m95723b(bArr, bArr.length);
        } catch (IOException e) {
            if (!f68802d) {
                y9g0.m213537a(e.getMessage());
                return null;
            }
            strM95723b = null;
        }
        if (f68802d || strM95723b != null) {
            return strM95723b;
        }
        shg0.m184191a();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m95723b(byte[] bArr, int i) {
        if (bArr == null) {
            ig3.m135964a("Cannot serialize a null array.");
            return null;
        }
        if (i < 0) {
            ig3.m135964a(vdg0.m197997a(i, "Cannot have length offset: "));
            return null;
        }
        if (i > bArr.length) {
            dqi0.m113073a("Cannot have offset of %d and length of %d with array of length %d", new Object[]{0, Integer.valueOf(i), Integer.valueOf(bArr.length)});
            return null;
        }
        int i2 = ((i / 3) * 4) + (i % 3 <= 0 ? 0 : 4);
        byte[] bArr2 = new byte[i2];
        int i3 = i - 2;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            m95724c(bArr, i4, 3, bArr2, i5, 0);
            i4 += 3;
            i5 += 4;
        }
        if (i4 < i) {
            m95724c(bArr, i4, i - i4, bArr2, i5, 0);
            i5 += 4;
        }
        if (i5 <= i2 - 1) {
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr2, 0, bArr3, 0, i5);
            bArr2 = bArr3;
        }
        try {
            return new String(bArr2, CharEncoding.US_ASCII);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m95724c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] bArr3;
        if ((i4 & 16) == 16) {
            bArr3 = f68800b;
        } else {
            bArr3 = (i4 & 32) == 32 ? f68801c : f68799a;
        }
        int i5 = (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = bArr3[i5 >>> 18];
            bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return;
        }
        if (i2 == 2) {
            bArr2[i3] = bArr3[i5 >>> 18];
            bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i5 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return;
        }
        if (i2 != 3) {
            return;
        }
        bArr2[i3] = bArr3[i5 >>> 18];
        bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
        bArr2[i3 + 2] = bArr3[(i5 >>> 6) & 63];
        bArr2[i3 + 3] = bArr3[i5 & 63];
    }
}
