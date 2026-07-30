package p153l;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class mrd extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public static final int f138314a;

    /* JADX INFO: renamed from: b */
    public static final int f138315b;

    /* JADX INFO: renamed from: c */
    public static final int f138316c;

    /* JADX INFO: renamed from: d */
    public static volatile mrd f138317d;

    /* JADX INFO: renamed from: l.mrd$a */
    public class RejectedExecutionHandlerC18684a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            mum.f138826c.error("Injecter::", "Task rejected, too many task!");
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f138314a = iAvailableProcessors;
        int i = iAvailableProcessors + 1;
        f138315b = i;
        f138316c = i;
    }

    public mrd(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, new RejectedExecutionHandlerC18684a());
    }

    /* JADX INFO: renamed from: k */
    public static mrd m159673k() {
        if (f138317d == null) {
            synchronized (mrd.class) {
                try {
                    if (f138317d == null) {
                        f138317d = new mrd(f138315b, f138316c, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(64), new lsd());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f138317d;
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
            mum.f138826c.warning("Injecter::", "Running task appeared exception! Thread [" + Thread.currentThread().getName() + "], because [" + th.getMessage() + "]\n" + jsi0.m146842a(th.getStackTrace()));
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        zmg0.m220382a(this);
    }
}
