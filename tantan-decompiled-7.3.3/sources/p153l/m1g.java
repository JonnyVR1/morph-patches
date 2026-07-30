package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersFrag;
import com.p051p1.mobile.putong.core.p058ui.seepage.match.FakeMatchAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.PicksItemView;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksHeaderView;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class m1g extends ar2<z1g> {

    /* JADX INFO: renamed from: a */
    public String f134414a;

    /* JADX INFO: renamed from: b */
    public final BusinessEntranceStyle f134415b;

    /* JADX INFO: renamed from: c */
    public boolean f134416c;

    /* JADX INFO: renamed from: d */
    public boolean f134417d;

    /* JADX INFO: renamed from: e */
    public PutongAct f134418e;

    /* JADX INFO: renamed from: f */
    public User f134419f;

    /* JADX INFO: renamed from: g */
    public int f134420g;

    /* JADX INFO: renamed from: h */
    public int f134421h;

    /* JADX INFO: renamed from: i */
    public long f134422i;

    /* JADX INFO: renamed from: j */
    public jxd0 f134423j;

    /* JADX INFO: renamed from: k */
    public jxd0 f134424k;

    /* JADX INFO: renamed from: l */
    public boolean f134425l;

    public m1g(FakeLikersFrag fakeLikersFrag) {
        super(fakeLikersFrag);
        this.f134419f = null;
        this.f134420g = 0;
        this.f134421h = 0;
        this.f134422i = 0L;
        String str = "show_see_guide_dlg" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f134423j = new jxd0(str, bool);
        this.f134424k = new jxd0("show_see_guide_anim" + CoreModule.m30929H().userId(), bool);
        this.f134425l = false;
        PutongAct putongAct = (PutongAct) fakeLikersFrag.act();
        this.f134418e = putongAct;
        this.f134414a = putongAct.getIntent().getStringExtra("from");
        this.f134415b = (BusinessEntranceStyle) this.f134418e.getIntent().getSerializableExtra("style");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ Boolean m156641C0(C4470c c4470c) {
        return Boolean.valueOf(c4470c == C4470c.f16267i && this.f134416c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m156642D0(C4470c c4470c) {
        m156668R0();
    }

    /* JADX INFO: renamed from: F0 */
    private void m156643F0() {
        CoreModule.f18264c.f20429u0.m31458m5();
        CoreModule.f18264c.f20429u0.m31451j7(50, this.f134422i, "");
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m156647h0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m156649j0(x20 x20Var, Boolean bool) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m156652m0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m156653n0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m156656y0(Bundle bundle) {
        boolean z = false;
        if (!NullChecker.m82486a(bundle) || !bundle.getBoolean("price_recall_shown", false)) {
            yie0.m216076h().m216090u(false);
        }
        m156643F0();
        if (yie0.m216072d() && !m156666P0()) {
            z = true;
        }
        this.f134417d = z;
        if (TextUtils.equals(this.f134414a, "p_special_card,deeplink,click") || TextUtils.equals(this.f134414a, "p_special_card,deeplink_intl,click")) {
            this.f134417d = act().getIntent().getBooleanExtra("preferred_show_purchase", true);
        }
        if (this.f134417d) {
            l51.m152888H(act(), new Runnable() { // from class: l.a1g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67812a.m156671s0();
                }
            }, 400L);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m156657A0(Counter counter) {
        if (CoreModule.m30933P().m143405a().mo34492e2()) {
            return;
        }
        if (lifecycle_() == C4470c.f16268j) {
            this.f134416c = true;
        } else {
            m156668R0();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m156658E0(int i, Intent intent, C4470c c4470c) {
        PicksHeaderView picksHeaderViewM218321J = ((z1g) this.viewModel).m218321J();
        if (picksHeaderViewM218321J != null) {
            PicksItemView clickedItem = picksHeaderViewM218321J.presenter.getClickedItem();
            PicksUser picksUser = picksHeaderViewM218321J.presenter.clickedUser;
            if (NullChecker.m82486a(clickedItem) && NullChecker.m82486a(picksUser)) {
                User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(picksUser.f21210id);
                int intExtra = 0;
                boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
                SwipeDirection swipeDirection = SwipeDirection.UP;
                boolean z2 = i == swipeDirection.getValue();
                String stringExtra = userM116503Pa.pictures.get(0).url;
                String stringExtra2 = null;
                if (NullChecker.m82486a(intent)) {
                    intExtra = intent.getIntExtra("currentImageIndex", 0);
                    stringExtra = intent.getStringExtra("currentImageUrl");
                    if (i == swipeDirection.getValue()) {
                        stringExtra2 = intent.getStringExtra(CoreMemberModule.m37004F().m187693b().mo36999pc());
                    }
                }
                String str = stringExtra2;
                picksHeaderViewM218321J.presenter.m186769n0(z, z2, true, intExtra, stringExtra, userM116503Pa, str);
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m156659G0(int i, final int i2, final Intent intent) {
        if (i != CoreMemberModule.m37004F().m187693b().mo36987bj()) {
            if (i != 786) {
                return false;
            }
            CoreMemberModule.m37004F().m187693b().mo36984Yq(i2, intent, act());
            return true;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new qcj() { // from class: l.k1g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.l1g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129671a.m156658E0(i2, intent, (C4470c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: H0 */
    public void m156660H0(User user) {
        m156667Q0(user);
    }

    /* JADX INFO: renamed from: I0 */
    public void m156661I0(x20 x20Var) {
        m156664N0(m156673u0(), x20Var);
    }

    /* JADX INFO: renamed from: J0 */
    public void m156662J0() {
        m156663L0(m156673u0());
    }

    /* JADX INFO: renamed from: L0 */
    public void m156663L0(String str) {
        m156664N0(str, null);
    }

    /* JADX INFO: renamed from: N0 */
    public void m156664N0(String str, final x20 x20Var) {
        if (CoreModule.f18264c.f20414p0.m219060e3()) {
            CoreModule.m30933P().m143405a().mo34365Lf(act(), str, Privilege.see_who_likes_me, null, new y20() { // from class: l.b1g
                @Override // p153l.y20
                public final void call(Object obj) {
                    m1g.m156649j0(x20Var, (Boolean) obj);
                }
            });
        } else {
            CoreModule.m30933P().m143405a().showSeeDialog(act(), x20Var, str);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m156665O0() {
        if (this.f134424k.get().booleanValue()) {
            return;
        }
        this.f134424k.put(Boolean.TRUE);
        ((z1g) this.viewModel).m218335b0();
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m156666P0() {
        return "p_navigation_view,e_see_banner,intl_click".equals(this.f134414a) || "p_special_card,deeplink_intl,click".equals(this.f134414a);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m156667Q0(User user) {
        FakeMatchAct.m56170c2(user.f56859id, act());
    }

    /* JADX INFO: renamed from: R0 */
    public void m156668R0() {
        act().startActivity(LikersAct.m57727Y1(act(), this.f134414a));
        act().m68056e2();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f134422i = CoreModule.f18264c.f20429u0.f19997m0.get().longValue();
        CoreModule.f18264c.f20429u0.f19997m0.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20429u0.f19996l0.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        yie0.m216076h().f200080a = true;
        creates(new y20() { // from class: l.z0g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202308a.m156656y0((Bundle) obj);
            }
        }, new x20() { // from class: l.d1g
            @Override // p153l.x20
            public final void call() {
                m1g.m156653n0();
            }
        });
        duringCreated(CoreModule.f18264c.f20429u0.m31421V6()).subscribe(psd0.m173597H(new y20() { // from class: l.e1g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91605a.m156675z0((pf60) obj);
            }
        }, new y20() { // from class: l.f1g
            @Override // p153l.y20
            public final void call(Object obj) {
                m1g.m156652m0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.m32486n3().distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.g1g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101749a.m156657A0((Counter) obj);
            }
        }, new y20() { // from class: l.h1g
            @Override // p153l.y20
            public final void call(Object obj) {
                m1g.m156647h0((Throwable) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.i1g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112515a.m156641C0((C4470c) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.j1g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117963a.m156642D0((C4470c) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
        yie0.m216076h().f200080a = false;
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(z1g z1gVar) {
        super.mo52715C(z1gVar);
    }

    /* JADX INFO: renamed from: r0 */
    public final String m156670r0() {
        return ((CoreModule.m30933P().m143405a().mo34522ht() && TextUtils.equals(this.f134414a, "p_meet_view,e_see_banner,click")) || TextUtils.equals(this.f134414a, "p_meet_view,e_see_banner,click") || TextUtils.equals(this.f134414a, "p_navigation_see,default") || TextUtils.equals(this.f134414a, "p_messages_view,e_see_banner,click") || TextUtils.equals(this.f134414a, "p_popup_see,default")) ? this.f134414a : abb0.m96736c("p_navigation_see,default", 1);
    }

    /* JADX INFO: renamed from: s0 */
    public void m156671s0() {
        if ((CoreModule.m30933P().m143405a().mo34532k() && pzi0.m174463x(12, 13)) || !NullChecker.m82486a(act()) || act().isFinishing() || act().isDestroyed()) {
            return;
        }
        CoreModule.m30933P().m143405a().showSeeDialog(act(), new x20() { // from class: l.c1g
            @Override // p153l.x20
            public final void call() {
                this.f79394a.m156665O0();
            }
        }, m156670r0());
    }

    /* JADX INFO: renamed from: t0 */
    public final String m156672t0(int i) {
        if (i == 0) {
            return "?";
        }
        return i >= 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: u0 */
    public final String m156673u0() {
        if ((CoreModule.m30933P().m143405a().mo34522ht() && TextUtils.equals(this.f134414a, "p_meet_view,e_see_banner,click")) || TextUtils.equals(this.f134414a, "p_meet_view,e_see_banner,click") || TextUtils.equals(this.f134414a, "p_navigation_see,default") || TextUtils.equals(this.f134414a, "p_messages_view,e_see_banner,click")) {
            return this.f134414a;
        }
        return TextUtils.equals(this.f134414a, "p_popup_see,default") ? "p_popup_see,card_button_pull" : abb0.m96736c("p_navigation_see,card_button_pull", 1);
    }

    /* JADX INFO: renamed from: x0 */
    public String m156674x0() {
        int i = this.f134420g;
        if (i < 10000) {
            return String.valueOf(i);
        }
        return new DecimalFormat("#.#").format(this.f134420g / 10000.0f) + "w";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m156675z0(pf60 pf60Var) {
        String string;
        CoreModule.f18264c.f20429u0.f20005u0 = true;
        int iIntValue = ((Integer) pf60Var.f152156a).intValue();
        boolean zM147479J = jyb.m147479J((Collection) pf60Var.f152157b);
        this.f134420g = iIntValue;
        if (!zM147479J) {
            ((z1g) this.viewModel).m218332Y((List) pf60Var.f152157b);
            if (!this.f134417d && this.f134420g > 0) {
                m156665O0();
            }
        } else if ((CoreModule.m30933P().m143405a().mo34532k() && PicksHelper.INSTANCE.m57923b().m57918m()) || m156666P0()) {
            ((z1g) this.viewModel).m218332Y((List) pf60Var.f152157b);
        }
        if (iIntValue <= 0) {
            act().setTitle(m156666P0() ? R$string.f21403l0 : R$string.f21366Y0);
            return;
        }
        Act act = act();
        if (m156666P0()) {
            string = act().getResources().getString(R$string.f21403l0) + "(" + iIntValue + ")";
        } else {
            string = act().getResources().getString(R$string.f21364X0, m156672t0(iIntValue));
        }
        act.setTitle(string);
    }
}
