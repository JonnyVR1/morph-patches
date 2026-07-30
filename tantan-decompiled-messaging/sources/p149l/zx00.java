package p149l;

import android.os.SystemClock;
import com.p046p1.mobile.android.p047rx.rxthread.ThreadMonitorManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zx00 extends ThreadPoolExecutor implements AutoCloseable {
    public zx00(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (ThreadMonitorManager.m20802b().m20805d() && (runnable instanceof z320)) {
            z320 z320Var = (z320) runnable;
            long jM217011a = z320Var.m217011a() - z320Var.getAddedTime();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - z320Var.m217011a();
            if (jM217011a > ThreadMonitorManager.m20802b().m20804c()) {
                mo202183i(jM217011a);
            }
            mo202182h(jElapsedRealtime);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        if (ThreadMonitorManager.m20802b().m20805d() && (runnable instanceof z320)) {
            ((z320) runnable).m217012b(SystemClock.elapsedRealtime());
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        super.execute(new z320(runnable));
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo202182h(long j);

    /* JADX INFO: renamed from: i */
    public abstract void mo202183i(long j);
}
