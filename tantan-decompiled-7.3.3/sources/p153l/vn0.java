package p153l;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class vn0 {
    private static final vn0 INSTANCE = new vn0();

    /* JADX INFO: renamed from: b */
    private static final int f184795b;

    /* JADX INFO: renamed from: c */
    static final int f184796c;

    /* JADX INFO: renamed from: d */
    static final int f184797d;

    /* JADX INFO: renamed from: a */
    private final Executor f184798a = new ExecutorC20859b();

    /* JADX INFO: renamed from: l.vn0$b */
    public static class ExecutorC20859b implements Executor {
        private ExecutorC20859b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f184795b = iAvailableProcessors;
        f184796c = iAvailableProcessors + 1;
        f184797d = (iAvailableProcessors * 2) + 1;
    }

    private vn0() {
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public static void m201895a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        threadPoolExecutor.allowCoreThreadTimeOut(z);
    }

    /* JADX INFO: renamed from: b */
    public static ExecutorService m201896b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f184796c, f184797d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        m201895a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: c */
    public static Executor m201897c() {
        return INSTANCE.f184798a;
    }
}
