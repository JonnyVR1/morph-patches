package p149l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class fzq0 implements dzq0 {
    public /* synthetic */ fzq0(ezq0 ezq0Var) {
    }

    @Override // p149l.dzq0
    /* JADX INFO: renamed from: a */
    public final ExecutorService mo114130a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // p149l.dzq0
    /* JADX INFO: renamed from: b */
    public final ExecutorService mo114131b(int i, int i2) {
        return mo114130a(4, Executors.defaultThreadFactory(), 2);
    }

    @Override // p149l.dzq0
    /* JADX INFO: renamed from: c */
    public final ExecutorService mo114132c(ThreadFactory threadFactory, int i) {
        return mo114130a(1, threadFactory, 1);
    }
}
