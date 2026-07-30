package p153l;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class xhi0 {

    /* JADX INFO: renamed from: b */
    public static volatile xhi0 f194367b = new xhi0();

    /* JADX INFO: renamed from: a */
    public ThreadPoolExecutor f194368a;

    /* JADX INFO: renamed from: l.xhi0$a */
    public static class ThreadFactoryC21333a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public static final AtomicInteger f194369a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "TTPoolThread-" + f194369a.getAndIncrement());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public xhi0() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(15, 15, 2L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC21333a());
        this.f194368a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m211045a(Runnable runnable) {
        f194367b.f194368a.execute(runnable);
    }
}
