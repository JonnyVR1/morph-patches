package p149l;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class ipi0 {

    /* JADX INFO: renamed from: a */
    private static ScheduledThreadPoolExecutor f114299a;

    /* JADX INFO: renamed from: b */
    private static final TimeUnit f114300b = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: l.ipi0$b */
    public static class ThreadFactoryC17599b implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f114301a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MMDNS-" + this.f114301a.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m137483a(Runnable runnable) {
        m137484b(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m137484b(Runnable runnable, long j, TimeUnit timeUnit) {
        m137485c();
        f114299a.schedule(runnable, j, timeUnit);
    }

    /* JADX INFO: renamed from: c */
    private static synchronized void m137485c() {
        if (f114299a == null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new ThreadFactoryC17599b(), new RejectedExecutionHandlerC17598a());
            f114299a = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setMaximumPoolSize(10);
            f114299a.setKeepAliveTime(30L, f114300b);
        }
    }

    /* JADX INFO: renamed from: l.ipi0$a */
    public class RejectedExecutionHandlerC17598a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }
}
