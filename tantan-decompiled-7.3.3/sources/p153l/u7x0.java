package p153l;

import com.google.android.gms.internal.ads.zzgpl;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public final class u7x0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f177953a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static final wfx0 m194894a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new zzgpl("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        return wfx0.m206170b(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m194895b(byte[] bArr, byte[] bArr2) {
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
