package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Mobile;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class k0p0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC17900a f120508a;

    /* JADX INFO: renamed from: b */
    public Act f120509b;

    /* JADX INFO: renamed from: l.k0p0$a */
    public interface InterfaceC17900a {
        /* JADX INFO: renamed from: X0 */
        void mo105874X0();
    }

    public k0p0(InterfaceC17900a interfaceC17900a, Act act) {
        this.f120508a = interfaceC17900a;
        this.f120509b = act;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m144097h() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m144098i() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Boolean m144100k(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m144103A(roj0 roj0Var) {
        m144104B();
    }

    /* JADX INFO: renamed from: B */
    public final void m144104B() {
        InterfaceC17900a interfaceC17900a = this.f120508a;
        if (interfaceC17900a != null) {
            interfaceC17900a.mo105874X0();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m144105C() {
        this.f120509b.duringCreated(m144114r()).subscribe(ffw.m121194e(new e30() { // from class: l.zzo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205813a.m144120x((roj0) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: D */
    public final void m144106D(Runnable runnable) {
        this.f120509b.dialog().m20503E0(R$string.f47636xh).m20500D(R$string.f47614wh).m20542l0(R$string.f46842N1, new Runnable() { // from class: l.xzo0
            @Override // java.lang.Runnable
            public final void run() {
                k0p0.m144098i();
            }
        }).m20556t0(R$string.f47416nh, runnable).m20496B(false).m20568z0();
    }

    /* JADX INFO: renamed from: E */
    public final void m144107E(Runnable runnable) {
        this.f120509b.dialog().m20503E0(R$string.f47351ki).m20500D(R$string.f47329ji).m20542l0(R$string.f46842N1, new Runnable() { // from class: l.a0p0
            @Override // java.lang.Runnable
            public final void run() {
                k0p0.m144097h();
            }
        }).m20556t0(R$string.f47417ni, runnable).m20496B(false).m20568z0();
    }

    /* JADX INFO: renamed from: F */
    public void m144108F() {
        this.f120509b.duringCreated(((tpv) ypv.m215673l(fld0.f98149d)).m190064c()).filter(new w9j() { // from class: l.wzo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return k0p0.m144100k((Boolean) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.b0p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72453a.m144121y((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public void m144109G() {
        this.f120509b.duringCreated(m144115s()).flatMap(new w9j() { // from class: l.f0p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93996a.m144122z((Boolean) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.g0p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100072a.m144103A((roj0) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: n */
    public final void m144110n() {
        this.f120509b.duringCreated(m144115s()).subscribe(ffw.m121194e(new e30() { // from class: l.c0p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78164a.m144118v((Boolean) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: o */
    public final void m144111o() {
        this.f120509b.duringCreated(C22306c.zip(LivingNormalApiProvider.m71293N5(), LivingNormalApiProvider.m71601v7(), new x9j() { // from class: l.d0p0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new Pair((Boolean) obj, (Boolean) obj2);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.e0p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88664a.m144117u((Pair) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: p */
    public void m144112p() {
        String strM195889m6 = ypv.m215672k().m195889m6();
        if (TextUtils.equals(Mobile.TYPE, strM195889m6)) {
            m144110n();
        } else if (TextUtils.equals("realName", strM195889m6)) {
            m144111o();
        }
    }

    /* JADX INFO: renamed from: q */
    public final C22306c<roj0> m144113q() {
        return LivingNormalApiProvider.m71195C6();
    }

    /* JADX INFO: renamed from: r */
    public final C22306c<roj0> m144114r() {
        return LivingNormalApiProvider.m71186B6();
    }

    /* JADX INFO: renamed from: s */
    public final C22306c<Boolean> m144115s() {
        return LivingNormalApiProvider.m71601v7();
    }

    /* JADX INFO: renamed from: t */
    public final void m144116t() {
        Act act = this.f120509b;
        act.startActivity(LiveWebViewAct.m68884d2(act, ddv.f85665o, LiveWebViewAct.f44849n));
    }

    /* JADX INFO: renamed from: u */
    public final void m144117u(Pair<Boolean, Boolean> pair) {
        if (((Boolean) pair.second).booleanValue() && ((Boolean) pair.first).booleanValue()) {
            m144104B();
            return;
        }
        if (((Boolean) pair.second).booleanValue()) {
            m144106D(new Runnable() { // from class: l.j0p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115699a.m144116t();
                }
            });
        } else if (((Boolean) pair.first).booleanValue()) {
            m144105C();
        } else {
            m144107E(new Runnable() { // from class: l.j0p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115699a.m144116t();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m144118v(Boolean bool) {
        if (bool.booleanValue() && !dz2.m114109e()) {
            m144104B();
            return;
        }
        if (bool.booleanValue() && dz2.m114109e()) {
            m144106D(new Runnable() { // from class: l.h0p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f105234a.m144119w();
                }
            });
        } else if (bool.booleanValue() || !dz2.m114109e()) {
            m144105C();
        } else {
            dz2.m114107c(this.f120509b, new d30() { // from class: l.i0p0
                @Override // p149l.d30
                public final void call() {
                    this.f110370a.m144105C();
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m144119w() {
        ypv.f199493a.m199361n0(this.f120509b, new d30() { // from class: l.yzo0
            @Override // p149l.d30
            public final void call() {
                this.f200904a.m144104B();
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m144120x(roj0 roj0Var) {
        m144104B();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m144121y(Boolean bool) {
        m144109G();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C22306c m144122z(Boolean bool) {
        return bool.booleanValue() ? C22306c.just(roj0.f160388a) : this.f120509b.duringCreated(m144113q());
    }
}
