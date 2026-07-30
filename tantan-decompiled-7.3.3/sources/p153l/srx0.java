package p153l;

import com.google.android.gms.internal.play_billing.zzhr;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes6.dex */
public final class srx0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f170385a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f170386b;

    static {
        Charset.forName(CharEncoding.US_ASCII);
        f170385a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f170386b = bArr;
        ByteBuffer.wrap(bArr);
        int i = z4x0.f202989a;
        try {
            new n2x0(bArr, 0, 0, false, null).m161258c(0);
        } catch (zzhr e) {
            tg3.m191013a(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m187640a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: b */
    public static int m187641b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static Object m187642c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        mnd0.m159157a("messageType");
        return null;
    }
}
