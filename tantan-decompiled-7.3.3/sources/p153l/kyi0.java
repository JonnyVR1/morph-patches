package p153l;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class kyi0 {

    /* JADX INFO: renamed from: a */
    private static ScheduledThreadPoolExecutor f129317a;

    /* JADX INFO: renamed from: b */
    private static final TimeUnit f129318b = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: l.kyi0$b */
    public static class ThreadFactoryC18304b implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f129319a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MMDNS-" + this.f129319a.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m151974a(Runnable runnable) {
        m151975b(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m151975b(Runnable runnable, long j, TimeUnit timeUnit) {
        m151976c();
        f129317a.schedule(runnable, j, timeUnit);
    }

    /* JADX INFO: renamed from: c */
    private static synchronized void m151976c() {
        if (f129317a == null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new ThreadFactoryC18304b(), new RejectedExecutionHandlerC18303a());
            f129317a = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setMaximumPoolSize(10);
            f129317a.setKeepAliveTime(30L, f129318b);
        }
    }

    /* JADX INFO: renamed from: l.kyi0$a */
    public class RejectedExecutionHandlerC18303a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }
}
