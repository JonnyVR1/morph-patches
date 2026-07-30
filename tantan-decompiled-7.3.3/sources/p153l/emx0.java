package p153l;

import com.google.android.gms.internal.ads.zzhag;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class emx0 {
    /* JADX INFO: renamed from: d */
    public static final String m121386d(ByteBuffer byteBuffer, int i, int i2) throws zzhag {
        int i3;
        if ((((byteBuffer.limit() - i) - i2) | i | i2) < 0) {
            zg3.m219589a("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = byteBuffer.get(i);
            if (!dmx0.m117035d(b)) {
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
            if (dmx0.m117035d(b2)) {
                cArr[i6] = (char) b2;
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = byteBuffer.get(i);
                    if (!dmx0.m117035d(b3)) {
                        break;
                    }
                    i++;
                    cArr[i6] = (char) b3;
                    i6++;
                }
            } else {
                if (dmx0.m117037f(b2)) {
                    if (i7 >= i4) {
                        throw zzhag.zzd();
                    }
                    i3 = i6 + 1;
                    i += 2;
                    dmx0.m117034c(b2, byteBuffer.get(i7), cArr, i6);
                } else if (dmx0.m117036e(b2)) {
                    if (i7 >= i4 - 1) {
                        throw zzhag.zzd();
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    dmx0.m117033b(b2, byteBuffer.get(i7), byteBuffer.get(i8), cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw zzhag.zzd();
                    }
                    byte b4 = byteBuffer.get(i7);
                    int i9 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    dmx0.m117032a(b2, b4, b5, byteBuffer.get(i9), cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo121387a(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: b */
    public abstract String mo121388b(byte[] bArr, int i, int i2) throws zzhag;

    /* JADX INFO: renamed from: c */
    public final boolean m121389c(byte[] bArr, int i, int i2) {
        return mo121387a(0, bArr, i, i2) == 0;
    }
}
