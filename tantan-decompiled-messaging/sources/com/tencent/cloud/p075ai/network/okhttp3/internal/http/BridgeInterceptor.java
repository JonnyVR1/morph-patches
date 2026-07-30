package com.tencent.cloud.p075ai.network.okhttp3.internal.http;

import com.tencent.cloud.p075ai.network.okhttp3.C13762k;
import com.tencent.cloud.p075ai.network.okhttp3.C13766o;
import com.tencent.cloud.p075ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p075ai.network.okhttp3.InterfaceC13763l;
import com.tencent.cloud.p075ai.network.okhttp3.MediaType;
import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.RequestBody;
import com.tencent.cloud.p075ai.network.okhttp3.Response;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okio.C13782k;
import com.tencent.cloud.p075ai.network.okio.C13789r;
import java.util.Collections;
import java.util.List;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes13.dex */
public final class BridgeInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13763l f56561a;

    public BridgeInterceptor(InterfaceC13763l interfaceC13763l) {
        this.f56561a = interfaceC13763l;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.Interceptor
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
            builderNewBuilder.header("Host", C13706c.m81603a(request.url(), false));
        }
        if (request.header("Connection") == null) {
            builderNewBuilder.header("Connection", HttpHeaders.KEEP_ALIVE);
        }
        if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
            builderNewBuilder.header("Accept-Encoding", HttpHeaderValues.GZIP);
            z = true;
        } else {
            z = false;
        }
        InterfaceC13763l interfaceC13763l = this.f56561a;
        request.url();
        ((InterfaceC13763l.a) interfaceC13763l).getClass();
        List list = Collections.EMPTY_LIST;
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C13762k c13762k = (C13762k) list.get(i);
                sb.append(c13762k.f56891a);
                sb.append('=');
                sb.append(c13762k.f56892b);
            }
            builderNewBuilder.header("Cookie", sb.toString());
        }
        if (request.header("User-Agent") == null) {
            builderNewBuilder.header("User-Agent", "okhttp/3.14.0");
        }
        Response responseProceed = chain.proceed(builderNewBuilder.build());
        C13724c.m81705a(this.f56561a, request.url(), responseProceed.headers());
        Response.Builder builderRequest = responseProceed.newBuilder().request(request);
        if (z && HttpHeaderValues.GZIP.equalsIgnoreCase(responseProceed.header("Content-Encoding")) && C13724c.m81706b(responseProceed)) {
            C13782k c13782k = new C13782k(responseProceed.body().source());
            builderRequest.headers(new C13766o(responseProceed.headers().m81843a().m81849a("Content-Encoding").m81849a("Content-Length")));
            builderRequest.body(new C13725d(responseProceed.header("Content-Type"), -1L, new C13789r(c13782k)));
        }
        return builderRequest.build();
    }
}
