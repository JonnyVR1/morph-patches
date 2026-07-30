package p149l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes6.dex */
public final class ctx0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f82511a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f82512b;

    static {
        Charset.forName(CharEncoding.US_ASCII);
        f82511a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f82512b = bArr;
        ByteBuffer.wrap(bArr);
        hox0.m132291d(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: renamed from: a */
    public static int m108703a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static int m108704b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: c */
    public static int m108705c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: d */
    public static int m108706d(byte[] bArr) {
        int length = bArr.length;
        int iM108703a = m108703a(length, bArr, 0, length);
        if (iM108703a == 0) {
            return 1;
        }
        return iM108703a;
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m108707e(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m108708f(T t, String str) {
        if (t != null) {
            return t;
        }
        jfd0.m141176a(str);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m108709g(g0y0 g0y0Var) {
        return false;
    }
}
