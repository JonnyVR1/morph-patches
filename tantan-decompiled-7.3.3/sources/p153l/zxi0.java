package p153l;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class zxi0 {

    /* JADX INFO: renamed from: a */
    public List<ExecutorService> f206462a;

    /* JADX INFO: renamed from: b */
    public ThreadFactory f206463b;

    public zxi0(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            this.f206463b = threadFactory;
        } else {
            this.f206463b = new msd();
        }
        this.f206462a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public ScheduledExecutorService m221991a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, this.f206463b);
        this.f206462a.add(scheduledThreadPoolExecutor);
        return scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    public ExecutorService m221992b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), this.f206463b);
        this.f206462a.add(threadPoolExecutor);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: c */
    public void m221993c() {
        for (ExecutorService executorService : this.f206462a) {
            if (!executorService.isShutdown()) {
                executorService.shutdownNow();
            }
        }
    }
}
