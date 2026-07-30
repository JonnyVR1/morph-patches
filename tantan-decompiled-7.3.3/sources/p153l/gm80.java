package p153l;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class gm80 implements wk90<fb5<db5>> {

    /* JADX INFO: renamed from: a */
    public final wk90<fb5<db5>> f104938a;

    /* JADX INFO: renamed from: b */
    public final xc80 f104939b;

    /* JADX INFO: renamed from: c */
    public final Executor f104940c;

    /* JADX INFO: renamed from: l.gm80$a */
    public class C17249a extends pud<fb5<db5>, fb5<db5>> {

        /* JADX INFO: renamed from: c */
        public final cl90 f104941c;

        /* JADX INFO: renamed from: d */
        public final yk90 f104942d;

        /* JADX INFO: renamed from: e */
        public final fm80 f104943e;

        /* JADX INFO: renamed from: f */
        public boolean f104944f;

        /* JADX INFO: renamed from: g */
        public fb5<db5> f104945g;

        /* JADX INFO: renamed from: h */
        public int f104946h;

        /* JADX INFO: renamed from: i */
        public boolean f104947i;

        /* JADX INFO: renamed from: j */
        public boolean f104948j;

        /* JADX INFO: renamed from: l.gm80$a$a */
        public class a extends er2 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gm80 f104950a;

            public a(gm80 gm80Var) {
                this.f104950a = gm80Var;
            }

            @Override // p153l.er2, p153l.zk90
            /* JADX INFO: renamed from: b */
            public void mo8551b() {
                C17249a.this.m130758B();
            }
        }

        /* JADX INFO: renamed from: l.gm80$a$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                fb5 fb5Var;
                int i;
                synchronized (C17249a.this) {
                    fb5Var = C17249a.this.f104945g;
                    i = C17249a.this.f104946h;
                    C17249a.this.f104945g = null;
                    C17249a.this.f104947i = false;
                }
                if (fb5.m124864Q(fb5Var)) {
                    try {
                        C17249a.this.m130768y(fb5Var, i);
                        fb5.m124874v(fb5Var);
                    } catch (Throwable th) {
                        fb5.m124874v(fb5Var);
                        throw th;
                    }
                }
                C17249a.this.m130767w();
            }
        }

        public C17249a(z06<fb5<db5>> z06Var, cl90 cl90Var, fm80 fm80Var, yk90 yk90Var) {
            super(z06Var);
            this.f104945g = null;
            this.f104946h = 0;
            this.f104947i = false;
            this.f104948j = false;
            this.f104941c = cl90Var;
            this.f104943e = fm80Var;
            this.f104942d = yk90Var;
            yk90Var.mo117677q(new a(gm80.this));
        }

        /* JADX INFO: renamed from: x */
        private boolean m130756x() {
            synchronized (this) {
                try {
                    if (this.f104944f) {
                        return false;
                    }
                    fb5<db5> fb5Var = this.f104945g;
                    this.f104945g = null;
                    this.f104944f = true;
                    fb5.m124874v(fb5Var);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: A */
        public final synchronized boolean m130757A() {
            return this.f104944f;
        }

        /* JADX INFO: renamed from: B */
        public final void m130758B() {
            if (m130756x()) {
                m173861o().mo144953a();
            }
        }

        /* JADX INFO: renamed from: C */
        public final void m130759C(Throwable th) {
            if (m130756x()) {
                m173861o().onFailure(th);
            }
        }

        /* JADX INFO: renamed from: D */
        public final void m130760D(fb5<db5> fb5Var, int i) {
            boolean zM144947d = ji2.m144947d(i);
            if ((zM144947d || m130757A()) && !(zM144947d && m130756x())) {
                return;
            }
            m173861o().mo144954b(fb5Var, i);
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo8577h(fb5<db5> fb5Var, int i) {
            if (fb5.m124864Q(fb5Var)) {
                m130766J(fb5Var, i);
            } else if (ji2.m144947d(i)) {
                m130760D(null, i);
            }
        }

        /* JADX INFO: renamed from: F */
        public final fb5<db5> m130762F(db5 db5Var) {
            ib5 ib5Var = (ib5) db5Var;
            fb5<Bitmap> fb5VarMo126182b = this.f104943e.mo126182b(ib5Var.mo96697b0(), gm80.this.f104939b);
            try {
                ib5 ib5VarM139280O = ib5.m139280O(fb5VarMo126182b, db5Var.mo97948Y(), ib5Var.mo104388V(), ib5Var.mo104390x());
                ib5VarM139280O.mo97950d(ib5Var.getExtras());
                return fb5.m124865S(ib5VarM139280O);
            } finally {
                fb5.m124874v(fb5VarMo126182b);
            }
        }

        /* JADX INFO: renamed from: G */
        public final synchronized boolean m130763G() {
            if (this.f104944f || !this.f104947i || this.f104948j || !fb5.m124864Q(this.f104945g)) {
                return false;
            }
            this.f104948j = true;
            return true;
        }

        /* JADX INFO: renamed from: H */
        public final boolean m130764H(db5 db5Var) {
            return db5Var instanceof ib5;
        }

        /* JADX INFO: renamed from: I */
        public final void m130765I() {
            gm80.this.f104940c.execute(new b());
        }

        /* JADX INFO: renamed from: J */
        public final void m130766J(fb5<db5> fb5Var, int i) {
            synchronized (this) {
                try {
                    if (this.f104944f) {
                        return;
                    }
                    fb5<db5> fb5Var2 = this.f104945g;
                    this.f104945g = fb5.m124872t(fb5Var);
                    this.f104946h = i;
                    this.f104947i = true;
                    boolean zM130763G = m130763G();
                    fb5.m124874v(fb5Var2);
                    if (zM130763G) {
                        m130765I();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.pud, p153l.ji2
        /* JADX INFO: renamed from: f */
        public void mo8575f() {
            m130758B();
        }

        @Override // p153l.pud, p153l.ji2
        /* JADX INFO: renamed from: g */
        public void mo8576g(Throwable th) {
            m130759C(th);
        }

        /* JADX INFO: renamed from: w */
        public final void m130767w() {
            boolean zM130763G;
            synchronized (this) {
                this.f104948j = false;
                zM130763G = m130763G();
            }
            if (zM130763G) {
                m130765I();
            }
        }

        /* JADX INFO: renamed from: y */
        public final void m130768y(fb5<db5> fb5Var, int i) {
            wn80.m207177b(Boolean.valueOf(fb5.m124864Q(fb5Var)));
            if (!m130764H(fb5Var.m124875B())) {
                m130760D(fb5Var, i);
                return;
            }
            this.f104941c.mo110444d(this.f104942d, "PostprocessorProducer");
            try {
                try {
                    fb5<db5> fb5VarM130762F = m130762F(fb5Var.m124875B());
                    cl90 cl90Var = this.f104941c;
                    yk90 yk90Var = this.f104942d;
                    cl90Var.mo110446f(yk90Var, "PostprocessorProducer", m130769z(cl90Var, yk90Var, this.f104943e));
                    m130760D(fb5VarM130762F, i);
                    fb5.m124874v(fb5VarM130762F);
                } catch (Exception e) {
                    cl90 cl90Var2 = this.f104941c;
                    yk90 yk90Var2 = this.f104942d;
                    cl90Var2.mo110447i(yk90Var2, "PostprocessorProducer", e, m130769z(cl90Var2, yk90Var2, this.f104943e));
                    m130759C(e);
                    fb5.m124874v(null);
                }
            } catch (Throwable th) {
                fb5.m124874v(null);
                throw th;
            }
        }

        /* JADX INFO: renamed from: z */
        public final Map<String, String> m130769z(cl90 cl90Var, yk90 yk90Var, fm80 fm80Var) {
            if (cl90Var.mo110449k(yk90Var, "PostprocessorProducer")) {
                return ImmutableMap.m8202of("Postprocessor", fm80Var.getName());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: l.gm80$b */
    public class C17250b extends pud<fb5<db5>, fb5<db5>> implements i0d0 {

        /* JADX INFO: renamed from: c */
        public boolean f104953c;

        /* JADX INFO: renamed from: d */
        public fb5<db5> f104954d;

        /* JADX INFO: renamed from: l.gm80$b$a */
        public class a extends er2 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gm80 f104956a;

            public a(gm80 gm80Var) {
                this.f104956a = gm80Var;
            }

            @Override // p153l.er2, p153l.zk90
            /* JADX INFO: renamed from: b */
            public void mo8551b() {
                if (C17250b.this.m130771q()) {
                    C17250b.this.m173861o().mo144953a();
                }
            }
        }

        public C17250b(C17249a c17249a, h0d0 h0d0Var, yk90 yk90Var) {
            super(c17249a);
            this.f104953c = false;
            this.f104954d = null;
            h0d0Var.m133148c(this);
            yk90Var.mo117677q(new a(gm80.this));
        }

        @Override // p153l.pud, p153l.ji2
        /* JADX INFO: renamed from: f */
        public void mo8575f() {
            if (m130771q()) {
                m173861o().mo144953a();
            }
        }

        @Override // p153l.pud, p153l.ji2
        /* JADX INFO: renamed from: g */
        public void mo8576g(Throwable th) {
            if (m130771q()) {
                m173861o().onFailure(th);
            }
        }

        /* JADX INFO: renamed from: q */
        public final boolean m130771q() {
            synchronized (this) {
                try {
                    if (this.f104953c) {
                        return false;
                    }
                    fb5<db5> fb5Var = this.f104954d;
                    this.f104954d = null;
                    this.f104953c = true;
                    fb5.m124874v(fb5Var);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo8577h(fb5<db5> fb5Var, int i) {
            if (ji2.m144948e(i)) {
                return;
            }
            m130773s(fb5Var);
            m130774t();
        }

        /* JADX INFO: renamed from: s */
        public final void m130773s(fb5<db5> fb5Var) {
            synchronized (this) {
                try {
                    if (this.f104953c) {
                        return;
                    }
                    fb5<db5> fb5Var2 = this.f104954d;
                    this.f104954d = fb5.m124872t(fb5Var);
                    fb5.m124874v(fb5Var2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: t */
        public final void m130774t() {
            synchronized (this) {
                try {
                    if (this.f104953c) {
                        return;
                    }
                    fb5<db5> fb5VarM124872t = fb5.m124872t(this.f104954d);
                    try {
                        m173861o().mo144954b(fb5VarM124872t, 0);
                    } finally {
                        fb5.m124874v(fb5VarM124872t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.gm80$c */
    public class C17251c extends pud<fb5<db5>, fb5<db5>> {
        public C17251c(C17249a c17249a) {
            super(c17249a);
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8577h(fb5<db5> fb5Var, int i) {
            if (ji2.m144948e(i)) {
                return;
            }
            m173861o().mo144954b(fb5Var, i);
        }
    }

    public gm80(wk90<fb5<db5>> wk90Var, xc80 xc80Var, Executor executor) {
        this.f104938a = (wk90) wn80.m207182g(wk90Var);
        this.f104939b = xc80Var;
        this.f104940c = (Executor) wn80.m207182g(executor);
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<fb5<db5>> z06Var, yk90 yk90Var) {
        yk90 yk90Var2;
        z06<fb5<db5>> c17251c;
        cl90 cl90VarMo117675n = yk90Var.mo117675n();
        fm80 fm80VarM8629m = yk90Var.mo117678t().m8629m();
        wn80.m207182g(fm80VarM8629m);
        C17249a c17249a = new C17249a(z06Var, cl90VarMo117675n, fm80VarM8629m, yk90Var);
        if (fm80VarM8629m instanceof h0d0) {
            yk90Var2 = yk90Var;
            c17251c = new C17250b(c17249a, (h0d0) fm80VarM8629m, yk90Var2);
        } else {
            yk90Var2 = yk90Var;
            c17251c = new C17251c(c17249a);
        }
        this.f104938a.mo8539b(c17251c, yk90Var2);
    }
}
