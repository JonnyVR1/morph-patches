package p149l;

import com.clevertap.android.sdk.Logger;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class gd80 implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: a */
    private long f102089a = 0;

    /* JADX INFO: renamed from: b */
    ExecutorService f102090b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: l.gd80$a */
    public class RunnableC17060a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f102091a;

        public RunnableC17060a(Runnable runnable) {
            this.f102091a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            gd80.this.f102089a = Thread.currentThread().getId();
            this.f102091a.run();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.gd80$b */
    public class CallableC17061b<T> implements Callable<T> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Callable f102093a;

        public CallableC17061b(Callable callable) {
            this.f102093a = callable;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            gd80.this.f102089a = Thread.currentThread().getId();
            return (T) this.f102093a.call();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f102090b.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            jfd0.m141176a("PostAsyncSafelyExecutor#execute: task can't ne null");
        } else if (Thread.currentThread().getId() == this.f102089a) {
            runnable.run();
        } else {
            this.f102090b.execute(new RunnableC17060a(runnable));
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAll: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAny: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f102090b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f102090b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f102090b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f102090b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        if (callable == null) {
            jfd0.m141176a("PostAsyncSafelyExecutor#submit: task can't ne null");
            return null;
        }
        if (Thread.currentThread().getId() != this.f102089a) {
            return this.f102090b.submit(new CallableC17061b(callable));
        }
        try {
            callable.call();
        } catch (Exception e) {
            Logger.m5867d("PostAsyncSafelyExecutor", "Error executing task synchronously", e);
        }
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAll: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAny: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        if (runnable != null) {
            FutureTask futureTask = new FutureTask(runnable, t);
            execute(futureTask);
            return futureTask;
        }
        jfd0.m141176a("PostAsyncSafelyExecutor#submit: task can't ne null");
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        if (runnable != null) {
            FutureTask futureTask = new FutureTask(runnable, null);
            execute(futureTask);
            return futureTask;
        }
        jfd0.m141176a("PostAsyncSafelyExecutor#submit: task can't ne null");
        return null;
    }
}
