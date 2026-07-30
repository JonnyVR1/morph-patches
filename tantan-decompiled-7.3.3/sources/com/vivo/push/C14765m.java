package com.vivo.push;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.C14795p;

/* JADX INFO: renamed from: com.vivo.push.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C14765m {

    /* JADX INFO: renamed from: a */
    private static final Handler f61902a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    private static final HandlerThread f61903b;

    /* JADX INFO: renamed from: c */
    private static final Handler f61904c;

    static {
        HandlerThread handlerThread = new HandlerThread("push_client_thread");
        f61903b = handlerThread;
        handlerThread.start();
        f61904c = new HandlerC14768n(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public static void m86084a(AbstractRunnableC14764l abstractRunnableC14764l) {
        if (abstractRunnableC14764l == null) {
            C14795p.m86179a("PushClientThread", "client thread error, task is null!");
            return;
        }
        int iM86083a = abstractRunnableC14764l.m86083a();
        Message message = new Message();
        message.what = iM86083a;
        message.obj = abstractRunnableC14764l;
        f61904c.sendMessageDelayed(message, 0L);
    }

    /* JADX INFO: renamed from: b */
    public static void m86086b(Runnable runnable) {
        f61902a.post(runnable);
    }

    /* JADX INFO: renamed from: c */
    public static void m86087c(Runnable runnable) {
        Handler handler = f61904c;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86085a(Runnable runnable) {
        Handler handler = f61904c;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 15000L);
    }
}
