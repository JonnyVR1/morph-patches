package p149l;

import com.jiechic.library.android.snappy.SnappyNative;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class kkf0 {

    /* JADX INFO: renamed from: a */
    private static SnappyNative f123549a;

    static {
        try {
            f123549a = mkf0.m155006b();
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m146319a(byte[] bArr, int i, int i2, Object obj, int i3) throws IOException {
        if (bArr != null && obj != null) {
            return f123549a.rawUncompress(bArr, i, i2, obj, i3);
        }
        jfd0.m141176a("input or output is null");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m146320b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        return m146319a(bArr, i, i2, bArr2, i3);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m146321c(byte[] bArr) throws IOException {
        byte[] bArr2 = new byte[m146322d(bArr)];
        m146320b(bArr, 0, bArr.length, bArr2, 0);
        return bArr2;
    }

    /* JADX INFO: renamed from: d */
    public static int m146322d(byte[] bArr) throws IOException {
        return f123549a.uncompressedLength(bArr, 0, bArr.length);
    }
}
