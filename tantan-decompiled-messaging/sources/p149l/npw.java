package p149l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes7.dex */
public class npw {

    /* JADX INFO: renamed from: a */
    private static Handler f140008a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public static void m160542a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            runnable.run();
        } else {
            f140008a.post(runnable);
        }
    }
}
