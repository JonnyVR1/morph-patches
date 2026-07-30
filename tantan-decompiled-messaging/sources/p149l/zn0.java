package p149l;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class zn0 {
    private static final zn0 INSTANCE = new zn0();

    /* JADX INFO: renamed from: b */
    private static final int f203909b;

    /* JADX INFO: renamed from: c */
    static final int f203910c;

    /* JADX INFO: renamed from: d */
    static final int f203911d;

    /* JADX INFO: renamed from: a */
    private final Executor f203912a = new ExecutorC21736b();

    /* JADX INFO: renamed from: l.zn0$b */
    public static class ExecutorC21736b implements Executor {
        private ExecutorC21736b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f203909b = iAvailableProcessors;
        f203910c = iAvailableProcessors + 1;
        f203911d = (iAvailableProcessors * 2) + 1;
    }

    private zn0() {
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public static void m219389a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        threadPoolExecutor.allowCoreThreadTimeOut(z);
    }

    /* JADX INFO: renamed from: b */
    public static ExecutorService m219390b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f203910c, f203911d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        m219389a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: c */
    public static Executor m219391c() {
        return INSTANCE.f203912a;
    }
}
