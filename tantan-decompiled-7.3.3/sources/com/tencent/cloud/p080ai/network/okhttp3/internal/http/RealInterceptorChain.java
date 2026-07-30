package com.tencent.cloud.p080ai.network.okhttp3.internal.http;

import com.tencent.cloud.p080ai.network.okhttp3.Call;
import com.tencent.cloud.p080ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p080ai.network.okhttp3.InterfaceC13865h;
import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.Response;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13875b;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13883j;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p153l.aqg0;
import p153l.c0l;
import p153l.m5j;
import p153l.wmw;
import p153l.wpg0;

/* JADX INFO: loaded from: classes12.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* JADX INFO: renamed from: a */
    public final List<Interceptor> f57411a;

    /* JADX INFO: renamed from: b */
    public final C13883j f57412b;

    /* JADX INFO: renamed from: c */
    public final C13875b f57413c;

    /* JADX INFO: renamed from: d */
    public final int f57414d;

    /* JADX INFO: renamed from: e */
    public final Request f57415e;

    /* JADX INFO: renamed from: f */
    public final Call f57416f;

    /* JADX INFO: renamed from: g */
    public final int f57417g;

    /* JADX INFO: renamed from: h */
    public final int f57418h;

    /* JADX INFO: renamed from: i */
    public final int f57419i;

    /* JADX INFO: renamed from: j */
    public int f57420j;

    public RealInterceptorChain(List<Interceptor> list, C13883j c13883j, C13875b c13875b, int i, Request request, Call call, int i2, int i3, int i4) {
        this.f57411a = list;
        this.f57412b = c13883j;
        this.f57413c = c13875b;
        this.f57414d = i;
        this.f57415e = request;
        this.f57416f = call;
        this.f57417g = i2;
        this.f57418h = i3;
        this.f57419i = i4;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public Call call() {
        return this.f57416f;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
        return this.f57417g;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public InterfaceC13865h connection() {
        C13875b c13875b = this.f57413c;
        if (c13875b != null) {
            return c13875b.f57329e.connection();
        }
        return null;
    }

    public C13875b exchange() {
        C13875b c13875b = this.f57413c;
        if (c13875b != null) {
            return c13875b;
        }
        wpg0.m207458a();
        return null;
    }

    public Response proceed(Request request, C13883j c13883j, C13875b c13875b) {
        if (this.f57414d >= this.f57411a.size()) {
            aqg0.m99478a();
            return null;
        }
        this.f57420j++;
        C13875b c13875b2 = this.f57413c;
        if (c13875b2 != null && !c13875b2.f57329e.connection().m82847a(request.url())) {
            m5j.m157106a("network interceptor ", this.f57411a.get(this.f57414d - 1), " must retain the same host and port");
            return null;
        }
        if (this.f57413c != null && this.f57420j > 1) {
            m5j.m157106a("network interceptor ", this.f57411a.get(this.f57414d - 1), " must call proceed() exactly once");
            return null;
        }
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.f57411a, c13883j, c13875b, this.f57414d + 1, request, this.f57416f, this.f57417g, this.f57418h, this.f57419i);
        Interceptor interceptor = this.f57411a.get(this.f57414d);
        Response responseIntercept = interceptor.intercept(realInterceptorChain);
        if (c13875b != null && this.f57414d + 1 < this.f57411a.size() && realInterceptorChain.f57420j != 1) {
            wmw.m207134a("network interceptor ", interceptor, " must call proceed() exactly once");
            return null;
        }
        if (responseIntercept == null) {
            c0l.m107429a("interceptor ", interceptor, " returned null");
            return null;
        }
        if (responseIntercept.body() != null) {
            return responseIntercept;
        }
        wmw.m207134a("interceptor ", interceptor, " returned a response with no body");
        return null;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.f57418h;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public Request request() {
        return this.f57415e;
    }

    public C13883j transmitter() {
        return this.f57412b;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public Interceptor.Chain withConnectTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.f57411a, this.f57412b, this.f57413c, this.f57414d, this.f57415e, this.f57416f, C13869c.m82784a("timeout", i, timeUnit), this.f57418h, this.f57419i);
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public Interceptor.Chain withReadTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.f57411a, this.f57412b, this.f57413c, this.f57414d, this.f57415e, this.f57416f, this.f57417g, C13869c.m82784a("timeout", i, timeUnit), this.f57419i);
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public Interceptor.Chain withWriteTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.f57411a, this.f57412b, this.f57413c, this.f57414d, this.f57415e, this.f57416f, this.f57417g, this.f57418h, C13869c.m82784a("timeout", i, timeUnit));
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.f57419i;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public Response proceed(Request request) {
        return proceed(request, this.f57412b, this.f57413c);
    }
}
