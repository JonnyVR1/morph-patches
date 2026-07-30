package com.tencent.open.utils;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.open.utils.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C14558m {

    /* JADX INFO: renamed from: c */
    private static Handler f61196c;

    /* JADX INFO: renamed from: d */
    private static HandlerThread f61197d;

    /* JADX INFO: renamed from: b */
    private static Object f61195b = new Object();

    /* JADX INFO: renamed from: a */
    public static final Executor f61194a = m85640c();

    /* JADX INFO: renamed from: com.tencent.open.utils.m$a */
    public static class a implements Executor {

        /* JADX INFO: renamed from: a */
        final Queue<Runnable> f61198a;

        /* JADX INFO: renamed from: b */
        Runnable f61199b;

        private a() {
            this.f61198a = new LinkedList();
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m85641a() {
            Runnable runnablePoll = this.f61198a.poll();
            this.f61199b = runnablePoll;
            if (runnablePoll != null) {
                C14558m.f61194a.execute(runnablePoll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.f61198a.offer(new Runnable() { // from class: com.tencent.open.utils.m.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        a.this.m85641a();
                    }
                }
            });
            if (this.f61199b == null) {
                m85641a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Handler m85636a() {
        if (f61196c == null) {
            synchronized (C14558m.class) {
                HandlerThread handlerThread = new HandlerThread("SDK_SUB");
                f61197d = handlerThread;
                handlerThread.start();
                f61196c = new Handler(f61197d.getLooper());
            }
        }
        return f61196c;
    }

    /* JADX INFO: renamed from: b */
    public static void m85639b(Runnable runnable) {
        m85636a().post(runnable);
    }

    /* JADX INFO: renamed from: c */
    private static Executor m85640c() {
        return new ThreadPoolExecutor(0, 3, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* JADX INFO: renamed from: b */
    public static Executor m85638b() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public static void m85637a(Runnable runnable) {
        try {
            f61194a.execute(runnable);
        } catch (RejectedExecutionException unused) {
        }
    }
}
