package p153l;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class hnt0 implements Executor {

    /* JADX INFO: renamed from: b */
    public final ThreadPoolExecutor f110828b;

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f110827a = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    public WeakReference f110829c = new WeakReference(null);

    public hnt0(String str) {
        final String str2 = "Google consent worker";
        ThreadFactory threadFactory = new ThreadFactory(str2) { // from class: l.zlt0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f205007b = "Google consent worker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return this.f205006a.m136274b(this.f205007b, runnable);
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        this.f110828b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Thread m136274b(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, "Google consent worker #" + this.f110827a.getAndIncrement());
        this.f110829c = new WeakReference(thread);
        return thread;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f110829c.get()) {
            runnable.run();
        } else {
            this.f110828b.execute(runnable);
        }
    }
}
