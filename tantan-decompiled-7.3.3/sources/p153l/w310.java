package p153l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes7.dex */
public class w310 {

    /* JADX INFO: renamed from: a */
    private static Handler f187052a;

    /* JADX INFO: renamed from: a */
    private static Handler m204674a() {
        if (f187052a == null) {
            synchronized (w310.class) {
                try {
                    if (f187052a == null) {
                        f187052a = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f187052a;
    }

    /* JADX INFO: renamed from: b */
    public static void m204675b(Runnable runnable) {
        if (runnable != null) {
            m204674a().post(runnable);
        } else {
            wg3.m206174a("runnable is null");
        }
    }
}
