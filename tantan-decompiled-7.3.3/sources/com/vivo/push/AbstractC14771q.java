package com.vivo.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.C14795p;

/* JADX INFO: renamed from: com.vivo.push.q */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14771q {

    /* JADX INFO: renamed from: a */
    protected Context f61919a;

    /* JADX INFO: renamed from: b */
    protected Handler f61920b;

    /* JADX INFO: renamed from: c */
    private final Object f61921c = new Object();

    /* JADX INFO: renamed from: com.vivo.push.q$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            AbstractC14771q.this.mo86110b(message);
        }
    }

    public AbstractC14771q() {
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 1);
        handlerThread.start();
        this.f61920b = new a(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public final void m86109a(Message message) {
        synchronized (this.f61921c) {
            try {
                Handler handler = this.f61920b;
                if (handler == null) {
                    String str = "Dead worker dropping a message: " + message.what;
                    C14795p.m86193e(getClass().getSimpleName(), str + " (Thread " + Thread.currentThread().getId() + ")");
                } else {
                    handler.sendMessage(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo86110b(Message message);

    /* JADX INFO: renamed from: a */
    public final void m86108a(Context context) {
        this.f61919a = context;
    }
}
