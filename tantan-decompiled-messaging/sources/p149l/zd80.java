package p149l;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class zd80 implements sc90<fa5<da5>> {

    /* JADX INFO: renamed from: a */
    public final sc90<fa5<da5>> f202635a;

    /* JADX INFO: renamed from: b */
    public final r480 f202636b;

    /* JADX INFO: renamed from: c */
    public final Executor f202637c;

    /* JADX INFO: renamed from: l.zd80$a */
    public class C21660a extends btd<fa5<da5>, fa5<da5>> {

        /* JADX INFO: renamed from: c */
        public final yc90 f202638c;

        /* JADX INFO: renamed from: d */
        public final uc90 f202639d;

        /* JADX INFO: renamed from: e */
        public final yd80 f202640e;

        /* JADX INFO: renamed from: f */
        public boolean f202641f;

        /* JADX INFO: renamed from: g */
        public fa5<da5> f202642g;

        /* JADX INFO: renamed from: h */
        public int f202643h;

        /* JADX INFO: renamed from: i */
        public boolean f202644i;

        /* JADX INFO: renamed from: j */
        public boolean f202645j;

        /* JADX INFO: renamed from: l.zd80$a$a */
        public class a extends nq2 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zd80 f202647a;

            public a(zd80 zd80Var) {
                this.f202647a = zd80Var;
            }

            @Override // p149l.nq2, p149l.vc90
            /* JADX INFO: renamed from: b */
            public void mo8497b() {
                C21660a.this.m218142B();
            }
        }

        /* JADX INFO: renamed from: l.zd80$a$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                fa5 fa5Var;
                int i;
                synchronized (C21660a.this) {
                    fa5Var = C21660a.this.f202642g;
                    i = C21660a.this.f202643h;
                    C21660a.this.f202642g = null;
                    C21660a.this.f202644i = false;
                }
                if (fa5.m120144Q(fa5Var)) {
                    try {
                        C21660a.this.m218152y(fa5Var, i);
                        fa5.m120154v(fa5Var);
                    } catch (Throwable th) {
                        fa5.m120154v(fa5Var);
                        throw th;
                    }
                }
                C21660a.this.m218151w();
            }
        }

        public C21660a(uz5<fa5<da5>> uz5Var, yc90 yc90Var, yd80 yd80Var, uc90 uc90Var) {
            super(uz5Var);
            this.f202642g = null;
            this.f202643h = 0;
            this.f202644i = false;
            this.f202645j = false;
            this.f202638c = yc90Var;
            this.f202640e = yd80Var;
            this.f202639d = uc90Var;
            uc90Var.mo155872q(new a(zd80.this));
        }

        /* JADX INFO: renamed from: x */
        private boolean m218140x() {
            synchronized (this) {
                try {
                    if (this.f202641f) {
                        return false;
                    }
                    fa5<da5> fa5Var = this.f202642g;
                    this.f202642g = null;
                    this.f202641f = true;
                    fa5.m120154v(fa5Var);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: A */
        public final synchronized boolean m218141A() {
            return this.f202641f;
        }

        /* JADX INFO: renamed from: B */
        public final void m218142B() {
            if (m218140x()) {
                m103812o().mo107034a();
            }
        }

        /* JADX INFO: renamed from: C */
        public final void m218143C(Throwable th) {
            if (m218140x()) {
                m103812o().onFailure(th);
            }
        }

        /* JADX INFO: renamed from: D */
        public final void m218144D(fa5<da5> fa5Var, int i) {
            boolean zM107028d = ci2.m107028d(i);
            if ((zM107028d || m218141A()) && !(zM107028d && m218140x())) {
                return;
            }
            m103812o().mo107035b(fa5Var, i);
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo8523h(fa5<da5> fa5Var, int i) {
            if (fa5.m120144Q(fa5Var)) {
                m218150J(fa5Var, i);
            } else if (ci2.m107028d(i)) {
                m218144D(null, i);
            }
        }

        /* JADX INFO: renamed from: F */
        public final fa5<da5> m218146F(da5 da5Var) {
            ia5 ia5Var = (ia5) da5Var;
            fa5<Bitmap> fa5VarMo103350b = this.f202640e.mo103350b(ia5Var.mo95529a0(), zd80.this.f202636b);
            try {
                ia5 ia5VarM135129O = ia5.m135129O(fa5VarMo103350b, da5Var.mo110565X(), ia5Var.mo135132U(), ia5Var.mo135134x());
                ia5VarM135129O.mo155862d(ia5Var.getExtras());
                return fa5.m120145S(ia5VarM135129O);
            } finally {
                fa5.m120154v(fa5VarMo103350b);
            }
        }

        /* JADX INFO: renamed from: G */
        public final synchronized boolean m218147G() {
            if (this.f202641f || !this.f202644i || this.f202645j || !fa5.m120144Q(this.f202642g)) {
                return false;
            }
            this.f202645j = true;
            return true;
        }

        /* JADX INFO: renamed from: H */
        public final boolean m218148H(da5 da5Var) {
            return da5Var instanceof ia5;
        }

        /* JADX INFO: renamed from: I */
        public final void m218149I() {
            zd80.this.f202637c.execute(new b());
        }

        /* JADX INFO: renamed from: J */
        public final void m218150J(fa5<da5> fa5Var, int i) {
            synchronized (this) {
                try {
                    if (this.f202641f) {
                        return;
                    }
                    fa5<da5> fa5Var2 = this.f202642g;
                    this.f202642g = fa5.m120152t(fa5Var);
                    this.f202643h = i;
                    this.f202644i = true;
                    boolean zM218147G = m218147G();
                    fa5.m120154v(fa5Var2);
                    if (zM218147G) {
                        m218149I();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.btd, p149l.ci2
        /* JADX INFO: renamed from: f */
        public void mo8521f() {
            m218142B();
        }

        @Override // p149l.btd, p149l.ci2
        /* JADX INFO: renamed from: g */
        public void mo8522g(Throwable th) {
            m218143C(th);
        }

        /* JADX INFO: renamed from: w */
        public final void m218151w() {
            boolean zM218147G;
            synchronized (this) {
                this.f202645j = false;
                zM218147G = m218147G();
            }
            if (zM218147G) {
                m218149I();
            }
        }

        /* JADX INFO: renamed from: y */
        public final void m218152y(fa5<da5> fa5Var, int i) {
            rf80.m179111b(Boolean.valueOf(fa5.m120144Q(fa5Var)));
            if (!m218148H(fa5Var.m120155B())) {
                m218144D(fa5Var, i);
                return;
            }
            this.f202638c.mo104754d(this.f202639d, "PostprocessorProducer");
            try {
                try {
                    fa5<da5> fa5VarM218146F = m218146F(fa5Var.m120155B());
                    yc90 yc90Var = this.f202638c;
                    uc90 uc90Var = this.f202639d;
                    yc90Var.mo104756f(uc90Var, "PostprocessorProducer", m218153z(yc90Var, uc90Var, this.f202640e));
                    m218144D(fa5VarM218146F, i);
                    fa5.m120154v(fa5VarM218146F);
                } catch (Exception e) {
                    yc90 yc90Var2 = this.f202638c;
                    uc90 uc90Var2 = this.f202639d;
                    yc90Var2.mo104757i(uc90Var2, "PostprocessorProducer", e, m218153z(yc90Var2, uc90Var2, this.f202640e));
                    m218143C(e);
                    fa5.m120154v(null);
                }
            } catch (Throwable th) {
                fa5.m120154v(null);
                throw th;
            }
        }

        /* JADX INFO: renamed from: z */
        public final Map<String, String> m218153z(yc90 yc90Var, uc90 uc90Var, yd80 yd80Var) {
            if (yc90Var.mo104759k(uc90Var, "PostprocessorProducer")) {
                return ImmutableMap.m8148of("Postprocessor", yd80Var.getName());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: l.zd80$b */
    public class C21661b extends btd<fa5<da5>, fa5<da5>> implements dsc0 {

        /* JADX INFO: renamed from: c */
        public boolean f202650c;

        /* JADX INFO: renamed from: d */
        public fa5<da5> f202651d;

        /* JADX INFO: renamed from: l.zd80$b$a */
        public class a extends nq2 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zd80 f202653a;

            public a(zd80 zd80Var) {
                this.f202653a = zd80Var;
            }

            @Override // p149l.nq2, p149l.vc90
            /* JADX INFO: renamed from: b */
            public void mo8497b() {
                if (C21661b.this.m218155q()) {
                    C21661b.this.m103812o().mo107034a();
                }
            }
        }

        public C21661b(C21660a c21660a, csc0 csc0Var, uc90 uc90Var) {
            super(c21660a);
            this.f202650c = false;
            this.f202651d = null;
            csc0Var.m108491c(this);
            uc90Var.mo155872q(new a(zd80.this));
        }

        @Override // p149l.btd, p149l.ci2
        /* JADX INFO: renamed from: f */
        public void mo8521f() {
            if (m218155q()) {
                m103812o().mo107034a();
            }
        }

        @Override // p149l.btd, p149l.ci2
        /* JADX INFO: renamed from: g */
        public void mo8522g(Throwable th) {
            if (m218155q()) {
                m103812o().onFailure(th);
            }
        }

        /* JADX INFO: renamed from: q */
        public final boolean m218155q() {
            synchronized (this) {
                try {
                    if (this.f202650c) {
                        return false;
                    }
                    fa5<da5> fa5Var = this.f202651d;
                    this.f202651d = null;
                    this.f202650c = true;
                    fa5.m120154v(fa5Var);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo8523h(fa5<da5> fa5Var, int i) {
            if (ci2.m107029e(i)) {
                return;
            }
            m218157s(fa5Var);
            m218158t();
        }

        /* JADX INFO: renamed from: s */
        public final void m218157s(fa5<da5> fa5Var) {
            synchronized (this) {
                try {
                    if (this.f202650c) {
                        return;
                    }
                    fa5<da5> fa5Var2 = this.f202651d;
                    this.f202651d = fa5.m120152t(fa5Var);
                    fa5.m120154v(fa5Var2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: t */
        public final void m218158t() {
            synchronized (this) {
                try {
                    if (this.f202650c) {
                        return;
                    }
                    fa5<da5> fa5VarM120152t = fa5.m120152t(this.f202651d);
                    try {
                        m103812o().mo107035b(fa5VarM120152t, 0);
                    } finally {
                        fa5.m120154v(fa5VarM120152t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.zd80$c */
    public class C21662c extends btd<fa5<da5>, fa5<da5>> {
        public C21662c(C21660a c21660a) {
            super(c21660a);
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8523h(fa5<da5> fa5Var, int i) {
            if (ci2.m107029e(i)) {
                return;
            }
            m103812o().mo107035b(fa5Var, i);
        }
    }

    public zd80(sc90<fa5<da5>> sc90Var, r480 r480Var, Executor executor) {
        this.f202635a = (sc90) rf80.m179116g(sc90Var);
        this.f202636b = r480Var;
        this.f202637c = (Executor) rf80.m179116g(executor);
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<fa5<da5>> uz5Var, uc90 uc90Var) {
        uc90 uc90Var2;
        uz5<fa5<da5>> c21662c;
        yc90 yc90VarMo155870n = uc90Var.mo155870n();
        yd80 yd80VarM8575m = uc90Var.mo155873t().m8575m();
        rf80.m179116g(yd80VarM8575m);
        C21660a c21660a = new C21660a(uz5Var, yc90VarMo155870n, yd80VarM8575m, uc90Var);
        if (yd80VarM8575m instanceof csc0) {
            uc90Var2 = uc90Var;
            c21662c = new C21661b(c21660a, (csc0) yd80VarM8575m, uc90Var2);
        } else {
            uc90Var2 = uc90Var;
            c21662c = new C21662c(c21660a);
        }
        this.f202635a.mo8485b(c21662c, uc90Var2);
    }
}
