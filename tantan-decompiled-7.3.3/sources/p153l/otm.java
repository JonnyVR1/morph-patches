package p153l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.incentivevideo.IncentVideoResultAct;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class otm {

    /* JADX INFO: renamed from: i */
    public static volatile otm f148975i;

    /* JADX INFO: renamed from: c */
    public byd0 f148978c;

    /* JADX INFO: renamed from: d */
    public jxd0 f148979d;

    /* JADX INFO: renamed from: e */
    public vxd0 f148980e;

    /* JADX INFO: renamed from: f */
    public WeakReference<Act> f148981f;

    /* JADX INFO: renamed from: a */
    public int f148976a = 0;

    /* JADX INFO: renamed from: b */
    public int f148977b = 6;

    /* JADX INFO: renamed from: g */
    public boolean f148982g = false;

    /* JADX INFO: renamed from: h */
    public v8d0 f148983h = null;

    /* JADX INFO: renamed from: l.otm$b */
    public class C19212b extends w8d0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f148985a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f148986b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gcg0 f148987c;

        public C19212b(String str, boolean z, gcg0 gcg0Var) {
            this.f148985a = str;
            this.f148986b = z;
            this.f148987c = gcg0Var;
        }

        @Override // p153l.e70
        /* JADX INFO: renamed from: a */
        public void mo9344a(@NonNull jtv jtvVar) {
            if ("ca-app-pub-6567608331519569/9203957625".equals(this.f148985a) && this.f148986b) {
                r1j0.m179419f(R$string.f19117b9);
            }
            otm.this.f148983h = null;
            this.f148987c.m137019l(null);
        }

        @Override // p153l.e70
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo9345b(@NonNull v8d0 v8d0Var) {
            this.f148987c.m137019l(v8d0Var);
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m169126A() {
        if (NullChecker.m82486a(f148975i) && NullChecker.m82486a(f148975i.f148981f)) {
            f148975i.f148981f.clear();
            f148975i.f148981f = null;
            if (NullChecker.m82486a(f148975i.f148983h)) {
                f148975i.f148983h.mo194879c(null);
                f148975i.f148983h = null;
            }
            f148975i.f148978c = null;
            f148975i.f148980e = null;
            f148975i.f148979d = null;
            f148975i = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static otm m169137o() {
        if (f148975i == null) {
            synchronized (otm.class) {
                try {
                    if (f148975i == null) {
                        f148975i = new otm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f148975i;
    }

    /* JADX INFO: renamed from: B */
    public void m169138B() {
        if (pzi0.m174439D(this.f148978c.get().longValue())) {
            return;
        }
        this.f148978c.put(Long.valueOf(pzi0.m174454o()));
        this.f148979d.put(Boolean.FALSE);
        this.f148980e.put(0);
    }

    /* JADX INFO: renamed from: C */
    public void m169139C(Act act) {
        this.f148981f = new WeakReference<>(act);
    }

    /* JADX INFO: renamed from: D */
    public void m169140D(int i) {
        this.f148976a = i;
    }

    /* JADX INFO: renamed from: E */
    public void m169141E(Integer num) {
        if (num.intValue() > 0) {
            this.f148977b = num.intValue();
        }
    }

    /* JADX INFO: renamed from: F */
    public void m169142F() {
        sfj0.m185596c("e_suggest_swipe_limit_popup_get_vip", "p_suggest_swipe_limit_popup", new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: G */
    public void m169143G() {
        sfj0.m185596c("e_suggest_swipe_limit_popup_watch_video", "p_suggest_swipe_limit_popup", new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m169144k() {
        return NullChecker.m82486a(this.f148981f) && NullChecker.m82486a(this.f148981f.get()) && !this.f148981f.get().isFinishing();
    }

    /* JADX INFO: renamed from: l */
    public boolean m169145l() {
        return NullChecker.m82486a(this.f148983h);
    }

    /* JADX INFO: renamed from: m */
    public boolean m169146m() {
        if (!d79.m114667Z()) {
            return true;
        }
        m169147n();
        if (pzi0.m174439D(this.f148978c.get().longValue())) {
            return !this.f148979d.get().booleanValue() && this.f148980e.get().intValue() < this.f148977b;
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m169147n() {
        if (this.f148978c == null) {
            this.f148978c = new byd0("today_incentive_operation_time_" + CoreModule.m30929H().userId(), 0L);
        }
        if (this.f148980e == null) {
            this.f148980e = new vxd0("today_incentive_watch_count_" + CoreModule.m30929H().userId(), 0);
        }
        if (this.f148979d == null) {
            this.f148979d = new jxd0("today_incentive_close_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m169148p(boolean z, v8d0 v8d0Var) {
        if (NullChecker.m82486a(v8d0Var)) {
            this.f148983h = v8d0Var;
            if (z) {
                m169155w();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m169149q(Integer num) {
        m169140D(num.intValue());
        if (num.intValue() > 0) {
            CoreModule.f18264c.f20381e0.m116470H9();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m169150r(t8d0 t8d0Var) {
        this.f148982g = true;
        if (m169144k()) {
            CoreModule.f18264c.f20310G1.m111580g3().subscribe(psd0.m173597H(new y20() { // from class: l.ltm
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f133554a.m169149q((Integer) obj);
                }
            }, new v60()));
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m169151s(String str, boolean z, gcg0 gcg0Var) {
        v8d0.m200297b(this.f148981f.get(), str, new s70.C19999a().m179964e(u2n.m194281g(false)).m184941i(), new C19212b(str, z, gcg0Var));
    }

    /* JADX INFO: renamed from: t */
    public int m169152t() {
        if (m169146m()) {
            return this.f148976a;
        }
        return -1;
    }

    /* JADX INFO: renamed from: u */
    public final void m169153u(final boolean z) {
        if (this.f148983h == null && m169144k()) {
            this.f148981f.get().duringCreated(m169156x("ca-app-pub-6567608331519569/9203957625", z)).subscribe(psd0.m173596G(new y20() { // from class: l.mtm
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f138639a.m169148p(z, (v8d0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v */
    public void m169154v(boolean z) {
        m169153u(z);
    }

    /* JADX INFO: renamed from: w */
    public void m169155w() {
        this.f148982g = false;
        if (!NullChecker.m82486a(this.f148983h) || !m169144k()) {
            m169153u(true);
        } else {
            this.f148983h.mo194879c(new C19211a());
            this.f148983h.mo194880d(this.f148981f.get(), new bp50() { // from class: l.ktm
                @Override // p153l.bp50
                /* JADX INFO: renamed from: a */
                public final void mo105787a(t8d0 t8d0Var) {
                    this.f128718a.m169150r(t8d0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final C22421c<v8d0> m169156x(final String str, final boolean z) {
        return C22421c.create(new C22421c.a() { // from class: l.ntm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143612a.m169151s(str, z, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public void m169157y() {
        m169147n();
        m169138B();
        this.f148979d.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: z */
    public void m169158z() {
        m169147n();
        m169138B();
        vxd0 vxd0Var = this.f148980e;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: l.otm$a */
    public class C19211a extends gcj {
        public C19211a() {
        }

        @Override // p153l.gcj
        /* JADX INFO: renamed from: b */
        public void mo114320b() {
            if (otm.this.f148982g && otm.this.m169144k()) {
                ((Act) otm.this.f148981f.get()).startActivity(new Intent((Context) otm.this.f148981f.get(), (Class<?>) IncentVideoResultAct.class));
                otm.this.f148983h = null;
                otm.this.f148982g = false;
            }
        }

        @Override // p153l.gcj
        /* JADX INFO: renamed from: c */
        public void mo129891c(b70 b70Var) {
            otm.this.f148983h.mo194879c(null);
            otm.this.f148983h = null;
        }

        @Override // p153l.gcj
        /* JADX INFO: renamed from: a */
        public void mo129890a() {
        }

        @Override // p153l.gcj
        /* JADX INFO: renamed from: d */
        public void mo129892d() {
        }

        @Override // p153l.gcj
        /* JADX INFO: renamed from: e */
        public void mo114321e() {
        }
    }
}
