package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: renamed from: com.tencent.liteav.basic.util.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14216g {

    /* JADX INFO: renamed from: a */
    private Handler f59365a;

    /* JADX INFO: renamed from: b */
    private Looper f59366b;

    /* JADX INFO: renamed from: c */
    private boolean f59367c;

    /* JADX INFO: renamed from: d */
    private Thread f59368d;

    public C14216g(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.f59367c = true;
        handlerThread.start();
        this.f59366b = handlerThread.getLooper();
        this.f59365a = new Handler(this.f59366b);
        this.f59368d = handlerThread;
    }

    /* JADX INFO: renamed from: a */
    public void m84244a(final Runnable runnable) {
        final boolean[] zArr = new boolean[1];
        if (Thread.currentThread().equals(this.f59368d)) {
            runnable.run();
            return;
        }
        synchronized (this.f59365a) {
            zArr[0] = false;
            this.f59365a.post(new Runnable() { // from class: com.tencent.liteav.basic.util.g.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                    zArr[0] = true;
                    synchronized (C14216g.this.f59365a) {
                        C14216g.this.f59365a.notifyAll();
                    }
                }
            });
            while (!zArr[0]) {
                try {
                    this.f59365a.wait();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m84246b(Runnable runnable) {
        this.f59365a.post(runnable);
    }

    public void finalize() throws Throwable {
        if (this.f59367c) {
            this.f59365a.getLooper().quit();
        }
        super.finalize();
    }

    /* JADX INFO: renamed from: a */
    public Handler m84243a() {
        return this.f59365a;
    }

    /* JADX INFO: renamed from: a */
    public void m84245a(Runnable runnable, long j) {
        this.f59365a.postDelayed(runnable, j);
    }
}
