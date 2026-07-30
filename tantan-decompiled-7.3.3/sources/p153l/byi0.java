package p153l;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class byi0 {

    /* JADX INFO: renamed from: b */
    public static final byi0 f79025b = new byi0();

    /* JADX INFO: renamed from: a */
    public final ThreadPoolExecutor f79026a = new ThreadPoolExecutor(3, 3, 0, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC16134a());

    /* JADX INFO: renamed from: l.byi0$a */
    public static class ThreadFactoryC16134a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public static final AtomicInteger f79027a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Safety-PoolThread-" + f79027a.getAndIncrement());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            return thread;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m107021a(Runnable runnable) {
        f79025b.f79026a.execute(runnable);
    }
}
