package p149l;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class x8i0 {

    /* JADX INFO: renamed from: b */
    public static volatile x8i0 f191523b = new x8i0();

    /* JADX INFO: renamed from: a */
    public ThreadPoolExecutor f191524a;

    /* JADX INFO: renamed from: l.x8i0$a */
    public static class ThreadFactoryC21043a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public static final AtomicInteger f191525a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "TTPoolThread-" + f191525a.getAndIncrement());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public x8i0() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(15, 15, 2L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC21043a());
        this.f191524a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m207417a(Runnable runnable) {
        f191523b.f191524a.execute(runnable);
    }
}
