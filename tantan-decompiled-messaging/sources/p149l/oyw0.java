package p149l;

import com.google.android.gms.internal.ads.zzgpl;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public final class oyw0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f146369a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static final q6x0 m166725a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new zzgpl("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        return q6x0.m173179b(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m166726b(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
