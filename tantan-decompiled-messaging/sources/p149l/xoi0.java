package p149l;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class xoi0 {

    /* JADX INFO: renamed from: a */
    public List<ExecutorService> f193847a;

    /* JADX INFO: renamed from: b */
    public ThreadFactory f193848b;

    public xoi0(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            this.f193848b = threadFactory;
        } else {
            this.f193848b = new xqd();
        }
        this.f193847a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public ScheduledExecutorService m210429a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, this.f193848b);
        this.f193847a.add(scheduledThreadPoolExecutor);
        return scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    public ExecutorService m210430b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), this.f193848b);
        this.f193847a.add(threadPoolExecutor);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: c */
    public void m210431c() {
        for (ExecutorService executorService : this.f193847a) {
            if (!executorService.isShutdown()) {
                executorService.shutdownNow();
            }
        }
    }
}
