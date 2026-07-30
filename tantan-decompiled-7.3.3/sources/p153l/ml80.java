package p153l;

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
class ml80 implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: a */
    private long f137376a = 0;

    /* JADX INFO: renamed from: b */
    ExecutorService f137377b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: l.ml80$a */
    public class RunnableC18646a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f137378a;

        public RunnableC18646a(Runnable runnable) {
            this.f137378a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            ml80.this.f137376a = Thread.currentThread().getId();
            this.f137378a.run();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.ml80$b */
    public class CallableC18647b<T> implements Callable<T> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Callable f137380a;

        public CallableC18647b(Callable callable) {
            this.f137380a = callable;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            ml80.this.f137376a = Thread.currentThread().getId();
            return (T) this.f137380a.call();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f137377b.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        zmg0.m220382a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            mnd0.m159157a("PostAsyncSafelyExecutor#execute: task can't ne null");
        } else if (Thread.currentThread().getId() == this.f137376a) {
            runnable.run();
        } else {
            this.f137377b.execute(new RunnableC18646a(runnable));
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
        return this.f137377b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f137377b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f137377b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f137377b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        if (callable == null) {
            mnd0.m159157a("PostAsyncSafelyExecutor#submit: task can't ne null");
            return null;
        }
        if (Thread.currentThread().getId() != this.f137376a) {
            return this.f137377b.submit(new CallableC18647b(callable));
        }
        try {
            callable.call();
        } catch (Exception e) {
            Logger.m5921d("PostAsyncSafelyExecutor", "Error executing task synchronously", e);
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
        mnd0.m159157a("PostAsyncSafelyExecutor#submit: task can't ne null");
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        if (runnable != null) {
            FutureTask futureTask = new FutureTask(runnable, null);
            execute(futureTask);
            return futureTask;
        }
        mnd0.m159157a("PostAsyncSafelyExecutor#submit: task can't ne null");
        return null;
    }
}
