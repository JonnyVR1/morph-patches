package p149l;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class xuk extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final Handler f194506a;

    public xuk(Handler handler) {
        this.f194506a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f194506a.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean m211094k() {
        return Thread.currentThread() == this.f194506a.getLooper().getThread();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public <T> ztd0<T> newTaskFor(Runnable runnable, T t) {
        return new ztd0<>(this.f194506a, runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public <T> ztd0<T> newTaskFor(Callable<T> callable) {
        return new ztd0<>(this.f194506a, callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, null);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ztd0 ztd0VarNewTaskFor = newTaskFor(runnable, null);
        this.f194506a.postDelayed(ztd0VarNewTaskFor, timeUnit.toMillis(j));
        return ztd0VarNewTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        runnable.getClass();
        ztd0<T> ztd0VarNewTaskFor = newTaskFor(runnable, t);
        execute(ztd0VarNewTaskFor);
        return ztd0VarNewTaskFor;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        callable.getClass();
        ztd0<T> ztd0VarNewTaskFor = newTaskFor(callable);
        execute(ztd0VarNewTaskFor);
        return ztd0VarNewTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        ztd0 ztd0VarNewTaskFor = newTaskFor(callable);
        this.f194506a.postDelayed(ztd0VarNewTaskFor, timeUnit.toMillis(j));
        return ztd0VarNewTaskFor;
    }
}
