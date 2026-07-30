package p153l;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class nxk extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final Handler f144154a;

    public nxk(Handler handler) {
        this.f144154a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        zmg0.m220382a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f144154a.post(runnable);
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
    public boolean m165159k() {
        return Thread.currentThread() == this.f144154a.getLooper().getThread();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public <T> b2e0<T> newTaskFor(Runnable runnable, T t) {
        return new b2e0<>(this.f144154a, runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public <T> b2e0<T> newTaskFor(Callable<T> callable) {
        return new b2e0<>(this.f144154a, callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, null);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        b2e0 b2e0VarNewTaskFor = newTaskFor(runnable, null);
        this.f144154a.postDelayed(b2e0VarNewTaskFor, timeUnit.toMillis(j));
        return b2e0VarNewTaskFor;
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
        b2e0<T> b2e0VarNewTaskFor = newTaskFor(runnable, t);
        execute(b2e0VarNewTaskFor);
        return b2e0VarNewTaskFor;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        callable.getClass();
        b2e0<T> b2e0VarNewTaskFor = newTaskFor(callable);
        execute(b2e0VarNewTaskFor);
        return b2e0VarNewTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        b2e0 b2e0VarNewTaskFor = newTaskFor(callable);
        this.f144154a.postDelayed(b2e0VarNewTaskFor, timeUnit.toMillis(j));
        return b2e0VarNewTaskFor;
    }
}
