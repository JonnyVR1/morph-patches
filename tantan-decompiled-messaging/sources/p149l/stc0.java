package p149l;

import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.util.URIUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class stc0 {

    /* JADX INFO: renamed from: a */
    public final cll f166312a;

    /* JADX INFO: renamed from: b */
    public final String f166313b;

    /* JADX INFO: renamed from: c */
    public final oxk f166314c;

    /* JADX INFO: renamed from: d */
    public final utc0 f166315d;

    /* JADX INFO: renamed from: e */
    public final Map<Class<?>, Object> f166316e;

    /* JADX INFO: renamed from: f */
    public volatile zw3 f166317f;

    public stc0(C20027a c20027a) {
        this.f166312a = c20027a.f166318a;
        this.f166313b = c20027a.f166319b;
        this.f166314c = c20027a.f166320c.m166567e();
        this.f166315d = c20027a.f166321d;
        this.f166316e = tck0.m188021v(c20027a.f166322e);
    }

    /* JADX INFO: renamed from: a */
    public utc0 m185871a() {
        return this.f166315d;
    }

    /* JADX INFO: renamed from: b */
    public zw3 m185872b() {
        zw3 zw3Var = this.f166317f;
        if (zw3Var != null) {
            return zw3Var;
        }
        zw3 zw3VarM220560k = zw3.m220560k(this.f166314c);
        this.f166317f = zw3VarM220560k;
        return zw3VarM220560k;
    }

    /* JADX INFO: renamed from: c */
    public String m185873c(String str) {
        return this.f166314c.m166555d(str);
    }

    /* JADX INFO: renamed from: d */
    public List<String> m185874d(String str) {
        return this.f166314c.m166562n(str);
    }

    /* JADX INFO: renamed from: e */
    public oxk m185875e() {
        return this.f166314c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m185876f() {
        return this.f166312a.m107523n();
    }

    /* JADX INFO: renamed from: g */
    public String m185877g() {
        return this.f166313b;
    }

    /* JADX INFO: renamed from: h */
    public C20027a m185878h() {
        return new C20027a(this);
    }

    /* JADX INFO: renamed from: i */
    public Object m185879i() {
        return m185880j(Object.class);
    }

    /* JADX INFO: renamed from: j */
    public <T> T m185880j(Class<? extends T> cls) {
        return cls.cast(this.f166316e.get(cls));
    }

    /* JADX INFO: renamed from: k */
    public cll m185881k() {
        return this.f166312a;
    }

    public String toString() {
        return "Request{method=" + this.f166313b + ", url=" + this.f166312a + ", tags=" + this.f166316e + '}';
    }

    /* JADX INFO: renamed from: l.stc0$a */
    public static class C20027a {

        /* JADX INFO: renamed from: a */
        public cll f166318a;

        /* JADX INFO: renamed from: b */
        public String f166319b;

        /* JADX INFO: renamed from: c */
        public oxk.C19066a f166320c;

        /* JADX INFO: renamed from: d */
        public utc0 f166321d;

        /* JADX INFO: renamed from: e */
        public Map<Class<?>, Object> f166322e;

        public C20027a(stc0 stc0Var) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f166322e = map;
            this.f166318a = stc0Var.f166312a;
            this.f166319b = stc0Var.f166313b;
            this.f166321d = stc0Var.f166315d;
            this.f166322e = stc0Var.f166316e.isEmpty() ? map : new LinkedHashMap<>(stc0Var.f166316e);
            this.f166320c = stc0Var.f166314c.m166558h();
        }

        /* JADX INFO: renamed from: a */
        public C20027a m185882a(String str, String str2) {
            this.f166320c.m166563a(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public stc0 m185883b() {
            if (this.f166318a != null) {
                return new stc0(this);
            }
            qkq0.m175383a("url == null");
            return null;
        }

        /* JADX INFO: renamed from: c */
        public C20027a m185884c(zw3 zw3Var) {
            String string = zw3Var.toString();
            return string.isEmpty() ? m185895n("Cache-Control") : m185889h("Cache-Control", string);
        }

        /* JADX INFO: renamed from: d */
        public C20027a m185885d() {
            return m185886e(tck0.f169454e);
        }

        /* JADX INFO: renamed from: e */
        public C20027a m185886e(utc0 utc0Var) {
            return m185891j(HttpMethods.DELETE, utc0Var);
        }

        /* JADX INFO: renamed from: f */
        public C20027a m185887f() {
            return m185891j("GET", null);
        }

        /* JADX INFO: renamed from: g */
        public C20027a m185888g() {
            return m185891j(HttpMethods.HEAD, null);
        }

        /* JADX INFO: renamed from: h */
        public C20027a m185889h(String str, String str2) {
            this.f166320c.m166570h(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C20027a m185890i(oxk oxkVar) {
            this.f166320c = oxkVar.m166558h();
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C20027a m185891j(String str, utc0 utc0Var) {
            if (str == null) {
                jfd0.m141176a("method == null");
                return null;
            }
            if (str.length() == 0) {
                ig3.m135964a("method.length() == 0");
                return null;
            }
            if (utc0Var != null && !lkl.m150370b(str)) {
                qtc0.m176411a("method ", str, " must not have a request body.");
                return null;
            }
            if (utc0Var == null && lkl.m150373e(str)) {
                qtc0.m176411a("method ", str, " must have a request body.");
                return null;
            }
            this.f166319b = str;
            this.f166321d = utc0Var;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C20027a m185892k(utc0 utc0Var) {
            return m185891j("PATCH", utc0Var);
        }

        /* JADX INFO: renamed from: l */
        public C20027a m185893l(utc0 utc0Var) {
            return m185891j("POST", utc0Var);
        }

        /* JADX INFO: renamed from: m */
        public C20027a m185894m(utc0 utc0Var) {
            return m185891j(HttpMethods.PUT, utc0Var);
        }

        /* JADX INFO: renamed from: n */
        public C20027a m185895n(String str) {
            this.f166320c.m166569g(str);
            return this;
        }

        /* JADX INFO: renamed from: o */
        public <T> C20027a m185896o(Class<? super T> cls, T t) {
            if (cls == null) {
                jfd0.m141176a("type == null");
                return null;
            }
            Map<Class<?>, Object> map = this.f166322e;
            if (t == null) {
                map.remove(cls);
                return this;
            }
            if (map.isEmpty()) {
                this.f166322e = new LinkedHashMap();
            }
            this.f166322e.put(cls, cls.cast(t));
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C20027a m185897p(Object obj) {
            return m185896o(Object.class, obj);
        }

        /* JADX INFO: renamed from: q */
        public C20027a m185898q(String str) {
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
            return m185900s(cll.m107499l(strConcat));
        }

        /* JADX INFO: renamed from: r */
        public C20027a m185899r(URL url) {
            if (url != null) {
                return m185900s(cll.m107499l(url.toString()));
            }
            jfd0.m141176a("url == null");
            return null;
        }

        /* JADX INFO: renamed from: s */
        public C20027a m185900s(cll cllVar) {
            if (cllVar != null) {
                this.f166318a = cllVar;
                return this;
            }
            jfd0.m141176a("url == null");
            return null;
        }

        public C20027a() {
            this.f166322e = Collections.EMPTY_MAP;
            this.f166319b = "GET";
            this.f166320c = new oxk.C19066a();
        }
    }
}
