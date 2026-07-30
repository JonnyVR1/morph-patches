package com.google.firebase.concurrent;

import com.google.firebase.components.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes7.dex */
class LimitedConcurrencyExecutor implements Executor {
    private final Executor delegate;
    private final LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
    private final Semaphore semaphore;

    public LimitedConcurrencyExecutor(Executor executor, int i) {
        Preconditions.checkArgument(i > 0, "concurrency must be positive.");
        this.delegate = executor;
        this.semaphore = new Semaphore(i, true);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16709b(LimitedConcurrencyExecutor limitedConcurrencyExecutor, Runnable runnable) {
        limitedConcurrencyExecutor.getClass();
        try {
            runnable.run();
        } finally {
            limitedConcurrencyExecutor.semaphore.release();
            limitedConcurrencyExecutor.maybeEnqueueNext();
        }
    }

    private Runnable decorate(final Runnable runnable) {
        return new Runnable() { // from class: com.google.firebase.concurrent.n
            @Override // java.lang.Runnable
            public final void run() {
                LimitedConcurrencyExecutor.m16709b(this.f11435a, runnable);
            }
        };
    }

    private void maybeEnqueueNext() {
        while (this.semaphore.tryAcquire()) {
            Runnable runnablePoll = this.queue.poll();
            if (runnablePoll == null) {
                this.semaphore.release();
                return;
            }
            this.delegate.execute(decorate(runnablePoll));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.queue.offer(runnable);
        maybeEnqueueNext();
    }
}
