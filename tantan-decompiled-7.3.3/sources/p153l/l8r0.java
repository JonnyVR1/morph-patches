package p153l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class l8r0 implements j8r0 {
    public /* synthetic */ l8r0(k8r0 k8r0Var) {
    }

    @Override // p153l.j8r0
    /* JADX INFO: renamed from: a */
    public final ExecutorService mo143880a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // p153l.j8r0
    /* JADX INFO: renamed from: b */
    public final ExecutorService mo143881b(int i, int i2) {
        return mo143880a(4, Executors.defaultThreadFactory(), 2);
    }

    @Override // p153l.j8r0
    /* JADX INFO: renamed from: c */
    public final ExecutorService mo143882c(ThreadFactory threadFactory, int i) {
        return mo143880a(1, threadFactory, 1);
    }
}
