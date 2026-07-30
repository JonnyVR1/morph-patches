package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class ksq0 {

    /* JADX INFO: renamed from: a */
    static final char[] f128599a = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: a */
    public static String m151279a(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2 * 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i + i3];
            char[] cArr = f128599a;
            sb.append(cArr[(b & 255) >> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m151280b(Context context) {
        return jsq0.f122525a;
    }
}
