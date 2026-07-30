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
import p153l.hm50;
import p153l.pr3;
import p153l.vo50;

/* JADX INFO: loaded from: classes.dex */
public class Task<TResult> {

    /* JADX INFO: renamed from: a */
    protected final CleverTapInstanceConfig f5495a;

    /* JADX INFO: renamed from: b */
    protected final Executor f5496b;

    /* JADX INFO: renamed from: c */
    protected final Executor f5497c;

    /* JADX INFO: renamed from: e */
    protected TResult f5499e;

    /* JADX INFO: renamed from: h */
    private final String f5502h;

    /* JADX INFO: renamed from: d */
    protected final List<C1336b<Exception>> f5498d = new ArrayList();

    /* JADX INFO: renamed from: f */
    protected final List<C1338d<TResult>> f5500f = new ArrayList();

    /* JADX INFO: renamed from: g */
    protected STATE f5501g = STATE.READY_TO_RUN;

    public enum STATE {
        FAILED,
        SUCCESS,
        READY_TO_RUN,
        RUNNING
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.task.Task$a */
    public class RunnableC1334a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f5503a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Callable f5504b;

        public RunnableC1334a(String str, Callable callable) {
            this.f5503a = str;
            this.f5504b = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                Task.this.m7004m(STATE.RUNNING);
                Task.this.m6994h(Task.this.f5502h + " Task: " + this.f5503a + " starting on..." + Thread.currentThread().getName(), null);
                Object objCall = this.f5504b.call();
                Task.this.m6994h(Task.this.f5502h + " Task: " + this.f5503a + " executed successfully on..." + Thread.currentThread().getName(), null);
                Task.this.m7002k(objCall);
            } catch (Exception e) {
                Task.this.m7001j(e);
                Task.this.m6994h(Task.this.f5502h + " Task: " + this.f5503a + " failed to execute on..." + Thread.currentThread().getName(), e);
            }
        }
    }

    public Task(CleverTapInstanceConfig cleverTapInstanceConfig, Executor executor, Executor executor2, String str) {
        this.f5497c = executor;
        this.f5496b = executor2;
        this.f5495a = cleverTapInstanceConfig;
        this.f5502h = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m6994h(String str, Exception exc) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f5495a;
        if (cleverTapInstanceConfig != null) {
            cleverTapInstanceConfig.getLogger().verbose(str, exc);
        } else {
            Logger.m5930v(str, exc);
        }
    }

    /* JADX INFO: renamed from: i */
    private Runnable m6995i(String str, Callable<TResult> callable) {
        return new RunnableC1334a(str, callable);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public synchronized Task<TResult> m6996c(@NonNull Executor executor, hm50<Exception> hm50Var) {
        if (hm50Var != null) {
            this.f5498d.add(new C1336b<>(executor, hm50Var));
        }
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public Task<TResult> m6997d(@NonNull hm50<Exception> hm50Var) {
        return m6996c(this.f5496b, hm50Var);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public Task<TResult> m6998e(@NonNull Executor executor, vo50<TResult> vo50Var) {
        if (vo50Var != null) {
            this.f5500f.add(new C1338d<>(executor, vo50Var));
        }
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public Task<TResult> m6999f(@NonNull vo50<TResult> vo50Var) {
        return m6998e(this.f5496b, vo50Var);
    }

    /* JADX INFO: renamed from: g */
    public void m7000g(String str, Callable<TResult> callable) {
        this.f5497c.execute(m6995i(str, callable));
    }

    /* JADX INFO: renamed from: j */
    public void m7001j(Exception exc) {
        m7004m(STATE.FAILED);
        Iterator<C1336b<Exception>> it = this.f5498d.iterator();
        while (it.hasNext()) {
            it.next().mo7007a(exc);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m7002k(TResult tresult) {
        m7004m(STATE.SUCCESS);
        m7003l(tresult);
        Iterator<C1338d<TResult>> it = this.f5500f.iterator();
        while (it.hasNext()) {
            it.next().mo7007a(this.f5499e);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m7003l(TResult tresult) {
        this.f5499e = tresult;
    }

    /* JADX INFO: renamed from: m */
    public void m7004m(STATE state) {
        this.f5501g = state;
    }

    /* JADX INFO: renamed from: n */
    public Future<?> m7005n(String str, Callable<TResult> callable) {
        Executor executor = this.f5497c;
        if (executor instanceof ExecutorService) {
            return ((ExecutorService) executor).submit(m6995i(str, callable));
        }
        pr3.m173429a("Can't use this method without ExecutorService, Use Execute alternatively ");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public TResult m7006o(String str, Callable<TResult> callable, long j) {
        Future futureSubmit;
        Executor executor = this.f5497c;
        if (!(executor instanceof ExecutorService)) {
            pr3.m173429a("Can't use this method without ExecutorService, Use Execute alternatively ");
            return null;
        }
        try {
            futureSubmit = ((ExecutorService) executor).submit(callable);
            try {
                return (TResult) futureSubmit.get(j, TimeUnit.MILLISECONDS);
            } catch (TimeoutException e) {
                e = e;
                m6994h("submitAndGetResult :: " + str + " task timed out", e);
                if (futureSubmit != null && !futureSubmit.isCancelled()) {
                    futureSubmit.cancel(true);
                }
                return null;
            } catch (Exception e2) {
                e = e2;
                m6994h("submitAndGetResult :: " + str + " task failed", e);
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
