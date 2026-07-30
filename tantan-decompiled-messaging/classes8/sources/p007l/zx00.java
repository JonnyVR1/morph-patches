package p007l;

import android.os.SystemClock;
import com.p003p1.mobile.android.p004rx.rxthread.ThreadMonitorManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.reg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public abstract class zx00 extends ThreadPoolExecutor implements AutoCloseable {
    public zx00(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (ThreadMonitorManager.m1073b().m1076d() && (runnable instanceof z320)) {
            z320 z320Var = (z320) runnable;
            long jM11964a = z320Var.m11964a() - z320Var.getAddedTime();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - z320Var.m11964a();
            if (jM11964a > ThreadMonitorManager.m1073b().m1075c()) {
                mo11326i(jM11964a);
            }
            mo11325h(jElapsedRealtime);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        if (ThreadMonitorManager.m1073b().m1076d() && (runnable instanceof z320)) {
            ((z320) runnable).m11965b(SystemClock.elapsedRealtime());
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        super.execute(new z320(runnable));
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo11325h(long j);

    /* JADX INFO: renamed from: i */
    public abstract void mo11326i(long j);
}
