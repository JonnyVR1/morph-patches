package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes7.dex */
public class pv00 {

    /* JADX INFO: renamed from: a */
    private static Handler f151379a;

    /* JADX INFO: renamed from: a */
    private static Handler m171493a() {
        if (f151379a == null) {
            synchronized (pv00.class) {
                try {
                    if (f151379a == null) {
                        f151379a = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f151379a;
    }

    /* JADX INFO: renamed from: b */
    public static void m171494b(Runnable runnable) {
        if (runnable != null) {
            m171493a().post(runnable);
        } else {
            ig3.m135964a("runnable is null");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m171495c(Object obj, Runnable runnable, long j) {
        if (obj == null) {
            ig3.m135964a("tag is null");
            return;
        }
        if (runnable == null) {
            ig3.m135964a("runnable is null");
            return;
        }
        if (j <= 0) {
            ig3.m135964a("delayMill <= 0");
            return;
        }
        if ((obj instanceof Number) || (obj instanceof CharSequence)) {
            obj = obj.toString().intern();
        }
        Message messageObtain = Message.obtain(m171493a(), runnable);
        messageObtain.obj = obj;
        m171493a().sendMessageDelayed(messageObtain, j);
    }
}
