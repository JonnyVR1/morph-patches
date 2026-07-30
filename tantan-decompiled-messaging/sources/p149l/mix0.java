package p149l;

import com.google.android.gms.internal.play_billing.zzhr;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes6.dex */
public final class mix0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f134047a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f134048b;

    static {
        Charset.forName(CharEncoding.US_ASCII);
        f134047a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f134048b = bArr;
        ByteBuffer.wrap(bArr);
        int i = tvw0.f172348a;
        try {
            new htw0(bArr, 0, 0, false, null).m132942c(0);
        } catch (zzhr e) {
            fg3.m121203a(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m154765a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: b */
    public static int m154766b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static Object m154767c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        jfd0.m141176a("messageType");
        return null;
    }
}
