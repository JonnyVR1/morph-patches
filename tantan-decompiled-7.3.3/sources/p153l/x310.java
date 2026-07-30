package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes7.dex */
public class x310 {

    /* JADX INFO: renamed from: a */
    private static Handler f192215a;

    /* JADX INFO: renamed from: a */
    public static void m209183a(Object obj) {
        if (obj == null) {
            wg3.m206174a("tag is null");
            return;
        }
        if ((obj instanceof Number) || (obj instanceof CharSequence)) {
            obj = obj.toString().intern();
        }
        m209184b().removeCallbacksAndMessages(obj);
    }

    /* JADX INFO: renamed from: b */
    private static Handler m209184b() {
        if (f192215a == null) {
            synchronized (x310.class) {
                try {
                    if (f192215a == null) {
                        f192215a = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f192215a;
    }

    /* JADX INFO: renamed from: c */
    public static void m209185c(Object obj, Runnable runnable) {
        if ((obj instanceof Number) || (obj instanceof CharSequence)) {
            obj = obj.toString().intern();
        }
        Message messageObtain = Message.obtain(m209184b(), runnable);
        messageObtain.obj = obj;
        m209184b().sendMessage(messageObtain);
    }

    /* JADX INFO: renamed from: d */
    public static void m209186d(Runnable runnable) {
        if (runnable != null) {
            m209184b().post(runnable);
        } else {
            wg3.m206174a("runnable is null");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m209187e(Object obj, Runnable runnable, long j) {
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
        Message messageObtain = Message.obtain(m209184b(), runnable);
        messageObtain.obj = obj;
        m209184b().sendMessageDelayed(messageObtain, j);
    }
}
