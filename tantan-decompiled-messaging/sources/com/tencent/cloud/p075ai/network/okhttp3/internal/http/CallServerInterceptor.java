package com.tencent.cloud.p075ai.network.okhttp3.internal.http;

import com.tencent.cloud.p075ai.network.helper.AiOkHttpHelper;
import com.tencent.cloud.p075ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.Response;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13721d;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13712b;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13712b.b;
import com.tencent.cloud.p075ai.network.okio.C13785n;
import com.tencent.cloud.p075ai.network.okio.C13788q;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13777f;
import java.io.IOException;
import java.net.ProtocolException;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes13.dex */
public final class CallServerInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final boolean f56562a;

    public CallServerInterceptor(boolean z) {
        this.f56562a = z;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Throwable {
        Response.Builder builderM81642a;
        boolean z;
        Response responseBuild;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        C13712b c13712bExchange = realInterceptorChain.exchange();
        Request request = realInterceptorChain.request();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c13712bExchange.getClass();
        try {
            if (c13712bExchange.f56479c == null) {
                throw null;
            }
            c13712bExchange.f56481e.mo81694a(request);
            if (c13712bExchange.f56479c == null) {
                throw null;
            }
            if (!C13721d.m81687a(request.method()) || request.body() == null) {
                c13712bExchange.f56477a.m81676a(c13712bExchange, true, false, null);
                builderM81642a = null;
                z = false;
            } else {
                if (HttpHeaderValues.CONTINUE.equalsIgnoreCase(request.header(HttpHeaders.EXPECT))) {
                    try {
                        c13712bExchange.f56481e.mo81696b();
                        c13712bExchange.f56479c.getClass();
                        builderM81642a = c13712bExchange.m81642a(true);
                        z = true;
                    } catch (IOException e) {
                        c13712bExchange.f56479c.getClass();
                        c13712bExchange.m81646a(e);
                        throw e;
                    }
                } else {
                    builderM81642a = null;
                    z = false;
                }
                if (builderM81642a != null) {
                    c13712bExchange.f56477a.m81676a(c13712bExchange, true, false, null);
                    if (!c13712bExchange.f56481e.connection().m81663a()) {
                        c13712bExchange.f56481e.connection().m81666b();
                    }
                } else if (request.body().isDuplex()) {
                    try {
                        c13712bExchange.f56481e.mo81696b();
                        request.body().writeTo(C13785n.m81960a(c13712bExchange.m81644a(request, true)));
                    } catch (IOException e2) {
                        c13712bExchange.f56479c.getClass();
                        c13712bExchange.m81646a(e2);
                        throw e2;
                    }
                } else {
                    InterfaceC13777f interfaceC13777fM81960a = C13785n.m81960a(c13712bExchange.m81644a(request, false));
                    request.body().writeTo(interfaceC13777fM81960a);
                    if (request.body() != null) {
                        AiOkHttpHelper.getInstance().logInfo("current url: " + request.url() + " date size:" + request.body().contentLength());
                    }
                    ((C13788q) interfaceC13777fM81960a).close();
                }
            }
            if (request.body() == null || !request.body().isDuplex()) {
                try {
                    c13712bExchange.f56481e.mo81697c();
                } catch (IOException e3) {
                    c13712bExchange.f56479c.getClass();
                    c13712bExchange.m81646a(e3);
                    throw e3;
                }
            }
            if (!z) {
                c13712bExchange.f56479c.getClass();
            }
            if (builderM81642a == null) {
                builderM81642a = c13712bExchange.m81642a(false);
            }
            Response responseBuild2 = builderM81642a.request(request).handshake(c13712bExchange.f56481e.connection().f56510f).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            int iCode = responseBuild2.code();
            if (iCode == 100) {
                responseBuild2 = c13712bExchange.m81642a(false).request(request).handshake(c13712bExchange.f56481e.connection().f56510f).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                iCode = responseBuild2.code();
            }
            c13712bExchange.f56479c.getClass();
            if (this.f56562a && iCode == 101) {
                responseBuild = responseBuild2.newBuilder().body(C13706c.f56457c).build();
            } else {
                Response.Builder builderNewBuilder = responseBuild2.newBuilder();
                try {
                    if (c13712bExchange.f56479c == null) {
                        throw null;
                    }
                    String strHeader = responseBuild2.header("Content-Type");
                    long jMo81690a = c13712bExchange.f56481e.mo81690a(responseBuild2);
                    responseBuild = builderNewBuilder.body(new C13725d(strHeader, jMo81690a, C13785n.m81961a(c13712bExchange.new b(c13712bExchange.f56481e.mo81695b(responseBuild2), jMo81690a)))).build();
                } catch (IOException e4) {
                    c13712bExchange.f56479c.getClass();
                    c13712bExchange.m81646a(e4);
                    throw e4;
                }
            }
            if ("close".equalsIgnoreCase(responseBuild.request().header("Connection")) || "close".equalsIgnoreCase(responseBuild.header("Connection"))) {
                c13712bExchange.f56481e.connection().m81666b();
            }
            if ((iCode == 204 || iCode == 205) && responseBuild.body().contentLength() > 0) {
                throw new ProtocolException("HTTP " + iCode + " had non-zero Content-Length: " + responseBuild.body().contentLength());
            }
            if (responseBuild.body() != null) {
                AiOkHttpHelper.getInstance().logInfo("response size: " + responseBuild.body().contentLength());
            }
            return responseBuild;
        } catch (IOException e5) {
            c13712bExchange.f56479c.getClass();
            c13712bExchange.m81646a(e5);
            throw e5;
        }
    }
}
