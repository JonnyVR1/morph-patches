package com.p051p1.mobile.putong.core.p058ui.match;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.IntlUltraPremiumConfig;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.a30;
import p153l.br5;
import p153l.byd0;
import p153l.c9c0;
import p153l.d79;
import p153l.joa;
import p153l.jxd0;
import p153l.jyb;
import p153l.nmp;
import p153l.nro;
import p153l.nxm;
import p153l.o1j0;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qtk;
import p153l.tzi0;
import p153l.uih0;
import p153l.vxd0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.a */
/* JADX INFO: loaded from: classes3.dex */
public class C8618a {

    /* JADX INFO: renamed from: d */
    public static C8618a f31322d;

    /* JADX INFO: renamed from: a */
    public boolean f31323a;

    /* JADX INFO: renamed from: b */
    public boolean f31324b;

    /* JADX INFO: renamed from: c */
    public boolean f31325c;

    /* JADX INFO: renamed from: O */
    public static void m48757O() {
        f31322d = null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m48760c(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m48762e(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m48764g(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m48767j(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m48768k(Act act, User user, x20 x20Var) {
        act.startActivityWithCustomTransition(MatchAct.m48746g2(act, jyb.m147507f0(user.f56859id), 51, new ArrayList()), new MatchAct.C8617b());
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m48770m(String str, User user, x20 x20Var, Envelope envelope) {
        if (TextUtils.equals("privilege", str)) {
            CoreModule.f18264c.f20297C0.m146425v4();
        } else {
            CoreModule.f18264c.f20312H0.m155449k5();
        }
        CoreModule.f18264c.f20411o0.m35323W3(user.f56859id);
        CoreModule.f18264c.f20411o0.m35331w3();
        CoreModule.f18264c.f20405m0.m31997E8(user.f56859id);
        CoreModule.f18264c.f20405m0.m32034O5();
        CoreModule.f18264c.f20334O1.m185318q3();
        x20Var.call();
    }

    /* JADX INFO: renamed from: w */
    public static C8618a m48771w() {
        if (f31322d == null) {
            synchronized (C8618a.class) {
                try {
                    if (f31322d == null) {
                        f31322d = new C8618a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f31322d;
    }

    /* JADX INFO: renamed from: A */
    public boolean m48772A() {
        return joa.m146366R3() > 0;
    }

    /* JADX INFO: renamed from: B */
    public int m48773B() {
        try {
            return RemoteConfig.m80481x().m80519z("intl_instant_match_validity_day", 7);
        } catch (Exception unused) {
            return 7;
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m48774C() {
        return joa.m146354D3();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m48775D(final Act act, final User user, final x20 x20Var, String str, List list) {
        if (m48774C() || m48772A() || d79.m114660S()) {
            m48782K(act, user, new x20() { // from class: l.mro
                @Override // p153l.x20
                public final void call() {
                    C8618a.m48768k(act, user, x20Var);
                }
            }, str);
        } else {
            act.startActivityWithCustomTransition(CoreModule.m30933P().m143405a().mo34554n8(act, jyb.m147507f0(user.f56859id), CoreModule.m30933P().m143405a().mo34392P8(), new ArrayList<>(), str), CoreModule.m30933P().m143405a().mo34515hg(act));
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m48776E(y20 y20Var, Act act, String str, Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            if (i == 40399 && NullChecker.m82486a(y20Var)) {
                y20Var.call(tantanForbidden.message);
                return;
            }
            if (i == 40343) {
                if (m48791n()) {
                    m48788R(act, str);
                } else if (NullChecker.m82486a(y20Var)) {
                    y20Var.call(act.getString(R$string.f19703u9));
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m48777F(View view) {
        m48794q().put(Boolean.TRUE);
        m48795r().m203841a(1);
        m48797t().put(CoreModule.f18264c.f20381e0.f89158X.get());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m48778G(View view) {
        m48794q().put(Boolean.TRUE);
        m48795r().m203841a(1);
        m48797t().put(CoreModule.f18264c.f20381e0.f89158X.get());
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m48779H(View view) {
        m48800x().m203841a(1);
        m48801y().put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m48780I(View view) {
        m48800x().m203841a(1);
        m48801y().put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: J */
    public void m48781J(Act act, User user, x20 x20Var) {
        m48782K(act, user, x20Var, null);
    }

    /* JADX INFO: renamed from: K */
    public void m48782K(Act act, User user, x20 x20Var, String str) {
        if (User.isMatched(user)) {
            m48802z(act, user);
            return;
        }
        if (CoreModule.m30930K().mo31822sg(user.f56859id) && !br5.m106044o(CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id), user)) {
            m48802z(act, user);
            return;
        }
        if (m48772A()) {
            m48786P(act, user, "privilege", x20Var, new nro(), str);
        } else if (m48791n()) {
            m48788R(act, str);
        } else {
            o1j0.m165624F(act, act.getString(R$string.f19703u9));
        }
    }

    /* JADX INFO: renamed from: L */
    public boolean m48783L() {
        if (!d79.m114663V()) {
            return false;
        }
        if ((nmp.m163836e() || !IntlCountryCodeController.m29118o()) && (CoreModule.f18264c.f20381e0.f89158X.get().longValue() - m48796s().get().longValue()) + 1 > 0) {
            return (((CoreModule.f18264c.f20381e0.f89158X.get().longValue() - m48796s().get().longValue()) + 1) % ((long) m48798u()) == 0 || CoreModule.f18264c.f20381e0.f89158X.get().longValue() > m48797t().get().longValue() + ((long) m48798u())) && m48795r().get().intValue() < 3;
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public boolean m48784M() {
        return !(uih0.m196214m0() && uih0.m196223s0().m196253T0()) && !this.f31324b && d79.m114663V() && (nmp.m163836e() || !IntlCountryCodeController.m29118o()) && !m48794q().get().booleanValue() && m48795r().get().intValue() < 3;
    }

    /* JADX INFO: renamed from: N */
    public boolean m48785N() {
        return d79.m114663V() && pzi0.m174454o() >= tzi0.m193666d(m48801y().get().longValue(), 48) && m48800x().get().intValue() < 3 && !joa.m146354D3();
    }

    /* JADX INFO: renamed from: P */
    public void m48786P(final Act act, final User user, final String str, @NonNull final x20 x20Var, final y20<String> y20Var, final String str2) {
        act.duringCreated(CoreModule.f18264c.f20337P1.m119521n3(user.f56859id, str, "")).subscribe(psd0.m173597H(new y20() { // from class: l.dro
            @Override // p153l.y20
            public final void call(Object obj) {
                C8618a.m48770m(str, user, x20Var, (Envelope) obj);
            }
        }, new y20() { // from class: l.ero
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95486a.m48776E(y20Var, act, str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m48787Q(boolean z) {
        this.f31325c = z;
    }

    /* JADX INFO: renamed from: R */
    public void m48788R(Act act, String str) {
        new nxm.C18984e(act).m165204b(str).m165205c(new a30() { // from class: l.fro
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                C8618a.m48760c((PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m165206d();
    }

    /* JADX INFO: renamed from: S */
    public void m48789S(Context context, ViewGroup viewGroup, View view, int i) {
        if (m48784M() || m48783L()) {
            String string = context.getResources().getString(R$string.f19555pg);
            C4496a c4496a = new C4496a(context);
            C4499d.m21895l().m21899k("bubble_intl_instant_match_guide");
            if (IntlCountryCodeController.m29125v()) {
                c4496a.m21846B(qa00.m175859d(2.0f)).m21848D(string).m21845A(viewGroup).m21869k(context.getResources().getColor(c9c0.f80342I)).m21854J(13.0f).m21870l(qa00.m175859d(7.0f)).m21853I(120).m21873p(75).m21881x(qa00.m175859d(-4.0f)).m21878u(qa00.m175859d(75.0f)).m21860b(i).m21882y(true).m21858N(new C4496a.d() { // from class: l.oro
                    @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.d
                    /* JADX INFO: renamed from: a */
                    public final void mo21886a(View view2) {
                        this.f148729a.m48778G(view2);
                    }
                }).m21874q(C4496a.f16402Q | C4496a.f16401P);
            } else {
                c4496a.m21846B(qa00.m175859d(2.0f)).m21848D(string).m21845A(viewGroup).m21869k(context.getResources().getColor(c9c0.f80342I)).m21854J(13.0f).m21870l(qa00.m175859d(7.0f)).m21853I(120).m21873p(75).m21881x(qa00.m175859d(-4.0f)).m21872o(C4496a.f16401P, qa00.m175859d(10.0f)).m21882y(true).m21860b(i).m21858N(new C4496a.d() { // from class: l.cro
                    @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.d
                    /* JADX INFO: renamed from: a */
                    public final void mo21886a(View view2) {
                        this.f83345a.m48777F(view2);
                    }
                }).m21874q(C4496a.f16402Q | C4496a.f16401P);
            }
            C4499d.m21895l().m21908u(c4496a, view, "bubble_intl_instant_match_guide");
        }
    }

    /* JADX INFO: renamed from: T */
    public void m48790T(Context context, ViewGroup viewGroup, View view, int i) {
        String string = context.getResources().getString(R$string.f18395Dg);
        C4496a c4496a = new C4496a(context);
        C4499d.m21895l().m21899k("bubble_intl_instant_match_guide");
        if (view.getWidth() < qa00.m175859d(200.0f)) {
            c4496a.m21846B(qa00.m175859d(2.0f)).m21848D(string).m21869k(context.getResources().getColor(c9c0.f80342I)).m21854J(13.0f).m21870l(qa00.m175859d(7.0f)).m21853I(200).m21873p(75).m21881x(qa00.m175859d(-4.0f)).m21872o(C4496a.f16401P, qa00.m175859d(60.0f)).m21860b(i).m21858N(new C4496a.d() { // from class: l.bro
                @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.d
                /* JADX INFO: renamed from: a */
                public final void mo21886a(View view2) {
                    this.f78040a.m48779H(view2);
                }
            }).m21874q(C4496a.f16402Q | C4496a.f16401P);
        } else {
            c4496a.m21846B(qa00.m175859d(2.0f)).m21848D(string).m21869k(context.getResources().getColor(c9c0.f80342I)).m21854J(13.0f).m21853I(200).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21881x(qa00.m175859d(-4.0f)).m21860b(i).m21858N(new C4496a.d() { // from class: l.gro
                @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.d
                /* JADX INFO: renamed from: a */
                public final void mo21886a(View view2) {
                    this.f106096a.m48780I(view2);
                }
            }).m21874q(C4496a.f16402Q);
        }
        C4499d.m21895l().m21908u(c4496a, view, "bubble_intl_instant_match_guide");
    }

    /* JADX INFO: renamed from: n */
    public boolean m48791n() {
        return !IntlCountryCodeController.m29114k();
    }

    /* JADX INFO: renamed from: o */
    public void m48792o(Act act, String str, final x20 x20Var) {
        C8927c.m54591L0(act, str, new y20() { // from class: l.kro
            @Override // p153l.y20
            public final void call(Object obj) {
                C8618a.m48762e((PurchaseType) obj);
            }
        }, new x20() { // from class: l.lro
            @Override // p153l.x20
            public final void call() {
                C8618a.m48764g(x20Var);
            }
        }, null, Privilege.immediately_match);
    }

    /* JADX INFO: renamed from: p */
    public void m48793p(final Act act, final User user, final String str, final x20 x20Var) {
        if (user == null) {
            return;
        }
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (NullChecker.m82486a(userM116593na)) {
            if (userM116593na.isJailed()) {
                CoreModule.m30930K().startJailedDialogLikeAct();
                return;
            } else {
                if (qtk.m177971F0(act, new Runnable() { // from class: l.hro
                    @Override // java.lang.Runnable
                    public final void run() {
                        Act act2 = act;
                        act2.startActivityForResult(MediaPickerAct.m48966e2(act2, 1, false, false, true, null), PutongAct.REQUEST_CODE_PICKER);
                    }
                })) {
                    return;
                }
                if (userM116593na.isNameFake()) {
                    CoreModule.m30933P().m143412i().mo180291A(act);
                    return;
                }
            }
        }
        act.duringCreated(CoreModule.f18264c.f20297C0.m146425v4()).subscribe(psd0.m173597H(new y20() { // from class: l.iro
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116590a.m48775D(act, user, x20Var, str, (List) obj);
            }
        }, new y20() { // from class: l.jro
            @Override // p153l.y20
            public final void call(Object obj) {
                C8618a.m48767j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public jxd0 m48794q() {
        return new jxd0("bubble_intl_card_immediate_match_guide_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: r */
    public vxd0 m48795r() {
        return new vxd0("bubble_intl_card_immediate_match_guide_count_" + CoreModule.m30929H().userId(), 0);
    }

    /* JADX INFO: renamed from: s */
    public byd0 m48796s() {
        return new byd0("bubble_intl_card_immediate_match_guide_start_swipe_num_" + CoreModule.m30929H().userId(), -1L);
    }

    /* JADX INFO: renamed from: t */
    public byd0 m48797t() {
        return new byd0("bubble_intl_card_immediate_match_guide_swipe_num_" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: u */
    public final int m48798u() {
        IntlUltraPremiumConfig intlUltraPremiumConfig;
        try {
            intlUltraPremiumConfig = (IntlUltraPremiumConfig) RemoteConfig.m80481x().m80516v("intl_ultra_premium", IntlUltraPremiumConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            intlUltraPremiumConfig = null;
        }
        if (intlUltraPremiumConfig == null) {
            return 30;
        }
        return intlUltraPremiumConfig.intl_instant_match_tips_swipe_num;
    }

    /* JADX INFO: renamed from: v */
    public boolean m48799v() {
        return this.f31325c;
    }

    /* JADX INFO: renamed from: x */
    public vxd0 m48800x() {
        return new vxd0("bubble_intl_profile_immediate_match_guide_count_" + CoreModule.m30929H().userId(), 0);
    }

    /* JADX INFO: renamed from: y */
    public byd0 m48801y() {
        return new byd0("bubble_intl_profile_immediate_match_guide_time_" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: z */
    public void m48802z(Act act, User user) {
        act.startActivity(MessagesAct.m50126k2(act, user.f56859id, false, false));
    }
}
