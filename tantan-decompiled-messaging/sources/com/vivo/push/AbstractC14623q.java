package com.vivo.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.C14647p;

/* JADX INFO: renamed from: com.vivo.push.q */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14623q {

    /* JADX INFO: renamed from: a */
    protected Context f61072a;

    /* JADX INFO: renamed from: b */
    protected Handler f61073b;

    /* JADX INFO: renamed from: c */
    private final Object f61074c = new Object();

    /* JADX INFO: renamed from: com.vivo.push.q$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            AbstractC14623q.this.mo84939b(message);
        }
    }

    public AbstractC14623q() {
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 1);
        handlerThread.start();
        this.f61073b = new a(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public final void m84938a(Message message) {
        synchronized (this.f61074c) {
            try {
                Handler handler = this.f61073b;
                if (handler == null) {
                    String str = "Dead worker dropping a message: " + message.what;
                    C14647p.m85022e(getClass().getSimpleName(), str + " (Thread " + Thread.currentThread().getId() + ")");
                } else {
                    handler.sendMessage(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo84939b(Message message);

    /* JADX INFO: renamed from: a */
    public final void m84937a(Context context) {
        this.f61072a = context;
    }
}
