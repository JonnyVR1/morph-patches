package p003l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.incentivevideo.IncentVideoResultAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import l.e30;
import l.f70;
import l.hpd0;
import l.irv;
import l.m9j;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.q0d0;
import l.s0d0;
import l.t0d0;
import l.tpd0;
import l.u0n;
import l.u59;
import l.vg50;
import l.w70;
import l.z3g0;
import l.z60;
import l.zpd0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mrm {

    /* JADX INFO: renamed from: i */
    public static volatile mrm f6407i;

    /* JADX INFO: renamed from: c */
    public zpd0 f6410c;

    /* JADX INFO: renamed from: d */
    public hpd0 f6411d;

    /* JADX INFO: renamed from: e */
    public tpd0 f6412e;

    /* JADX INFO: renamed from: f */
    public WeakReference<Act> f6413f;

    /* JADX INFO: renamed from: a */
    public int f6408a = 0;

    /* JADX INFO: renamed from: b */
    public int f6409b = 6;

    /* JADX INFO: renamed from: g */
    public boolean f6414g = false;

    /* JADX INFO: renamed from: h */
    public s0d0 f6415h = null;

    /* JADX INFO: renamed from: l.mrm$b */
    public class C3383b extends t0d0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f6417a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f6418b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ z3g0 f6419c;

        public C3383b(String str, boolean z, z3g0 z3g0Var) {
            this.f6417a = str;
            this.f6418b = z;
            this.f6419c = z3g0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m8256a(@NonNull irv irvVar) {
            if ("ca-app-pub-6567608331519569/9203957625".equals(this.f6417a) && this.f6418b) {
                osi0.f(R.string.Z8);
            }
            mrm.this.f6415h = null;
            this.f6419c.onNext((Object) null);
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m8257b(@NonNull s0d0 s0d0Var) {
            this.f6419c.onNext(s0d0Var);
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m8218A() {
        if (NullChecker.a(f6407i) && NullChecker.a(f6407i.f6413f)) {
            f6407i.f6413f.clear();
            f6407i.f6413f = null;
            if (NullChecker.a(f6407i.f6415h)) {
                f6407i.f6415h.c((m9j) null);
                f6407i.f6415h = null;
            }
            f6407i.f6410c = null;
            f6407i.f6412e = null;
            f6407i.f6411d = null;
            f6407i = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static mrm m8229o() {
        if (f6407i == null) {
            synchronized (mrm.class) {
                try {
                    if (f6407i == null) {
                        f6407i = new mrm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6407i;
    }

    /* JADX INFO: renamed from: B */
    public void m8230B() {
        if (mqi0.D(((Long) this.f6410c.get()).longValue())) {
            return;
        }
        this.f6410c.put(Long.valueOf(mqi0.o()));
        this.f6411d.put(Boolean.FALSE);
        this.f6412e.put(0);
    }

    /* JADX INFO: renamed from: C */
    public void m8231C(Act act) {
        this.f6413f = new WeakReference<>(act);
    }

    /* JADX INFO: renamed from: D */
    public void m8232D(int i) {
        this.f6408a = i;
    }

    /* JADX INFO: renamed from: E */
    public void m8233E(Integer num) {
        if (num.intValue() > 0) {
            this.f6409b = num.intValue();
        }
    }

    /* JADX INFO: renamed from: F */
    public void m8234F() {
        o6j0.m8403c("e_suggest_swipe_limit_popup_get_vip", "p_suggest_swipe_limit_popup", new o6j0.C3390a[0]);
    }

    /* JADX INFO: renamed from: G */
    public void m8235G() {
        o6j0.m8403c("e_suggest_swipe_limit_popup_watch_video", "p_suggest_swipe_limit_popup", new o6j0.C3390a[0]);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m8236k() {
        return NullChecker.a(this.f6413f) && NullChecker.a(this.f6413f.get()) && !this.f6413f.get().isFinishing();
    }

    /* JADX INFO: renamed from: l */
    public boolean m8237l() {
        return NullChecker.a(this.f6415h);
    }

    /* JADX INFO: renamed from: m */
    public boolean m8238m() {
        if (!u59.Y()) {
            return true;
        }
        m8239n();
        if (mqi0.D(((Long) this.f6410c.get()).longValue())) {
            return !((Boolean) this.f6411d.get()).booleanValue() && ((Integer) this.f6412e.get()).intValue() < this.f6409b;
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m8239n() {
        if (this.f6410c == null) {
            this.f6410c = new zpd0("today_incentive_operation_time_" + CoreModule.H().userId(), 0L);
        }
        if (this.f6412e == null) {
            this.f6412e = new tpd0("today_incentive_watch_count_" + CoreModule.H().userId(), 0);
        }
        if (this.f6411d == null) {
            this.f6411d = new hpd0("today_incentive_close_" + CoreModule.H().userId(), Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m8240p(boolean z, s0d0 s0d0Var) {
        if (NullChecker.a(s0d0Var)) {
            this.f6415h = s0d0Var;
            if (z) {
                m8247w();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m8241q(Integer num) {
        m8232D(num.intValue());
        if (num.intValue() > 0) {
            CoreModule.c.e0.H9();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m8242r(q0d0 q0d0Var) {
        this.f6414g = true;
        if (m8236k()) {
            CoreModule.c.G1.g3().subscribe(mkd0.H(new e30() { // from class: l.jrm
                public final void call(Object obj) {
                    this.f5377a.m8241q((Integer) obj);
                }
            }, new z60()));
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m8243s(String str, boolean z, z3g0 z3g0Var) {
        s0d0.b(this.f6413f.get(), str, new w70.a().e(u0n.g(false)).i(), new C3383b(str, z, z3g0Var));
    }

    /* JADX INFO: renamed from: t */
    public int m8244t() {
        if (m8238m()) {
            return this.f6408a;
        }
        return -1;
    }

    /* JADX INFO: renamed from: u */
    public final void m8245u(final boolean z) {
        if (this.f6415h == null && m8236k()) {
            this.f6413f.get().duringCreated(m8248x("ca-app-pub-6567608331519569/9203957625", z)).subscribe(mkd0.G(new e30() { // from class: l.krm
                public final void call(Object obj) {
                    this.f5701a.m8240p(z, (s0d0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v */
    public void m8246v(boolean z) {
        m8245u(z);
    }

    /* JADX INFO: renamed from: w */
    public void m8247w() {
        this.f6414g = false;
        if (!NullChecker.a(this.f6415h) || !m8236k()) {
            m8245u(true);
        } else {
            this.f6415h.c(new C3382a());
            this.f6415h.d(this.f6413f.get(), new vg50() { // from class: l.irm
                /* JADX INFO: renamed from: a */
                public final void m7291a(q0d0 q0d0Var) {
                    this.f5207a.m8242r(q0d0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final c<s0d0> m8248x(final String str, final boolean z) {
        return c.create(new c.a() { // from class: l.lrm
            public final void call(Object obj) {
                this.f6211a.m8243s(str, z, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public void m8249y() {
        m8239n();
        m8230B();
        this.f6411d.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: z */
    public void m8250z() {
        m8239n();
        m8230B();
        tpd0 tpd0Var = this.f6412e;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: l.mrm$a */
    public class C3382a extends m9j {
        public C3382a() {
        }

        /* JADX INFO: renamed from: b */
        public void m8252b() {
            if (mrm.this.f6414g && mrm.this.m8236k()) {
                ((Act) mrm.this.f6413f.get()).startActivity(new Intent((Context) mrm.this.f6413f.get(), (Class<?>) IncentVideoResultAct.class));
                mrm.this.f6415h = null;
                mrm.this.f6414g = false;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m8253c(f70 f70Var) {
            mrm.this.f6415h.c((m9j) null);
            mrm.this.f6415h = null;
        }

        /* JADX INFO: renamed from: a */
        public void m8251a() {
        }

        /* JADX INFO: renamed from: d */
        public void m8254d() {
        }

        /* JADX INFO: renamed from: e */
        public void m8255e() {
        }
    }
}
