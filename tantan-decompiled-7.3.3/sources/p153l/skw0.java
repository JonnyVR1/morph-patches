package p153l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class skw0 implements qkw0 {
    public /* synthetic */ skw0(rkw0 rkw0Var) {
    }

    @Override // p153l.qkw0
    /* JADX INFO: renamed from: a */
    public final ExecutorService mo176972a(ThreadFactory threadFactory, int i) {
        return mo176973b(1, threadFactory, 1);
    }

    @Override // p153l.qkw0
    /* JADX INFO: renamed from: b */
    public final ExecutorService mo176973b(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // p153l.qkw0
    public final ExecutorService zza(int i) {
        return mo176973b(1, Executors.defaultThreadFactory(), 2);
    }
}
