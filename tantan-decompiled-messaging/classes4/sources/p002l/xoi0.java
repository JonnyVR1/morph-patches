package p002l;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xoi0 {

    /* JADX INFO: renamed from: a */
    public List<ExecutorService> f22387a;

    /* JADX INFO: renamed from: b */
    public ThreadFactory f22388b;

    public xoi0(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            this.f22388b = threadFactory;
        } else {
            this.f22388b = new xqd();
        }
        this.f22387a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public ScheduledExecutorService m26044a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, this.f22388b);
        this.f22387a.add(scheduledThreadPoolExecutor);
        return scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    public ExecutorService m26045b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), this.f22388b);
        this.f22387a.add(threadPoolExecutor);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: c */
    public void m26046c() {
        for (ExecutorService executorService : this.f22387a) {
            if (!executorService.isShutdown()) {
                executorService.shutdownNow();
            }
        }
    }
}
