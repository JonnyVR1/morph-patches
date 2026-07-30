package com.tencent.cloud.p080ai.network.okhttp3.internal.http;

import com.tencent.cloud.p080ai.network.okhttp3.C13925k;
import com.tencent.cloud.p080ai.network.okhttp3.C13929o;
import com.tencent.cloud.p080ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p080ai.network.okhttp3.InterfaceC13926l;
import com.tencent.cloud.p080ai.network.okhttp3.MediaType;
import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.RequestBody;
import com.tencent.cloud.p080ai.network.okhttp3.Response;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okio.C13945k;
import com.tencent.cloud.p080ai.network.okio.C13952r;
import java.util.Collections;
import java.util.List;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes12.dex */
public final class BridgeInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13926l f57409a;

    public BridgeInterceptor(InterfaceC13926l interfaceC13926l) {
        this.f57409a = interfaceC13926l;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        boolean z;
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                builderNewBuilder.header("Content-Type", mediaTypeContentType.toString());
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                builderNewBuilder.header("Content-Length", Long.toString(jContentLength));
                builderNewBuilder.removeHeader(HttpHeaders.TRANSFER_ENCODING);
            } else {
                builderNewBuilder.header(HttpHeaders.TRANSFER_ENCODING, HttpHeaderValues.CHUNKED);
                builderNewBuilder.removeHeader("Content-Length");
            }
        }
        if (request.header("Host") == null) {
            builderNewBuilder.header("Host", C13869c.m82786a(request.url(), false));
        }
        if (request.header(HttpHeaders.CONNECTION) == null) {
            builderNewBuilder.header(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        }
        if (request.header(HttpHeaders.ACCEPT_ENCODING) == null && request.header("Range") == null) {
            builderNewBuilder.header(HttpHeaders.ACCEPT_ENCODING, HttpHeaderValues.GZIP);
            z = true;
        } else {
            z = false;
        }
        InterfaceC13926l interfaceC13926l = this.f57409a;
        request.url();
        ((InterfaceC13926l.a) interfaceC13926l).getClass();
        List list = Collections.EMPTY_LIST;
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C13925k c13925k = (C13925k) list.get(i);
                sb.append(c13925k.f57739a);
                sb.append('=');
                sb.append(c13925k.f57740b);
            }
            builderNewBuilder.header(HttpHeaders.COOKIE, sb.toString());
        }
        if (request.header("User-Agent") == null) {
            builderNewBuilder.header("User-Agent", "okhttp/3.14.0");
        }
        Response responseProceed = chain.proceed(builderNewBuilder.build());
        C13887c.m82888a(this.f57409a, request.url(), responseProceed.headers());
        Response.Builder builderRequest = responseProceed.newBuilder().request(request);
        if (z && HttpHeaderValues.GZIP.equalsIgnoreCase(responseProceed.header("Content-Encoding")) && C13887c.m82889b(responseProceed)) {
            C13945k c13945k = new C13945k(responseProceed.body().source());
            builderRequest.headers(new C13929o(responseProceed.headers().m83026a().m83032a("Content-Encoding").m83032a("Content-Length")));
            builderRequest.body(new C13888d(responseProceed.header("Content-Type"), -1L, new C13952r(c13945k)));
        }
        return builderRequest.build();
    }
}
