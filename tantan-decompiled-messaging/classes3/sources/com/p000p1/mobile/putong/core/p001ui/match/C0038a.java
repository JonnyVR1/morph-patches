package com.p000p1.mobile.putong.core.p001ui.match;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.match.C0038a;
import com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPickerAct;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.IntlUltraPremiumConfig;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.ark;
import l.hpd0;
import l.lsi0;
import l.mah0;
import l.mkd0;
import l.mqi0;
import l.mvm;
import l.nkp;
import l.qqi0;
import l.t100;
import l.tpd0;
import l.u59;
import l.vwb;
import l.w0c0;
import l.xma;
import l.xp5;
import l.zpd0;
import org.spongycastle.asn1.eac.EACTags;
import p003l.d30;
import p003l.e30;
import p003l.g30;
import p003l.m250;
import p003l.npo;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C0038a {

    /* JADX INFO: renamed from: d */
    public static C0038a f365d;

    /* JADX INFO: renamed from: a */
    public boolean f366a;

    /* JADX INFO: renamed from: b */
    public boolean f367b;

    /* JADX INFO: renamed from: c */
    public boolean f368c;

    /* JADX INFO: renamed from: O */
    public static void m638O() {
        f365d = null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m641c(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m643e(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m645g(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m648j(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m649k(Act act, User user, d30 d30Var) {
        act.startActivityWithCustomTransition(MatchAct.m617e2(act, vwb.f0(new String[]{((DbObject) user).id}), 51, new ArrayList()), new MatchAct.C0037b());
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m651m(String str, User user, d30 d30Var, Envelope envelope) {
        if (TextUtils.equals("privilege", str)) {
            CoreModule.c.C0.u4();
        } else {
            CoreModule.c.H0.k5();
        }
        CoreModule.c.o0.W3(((DbObject) user).id);
        CoreModule.c.o0.w3();
        CoreModule.c.m0.E8(((DbObject) user).id);
        CoreModule.c.m0.O5();
        CoreModule.c.O1.q3();
        d30Var.call();
    }

    /* JADX INFO: renamed from: w */
    public static C0038a m652w() {
        if (f365d == null) {
            synchronized (C0038a.class) {
                try {
                    if (f365d == null) {
                        f365d = new C0038a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f365d;
    }

    /* JADX INFO: renamed from: A */
    public boolean m653A() {
        return xma.Q3() > 0;
    }

    /* JADX INFO: renamed from: B */
    public int m654B() {
        try {
            return RemoteConfig.x().z("intl_instant_match_validity_day", 7);
        } catch (Exception unused) {
            return 7;
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m655C() {
        return xma.C3();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m656D(final Act act, final User user, final d30 d30Var, String str, List list) {
        if (m655C() || m653A() || u59.R()) {
            m663K(act, user, new d30() { // from class: l.mpo
                @Override // p003l.d30
                public final void call() {
                    C0038a.m649k(act, user, d30Var);
                }
            }, str);
        } else {
            act.startActivityWithCustomTransition(CoreModule.P().a().n8(act, vwb.f0(new String[]{((DbObject) user).id}), CoreModule.P().a().P8(), new ArrayList(), str), CoreModule.P().a().hg(act));
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m657E(e30 e30Var, Act act, String str, Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            if (i == 40399 && NullChecker.a(e30Var)) {
                e30Var.call(tantanForbidden.message);
                return;
            }
            if (i == 40343) {
                if (m672n()) {
                    m669R(act, str);
                } else if (NullChecker.a(e30Var)) {
                    e30Var.call(act.getString(R.string.o9));
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m658F(View view) {
        m675q().put(Boolean.TRUE);
        m676r().a(1);
        m678t().put((Long) CoreModule.c.e0.X.get());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m659G(View view) {
        m675q().put(Boolean.TRUE);
        m676r().a(1);
        m678t().put((Long) CoreModule.c.e0.X.get());
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m660H(View view) {
        m681x().a(1);
        m682y().put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m661I(View view) {
        m681x().a(1);
        m682y().put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: J */
    public void m662J(Act act, User user, d30 d30Var) {
        m663K(act, user, d30Var, null);
    }

    /* JADX INFO: renamed from: K */
    public void m663K(Act act, User user, d30 d30Var, String str) {
        if (User.isMatched(user)) {
            m683z(act, user);
            return;
        }
        if (CoreModule.K().sg(((DbObject) user).id) && !xp5.o(CoreModule.c.f0.Xe(((DbObject) user).id), user)) {
            m683z(act, user);
            return;
        }
        if (m653A()) {
            m667P(act, user, "privilege", d30Var, new npo(), str);
        } else if (m672n()) {
            m669R(act, str);
        } else {
            lsi0.F(act, act.getString(R.string.o9));
        }
    }

    /* JADX INFO: renamed from: L */
    public boolean m664L() {
        if (!u59.U()) {
            return false;
        }
        if ((nkp.e() || !IntlCountryCodeController.o()) && (((Long) CoreModule.c.e0.X.get()).longValue() - ((Long) m677s().get()).longValue()) + 1 > 0) {
            return (((((Long) CoreModule.c.e0.X.get()).longValue() - ((Long) m677s().get()).longValue()) + 1) % ((long) m679u()) == 0 || ((Long) CoreModule.c.e0.X.get()).longValue() > ((Long) m678t().get()).longValue() + ((long) m679u())) && ((Integer) m676r().get()).intValue() < 3;
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public boolean m665M() {
        return !(mah0.m0() && mah0.s0().T0()) && !this.f367b && u59.U() && (nkp.e() || !IntlCountryCodeController.o()) && !((Boolean) m675q().get()).booleanValue() && ((Integer) m676r().get()).intValue() < 3;
    }

    /* JADX INFO: renamed from: N */
    public boolean m666N() {
        return u59.U() && mqi0.o() >= qqi0.d(((Long) m682y().get()).longValue(), 48) && ((Integer) m681x().get()).intValue() < 3 && !xma.C3();
    }

    /* JADX INFO: renamed from: P */
    public void m667P(final Act act, final User user, final String str, @NonNull final d30 d30Var, final e30<String> e30Var, final String str2) {
        act.duringCreated(CoreModule.c.P1.n3(((DbObject) user).id, str, "")).subscribe((m250) mkd0.H(new e30() { // from class: l.dpo
            @Override // p003l.e30
            public final void call(Object obj) {
                C0038a.m651m(str, user, d30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.epo
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3354a.m657E(e30Var, act, str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m668Q(boolean z) {
        this.f368c = z;
    }

    /* JADX INFO: renamed from: R */
    public void m669R(Act act, String str) {
        new mvm.e(act).b(str).c(new g30() { // from class: l.fpo
            @Override // p003l.g30
            /* JADX INFO: renamed from: a */
            public final void mo4389a(Object obj, Object obj2, Object obj3) {
                C0038a.m641c((PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).d();
    }

    /* JADX INFO: renamed from: S */
    public void m670S(Context context, ViewGroup viewGroup, View view, int i) {
        if (m665M() || m664L()) {
            String string = context.getResources().getString(R.string.Wf);
            a aVar = new a(context);
            d.l().k("bubble_intl_instant_match_guide");
            if (IntlCountryCodeController.v()) {
                aVar.B(t100.d(2.0f)).D(string).A(viewGroup).k(new int[]{context.getResources().getColor(w0c0.I)}).J(13.0f).l(t100.d(7.0f)).I(EACTags.COMPATIBLE_TAG_ALLOCATION_AUTHORITY).p(75).x(t100.d(-4.0f)).u(t100.d(75.0f)).b(i).y(true).N(new a.d() { // from class: l.opo
                    /* JADX INFO: renamed from: a */
                    public final void m6725a(View view2) {
                        this.f6198a.m659G(view2);
                    }
                }).q(a.Q | a.P);
            } else {
                aVar.B(t100.d(2.0f)).D(string).A(viewGroup).k(new int[]{context.getResources().getColor(w0c0.I)}).J(13.0f).l(t100.d(7.0f)).I(EACTags.COMPATIBLE_TAG_ALLOCATION_AUTHORITY).p(75).x(t100.d(-4.0f)).o(a.P, t100.d(10.0f)).y(true).b(i).N(new a.d() { // from class: l.cpo
                    /* JADX INFO: renamed from: a */
                    public final void m3414a(View view2) {
                        this.f2744a.m658F(view2);
                    }
                }).q(a.Q | a.P);
            }
            d.l().u(aVar, view, "bubble_intl_instant_match_guide");
        }
    }

    /* JADX INFO: renamed from: T */
    public void m671T(Context context, ViewGroup viewGroup, View view, int i) {
        String string = context.getResources().getString(R.string.kg);
        a aVar = new a(context);
        d.l().k("bubble_intl_instant_match_guide");
        if (view.getWidth() < t100.d(200.0f)) {
            aVar.B(t100.d(2.0f)).D(string).k(new int[]{context.getResources().getColor(w0c0.I)}).J(13.0f).l(t100.d(7.0f)).I(200).p(75).x(t100.d(-4.0f)).o(a.P, t100.d(60.0f)).b(i).N(new a.d() { // from class: l.bpo
                /* JADX INFO: renamed from: a */
                public final void m2977a(View view2) {
                    this.f2422a.m660H(view2);
                }
            }).q(a.Q | a.P);
        } else {
            aVar.B(t100.d(2.0f)).D(string).k(new int[]{context.getResources().getColor(w0c0.I)}).J(13.0f).I(200).l(t100.d(7.0f)).p(75).x(t100.d(-4.0f)).b(i).N(new a.d() { // from class: l.gpo
                /* JADX INFO: renamed from: a */
                public final void m4656a(View view2) {
                    this.f3962a.m661I(view2);
                }
            }).q(a.Q);
        }
        d.l().u(aVar, view, "bubble_intl_instant_match_guide");
    }

    /* JADX INFO: renamed from: n */
    public boolean m672n() {
        return !IntlCountryCodeController.k();
    }

    /* JADX INFO: renamed from: o */
    public void m673o(Act act, String str, final d30 d30Var) {
        c.L0(act, str, new e30() { // from class: l.kpo
            @Override // p003l.e30
            public final void call(Object obj) {
                C0038a.m643e((PurchaseType) obj);
            }
        }, new d30() { // from class: l.lpo
            @Override // p003l.d30
            public final void call() {
                C0038a.m645g(d30Var);
            }
        }, (d30) null, Privilege.immediately_match);
    }

    /* JADX INFO: renamed from: p */
    public void m674p(final Act act, final User user, final String str, final d30 d30Var) {
        if (user == null) {
            return;
        }
        User userNa = CoreModule.c.e0.na();
        if (NullChecker.a(userNa)) {
            if (userNa.isJailed()) {
                CoreModule.K().startJailedDialogLikeAct();
                return;
            } else {
                if (ark.F0(act, new Runnable() { // from class: l.hpo
                    @Override // java.lang.Runnable
                    public final void run() {
                        Act act2 = act;
                        act2.startActivityForResult(MediaPickerAct.m847d2(act2, 1, false, false, true, null), 786);
                    }
                })) {
                    return;
                }
                if (userNa.isNameFake()) {
                    CoreModule.P().i().A(act);
                    return;
                }
            }
        }
        act.duringCreated(CoreModule.c.C0.u4()).subscribe((m250) mkd0.H(new e30() { // from class: l.ipo
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4450a.m656D(act, user, d30Var, str, (List) obj);
            }
        }, new e30() { // from class: l.jpo
            @Override // p003l.e30
            public final void call(Object obj) {
                C0038a.m648j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public hpd0 m675q() {
        return new hpd0("bubble_intl_card_immediate_match_guide_" + CoreModule.H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: r */
    public tpd0 m676r() {
        return new tpd0("bubble_intl_card_immediate_match_guide_count_" + CoreModule.H().userId(), 0);
    }

    /* JADX INFO: renamed from: s */
    public zpd0 m677s() {
        return new zpd0("bubble_intl_card_immediate_match_guide_start_swipe_num_" + CoreModule.H().userId(), -1L);
    }

    /* JADX INFO: renamed from: t */
    public zpd0 m678t() {
        return new zpd0("bubble_intl_card_immediate_match_guide_swipe_num_" + CoreModule.H().userId(), 0L);
    }

    /* JADX INFO: renamed from: u */
    public final int m679u() {
        IntlUltraPremiumConfig intlUltraPremiumConfig;
        try {
            intlUltraPremiumConfig = (IntlUltraPremiumConfig) RemoteConfig.x().v("intl_ultra_premium", IntlUltraPremiumConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            intlUltraPremiumConfig = null;
        }
        if (intlUltraPremiumConfig == null) {
            return 30;
        }
        return intlUltraPremiumConfig.intl_instant_match_tips_swipe_num;
    }

    /* JADX INFO: renamed from: v */
    public boolean m680v() {
        return this.f368c;
    }

    /* JADX INFO: renamed from: x */
    public tpd0 m681x() {
        return new tpd0("bubble_intl_profile_immediate_match_guide_count_" + CoreModule.H().userId(), 0);
    }

    /* JADX INFO: renamed from: y */
    public zpd0 m682y() {
        return new zpd0("bubble_intl_profile_immediate_match_guide_time_" + CoreModule.H().userId(), 0L);
    }

    /* JADX INFO: renamed from: z */
    public void m683z(Act act, User user) {
        act.startActivity(MessagesAct.m2035i2(act, ((DbObject) user).id, false, false));
    }
}
