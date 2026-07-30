package p149l;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class p21 {

    /* JADX INFO: renamed from: c */
    public static p21 f146792c;

    /* JADX INFO: renamed from: b */
    public final int f146794b = 10;

    /* JADX INFO: renamed from: a */
    public ExecutorService f146793a = new ThreadPoolExecutor(1, 3, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC19109a(), new ThreadPoolExecutor.DiscardOldestPolicy());

    /* JADX INFO: renamed from: l.p21$a */
    public class ThreadFactoryC19109a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f146795a = new AtomicInteger(1);

        public ThreadFactoryC19109a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable, "probe-thread #" + this.f146795a.getAndIncrement());
            thread.setPriority(10);
            return thread;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m167123a(Runnable runnable) {
        m167124c().m167125b(runnable);
    }

    /* JADX INFO: renamed from: c */
    public static p21 m167124c() {
        if (f146792c == null) {
            synchronized (p21.class) {
                try {
                    if (f146792c == null) {
                        f146792c = new p21();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f146792c;
    }

    /* JADX INFO: renamed from: b */
    public final void m167125b(Runnable runnable) {
        this.f146793a.execute(runnable);
    }
}
