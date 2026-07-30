package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13721d;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.util.URIUtil;
import p149l.ig3;
import p149l.jfd0;
import p149l.qkq0;
import p149l.qtc0;

/* JADX INFO: loaded from: classes13.dex */
public final class Request {

    /* JADX INFO: renamed from: a */
    public final C13767p f56359a;

    /* JADX INFO: renamed from: b */
    public final String f56360b;

    /* JADX INFO: renamed from: c */
    public final C13766o f56361c;

    /* JADX INFO: renamed from: d */
    public final RequestBody f56362d;

    /* JADX INFO: renamed from: e */
    public final Map<Class<?>, Object> f56363e;

    /* JADX INFO: renamed from: f */
    public volatile C13698d f56364f;

    public Request(Builder builder) {
        this.f56359a = builder.url;
        this.f56360b = builder.method;
        this.f56361c = builder.headers.m81851a();
        this.f56362d = builder.body;
        this.f56363e = C13706c.m81611a(builder.tags);
    }

    public RequestBody body() {
        return this.f56362d;
    }

    public C13698d cacheControl() {
        C13698d c13698d = this.f56364f;
        if (c13698d != null) {
            return c13698d;
        }
        C13698d c13698dM81590a = C13698d.m81590a(this.f56361c);
        this.f56364f = c13698dM81590a;
        return c13698dM81590a;
    }

    public String header(String str) {
        return this.f56361c.m81847b(str);
    }

    public List<String> headers(String str) {
        return this.f56361c.m81848c(str);
    }

    public boolean isHttps() {
        return this.f56359a.f56909a.equals("https");
    }

    public String method() {
        return this.f56360b;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public <T> T tag(Class<? extends T> cls) {
        return cls.cast(this.f56363e.get(cls));
    }

    public String toString() {
        return "Request{method=" + this.f56360b + ", url=" + this.f56359a + ", tags=" + this.f56363e + '}';
    }

    public C13767p url() {
        return this.f56359a;
    }

    public static class Builder {
        public RequestBody body;
        public C13766o.a headers;
        public String method;
        public Map<Class<?>, Object> tags;
        public C13767p url;

        public Builder(Request request) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.tags = map;
            this.url = request.f56359a;
            this.method = request.f56360b;
            this.body = request.f56362d;
            this.tags = request.f56363e.isEmpty() ? map : new LinkedHashMap<>(request.f56363e);
            this.headers = request.f56361c.m81843a();
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

        public Request build() {
            if (this.url != null) {
                return new Request(this);
            }
            qkq0.m175383a("url == null");
            return null;
        }

        public Builder cacheControl(C13698d c13698d) {
            String string = c13698d.toString();
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

        public Builder method(String str, RequestBody requestBody) {
            if (str == null) {
                jfd0.m141176a("method == null");
                return null;
            }
            if (str.length() == 0) {
                ig3.m135964a("method.length() == 0");
                return null;
            }
            if (requestBody != null && !C13721d.m81687a(str)) {
                qtc0.m176411a("method ", str, " must not have a request body.");
                return null;
            }
            if (requestBody == null && (str.equals("POST") || str.equals(HttpMethods.PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
                qtc0.m176411a("method ", str, " must have a request body.");
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
            this.headers.m81849a(str);
            return this;
        }

        public <T> Builder tag(Class<? super T> cls, T t) {
            if (cls == null) {
                jfd0.m141176a("type == null");
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
                jfd0.m141176a("url == null");
                return null;
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                strConcat = URIUtil.HTTP_COLON.concat(str.substring(3));
            } else {
                strConcat = str.regionMatches(true, 0, "wss:", 0, 4) ? URIUtil.HTTPS_COLON.concat(str.substring(4)) : str;
            }
            return url(new C13767p.a().m81870a(null, strConcat).m81872a());
        }

        public Builder delete() {
            return delete(C13706c.f56458d);
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder() {
            this.tags = Collections.EMPTY_MAP;
            this.method = "GET";
            this.headers = new C13766o.a();
        }

        public Builder url(C13767p c13767p) {
            if (c13767p != null) {
                this.url = c13767p;
                return this;
            }
            jfd0.m141176a("url == null");
            return null;
        }

        public Builder url(URL url) {
            if (url != null) {
                return url(new C13767p.a().m81870a(null, url.toString()).m81872a());
            }
            jfd0.m141176a("url == null");
            return null;
        }
    }

    public C13766o headers() {
        return this.f56361c;
    }

    public Object tag() {
        return tag(Object.class);
    }
}
