package p149l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class mbw0 implements kbw0 {
    public /* synthetic */ mbw0(lbw0 lbw0Var) {
    }

    @Override // p149l.kbw0
    /* JADX INFO: renamed from: a */
    public final ExecutorService mo145326a(ThreadFactory threadFactory, int i) {
        return mo145327b(1, threadFactory, 1);
    }

    @Override // p149l.kbw0
    /* JADX INFO: renamed from: b */
    public final ExecutorService mo145327b(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // p149l.kbw0
    public final ExecutorService zza(int i) {
        return mo145327b(1, Executors.defaultThreadFactory(), 2);
    }
}
