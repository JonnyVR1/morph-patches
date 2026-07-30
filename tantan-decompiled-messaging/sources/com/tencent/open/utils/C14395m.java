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
public final class C14395m {

    /* JADX INFO: renamed from: c */
    private static Handler f60348c;

    /* JADX INFO: renamed from: d */
    private static HandlerThread f60349d;

    /* JADX INFO: renamed from: b */
    private static Object f60347b = new Object();

    /* JADX INFO: renamed from: a */
    public static final Executor f60346a = m84457c();

    /* JADX INFO: renamed from: com.tencent.open.utils.m$a */
    public static class a implements Executor {

        /* JADX INFO: renamed from: a */
        final Queue<Runnable> f60350a;

        /* JADX INFO: renamed from: b */
        Runnable f60351b;

        private a() {
            this.f60350a = new LinkedList();
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m84458a() {
            Runnable runnablePoll = this.f60350a.poll();
            this.f60351b = runnablePoll;
            if (runnablePoll != null) {
                C14395m.f60346a.execute(runnablePoll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.f60350a.offer(new Runnable() { // from class: com.tencent.open.utils.m.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        a.this.m84458a();
                    }
                }
            });
            if (this.f60351b == null) {
                m84458a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Handler m84453a() {
        if (f60348c == null) {
            synchronized (C14395m.class) {
                HandlerThread handlerThread = new HandlerThread("SDK_SUB");
                f60349d = handlerThread;
                handlerThread.start();
                f60348c = new Handler(f60349d.getLooper());
            }
        }
        return f60348c;
    }

    /* JADX INFO: renamed from: b */
    public static void m84456b(Runnable runnable) {
        m84453a().post(runnable);
    }

    /* JADX INFO: renamed from: c */
    private static Executor m84457c() {
        return new ThreadPoolExecutor(0, 3, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* JADX INFO: renamed from: b */
    public static Executor m84455b() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public static void m84454a(Runnable runnable) {
        try {
            f60346a.execute(runnable);
        } catch (RejectedExecutionException unused) {
        }
    }
}
