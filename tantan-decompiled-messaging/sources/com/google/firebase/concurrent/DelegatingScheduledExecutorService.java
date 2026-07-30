package com.google.firebase.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p149l.reg0;

/* JADX INFO: loaded from: classes7.dex */
class DelegatingScheduledExecutorService implements ScheduledExecutorService, AutoCloseable {
    private final ExecutorService delegate;
    private final ScheduledExecutorService scheduler;

    public DelegatingScheduledExecutorService(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.delegate = executorService;
        this.scheduler = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m16692g(Callable callable, DelegatingScheduledFuture.Completer completer) {
        try {
            completer.set(callable.call());
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m16693h(Runnable runnable, DelegatingScheduledFuture.Completer completer) throws Exception {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.setException(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m16696k(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m16698n(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
            completer.set(null);
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.delegate.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.b
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f11397a;
                return delegatingScheduledExecutorService.scheduler.schedule(new Runnable() { // from class: com.google.firebase.concurrent.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        delegatingScheduledExecutorService.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                DelegatingScheduledExecutorService.m16698n(runnable, completer);
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f11412a;
                return delegatingScheduledExecutorService.scheduler.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11406a.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.m
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                DelegatingScheduledExecutorService.m16693h(runnable, completer);
                            }
                        });
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.i
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f11419a;
                return delegatingScheduledExecutorService.scheduler.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11403a.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                DelegatingScheduledExecutorService.m16696k(runnable, completer);
                            }
                        });
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.delegate.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.delegate.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.delegate.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.delegate.submit(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.j
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f11424a;
                return delegatingScheduledExecutorService.scheduler.schedule(new Callable() { // from class: com.google.firebase.concurrent.l
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return delegatingScheduledExecutorService.delegate.submit(new Runnable() { // from class: com.google.firebase.concurrent.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                DelegatingScheduledExecutorService.m16692g(callable, completer);
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }
}
