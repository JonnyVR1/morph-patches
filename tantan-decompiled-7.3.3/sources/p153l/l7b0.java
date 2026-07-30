package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes12.dex */
public class l7b0 {

    /* JADX INFO: renamed from: a */
    public static Handler f130335a;

    /* JADX INFO: renamed from: a */
    public static void m153114a(Object obj) {
        if (obj == null) {
            wg3.m206174a("tag is null");
            return;
        }
        if ((obj instanceof Number) || (obj instanceof CharSequence)) {
            obj = obj.toString().intern();
        }
        m153115b().removeCallbacksAndMessages(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Handler m153115b() {
        if (f130335a == null) {
            synchronized (l7b0.class) {
                try {
                    if (f130335a == null) {
                        f130335a = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f130335a;
    }

    /* JADX INFO: renamed from: c */
    public static void m153116c(Object obj, Runnable runnable, long j) {
        if (obj == null) {
            wg3.m206174a("tag is null");
            return;
        }
        if (runnable == null) {
            wg3.m206174a("runnable is null");
            return;
        }
        if (j <= 0) {
            wg3.m206174a("delayMill <= 0");
            return;
        }
        if ((obj instanceof Number) || (obj instanceof CharSequence)) {
            obj = obj.toString().intern();
        }
        Message messageObtain = Message.obtain(m153115b(), runnable);
        messageObtain.obj = obj;
        m153115b().sendMessageDelayed(messageObtain, j);
    }
}
