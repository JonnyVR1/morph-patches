package p153l;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class nre {

    /* JADX INFO: renamed from: a */
    private static ThreadPoolExecutor f143399a;

    /* JADX INFO: renamed from: l.nre$a */
    public class ThreadFactoryC18935a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "effect_proxy_thread");
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC18935a());
        f143399a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m164481a(Runnable runnable) {
        f143399a.execute(runnable);
    }
}
