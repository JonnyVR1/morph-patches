package p153l;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class q4r0 {

    /* JADX INFO: renamed from: a */
    private static String f155613a;

    /* JADX INFO: renamed from: b */
    private static long f155614b;

    /* JADX INFO: renamed from: a */
    public static synchronized String m175256a() {
        String str;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - f155614b) > 86400000) {
                f155614b = jCurrentTimeMillis;
                f155613a = Build.MODEL;
            }
            str = f155613a;
            if (str == null) {
                str = "";
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }
}
