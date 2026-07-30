package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: renamed from: com.tencent.liteav.basic.util.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14053g {

    /* JADX INFO: renamed from: a */
    private Handler f58517a;

    /* JADX INFO: renamed from: b */
    private Looper f58518b;

    /* JADX INFO: renamed from: c */
    private boolean f58519c;

    /* JADX INFO: renamed from: d */
    private Thread f58520d;

    public C14053g(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.f58519c = true;
        handlerThread.start();
        this.f58518b = handlerThread.getLooper();
        this.f58517a = new Handler(this.f58518b);
        this.f58520d = handlerThread;
    }

    /* JADX INFO: renamed from: a */
    public void m83061a(final Runnable runnable) {
        final boolean[] zArr = new boolean[1];
        if (Thread.currentThread().equals(this.f58520d)) {
            runnable.run();
            return;
        }
        synchronized (this.f58517a) {
            zArr[0] = false;
            this.f58517a.post(new Runnable() { // from class: com.tencent.liteav.basic.util.g.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                    zArr[0] = true;
                    synchronized (C14053g.this.f58517a) {
                        C14053g.this.f58517a.notifyAll();
                    }
                }
            });
            while (!zArr[0]) {
                try {
                    this.f58517a.wait();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83063b(Runnable runnable) {
        this.f58517a.post(runnable);
    }

    public void finalize() throws Throwable {
        if (this.f58519c) {
            this.f58517a.getLooper().quit();
        }
        super.finalize();
    }

    /* JADX INFO: renamed from: a */
    public Handler m83060a() {
        return this.f58517a;
    }

    /* JADX INFO: renamed from: a */
    public void m83062a(Runnable runnable, long j) {
        this.f58517a.postDelayed(runnable, j);
    }
}
