package com.hihonor.push.sdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.hihonor.push.sdk.b1 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3479b1 {

    /* JADX INFO: renamed from: d */
    public static final C3479b1 f11845d = new C3479b1();

    /* JADX INFO: renamed from: a */
    public volatile Executor f11846a;

    /* JADX INFO: renamed from: b */
    public volatile ExecutorService f11847b;

    /* JADX INFO: renamed from: c */
    public final Object f11848c = new Object();

    /* JADX INFO: renamed from: com.hihonor.push.sdk.b1$a */
    public static class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Executor m17499a() {
        C3479b1 c3479b1 = f11845d;
        if (c3479b1.f11846a == null) {
            synchronized (c3479b1.f11848c) {
                try {
                    if (c3479b1.f11846a == null) {
                        c3479b1.f11846a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c3479b1.f11846a;
    }

    /* JADX INFO: renamed from: c */
    public static ExecutorService m17501c() {
        return f11845d.m17502b();
    }

    /* JADX INFO: renamed from: b */
    public final ExecutorService m17502b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public static void m17500a(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            m17499a().execute(runnable);
        }
    }
}
