package p149l;

import com.jiechic.library.android.snappy.SnappyNative;

/* JADX INFO: loaded from: classes7.dex */
public class mkf0 {

    /* JADX INFO: renamed from: a */
    private static boolean f134325a = false;

    /* JADX INFO: renamed from: b */
    private static volatile SnappyNative f134326b;

    /* JADX INFO: renamed from: a */
    private static synchronized void m155005a() {
        if (!f134325a) {
            System.loadLibrary("snappy-android");
            f134325a = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized SnappyNative m155006b() {
        if (f134326b != null) {
            return f134326b;
        }
        m155005a();
        m155007c(new SnappyNative());
        return f134326b;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m155007c(SnappyNative snappyNative) {
        f134326b = snappyNative;
    }
}
