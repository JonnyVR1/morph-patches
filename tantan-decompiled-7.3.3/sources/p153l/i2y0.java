package p153l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes6.dex */
public final class i2y0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f112678a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f112679b;

    static {
        Charset.forName(CharEncoding.US_ASCII);
        f112678a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f112679b = bArr;
        ByteBuffer.wrap(bArr);
        nxx0.m165305d(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: renamed from: a */
    public static int m138249a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static int m138250b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: c */
    public static int m138251c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: d */
    public static int m138252d(byte[] bArr) {
        int length = bArr.length;
        int iM138249a = m138249a(length, bArr, 0, length);
        if (iM138249a == 0) {
            return 1;
        }
        return iM138249a;
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m138253e(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m138254f(T t, String str) {
        if (t != null) {
            return t;
        }
        mnd0.m159157a(str);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m138255g(m9y0 m9y0Var) {
        return false;
    }
}
