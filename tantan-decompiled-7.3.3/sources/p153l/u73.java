package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.widget.CompoundButton;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.dlg.IntlMemberAnimView;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p151v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes9.dex */
public class u73 {

    /* JADX INFO: renamed from: l.u73$a */
    public class DialogInterfaceOnDismissListenerC20512a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f177875a;

        public DialogInterfaceOnDismissListenerC20512a(x20 x20Var) {
            this.f177875a = x20Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            x20 x20Var = this.f177875a;
            if (x20Var != null) {
                x20Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m194803A(final Act act, float f, final x20 x20Var, final x20 x20Var2) {
        imo imoVarM140959a;
        String.format(Locale.getDefault(), " %.1f%s ", Float.valueOf(f), BaseSei.f14624X);
        l4g0 l4g0VarM204399c = w1e.m204399c("p_boost_end_view", OMSTemplateType.dialog);
        l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_self_definition_basic", "null", "anywhere", "boost_end"));
        String strString = (CoreModule.f18264c.f20318J0.m156769J3() || !pa3.m171412f()) ? act.string(R$string.f21411o) : act.string(R$string.f21408n);
        CoreModule.f18264c.f20318J0.f134527q0 = true;
        boolean zM171412f = pa3.m171412f();
        if (CoreModule.f18276o.m132214d().mo34769Vd()) {
            i4g0.m138526x("e_intl_boost_ultra_renew_btn", "p_boost_end_view");
            imoVarM140959a = new imo.C17744a(act).m140979u(act.string(R$string.f21427t0), new y20() { // from class: l.d73
                @Override // p153l.y20
                public final void call(Object obj) {
                    u73.m194817h(act, (imo) obj);
                }
            }).m140977s(Color.parseColor("#FE7E1D")).m140976r(act.string(R$string.f21393i), new y20() { // from class: l.e73
                @Override // p153l.y20
                public final void call(Object obj) {
                    x20Var2.call();
                }
            }).m140960b(true).m140961c(new y20() { // from class: l.f73
                @Override // p153l.y20
                public final void call(Object obj) {
                    u73.m194810a(x20Var, (imo) obj);
                }
            }).m140980v(new DialogInterface.OnDismissListener() { // from class: l.g73
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    u73.m194814e(x20Var, dialogInterface);
                }
            }).m140959a();
            zM171412f = false;
        } else {
            imoVarM140959a = new imo.C17744a(act).m140979u(act.string(R$string.f21393i), new y20() { // from class: l.h73
                @Override // p153l.y20
                public final void call(Object obj) {
                    x20Var2.call();
                }
            }).m140976r(act.string(R$string.f21417q), new y20() { // from class: l.i73
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.m30933P().m143405a().mo34347J6(act);
                }
            }).m140960b(true).m140961c(new y20() { // from class: l.j73
                @Override // p153l.y20
                public final void call(Object obj) {
                    u73.m194815f(x20Var, (imo) obj);
                }
            }).m140980v(new DialogInterface.OnDismissListener() { // from class: l.k73
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    u73.m194812c(x20Var, dialogInterface);
                }
            }).m140959a();
            bnl0.m105524M(imoVarM140959a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().f29756B, CoreModule.f18264c.f20318J0.m156769J3());
        }
        m194832w(imoVarM140959a, 1);
        imoVarM140959a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m46322R(act.string(R$string.f21414p)).m46321Q(strString).m46323S(gbc0.f103433x).m46320P(CoreModule.f18264c.f20318J0.m156797y3()).m46319O(CoreModule.f18264c.f20318J0.m156765C3()).m46324T(zM171412f);
        imoVarM140959a.m140957l(l4g0VarM204399c);
        imoVarM140959a.m140958m();
    }

    /* JADX INFO: renamed from: B */
    public static void m194804B(Act act) {
        CoreModule.f18264c.f20318J0.f134527q0 = true;
        final imo imoVarM140959a = new imo.C17744a(act).m140978t(act.string(R$string.f21390h)).m140960b(true).m140959a();
        m194832w(imoVarM140959a, -1);
        bnl0.m105524M(imoVarM140959a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().f29756B, false);
        bnl0.m105524M(imoVarM140959a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().f29755A, false);
        bnl0.m105524M(imoVarM140959a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().f29775o, false);
        bnl0.m105524M(imoVarM140959a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().f29768h, true ^ joa.m146354D3());
        bnl0.m105540X(imoVarM140959a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().f29769i, qa00.m175859d(177.0f));
        imoVarM140959a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m46322R(act.string(R$string.f21402l)).m46321Q(act.string(R$string.f21405m)).m46323S(gbc0.f103433x).m46325V();
        final kcg0 kcg0VarM214372p = y63.m214366j().m214372p(psd0.m173596G(new y20() { // from class: l.a73
            @Override // p153l.y20
            public final void call(Object obj) {
                u73.m194821l(imoVarM140959a, (Pair) obj);
            }
        }));
        imoVarM140959a.m140956k(new DialogInterface.OnDismissListener() { // from class: l.l73
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                u73.m194811b(kcg0VarM214372p, dialogInterface);
            }
        });
        imoVarM140959a.m140958m();
    }

    /* JADX INFO: renamed from: C */
    public static void m194805C(Act act) {
        final ugy ugyVarM195998t = new ugy.C20573a(act).m195995D(act.string(R$string.f21415p0)).m195994C(act.string(R$string.f21412o0)).m195992A(false).m196002x(act.string(R$string.f21406m0), new y20() { // from class: l.o73
            @Override // p153l.y20
            public final void call(Object obj) {
                ((ugy) obj).m195966e();
            }
        }).m195998t();
        ugyVarM195998t.m195967g().m46340F(gbc0.f103218V);
        ugyVarM195998t.m195967g().m46349R(CoreModule.m30933P().m143405a().mo34477c6());
        final kcg0 kcg0VarSubscribe = act.duringCreated(CoreModule.f18264c.f20321K0.m113317y3()).onBackpressureLatest().distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.p73
            @Override // p153l.y20
            public final void call(Object obj) {
                u73.m194828s(ugyVarM195998t, (Pair) obj);
            }
        }));
        ugyVarM195998t.m195972l(new DialogInterface.OnDismissListener() { // from class: l.q73
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                psd0.m173633z(kcg0VarSubscribe);
            }
        });
        ugyVarM195998t.m195974n();
    }

    /* JADX INFO: renamed from: D */
    public static void m194806D(Act act, final x20 x20Var, final PurchaseType purchaseType, boolean z, boolean z2) {
        ugy ugyVarM195998t = new ugy.C20573a(act).m195995D(act.string(R$string.f21396j)).m195994C(q8g0.m175782N(act.getString(m194829t(), String.format(Locale.getDefault(), " %d ", Integer.valueOf((z && pa3.m171412f()) ? m27.m156741B3() : m27.m156763z3()))), act.color(f9c0.f97859d), lyh0.m156283c(2))).m195992A(true).m196002x(act.string(R$string.f21413o1), new y20() { // from class: l.b73
            @Override // p153l.y20
            public final void call(Object obj) {
                u73.m194825p(x20Var, purchaseType, (ugy) obj);
            }
        }).m195999u(act.string(R$string.f21369a)).m196004z(CoreModule.m30933P().m143410g().mo36043Ya()).m196001w(R$string.f21362W0, z2 ? new CompoundButton.OnCheckedChangeListener() { // from class: l.c73
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                CoreModule.m30933P().m143410g().mo36077sb(z3);
            }
        } : null).m195998t();
        ugyVarM195998t.m195967g().f29812r.setTypeface(Typeface.DEFAULT);
        ugyVarM195998t.m195967g().f29817w.setTextColor(Color.parseColor("#33000000"));
        bnl0.m105505C0(ugyVarM195998t.m195967g().f29798d, qa00.m175859d(200.0f));
        m194831v(ugyVarM195998t, 1);
        if (purchaseType != null) {
            ugyVarM195998t.m195973m(CoreModule.m30933P().m143410g().mo36072ok(purchaseType));
        }
        ugyVarM195998t.m195974n();
    }

    /* JADX INFO: renamed from: E */
    public static void m194807E(Act act, final x20 x20Var, x20 x20Var2, PurchaseType purchaseType, boolean z) {
        ugy ugyVarM195998t = new ugy.C20573a(act).m195995D(act.string(R$string.f21415p0)).m195994C(m194830u(z ? act.getString(R$string.f21379d0) : act.getString(R$string.f21409n0, String.format(Locale.getDefault(), " %d ", Integer.valueOf(m27.m156743E3()))), 0, act.color(f9c0.f97859d), lyh0.m156283c(2), 0)).m195992A(false).m196002x(act.string(R$string.f21413o1), new y20() { // from class: l.r73
            @Override // p153l.y20
            public final void call(Object obj) {
                u73.m194822m(x20Var, (ugy) obj);
            }
        }).m196000v(act.string(R$string.f21369a), new y20() { // from class: l.s73
            @Override // p153l.y20
            public final void call(Object obj) {
                u73.m194808F(true, false);
            }
        }).m196004z(CoreModule.m30933P().m143410g().mo36043Ya()).m196001w(R$string.f21362W0, null).m195998t();
        ugyVarM195998t.m195967g().m46340F(gbc0.f103218V);
        ugyVarM195998t.m195967g().m46337B(CoreModule.m30933P().m143405a().mo34477c6());
        ugyVarM195998t.m195967g().m46363j0();
        ugyVarM195998t.m195967g().m46360f0(Color.parseColor("#999999"));
        if (purchaseType != null) {
            ugyVarM195998t.m195973m(CoreModule.m30933P().m143410g().mo36072ok(purchaseType));
        }
        m194808F(true, true);
        m194808F(false, true);
        ugyVarM195998t.m195972l(new DialogInterfaceOnDismissListenerC20512a(x20Var2));
        ugyVarM195998t.m195974n();
    }

    /* JADX INFO: renamed from: F */
    public static void m194808F(boolean z, boolean z2) {
        i4g0.m138520r(z ? "e_purchase_spotlight_confirm_popup_cancel" : "e_purchase_spotlight_confirm_popup_confirm", "p_purchase_spotlight_confirm_popup");
        if (z2) {
            i4g0.m138526x(z ? "e_purchase_spotlight_confirm_popup_cancel" : "e_purchase_spotlight_confirm_popup_confirm", "p_purchase_spotlight_confirm_popup");
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m194809G(IntlMemberAnimView intlMemberAnimView, String str, long j) {
        if (!joa.m146354D3()) {
            intlMemberAnimView.m46328Y(pa3.m171409c(j));
        }
        intlMemberAnimView.m46327X(CoreModule.f18264c.f20318J0.m156797y3());
        intlMemberAnimView.m46314C(String.format(Locale.getDefault(), "%s %s%s", str, intlMemberAnimView.getContext().getString(R$string.f21423s), intlMemberAnimView.getContext().getString(R$string.f21420r)));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m194810a(x20 x20Var, imo imoVar) {
        CoreModule.f18264c.f20318J0.f134527q0 = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m194811b(kcg0 kcg0Var, DialogInterface dialogInterface) {
        CoreModule.f18264c.f20318J0.f134527q0 = false;
        psd0.m173633z(kcg0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m194812c(x20 x20Var, DialogInterface dialogInterface) {
        CoreModule.f18264c.f20318J0.f134527q0 = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m194814e(x20 x20Var, DialogInterface dialogInterface) {
        CoreModule.f18264c.f20318J0.f134527q0 = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m194815f(x20 x20Var, imo imoVar) {
        CoreModule.f18264c.f20318J0.f134527q0 = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m194817h(Act act, imo imoVar) {
        i4g0.m138520r("e_intl_boost_ultra_renew_btn", "p_boost_end_view");
        CoreModule.m30933P().m143405a().mo34577r6(act, "p_boost_end_view,e_intl_boost_ultra_renew_btn,click", Privilege.full_boost, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m194821l(imo imoVar, Pair pair) {
        if (((Integer) pair.first).intValue() != 1 || !NullChecker.m82486a(pair.second)) {
            imoVar.m140951f();
            return;
        }
        IntlMemberAnimView intlMemberAnimViewM140954i = imoVar.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String();
        bkj0 bkj0Var = (bkj0) pair.second;
        m194809G(intlMemberAnimViewM140954i, (String) bkj0Var.f77081a, ((Long) bkj0Var.f77083c).longValue());
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m194822m(x20 x20Var, ugy ugyVar) {
        x20Var.call();
        m194808F(false, false);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m194823n(Privilege privilege, ugy ugyVar) {
        if (privilege == Privilege.boost) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(pzi0.m174454o()));
            int i = calendar.get(2) + 1;
            if (i != (CoreModule.f18264c.f20318J0.f134519i0.get().intValue() / 10) % 100) {
                CoreModule.f18264c.f20318J0.f134519i0.put(Integer.valueOf((i * 10) + 1001));
            } else {
                vxd0 vxd0Var = CoreModule.f18264c.f20318J0.f134519i0;
                vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m194824o(x20 x20Var, Privilege privilege, ugy ugyVar) {
        x20Var.call();
        if (privilege == Privilege.boost) {
            i4g0.m138520r("e_messages_boost_guide_confirm", "p_messages_boost_guide");
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m194825p(x20 x20Var, PurchaseType purchaseType, ugy ugyVar) {
        x20Var.call();
        if (NullChecker.m82486a(purchaseType)) {
            CoreModule.m30933P().m143410g().mo36017I8(purchaseType);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m194828s(ugy ugyVar, Pair pair) {
        if (((Integer) pair.first).intValue() != 1 || !NullChecker.m82486a(pair.second)) {
            ugyVar.m195966e();
            return;
        }
        ugyVar.m195967g().m46364k0(new SimpleDateFormat("mm:ss", Locale.getDefault()).format(new Date(((Integer) ((Pair) pair.second).second).intValue())));
    }

    /* JADX INFO: renamed from: t */
    public static int m194829t() {
        return CoreModule.m30930K().mo31838xf() ? R$string.f21416p1 : R$string.f21410n1;
    }

    /* JADX INFO: renamed from: u */
    public static SpannableStringBuilder m194830u(String str, int i, int i2, Typeface typeface, int i3) {
        Matcher matcher = Pattern.compile("-?[0-9]\\d*").matcher(str.substring(i));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i4 = 0;
        while (matcher.find()) {
            if (i4 == 0) {
                i4++;
            } else {
                spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typeface, i2, i3), matcher.start() + i, matcher.end() + i, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: v */
    public static void m194831v(ugy ugyVar, int i) {
        ugyVar.m195967g().m46338C("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlZEQ05XUTdKU1pOWFFDUktYTVFZWVRHWFFDS09YNDE0IiwidyI6NjIyLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NzE0MTgyNX0.webp").m46340F(gbc0.f103433x);
    }

    /* JADX INFO: renamed from: w */
    public static void m194832w(imo imoVar, int i) {
        imoVar.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m46313B("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlZEQ05XUTdKU1pOWFFDUktYTVFZWVRHWFFDS09YNDE0IiwidyI6NjIyLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NzE0MTgyNX0.webp");
    }

    /* JADX INFO: renamed from: x */
    public static void m194833x(Act act, String str, final x20 x20Var) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_boost_confirm_use", ugy.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", "passive"));
        ugy ugyVarM195998t = new ugy.C20573a(act).m195995D(act.string(R$string.f21396j)).m195994C(act.string(R$string.f21381e)).m196002x(str, new y20() { // from class: l.t73
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        }).m195992A(true).m195999u(act.string(R$string.f21356T0)).m195998t();
        m194831v(ugyVarM195998t, 1);
        ugyVarM195998t.m195973m(l4g0VarM204399c);
        ugyVarM195998t.m195974n();
    }

    /* JADX INFO: renamed from: y */
    public static void m194834y(Act act, x20 x20Var) {
        m194835z(act, x20Var, Privilege.boost);
    }

    /* JADX INFO: renamed from: z */
    public static void m194835z(Act act, final x20 x20Var, final Privilege privilege) {
        int iM156763z3 = m27.m156763z3();
        Privilege privilege2 = Privilege.minBoost;
        if (privilege == privilege2) {
            iM156763z3 = m27.m156742D3();
        }
        if (privilege == Privilege.boost) {
            i4g0.m138526x("e_messages_boost_guide_confirm", "p_messages_boost_guide");
            CoreModule.f18264c.f20318J0.f134516f0.put(Long.valueOf(pzi0.m174454o()));
        }
        ugy ugyVarM195998t = new ugy.C20573a(act).m195995D(act.string(privilege != privilege2 ? R$string.f21351R : R$string.f21355T)).m195994C(privilege != privilege2 ? act.getString(R$string.f21349Q) : act.getString(R$string.f21353S)).m196002x(act.string(R$string.f21345O), new y20() { // from class: l.m73
            @Override // p153l.y20
            public final void call(Object obj) {
                u73.m194824o(x20Var, privilege, (ugy) obj);
            }
        }).m196000v(act.string(R$string.f21347P), new y20() { // from class: l.n73
            @Override // p153l.y20
            public final void call(Object obj) {
                u73.m194823n(privilege, (ugy) obj);
            }
        }).m195998t();
        m194831v(ugyVarM195998t, 1);
        bnl0.m105505C0(ugyVarM195998t.m195967g().f29798d, qa00.m175859d(200.0f));
        bnl0.m105524M(ugyVarM195998t.m195967g().f29811q, false);
        if (privilege == privilege2) {
            bnl0.m105524M(ugyVarM195998t.m195967g().f29810p, false);
        } else {
            bnl0.m105524M(ugyVarM195998t.m195967g().f29810p, true);
            ugyVarM195998t.m195967g().f29812r.setText(q8g0.m175782N(act.getString(m194829t(), String.format(Locale.getDefault(), " %d ", Integer.valueOf(iM156763z3))), act.color(f9c0.f97859d), lyh0.m156283c(2)));
        }
        ugyVarM195998t.m195974n();
    }
}
