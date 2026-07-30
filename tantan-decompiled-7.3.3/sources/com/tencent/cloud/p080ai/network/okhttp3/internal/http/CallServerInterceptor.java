package com.tencent.cloud.p080ai.network.okhttp3.internal.http;

import com.tencent.cloud.p080ai.network.helper.AiOkHttpHelper;
import com.tencent.cloud.p080ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.Response;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13884d;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13875b;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13875b.b;
import com.tencent.cloud.p080ai.network.okio.C13948n;
import com.tencent.cloud.p080ai.network.okio.C13951q;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13940f;
import java.io.IOException;
import java.net.ProtocolException;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes12.dex */
public final class CallServerInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final boolean f57410a;

    public CallServerInterceptor(boolean z) {
        this.f57410a = z;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Throwable {
        Response.Builder builderM82825a;
        boolean z;
        Response responseBuild;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        C13875b c13875bExchange = realInterceptorChain.exchange();
        Request request = realInterceptorChain.request();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c13875bExchange.getClass();
        try {
            if (c13875bExchange.f57327c == null) {
                throw null;
            }
            c13875bExchange.f57329e.mo82877a(request);
            if (c13875bExchange.f57327c == null) {
                throw null;
            }
            if (!C13884d.m82870a(request.method()) || request.body() == null) {
                c13875bExchange.f57325a.m82859a(c13875bExchange, true, false, null);
                builderM82825a = null;
                z = false;
            } else {
                if (HttpHeaderValues.CONTINUE.equalsIgnoreCase(request.header(HttpHeaders.EXPECT))) {
                    try {
                        c13875bExchange.f57329e.mo82879b();
                        c13875bExchange.f57327c.getClass();
                        builderM82825a = c13875bExchange.m82825a(true);
                        z = true;
                    } catch (IOException e) {
                        c13875bExchange.f57327c.getClass();
                        c13875bExchange.m82829a(e);
                        throw e;
                    }
                } else {
                    builderM82825a = null;
                    z = false;
                }
                if (builderM82825a != null) {
                    c13875bExchange.f57325a.m82859a(c13875bExchange, true, false, null);
                    if (!c13875bExchange.f57329e.connection().m82846a()) {
                        c13875bExchange.f57329e.connection().m82849b();
                    }
                } else if (request.body().isDuplex()) {
                    try {
                        c13875bExchange.f57329e.mo82879b();
                        request.body().writeTo(C13948n.m83143a(c13875bExchange.m82827a(request, true)));
                    } catch (IOException e2) {
                        c13875bExchange.f57327c.getClass();
                        c13875bExchange.m82829a(e2);
                        throw e2;
                    }
                } else {
                    InterfaceC13940f interfaceC13940fM83143a = C13948n.m83143a(c13875bExchange.m82827a(request, false));
                    request.body().writeTo(interfaceC13940fM83143a);
                    if (request.body() != null) {
                        AiOkHttpHelper.getInstance().logInfo("current url: " + request.url() + " date size:" + request.body().contentLength());
                    }
                    ((C13951q) interfaceC13940fM83143a).close();
                }
            }
            if (request.body() == null || !request.body().isDuplex()) {
                try {
                    c13875bExchange.f57329e.mo82880c();
                } catch (IOException e3) {
                    c13875bExchange.f57327c.getClass();
                    c13875bExchange.m82829a(e3);
                    throw e3;
                }
            }
            if (!z) {
                c13875bExchange.f57327c.getClass();
            }
            if (builderM82825a == null) {
                builderM82825a = c13875bExchange.m82825a(false);
            }
            Response responseBuild2 = builderM82825a.request(request).handshake(c13875bExchange.f57329e.connection().f57358f).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            int iCode = responseBuild2.code();
            if (iCode == 100) {
                responseBuild2 = c13875bExchange.m82825a(false).request(request).handshake(c13875bExchange.f57329e.connection().f57358f).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                iCode = responseBuild2.code();
            }
            c13875bExchange.f57327c.getClass();
            if (this.f57410a && iCode == 101) {
                responseBuild = responseBuild2.newBuilder().body(C13869c.f57305c).build();
            } else {
                Response.Builder builderNewBuilder = responseBuild2.newBuilder();
                try {
                    if (c13875bExchange.f57327c == null) {
                        throw null;
                    }
                    String strHeader = responseBuild2.header("Content-Type");
                    long jMo82873a = c13875bExchange.f57329e.mo82873a(responseBuild2);
                    responseBuild = builderNewBuilder.body(new C13888d(strHeader, jMo82873a, C13948n.m83144a(c13875bExchange.new b(c13875bExchange.f57329e.mo82878b(responseBuild2), jMo82873a)))).build();
                } catch (IOException e4) {
                    c13875bExchange.f57327c.getClass();
                    c13875bExchange.m82829a(e4);
                    throw e4;
                }
            }
            if ("close".equalsIgnoreCase(responseBuild.request().header(HttpHeaders.CONNECTION)) || "close".equalsIgnoreCase(responseBuild.header(HttpHeaders.CONNECTION))) {
                c13875bExchange.f57329e.connection().m82849b();
            }
            if ((iCode == 204 || iCode == 205) && responseBuild.body().contentLength() > 0) {
                throw new ProtocolException("HTTP " + iCode + " had non-zero Content-Length: " + responseBuild.body().contentLength());
            }
            if (responseBuild.body() != null) {
                AiOkHttpHelper.getInstance().logInfo("response size: " + responseBuild.body().contentLength());
            }
            return responseBuild;
        } catch (IOException e5) {
            c13875bExchange.f57327c.getClass();
            c13875bExchange.m82829a(e5);
            throw e5;
        }
    }
}
