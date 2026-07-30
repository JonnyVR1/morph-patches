package p149l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes6.dex */
public final class aax0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f68607a = Charset.forName(CharEncoding.US_ASCII);

    /* JADX INFO: renamed from: b */
    public static final Charset f68608b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    public static final Charset f68609c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d */
    public static final byte[] f68610d;

    /* JADX INFO: renamed from: e */
    public static final ByteBuffer f68611e;

    /* JADX INFO: renamed from: f */
    public static final q7x0 f68612f;

    static {
        byte[] bArr = new byte[0];
        f68610d = bArr;
        f68611e = ByteBuffer.wrap(bArr);
        f68612f = q7x0.m173315h(bArr, 0, 0, false);
    }

    /* JADX INFO: renamed from: a */
    public static int m95573a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: b */
    public static int m95574b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static Object m95575c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        jfd0.m141176a("messageType");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m95576d(byte[] bArr) {
        return new String(bArr, f68608b);
    }
}
