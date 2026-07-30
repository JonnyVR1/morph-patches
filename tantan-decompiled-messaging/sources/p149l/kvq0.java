package p149l;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class kvq0 {

    /* JADX INFO: renamed from: a */
    private static String f124787a;

    /* JADX INFO: renamed from: b */
    private static long f124788b;

    /* JADX INFO: renamed from: a */
    public static synchronized String m147391a() {
        String str;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - f124788b) > 86400000) {
                f124788b = jCurrentTimeMillis;
                f124787a = Build.MODEL;
            }
            str = f124787a;
            if (str == null) {
                str = "";
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }
}
