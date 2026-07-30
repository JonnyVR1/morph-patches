package p149l;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class zoi0 {

    /* JADX INFO: renamed from: b */
    public static final zoi0 f204121b = new zoi0();

    /* JADX INFO: renamed from: a */
    public final ThreadPoolExecutor f204122a = new ThreadPoolExecutor(3, 3, 0, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC21743a());

    /* JADX INFO: renamed from: l.zoi0$a */
    public static class ThreadFactoryC21743a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public static final AtomicInteger f204123a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Safety-PoolThread-" + f204123a.getAndIncrement());
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
    public static void m219564a(Runnable runnable) {
        f204121b.f204122a.execute(runnable);
    }
}
