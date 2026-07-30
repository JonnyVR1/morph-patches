package p153l;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class w21 {

    /* JADX INFO: renamed from: c */
    public static w21 f186859c;

    /* JADX INFO: renamed from: b */
    public final int f186861b = 10;

    /* JADX INFO: renamed from: a */
    public ExecutorService f186860a = new ThreadPoolExecutor(1, 3, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC20997a(), new ThreadPoolExecutor.DiscardOldestPolicy());

    /* JADX INFO: renamed from: l.w21$a */
    public class ThreadFactoryC20997a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f186862a = new AtomicInteger(1);

        public ThreadFactoryC20997a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable, "probe-thread #" + this.f186862a.getAndIncrement());
            thread.setPriority(10);
            return thread;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m204498a(Runnable runnable) {
        m204499c().m204500b(runnable);
    }

    /* JADX INFO: renamed from: c */
    public static w21 m204499c() {
        if (f186859c == null) {
            synchronized (w21.class) {
                try {
                    if (f186859c == null) {
                        f186859c = new w21();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f186859c;
    }

    /* JADX INFO: renamed from: b */
    public final void m204500b(Runnable runnable) {
        this.f186860a.execute(runnable);
    }
}
