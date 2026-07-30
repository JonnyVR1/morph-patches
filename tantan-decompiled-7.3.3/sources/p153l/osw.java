package p153l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes7.dex */
public class osw {

    /* JADX INFO: renamed from: a */
    private static Handler f148909a;

    /* JADX INFO: renamed from: a */
    private static Handler m169063a() {
        if (f148909a == null) {
            synchronized (osw.class) {
                try {
                    if (f148909a == null) {
                        f148909a = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f148909a;
    }

    /* JADX INFO: renamed from: b */
    public static void m169064b(Runnable runnable) {
        if (runnable != null) {
            m169063a().post(runnable);
        } else {
            wg3.m206174a("runnable is null");
        }
    }
}
