package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.cache.CacheInterceptor;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13720j;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.ConnectInterceptor;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.BridgeInterceptor;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.CallServerInterceptor;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.RealInterceptorChain;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.RetryAndFollowUpInterceptor;
import com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c;
import com.tencent.cloud.p075ai.network.okio.C13795x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.r */
/* JADX INFO: loaded from: classes13.dex */
public final class C13769r implements Call {

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f56933a;

    /* JADX INFO: renamed from: b */
    public C13720j f56934b;

    /* JADX INFO: renamed from: c */
    public final Request f56935c;

    /* JADX INFO: renamed from: d */
    public final boolean f56936d;

    /* JADX INFO: renamed from: e */
    public boolean f56937e;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.r$a */
    public final class a extends AbstractRunnableC13705b {

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ boolean f56938e = true;

        /* JADX INFO: renamed from: b */
        public final Callback f56939b;

        /* JADX INFO: renamed from: c */
        public volatile AtomicInteger f56940c;

        public a(Callback callback) {
            super("OkHttp %s", C13769r.this.m81879b());
            this.f56940c = new AtomicInteger(0);
            this.f56939b = callback;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b
        /* JADX INFO: renamed from: a */
        public void mo81597a() {
            C13769r.this.f56934b.f56548e.m81893h();
            boolean z = false;
            try {
                try {
                    try {
                        this.f56939b.onResponse(C13769r.this, C13769r.this.m81878a());
                        C13769r.this.f56933a.dispatcher().m81578a(this);
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            C13752c c13752c = C13752c.f56801a;
                            StringBuilder sb = new StringBuilder("Callback failure for ");
                            C13769r c13769r = C13769r.this;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c13769r.f56934b.m81683d() ? "canceled " : "");
                            sb2.append(c13769r.f56936d ? "web socket" : "call");
                            sb2.append(" to ");
                            sb2.append(c13769r.f56935c.url().m81866f());
                            sb.append(sb2.toString());
                            c13752c.mo81788a(4, sb.toString(), e);
                        } else {
                            this.f56939b.onFailure(C13769r.this, e);
                        }
                        C13769r.this.f56933a.dispatcher().m81578a(this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        C13769r.this.f56934b.m81679a();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.addSuppressed(th);
                            this.f56939b.onFailure(C13769r.this, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    C13769r.this.f56933a.dispatcher().m81578a(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX INFO: renamed from: b */
        public String m81880b() {
            return C13769r.this.f56935c.url().f56912d;
        }
    }

    public C13769r(OkHttpClient okHttpClient, Request request, boolean z) {
        this.f56933a = okHttpClient;
        this.f56935c = request;
        this.f56936d = z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    /* JADX INFO: renamed from: a */
    public Response m81878a() throws Throwable {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f56933a.interceptors());
        arrayList.add(new RetryAndFollowUpInterceptor(this.f56933a));
        arrayList.add(new BridgeInterceptor(this.f56933a.cookieJar()));
        arrayList.add(new CacheInterceptor(this.f56933a.f56343k));
        arrayList.add(new ConnectInterceptor(this.f56933a));
        if (!this.f56936d) {
            arrayList.addAll(this.f56933a.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.f56936d));
        try {
            Response responseProceed = new RealInterceptorChain(arrayList, this.f56934b, null, 0, this.f56935c, this, this.f56933a.connectTimeoutMillis(), this.f56933a.readTimeoutMillis(), this.f56933a.writeTimeoutMillis()).proceed(this.f56935c);
            if (this.f56934b.m81683d()) {
                C13706c.m81615a(responseProceed);
                throw new IOException("Canceled");
            }
            this.f56934b.m81677a((IOException) null);
            return responseProceed;
        } catch (IOException e) {
            try {
                throw this.f56934b.m81677a(e);
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f56934b.m81677a((IOException) null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (!z) {
                this.f56934b.m81677a((IOException) null);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m81879b() {
        return this.f56935c.url().m81866f();
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.Call
    public void cancel() {
        this.f56934b.m81679a();
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.Call
    public Call clone() {
        return m81877a(this.f56933a, this.f56935c, this.f56936d);
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.Call
    public void enqueue(Callback callback) {
        a next;
        synchronized (this) {
            if (this.f56937e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f56937e = true;
        }
        C13720j c13720j = this.f56934b;
        c13720j.getClass();
        c13720j.f56549f = C13752c.f56801a.mo81786a("response.body().close()");
        c13720j.f56547d.getClass();
        Dispatcher dispatcher = this.f56933a.dispatcher();
        a aVar = new a(callback);
        synchronized (dispatcher) {
            try {
                dispatcher.f56320e.add(aVar);
                if (!C13769r.this.f56936d) {
                    String strM81880b = aVar.m81880b();
                    Iterator<a> it = dispatcher.f56321f.iterator();
                    do {
                        if (!it.hasNext()) {
                            Iterator<a> it2 = dispatcher.f56320e.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!next.m81880b().equals(strM81880b));
                        } else {
                            next = it.next();
                        }
                    } while (!next.m81880b().equals(strM81880b));
                    if (next != null) {
                        aVar.f56940c = next.f56940c;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        dispatcher.m81580a();
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.Call
    public Response execute() {
        synchronized (this) {
            if (this.f56937e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f56937e = true;
        }
        this.f56934b.f56548e.m81893h();
        C13720j c13720j = this.f56934b;
        c13720j.getClass();
        c13720j.f56549f = C13752c.f56801a.mo81786a("response.body().close()");
        c13720j.f56547d.getClass();
        try {
            Dispatcher dispatcher = this.f56933a.dispatcher();
            synchronized (dispatcher) {
                dispatcher.f56322g.add(this);
            }
            Response responseM81878a = m81878a();
            Dispatcher dispatcher2 = this.f56933a.dispatcher();
            dispatcher2.m81579a(dispatcher2.f56322g, this);
            return responseM81878a;
        } catch (Throwable th) {
            Dispatcher dispatcher3 = this.f56933a.dispatcher();
            dispatcher3.m81579a(dispatcher3.f56322g, this);
            throw th;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.Call
    public boolean isCanceled() {
        return this.f56934b.m81683d();
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.Call
    public synchronized boolean isExecuted() {
        return this.f56937e;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.Call
    public Request request() {
        return this.f56935c;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.Call
    public C13795x timeout() {
        return this.f56934b.f56548e;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public Object m223817clone() {
        return m81877a(this.f56933a, this.f56935c, this.f56936d);
    }

    /* JADX INFO: renamed from: a */
    public static C13769r m81877a(OkHttpClient okHttpClient, Request request, boolean z) {
        C13769r c13769r = new C13769r(okHttpClient, request, z);
        c13769r.f56934b = new C13720j(okHttpClient, c13769r);
        return c13769r;
    }
}
