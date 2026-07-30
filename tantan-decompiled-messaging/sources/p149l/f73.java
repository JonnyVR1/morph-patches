package p149l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.widget.CompoundButton;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.dlg.IntlMemberAnimView;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p147v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes10.dex */
public class f73 {

    /* JADX INFO: renamed from: l.f73$a */
    public class DialogInterfaceOnDismissListenerC16770a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f96193a;

        public DialogInterfaceOnDismissListenerC16770a(d30 d30Var) {
            this.f96193a = d30Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            d30 d30Var = this.f96193a;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m119726A(final Act act, float f, final d30 d30Var, final d30 d30Var2) {
        iko ikoVarM136848a;
        String.format(Locale.getDefault(), " %.1f%s ", Float.valueOf(f), BaseSei.f13930X);
        cwf0 cwf0VarM133794c = i0e.m133794c("p_boost_end_view", OMSTemplateType.dialog);
        cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_self_definition_basic", "null", "anywhere", "boost_end"));
        String strString = (CoreModule.f17545c.f19576J0.m139257J3() || !aa3.m95522f()) ? act.string(R$string.f20669o) : act.string(R$string.f20666n);
        CoreModule.f17545c.f19576J0.f115765q0 = true;
        boolean zM95522f = aa3.m95522f();
        if (CoreModule.f17557o.m195057d().mo33766Vd()) {
            zvf0.m220402x("e_intl_boost_ultra_renew_btn", "p_boost_end_view");
            ikoVarM136848a = new iko.C17571a(act).m136868u(act.string(R$string.f20685t0), new e30() { // from class: l.o63
                @Override // p149l.e30
                public final void call(Object obj) {
                    f73.m119740h(act, (iko) obj);
                }
            }).m136866s(Color.parseColor("#FE7E1D")).m136865r(act.string(R$string.f20651i), new e30() { // from class: l.p63
                @Override // p149l.e30
                public final void call(Object obj) {
                    d30Var2.call();
                }
            }).m136849b(true).m136850c(new e30() { // from class: l.q63
                @Override // p149l.e30
                public final void call(Object obj) {
                    f73.m119733a(d30Var, (iko) obj);
                }
            }).m136869v(new DialogInterface.OnDismissListener() { // from class: l.r63
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    f73.m119737e(d30Var, dialogInterface);
                }
            }).m136848a();
            zM95522f = false;
        } else {
            ikoVarM136848a = new iko.C17571a(act).m136868u(act.string(R$string.f20651i), new e30() { // from class: l.s63
                @Override // p149l.e30
                public final void call(Object obj) {
                    d30Var2.call();
                }
            }).m136865r(act.string(R$string.f20675q), new e30() { // from class: l.t63
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.m29935P().m94651a().mo33344J6(act);
                }
            }).m136849b(true).m136850c(new e30() { // from class: l.u63
                @Override // p149l.e30
                public final void call(Object obj) {
                    f73.m119738f(d30Var, (iko) obj);
                }
            }).m136869v(new DialogInterface.OnDismissListener() { // from class: l.v63
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    f73.m119735c(d30Var, dialogInterface);
                }
            }).m136848a();
            xdl0.m208344M(ikoVarM136848a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().f28908B, CoreModule.f17545c.f19576J0.m139257J3());
        }
        m119755w(ikoVarM136848a, 1);
        ikoVarM136848a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m45139R(act.string(R$string.f20672p)).m45138Q(strString).m45140S(b3c0.f73182x).m45137P(CoreModule.f17545c.f19576J0.m139285y3()).m45136O(CoreModule.f17545c.f19576J0.m139253C3()).m45141T(zM95522f);
        ikoVarM136848a.m136846l(cwf0VarM133794c);
        ikoVarM136848a.m136847m();
    }

    /* JADX INFO: renamed from: B */
    public static void m119727B(Act act) {
        CoreModule.f17545c.f19576J0.f115765q0 = true;
        final iko ikoVarM136848a = new iko.C17571a(act).m136867t(act.string(R$string.f20648h)).m136849b(true).m136848a();
        m119755w(ikoVarM136848a, -1);
        xdl0.m208344M(ikoVarM136848a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().f28908B, false);
        xdl0.m208344M(ikoVarM136848a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().f28907A, false);
        xdl0.m208344M(ikoVarM136848a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().f28927o, false);
        xdl0.m208344M(ikoVarM136848a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().f28920h, true ^ xma.m210040C3());
        xdl0.m208360X(ikoVarM136848a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().f28921i, t100.m186890d(177.0f));
        ikoVarM136848a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m45139R(act.string(R$string.f20660l)).m45138Q(act.string(R$string.f20663m)).m45140S(b3c0.f73182x).m45142V();
        final c4g0 c4g0VarM139895o = j63.m139890j().m139895o(mkd0.m154955G(new e30() { // from class: l.l63
            @Override // p149l.e30
            public final void call(Object obj) {
                f73.m119744l(ikoVarM136848a, (Pair) obj);
            }
        }));
        ikoVarM136848a.m136845k(new DialogInterface.OnDismissListener() { // from class: l.w63
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                f73.m119734b(c4g0VarM139895o, dialogInterface);
            }
        });
        ikoVarM136848a.m136847m();
    }

    /* JADX INFO: renamed from: C */
    public static void m119728C(Act act) {
        final x7y x7yVarM207348t = new x7y.C21039a(act).m207345D(act.string(R$string.f20673p0)).m207344C(act.string(R$string.f20670o0)).m207342A(false).m207352x(act.string(R$string.f20664m0), new e30() { // from class: l.z63
            @Override // p149l.e30
            public final void call(Object obj) {
                ((x7y) obj).m207316e();
            }
        }).m207348t();
        x7yVarM207348t.m207317g().m45157F(b3c0.f72967V);
        x7yVarM207348t.m207317g().m45166R(CoreModule.m29935P().m94651a().mo33474c6());
        final c4g0 c4g0VarSubscribe = act.duringCreated(CoreModule.f17545c.f19579K0.m176990y3()).onBackpressureLatest().distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.a73
            @Override // p149l.e30
            public final void call(Object obj) {
                f73.m119751s(x7yVarM207348t, (Pair) obj);
            }
        }));
        x7yVarM207348t.m207322l(new DialogInterface.OnDismissListener() { // from class: l.b73
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                mkd0.m154992z(c4g0VarSubscribe);
            }
        });
        x7yVarM207348t.m207324n();
    }

    /* JADX INFO: renamed from: D */
    public static void m119729D(Act act, final d30 d30Var, final PurchaseType purchaseType, boolean z, boolean z2) {
        x7y x7yVarM207348t = new x7y.C21039a(act).m207345D(act.string(R$string.f20654j)).m207344C(i0g0.m133847N(act.getString(m119752t(), String.format(Locale.getDefault(), " %d ", Integer.valueOf((z && aa3.m95522f()) ? j17.m139229B3() : j17.m139251z3()))), act.color(z0c0.f200976d), eqh0.m117752c(2))).m207342A(true).m207352x(act.string(R$string.f20671o1), new e30() { // from class: l.m63
            @Override // p149l.e30
            public final void call(Object obj) {
                f73.m119748p(d30Var, purchaseType, (x7y) obj);
            }
        }).m207349u(act.string(R$string.f20627a)).m207354z(CoreModule.m29935P().m94656g().mo35040Ya()).m207351w(R$string.f20620W0, z2 ? new CompoundButton.OnCheckedChangeListener() { // from class: l.n63
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                CoreModule.m29935P().m94656g().mo35074sb(z3);
            }
        } : null).m207348t();
        x7yVarM207348t.m207317g().f28964r.setTypeface(Typeface.DEFAULT);
        x7yVarM207348t.m207317g().f28969w.setTextColor(Color.parseColor("#33000000"));
        xdl0.m208325C0(x7yVarM207348t.m207317g().f28950d, t100.m186890d(200.0f));
        m119754v(x7yVarM207348t, 1);
        if (purchaseType != null) {
            x7yVarM207348t.m207323m(CoreModule.m29935P().m94656g().mo35069ok(purchaseType));
        }
        x7yVarM207348t.m207324n();
    }

    /* JADX INFO: renamed from: E */
    public static void m119730E(Act act, final d30 d30Var, d30 d30Var2, PurchaseType purchaseType, boolean z) {
        x7y x7yVarM207348t = new x7y.C21039a(act).m207345D(act.string(R$string.f20673p0)).m207344C(m119753u(z ? act.getString(R$string.f20637d0) : act.getString(R$string.f20667n0, String.format(Locale.getDefault(), " %d ", Integer.valueOf(j17.m139231E3()))), 0, act.color(z0c0.f200976d), eqh0.m117752c(2), 0)).m207342A(false).m207352x(act.string(R$string.f20671o1), new e30() { // from class: l.c73
            @Override // p149l.e30
            public final void call(Object obj) {
                f73.m119745m(d30Var, (x7y) obj);
            }
        }).m207350v(act.string(R$string.f20627a), new e30() { // from class: l.d73
            @Override // p149l.e30
            public final void call(Object obj) {
                f73.m119731F(true, false);
            }
        }).m207354z(CoreModule.m29935P().m94656g().mo35040Ya()).m207351w(R$string.f20620W0, null).m207348t();
        x7yVarM207348t.m207317g().m45157F(b3c0.f72967V);
        x7yVarM207348t.m207317g().m45154B(CoreModule.m29935P().m94651a().mo33474c6());
        x7yVarM207348t.m207317g().m45180j0();
        x7yVarM207348t.m207317g().m45177f0(Color.parseColor("#999999"));
        if (purchaseType != null) {
            x7yVarM207348t.m207323m(CoreModule.m29935P().m94656g().mo35069ok(purchaseType));
        }
        m119731F(true, true);
        m119731F(false, true);
        x7yVarM207348t.m207322l(new DialogInterfaceOnDismissListenerC16770a(d30Var2));
        x7yVarM207348t.m207324n();
    }

    /* JADX INFO: renamed from: F */
    public static void m119731F(boolean z, boolean z2) {
        zvf0.m220396r(z ? "e_purchase_spotlight_confirm_popup_cancel" : "e_purchase_spotlight_confirm_popup_confirm", "p_purchase_spotlight_confirm_popup");
        if (z2) {
            zvf0.m220402x(z ? "e_purchase_spotlight_confirm_popup_cancel" : "e_purchase_spotlight_confirm_popup_confirm", "p_purchase_spotlight_confirm_popup");
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m119732G(IntlMemberAnimView intlMemberAnimView, String str, long j) {
        if (!xma.m210040C3()) {
            intlMemberAnimView.m45145Y(aa3.m95519c(j));
        }
        intlMemberAnimView.m45144X(CoreModule.f17545c.f19576J0.m139285y3());
        intlMemberAnimView.m45131C(String.format(Locale.getDefault(), "%s %s%s", str, intlMemberAnimView.getContext().getString(R$string.f20681s), intlMemberAnimView.getContext().getString(R$string.f20678r)));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m119733a(d30 d30Var, iko ikoVar) {
        CoreModule.f17545c.f19576J0.f115765q0 = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m119734b(c4g0 c4g0Var, DialogInterface dialogInterface) {
        CoreModule.f17545c.f19576J0.f115765q0 = false;
        mkd0.m154992z(c4g0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m119735c(d30 d30Var, DialogInterface dialogInterface) {
        CoreModule.f17545c.f19576J0.f115765q0 = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m119737e(d30 d30Var, DialogInterface dialogInterface) {
        CoreModule.f17545c.f19576J0.f115765q0 = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m119738f(d30 d30Var, iko ikoVar) {
        CoreModule.f17545c.f19576J0.f115765q0 = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m119740h(Act act, iko ikoVar) {
        zvf0.m220396r("e_intl_boost_ultra_renew_btn", "p_boost_end_view");
        CoreModule.m29935P().m94651a().mo33574r6(act, "p_boost_end_view,e_intl_boost_ultra_renew_btn,click", Privilege.full_boost, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m119744l(iko ikoVar, Pair pair) {
        if (((Integer) pair.first).intValue() != 1 || !NullChecker.m81303a(pair.second)) {
            ikoVar.m136840f();
            return;
        }
        IntlMemberAnimView intlMemberAnimViewM136843i = ikoVar.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String();
        xaj0 xaj0Var = (xaj0) pair.second;
        m119732G(intlMemberAnimViewM136843i, (String) xaj0Var.f191751a, ((Long) xaj0Var.f191753c).longValue());
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m119745m(d30 d30Var, x7y x7yVar) {
        d30Var.call();
        m119731F(false, false);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m119746n(Privilege privilege, x7y x7yVar) {
        if (privilege == Privilege.boost) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(mqi0.m155944o()));
            int i = calendar.get(2) + 1;
            if (i != (CoreModule.f17545c.f19576J0.f115757i0.get().intValue() / 10) % 100) {
                CoreModule.f17545c.f19576J0.f115757i0.put(Integer.valueOf((i * 10) + 1001));
            } else {
                tpd0 tpd0Var = CoreModule.f17545c.f19576J0.f115757i0;
                tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m119747o(d30 d30Var, Privilege privilege, x7y x7yVar) {
        d30Var.call();
        if (privilege == Privilege.boost) {
            zvf0.m220396r("e_messages_boost_guide_confirm", "p_messages_boost_guide");
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m119748p(d30 d30Var, PurchaseType purchaseType, x7y x7yVar) {
        d30Var.call();
        if (NullChecker.m81303a(purchaseType)) {
            CoreModule.m29935P().m94656g().mo35014I8(purchaseType);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m119751s(x7y x7yVar, Pair pair) {
        if (((Integer) pair.first).intValue() != 1 || !NullChecker.m81303a(pair.second)) {
            x7yVar.m207316e();
            return;
        }
        x7yVar.m207317g().m45181k0(new SimpleDateFormat("mm:ss", Locale.getDefault()).format(new Date(((Integer) ((Pair) pair.second).second).intValue())));
    }

    /* JADX INFO: renamed from: t */
    public static int m119752t() {
        return CoreModule.m29932K().mo30835xf() ? R$string.f20674p1 : R$string.f20668n1;
    }

    /* JADX INFO: renamed from: u */
    public static SpannableStringBuilder m119753u(String str, int i, int i2, Typeface typeface, int i3) {
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
    public static void m119754v(x7y x7yVar, int i) {
        x7yVar.m207317g().m45155C("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlZEQ05XUTdKU1pOWFFDUktYTVFZWVRHWFFDS09YNDE0IiwidyI6NjIyLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NzE0MTgyNX0.webp").m45157F(b3c0.f73182x);
    }

    /* JADX INFO: renamed from: w */
    public static void m119755w(iko ikoVar, int i) {
        ikoVar.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m45130B("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlZEQ05XUTdKU1pOWFFDUktYTVFZWVRHWFFDS09YNDE0IiwidyI6NjIyLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NzE0MTgyNX0.webp");
    }

    /* JADX INFO: renamed from: x */
    public static void m119756x(Act act, String str, final d30 d30Var) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_boost_confirm_use", x7y.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", "passive"));
        x7y x7yVarM207348t = new x7y.C21039a(act).m207345D(act.string(R$string.f20654j)).m207344C(act.string(R$string.f20639e)).m207352x(str, new e30() { // from class: l.e73
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        }).m207342A(true).m207349u(act.string(R$string.f20614T0)).m207348t();
        m119754v(x7yVarM207348t, 1);
        x7yVarM207348t.m207323m(cwf0VarM133794c);
        x7yVarM207348t.m207324n();
    }

    /* JADX INFO: renamed from: y */
    public static void m119757y(Act act, d30 d30Var) {
        m119758z(act, d30Var, Privilege.boost);
    }

    /* JADX INFO: renamed from: z */
    public static void m119758z(Act act, final d30 d30Var, final Privilege privilege) {
        int iM139251z3 = j17.m139251z3();
        Privilege privilege2 = Privilege.minBoost;
        if (privilege == privilege2) {
            iM139251z3 = j17.m139230D3();
        }
        if (privilege == Privilege.boost) {
            zvf0.m220402x("e_messages_boost_guide_confirm", "p_messages_boost_guide");
            CoreModule.f17545c.f19576J0.f115754f0.put(Long.valueOf(mqi0.m155944o()));
        }
        x7y x7yVarM207348t = new x7y.C21039a(act).m207345D(act.string(privilege != privilege2 ? R$string.f20609R : R$string.f20613T)).m207344C(privilege != privilege2 ? act.getString(R$string.f20607Q) : act.getString(R$string.f20611S)).m207352x(act.string(R$string.f20603O), new e30() { // from class: l.x63
            @Override // p149l.e30
            public final void call(Object obj) {
                f73.m119747o(d30Var, privilege, (x7y) obj);
            }
        }).m207350v(act.string(R$string.f20605P), new e30() { // from class: l.y63
            @Override // p149l.e30
            public final void call(Object obj) {
                f73.m119746n(privilege, (x7y) obj);
            }
        }).m207348t();
        m119754v(x7yVarM207348t, 1);
        xdl0.m208325C0(x7yVarM207348t.m207317g().f28950d, t100.m186890d(200.0f));
        xdl0.m208344M(x7yVarM207348t.m207317g().f28963q, false);
        if (privilege == privilege2) {
            xdl0.m208344M(x7yVarM207348t.m207317g().f28962p, false);
        } else {
            xdl0.m208344M(x7yVarM207348t.m207317g().f28962p, true);
            x7yVarM207348t.m207317g().f28964r.setText(i0g0.m133847N(act.getString(m119752t(), String.format(Locale.getDefault(), " %d ", Integer.valueOf(iM139251z3))), act.color(z0c0.f200976d), eqh0.m117752c(2)));
        }
        x7yVarM207348t.m207324n();
    }
}
