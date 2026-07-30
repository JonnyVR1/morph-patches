package com.p046p1.mobile.android.p047rx.rxthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.schedulers.Schedulers;
import p149l.bud0;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class FastIoScheduler {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static ExecutorService f15629a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final bud0 f15630b;

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
        ExecutorService executorServiceM20801a = m20801a();
        f15629a = executorServiceM20801a;
        f15630b = Schedulers.from(executorServiceM20801a);
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorService m20801a() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 8000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new FastThreadFactory("FastIo-"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
