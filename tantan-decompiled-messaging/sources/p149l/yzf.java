package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.FakeLikersFrag;
import com.p046p1.mobile.putong.core.p053ui.seepage.match.FakeMatchAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksItemView;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksHeaderView;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class yzf extends jq2<l0g> {

    /* JADX INFO: renamed from: a */
    public String f200869a;

    /* JADX INFO: renamed from: b */
    public final BusinessEntranceStyle f200870b;

    /* JADX INFO: renamed from: c */
    public boolean f200871c;

    /* JADX INFO: renamed from: d */
    public boolean f200872d;

    /* JADX INFO: renamed from: e */
    public PutongAct f200873e;

    /* JADX INFO: renamed from: f */
    public User f200874f;

    /* JADX INFO: renamed from: g */
    public int f200875g;

    /* JADX INFO: renamed from: h */
    public int f200876h;

    /* JADX INFO: renamed from: i */
    public long f200877i;

    /* JADX INFO: renamed from: j */
    public hpd0 f200878j;

    /* JADX INFO: renamed from: k */
    public hpd0 f200879k;

    /* JADX INFO: renamed from: l */
    public boolean f200880l;

    public yzf(FakeLikersFrag fakeLikersFrag) {
        super(fakeLikersFrag);
        this.f200874f = null;
        this.f200875g = 0;
        this.f200876h = 0;
        this.f200877i = 0L;
        String str = "show_see_guide_dlg" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f200878j = new hpd0(str, bool);
        this.f200879k = new hpd0("show_see_guide_anim" + CoreModule.m29931H().userId(), bool);
        this.f200880l = false;
        PutongAct putongAct = (PutongAct) fakeLikersFrag.act();
        this.f200873e = putongAct;
        this.f200869a = putongAct.getIntent().getStringExtra("from");
        this.f200870b = (BusinessEntranceStyle) this.f200873e.getIntent().getSerializableExtra("style");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ Boolean m216645C0(C4319c c4319c) {
        return Boolean.valueOf(c4319c == C4319c.f15548i && this.f200871c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m216646D0(C4319c c4319c) {
        m216672R0();
    }

    /* JADX INFO: renamed from: F0 */
    private void m216647F0() {
        CoreModule.f17545c.f19687u0.m30456m5();
        CoreModule.f17545c.f19687u0.m30439f7(50, this.f200877i, "");
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m216651h0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m216653j0(d30 d30Var, Boolean bool) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m216656m0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m216657n0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m216660y0(Bundle bundle) {
        boolean z = false;
        if (!NullChecker.m81303a(bundle) || !bundle.getBoolean("price_recall_shown", false)) {
            tae0.m187705h().m187719u(false);
        }
        m216647F0();
        if (tae0.m187701d() && !m216670P0()) {
            z = true;
        }
        this.f200872d = z;
        if (TextUtils.equals(this.f200869a, "p_special_card,deeplink,click") || TextUtils.equals(this.f200869a, "p_special_card,deeplink_intl,click")) {
            this.f200872d = act().getIntent().getBooleanExtra("preferred_show_purchase", true);
        }
        if (this.f200872d) {
            e51.m114743H(act(), new Runnable() { // from class: l.mzf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f136377a.m216675s0();
                }
            }, 400L);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m216661A0(Counter counter) {
        if (CoreModule.m29935P().m94651a().mo33489e2()) {
            return;
        }
        if (lifecycle_() == C4319c.f15549j) {
            this.f200871c = true;
        } else {
            m216672R0();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m216662E0(int i, Intent intent, C4319c c4319c) {
        PicksHeaderView picksHeaderViewM148073J = ((l0g) this.viewModel).m148073J();
        if (picksHeaderViewM148073J != null) {
            PicksItemView clickedItem = picksHeaderViewM148073J.presenter.getClickedItem();
            PicksUser picksUser = picksHeaderViewM148073J.presenter.clickedUser;
            if (NullChecker.m81303a(clickedItem) && NullChecker.m81303a(picksUser)) {
                User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(picksUser.f20468id);
                int intExtra = 0;
                boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
                SwipeDirection swipeDirection = SwipeDirection.UP;
                boolean z2 = i == swipeDirection.getValue();
                String stringExtra = userM169430Pa.pictures.get(0).url;
                String stringExtra2 = null;
                if (NullChecker.m81303a(intent)) {
                    intExtra = intent.getIntExtra("currentImageIndex", 0);
                    stringExtra = intent.getStringExtra("currentImageUrl");
                    if (i == swipeDirection.getValue()) {
                        stringExtra2 = intent.getStringExtra(CoreMemberModule.m36001F().m132651b().mo35996pc());
                    }
                }
                String str = stringExtra2;
                picksHeaderViewM148073J.presenter.m154158n0(z, z2, true, intExtra, stringExtra, userM169430Pa, str);
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m216663G0(int i, final int i2, final Intent intent) {
        if (i != CoreMemberModule.m36001F().m132651b().mo35984bj()) {
            if (i != 786) {
                return false;
            }
            CoreMemberModule.m36001F().m132651b().mo35981Yq(i2, intent, act());
            return true;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new w9j() { // from class: l.wzf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.xzf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195193a.m216662E0(i2, intent, (C4319c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: H0 */
    public void m216664H0(User user) {
        m216671Q0(user);
    }

    /* JADX INFO: renamed from: I0 */
    public void m216665I0(d30 d30Var) {
        m216668N0(m216677u0(), d30Var);
    }

    /* JADX INFO: renamed from: J0 */
    public void m216666J0() {
        m216667L0(m216677u0());
    }

    /* JADX INFO: renamed from: L0 */
    public void m216667L0(String str) {
        m216668N0(str, null);
    }

    /* JADX INFO: renamed from: N0 */
    public void m216668N0(String str, final d30 d30Var) {
        if (CoreModule.f17545c.f19672p0.m173357e3()) {
            CoreModule.m29935P().m94651a().mo33362Lf(act(), str, Privilege.see_who_likes_me, null, new e30() { // from class: l.nzf
                @Override // p149l.e30
                public final void call(Object obj) {
                    yzf.m216653j0(d30Var, (Boolean) obj);
                }
            });
        } else {
            CoreModule.m29935P().m94651a().showSeeDialog(act(), d30Var, str);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m216669O0() {
        if (this.f200879k.get().booleanValue()) {
            return;
        }
        this.f200879k.put(Boolean.TRUE);
        ((l0g) this.viewModel).m148087b0();
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m216670P0() {
        return "p_navigation_view,e_see_banner,intl_click".equals(this.f200869a) || "p_special_card,deeplink_intl,click".equals(this.f200869a);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m216671Q0(User user) {
        FakeMatchAct.m54987b2(user.f56011id, act());
    }

    /* JADX INFO: renamed from: R0 */
    public void m216672R0() {
        act().startActivity(LikersAct.m56544X1(act(), this.f200869a));
        act().m66873d2();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f200877i = CoreModule.f17545c.f19687u0.f19255l0.get().longValue();
        CoreModule.f17545c.f19687u0.f19255l0.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19687u0.f19254k0.put(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        tae0.m187705h().f169114a = true;
        creates(new e30() { // from class: l.lzf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130649a.m216660y0((Bundle) obj);
            }
        }, new d30() { // from class: l.pzf
            @Override // p149l.d30
            public final void call() {
                yzf.m216657n0();
            }
        });
        duringCreated(CoreModule.f17545c.f19687u0.m30411R6()).subscribe(mkd0.m154956H(new e30() { // from class: l.qzf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157042a.m216679z0((j760) obj);
            }
        }, new e30() { // from class: l.rzf
            @Override // p149l.e30
            public final void call(Object obj) {
                yzf.m216656m0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.m31483n3().distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.szf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167056a.m216661A0((Counter) obj);
            }
        }, new e30() { // from class: l.tzf
            @Override // p149l.e30
            public final void call(Object obj) {
                yzf.m216651h0((Throwable) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.uzf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f178987a.m216645C0((C4319c) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.vzf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183623a.m216646D0((C4319c) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
        tae0.m187705h().f169114a = false;
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(l0g l0gVar) {
        super.mo51532C(l0gVar);
    }

    /* JADX INFO: renamed from: r0 */
    public final String m216674r0() {
        return ((CoreModule.m29935P().m94651a().mo33519ht() && TextUtils.equals(this.f200869a, "p_meet_view,e_see_banner,click")) || TextUtils.equals(this.f200869a, "p_meet_view,e_see_banner,click") || TextUtils.equals(this.f200869a, "p_navigation_see,default") || TextUtils.equals(this.f200869a, "p_messages_view,e_see_banner,click") || TextUtils.equals(this.f200869a, "p_popup_see,default")) ? this.f200869a : w2b0.m201089c("p_navigation_see,default", 1);
    }

    /* JADX INFO: renamed from: s0 */
    public void m216675s0() {
        if ((CoreModule.m29935P().m94651a().mo33529k() && mqi0.m155953x(12, 13)) || !NullChecker.m81303a(act()) || act().isFinishing() || act().isDestroyed()) {
            return;
        }
        CoreModule.m29935P().m94651a().showSeeDialog(act(), new d30() { // from class: l.ozf
            @Override // p149l.d30
            public final void call() {
                this.f146421a.m216669O0();
            }
        }, m216674r0());
    }

    /* JADX INFO: renamed from: t0 */
    public final String m216676t0(int i) {
        if (i == 0) {
            return "?";
        }
        return i >= 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: u0 */
    public final String m216677u0() {
        if ((CoreModule.m29935P().m94651a().mo33519ht() && TextUtils.equals(this.f200869a, "p_meet_view,e_see_banner,click")) || TextUtils.equals(this.f200869a, "p_meet_view,e_see_banner,click") || TextUtils.equals(this.f200869a, "p_navigation_see,default") || TextUtils.equals(this.f200869a, "p_messages_view,e_see_banner,click")) {
            return this.f200869a;
        }
        return TextUtils.equals(this.f200869a, "p_popup_see,default") ? "p_popup_see,card_button_pull" : w2b0.m201089c("p_navigation_see,card_button_pull", 1);
    }

    /* JADX INFO: renamed from: x0 */
    public String m216678x0() {
        int i = this.f200875g;
        if (i < 10000) {
            return String.valueOf(i);
        }
        return new DecimalFormat("#.#").format(this.f200875g / 10000.0f) + "w";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m216679z0(j760 j760Var) {
        String string;
        CoreModule.f17545c.f19687u0.f19263t0 = true;
        int iIntValue = ((Integer) j760Var.f116564a).intValue();
        boolean zM200296J = vwb.m200296J((Collection) j760Var.f116565b);
        this.f200875g = iIntValue;
        if (!zM200296J) {
            ((l0g) this.viewModel).m148084Y((List) j760Var.f116565b);
            if (!this.f200872d && this.f200875g > 0) {
                m216669O0();
            }
        } else if ((CoreModule.m29935P().m94651a().mo33529k() && PicksHelper.INSTANCE.m56740b().m56735m()) || m216670P0()) {
            ((l0g) this.viewModel).m148084Y((List) j760Var.f116565b);
        }
        if (iIntValue <= 0) {
            act().setTitle(m216670P0() ? R$string.f20661l0 : R$string.f20624Y0);
            return;
        }
        Act act = act();
        if (m216670P0()) {
            string = act().getResources().getString(R$string.f20661l0) + "(" + iIntValue + ")";
        } else {
            string = act().getResources().getString(R$string.f20622X0, m216676t0(iIntValue));
        }
        act.setTitle(string);
    }
}
