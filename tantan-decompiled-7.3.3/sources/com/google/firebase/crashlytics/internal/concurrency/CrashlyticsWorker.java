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
import p153l.m1z0;
import p153l.s26;
import p153l.toi0;
import p153l.zdg0;

/* JADX INFO: loaded from: classes7.dex */
public class CrashlyticsWorker implements Executor {
    private final ExecutorService executor;
    private final Object tailLock = new Object();
    private Task<?> tail = toi0.m192068f(null);

    public CrashlyticsWorker(ExecutorService executorService) {
        this.executor = executorService;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Task m16807b(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m16809d() {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Task m16810e(Runnable runnable, Task task) {
        runnable.run();
        return toi0.m192068f(null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Task m16811f(zdg0 zdg0Var, Task task) {
        if (task.mo15431p()) {
            return zdg0Var.then(task.mo15427l());
        }
        return task.mo15426k() != null ? toi0.m192067e(task.mo15426k()) : toi0.m192066d();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Task m16812g(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Task m16813h(Callable callable, Task task) {
        return (Task) callable.call();
    }

    @VisibleForTesting
    public void await() throws ExecutionException, InterruptedException, TimeoutException {
        toi0.m192064b(submit(new Runnable() { // from class: l.wub
            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsWorker.m16809d();
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
        m1z0 m1z0Var;
        synchronized (this.tailLock) {
            m1z0Var = (Task<T>) this.tail.mo15424i(this.executor, new s26() { // from class: l.vub
                @Override // p153l.s26
                public final Object then(Task task) {
                    return toi0.m192068f(callable.call());
                }
            });
            this.tail = m1z0Var;
        }
        return m1z0Var;
    }

    public <T, R> Task<R> submitTask(final Callable<Task<T>> callable, s26<T, Task<R>> s26Var) {
        m1z0 m1z0Var;
        synchronized (this.tailLock) {
            m1z0Var = (Task<R>) this.tail.mo15424i(this.executor, new s26() { // from class: l.yub
                @Override // p153l.s26
                public final Object then(Task task) {
                    return CrashlyticsWorker.m16807b(callable, task);
                }
            }).mo15424i(this.executor, s26Var);
            this.tail = m1z0Var;
        }
        return m1z0Var;
    }

    public <T, R> Task<R> submitTaskOnSuccess(final Callable<Task<T>> callable, final zdg0<T, R> zdg0Var) {
        m1z0 m1z0Var;
        synchronized (this.tailLock) {
            m1z0Var = (Task<R>) this.tail.mo15424i(this.executor, new s26() { // from class: l.zub
                @Override // p153l.s26
                public final Object then(Task task) {
                    return CrashlyticsWorker.m16812g(callable, task);
                }
            }).mo15424i(this.executor, new s26() { // from class: l.avb
                @Override // p153l.s26
                public final Object then(Task task) {
                    return CrashlyticsWorker.m16811f(zdg0Var, task);
                }
            });
            this.tail = m1z0Var;
        }
        return m1z0Var;
    }

    public Task<Void> submit(final Runnable runnable) {
        Task taskMo15424i;
        synchronized (this.tailLock) {
            taskMo15424i = this.tail.mo15424i(this.executor, new s26() { // from class: l.uub
                @Override // p153l.s26
                public final Object then(Task task) {
                    return CrashlyticsWorker.m16810e(runnable, task);
                }
            });
            this.tail = taskMo15424i;
        }
        return taskMo15424i;
    }

    public <T> Task<T> submitTask(final Callable<Task<T>> callable) {
        m1z0 m1z0Var;
        synchronized (this.tailLock) {
            m1z0Var = (Task<T>) this.tail.mo15424i(this.executor, new s26() { // from class: l.xub
                @Override // p153l.s26
                public final Object then(Task task) {
                    return CrashlyticsWorker.m16813h(callable, task);
                }
            });
            this.tail = m1z0Var;
        }
        return m1z0Var;
    }
}
