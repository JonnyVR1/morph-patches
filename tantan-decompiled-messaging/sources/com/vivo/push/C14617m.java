package com.vivo.push;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.C14647p;

/* JADX INFO: renamed from: com.vivo.push.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C14617m {

    /* JADX INFO: renamed from: a */
    private static final Handler f61055a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    private static final HandlerThread f61056b;

    /* JADX INFO: renamed from: c */
    private static final Handler f61057c;

    static {
        HandlerThread handlerThread = new HandlerThread("push_client_thread");
        f61056b = handlerThread;
        handlerThread.start();
        f61057c = new HandlerC14620n(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public static void m84913a(AbstractRunnableC14616l abstractRunnableC14616l) {
        if (abstractRunnableC14616l == null) {
            C14647p.m85008a("PushClientThread", "client thread error, task is null!");
            return;
        }
        int iM84912a = abstractRunnableC14616l.m84912a();
        Message message = new Message();
        message.what = iM84912a;
        message.obj = abstractRunnableC14616l;
        f61057c.sendMessageDelayed(message, 0L);
    }

    /* JADX INFO: renamed from: b */
    public static void m84915b(Runnable runnable) {
        f61055a.post(runnable);
    }

    /* JADX INFO: renamed from: c */
    public static void m84916c(Runnable runnable) {
        Handler handler = f61057c;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m84914a(Runnable runnable) {
        Handler handler = f61057c;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 15000L);
    }
}
