package p153l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes7.dex */
public class msw {

    /* JADX INFO: renamed from: a */
    private static Handler f138528a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public static void m159941a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            runnable.run();
        } else {
            f138528a.post(runnable);
        }
    }
}
