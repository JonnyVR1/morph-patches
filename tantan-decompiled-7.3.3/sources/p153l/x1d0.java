package p153l;

import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.util.URIUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class x1d0 {

    /* JADX INFO: renamed from: a */
    public final rnl f192040a;

    /* JADX INFO: renamed from: b */
    public final String f192041b;

    /* JADX INFO: renamed from: c */
    public final e0l f192042c;

    /* JADX INFO: renamed from: d */
    public final z1d0 f192043d;

    /* JADX INFO: renamed from: e */
    public final Map<Class<?>, Object> f192044e;

    /* JADX INFO: renamed from: f */
    public volatile yx3 f192045f;

    public x1d0(C21228a c21228a) {
        this.f192040a = c21228a.f192046a;
        this.f192041b = c21228a.f192047b;
        this.f192042c = c21228a.f192048c.m118886e();
        this.f192043d = c21228a.f192049d;
        this.f192044e = zlk0.m220260v(c21228a.f192050e);
    }

    /* JADX INFO: renamed from: a */
    public z1d0 m209016a() {
        return this.f192043d;
    }

    /* JADX INFO: renamed from: b */
    public yx3 m209017b() {
        yx3 yx3Var = this.f192045f;
        if (yx3Var != null) {
            return yx3Var;
        }
        yx3 yx3VarM217671k = yx3.m217671k(this.f192042c);
        this.f192045f = yx3VarM217671k;
        return yx3VarM217671k;
    }

    /* JADX INFO: renamed from: c */
    public String m209018c(String str) {
        return this.f192042c.m118874d(str);
    }

    /* JADX INFO: renamed from: d */
    public List<String> m209019d(String str) {
        return this.f192042c.m118881n(str);
    }

    /* JADX INFO: renamed from: e */
    public e0l m209020e() {
        return this.f192042c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m209021f() {
        return this.f192040a.m182287n();
    }

    /* JADX INFO: renamed from: g */
    public String m209022g() {
        return this.f192041b;
    }

    /* JADX INFO: renamed from: h */
    public C21228a m209023h() {
        return new C21228a(this);
    }

    /* JADX INFO: renamed from: i */
    public Object m209024i() {
        return m209025j(Object.class);
    }

    /* JADX INFO: renamed from: j */
    public <T> T m209025j(Class<? extends T> cls) {
        return cls.cast(this.f192044e.get(cls));
    }

    /* JADX INFO: renamed from: k */
    public rnl m209026k() {
        return this.f192040a;
    }

    public String toString() {
        return "Request{method=" + this.f192041b + ", url=" + this.f192040a + ", tags=" + this.f192044e + '}';
    }

    /* JADX INFO: renamed from: l.x1d0$a */
    public static class C21228a {

        /* JADX INFO: renamed from: a */
        public rnl f192046a;

        /* JADX INFO: renamed from: b */
        public String f192047b;

        /* JADX INFO: renamed from: c */
        public e0l.C16674a f192048c;

        /* JADX INFO: renamed from: d */
        public z1d0 f192049d;

        /* JADX INFO: renamed from: e */
        public Map<Class<?>, Object> f192050e;

        public C21228a(x1d0 x1d0Var) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f192050e = map;
            this.f192046a = x1d0Var.f192040a;
            this.f192047b = x1d0Var.f192041b;
            this.f192049d = x1d0Var.f192043d;
            this.f192050e = x1d0Var.f192044e.isEmpty() ? map : new LinkedHashMap<>(x1d0Var.f192044e);
            this.f192048c = x1d0Var.f192042c.m118877h();
        }

        /* JADX INFO: renamed from: a */
        public C21228a m209027a(String str, String str2) {
            this.f192048c.m118882a(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public x1d0 m209028b() {
            if (this.f192046a != null) {
                return new x1d0(this);
            }
            wtq0.m207906a("url == null");
            return null;
        }

        /* JADX INFO: renamed from: c */
        public C21228a m209029c(yx3 yx3Var) {
            String string = yx3Var.toString();
            return string.isEmpty() ? m209040n("Cache-Control") : m209034h("Cache-Control", string);
        }

        /* JADX INFO: renamed from: d */
        public C21228a m209030d() {
            return m209031e(zlk0.f204950e);
        }

        /* JADX INFO: renamed from: e */
        public C21228a m209031e(z1d0 z1d0Var) {
            return m209036j(HttpMethods.DELETE, z1d0Var);
        }

        /* JADX INFO: renamed from: f */
        public C21228a m209032f() {
            return m209036j("GET", null);
        }

        /* JADX INFO: renamed from: g */
        public C21228a m209033g() {
            return m209036j(HttpMethods.HEAD, null);
        }

        /* JADX INFO: renamed from: h */
        public C21228a m209034h(String str, String str2) {
            this.f192048c.m118889h(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C21228a m209035i(e0l e0lVar) {
            this.f192048c = e0lVar.m118877h();
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C21228a m209036j(String str, z1d0 z1d0Var) {
            if (str == null) {
                mnd0.m159157a("method == null");
                return null;
            }
            if (str.length() == 0) {
                wg3.m206174a("method.length() == 0");
                return null;
            }
            if (z1d0Var != null && !zml.m220393b(str)) {
                v1d0.m199002a("method ", str, " must not have a request body.");
                return null;
            }
            if (z1d0Var == null && zml.m220396e(str)) {
                v1d0.m199002a("method ", str, " must have a request body.");
                return null;
            }
            this.f192047b = str;
            this.f192049d = z1d0Var;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C21228a m209037k(z1d0 z1d0Var) {
            return m209036j("PATCH", z1d0Var);
        }

        /* JADX INFO: renamed from: l */
        public C21228a m209038l(z1d0 z1d0Var) {
            return m209036j("POST", z1d0Var);
        }

        /* JADX INFO: renamed from: m */
        public C21228a m209039m(z1d0 z1d0Var) {
            return m209036j(HttpMethods.PUT, z1d0Var);
        }

        /* JADX INFO: renamed from: n */
        public C21228a m209040n(String str) {
            this.f192048c.m118888g(str);
            return this;
        }

        /* JADX INFO: renamed from: o */
        public <T> C21228a m209041o(Class<? super T> cls, T t) {
            if (cls == null) {
                mnd0.m159157a("type == null");
                return null;
            }
            Map<Class<?>, Object> map = this.f192050e;
            if (t == null) {
                map.remove(cls);
                return this;
            }
            if (map.isEmpty()) {
                this.f192050e = new LinkedHashMap();
            }
            this.f192050e.put(cls, cls.cast(t));
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C21228a m209042p(Object obj) {
            return m209041o(Object.class, obj);
        }

        /* JADX INFO: renamed from: q */
        public C21228a m209043q(String str) {
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
            return m209045s(rnl.m182263l(strConcat));
        }

        /* JADX INFO: renamed from: r */
        public C21228a m209044r(URL url) {
            if (url != null) {
                return m209045s(rnl.m182263l(url.toString()));
            }
            mnd0.m159157a("url == null");
            return null;
        }

        /* JADX INFO: renamed from: s */
        public C21228a m209045s(rnl rnlVar) {
            if (rnlVar != null) {
                this.f192046a = rnlVar;
                return this;
            }
            mnd0.m159157a("url == null");
            return null;
        }

        public C21228a() {
            this.f192050e = Collections.EMPTY_MAP;
            this.f192047b = "GET";
            this.f192048c = new e0l.C16674a();
        }
    }
}
