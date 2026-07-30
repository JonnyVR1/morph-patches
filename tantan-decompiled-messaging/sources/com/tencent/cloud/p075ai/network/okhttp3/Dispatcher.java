package com.tencent.cloud.p075ai.network.okhttp3;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
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
import p149l.k250;
import p149l.shg0;

/* JADX INFO: loaded from: classes13.dex */
public final class Dispatcher {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ boolean f56315h = true;

    /* JADX INFO: renamed from: c */
    public Runnable f56318c;

    /* JADX INFO: renamed from: d */
    public ExecutorService f56319d;

    /* JADX INFO: renamed from: a */
    public int f56316a = 64;

    /* JADX INFO: renamed from: b */
    public int f56317b = 5;

    /* JADX INFO: renamed from: e */
    public final Deque<C13769r.a> f56320e = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    public final Deque<C13769r.a> f56321f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final Deque<C13769r> f56322g = new ArrayDeque();

    public Dispatcher(ExecutorService executorService) {
        this.f56319d = executorService;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81580a() {
        boolean z;
        if (!f56315h && Thread.holdsLock(this)) {
            shg0.m184191a();
            return false;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<C13769r.a> it = this.f56320e.iterator();
                while (it.hasNext()) {
                    C13769r.a next = it.next();
                    if (this.f56321f.size() >= this.f56316a) {
                        break;
                    }
                    if (next.f56940c.get() < this.f56317b) {
                        it.remove();
                        next.f56940c.incrementAndGet();
                        arrayList.add(next);
                        this.f56321f.add(next);
                    }
                }
                z = runningCallsCount() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C13769r.a aVar = (C13769r.a) arrayList.get(i);
            ExecutorService executorService = executorService();
            aVar.getClass();
            if (!C13769r.a.f56938e && Thread.holdsLock(C13769r.this.f56933a.dispatcher())) {
                shg0.m184191a();
                return false;
            }
            try {
                try {
                    executorService.execute(aVar);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    C13769r.this.f56934b.m81677a(interruptedIOException);
                    aVar.f56939b.onFailure(C13769r.this, interruptedIOException);
                    C13769r.this.f56933a.dispatcher().m81578a(aVar);
                }
            } catch (Throwable th2) {
                C13769r.this.f56933a.dispatcher().m81578a(aVar);
                throw th2;
            }
        }
        return z;
    }

    public synchronized void cancelAll() {
        try {
            Iterator<C13769r.a> it = this.f56320e.iterator();
            while (it.hasNext()) {
                C13769r.this.f56934b.m81679a();
            }
            Iterator<C13769r.a> it2 = this.f56321f.iterator();
            while (it2.hasNext()) {
                C13769r.this.f56934b.m81679a();
            }
            Iterator<C13769r> it3 = this.f56322g.iterator();
            while (it3.hasNext()) {
                it3.next().f56934b.m81679a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ExecutorService executorService() {
        try {
            if (this.f56319d == null) {
                this.f56319d = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C13706c.m81612a("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f56319d;
    }

    public synchronized int getMaxRequests() {
        return this.f56316a;
    }

    public synchronized int getMaxRequestsPerHost() {
        return this.f56317b;
    }

    public synchronized List<Call> queuedCalls() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator<C13769r.a> it = this.f56320e.iterator();
            while (it.hasNext()) {
                arrayList.add(C13769r.this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int queuedCallsCount() {
        return this.f56320e.size();
    }

    public synchronized List<Call> runningCalls() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            arrayList.addAll(this.f56322g);
            Iterator<C13769r.a> it = this.f56321f.iterator();
            while (it.hasNext()) {
                arrayList.add(C13769r.this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int runningCallsCount() {
        return this.f56321f.size() + this.f56322g.size();
    }

    public synchronized void setIdleCallback(Runnable runnable) {
        this.f56318c = runnable;
    }

    public void setMaxRequests(int i) {
        if (i < 1) {
            k250.m144273a("max < 1: ", i);
            return;
        }
        synchronized (this) {
            this.f56316a = i;
        }
        m81580a();
    }

    public void setMaxRequestsPerHost(int i) {
        if (i < 1) {
            k250.m144273a("max < 1: ", i);
            return;
        }
        synchronized (this) {
            this.f56317b = i;
        }
        m81580a();
    }

    public Dispatcher() {
    }

    /* JADX INFO: renamed from: a */
    public void m81578a(C13769r.a aVar) {
        aVar.f56940c.decrementAndGet();
        m81579a(this.f56321f, aVar);
    }

    /* JADX INFO: renamed from: a */
    public final <T> void m81579a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f56318c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (m81580a() || runnable == null) {
            return;
        }
        runnable.run();
    }
}
