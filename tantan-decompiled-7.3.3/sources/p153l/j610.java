package p153l;

import android.os.SystemClock;
import com.p051p1.mobile.android.p052rx.rxthread.ThreadMonitorManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class j610 extends ThreadPoolExecutor implements AutoCloseable {
    public j610(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (ThreadMonitorManager.m21801b().m21804d() && (runnable instanceof hc20)) {
            hc20 hc20Var = (hc20) runnable;
            long jM134443a = hc20Var.m134443a() - hc20Var.getAddedTime();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - hc20Var.m134443a();
            if (jM134443a > ThreadMonitorManager.m21801b().m21803c()) {
                mo143601i(jM134443a);
            }
            mo143600h(jElapsedRealtime);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        if (ThreadMonitorManager.m21801b().m21804d() && (runnable instanceof hc20)) {
            ((hc20) runnable).m134444b(SystemClock.elapsedRealtime());
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        zmg0.m220382a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        super.execute(new hc20(runnable));
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo143600h(long j);

    /* JADX INFO: renamed from: i */
    public abstract void mo143601i(long j);
}
