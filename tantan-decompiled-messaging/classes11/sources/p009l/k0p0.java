package p009l;

import android.text.TextUtils;
import android.util.Pair;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import l.d30;
import l.ddv;
import l.dz2;
import l.e30;
import l.ffw;
import l.roj0;
import l.w9j;
import l.x9j;
import l.z2k;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class k0p0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC0981a f15380a;

    /* JADX INFO: renamed from: b */
    public Act f15381b;

    /* JADX INFO: renamed from: l.k0p0$a */
    public interface InterfaceC0981a {
        /* JADX INFO: renamed from: X0 */
        void mo12440X0();
    }

    public k0p0(InterfaceC0981a interfaceC0981a, Act act) {
        this.f15380a = interfaceC0981a;
        this.f15381b = act;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m17247h() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m17248i() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Boolean m17250k(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m17253A(roj0 roj0Var) {
        m17254B();
    }

    /* JADX INFO: renamed from: B */
    public final void m17254B() {
        InterfaceC0981a interfaceC0981a = this.f15380a;
        if (interfaceC0981a != null) {
            interfaceC0981a.mo12440X0();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m17255C() {
        this.f15381b.duringCreated(m17264r()).subscribe(ffw.e(new e30() { // from class: l.zzo0
            public final void call(Object obj) {
                this.f24057a.m17270x((roj0) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: D */
    public final void m17256D(Runnable runnable) {
        this.f15381b.dialog().E0(R.string.xh).D(R.string.wh).l0(R.string.N1, new Runnable() { // from class: l.xzo0
            @Override // java.lang.Runnable
            public final void run() {
                k0p0.m17248i();
            }
        }).t0(R.string.nh, runnable).B(false).z0();
    }

    /* JADX INFO: renamed from: E */
    public final void m17257E(Runnable runnable) {
        this.f15381b.dialog().E0(R.string.ki).D(R.string.ji).l0(R.string.N1, new Runnable() { // from class: l.a0p0
            @Override // java.lang.Runnable
            public final void run() {
                k0p0.m17247h();
            }
        }).t0(R.string.ni, runnable).B(false).z0();
    }

    /* JADX INFO: renamed from: F */
    public void m17258F() {
        this.f15381b.duringCreated(((tpv) ypv.m25491l(fld0.f13078d)).m22618c()).filter(new w9j() { // from class: l.wzo0
            public final Object call(Object obj) {
                return k0p0.m17250k((Boolean) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.b0p0
            public final void call(Object obj) {
                this.f9785a.m17271y((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public void m17259G() {
        this.f15381b.duringCreated(m17265s()).flatMap(new w9j() { // from class: l.f0p0
            public final Object call(Object obj) {
                return this.f12745a.m17272z((Boolean) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.g0p0
            public final void call(Object obj) {
                this.f13257a.m17253A((roj0) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: n */
    public final void m17260n() {
        this.f15381b.duringCreated(m17265s()).subscribe(ffw.e(new e30() { // from class: l.c0p0
            public final void call(Object obj) {
                this.f10373a.m17268v((Boolean) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: o */
    public final void m17261o() {
        this.f15381b.duringCreated(c.zip(LivingNormalApiProvider.N5(), LivingNormalApiProvider.v7(), new x9j() { // from class: l.d0p0
            public final Object call(Object obj, Object obj2) {
                return new Pair((Boolean) obj, (Boolean) obj2);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.e0p0
            public final void call(Object obj) {
                this.f12133a.m17267u((Pair) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: p */
    public void m17262p() {
        String strM6 = ypv.m25490k().m6();
        if (TextUtils.equals("mobile", strM6)) {
            m17260n();
        } else if (TextUtils.equals("realName", strM6)) {
            m17261o();
        }
    }

    /* JADX INFO: renamed from: q */
    public final c<roj0> m17263q() {
        return LivingNormalApiProvider.C6();
    }

    /* JADX INFO: renamed from: r */
    public final c<roj0> m17264r() {
        return LivingNormalApiProvider.B6();
    }

    /* JADX INFO: renamed from: s */
    public final c<Boolean> m17265s() {
        return LivingNormalApiProvider.v7();
    }

    /* JADX INFO: renamed from: t */
    public final void m17266t() {
        Act act = this.f15381b;
        act.startActivity(LiveWebViewAct.d2(act, ddv.o, LiveWebViewAct.n));
    }

    /* JADX INFO: renamed from: u */
    public final void m17267u(Pair<Boolean, Boolean> pair) {
        if (((Boolean) pair.second).booleanValue() && ((Boolean) pair.first).booleanValue()) {
            m17254B();
            return;
        }
        if (((Boolean) pair.second).booleanValue()) {
            m17256D(new Runnable() { // from class: l.j0p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14884a.m17266t();
                }
            });
        } else if (((Boolean) pair.first).booleanValue()) {
            m17255C();
        } else {
            m17257E(new Runnable() { // from class: l.j0p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14884a.m17266t();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m17268v(Boolean bool) {
        if (bool.booleanValue() && !dz2.e()) {
            m17254B();
            return;
        }
        if (bool.booleanValue() && dz2.e()) {
            m17256D(new Runnable() { // from class: l.h0p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13831a.m17269w();
                }
            });
        } else if (bool.booleanValue() || !dz2.e()) {
            m17255C();
        } else {
            dz2.c(this.f15381b, new d30() { // from class: l.i0p0
                public final void call() {
                    this.f14369a.m17255C();
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m17269w() {
        ypv.f23196a.m23671n0(this.f15381b, new d30() { // from class: l.yzo0
            public final void call() {
                this.f23308a.m17254B();
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m17270x(roj0 roj0Var) {
        m17254B();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m17271y(Boolean bool) {
        m17259G();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ c m17272z(Boolean bool) {
        return bool.booleanValue() ? c.just(roj0.a) : this.f15381b.duringCreated(m17263q());
    }
}
