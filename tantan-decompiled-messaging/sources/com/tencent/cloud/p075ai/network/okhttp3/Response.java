package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13712b;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.C13724c;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13778g;
import java.io.Closeable;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;
import org.eclipse.jetty.http.HttpHeaders;
import p149l.dxc0;
import p149l.hg3;
import p149l.ig3;
import p149l.ock0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes13.dex */
public final class Response implements Closeable {

    /* JADX INFO: renamed from: a */
    public final Request f56373a;

    /* JADX INFO: renamed from: b */
    public final EnumC13768q f56374b;

    /* JADX INFO: renamed from: c */
    public final int f56375c;

    /* JADX INFO: renamed from: d */
    public final String f56376d;

    /* JADX INFO: renamed from: e */
    public final C13765n f56377e;

    /* JADX INFO: renamed from: f */
    public final C13766o f56378f;

    /* JADX INFO: renamed from: g */
    public final ResponseBody f56379g;

    /* JADX INFO: renamed from: h */
    public final Response f56380h;

    /* JADX INFO: renamed from: i */
    public final Response f56381i;

    /* JADX INFO: renamed from: j */
    public final Response f56382j;

    /* JADX INFO: renamed from: k */
    public final long f56383k;

    /* JADX INFO: renamed from: l */
    public final long f56384l;

    /* JADX INFO: renamed from: m */
    public final C13712b f56385m;

    /* JADX INFO: renamed from: n */
    public volatile C13698d f56386n;

    public Response(Builder builder) {
        this.f56373a = builder.request;
        this.f56374b = builder.protocol;
        this.f56375c = builder.code;
        this.f56376d = builder.message;
        this.f56377e = builder.handshake;
        this.f56378f = builder.headers.m81851a();
        this.f56379g = builder.body;
        this.f56380h = builder.networkResponse;
        this.f56381i = builder.cacheResponse;
        this.f56382j = builder.priorResponse;
        this.f56383k = builder.sentRequestAtMillis;
        this.f56384l = builder.receivedResponseAtMillis;
        this.f56385m = builder.exchange;
    }

    public ResponseBody body() {
        return this.f56379g;
    }

    public C13698d cacheControl() {
        C13698d c13698d = this.f56386n;
        if (c13698d != null) {
            return c13698d;
        }
        C13698d c13698dM81590a = C13698d.m81590a(this.f56378f);
        this.f56386n = c13698dM81590a;
        return c13698dM81590a;
    }

    public Response cacheResponse() {
        return this.f56381i;
    }

    public List<C13700f> challenges() {
        String str;
        int i = this.f56375c;
        if (i == 401) {
            str = HttpHeaders.WWW_AUTHENTICATE;
        } else {
            if (i != 407) {
                return Collections.EMPTY_LIST;
            }
            str = HttpHeaders.PROXY_AUTHENTICATE;
        }
        return C13724c.m81704a(headers(), str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.f56379g;
        if (responseBody != null) {
            responseBody.close();
        } else {
            qkq0.m175383a("response is not eligible for a body and must not be closed");
        }
    }

    public int code() {
        return this.f56375c;
    }

    public C13765n handshake() {
        return this.f56377e;
    }

    public String header(String str, String str2) {
        String strM81847b = this.f56378f.m81847b(str);
        return strM81847b != null ? strM81847b : str2;
    }

    public List<String> headers(String str) {
        return this.f56378f.m81848c(str);
    }

    public boolean isRedirect() {
        int i = this.f56375c;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public boolean isSuccessful() {
        int i = this.f56375c;
        return i >= 200 && i < 300;
    }

    public String message() {
        return this.f56376d;
    }

    public Response networkResponse() {
        return this.f56380h;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public ResponseBody peekBody(long j) throws EOFException {
        InterfaceC13778g interfaceC13778gSource = this.f56379g.source();
        C13776e c13776e = new C13776e();
        interfaceC13778gSource.mo81921b(j);
        long jMin = Math.min(j, interfaceC13778gSource.mo81904a().f56970b);
        while (jMin > 0) {
            long jMo81631a = interfaceC13778gSource.mo81631a(c13776e, jMin);
            if (jMo81631a == -1) {
                hg3.m130807a();
                return null;
            }
            jMin -= jMo81631a;
        }
        return ResponseBody.create(this.f56379g.contentType(), c13776e.f56970b, c13776e);
    }

    public Response priorResponse() {
        return this.f56382j;
    }

    public EnumC13768q protocol() {
        return this.f56374b;
    }

    public long receivedResponseAtMillis() {
        return this.f56384l;
    }

    public Request request() {
        return this.f56373a;
    }

    public long sentRequestAtMillis() {
        return this.f56383k;
    }

    public String toString() {
        return "Response{protocol=" + this.f56374b + ", code=" + this.f56375c + ", message=" + this.f56376d + ", url=" + this.f56373a.url() + '}';
    }

    public C13766o trailers() {
        C13712b c13712b = this.f56385m;
        if (c13712b != null) {
            return c13712b.f56481e.mo81692a();
        }
        qkq0.m175383a("trailers not available");
        return null;
    }

    public C13766o headers() {
        return this.f56378f;
    }

    public String header(String str) {
        return header(str, null);
    }

    public static class Builder {
        public ResponseBody body;
        public Response cacheResponse;
        public int code;
        public C13712b exchange;
        public C13765n handshake;
        public C13766o.a headers;
        public String message;
        public Response networkResponse;
        public Response priorResponse;
        public EnumC13768q protocol;
        public long receivedResponseAtMillis;
        public Request request;
        public long sentRequestAtMillis;

        public Builder(Response response) {
            this.code = -1;
            this.request = response.f56373a;
            this.protocol = response.f56374b;
            this.code = response.f56375c;
            this.message = response.f56376d;
            this.handshake = response.f56377e;
            this.headers = response.f56378f.m81843a();
            this.body = response.f56379g;
            this.networkResponse = response.f56380h;
            this.cacheResponse = response.f56381i;
            this.priorResponse = response.f56382j;
            this.sentRequestAtMillis = response.f56383k;
            this.receivedResponseAtMillis = response.f56384l;
            this.exchange = response.f56385m;
        }

        private void checkPriorResponse(Response response) {
            if (response.f56379g == null) {
                return;
            }
            ig3.m135964a("priorResponse.body != null");
        }

        private void checkSupportResponse(String str, Response response) {
            if (response.f56379g != null) {
                ock0.m163533a(str, ".body != null");
                return;
            }
            if (response.f56380h != null) {
                ock0.m163533a(str, ".networkResponse != null");
            } else if (response.f56381i != null) {
                ock0.m163533a(str, ".cacheResponse != null");
            } else {
                if (response.f56382j == null) {
                    return;
                }
                ock0.m163533a(str, ".priorResponse != null");
            }
        }

        public Builder addHeader(String str, String str2) {
            C13766o.a aVar = this.headers;
            aVar.getClass();
            C13766o.m81841a(str);
            C13766o.m81842a(str2, str);
            aVar.f56907a.add(str);
            aVar.f56907a.add(str2.trim());
            return this;
        }

        public Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public Response build() {
            if (this.request == null) {
                qkq0.m175383a("request == null");
                return null;
            }
            if (this.protocol == null) {
                qkq0.m175383a("protocol == null");
                return null;
            }
            if (this.code < 0) {
                dxc0.m114002a("code < 0: ", this.code);
                return null;
            }
            if (this.message != null) {
                return new Response(this);
            }
            qkq0.m175383a("message == null");
            return null;
        }

        public Builder cacheResponse(Response response) {
            if (response != null) {
                checkSupportResponse("cacheResponse", response);
            }
            this.cacheResponse = response;
            return this;
        }

        public Builder code(int i) {
            this.code = i;
            return this;
        }

        public Builder handshake(C13765n c13765n) {
            this.handshake = c13765n;
            return this;
        }

        public Builder header(String str, String str2) {
            C13766o.a aVar = this.headers;
            aVar.getClass();
            C13766o.m81841a(str);
            C13766o.m81842a(str2, str);
            aVar.m81849a(str);
            aVar.f56907a.add(str);
            aVar.f56907a.add(str2.trim());
            return this;
        }

        public Builder headers(C13766o c13766o) {
            this.headers = c13766o.m81843a();
            return this;
        }

        public void initExchange(C13712b c13712b) {
            this.exchange = c13712b;
        }

        public Builder message(String str) {
            this.message = str;
            return this;
        }

        public Builder networkResponse(Response response) {
            if (response != null) {
                checkSupportResponse("networkResponse", response);
            }
            this.networkResponse = response;
            return this;
        }

        public Builder priorResponse(Response response) {
            if (response != null) {
                checkPriorResponse(response);
            }
            this.priorResponse = response;
            return this;
        }

        public Builder protocol(EnumC13768q enumC13768q) {
            this.protocol = enumC13768q;
            return this;
        }

        public Builder receivedResponseAtMillis(long j) {
            this.receivedResponseAtMillis = j;
            return this;
        }

        public Builder removeHeader(String str) {
            this.headers.m81849a(str);
            return this;
        }

        public Builder request(Request request) {
            this.request = request;
            return this;
        }

        public Builder sentRequestAtMillis(long j) {
            this.sentRequestAtMillis = j;
            return this;
        }

        public Builder() {
            this.code = -1;
            this.headers = new C13766o.a();
        }
    }
}
