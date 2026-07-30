package p149l;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class bet0 implements Executor {

    /* JADX INFO: renamed from: b */
    public final ThreadPoolExecutor f75239b;

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f75238a = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    public WeakReference f75240c = new WeakReference(null);

    public bet0(String str) {
        final String str2 = "Google consent worker";
        ThreadFactory threadFactory = new ThreadFactory(str2) { // from class: l.tct0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f169476b = "Google consent worker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return this.f169475a.m101419b(this.f169476b, runnable);
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        this.f75239b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Thread m101419b(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, "Google consent worker #" + this.f75238a.getAndIncrement());
        this.f75240c = new WeakReference(thread);
        return thread;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f75240c.get()) {
            runnable.run();
        } else {
            this.f75239b.execute(runnable);
        }
    }
}
