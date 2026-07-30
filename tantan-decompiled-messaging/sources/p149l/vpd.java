package p149l;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class vpd extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public static final int f182467a;

    /* JADX INFO: renamed from: b */
    public static final int f182468b;

    /* JADX INFO: renamed from: c */
    public static final int f182469c;

    /* JADX INFO: renamed from: d */
    public static volatile vpd f182470d;

    /* JADX INFO: renamed from: l.vpd$a */
    public class RejectedExecutionHandlerC20713a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            ksm.f124490c.error("Injecter::", "Task rejected, too many task!");
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f182467a = iAvailableProcessors;
        int i = iAvailableProcessors + 1;
        f182468b = i;
        f182469c = i;
    }

    public vpd(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, new RejectedExecutionHandlerC20713a());
    }

    /* JADX INFO: renamed from: k */
    public static vpd m199225k() {
        if (f182470d == null) {
            synchronized (vpd.class) {
                try {
                    if (f182470d == null) {
                        f182470d = new vpd(f182468b, f182469c, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(64), new wqd());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f182470d;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException e) {
                th = e;
            } catch (ExecutionException e2) {
                th = e2.getCause();
            }
        }
        if (th != null) {
            ksm.f124490c.warning("Injecter::", "Running task appeared exception! Thread [" + Thread.currentThread().getName() + "], because [" + th.getMessage() + "]\n" + jji0.m141805a(th.getStackTrace()));
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }
}
