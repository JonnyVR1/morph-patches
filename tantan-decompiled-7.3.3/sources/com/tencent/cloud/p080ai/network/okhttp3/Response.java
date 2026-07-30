package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13875b;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.C13887c;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13941g;
import java.io.Closeable;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;
import org.eclipse.jetty.http.HttpHeaders;
import p153l.h5d0;
import p153l.ulk0;
import p153l.vg3;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes12.dex */
public final class Response implements Closeable {

    /* JADX INFO: renamed from: a */
    public final Request f57221a;

    /* JADX INFO: renamed from: b */
    public final EnumC13931q f57222b;

    /* JADX INFO: renamed from: c */
    public final int f57223c;

    /* JADX INFO: renamed from: d */
    public final String f57224d;

    /* JADX INFO: renamed from: e */
    public final C13928n f57225e;

    /* JADX INFO: renamed from: f */
    public final C13929o f57226f;

    /* JADX INFO: renamed from: g */
    public final ResponseBody f57227g;

    /* JADX INFO: renamed from: h */
    public final Response f57228h;

    /* JADX INFO: renamed from: i */
    public final Response f57229i;

    /* JADX INFO: renamed from: j */
    public final Response f57230j;

    /* JADX INFO: renamed from: k */
    public final long f57231k;

    /* JADX INFO: renamed from: l */
    public final long f57232l;

    /* JADX INFO: renamed from: m */
    public final C13875b f57233m;

    /* JADX INFO: renamed from: n */
    public volatile C13861d f57234n;

    public Response(Builder builder) {
        this.f57221a = builder.request;
        this.f57222b = builder.protocol;
        this.f57223c = builder.code;
        this.f57224d = builder.message;
        this.f57225e = builder.handshake;
        this.f57226f = builder.headers.m83034a();
        this.f57227g = builder.body;
        this.f57228h = builder.networkResponse;
        this.f57229i = builder.cacheResponse;
        this.f57230j = builder.priorResponse;
        this.f57231k = builder.sentRequestAtMillis;
        this.f57232l = builder.receivedResponseAtMillis;
        this.f57233m = builder.exchange;
    }

    public ResponseBody body() {
        return this.f57227g;
    }

    public C13861d cacheControl() {
        C13861d c13861d = this.f57234n;
        if (c13861d != null) {
            return c13861d;
        }
        C13861d c13861dM82773a = C13861d.m82773a(this.f57226f);
        this.f57234n = c13861dM82773a;
        return c13861dM82773a;
    }

    public Response cacheResponse() {
        return this.f57229i;
    }

    public List<C13863f> challenges() {
        String str;
        int i = this.f57223c;
        if (i == 401) {
            str = HttpHeaders.WWW_AUTHENTICATE;
        } else {
            if (i != 407) {
                return Collections.EMPTY_LIST;
            }
            str = HttpHeaders.PROXY_AUTHENTICATE;
        }
        return C13887c.m82887a(headers(), str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.f57227g;
        if (responseBody != null) {
            responseBody.close();
        } else {
            wtq0.m207906a("response is not eligible for a body and must not be closed");
        }
    }

    public int code() {
        return this.f57223c;
    }

    public C13928n handshake() {
        return this.f57225e;
    }

    public String header(String str, String str2) {
        String strM83030b = this.f57226f.m83030b(str);
        return strM83030b != null ? strM83030b : str2;
    }

    public List<String> headers(String str) {
        return this.f57226f.m83031c(str);
    }

    public boolean isRedirect() {
        int i = this.f57223c;
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
        int i = this.f57223c;
        return i >= 200 && i < 300;
    }

    public String message() {
        return this.f57224d;
    }

    public Response networkResponse() {
        return this.f57228h;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public ResponseBody peekBody(long j) throws EOFException {
        InterfaceC13941g interfaceC13941gSource = this.f57227g.source();
        C13939e c13939e = new C13939e();
        interfaceC13941gSource.mo83104b(j);
        long jMin = Math.min(j, interfaceC13941gSource.mo83087a().f57818b);
        while (jMin > 0) {
            long jMo82814a = interfaceC13941gSource.mo82814a(c13939e, jMin);
            if (jMo82814a == -1) {
                vg3.m201207a();
                return null;
            }
            jMin -= jMo82814a;
        }
        return ResponseBody.create(this.f57227g.contentType(), c13939e.f57818b, c13939e);
    }

    public Response priorResponse() {
        return this.f57230j;
    }

    public EnumC13931q protocol() {
        return this.f57222b;
    }

    public long receivedResponseAtMillis() {
        return this.f57232l;
    }

    public Request request() {
        return this.f57221a;
    }

    public long sentRequestAtMillis() {
        return this.f57231k;
    }

    public String toString() {
        return "Response{protocol=" + this.f57222b + ", code=" + this.f57223c + ", message=" + this.f57224d + ", url=" + this.f57221a.url() + '}';
    }

    public C13929o trailers() {
        C13875b c13875b = this.f57233m;
        if (c13875b != null) {
            return c13875b.f57329e.mo82875a();
        }
        wtq0.m207906a("trailers not available");
        return null;
    }

    public C13929o headers() {
        return this.f57226f;
    }

    public String header(String str) {
        return header(str, null);
    }

    public static class Builder {
        public ResponseBody body;
        public Response cacheResponse;
        public int code;
        public C13875b exchange;
        public C13928n handshake;
        public C13929o.a headers;
        public String message;
        public Response networkResponse;
        public Response priorResponse;
        public EnumC13931q protocol;
        public long receivedResponseAtMillis;
        public Request request;
        public long sentRequestAtMillis;

        public Builder(Response response) {
            this.code = -1;
            this.request = response.f57221a;
            this.protocol = response.f57222b;
            this.code = response.f57223c;
            this.message = response.f57224d;
            this.handshake = response.f57225e;
            this.headers = response.f57226f.m83026a();
            this.body = response.f57227g;
            this.networkResponse = response.f57228h;
            this.cacheResponse = response.f57229i;
            this.priorResponse = response.f57230j;
            this.sentRequestAtMillis = response.f57231k;
            this.receivedResponseAtMillis = response.f57232l;
            this.exchange = response.f57233m;
        }

        private void checkPriorResponse(Response response) {
            if (response.f57227g == null) {
                return;
            }
            wg3.m206174a("priorResponse.body != null");
        }

        private void checkSupportResponse(String str, Response response) {
            if (response.f57227g != null) {
                ulk0.m196558a(str, ".body != null");
                return;
            }
            if (response.f57228h != null) {
                ulk0.m196558a(str, ".networkResponse != null");
            } else if (response.f57229i != null) {
                ulk0.m196558a(str, ".cacheResponse != null");
            } else {
                if (response.f57230j == null) {
                    return;
                }
                ulk0.m196558a(str, ".priorResponse != null");
            }
        }

        public Builder addHeader(String str, String str2) {
            C13929o.a aVar = this.headers;
            aVar.getClass();
            C13929o.m83024a(str);
            C13929o.m83025a(str2, str);
            aVar.f57755a.add(str);
            aVar.f57755a.add(str2.trim());
            return this;
        }

        public Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public Response build() {
            if (this.request == null) {
                wtq0.m207906a("request == null");
                return null;
            }
            if (this.protocol == null) {
                wtq0.m207906a("protocol == null");
                return null;
            }
            if (this.code < 0) {
                h5d0.m133654a("code < 0: ", this.code);
                return null;
            }
            if (this.message != null) {
                return new Response(this);
            }
            wtq0.m207906a("message == null");
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

        public Builder handshake(C13928n c13928n) {
            this.handshake = c13928n;
            return this;
        }

        public Builder header(String str, String str2) {
            C13929o.a aVar = this.headers;
            aVar.getClass();
            C13929o.m83024a(str);
            C13929o.m83025a(str2, str);
            aVar.m83032a(str);
            aVar.f57755a.add(str);
            aVar.f57755a.add(str2.trim());
            return this;
        }

        public Builder headers(C13929o c13929o) {
            this.headers = c13929o.m83026a();
            return this;
        }

        public void initExchange(C13875b c13875b) {
            this.exchange = c13875b;
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

        public Builder protocol(EnumC13931q enumC13931q) {
            this.protocol = enumC13931q;
            return this;
        }

        public Builder receivedResponseAtMillis(long j) {
            this.receivedResponseAtMillis = j;
            return this;
        }

        public Builder removeHeader(String str) {
            this.headers.m83032a(str);
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
            this.headers = new C13929o.a();
        }
    }
}
