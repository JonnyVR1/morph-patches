package com.google.firebase.crashlytics.internal.concurrency;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p149l.gsy0;
import p149l.n16;
import p149l.r5g0;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
public class CrashlyticsWorker implements Executor {
    private final ExecutorService executor;
    private final Object tailLock = new Object();
    private Task<?> tail = tfi0.m188734f(null);

    public CrashlyticsWorker(ExecutorService executorService) {
        this.executor = executorService;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Task m16752b(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m16754d() {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Task m16755e(Runnable runnable, Task task) {
        runnable.run();
        return tfi0.m188734f(null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Task m16756f(r5g0 r5g0Var, Task task) {
        if (task.mo15377p()) {
            return r5g0Var.then(task.mo15373l());
        }
        return task.mo15372k() != null ? tfi0.m188733e(task.mo15372k()) : tfi0.m188732d();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Task m16757g(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Task m16758h(Callable callable, Task task) {
        return (Task) callable.call();
    }

    @VisibleForTesting
    public void await() throws ExecutionException, InterruptedException, TimeoutException {
        tfi0.m188730b(submit(new Runnable() { // from class: l.itb
            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsWorker.m16754d();
            }
        }), 30L, TimeUnit.SECONDS);
        Thread.sleep(1L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.executor.execute(runnable);
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    public <T> Task<T> submit(final Callable<T> callable) {
        gsy0 gsy0Var;
        synchronized (this.tailLock) {
            gsy0Var = (Task<T>) this.tail.mo15370i(this.executor, new n16() { // from class: l.htb
                @Override // p149l.n16
                public final Object then(Task task) {
                    return tfi0.m188734f(callable.call());
                }
            });
            this.tail = gsy0Var;
        }
        return gsy0Var;
    }

    public <T, R> Task<R> submitTask(final Callable<Task<T>> callable, n16<T, Task<R>> n16Var) {
        gsy0 gsy0Var;
        synchronized (this.tailLock) {
            gsy0Var = (Task<R>) this.tail.mo15370i(this.executor, new n16() { // from class: l.ktb
                @Override // p149l.n16
                public final Object then(Task task) {
                    return CrashlyticsWorker.m16752b(callable, task);
                }
            }).mo15370i(this.executor, n16Var);
            this.tail = gsy0Var;
        }
        return gsy0Var;
    }

    public <T, R> Task<R> submitTaskOnSuccess(final Callable<Task<T>> callable, final r5g0<T, R> r5g0Var) {
        gsy0 gsy0Var;
        synchronized (this.tailLock) {
            gsy0Var = (Task<R>) this.tail.mo15370i(this.executor, new n16() { // from class: l.ltb
                @Override // p149l.n16
                public final Object then(Task task) {
                    return CrashlyticsWorker.m16757g(callable, task);
                }
            }).mo15370i(this.executor, new n16() { // from class: l.mtb
                @Override // p149l.n16
                public final Object then(Task task) {
                    return CrashlyticsWorker.m16756f(r5g0Var, task);
                }
            });
            this.tail = gsy0Var;
        }
        return gsy0Var;
    }

    public Task<Void> submit(final Runnable runnable) {
        Task taskMo15370i;
        synchronized (this.tailLock) {
            taskMo15370i = this.tail.mo15370i(this.executor, new n16() { // from class: l.gtb
                @Override // p149l.n16
                public final Object then(Task task) {
                    return CrashlyticsWorker.m16755e(runnable, task);
                }
            });
            this.tail = taskMo15370i;
        }
        return taskMo15370i;
    }

    public <T> Task<T> submitTask(final Callable<Task<T>> callable) {
        gsy0 gsy0Var;
        synchronized (this.tailLock) {
            gsy0Var = (Task<T>) this.tail.mo15370i(this.executor, new n16() { // from class: l.jtb
                @Override // p149l.n16
                public final Object then(Task task) {
                    return CrashlyticsWorker.m16758h(callable, task);
                }
            });
            this.tail = gsy0Var;
        }
        return gsy0Var;
    }
}
