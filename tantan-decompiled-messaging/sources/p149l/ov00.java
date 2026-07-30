package p149l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes7.dex */
public class ov00 {

    /* JADX INFO: renamed from: a */
    private static Handler f145756a;

    /* JADX INFO: renamed from: a */
    private static Handler m166149a() {
        if (f145756a == null) {
            synchronized (ov00.class) {
                try {
                    if (f145756a == null) {
                        f145756a = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f145756a;
    }

    /* JADX INFO: renamed from: b */
    public static void m166150b(Runnable runnable) {
        if (runnable != null) {
            m166149a().post(runnable);
        } else {
            ig3.m135964a("runnable is null");
        }
    }
}
