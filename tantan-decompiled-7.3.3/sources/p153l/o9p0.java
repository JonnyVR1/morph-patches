package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Mobile;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class o9p0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC19062a f145620a;

    /* JADX INFO: renamed from: b */
    public Act f145621b;

    /* JADX INFO: renamed from: l.o9p0$a */
    public interface InterfaceC19062a {
        /* JADX INFO: renamed from: X0 */
        void mo130359X0();
    }

    public o9p0(InterfaceC19062a interfaceC19062a, Act act) {
        this.f145620a = interfaceC19062a;
        this.f145621b = act;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m166779h() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m166780i() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Boolean m166782k(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m166785A(uxj0 uxj0Var) {
        m166786B();
    }

    /* JADX INFO: renamed from: B */
    public final void m166786B() {
        InterfaceC19062a interfaceC19062a = this.f145620a;
        if (interfaceC19062a != null) {
            interfaceC19062a.mo130359X0();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m166787C() {
        this.f145621b.duringCreated(m166796r()).subscribe(dhw.m115826e(new y20() { // from class: l.d9p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85802a.m166802x((uxj0) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: D */
    public final void m166788D(Runnable runnable) {
        this.f145621b.dialog().m21502E0(R$string.f48484xh).m21499D(R$string.f48462wh).m21541l0(R$string.f47690N1, new Runnable() { // from class: l.b9p0
            @Override // java.lang.Runnable
            public final void run() {
                o9p0.m166780i();
            }
        }).m21555t0(R$string.f48264nh, runnable).m21495B(false).m21567z0();
    }

    /* JADX INFO: renamed from: E */
    public final void m166789E(Runnable runnable) {
        this.f145621b.dialog().m21502E0(R$string.f48199ki).m21499D(R$string.f48177ji).m21541l0(R$string.f47690N1, new Runnable() { // from class: l.e9p0
            @Override // java.lang.Runnable
            public final void run() {
                o9p0.m166779h();
            }
        }).m21555t0(R$string.f48265ni, runnable).m21495B(false).m21567z0();
    }

    /* JADX INFO: renamed from: F */
    public void m166790F() {
        this.f145621b.duringCreated(((urv) zrv.m221194l(htd0.f111522d)).m197667c()).filter(new qcj() { // from class: l.a9p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return o9p0.m166782k((Boolean) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.f9p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97904a.m166803y((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public void m166791G() {
        this.f145621b.duringCreated(m166797s()).flatMap(new qcj() { // from class: l.j9p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f118896a.m166804z((Boolean) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.k9p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124568a.m166785A((uxj0) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: n */
    public final void m166792n() {
        this.f145621b.duringCreated(m166797s()).subscribe(dhw.m115826e(new y20() { // from class: l.g9p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102871a.m166800v((Boolean) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: o */
    public final void m166793o() {
        this.f145621b.duringCreated(C22421c.zip(LivingNormalApiProvider.m72476N5(), LivingNormalApiProvider.m72784v7(), new rcj() { // from class: l.h9p0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new Pair((Boolean) obj, (Boolean) obj2);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.i9p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113495a.m166799u((Pair) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: p */
    public void m166794p() {
        String strM203676m6 = zrv.m221193k().m203676m6();
        if (TextUtils.equals(Mobile.TYPE, strM203676m6)) {
            m166792n();
        } else if (TextUtils.equals("realName", strM203676m6)) {
            m166793o();
        }
    }

    /* JADX INFO: renamed from: q */
    public final C22421c<uxj0> m166795q() {
        return LivingNormalApiProvider.m72378C6();
    }

    /* JADX INFO: renamed from: r */
    public final C22421c<uxj0> m166796r() {
        return LivingNormalApiProvider.m72369B6();
    }

    /* JADX INFO: renamed from: s */
    public final C22421c<Boolean> m166797s() {
        return LivingNormalApiProvider.m72784v7();
    }

    /* JADX INFO: renamed from: t */
    public final void m166798t() {
        Act act = this.f145621b;
        act.startActivity(LiveWebViewAct.m70067e2(act, efv.f93858o, LiveWebViewAct.f45697n));
    }

    /* JADX INFO: renamed from: u */
    public final void m166799u(Pair<Boolean, Boolean> pair) {
        if (((Boolean) pair.second).booleanValue() && ((Boolean) pair.first).booleanValue()) {
            m166786B();
            return;
        }
        if (((Boolean) pair.second).booleanValue()) {
            m166788D(new Runnable() { // from class: l.n9p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140932a.m166798t();
                }
            });
        } else if (((Boolean) pair.first).booleanValue()) {
            m166787C();
        } else {
            m166789E(new Runnable() { // from class: l.n9p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140932a.m166798t();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m166800v(Boolean bool) {
        if (bool.booleanValue() && !sz2.m188617e()) {
            m166786B();
            return;
        }
        if (bool.booleanValue() && sz2.m188617e()) {
            m166788D(new Runnable() { // from class: l.l9p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f130621a.m166801w();
                }
            });
        } else if (bool.booleanValue() || !sz2.m188617e()) {
            m166787C();
        } else {
            sz2.m188615c(this.f145621b, new x20() { // from class: l.m9p0
                @Override // p153l.x20
                public final void call() {
                    this.f135429a.m166787C();
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m166801w() {
        zrv.f205799a.m207683n0(this.f145621b, new x20() { // from class: l.c9p0
            @Override // p153l.x20
            public final void call() {
                this.f80512a.m166786B();
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m166802x(uxj0 uxj0Var) {
        m166786B();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m166803y(Boolean bool) {
        m166791G();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C22421c m166804z(Boolean bool) {
        return bool.booleanValue() ? C22421c.just(uxj0.f181467a) : this.f145621b.duringCreated(m166795q());
    }
}
