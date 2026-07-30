package com.clevertap.android.sdk.task;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p149l.ae50;
import p149l.pg50;
import p149l.qq3;

/* JADX INFO: loaded from: classes.dex */
public class Task<TResult> {

    /* JADX INFO: renamed from: a */
    protected final CleverTapInstanceConfig f5458a;

    /* JADX INFO: renamed from: b */
    protected final Executor f5459b;

    /* JADX INFO: renamed from: c */
    protected final Executor f5460c;

    /* JADX INFO: renamed from: e */
    protected TResult f5462e;

    /* JADX INFO: renamed from: h */
    private final String f5465h;

    /* JADX INFO: renamed from: d */
    protected final List<C1313b<Exception>> f5461d = new ArrayList();

    /* JADX INFO: renamed from: f */
    protected final List<C1315d<TResult>> f5463f = new ArrayList();

    /* JADX INFO: renamed from: g */
    protected STATE f5464g = STATE.READY_TO_RUN;

    public enum STATE {
        FAILED,
        SUCCESS,
        READY_TO_RUN,
        RUNNING
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.task.Task$a */
    public class RunnableC1311a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f5466a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Callable f5467b;

        public RunnableC1311a(String str, Callable callable) {
            this.f5466a = str;
            this.f5467b = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                Task.this.m6950m(STATE.RUNNING);
                Task.this.m6940h(Task.this.f5465h + " Task: " + this.f5466a + " starting on..." + Thread.currentThread().getName(), null);
                Object objCall = this.f5467b.call();
                Task.this.m6940h(Task.this.f5465h + " Task: " + this.f5466a + " executed successfully on..." + Thread.currentThread().getName(), null);
                Task.this.m6948k(objCall);
            } catch (Exception e) {
                Task.this.m6947j(e);
                Task.this.m6940h(Task.this.f5465h + " Task: " + this.f5466a + " failed to execute on..." + Thread.currentThread().getName(), e);
            }
        }
    }

    public Task(CleverTapInstanceConfig cleverTapInstanceConfig, Executor executor, Executor executor2, String str) {
        this.f5460c = executor;
        this.f5459b = executor2;
        this.f5458a = cleverTapInstanceConfig;
        this.f5465h = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m6940h(String str, Exception exc) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f5458a;
        if (cleverTapInstanceConfig != null) {
            cleverTapInstanceConfig.getLogger().verbose(str, exc);
        } else {
            Logger.m5876v(str, exc);
        }
    }

    /* JADX INFO: renamed from: i */
    private Runnable m6941i(String str, Callable<TResult> callable) {
        return new RunnableC1311a(str, callable);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public synchronized Task<TResult> m6942c(@NonNull Executor executor, ae50<Exception> ae50Var) {
        if (ae50Var != null) {
            this.f5461d.add(new C1313b<>(executor, ae50Var));
        }
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public Task<TResult> m6943d(@NonNull ae50<Exception> ae50Var) {
        return m6942c(this.f5459b, ae50Var);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public Task<TResult> m6944e(@NonNull Executor executor, pg50<TResult> pg50Var) {
        if (pg50Var != null) {
            this.f5463f.add(new C1315d<>(executor, pg50Var));
        }
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public Task<TResult> m6945f(@NonNull pg50<TResult> pg50Var) {
        return m6944e(this.f5459b, pg50Var);
    }

    /* JADX INFO: renamed from: g */
    public void m6946g(String str, Callable<TResult> callable) {
        this.f5460c.execute(m6941i(str, callable));
    }

    /* JADX INFO: renamed from: j */
    public void m6947j(Exception exc) {
        m6950m(STATE.FAILED);
        Iterator<C1313b<Exception>> it = this.f5461d.iterator();
        while (it.hasNext()) {
            it.next().mo6953a(exc);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m6948k(TResult tresult) {
        m6950m(STATE.SUCCESS);
        m6949l(tresult);
        Iterator<C1315d<TResult>> it = this.f5463f.iterator();
        while (it.hasNext()) {
            it.next().mo6953a(this.f5462e);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m6949l(TResult tresult) {
        this.f5462e = tresult;
    }

    /* JADX INFO: renamed from: m */
    public void m6950m(STATE state) {
        this.f5464g = state;
    }

    /* JADX INFO: renamed from: n */
    public Future<?> m6951n(String str, Callable<TResult> callable) {
        Executor executor = this.f5460c;
        if (executor instanceof ExecutorService) {
            return ((ExecutorService) executor).submit(m6941i(str, callable));
        }
        qq3.m175877a("Can't use this method without ExecutorService, Use Execute alternatively ");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public TResult m6952o(String str, Callable<TResult> callable, long j) {
        Future futureSubmit;
        Executor executor = this.f5460c;
        if (!(executor instanceof ExecutorService)) {
            qq3.m175877a("Can't use this method without ExecutorService, Use Execute alternatively ");
            return null;
        }
        try {
            futureSubmit = ((ExecutorService) executor).submit(callable);
            try {
                return (TResult) futureSubmit.get(j, TimeUnit.MILLISECONDS);
            } catch (TimeoutException e) {
                e = e;
                m6940h("submitAndGetResult :: " + str + " task timed out", e);
                if (futureSubmit != null && !futureSubmit.isCancelled()) {
                    futureSubmit.cancel(true);
                }
                return null;
            } catch (Exception e2) {
                e = e2;
                m6940h("submitAndGetResult :: " + str + " task failed", e);
                if (futureSubmit != null && !futureSubmit.isCancelled()) {
                    futureSubmit.cancel(true);
                }
                return null;
            }
        } catch (TimeoutException e3) {
            e = e3;
            futureSubmit = null;
        } catch (Exception e4) {
            e = e4;
            futureSubmit = null;
        }
    }
}
