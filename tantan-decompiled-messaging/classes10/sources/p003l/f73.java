package p003l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.widget.CompoundButton;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.member.R$string;
import com.p000p1.mobile.putong.core.p001ui.dlg.IntlMemberAnimView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.e30;
import l.eqh0;
import l.i0e;
import l.i0g0;
import l.j17;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.t100;
import l.tpd0;
import l.u4e;
import l.vwb;
import l.xaj0;
import l.xdl0;
import l.xma;
import l.zvf0;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f73 {

    /* JADX INFO: renamed from: l.f73$a */
    public class DialogInterfaceOnDismissListenerC3328a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f4416a;

        public DialogInterfaceOnDismissListenerC3328a(d30 d30Var) {
            this.f4416a = d30Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            d30 d30Var = this.f4416a;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m6423A(final Act act, float f, final d30 d30Var, final d30 d30Var2) {
        iko ikoVarM7256a;
        String.format(Locale.getDefault(), " %.1f%s ", Float.valueOf(f), "x");
        cwf0 cwf0VarC = i0e.c("p_boost_end_view", "dialog");
        cwf0VarC.o(u4e.b("passive", "alert", "alert_self_definition_basic", "null", "anywhere", "boost_end"));
        String strString = (CoreModule.c.J0.J3() || !aa3.m5305f()) ? act.string(R$string.f331o) : act.string(R$string.f328n);
        CoreModule.c.J0.q0 = true;
        boolean zM5305f = aa3.m5305f();
        if (CoreModule.o.d().Vd()) {
            zvf0.x("e_intl_boost_ultra_renew_btn", "p_boost_end_view");
            ikoVarM7256a = new iko.C3350a(act).m7276u(act.string(R$string.f347t0), new e30() { // from class: l.o63
                public final void call(Object obj) {
                    f73.m6437h(act, (iko) obj);
                }
            }).m7274s(Color.parseColor("#FE7E1D")).m7273r(act.string(R$string.f313i), new e30() { // from class: l.p63
                public final void call(Object obj) {
                    d30Var2.call();
                }
            }).m7257b(true).m7258c(new e30() { // from class: l.q63
                public final void call(Object obj) {
                    f73.m6430a(d30Var, (iko) obj);
                }
            }).m7277v(new DialogInterface.OnDismissListener() { // from class: l.r63
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    f73.m6434e(d30Var, dialogInterface);
                }
            }).m7256a();
            zM5305f = false;
        } else {
            ikoVarM7256a = new iko.C3350a(act).m7276u(act.string(R$string.f313i), new e30() { // from class: l.s63
                public final void call(Object obj) {
                    d30Var2.call();
                }
            }).m7273r(act.string(R$string.f337q), new e30() { // from class: l.t63
                public final void call(Object obj) {
                    CoreModule.P().a().J6(act);
                }
            }).m7257b(true).m7258c(new e30() { // from class: l.u63
                public final void call(Object obj) {
                    f73.m6435f(d30Var, (iko) obj);
                }
            }).m7277v(new DialogInterface.OnDismissListener() { // from class: l.v63
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    f73.m6432c(d30Var, dialogInterface);
                }
            }).m7256a();
            xdl0.M(ikoVarM7256a.getView().f1302B, CoreModule.c.J0.J3());
        }
        m6452w(ikoVarM7256a, 1);
        ikoVarM7256a.getView().m2456R(act.string(R$string.f334p)).m2455Q(strString).m2457S(b3c0.f3285x).m2454P(CoreModule.c.J0.y3()).m2453O(CoreModule.c.J0.C3()).m2458T(zM5305f);
        ikoVarM7256a.m7254l(cwf0VarC);
        ikoVarM7256a.m7255m();
    }

    /* JADX INFO: renamed from: B */
    public static void m6424B(Act act) {
        CoreModule.c.J0.q0 = true;
        final iko ikoVarM7256a = new iko.C3350a(act).m7275t(act.string(R$string.f310h)).m7257b(true).m7256a();
        m6452w(ikoVarM7256a, -1);
        xdl0.M(ikoVarM7256a.getView().f1302B, false);
        xdl0.M(ikoVarM7256a.getView().f1301A, false);
        xdl0.M(ikoVarM7256a.getView().f1321o, false);
        xdl0.M(ikoVarM7256a.getView().f1314h, true ^ xma.C3());
        xdl0.X(ikoVarM7256a.getView().f1315i, t100.d(177.0f));
        ikoVarM7256a.getView().m2456R(act.string(R$string.f322l)).m2455Q(act.string(R$string.f325m)).m2457S(b3c0.f3285x).m2459V();
        final c4g0 c4g0VarM7363o = j63.m7358j().m7363o(mkd0.G(new e30() { // from class: l.l63
            public final void call(Object obj) {
                f73.m6441l(ikoVarM7256a, (Pair) obj);
            }
        }));
        ikoVarM7256a.m7253k(new DialogInterface.OnDismissListener() { // from class: l.w63
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                f73.m6431b(c4g0VarM7363o, dialogInterface);
            }
        });
        ikoVarM7256a.m7255m();
    }

    /* JADX INFO: renamed from: C */
    public static void m6425C(Act act) {
        final x7y x7yVarM10690t = new x7y.C3477a(act).m10687D(act.string(R$string.f335p0)).m10686C(act.string(R$string.f332o0)).m10684A(false).m10694x(act.string(R$string.f326m0), new e30() { // from class: l.z63
            public final void call(Object obj) {
                ((x7y) obj).m10658e();
            }
        }).m10690t();
        x7yVarM10690t.m10659g().m2474F(b3c0.f3070V);
        x7yVarM10690t.m10659g().m2483R(CoreModule.P().a().c6());
        final c4g0 c4g0VarSubscribe = act.duringCreated(CoreModule.c.K0.y3()).onBackpressureLatest().distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.a73
            public final void call(Object obj) {
                f73.m6448s(x7yVarM10690t, (Pair) obj);
            }
        }));
        x7yVarM10690t.m10664l(new DialogInterface.OnDismissListener() { // from class: l.b73
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                mkd0.z(c4g0VarSubscribe);
            }
        });
        x7yVarM10690t.m10666n();
    }

    /* JADX INFO: renamed from: D */
    public static void m6426D(Act act, final d30 d30Var, final PurchaseType purchaseType, boolean z, boolean z2) {
        x7y x7yVarM10690t = new x7y.C3477a(act).m10687D(act.string(R$string.f316j)).m10686C(i0g0.N(act.getString(m6449t(), String.format(Locale.getDefault(), " %d ", Integer.valueOf((z && aa3.m5305f()) ? j17.B3() : j17.z3()))), act.color(z0c0.f9165d), eqh0.c(2))).m10684A(true).m10694x(act.string(R$string.f333o1), new e30() { // from class: l.m63
            public final void call(Object obj) {
                f73.m6445p(d30Var, purchaseType, (x7y) obj);
            }
        }).m10691u(act.string(R$string.f289a)).m10696z(CoreModule.P().g().Ya()).m10693w(R$string.f282W0, z2 ? new CompoundButton.OnCheckedChangeListener() { // from class: l.n63
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                CoreModule.P().g().sb(z3);
            }
        } : null).m10690t();
        x7yVarM10690t.m10659g().f1358r.setTypeface(Typeface.DEFAULT);
        x7yVarM10690t.m10659g().f1363w.setTextColor(Color.parseColor("#33000000"));
        xdl0.C0(x7yVarM10690t.m10659g().f1344d, t100.d(200.0f));
        m6451v(x7yVarM10690t, 1);
        if (purchaseType != null) {
            x7yVarM10690t.m10665m(CoreModule.P().g().ok(purchaseType));
        }
        x7yVarM10690t.m10666n();
    }

    /* JADX INFO: renamed from: E */
    public static void m6427E(Act act, final d30 d30Var, d30 d30Var2, PurchaseType purchaseType, boolean z) {
        x7y x7yVarM10690t = new x7y.C3477a(act).m10687D(act.string(R$string.f335p0)).m10686C(m6450u(z ? act.getString(R$string.f299d0) : act.getString(R$string.f329n0, String.format(Locale.getDefault(), " %d ", Integer.valueOf(j17.E3()))), 0, act.color(z0c0.f9165d), eqh0.c(2), 0)).m10684A(false).m10694x(act.string(R$string.f333o1), new e30() { // from class: l.c73
            public final void call(Object obj) {
                f73.m6442m(d30Var, (x7y) obj);
            }
        }).m10692v(act.string(R$string.f289a), new e30() { // from class: l.d73
            public final void call(Object obj) {
                f73.m6428F(true, false);
            }
        }).m10696z(CoreModule.P().g().Ya()).m10693w(R$string.f282W0, null).m10690t();
        x7yVarM10690t.m10659g().m2474F(b3c0.f3070V);
        x7yVarM10690t.m10659g().m2471B(CoreModule.P().a().c6());
        x7yVarM10690t.m10659g().m2497j0();
        x7yVarM10690t.m10659g().m2494f0(Color.parseColor("#999999"));
        if (purchaseType != null) {
            x7yVarM10690t.m10665m(CoreModule.P().g().ok(purchaseType));
        }
        m6428F(true, true);
        m6428F(false, true);
        x7yVarM10690t.m10664l(new DialogInterfaceOnDismissListenerC3328a(d30Var2));
        x7yVarM10690t.m10666n();
    }

    /* JADX INFO: renamed from: F */
    public static void m6428F(boolean z, boolean z2) {
        zvf0.r(z ? "e_purchase_spotlight_confirm_popup_cancel" : "e_purchase_spotlight_confirm_popup_confirm", "p_purchase_spotlight_confirm_popup");
        if (z2) {
            zvf0.x(z ? "e_purchase_spotlight_confirm_popup_cancel" : "e_purchase_spotlight_confirm_popup_confirm", "p_purchase_spotlight_confirm_popup");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static void m6429G(IntlMemberAnimView intlMemberAnimView, String str, long j) {
        if (!xma.C3()) {
            intlMemberAnimView.m2462Y(aa3.m5302c(j));
        }
        intlMemberAnimView.m2461X(CoreModule.c.J0.y3());
        intlMemberAnimView.m2448C(String.format(Locale.getDefault(), "%s %s%s", str, intlMemberAnimView.getContext().getString(R$string.f343s), intlMemberAnimView.getContext().getString(R$string.f340r)));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6430a(d30 d30Var, iko ikoVar) {
        CoreModule.c.J0.q0 = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6431b(c4g0 c4g0Var, DialogInterface dialogInterface) {
        CoreModule.c.J0.q0 = false;
        mkd0.z(c4g0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6432c(d30 d30Var, DialogInterface dialogInterface) {
        CoreModule.c.J0.q0 = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m6434e(d30 d30Var, DialogInterface dialogInterface) {
        CoreModule.c.J0.q0 = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m6435f(d30 d30Var, iko ikoVar) {
        CoreModule.c.J0.q0 = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m6437h(Act act, iko ikoVar) {
        zvf0.r("e_intl_boost_ultra_renew_btn", "p_boost_end_view");
        CoreModule.P().a().r6(act, "p_boost_end_view,e_intl_boost_ultra_renew_btn,click", Privilege.full_boost, (e30) null, (d30) null);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m6441l(iko ikoVar, Pair pair) {
        if (((Integer) pair.first).intValue() != 1 || !NullChecker.a(pair.second)) {
            ikoVar.m7248f();
            return;
        }
        IntlMemberAnimView view = ikoVar.getView();
        xaj0 xaj0Var = (xaj0) pair.second;
        m6429G(view, (String) xaj0Var.a, ((Long) xaj0Var.c).longValue());
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m6442m(d30 d30Var, x7y x7yVar) {
        d30Var.call();
        m6428F(false, false);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m6443n(Privilege privilege, x7y x7yVar) {
        if (privilege == Privilege.boost) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(mqi0.o()));
            int i = calendar.get(2) + 1;
            if (i != (((Integer) CoreModule.c.J0.i0.get()).intValue() / 10) % 100) {
                CoreModule.c.J0.i0.put(Integer.valueOf((i * 10) + 1001));
            } else {
                tpd0 tpd0Var = CoreModule.c.J0.i0;
                tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m6444o(d30 d30Var, Privilege privilege, x7y x7yVar) {
        d30Var.call();
        if (privilege == Privilege.boost) {
            zvf0.r("e_messages_boost_guide_confirm", "p_messages_boost_guide");
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m6445p(d30 d30Var, PurchaseType purchaseType, x7y x7yVar) {
        d30Var.call();
        if (NullChecker.a(purchaseType)) {
            CoreModule.P().g().I8(purchaseType);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m6448s(x7y x7yVar, Pair pair) {
        if (((Integer) pair.first).intValue() != 1 || !NullChecker.a(pair.second)) {
            x7yVar.m10658e();
            return;
        }
        x7yVar.m10659g().m2498k0(new SimpleDateFormat("mm:ss", Locale.getDefault()).format(new Date(((Integer) ((Pair) pair.second).second).intValue())));
    }

    /* JADX INFO: renamed from: t */
    public static int m6449t() {
        return CoreModule.K().m5233xf() ? R$string.f336p1 : R$string.f330n1;
    }

    /* JADX INFO: renamed from: u */
    public static SpannableStringBuilder m6450u(String str, int i, int i2, Typeface typeface, int i3) {
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
    public static void m6451v(x7y x7yVar, int i) {
        x7yVar.m10659g().m2472C("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlZEQ05XUTdKU1pOWFFDUktYTVFZWVRHWFFDS09YNDE0IiwidyI6NjIyLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NzE0MTgyNX0.webp").m2474F(b3c0.f3285x);
    }

    /* JADX INFO: renamed from: w */
    public static void m6452w(iko ikoVar, int i) {
        ikoVar.getView().m2447B("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlZEQ05XUTdKU1pOWFFDUktYTVFZWVRHWFFDS09YNDE0IiwidyI6NjIyLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NzE0MTgyNX0.webp");
    }

    /* JADX INFO: renamed from: x */
    public static void m6453x(Act act, String str, final d30 d30Var) {
        cwf0 cwf0VarC = i0e.c("p_boost_confirm_use", x7y.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "passive")});
        x7y x7yVarM10690t = new x7y.C3477a(act).m10687D(act.string(R$string.f316j)).m10686C(act.string(R$string.f301e)).m10694x(str, new e30() { // from class: l.e73
            public final void call(Object obj) {
                d30Var.call();
            }
        }).m10684A(true).m10691u(act.string(R$string.f276T0)).m10690t();
        m6451v(x7yVarM10690t, 1);
        x7yVarM10690t.m10665m(cwf0VarC);
        x7yVarM10690t.m10666n();
    }

    /* JADX INFO: renamed from: y */
    public static void m6454y(Act act, d30 d30Var) {
        m6455z(act, d30Var, Privilege.boost);
    }

    /* JADX INFO: renamed from: z */
    public static void m6455z(Act act, final d30 d30Var, final Privilege privilege) {
        int iZ3 = j17.z3();
        Privilege privilege2 = Privilege.minBoost;
        if (privilege == privilege2) {
            iZ3 = j17.D3();
        }
        if (privilege == Privilege.boost) {
            zvf0.x("e_messages_boost_guide_confirm", "p_messages_boost_guide");
            CoreModule.c.J0.f0.put(Long.valueOf(mqi0.o()));
        }
        x7y x7yVarM10690t = new x7y.C3477a(act).m10687D(act.string(privilege != privilege2 ? R$string.f271R : R$string.f275T)).m10686C(privilege != privilege2 ? act.getString(R$string.f269Q) : act.getString(R$string.f273S)).m10694x(act.string(R$string.f265O), new e30() { // from class: l.x63
            public final void call(Object obj) {
                f73.m6444o(d30Var, privilege, (x7y) obj);
            }
        }).m10692v(act.string(R$string.f267P), new e30() { // from class: l.y63
            public final void call(Object obj) {
                f73.m6443n(privilege, (x7y) obj);
            }
        }).m10690t();
        m6451v(x7yVarM10690t, 1);
        xdl0.C0(x7yVarM10690t.m10659g().f1344d, t100.d(200.0f));
        xdl0.M(x7yVarM10690t.m10659g().f1357q, false);
        if (privilege == privilege2) {
            xdl0.M(x7yVarM10690t.m10659g().f1356p, false);
        } else {
            xdl0.M(x7yVarM10690t.m10659g().f1356p, true);
            x7yVarM10690t.m10659g().f1358r.setText(i0g0.N(act.getString(m6449t(), String.format(Locale.getDefault(), " %d ", Integer.valueOf(iZ3))), act.color(z0c0.f9165d), eqh0.c(2)));
        }
        x7yVarM10690t.m10666n();
    }
}
