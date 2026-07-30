package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
final class PausableScheduledExecutorServiceImpl extends DelegatingScheduledExecutorService implements PausableScheduledExecutorService {
    private final PausableExecutorService delegate;

    public PausableScheduledExecutorServiceImpl(PausableExecutorService pausableExecutorService, ScheduledExecutorService scheduledExecutorService) {
        super(pausableExecutorService, scheduledExecutorService);
        this.delegate = pausableExecutorService;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.delegate.isPaused();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.delegate.pause();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.delegate.resume();
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
