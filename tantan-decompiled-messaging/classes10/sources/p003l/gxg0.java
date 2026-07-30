package p003l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.BusinessAnimView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.eqh0;
import l.f6c0;
import l.g30;
import l.i0e;
import l.i0g0;
import l.l7n;
import l.swh0;
import l.szd;
import l.t100;
import l.u4c0;
import l.u4e;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.zvf0;
import v.VCheckBox;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gxg0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6874a(Runnable runnable, dj3 dj3Var) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6875b(Runnable runnable) {
        zvf0.r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        runnable.run();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6876c(Runnable runnable) {
        zvf0.r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        runnable.run();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6877d(Runnable runnable) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6880g(boolean[] zArr, d30 d30Var, DialogInterface dialogInterface) {
        if (zArr[0] && NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m6881h(Runnable runnable, dj3 dj3Var) {
        zvf0.r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        runnable.run();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m6882i(PurchaseType purchaseType, boolean[] zArr, d30 d30Var) {
        swh0.M1(purchaseType);
        zArr[0] = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m6883j(Runnable runnable, dj3 dj3Var) {
        zvf0.r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        runnable.run();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m6884k(boolean[] zArr, d30 d30Var) {
        zArr[0] = true;
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m6885l(PurchaseType purchaseType, boolean[] zArr, d30 d30Var, dj3 dj3Var) {
        swh0.M1(purchaseType);
        zArr[0] = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m6887n(Runnable runnable) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m6888o(boolean[] zArr, d30 d30Var, dj3 dj3Var) {
        zArr[0] = true;
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m6889p(g30 g30Var, PurchaseType purchaseType, Act act, String str) {
        CoreModule.c.e0.H9();
        if (NullChecker.a(g30Var)) {
            g30Var.a(purchaseType, act, str);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m6890q(Runnable runnable, dj3 dj3Var) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m6891r() {
    }

    /* JADX INFO: renamed from: s */
    public static void m6892s(Act act, String str, String str2, final Runnable runnable, final Runnable runnable2) {
        if (ew40.m6340j() || xma.N3() || xma.C3()) {
            return;
        }
        cwf0 cwf0VarC = i0e.c("p_superlike_first_use_view", Dialog.class.getName());
        cwf0VarC.o(u4e.b("passive", "alert", "alert_self_definition_basic", "superlike_button", "swipe_page", "tips"));
        SpannableStringBuilder spannableStringBuilderB0 = i0g0.b0(act.getString(R.string.j2, str2), vwb.f0(new String[]{str2}), Color.parseColor("#fe7e1d"), eqh0.c(3));
        if (IntlCountryCodeController.v()) {
            dd80 dd80VarO = act.newDialog().S(x2c0.iq).y0(act.getString(R.string.i2)).t0(act.getString(R.string.h2, str)).c0(act.string(R.string.v), new Runnable() { // from class: l.twg0
                @Override // java.lang.Runnable
                public final void run() {
                    gxg0.m6875b(runnable);
                }
            }).X(act.string(R.string.c), new Runnable() { // from class: l.uwg0
                @Override // java.lang.Runnable
                public final void run() {
                    gxg0.m6887n(runnable2);
                }
            }).P(false).O();
            i0e.f(cwf0VarC);
            dd80VarO.show();
        } else {
            dj3 dj3VarM6156s = new dj3.C3322a(act).m6154B(act.getString(R.string.i2)).m6153A(act.getString(R.string.h2, str)).m6158u(spannableStringBuilderB0).m6161x(act.string(R.string.v), new e30() { // from class: l.vwg0
                public final void call(Object obj) {
                    gxg0.m6883j(runnable, (dj3) obj);
                }
            }).m6159v(act.string(R.string.c), new e30() { // from class: l.wwg0
                public final void call(Object obj) {
                    gxg0.m6890q(runnable2, (dj3) obj);
                }
            }).m6157t(false).m6156s();
            xdl0.C0(dj3VarM6156s.m6128h().f1380c, t100.d(200.0f));
            m6894u(dj3VarM6156s.m6128h());
            dj3VarM6156s.m6134n(cwf0VarC);
            dj3VarM6156s.m6135o();
        }
    }

    /* JADX INFO: renamed from: t */
    public static szd m6893t(Act act, String str, String str2, final Runnable runnable, final Runnable runnable2) {
        if (!NullChecker.a(act) || act.isFinishing() || act.isDestroyed()) {
            return null;
        }
        final cwf0 cwf0VarC = i0e.c("p_superlike_first_use_view", Dialog.class.getName());
        cwf0VarC.o(u4e.b("passive", "alert", "alert_self_definition_basic", "superlike_button", "swipe_page", "tips"));
        SpannableStringBuilder spannableStringBuilderB0 = i0g0.b0(act.getString(R.string.j2, str2), vwb.f0(new String[]{str2}), Color.parseColor("#fe7e1d"), eqh0.c(3));
        if (IntlCountryCodeController.v()) {
            dd80 dd80VarO = act.newDialog().S(x2c0.iq).y0(act.getString(R.string.i2)).t0(act.getString(R.string.h2, str)).c0(act.string(R.string.v), new Runnable() { // from class: l.fxg0
                @Override // java.lang.Runnable
                public final void run() {
                    gxg0.m6876c(runnable);
                }
            }).X(act.string(R.string.c), new Runnable() { // from class: l.pwg0
                @Override // java.lang.Runnable
                public final void run() {
                    gxg0.m6877d(runnable2);
                }
            }).n0(new DialogInterface.OnDismissListener() { // from class: l.qwg0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i0e.e(cwf0VarC);
                }
            }).P(false).M(false).O();
            i0e.f(cwf0VarC);
            dd80VarO.show();
            return dd80VarO;
        }
        dj3 dj3VarM6156s = new dj3.C3322a(act).m6154B(act.getString(R.string.i2)).m6153A(act.getString(R.string.h2, str)).m6158u(spannableStringBuilderB0).m6161x(act.string(R.string.v), new e30() { // from class: l.rwg0
            public final void call(Object obj) {
                gxg0.m6881h(runnable, (dj3) obj);
            }
        }).m6159v(act.string(R.string.c), new e30() { // from class: l.swg0
            public final void call(Object obj) {
                gxg0.m6874a(runnable2, (dj3) obj);
            }
        }).m6157t(false).m6155r(false).m6156s();
        xdl0.C0(dj3VarM6156s.m6128h().f1380c, t100.d(200.0f));
        m6894u(dj3VarM6156s.m6128h());
        dj3VarM6156s.m6134n(cwf0VarC);
        dj3VarM6156s.m6135o();
        return dj3VarM6156s.m6127g();
    }

    /* JADX INFO: renamed from: u */
    public static void m6894u(BusinessAnimView businessAnimView) {
        businessAnimView.m2526v("https://auto.tancdn.com/v1/raw/a13ffb79-a65f-45de-a9df-cd2e31d2d96209.so", 1).m2520O("https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFKTk1TSzJaRkpMT0xLRVVVNFhGT01DTDQ3SVBMSDE0IiwidyI6OTMzLCJoIjo3NjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MjM4NjgyMDAyMjMxMDQ3fQ.webp");
    }

    /* JADX INFO: renamed from: v */
    public static void m6895v(Act act, final PurchaseType purchaseType, final d30 d30Var, final d30 d30Var2, int i) {
        int iU0 = swh0.u0() * i;
        final boolean[] zArr = {true};
        if (!IntlCountryCodeController.v()) {
            dj3 dj3VarM6156s = new dj3.C3322a(act).m6154B(act.string(R.string.w)).m6153A(i0g0.N(act.getString(l7n.b(), String.valueOf(iU0)), Color.parseColor("#fe7e1d"), eqh0.c(2)).append((CharSequence) "\r\n").append((CharSequence) act.getString(l7n.f()))).m6161x(act.string(R.string.Cp), new e30() { // from class: l.bxg0
                public final void call(Object obj) {
                    gxg0.m6885l(purchaseType, zArr, d30Var, (dj3) obj);
                }
            }).m6159v(act.string(R.string.c), new e30() { // from class: l.cxg0
                public final void call(Object obj) {
                    gxg0.m6888o(zArr, d30Var2, (dj3) obj);
                }
            }).m6162y(swh0.p0().K1()).m6160w(R.string.Hl, new CompoundButton.OnCheckedChangeListener() { // from class: l.dxg0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    swh0.p0().a1(z);
                }
            }).m6163z(new DialogInterface.OnDismissListener() { // from class: l.exg0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    gxg0.m6880g(zArr, d30Var2, dialogInterface);
                }
            }).m6156s();
            xdl0.C0(dj3VarM6156s.m6128h().f1380c, t100.d(200.0f));
            m6894u(dj3VarM6156s.m6128h());
            dj3VarM6156s.m6134n(swh0.N1(purchaseType));
            dj3VarM6156s.m6135o();
            return;
        }
        View viewInflate = act.inflater().inflate(f6c0.jc, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.Zc);
        VCheckBox vCheckBoxFindViewById = viewInflate.findViewById(u4c0.f1);
        vCheckBoxFindViewById.setChecked(swh0.p0().K1());
        vCheckBoxFindViewById.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ywg0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                swh0.p0().a1(z);
            }
        });
        vTextFindViewById.setText(i0g0.N(act.getString(l7n.b(), String.valueOf(iU0)), Color.parseColor("#ff5435"), eqh0.c(2)).append((CharSequence) "\r\n").append((CharSequence) act.getString(l7n.f())));
        dd80 dd80VarO = act.newDialog().R(viewInflate).c0(act.string(R.string.Cp), new Runnable() { // from class: l.zwg0
            @Override // java.lang.Runnable
            public final void run() {
                gxg0.m6882i(purchaseType, zArr, d30Var);
            }
        }).X(act.string(R.string.c), new Runnable() { // from class: l.axg0
            @Override // java.lang.Runnable
            public final void run() {
                gxg0.m6884k(zArr, d30Var2);
            }
        }).O();
        i0e.f(swh0.N1(purchaseType));
        dd80VarO.show();
    }

    /* JADX INFO: renamed from: w */
    public static void m6896w(Act act, int i, d30 d30Var, d30 d30Var2) {
        m6895v(act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, d30Var, d30Var2, i - swh0.v0());
    }

    /* JADX INFO: renamed from: x */
    public static void m6897x(Act act, final g30<PurchaseType, Act, String> g30Var, int i, String str) {
        swh0.y1(act, str, (i - swh0.v0()) * swh0.u0(), new g30() { // from class: l.owg0
            /* JADX INFO: renamed from: a */
            public final void m8600a(Object obj, Object obj2, Object obj3) {
                gxg0.m6889p(g30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }, new d30() { // from class: l.xwg0
            public final void call() {
                gxg0.m6891r();
            }
        });
    }
}
