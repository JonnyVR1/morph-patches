package p153l;

import com.jiechic.library.android.snappy.SnappyNative;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class tsf0 {

    /* JADX INFO: renamed from: a */
    private static SnappyNative f175991a;

    static {
        try {
            f175991a = vsf0.m202611b();
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m192603a(byte[] bArr, int i, int i2, Object obj, int i3) throws IOException {
        if (bArr != null && obj != null) {
            return f175991a.rawUncompress(bArr, i, i2, obj, i3);
        }
        mnd0.m159157a("input or output is null");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m192604b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        return m192603a(bArr, i, i2, bArr2, i3);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m192605c(byte[] bArr) throws IOException {
        byte[] bArr2 = new byte[m192606d(bArr)];
        m192604b(bArr, 0, bArr.length, bArr2, 0);
        return bArr2;
    }

    /* JADX INFO: renamed from: d */
    public static int m192606d(byte[] bArr) throws IOException {
        return f175991a.uncompressedLength(bArr, 0, bArr.length);
    }
}
