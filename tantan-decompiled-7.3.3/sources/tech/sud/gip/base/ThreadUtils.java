package tech.sud.gip.base;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class ThreadUtils {
    private static final Handler sHandler = new Handler(Looper.getMainLooper());

    public static boolean checkUIThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static Handler getUIHandler() {
        return sHandler;
    }

    public static void postDelayedUITask(Runnable runnable, long j) {
        sHandler.postDelayed(runnable, j);
    }

    public static void postTask(Looper looper, Runnable runnable) {
        if (Looper.myLooper() == looper) {
            runnable.run();
            return;
        }
        try {
            new Handler(looper).post(runnable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void postUITask(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            sHandler.post(runnable);
        } else {
            runnable.run();
        }
    }
}
