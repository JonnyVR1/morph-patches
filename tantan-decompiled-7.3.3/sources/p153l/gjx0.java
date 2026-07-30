package p153l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes6.dex */
public final class gjx0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f104688a = Charset.forName(CharEncoding.US_ASCII);

    /* JADX INFO: renamed from: b */
    public static final Charset f104689b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    public static final Charset f104690c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d */
    public static final byte[] f104691d;

    /* JADX INFO: renamed from: e */
    public static final ByteBuffer f104692e;

    /* JADX INFO: renamed from: f */
    public static final wgx0 f104693f;

    static {
        byte[] bArr = new byte[0];
        f104691d = bArr;
        f104692e = ByteBuffer.wrap(bArr);
        f104693f = wgx0.m206329h(bArr, 0, 0, false);
    }

    /* JADX INFO: renamed from: a */
    public static int m130562a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: b */
    public static int m130563b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static Object m130564c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        mnd0.m159157a("messageType");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m130565d(byte[] bArr) {
        return new String(bArr, f104689b);
    }
}
