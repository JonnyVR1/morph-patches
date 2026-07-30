package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.BusinessAnimView;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p151v.VCheckBox;
import p151v.VText;

/* JADX INFO: loaded from: classes2.dex */
public class o5h0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m166128a(Runnable runnable, tj3 tj3Var) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m166129b(Runnable runnable) {
        i4g0.m138520r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        runnable.run();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m166130c(Runnable runnable) {
        i4g0.m138520r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        runnable.run();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m166131d(Runnable runnable) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m166134g(boolean[] zArr, x20 x20Var, DialogInterface dialogInterface) {
        if (zArr[0] && NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m166135h(Runnable runnable, tj3 tj3Var) {
        i4g0.m138520r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        runnable.run();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m166136i(PurchaseType purchaseType, boolean[] zArr, x20 x20Var) {
        a5i0.m96110M1(purchaseType);
        zArr[0] = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m166137j(Runnable runnable, tj3 tj3Var) {
        i4g0.m138520r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        runnable.run();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m166138k(boolean[] zArr, x20 x20Var) {
        zArr[0] = true;
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m166139l(PurchaseType purchaseType, boolean[] zArr, x20 x20Var, tj3 tj3Var) {
        a5i0.m96110M1(purchaseType);
        zArr[0] = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m166141n(Runnable runnable) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m166142o(boolean[] zArr, x20 x20Var, tj3 tj3Var) {
        zArr[0] = true;
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m166143p(a30 a30Var, PurchaseType purchaseType, Act act, String str) {
        CoreModule.f18264c.f20381e0.m116470H9();
        if (NullChecker.m82486a(a30Var)) {
            a30Var.mo37058a(purchaseType, act, str);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m166144q(Runnable runnable, tj3 tj3Var) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m166145r() {
    }

    /* JADX INFO: renamed from: s */
    public static void m166146s(Act act, String str, String str2, final Runnable runnable, final Runnable runnable2) {
        if (t450.m189175j() || joa.m146363O3() || joa.m146354D3()) {
            return;
        }
        l4g0 l4g0VarM204399c = w1e.m204399c("p_superlike_first_use_view", Dialog.class.getName());
        l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_self_definition_basic", "superlike_button", "swipe_page", "tips"));
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(act.getString(R$string.f19355j2, str2), jyb.m147507f0(str2), Color.parseColor("#fe7e1d"), lyh0.m156283c(3));
        if (IntlCountryCodeController.m29125v()) {
            jl80 jl80VarM146020O = act.newDialog().m146024S(dbc0.f86707Wq).m146056y0(act.getString(R$string.f19326i2)).m146051t0(act.getString(R$string.f19295h2, str)).m146034c0(act.string(R$string.f19724v), new Runnable() { // from class: l.b5h0
                @Override // java.lang.Runnable
                public final void run() {
                    o5h0.m166129b(runnable);
                }
            }).m146029X(act.string(R$string.f19138c), new Runnable() { // from class: l.c5h0
                @Override // java.lang.Runnable
                public final void run() {
                    o5h0.m166141n(runnable2);
                }
            }).m146021P(false).m146020O();
            w1e.m204402f(l4g0VarM204399c);
            jl80VarM146020O.show();
        } else {
            tj3 tj3VarM191397s = new tj3.C20332a(act).m191395B(act.getString(R$string.f19326i2)).m191394A(act.getString(R$string.f19295h2, str)).m191399u(spannableStringBuilderM175796b0).m191402x(act.string(R$string.f19724v), new y20() { // from class: l.d5h0
                @Override // p153l.y20
                public final void call(Object obj) {
                    o5h0.m166137j(runnable, (tj3) obj);
                }
            }).m191400v(act.string(R$string.f19138c), new y20() { // from class: l.e5h0
                @Override // p153l.y20
                public final void call(Object obj) {
                    o5h0.m166144q(runnable2, (tj3) obj);
                }
            }).m191398t(false).m191397s();
            bnl0.m105505C0(tj3VarM191397s.m191369h().f29834c, qa00.m175859d(200.0f));
            m166148u(tj3VarM191397s.m191369h());
            tj3VarM191397s.m191375n(l4g0VarM204399c);
            tj3VarM191397s.m191376o();
        }
    }

    /* JADX INFO: renamed from: t */
    public static g1e m166147t(Act act, String str, String str2, final Runnable runnable, final Runnable runnable2) {
        if (!NullChecker.m82486a(act) || act.isFinishing() || act.isDestroyed()) {
            return null;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_superlike_first_use_view", Dialog.class.getName());
        l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_self_definition_basic", "superlike_button", "swipe_page", "tips"));
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(act.getString(R$string.f19355j2, str2), jyb.m147507f0(str2), Color.parseColor("#fe7e1d"), lyh0.m156283c(3));
        if (IntlCountryCodeController.m29125v()) {
            jl80 jl80VarM146020O = act.newDialog().m146024S(dbc0.f86707Wq).m146056y0(act.getString(R$string.f19326i2)).m146051t0(act.getString(R$string.f19295h2, str)).m146034c0(act.string(R$string.f19724v), new Runnable() { // from class: l.n5h0
                @Override // java.lang.Runnable
                public final void run() {
                    o5h0.m166130c(runnable);
                }
            }).m146029X(act.string(R$string.f19138c), new Runnable() { // from class: l.x4h0
                @Override // java.lang.Runnable
                public final void run() {
                    o5h0.m166131d(runnable2);
                }
            }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.y4h0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    w1e.m204401e(l4g0VarM204399c);
                }
            }).m146021P(false).m146018M(false).m146020O();
            w1e.m204402f(l4g0VarM204399c);
            jl80VarM146020O.show();
            return jl80VarM146020O;
        }
        tj3 tj3VarM191397s = new tj3.C20332a(act).m191395B(act.getString(R$string.f19326i2)).m191394A(act.getString(R$string.f19295h2, str)).m191399u(spannableStringBuilderM175796b0).m191402x(act.string(R$string.f19724v), new y20() { // from class: l.z4h0
            @Override // p153l.y20
            public final void call(Object obj) {
                o5h0.m166135h(runnable, (tj3) obj);
            }
        }).m191400v(act.string(R$string.f19138c), new y20() { // from class: l.a5h0
            @Override // p153l.y20
            public final void call(Object obj) {
                o5h0.m166128a(runnable2, (tj3) obj);
            }
        }).m191398t(false).m191396r(false).m191397s();
        bnl0.m105505C0(tj3VarM191397s.m191369h().f29834c, qa00.m175859d(200.0f));
        m166148u(tj3VarM191397s.m191369h());
        tj3VarM191397s.m191375n(l4g0VarM204399c);
        tj3VarM191397s.m191376o();
        return tj3VarM191397s.m191368g();
    }

    /* JADX INFO: renamed from: u */
    public static void m166148u(BusinessAnimView businessAnimView) {
        businessAnimView.m46392v("https://auto.tancdn.com/v1/raw/a13ffb79-a65f-45de-a9df-cd2e31d2d96209.so", 1).m46386O("https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFKTk1TSzJaRkpMT0xLRVVVNFhGT01DTDQ3SVBMSDE0IiwidyI6OTMzLCJoIjo3NjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MjM4NjgyMDAyMjMxMDQ3fQ.webp");
    }

    /* JADX INFO: renamed from: v */
    public static void m166149v(Act act, final PurchaseType purchaseType, final x20 x20Var, final x20 x20Var2, int i) {
        int iM96172u0 = a5i0.m96172u0() * i;
        final boolean[] zArr = {true};
        if (!IntlCountryCodeController.m29125v()) {
            tj3 tj3VarM191397s = new tj3.C20332a(act).m191395B(act.string(R$string.f19755w)).m191394A(q8g0.m175782N(act.getString(l9n.m153437b(), String.valueOf(iM96172u0)), Color.parseColor("#fe7e1d"), lyh0.m156283c(2)).append((CharSequence) "\r\n").append((CharSequence) act.getString(l9n.m153441f()))).m191402x(act.string(R$string.f19012Xp), new y20() { // from class: l.j5h0
                @Override // p153l.y20
                public final void call(Object obj) {
                    o5h0.m166139l(purchaseType, zArr, x20Var, (tj3) obj);
                }
            }).m191400v(act.string(R$string.f19138c), new y20() { // from class: l.k5h0
                @Override // p153l.y20
                public final void call(Object obj) {
                    o5h0.m166142o(zArr, x20Var2, (tj3) obj);
                }
            }).m191403y(a5i0.m96160p0().m96193K1()).m191401w(R$string.f19192dm, new CompoundButton.OnCheckedChangeListener() { // from class: l.l5h0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    a5i0.m96160p0().m96212a1(z);
                }
            }).m191404z(new DialogInterface.OnDismissListener() { // from class: l.m5h0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    o5h0.m166134g(zArr, x20Var2, dialogInterface);
                }
            }).m191397s();
            bnl0.m105505C0(tj3VarM191397s.m191369h().f29834c, qa00.m175859d(200.0f));
            m166148u(tj3VarM191397s.m191369h());
            tj3VarM191397s.m191375n(a5i0.m96112N1(purchaseType));
            tj3VarM191397s.m191376o();
            return;
        }
        View viewInflate = act.inflater().inflate(kec0.f126020qc, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f70273bd);
        VCheckBox vCheckBox = (VCheckBox) viewInflate.findViewById(adc0.f70329f1);
        vCheckBox.setChecked(a5i0.m96160p0().m96193K1());
        vCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.g5h0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                a5i0.m96160p0().m96212a1(z);
            }
        });
        vText.setText(q8g0.m175782N(act.getString(l9n.m153437b(), String.valueOf(iM96172u0)), Color.parseColor("#ff5435"), lyh0.m156283c(2)).append((CharSequence) "\r\n").append((CharSequence) act.getString(l9n.m153441f())));
        jl80 jl80VarM146020O = act.newDialog().m146023R(viewInflate).m146034c0(act.string(R$string.f19012Xp), new Runnable() { // from class: l.h5h0
            @Override // java.lang.Runnable
            public final void run() {
                o5h0.m166136i(purchaseType, zArr, x20Var);
            }
        }).m146029X(act.string(R$string.f19138c), new Runnable() { // from class: l.i5h0
            @Override // java.lang.Runnable
            public final void run() {
                o5h0.m166138k(zArr, x20Var2);
            }
        }).m146020O();
        w1e.m204402f(a5i0.m96112N1(purchaseType));
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: w */
    public static void m166150w(Act act, int i, x20 x20Var, x20 x20Var2) {
        m166149v(act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, x20Var, x20Var2, i - a5i0.m96175v0());
    }

    /* JADX INFO: renamed from: x */
    public static void m166151x(Act act, final a30<PurchaseType, Act, String> a30Var, int i, String str) {
        a5i0.m96184y1(act, str, (i - a5i0.m96175v0()) * a5i0.m96172u0(), new a30() { // from class: l.w4h0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                o5h0.m166143p(a30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }, new x20() { // from class: l.f5h0
            @Override // p153l.x20
            public final void call() {
                o5h0.m166145r();
            }
        });
    }
}
