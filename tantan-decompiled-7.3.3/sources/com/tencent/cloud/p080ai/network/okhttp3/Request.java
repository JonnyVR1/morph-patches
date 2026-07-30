package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13884d;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.util.URIUtil;
import p153l.mnd0;
import p153l.v1d0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes12.dex */
public final class Request {

    /* JADX INFO: renamed from: a */
    public final C13930p f57207a;

    /* JADX INFO: renamed from: b */
    public final String f57208b;

    /* JADX INFO: renamed from: c */
    public final C13929o f57209c;

    /* JADX INFO: renamed from: d */
    public final RequestBody f57210d;

    /* JADX INFO: renamed from: e */
    public final Map<Class<?>, Object> f57211e;

    /* JADX INFO: renamed from: f */
    public volatile C13861d f57212f;

    public Request(Builder builder) {
        this.f57207a = builder.url;
        this.f57208b = builder.method;
        this.f57209c = builder.headers.m83034a();
        this.f57210d = builder.body;
        this.f57211e = C13869c.m82794a(builder.tags);
    }

    public RequestBody body() {
        return this.f57210d;
    }

    public C13861d cacheControl() {
        C13861d c13861d = this.f57212f;
        if (c13861d != null) {
            return c13861d;
        }
        C13861d c13861dM82773a = C13861d.m82773a(this.f57209c);
        this.f57212f = c13861dM82773a;
        return c13861dM82773a;
    }

    public String header(String str) {
        return this.f57209c.m83030b(str);
    }

    public List<String> headers(String str) {
        return this.f57209c.m83031c(str);
    }

    public boolean isHttps() {
        return this.f57207a.f57757a.equals("https");
    }

    public String method() {
        return this.f57208b;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public <T> T tag(Class<? extends T> cls) {
        return cls.cast(this.f57211e.get(cls));
    }

    public String toString() {
        return "Request{method=" + this.f57208b + ", url=" + this.f57207a + ", tags=" + this.f57211e + '}';
    }

    public C13930p url() {
        return this.f57207a;
    }

    public static class Builder {
        public RequestBody body;
        public C13929o.a headers;
        public String method;
        public Map<Class<?>, Object> tags;
        public C13930p url;

        public Builder(Request request) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.tags = map;
            this.url = request.f57207a;
            this.method = request.f57208b;
            this.body = request.f57210d;
            this.tags = request.f57211e.isEmpty() ? map : new LinkedHashMap<>(request.f57211e);
            this.headers = request.f57209c.m83026a();
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

        public Request build() {
            if (this.url != null) {
                return new Request(this);
            }
            wtq0.m207906a("url == null");
            return null;
        }

        public Builder cacheControl(C13861d c13861d) {
            String string = c13861d.toString();
            return string.isEmpty() ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public Builder delete(RequestBody requestBody) {
            return method(HttpMethods.DELETE, requestBody);
        }

        public Builder get() {
            return method("GET", null);
        }

        public Builder head() {
            return method(HttpMethods.HEAD, null);
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

        public Builder method(String str, RequestBody requestBody) {
            if (str == null) {
                mnd0.m159157a("method == null");
                return null;
            }
            if (str.length() == 0) {
                wg3.m206174a("method.length() == 0");
                return null;
            }
            if (requestBody != null && !C13884d.m82870a(str)) {
                v1d0.m199002a("method ", str, " must not have a request body.");
                return null;
            }
            if (requestBody == null && (str.equals("POST") || str.equals(HttpMethods.PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
                v1d0.m199002a("method ", str, " must have a request body.");
                return null;
            }
            this.method = str;
            this.body = requestBody;
            return this;
        }

        public Builder patch(RequestBody requestBody) {
            return method("PATCH", requestBody);
        }

        public Builder post(RequestBody requestBody) {
            return method("POST", requestBody);
        }

        public Builder put(RequestBody requestBody) {
            return method(HttpMethods.PUT, requestBody);
        }

        public Builder removeHeader(String str) {
            this.headers.m83032a(str);
            return this;
        }

        public <T> Builder tag(Class<? super T> cls, T t) {
            if (cls == null) {
                mnd0.m159157a("type == null");
                return null;
            }
            Map<Class<?>, Object> map = this.tags;
            if (t == null) {
                map.remove(cls);
                return this;
            }
            if (map.isEmpty()) {
                this.tags = new LinkedHashMap();
            }
            this.tags.put(cls, cls.cast(t));
            return this;
        }

        public Builder url(String str) {
            String strConcat;
            if (str == null) {
                mnd0.m159157a("url == null");
                return null;
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                strConcat = URIUtil.HTTP_COLON.concat(str.substring(3));
            } else {
                strConcat = str.regionMatches(true, 0, "wss:", 0, 4) ? URIUtil.HTTPS_COLON.concat(str.substring(4)) : str;
            }
            return url(new C13930p.a().m83053a(null, strConcat).m83055a());
        }

        public Builder delete() {
            return delete(C13869c.f57306d);
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder() {
            this.tags = Collections.EMPTY_MAP;
            this.method = "GET";
            this.headers = new C13929o.a();
        }

        public Builder url(C13930p c13930p) {
            if (c13930p != null) {
                this.url = c13930p;
                return this;
            }
            mnd0.m159157a("url == null");
            return null;
        }

        public Builder url(URL url) {
            if (url != null) {
                return url(new C13930p.a().m83053a(null, url.toString()).m83055a());
            }
            mnd0.m159157a("url == null");
            return null;
        }
    }

    public C13929o headers() {
        return this.f57209c;
    }

    public Object tag() {
        return tag(Object.class);
    }
}
