package p149l;

import java.io.Closeable;
import java.util.List;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes2.dex */
public final class exc0 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final stc0 f93596a;

    /* JADX INFO: renamed from: b */
    public final Protocol f93597b;

    /* JADX INFO: renamed from: c */
    public final int f93598c;

    /* JADX INFO: renamed from: d */
    public final String f93599d;

    /* JADX INFO: renamed from: e */
    public final dvk f93600e;

    /* JADX INFO: renamed from: f */
    public final oxk f93601f;

    /* JADX INFO: renamed from: g */
    public final gxc0 f93602g;

    /* JADX INFO: renamed from: h */
    public final exc0 f93603h;

    /* JADX INFO: renamed from: i */
    public final exc0 f93604i;

    /* JADX INFO: renamed from: j */
    public final exc0 f93605j;

    /* JADX INFO: renamed from: k */
    public final long f93606k;

    /* JADX INFO: renamed from: l */
    public final long f93607l;

    /* JADX INFO: renamed from: m */
    public final j5f f93608m;

    /* JADX INFO: renamed from: n */
    public volatile zw3 f93609n;

    public exc0(C16708a c16708a) {
        this.f93596a = c16708a.f93610a;
        this.f93597b = c16708a.f93611b;
        this.f93598c = c16708a.f93612c;
        this.f93599d = c16708a.f93613d;
        this.f93600e = c16708a.f93614e;
        this.f93601f = c16708a.f93615f.m166567e();
        this.f93602g = c16708a.f93616g;
        this.f93603h = c16708a.f93617h;
        this.f93604i = c16708a.f93618i;
        this.f93605j = c16708a.f93619j;
        this.f93606k = c16708a.f93620k;
        this.f93607l = c16708a.f93621l;
        this.f93608m = c16708a.f93622m;
    }

    /* JADX INFO: renamed from: B */
    public List<String> m118594B(String str) {
        return this.f93601f.m166562n(str);
    }

    /* JADX INFO: renamed from: F */
    public oxk m118595F() {
        return this.f93601f;
    }

    /* JADX INFO: renamed from: H */
    public boolean m118596H() {
        int i = this.f93598c;
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

    /* JADX INFO: renamed from: I */
    public boolean m118597I() {
        int i = this.f93598c;
        return i >= 200 && i < 300;
    }

    /* JADX INFO: renamed from: J */
    public String m118598J() {
        return this.f93599d;
    }

    /* JADX INFO: renamed from: M */
    public exc0 m118599M() {
        return this.f93603h;
    }

    /* JADX INFO: renamed from: N */
    public C16708a m118600N() {
        return new C16708a(this);
    }

    /* JADX INFO: renamed from: Q */
    public exc0 m118601Q() {
        return this.f93605j;
    }

    /* JADX INFO: renamed from: S */
    public Protocol m118602S() {
        return this.f93597b;
    }

    /* JADX INFO: renamed from: T */
    public long m118603T() {
        return this.f93607l;
    }

    /* JADX INFO: renamed from: Y */
    public stc0 m118604Y() {
        return this.f93596a;
    }

    /* JADX INFO: renamed from: Z */
    public long m118605Z() {
        return this.f93606k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        gxc0 gxc0Var = this.f93602g;
        if (gxc0Var != null) {
            gxc0Var.close();
        } else {
            qkq0.m175383a("response is not eligible for a body and must not be closed");
        }
    }

    /* JADX INFO: renamed from: k */
    public gxc0 m118606k() {
        return this.f93602g;
    }

    /* JADX INFO: renamed from: m */
    public zw3 m118607m() {
        zw3 zw3Var = this.f93609n;
        if (zw3Var != null) {
            return zw3Var;
        }
        zw3 zw3VarM220560k = zw3.m220560k(this.f93601f);
        this.f93609n = zw3VarM220560k;
        return zw3VarM220560k;
    }

    /* JADX INFO: renamed from: n */
    public exc0 m118608n() {
        return this.f93604i;
    }

    /* JADX INFO: renamed from: q */
    public int m118609q() {
        return this.f93598c;
    }

    /* JADX INFO: renamed from: t */
    public dvk m118610t() {
        return this.f93600e;
    }

    public String toString() {
        return "Response{protocol=" + this.f93597b + ", code=" + this.f93598c + ", message=" + this.f93599d + ", url=" + this.f93596a.m185881k() + '}';
    }

    /* JADX INFO: renamed from: u */
    public String m118611u(String str) {
        return m118612v(str, null);
    }

    /* JADX INFO: renamed from: v */
    public String m118612v(String str, String str2) {
        String strM166555d = this.f93601f.m166555d(str);
        return strM166555d != null ? strM166555d : str2;
    }

    /* JADX INFO: renamed from: l.exc0$a */
    public static class C16708a {

        /* JADX INFO: renamed from: a */
        public stc0 f93610a;

        /* JADX INFO: renamed from: b */
        public Protocol f93611b;

        /* JADX INFO: renamed from: c */
        public int f93612c;

        /* JADX INFO: renamed from: d */
        public String f93613d;

        /* JADX INFO: renamed from: e */
        public dvk f93614e;

        /* JADX INFO: renamed from: f */
        public oxk.C19066a f93615f;

        /* JADX INFO: renamed from: g */
        public gxc0 f93616g;

        /* JADX INFO: renamed from: h */
        public exc0 f93617h;

        /* JADX INFO: renamed from: i */
        public exc0 f93618i;

        /* JADX INFO: renamed from: j */
        public exc0 f93619j;

        /* JADX INFO: renamed from: k */
        public long f93620k;

        /* JADX INFO: renamed from: l */
        public long f93621l;

        /* JADX INFO: renamed from: m */
        public j5f f93622m;

        public C16708a(exc0 exc0Var) {
            this.f93612c = -1;
            this.f93610a = exc0Var.f93596a;
            this.f93611b = exc0Var.f93597b;
            this.f93612c = exc0Var.f93598c;
            this.f93613d = exc0Var.f93599d;
            this.f93614e = exc0Var.f93600e;
            this.f93615f = exc0Var.f93601f.m166558h();
            this.f93616g = exc0Var.f93602g;
            this.f93617h = exc0Var.f93603h;
            this.f93618i = exc0Var.f93604i;
            this.f93619j = exc0Var.f93605j;
            this.f93620k = exc0Var.f93606k;
            this.f93621l = exc0Var.f93607l;
            this.f93622m = exc0Var.f93608m;
        }

        /* JADX INFO: renamed from: a */
        public C16708a m118613a(String str, String str2) {
            this.f93615f.m166563a(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C16708a m118614b(gxc0 gxc0Var) {
            this.f93616g = gxc0Var;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public exc0 m118615c() {
            if (this.f93610a == null) {
                qkq0.m175383a("request == null");
                return null;
            }
            if (this.f93611b == null) {
                qkq0.m175383a("protocol == null");
                return null;
            }
            if (this.f93612c < 0) {
                dxc0.m114002a("code < 0: ", this.f93612c);
                return null;
            }
            if (this.f93613d != null) {
                return new exc0(this);
            }
            qkq0.m175383a("message == null");
            return null;
        }

        /* JADX INFO: renamed from: d */
        public C16708a m118616d(exc0 exc0Var) {
            if (exc0Var != null) {
                m118618f("cacheResponse", exc0Var);
            }
            this.f93618i = exc0Var;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final void m118617e(exc0 exc0Var) {
            if (exc0Var.f93602g == null) {
                return;
            }
            ig3.m135964a("priorResponse.body != null");
        }

        /* JADX INFO: renamed from: f */
        public final void m118618f(String str, exc0 exc0Var) {
            if (exc0Var.f93602g != null) {
                ock0.m163533a(str, ".body != null");
                return;
            }
            if (exc0Var.f93603h != null) {
                ock0.m163533a(str, ".networkResponse != null");
            } else if (exc0Var.f93604i != null) {
                ock0.m163533a(str, ".cacheResponse != null");
            } else {
                if (exc0Var.f93605j == null) {
                    return;
                }
                ock0.m163533a(str, ".priorResponse != null");
            }
        }

        /* JADX INFO: renamed from: g */
        public C16708a m118619g(int i) {
            this.f93612c = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C16708a m118620h(dvk dvkVar) {
            this.f93614e = dvkVar;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C16708a m118621i(String str, String str2) {
            this.f93615f.m166570h(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C16708a m118622j(oxk oxkVar) {
            this.f93615f = oxkVar.m166558h();
            return this;
        }

        /* JADX INFO: renamed from: k */
        public void m118623k(j5f j5fVar) {
            this.f93622m = j5fVar;
        }

        /* JADX INFO: renamed from: l */
        public C16708a m118624l(String str) {
            this.f93613d = str;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C16708a m118625m(exc0 exc0Var) {
            if (exc0Var != null) {
                m118618f("networkResponse", exc0Var);
            }
            this.f93617h = exc0Var;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C16708a m118626n(exc0 exc0Var) {
            if (exc0Var != null) {
                m118617e(exc0Var);
            }
            this.f93619j = exc0Var;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C16708a m118627o(Protocol protocol) {
            this.f93611b = protocol;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C16708a m118628p(long j) {
            this.f93621l = j;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C16708a m118629q(stc0 stc0Var) {
            this.f93610a = stc0Var;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C16708a m118630r(long j) {
            this.f93620k = j;
            return this;
        }

        public C16708a() {
            this.f93612c = -1;
            this.f93615f = new oxk.C19066a();
        }
    }
}
