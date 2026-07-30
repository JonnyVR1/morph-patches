package com.tencent.cloud.p080ai.network.okhttp3;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p153l.aqg0;
import p153l.za50;

/* JADX INFO: loaded from: classes12.dex */
public final class Dispatcher {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ boolean f57163h = true;

    /* JADX INFO: renamed from: c */
    public Runnable f57166c;

    /* JADX INFO: renamed from: d */
    public ExecutorService f57167d;

    /* JADX INFO: renamed from: a */
    public int f57164a = 64;

    /* JADX INFO: renamed from: b */
    public int f57165b = 5;

    /* JADX INFO: renamed from: e */
    public final Deque<C13932r.a> f57168e = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    public final Deque<C13932r.a> f57169f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final Deque<C13932r> f57170g = new ArrayDeque();

    public Dispatcher(ExecutorService executorService) {
        this.f57167d = executorService;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82763a() {
        boolean z;
        if (!f57163h && Thread.holdsLock(this)) {
            aqg0.m99478a();
            return false;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<C13932r.a> it = this.f57168e.iterator();
                while (it.hasNext()) {
                    C13932r.a next = it.next();
                    if (this.f57169f.size() >= this.f57164a) {
                        break;
                    }
                    if (next.f57788c.get() < this.f57165b) {
                        it.remove();
                        next.f57788c.incrementAndGet();
                        arrayList.add(next);
                        this.f57169f.add(next);
                    }
                }
                z = runningCallsCount() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C13932r.a aVar = (C13932r.a) arrayList.get(i);
            ExecutorService executorService = executorService();
            aVar.getClass();
            if (!C13932r.a.f57786e && Thread.holdsLock(C13932r.this.f57781a.dispatcher())) {
                aqg0.m99478a();
                return false;
            }
            try {
                try {
                    executorService.execute(aVar);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    C13932r.this.f57782b.m82860a(interruptedIOException);
                    aVar.f57787b.onFailure(C13932r.this, interruptedIOException);
                    C13932r.this.f57781a.dispatcher().m82761a(aVar);
                }
            } catch (Throwable th2) {
                C13932r.this.f57781a.dispatcher().m82761a(aVar);
                throw th2;
            }
        }
        return z;
    }

    public synchronized void cancelAll() {
        try {
            Iterator<C13932r.a> it = this.f57168e.iterator();
            while (it.hasNext()) {
                C13932r.this.f57782b.m82862a();
            }
            Iterator<C13932r.a> it2 = this.f57169f.iterator();
            while (it2.hasNext()) {
                C13932r.this.f57782b.m82862a();
            }
            Iterator<C13932r> it3 = this.f57170g.iterator();
            while (it3.hasNext()) {
                it3.next().f57782b.m82862a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ExecutorService executorService() {
        try {
            if (this.f57167d == null) {
                this.f57167d = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C13869c.m82795a("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f57167d;
    }

    public synchronized int getMaxRequests() {
        return this.f57164a;
    }

    public synchronized int getMaxRequestsPerHost() {
        return this.f57165b;
    }

    public synchronized List<Call> queuedCalls() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator<C13932r.a> it = this.f57168e.iterator();
            while (it.hasNext()) {
                arrayList.add(C13932r.this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int queuedCallsCount() {
        return this.f57168e.size();
    }

    public synchronized List<Call> runningCalls() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            arrayList.addAll(this.f57170g);
            Iterator<C13932r.a> it = this.f57169f.iterator();
            while (it.hasNext()) {
                arrayList.add(C13932r.this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int runningCallsCount() {
        return this.f57169f.size() + this.f57170g.size();
    }

    public synchronized void setIdleCallback(Runnable runnable) {
        this.f57166c = runnable;
    }

    public void setMaxRequests(int i) {
        if (i < 1) {
            za50.m219101a("max < 1: ", i);
            return;
        }
        synchronized (this) {
            this.f57164a = i;
        }
        m82763a();
    }

    public void setMaxRequestsPerHost(int i) {
        if (i < 1) {
            za50.m219101a("max < 1: ", i);
            return;
        }
        synchronized (this) {
            this.f57165b = i;
        }
        m82763a();
    }

    public Dispatcher() {
    }

    /* JADX INFO: renamed from: a */
    public void m82761a(C13932r.a aVar) {
        aVar.f57788c.decrementAndGet();
        m82762a(this.f57169f, aVar);
    }

    /* JADX INFO: renamed from: a */
    public final <T> void m82762a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f57166c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (m82763a() || runnable == null) {
            return;
        }
        runnable.run();
    }
}
