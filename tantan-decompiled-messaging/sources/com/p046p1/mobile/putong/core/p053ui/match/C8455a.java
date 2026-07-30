package com.p046p1.mobile.putong.core.p053ui.match;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.IntlUltraPremiumConfig;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.ark;
import p149l.d30;
import p149l.e30;
import p149l.g30;
import p149l.hpd0;
import p149l.lsi0;
import p149l.mah0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.mvm;
import p149l.nkp;
import p149l.npo;
import p149l.qqi0;
import p149l.t100;
import p149l.tpd0;
import p149l.u59;
import p149l.vwb;
import p149l.w0c0;
import p149l.xma;
import p149l.xp5;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.a */
/* JADX INFO: loaded from: classes3.dex */
public class C8455a {

    /* JADX INFO: renamed from: d */
    public static C8455a f30474d;

    /* JADX INFO: renamed from: a */
    public boolean f30475a;

    /* JADX INFO: renamed from: b */
    public boolean f30476b;

    /* JADX INFO: renamed from: c */
    public boolean f30477c;

    /* JADX INFO: renamed from: O */
    public static void m47574O() {
        f30474d = null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m47577c(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m47579e(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m47581g(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m47584j(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m47585k(Act act, User user, d30 d30Var) {
        act.startActivityWithCustomTransition(MatchAct.m47563e2(act, vwb.m200324f0(user.f56011id), 51, new ArrayList()), new MatchAct.C8454b());
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m47587m(String str, User user, d30 d30Var, Envelope envelope) {
        if (TextUtils.equals("privilege", str)) {
            CoreModule.f17545c.f19555C0.m210112u4();
        } else {
            CoreModule.f17545c.f19570H0.m210361k5();
        }
        CoreModule.f17545c.f19669o0.m34320W3(user.f56011id);
        CoreModule.f17545c.f19669o0.m34328w3();
        CoreModule.f17545c.f19663m0.m30994E8(user.f56011id);
        CoreModule.f17545c.f19663m0.m31031O5();
        CoreModule.f17545c.f19592O1.m120179q3();
        d30Var.call();
    }

    /* JADX INFO: renamed from: w */
    public static C8455a m47588w() {
        if (f30474d == null) {
            synchronized (C8455a.class) {
                try {
                    if (f30474d == null) {
                        f30474d = new C8455a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f30474d;
    }

    /* JADX INFO: renamed from: A */
    public boolean m47589A() {
        return xma.m210052Q3() > 0;
    }

    /* JADX INFO: renamed from: B */
    public int m47590B() {
        try {
            return RemoteConfig.m79298x().m79336z("intl_instant_match_validity_day", 7);
        } catch (Exception unused) {
            return 7;
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m47591C() {
        return xma.m210040C3();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m47592D(final Act act, final User user, final d30 d30Var, String str, List list) {
        if (m47591C() || m47589A() || u59.m191809R()) {
            m47599K(act, user, new d30() { // from class: l.mpo
                @Override // p149l.d30
                public final void call() {
                    C8455a.m47585k(act, user, d30Var);
                }
            }, str);
        } else {
            act.startActivityWithCustomTransition(CoreModule.m29935P().m94651a().mo33551n8(act, vwb.m200324f0(user.f56011id), CoreModule.m29935P().m94651a().mo33389P8(), new ArrayList<>(), str), CoreModule.m29935P().m94651a().mo33512hg(act));
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m47593E(e30 e30Var, Act act, String str, Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            if (i == 40399 && NullChecker.m81303a(e30Var)) {
                e30Var.call(tantanForbidden.message);
                return;
            }
            if (i == 40343) {
                if (m47608n()) {
                    m47605R(act, str);
                } else if (NullChecker.m81303a(e30Var)) {
                    e30Var.call(act.getString(R$string.f18787o9));
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m47594F(View view) {
        m47611q().put(Boolean.TRUE);
        m47612r().m189988a(1);
        m47614t().put(CoreModule.f17545c.f19639e0.f149301X.get());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m47595G(View view) {
        m47611q().put(Boolean.TRUE);
        m47612r().m189988a(1);
        m47614t().put(CoreModule.f17545c.f19639e0.f149301X.get());
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m47596H(View view) {
        m47617x().m189988a(1);
        m47618y().put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m47597I(View view) {
        m47617x().m189988a(1);
        m47618y().put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: J */
    public void m47598J(Act act, User user, d30 d30Var) {
        m47599K(act, user, d30Var, null);
    }

    /* JADX INFO: renamed from: K */
    public void m47599K(Act act, User user, d30 d30Var, String str) {
        if (User.isMatched(user)) {
            m47619z(act, user);
            return;
        }
        if (CoreModule.m29932K().mo30819sg(user.f56011id) && !xp5.m210475o(CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id), user)) {
            m47619z(act, user);
            return;
        }
        if (m47589A()) {
            m47603P(act, user, "privilege", d30Var, new npo(), str);
        } else if (m47608n()) {
            m47605R(act, str);
        } else {
            lsi0.m151568F(act, act.getString(R$string.f18787o9));
        }
    }

    /* JADX INFO: renamed from: L */
    public boolean m47600L() {
        if (!u59.m191812U()) {
            return false;
        }
        if ((nkp.m159986e() || !IntlCountryCodeController.m28119o()) && (CoreModule.f17545c.f19639e0.f149301X.get().longValue() - m47613s().get().longValue()) + 1 > 0) {
            return (((CoreModule.f17545c.f19639e0.f149301X.get().longValue() - m47613s().get().longValue()) + 1) % ((long) m47615u()) == 0 || CoreModule.f17545c.f19639e0.f149301X.get().longValue() > m47614t().get().longValue() + ((long) m47615u())) && m47612r().get().intValue() < 3;
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public boolean m47601M() {
        return !(mah0.m153720m0() && mah0.m153729s0().m153759T0()) && !this.f30476b && u59.m191812U() && (nkp.m159986e() || !IntlCountryCodeController.m28119o()) && !m47611q().get().booleanValue() && m47612r().get().intValue() < 3;
    }

    /* JADX INFO: renamed from: N */
    public boolean m47602N() {
        return u59.m191812U() && mqi0.m155944o() >= qqi0.m175936d(m47618y().get().longValue(), 48) && m47617x().get().intValue() < 3 && !xma.m210040C3();
    }

    /* JADX INFO: renamed from: P */
    public void m47603P(final Act act, final User user, final String str, @NonNull final d30 d30Var, final e30<String> e30Var, final String str2) {
        act.duringCreated(CoreModule.f17545c.f19595P1.m196847n3(user.f56011id, str, "")).subscribe(mkd0.m154956H(new e30() { // from class: l.dpo
            @Override // p149l.e30
            public final void call(Object obj) {
                C8455a.m47587m(str, user, d30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.epo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92698a.m47593E(e30Var, act, str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m47604Q(boolean z) {
        this.f30477c = z;
    }

    /* JADX INFO: renamed from: R */
    public void m47605R(Act act, String str) {
        new mvm.C18569e(act).m156569b(str).m156570c(new g30() { // from class: l.fpo
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                C8455a.m47577c((PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m156571d();
    }

    /* JADX INFO: renamed from: S */
    public void m47606S(Context context, ViewGroup viewGroup, View view, int i) {
        if (m47601M() || m47600L()) {
            String string = context.getResources().getString(R$string.f18242Wf);
            C4345a c4345a = new C4345a(context);
            C4348d.m20896l().m20900k("bubble_intl_instant_match_guide");
            if (IntlCountryCodeController.m28126v()) {
                c4345a.m20847B(t100.m186890d(2.0f)).m20849D(string).m20846A(viewGroup).m20870k(context.getResources().getColor(w0c0.f183773I)).m20855J(13.0f).m20871l(t100.m186890d(7.0f)).m20854I(120).m20874p(75).m20882x(t100.m186890d(-4.0f)).m20879u(t100.m186890d(75.0f)).m20861b(i).m20883y(true).m20859N(new C4345a.d() { // from class: l.opo
                    @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.d
                    /* JADX INFO: renamed from: a */
                    public final void mo20887a(View view2) {
                        this.f145020a.m47595G(view2);
                    }
                }).m20875q(C4345a.f15683Q | C4345a.f15682P);
            } else {
                c4345a.m20847B(t100.m186890d(2.0f)).m20849D(string).m20846A(viewGroup).m20870k(context.getResources().getColor(w0c0.f183773I)).m20855J(13.0f).m20871l(t100.m186890d(7.0f)).m20854I(120).m20874p(75).m20882x(t100.m186890d(-4.0f)).m20873o(C4345a.f15682P, t100.m186890d(10.0f)).m20883y(true).m20861b(i).m20859N(new C4345a.d() { // from class: l.cpo
                    @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.d
                    /* JADX INFO: renamed from: a */
                    public final void mo20887a(View view2) {
                        this.f81977a.m47594F(view2);
                    }
                }).m20875q(C4345a.f15683Q | C4345a.f15682P);
            }
            C4348d.m20896l().m20909u(c4345a, view, "bubble_intl_instant_match_guide");
        }
    }

    /* JADX INFO: renamed from: T */
    public void m47607T(Context context, ViewGroup viewGroup, View view, int i) {
        String string = context.getResources().getString(R$string.f18670kg);
        C4345a c4345a = new C4345a(context);
        C4348d.m20896l().m20900k("bubble_intl_instant_match_guide");
        if (view.getWidth() < t100.m186890d(200.0f)) {
            c4345a.m20847B(t100.m186890d(2.0f)).m20849D(string).m20870k(context.getResources().getColor(w0c0.f183773I)).m20855J(13.0f).m20871l(t100.m186890d(7.0f)).m20854I(200).m20874p(75).m20882x(t100.m186890d(-4.0f)).m20873o(C4345a.f15682P, t100.m186890d(60.0f)).m20861b(i).m20859N(new C4345a.d() { // from class: l.bpo
                @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.d
                /* JADX INFO: renamed from: a */
                public final void mo20887a(View view2) {
                    this.f76657a.m47596H(view2);
                }
            }).m20875q(C4345a.f15683Q | C4345a.f15682P);
        } else {
            c4345a.m20847B(t100.m186890d(2.0f)).m20849D(string).m20870k(context.getResources().getColor(w0c0.f183773I)).m20855J(13.0f).m20854I(200).m20871l(t100.m186890d(7.0f)).m20874p(75).m20882x(t100.m186890d(-4.0f)).m20861b(i).m20859N(new C4345a.d() { // from class: l.gpo
                @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.d
                /* JADX INFO: renamed from: a */
                public final void mo20887a(View view2) {
                    this.f103824a.m47597I(view2);
                }
            }).m20875q(C4345a.f15683Q);
        }
        C4348d.m20896l().m20909u(c4345a, view, "bubble_intl_instant_match_guide");
    }

    /* JADX INFO: renamed from: n */
    public boolean m47608n() {
        return !IntlCountryCodeController.m28115k();
    }

    /* JADX INFO: renamed from: o */
    public void m47609o(Act act, String str, final d30 d30Var) {
        C8764c.m53408L0(act, str, new e30() { // from class: l.kpo
            @Override // p149l.e30
            public final void call(Object obj) {
                C8455a.m47579e((PurchaseType) obj);
            }
        }, new d30() { // from class: l.lpo
            @Override // p149l.d30
            public final void call() {
                C8455a.m47581g(d30Var);
            }
        }, null, Privilege.immediately_match);
    }

    /* JADX INFO: renamed from: p */
    public void m47610p(final Act act, final User user, final String str, final d30 d30Var) {
        if (user == null) {
            return;
        }
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (NullChecker.m81303a(userM169520na)) {
            if (userM169520na.isJailed()) {
                CoreModule.m29932K().startJailedDialogLikeAct();
                return;
            } else {
                if (ark.m98421F0(act, new Runnable() { // from class: l.hpo
                    @Override // java.lang.Runnable
                    public final void run() {
                        Act act2 = act;
                        act2.startActivityForResult(MediaPickerAct.m47783d2(act2, 1, false, false, true, null), PutongAct.REQUEST_CODE_PICKER);
                    }
                })) {
                    return;
                }
                if (userM169520na.isNameFake()) {
                    CoreModule.m29935P().m94658i().mo158199A(act);
                    return;
                }
            }
        }
        act.duringCreated(CoreModule.f17545c.f19555C0.m210112u4()).subscribe(mkd0.m154956H(new e30() { // from class: l.ipo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114334a.m47592D(act, user, d30Var, str, (List) obj);
            }
        }, new e30() { // from class: l.jpo
            @Override // p149l.e30
            public final void call(Object obj) {
                C8455a.m47584j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public hpd0 m47611q() {
        return new hpd0("bubble_intl_card_immediate_match_guide_" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: r */
    public tpd0 m47612r() {
        return new tpd0("bubble_intl_card_immediate_match_guide_count_" + CoreModule.m29931H().userId(), 0);
    }

    /* JADX INFO: renamed from: s */
    public zpd0 m47613s() {
        return new zpd0("bubble_intl_card_immediate_match_guide_start_swipe_num_" + CoreModule.m29931H().userId(), -1L);
    }

    /* JADX INFO: renamed from: t */
    public zpd0 m47614t() {
        return new zpd0("bubble_intl_card_immediate_match_guide_swipe_num_" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: u */
    public final int m47615u() {
        IntlUltraPremiumConfig intlUltraPremiumConfig;
        try {
            intlUltraPremiumConfig = (IntlUltraPremiumConfig) RemoteConfig.m79298x().m79333v("intl_ultra_premium", IntlUltraPremiumConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            intlUltraPremiumConfig = null;
        }
        if (intlUltraPremiumConfig == null) {
            return 30;
        }
        return intlUltraPremiumConfig.intl_instant_match_tips_swipe_num;
    }

    /* JADX INFO: renamed from: v */
    public boolean m47616v() {
        return this.f30477c;
    }

    /* JADX INFO: renamed from: x */
    public tpd0 m47617x() {
        return new tpd0("bubble_intl_profile_immediate_match_guide_count_" + CoreModule.m29931H().userId(), 0);
    }

    /* JADX INFO: renamed from: y */
    public zpd0 m47618y() {
        return new zpd0("bubble_intl_profile_immediate_match_guide_time_" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: z */
    public void m47619z(Act act, User user) {
        act.startActivity(MessagesAct.m48943i2(act, user.f56011id, false, false));
    }
}
