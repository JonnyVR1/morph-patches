package com.p051p1.mobile.android.p052rx.rxthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.schedulers.Schedulers;
import p153l.f2e0;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class FastIoScheduler {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static ExecutorService f16348a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final f2e0 f16349b;

    public static final class FastThreadFactory extends AtomicLong implements ThreadFactory {
        private static final long serialVersionUID = -8841098858898482335L;
        final String prefix;

        public FastThreadFactory(String str) {
            this.prefix = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.prefix + incrementAndGet());
            thread.setPriority(10);
            thread.setDaemon(true);
            return thread;
        }
    }

    static {
        ExecutorService executorServiceM21800a = m21800a();
        f16348a = executorServiceM21800a;
        f16349b = Schedulers.from(executorServiceM21800a);
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorService m21800a() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 8000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new FastThreadFactory("FastIo-"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
