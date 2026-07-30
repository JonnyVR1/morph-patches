package com.p003p1.mobile.android.p004rx.rxthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import l.bud0;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Deprecated
public class FastIoScheduler {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static ExecutorService f1328a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final bud0 f1329b;

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
        ExecutorService executorServiceM1072a = m1072a();
        f1328a = executorServiceM1072a;
        f1329b = Schedulers.from(executorServiceM1072a);
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorService m1072a() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 8000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new FastThreadFactory("FastIo-"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
