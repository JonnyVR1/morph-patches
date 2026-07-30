package p153l;

import java.io.Closeable;
import java.util.List;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes2.dex */
public final class i5d0 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final x1d0 f113031a;

    /* JADX INFO: renamed from: b */
    public final Protocol f113032b;

    /* JADX INFO: renamed from: c */
    public final int f113033c;

    /* JADX INFO: renamed from: d */
    public final String f113034d;

    /* JADX INFO: renamed from: e */
    public final txk f113035e;

    /* JADX INFO: renamed from: f */
    public final e0l f113036f;

    /* JADX INFO: renamed from: g */
    public final k5d0 f113037g;

    /* JADX INFO: renamed from: h */
    public final i5d0 f113038h;

    /* JADX INFO: renamed from: i */
    public final i5d0 f113039i;

    /* JADX INFO: renamed from: j */
    public final i5d0 f113040j;

    /* JADX INFO: renamed from: k */
    public final long f113041k;

    /* JADX INFO: renamed from: l */
    public final long f113042l;

    /* JADX INFO: renamed from: m */
    public final n6f f113043m;

    /* JADX INFO: renamed from: n */
    public volatile yx3 f113044n;

    public i5d0(C17653a c17653a) {
        this.f113031a = c17653a.f113045a;
        this.f113032b = c17653a.f113046b;
        this.f113033c = c17653a.f113047c;
        this.f113034d = c17653a.f113048d;
        this.f113035e = c17653a.f113049e;
        this.f113036f = c17653a.f113050f.m118886e();
        this.f113037g = c17653a.f113051g;
        this.f113038h = c17653a.f113052h;
        this.f113039i = c17653a.f113053i;
        this.f113040j = c17653a.f113054j;
        this.f113041k = c17653a.f113055k;
        this.f113042l = c17653a.f113056l;
        this.f113043m = c17653a.f113057m;
    }

    /* JADX INFO: renamed from: B */
    public List<String> m138658B(String str) {
        return this.f113036f.m118881n(str);
    }

    /* JADX INFO: renamed from: F */
    public e0l m138659F() {
        return this.f113036f;
    }

    /* JADX INFO: renamed from: H */
    public boolean m138660H() {
        int i = this.f113033c;
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
    public boolean m138661I() {
        int i = this.f113033c;
        return i >= 200 && i < 300;
    }

    /* JADX INFO: renamed from: J */
    public String m138662J() {
        return this.f113034d;
    }

    /* JADX INFO: renamed from: M */
    public i5d0 m138663M() {
        return this.f113038h;
    }

    /* JADX INFO: renamed from: N */
    public C17653a m138664N() {
        return new C17653a(this);
    }

    /* JADX INFO: renamed from: Q */
    public i5d0 m138665Q() {
        return this.f113040j;
    }

    /* JADX INFO: renamed from: S */
    public Protocol m138666S() {
        return this.f113032b;
    }

    /* JADX INFO: renamed from: U */
    public long m138667U() {
        return this.f113042l;
    }

    /* JADX INFO: renamed from: Z */
    public x1d0 m138668Z() {
        return this.f113031a;
    }

    /* JADX INFO: renamed from: a0 */
    public long m138669a0() {
        return this.f113041k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        k5d0 k5d0Var = this.f113037g;
        if (k5d0Var != null) {
            k5d0Var.close();
        } else {
            wtq0.m207906a("response is not eligible for a body and must not be closed");
        }
    }

    /* JADX INFO: renamed from: k */
    public k5d0 m138670k() {
        return this.f113037g;
    }

    /* JADX INFO: renamed from: m */
    public yx3 m138671m() {
        yx3 yx3Var = this.f113044n;
        if (yx3Var != null) {
            return yx3Var;
        }
        yx3 yx3VarM217671k = yx3.m217671k(this.f113036f);
        this.f113044n = yx3VarM217671k;
        return yx3VarM217671k;
    }

    /* JADX INFO: renamed from: n */
    public i5d0 m138672n() {
        return this.f113039i;
    }

    /* JADX INFO: renamed from: q */
    public int m138673q() {
        return this.f113033c;
    }

    /* JADX INFO: renamed from: t */
    public txk m138674t() {
        return this.f113035e;
    }

    public String toString() {
        return "Response{protocol=" + this.f113032b + ", code=" + this.f113033c + ", message=" + this.f113034d + ", url=" + this.f113031a.m209026k() + '}';
    }

    /* JADX INFO: renamed from: u */
    public String m138675u(String str) {
        return m138676v(str, null);
    }

    /* JADX INFO: renamed from: v */
    public String m138676v(String str, String str2) {
        String strM118874d = this.f113036f.m118874d(str);
        return strM118874d != null ? strM118874d : str2;
    }

    /* JADX INFO: renamed from: l.i5d0$a */
    public static class C17653a {

        /* JADX INFO: renamed from: a */
        public x1d0 f113045a;

        /* JADX INFO: renamed from: b */
        public Protocol f113046b;

        /* JADX INFO: renamed from: c */
        public int f113047c;

        /* JADX INFO: renamed from: d */
        public String f113048d;

        /* JADX INFO: renamed from: e */
        public txk f113049e;

        /* JADX INFO: renamed from: f */
        public e0l.C16674a f113050f;

        /* JADX INFO: renamed from: g */
        public k5d0 f113051g;

        /* JADX INFO: renamed from: h */
        public i5d0 f113052h;

        /* JADX INFO: renamed from: i */
        public i5d0 f113053i;

        /* JADX INFO: renamed from: j */
        public i5d0 f113054j;

        /* JADX INFO: renamed from: k */
        public long f113055k;

        /* JADX INFO: renamed from: l */
        public long f113056l;

        /* JADX INFO: renamed from: m */
        public n6f f113057m;

        public C17653a(i5d0 i5d0Var) {
            this.f113047c = -1;
            this.f113045a = i5d0Var.f113031a;
            this.f113046b = i5d0Var.f113032b;
            this.f113047c = i5d0Var.f113033c;
            this.f113048d = i5d0Var.f113034d;
            this.f113049e = i5d0Var.f113035e;
            this.f113050f = i5d0Var.f113036f.m118877h();
            this.f113051g = i5d0Var.f113037g;
            this.f113052h = i5d0Var.f113038h;
            this.f113053i = i5d0Var.f113039i;
            this.f113054j = i5d0Var.f113040j;
            this.f113055k = i5d0Var.f113041k;
            this.f113056l = i5d0Var.f113042l;
            this.f113057m = i5d0Var.f113043m;
        }

        /* JADX INFO: renamed from: a */
        public C17653a m138677a(String str, String str2) {
            this.f113050f.m118882a(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C17653a m138678b(k5d0 k5d0Var) {
            this.f113051g = k5d0Var;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public i5d0 m138679c() {
            if (this.f113045a == null) {
                wtq0.m207906a("request == null");
                return null;
            }
            if (this.f113046b == null) {
                wtq0.m207906a("protocol == null");
                return null;
            }
            if (this.f113047c < 0) {
                h5d0.m133654a("code < 0: ", this.f113047c);
                return null;
            }
            if (this.f113048d != null) {
                return new i5d0(this);
            }
            wtq0.m207906a("message == null");
            return null;
        }

        /* JADX INFO: renamed from: d */
        public C17653a m138680d(i5d0 i5d0Var) {
            if (i5d0Var != null) {
                m138682f("cacheResponse", i5d0Var);
            }
            this.f113053i = i5d0Var;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final void m138681e(i5d0 i5d0Var) {
            if (i5d0Var.f113037g == null) {
                return;
            }
            wg3.m206174a("priorResponse.body != null");
        }

        /* JADX INFO: renamed from: f */
        public final void m138682f(String str, i5d0 i5d0Var) {
            if (i5d0Var.f113037g != null) {
                ulk0.m196558a(str, ".body != null");
                return;
            }
            if (i5d0Var.f113038h != null) {
                ulk0.m196558a(str, ".networkResponse != null");
            } else if (i5d0Var.f113039i != null) {
                ulk0.m196558a(str, ".cacheResponse != null");
            } else {
                if (i5d0Var.f113040j == null) {
                    return;
                }
                ulk0.m196558a(str, ".priorResponse != null");
            }
        }

        /* JADX INFO: renamed from: g */
        public C17653a m138683g(int i) {
            this.f113047c = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C17653a m138684h(txk txkVar) {
            this.f113049e = txkVar;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C17653a m138685i(String str, String str2) {
            this.f113050f.m118889h(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C17653a m138686j(e0l e0lVar) {
            this.f113050f = e0lVar.m118877h();
            return this;
        }

        /* JADX INFO: renamed from: k */
        public void m138687k(n6f n6fVar) {
            this.f113057m = n6fVar;
        }

        /* JADX INFO: renamed from: l */
        public C17653a m138688l(String str) {
            this.f113048d = str;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C17653a m138689m(i5d0 i5d0Var) {
            if (i5d0Var != null) {
                m138682f("networkResponse", i5d0Var);
            }
            this.f113052h = i5d0Var;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C17653a m138690n(i5d0 i5d0Var) {
            if (i5d0Var != null) {
                m138681e(i5d0Var);
            }
            this.f113054j = i5d0Var;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C17653a m138691o(Protocol protocol) {
            this.f113046b = protocol;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C17653a m138692p(long j) {
            this.f113056l = j;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C17653a m138693q(x1d0 x1d0Var) {
            this.f113045a = x1d0Var;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C17653a m138694r(long j) {
            this.f113055k = j;
            return this;
        }

        public C17653a() {
            this.f113047c = -1;
            this.f113050f = new e0l.C16674a();
        }
    }
}
