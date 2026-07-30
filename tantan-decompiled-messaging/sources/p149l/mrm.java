package p149l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.incentivevideo.IncentVideoResultAct;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
public class mrm {

    /* JADX INFO: renamed from: i */
    public static volatile mrm f135375i;

    /* JADX INFO: renamed from: c */
    public zpd0 f135378c;

    /* JADX INFO: renamed from: d */
    public hpd0 f135379d;

    /* JADX INFO: renamed from: e */
    public tpd0 f135380e;

    /* JADX INFO: renamed from: f */
    public WeakReference<Act> f135381f;

    /* JADX INFO: renamed from: a */
    public int f135376a = 0;

    /* JADX INFO: renamed from: b */
    public int f135377b = 6;

    /* JADX INFO: renamed from: g */
    public boolean f135382g = false;

    /* JADX INFO: renamed from: h */
    public s0d0 f135383h = null;

    /* JADX INFO: renamed from: l.mrm$b */
    public class C18545b extends t0d0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f135385a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f135386b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ z3g0 f135387c;

        public C18545b(String str, boolean z, z3g0 z3g0Var) {
            this.f135385a = str;
            this.f135386b = z;
            this.f135387c = z3g0Var;
        }

        @Override // p149l.i70
        /* JADX INFO: renamed from: a */
        public void mo9290a(@NonNull irv irvVar) {
            if ("ca-app-pub-6567608331519569/9203957625".equals(this.f135385a) && this.f135386b) {
                osi0.m165782f(R$string.f18325Z8);
            }
            mrm.this.f135383h = null;
            this.f135387c.m132487l(null);
        }

        @Override // p149l.i70
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo9291b(@NonNull s0d0 s0d0Var) {
            this.f135387c.m132487l(s0d0Var);
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m156038A() {
        if (NullChecker.m81303a(f135375i) && NullChecker.m81303a(f135375i.f135381f)) {
            f135375i.f135381f.clear();
            f135375i.f135381f = null;
            if (NullChecker.m81303a(f135375i.f135383h)) {
                f135375i.f135383h.mo166696c(null);
                f135375i.f135383h = null;
            }
            f135375i.f135378c = null;
            f135375i.f135380e = null;
            f135375i.f135379d = null;
            f135375i = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static mrm m156049o() {
        if (f135375i == null) {
            synchronized (mrm.class) {
                try {
                    if (f135375i == null) {
                        f135375i = new mrm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f135375i;
    }

    /* JADX INFO: renamed from: B */
    public void m156050B() {
        if (mqi0.m155929D(this.f135378c.get().longValue())) {
            return;
        }
        this.f135378c.put(Long.valueOf(mqi0.m155944o()));
        this.f135379d.put(Boolean.FALSE);
        this.f135380e.put(0);
    }

    /* JADX INFO: renamed from: C */
    public void m156051C(Act act) {
        this.f135381f = new WeakReference<>(act);
    }

    /* JADX INFO: renamed from: D */
    public void m156052D(int i) {
        this.f135376a = i;
    }

    /* JADX INFO: renamed from: E */
    public void m156053E(Integer num) {
        if (num.intValue() > 0) {
            this.f135377b = num.intValue();
        }
    }

    /* JADX INFO: renamed from: F */
    public void m156054F() {
        o6j0.m162859c("e_suggest_swipe_limit_popup_get_vip", "p_suggest_swipe_limit_popup", new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: G */
    public void m156055G() {
        o6j0.m162859c("e_suggest_swipe_limit_popup_watch_video", "p_suggest_swipe_limit_popup", new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m156056k() {
        return NullChecker.m81303a(this.f135381f) && NullChecker.m81303a(this.f135381f.get()) && !this.f135381f.get().isFinishing();
    }

    /* JADX INFO: renamed from: l */
    public boolean m156057l() {
        return NullChecker.m81303a(this.f135383h);
    }

    /* JADX INFO: renamed from: m */
    public boolean m156058m() {
        if (!u59.m191816Y()) {
            return true;
        }
        m156059n();
        if (mqi0.m155929D(this.f135378c.get().longValue())) {
            return !this.f135379d.get().booleanValue() && this.f135380e.get().intValue() < this.f135377b;
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m156059n() {
        if (this.f135378c == null) {
            this.f135378c = new zpd0("today_incentive_operation_time_" + CoreModule.m29931H().userId(), 0L);
        }
        if (this.f135380e == null) {
            this.f135380e = new tpd0("today_incentive_watch_count_" + CoreModule.m29931H().userId(), 0);
        }
        if (this.f135379d == null) {
            this.f135379d = new hpd0("today_incentive_close_" + CoreModule.m29931H().userId(), Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m156060p(boolean z, s0d0 s0d0Var) {
        if (NullChecker.m81303a(s0d0Var)) {
            this.f135383h = s0d0Var;
            if (z) {
                m156067w();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m156061q(Integer num) {
        m156052D(num.intValue());
        if (num.intValue() > 0) {
            CoreModule.f17545c.f19639e0.m169397H9();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m156062r(q0d0 q0d0Var) {
        this.f135382g = true;
        if (m156056k()) {
            CoreModule.f17545c.f19568G1.m165032g3().subscribe(mkd0.m154956H(new e30() { // from class: l.jrm
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f119424a.m156061q((Integer) obj);
                }
            }, new z60()));
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m156063s(String str, boolean z, z3g0 z3g0Var) {
        s0d0.m181858b(this.f135381f.get(), str, new w70.C20817a().m191886e(u0n.m191349g(false)).m201999i(), new C18545b(str, z, z3g0Var));
    }

    /* JADX INFO: renamed from: t */
    public int m156064t() {
        if (m156058m()) {
            return this.f135376a;
        }
        return -1;
    }

    /* JADX INFO: renamed from: u */
    public final void m156065u(final boolean z) {
        if (this.f135383h == null && m156056k()) {
            this.f135381f.get().duringCreated(m156068x("ca-app-pub-6567608331519569/9203957625", z)).subscribe(mkd0.m154955G(new e30() { // from class: l.krm
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f124373a.m156060p(z, (s0d0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v */
    public void m156066v(boolean z) {
        m156065u(z);
    }

    /* JADX INFO: renamed from: w */
    public void m156067w() {
        this.f135382g = false;
        if (!NullChecker.m81303a(this.f135383h) || !m156056k()) {
            m156065u(true);
        } else {
            this.f135383h.mo166696c(new C18544a());
            this.f135383h.mo166697d(this.f135381f.get(), new vg50() { // from class: l.irm
                @Override // p149l.vg50
                /* JADX INFO: renamed from: a */
                public final void mo137905a(q0d0 q0d0Var) {
                    this.f114657a.m156062r(q0d0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final C22306c<s0d0> m156068x(final String str, final boolean z) {
        return C22306c.create(new C22306c.a() { // from class: l.lrm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129733a.m156063s(str, z, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public void m156069y() {
        m156059n();
        m156050B();
        this.f135379d.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: z */
    public void m156070z() {
        m156059n();
        m156050B();
        tpd0 tpd0Var = this.f135380e;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: l.mrm$a */
    public class C18544a extends m9j {
        public C18544a() {
        }

        @Override // p149l.m9j
        /* JADX INFO: renamed from: b */
        public void mo153613b() {
            if (mrm.this.f135382g && mrm.this.m156056k()) {
                ((Act) mrm.this.f135381f.get()).startActivity(new Intent((Context) mrm.this.f135381f.get(), (Class<?>) IncentVideoResultAct.class));
                mrm.this.f135383h = null;
                mrm.this.f135382g = false;
            }
        }

        @Override // p149l.m9j
        /* JADX INFO: renamed from: c */
        public void mo153614c(f70 f70Var) {
            mrm.this.f135383h.mo166696c(null);
            mrm.this.f135383h = null;
        }

        @Override // p149l.m9j
        /* JADX INFO: renamed from: a */
        public void mo153612a() {
        }

        @Override // p149l.m9j
        /* JADX INFO: renamed from: d */
        public void mo153615d() {
        }

        @Override // p149l.m9j
        /* JADX INFO: renamed from: e */
        public void mo153616e() {
        }
    }
}
