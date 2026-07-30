package p149l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.BusinessAnimView;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p147v.VCheckBox;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gxg0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m128592a(Runnable runnable, dj3 dj3Var) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m128593b(Runnable runnable) {
        zvf0.m220396r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        runnable.run();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m128594c(Runnable runnable) {
        zvf0.m220396r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        runnable.run();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m128595d(Runnable runnable) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m128598g(boolean[] zArr, d30 d30Var, DialogInterface dialogInterface) {
        if (zArr[0] && NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m128599h(Runnable runnable, dj3 dj3Var) {
        zvf0.m220396r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        runnable.run();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m128600i(PurchaseType purchaseType, boolean[] zArr, d30 d30Var) {
        swh0.m186205M1(purchaseType);
        zArr[0] = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m128601j(Runnable runnable, dj3 dj3Var) {
        zvf0.m220396r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        runnable.run();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m128602k(boolean[] zArr, d30 d30Var) {
        zArr[0] = true;
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m128603l(PurchaseType purchaseType, boolean[] zArr, d30 d30Var, dj3 dj3Var) {
        swh0.m186205M1(purchaseType);
        zArr[0] = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m128605n(Runnable runnable) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m128606o(boolean[] zArr, d30 d30Var, dj3 dj3Var) {
        zArr[0] = true;
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m128607p(g30 g30Var, PurchaseType purchaseType, Act act, String str) {
        CoreModule.f17545c.f19639e0.m169397H9();
        if (NullChecker.m81303a(g30Var)) {
            g30Var.mo36055a(purchaseType, act, str);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m128608q(Runnable runnable, dj3 dj3Var) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m128609r() {
    }

    /* JADX INFO: renamed from: s */
    public static void m128610s(Act act, String str, String str2, final Runnable runnable, final Runnable runnable2) {
        if (ew40.m118398j() || xma.m210049N3() || xma.m210040C3()) {
            return;
        }
        cwf0 cwf0VarM133794c = i0e.m133794c("p_superlike_first_use_view", Dialog.class.getName());
        cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_self_definition_basic", "superlike_button", "swipe_page", "tips"));
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(act.getString(R$string.f18625j2, str2), vwb.m200324f0(str2), Color.parseColor("#fe7e1d"), eqh0.m117752c(3));
        if (IntlCountryCodeController.m28126v()) {
            dd80 dd80VarM110960O = act.newDialog().m110964S(x2c0.f190246iq).m110996y0(act.getString(R$string.f18596i2)).m110991t0(act.getString(R$string.f18565h2, str)).m110974c0(act.string(R$string.f18988v), new Runnable() { // from class: l.twg0
                @Override // java.lang.Runnable
                public final void run() {
                    gxg0.m128593b(runnable);
                }
            }).m110969X(act.string(R$string.f18408c), new Runnable() { // from class: l.uwg0
                @Override // java.lang.Runnable
                public final void run() {
                    gxg0.m128605n(runnable2);
                }
            }).m110961P(false).m110960O();
            i0e.m133797f(cwf0VarM133794c);
            dd80VarM110960O.show();
        } else {
            dj3 dj3VarM112012s = new dj3.C16391a(act).m112010B(act.getString(R$string.f18596i2)).m112009A(act.getString(R$string.f18565h2, str)).m112014u(spannableStringBuilderM133861b0).m112017x(act.string(R$string.f18988v), new e30() { // from class: l.vwg0
                @Override // p149l.e30
                public final void call(Object obj) {
                    gxg0.m128601j(runnable, (dj3) obj);
                }
            }).m112015v(act.string(R$string.f18408c), new e30() { // from class: l.wwg0
                @Override // p149l.e30
                public final void call(Object obj) {
                    gxg0.m128608q(runnable2, (dj3) obj);
                }
            }).m112013t(false).m112012s();
            xdl0.m208325C0(dj3VarM112012s.m111984h().f28986c, t100.m186890d(200.0f));
            m128612u(dj3VarM112012s.m111984h());
            dj3VarM112012s.m111990n(cwf0VarM133794c);
            dj3VarM112012s.m111991o();
        }
    }

    /* JADX INFO: renamed from: t */
    public static szd m128611t(Act act, String str, String str2, final Runnable runnable, final Runnable runnable2) {
        if (!NullChecker.m81303a(act) || act.isFinishing() || act.isDestroyed()) {
            return null;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_superlike_first_use_view", Dialog.class.getName());
        cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_self_definition_basic", "superlike_button", "swipe_page", "tips"));
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(act.getString(R$string.f18625j2, str2), vwb.m200324f0(str2), Color.parseColor("#fe7e1d"), eqh0.m117752c(3));
        if (IntlCountryCodeController.m28126v()) {
            dd80 dd80VarM110960O = act.newDialog().m110964S(x2c0.f190246iq).m110996y0(act.getString(R$string.f18596i2)).m110991t0(act.getString(R$string.f18565h2, str)).m110974c0(act.string(R$string.f18988v), new Runnable() { // from class: l.fxg0
                @Override // java.lang.Runnable
                public final void run() {
                    gxg0.m128594c(runnable);
                }
            }).m110969X(act.string(R$string.f18408c), new Runnable() { // from class: l.pwg0
                @Override // java.lang.Runnable
                public final void run() {
                    gxg0.m128595d(runnable2);
                }
            }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.qwg0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i0e.m133796e(cwf0VarM133794c);
                }
            }).m110961P(false).m110958M(false).m110960O();
            i0e.m133797f(cwf0VarM133794c);
            dd80VarM110960O.show();
            return dd80VarM110960O;
        }
        dj3 dj3VarM112012s = new dj3.C16391a(act).m112010B(act.getString(R$string.f18596i2)).m112009A(act.getString(R$string.f18565h2, str)).m112014u(spannableStringBuilderM133861b0).m112017x(act.string(R$string.f18988v), new e30() { // from class: l.rwg0
            @Override // p149l.e30
            public final void call(Object obj) {
                gxg0.m128599h(runnable, (dj3) obj);
            }
        }).m112015v(act.string(R$string.f18408c), new e30() { // from class: l.swg0
            @Override // p149l.e30
            public final void call(Object obj) {
                gxg0.m128592a(runnable2, (dj3) obj);
            }
        }).m112013t(false).m112011r(false).m112012s();
        xdl0.m208325C0(dj3VarM112012s.m111984h().f28986c, t100.m186890d(200.0f));
        m128612u(dj3VarM112012s.m111984h());
        dj3VarM112012s.m111990n(cwf0VarM133794c);
        dj3VarM112012s.m111991o();
        return dj3VarM112012s.m111983g();
    }

    /* JADX INFO: renamed from: u */
    public static void m128612u(BusinessAnimView businessAnimView) {
        businessAnimView.m45209v("https://auto.tancdn.com/v1/raw/a13ffb79-a65f-45de-a9df-cd2e31d2d96209.so", 1).m45203O("https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFKTk1TSzJaRkpMT0xLRVVVNFhGT01DTDQ3SVBMSDE0IiwidyI6OTMzLCJoIjo3NjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MjM4NjgyMDAyMjMxMDQ3fQ.webp");
    }

    /* JADX INFO: renamed from: v */
    public static void m128613v(Act act, final PurchaseType purchaseType, final d30 d30Var, final d30 d30Var2, int i) {
        int iM186267u0 = swh0.m186267u0() * i;
        final boolean[] zArr = {true};
        if (!IntlCountryCodeController.m28126v()) {
            dj3 dj3VarM112012s = new dj3.C16391a(act).m112010B(act.string(R$string.f19018w)).m112009A(i0g0.m133847N(act.getString(l7n.m148814b(), String.valueOf(iM186267u0)), Color.parseColor("#fe7e1d"), eqh0.m117752c(2)).append((CharSequence) "\r\n").append((CharSequence) act.getString(l7n.m148818f()))).m112017x(act.string(R$string.f17652Cp), new e30() { // from class: l.bxg0
                @Override // p149l.e30
                public final void call(Object obj) {
                    gxg0.m128603l(purchaseType, zArr, d30Var, (dj3) obj);
                }
            }).m112015v(act.string(R$string.f18408c), new e30() { // from class: l.cxg0
                @Override // p149l.e30
                public final void call(Object obj) {
                    gxg0.m128606o(zArr, d30Var2, (dj3) obj);
                }
            }).m112018y(swh0.m186255p0().m186288K1()).m112016w(R$string.f17798Hl, new CompoundButton.OnCheckedChangeListener() { // from class: l.dxg0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    swh0.m186255p0().m186307a1(z);
                }
            }).m112019z(new DialogInterface.OnDismissListener() { // from class: l.exg0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    gxg0.m128598g(zArr, d30Var2, dialogInterface);
                }
            }).m112012s();
            xdl0.m208325C0(dj3VarM112012s.m111984h().f28986c, t100.m186890d(200.0f));
            m128612u(dj3VarM112012s.m111984h());
            dj3VarM112012s.m111990n(swh0.m186207N1(purchaseType));
            dj3VarM112012s.m111991o();
            return;
        }
        View viewInflate = act.inflater().inflate(f6c0.f95847jc, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174148Zc);
        VCheckBox vCheckBox = (VCheckBox) viewInflate.findViewById(u4c0.f174238f1);
        vCheckBox.setChecked(swh0.m186255p0().m186288K1());
        vCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ywg0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                swh0.m186255p0().m186307a1(z);
            }
        });
        vText.setText(i0g0.m133847N(act.getString(l7n.m148814b(), String.valueOf(iM186267u0)), Color.parseColor("#ff5435"), eqh0.m117752c(2)).append((CharSequence) "\r\n").append((CharSequence) act.getString(l7n.m148818f())));
        dd80 dd80VarM110960O = act.newDialog().m110963R(viewInflate).m110974c0(act.string(R$string.f17652Cp), new Runnable() { // from class: l.zwg0
            @Override // java.lang.Runnable
            public final void run() {
                gxg0.m128600i(purchaseType, zArr, d30Var);
            }
        }).m110969X(act.string(R$string.f18408c), new Runnable() { // from class: l.axg0
            @Override // java.lang.Runnable
            public final void run() {
                gxg0.m128602k(zArr, d30Var2);
            }
        }).m110960O();
        i0e.m133797f(swh0.m186207N1(purchaseType));
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: w */
    public static void m128614w(Act act, int i, d30 d30Var, d30 d30Var2) {
        m128613v(act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, d30Var, d30Var2, i - swh0.m186270v0());
    }

    /* JADX INFO: renamed from: x */
    public static void m128615x(Act act, final g30<PurchaseType, Act, String> g30Var, int i, String str) {
        swh0.m186279y1(act, str, (i - swh0.m186270v0()) * swh0.m186267u0(), new g30() { // from class: l.owg0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                gxg0.m128607p(g30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }, new d30() { // from class: l.xwg0
            @Override // p149l.d30
            public final void call() {
                gxg0.m128609r();
            }
        });
    }
}
