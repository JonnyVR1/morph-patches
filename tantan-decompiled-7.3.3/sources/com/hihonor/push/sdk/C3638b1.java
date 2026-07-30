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
public final class C3638b1 {

    /* JADX INFO: renamed from: d */
    public static final C3638b1 f12586d = new C3638b1();

    /* JADX INFO: renamed from: a */
    public volatile Executor f12587a;

    /* JADX INFO: renamed from: b */
    public volatile ExecutorService f12588b;

    /* JADX INFO: renamed from: c */
    public final Object f12589c = new Object();

    /* JADX INFO: renamed from: com.hihonor.push.sdk.b1$a */
    public static class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Executor m18576a() {
        C3638b1 c3638b1 = f12586d;
        if (c3638b1.f12587a == null) {
            synchronized (c3638b1.f12589c) {
                try {
                    if (c3638b1.f12587a == null) {
                        c3638b1.f12587a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c3638b1.f12587a;
    }

    /* JADX INFO: renamed from: c */
    public static ExecutorService m18578c() {
        return f12586d.m18579b();
    }

    /* JADX INFO: renamed from: b */
    public final ExecutorService m18579b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public static void m18577a(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            m18576a().execute(runnable);
        }
    }
}
