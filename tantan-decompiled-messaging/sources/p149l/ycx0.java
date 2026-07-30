package p149l;

import com.google.android.gms.internal.ads.zzhag;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ycx0 {
    /* JADX INFO: renamed from: d */
    public static final String m214209d(ByteBuffer byteBuffer, int i, int i2) throws zzhag {
        int i3;
        if ((((byteBuffer.limit() - i) - i2) | i | i2) < 0) {
            lg3.m149750a("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = byteBuffer.get(i);
            if (!xcx0.m208169d(b)) {
                break;
            }
            i++;
            cArr[i5] = (char) b;
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (xcx0.m208169d(b2)) {
                cArr[i6] = (char) b2;
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = byteBuffer.get(i);
                    if (!xcx0.m208169d(b3)) {
                        break;
                    }
                    i++;
                    cArr[i6] = (char) b3;
                    i6++;
                }
            } else {
                if (xcx0.m208171f(b2)) {
                    if (i7 >= i4) {
                        throw zzhag.zzd();
                    }
                    i3 = i6 + 1;
                    i += 2;
                    xcx0.m208168c(b2, byteBuffer.get(i7), cArr, i6);
                } else if (xcx0.m208170e(b2)) {
                    if (i7 >= i4 - 1) {
                        throw zzhag.zzd();
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    xcx0.m208167b(b2, byteBuffer.get(i7), byteBuffer.get(i8), cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw zzhag.zzd();
                    }
                    byte b4 = byteBuffer.get(i7);
                    int i9 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    xcx0.m208166a(b2, b4, b5, byteBuffer.get(i9), cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo214210a(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: b */
    public abstract String mo214211b(byte[] bArr, int i, int i2) throws zzhag;

    /* JADX INFO: renamed from: c */
    public final boolean m214212c(byte[] bArr, int i, int i2) {
        return mo214210a(0, bArr, i, i2) == 0;
    }
}
