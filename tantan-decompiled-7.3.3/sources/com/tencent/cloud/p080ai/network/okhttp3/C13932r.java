package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.cache.CacheInterceptor;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13883j;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.ConnectInterceptor;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.BridgeInterceptor;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.CallServerInterceptor;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.RealInterceptorChain;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.RetryAndFollowUpInterceptor;
import com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c;
import com.tencent.cloud.p080ai.network.okio.C13958x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.r */
/* JADX INFO: loaded from: classes12.dex */
public final class C13932r implements Call {

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f57781a;

    /* JADX INFO: renamed from: b */
    public C13883j f57782b;

    /* JADX INFO: renamed from: c */
    public final Request f57783c;

    /* JADX INFO: renamed from: d */
    public final boolean f57784d;

    /* JADX INFO: renamed from: e */
    public boolean f57785e;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.r$a */
    public final class a extends AbstractRunnableC13868b {

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ boolean f57786e = true;

        /* JADX INFO: renamed from: b */
        public final Callback f57787b;

        /* JADX INFO: renamed from: c */
        public volatile AtomicInteger f57788c;

        public a(Callback callback) {
            super("OkHttp %s", C13932r.this.m83062b());
            this.f57788c = new AtomicInteger(0);
            this.f57787b = callback;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b
        /* JADX INFO: renamed from: a */
        public void mo82780a() {
            C13932r.this.f57782b.f57396e.m83076h();
            boolean z = false;
            try {
                try {
                    try {
                        this.f57787b.onResponse(C13932r.this, C13932r.this.m83061a());
                        C13932r.this.f57781a.dispatcher().m82761a(this);
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            C13915c c13915c = C13915c.f57649a;
                            StringBuilder sb = new StringBuilder("Callback failure for ");
                            C13932r c13932r = C13932r.this;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c13932r.f57782b.m82866d() ? "canceled " : "");
                            sb2.append(c13932r.f57784d ? "web socket" : "call");
                            sb2.append(" to ");
                            sb2.append(c13932r.f57783c.url().m83049f());
                            sb.append(sb2.toString());
                            c13915c.mo82971a(4, sb.toString(), e);
                        } else {
                            this.f57787b.onFailure(C13932r.this, e);
                        }
                        C13932r.this.f57781a.dispatcher().m82761a(this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        C13932r.this.f57782b.m82862a();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.addSuppressed(th);
                            this.f57787b.onFailure(C13932r.this, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    C13932r.this.f57781a.dispatcher().m82761a(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX INFO: renamed from: b */
        public String m83063b() {
            return C13932r.this.f57783c.url().f57760d;
        }
    }

    public C13932r(OkHttpClient okHttpClient, Request request, boolean z) {
        this.f57781a = okHttpClient;
        this.f57783c = request;
        this.f57784d = z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    /* JADX INFO: renamed from: a */
    public Response m83061a() throws Throwable {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f57781a.interceptors());
        arrayList.add(new RetryAndFollowUpInterceptor(this.f57781a));
        arrayList.add(new BridgeInterceptor(this.f57781a.cookieJar()));
        arrayList.add(new CacheInterceptor(this.f57781a.f57191k));
        arrayList.add(new ConnectInterceptor(this.f57781a));
        if (!this.f57784d) {
            arrayList.addAll(this.f57781a.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.f57784d));
        try {
            Response responseProceed = new RealInterceptorChain(arrayList, this.f57782b, null, 0, this.f57783c, this, this.f57781a.connectTimeoutMillis(), this.f57781a.readTimeoutMillis(), this.f57781a.writeTimeoutMillis()).proceed(this.f57783c);
            if (this.f57782b.m82866d()) {
                C13869c.m82798a(responseProceed);
                throw new IOException("Canceled");
            }
            this.f57782b.m82860a((IOException) null);
            return responseProceed;
        } catch (IOException e) {
            try {
                throw this.f57782b.m82860a(e);
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f57782b.m82860a((IOException) null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (!z) {
                this.f57782b.m82860a((IOException) null);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m83062b() {
        return this.f57783c.url().m83049f();
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.Call
    public void cancel() {
        this.f57782b.m82862a();
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.Call
    public Call clone() {
        return m83060a(this.f57781a, this.f57783c, this.f57784d);
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.Call
    public void enqueue(Callback callback) {
        a next;
        synchronized (this) {
            if (this.f57785e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f57785e = true;
        }
        C13883j c13883j = this.f57782b;
        c13883j.getClass();
        c13883j.f57397f = C13915c.f57649a.mo82969a("response.body().close()");
        c13883j.f57395d.getClass();
        Dispatcher dispatcher = this.f57781a.dispatcher();
        a aVar = new a(callback);
        synchronized (dispatcher) {
            try {
                dispatcher.f57168e.add(aVar);
                if (!C13932r.this.f57784d) {
                    String strM83063b = aVar.m83063b();
                    Iterator<a> it = dispatcher.f57169f.iterator();
                    do {
                        if (!it.hasNext()) {
                            Iterator<a> it2 = dispatcher.f57168e.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!next.m83063b().equals(strM83063b));
                        } else {
                            next = it.next();
                        }
                    } while (!next.m83063b().equals(strM83063b));
                    if (next != null) {
                        aVar.f57788c = next.f57788c;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        dispatcher.m82763a();
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.Call
    public Response execute() {
        synchronized (this) {
            if (this.f57785e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f57785e = true;
        }
        this.f57782b.f57396e.m83076h();
        C13883j c13883j = this.f57782b;
        c13883j.getClass();
        c13883j.f57397f = C13915c.f57649a.mo82969a("response.body().close()");
        c13883j.f57395d.getClass();
        try {
            Dispatcher dispatcher = this.f57781a.dispatcher();
            synchronized (dispatcher) {
                dispatcher.f57170g.add(this);
            }
            Response responseM83061a = m83061a();
            Dispatcher dispatcher2 = this.f57781a.dispatcher();
            dispatcher2.m82762a(dispatcher2.f57170g, this);
            return responseM83061a;
        } catch (Throwable th) {
            Dispatcher dispatcher3 = this.f57781a.dispatcher();
            dispatcher3.m82762a(dispatcher3.f57170g, this);
            throw th;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.Call
    public boolean isCanceled() {
        return this.f57782b.m82866d();
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.Call
    public synchronized boolean isExecuted() {
        return this.f57785e;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.Call
    public Request request() {
        return this.f57783c;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.Call
    public C13958x timeout() {
        return this.f57782b.f57396e;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public Object m225063clone() {
        return m83060a(this.f57781a, this.f57783c, this.f57784d);
    }

    /* JADX INFO: renamed from: a */
    public static C13932r m83060a(OkHttpClient okHttpClient, Request request, boolean z) {
        C13932r c13932r = new C13932r(okHttpClient, request, z);
        c13932r.f57782b = new C13883j(okHttpClient, c13932r);
        return c13932r;
    }
}
