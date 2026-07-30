package p149l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes7.dex */
public class ppw {

    /* JADX INFO: renamed from: a */
    private static Handler f150725a;

    /* JADX INFO: renamed from: a */
    private static Handler m170870a() {
        if (f150725a == null) {
            synchronized (ppw.class) {
                try {
                    if (f150725a == null) {
                        f150725a = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f150725a;
    }

    /* JADX INFO: renamed from: b */
    public static void m170871b(Runnable runnable) {
        if (runnable != null) {
            m170870a().post(runnable);
        } else {
            ig3.m135964a("runnable is null");
        }
    }
}
