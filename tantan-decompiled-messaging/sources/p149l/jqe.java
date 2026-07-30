package p149l;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class jqe {

    /* JADX INFO: renamed from: a */
    private static ThreadPoolExecutor f119259a;

    /* JADX INFO: renamed from: l.jqe$a */
    public class ThreadFactoryC17843a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "effect_proxy_thread");
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC17843a());
        f119259a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m142789a(Runnable runnable) {
        f119259a.execute(runnable);
    }
}
