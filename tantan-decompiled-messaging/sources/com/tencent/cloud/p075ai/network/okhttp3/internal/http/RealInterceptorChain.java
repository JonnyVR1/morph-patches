package com.tencent.cloud.p075ai.network.okhttp3.internal.http;

import com.tencent.cloud.p075ai.network.okhttp3.Call;
import com.tencent.cloud.p075ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p075ai.network.okhttp3.InterfaceC13702h;
import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.Response;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13712b;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13720j;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p149l.mxk;
import p149l.ohg0;
import p149l.r2j;
import p149l.shg0;
import p149l.xjw;

/* JADX INFO: loaded from: classes13.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* JADX INFO: renamed from: a */
    public final List<Interceptor> f56563a;

    /* JADX INFO: renamed from: b */
    public final C13720j f56564b;

    /* JADX INFO: renamed from: c */
    public final C13712b f56565c;

    /* JADX INFO: renamed from: d */
    public final int f56566d;

    /* JADX INFO: renamed from: e */
    public final Request f56567e;

    /* JADX INFO: renamed from: f */
    public final Call f56568f;

    /* JADX INFO: renamed from: g */
    public final int f56569g;

    /* JADX INFO: renamed from: h */
    public final int f56570h;

    /* JADX INFO: renamed from: i */
    public final int f56571i;

    /* JADX INFO: renamed from: j */
    public int f56572j;

    public RealInterceptorChain(List<Interceptor> list, C13720j c13720j, C13712b c13712b, int i, Request request, Call call, int i2, int i3, int i4) {
        this.f56563a = list;
        this.f56564b = c13720j;
        this.f56565c = c13712b;
        this.f56566d = i;
        this.f56567e = request;
        this.f56568f = call;
        this.f56569g = i2;
        this.f56570h = i3;
        this.f56571i = i4;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public Call call() {
        return this.f56568f;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
        return this.f56569g;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public InterfaceC13702h connection() {
        C13712b c13712b = this.f56565c;
        if (c13712b != null) {
            return c13712b.f56481e.connection();
        }
        return null;
    }

    public C13712b exchange() {
        C13712b c13712b = this.f56565c;
        if (c13712b != null) {
            return c13712b;
        }
        ohg0.m164364a();
        return null;
    }

    public Response proceed(Request request, C13720j c13720j, C13712b c13712b) {
        if (this.f56566d >= this.f56563a.size()) {
            shg0.m184191a();
            return null;
        }
        this.f56572j++;
        C13712b c13712b2 = this.f56565c;
        if (c13712b2 != null && !c13712b2.f56481e.connection().m81664a(request.url())) {
            r2j.m177608a("network interceptor ", this.f56563a.get(this.f56566d - 1), " must retain the same host and port");
            return null;
        }
        if (this.f56565c != null && this.f56572j > 1) {
            r2j.m177608a("network interceptor ", this.f56563a.get(this.f56566d - 1), " must call proceed() exactly once");
            return null;
        }
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.f56563a, c13720j, c13712b, this.f56566d + 1, request, this.f56568f, this.f56569g, this.f56570h, this.f56571i);
        Interceptor interceptor = this.f56563a.get(this.f56566d);
        Response responseIntercept = interceptor.intercept(realInterceptorChain);
        if (c13712b != null && this.f56566d + 1 < this.f56563a.size() && realInterceptorChain.f56572j != 1) {
            xjw.m209754a("network interceptor ", interceptor, " must call proceed() exactly once");
            return null;
        }
        if (responseIntercept == null) {
            mxk.m156912a("interceptor ", interceptor, " returned null");
            return null;
        }
        if (responseIntercept.body() != null) {
            return responseIntercept;
        }
        xjw.m209754a("interceptor ", interceptor, " returned a response with no body");
        return null;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.f56570h;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public Request request() {
        return this.f56567e;
    }

    public C13720j transmitter() {
        return this.f56564b;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public Interceptor.Chain withConnectTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.f56563a, this.f56564b, this.f56565c, this.f56566d, this.f56567e, this.f56568f, C13706c.m81601a("timeout", i, timeUnit), this.f56570h, this.f56571i);
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public Interceptor.Chain withReadTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.f56563a, this.f56564b, this.f56565c, this.f56566d, this.f56567e, this.f56568f, this.f56569g, C13706c.m81601a("timeout", i, timeUnit), this.f56571i);
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public Interceptor.Chain withWriteTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.f56563a, this.f56564b, this.f56565c, this.f56566d, this.f56567e, this.f56568f, this.f56569g, this.f56570h, C13706c.m81601a("timeout", i, timeUnit));
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.f56571i;
    }

    @Override // com.tencent.cloud.ai.network.okhttp3.Interceptor.Chain
    public Response proceed(Request request) {
        return proceed(request, this.f56564b, this.f56565c);
    }
}
