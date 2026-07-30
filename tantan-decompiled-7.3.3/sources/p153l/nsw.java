package p153l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes7.dex */
public class nsw {

    /* JADX INFO: renamed from: a */
    private static Handler f143547a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public static void m164645a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            runnable.run();
        } else {
            f143547a.post(runnable);
        }
    }
}
