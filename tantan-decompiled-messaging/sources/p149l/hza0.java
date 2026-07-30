package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes13.dex */
public class hza0 {

    /* JADX INFO: renamed from: a */
    public static Handler f110188a;

    /* JADX INFO: renamed from: a */
    public static void m133664a(Object obj) {
        if (obj == null) {
            ig3.m135964a("tag is null");
            return;
        }
        if ((obj instanceof Number) || (obj instanceof CharSequence)) {
            obj = obj.toString().intern();
        }
        m133665b().removeCallbacksAndMessages(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Handler m133665b() {
        if (f110188a == null) {
            synchronized (hza0.class) {
                try {
                    if (f110188a == null) {
                        f110188a = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f110188a;
    }

    /* JADX INFO: renamed from: c */
    public static void m133666c(Object obj, Runnable runnable, long j) {
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
        Message messageObtain = Message.obtain(m133665b(), runnable);
        messageObtain.obj = obj;
        m133665b().sendMessageDelayed(messageObtain, j);
    }
}
