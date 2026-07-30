package p153l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipActivity;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.task.TaskCenterAct;
import com.p051p1.mobile.putong.core.p058ui.account.NewAccountSecureAct;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.settings.AboutTantanAct;
import com.p051p1.mobile.putong.core.p058ui.settings.C9012b;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsFragOld;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinAct;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;

/* JADX INFO: loaded from: classes11.dex */
public class eaf0 extends ar2<kaf0> {

    /* JADX INFO: renamed from: b */
    public static jxd0 f92780b = new jxd0("NEW_UI_1_FEEDBACK_CLICKED", Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public SidesSlipActivity f92781a;

    public eaf0(SidesSlipActivity sidesSlipActivity) {
        super(sidesSlipActivity);
        this.f92781a = sidesSlipActivity;
    }

    /* JADX INFO: renamed from: I0 */
    private void m120047I0(Class<? extends PutongFrag> cls) {
        Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", cls.getSimpleName());
        this.f92781a.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m120052j0(Bundle bundle) {
        ((kaf0) this.viewModel).m148955E(true);
        ((kaf0) this.viewModel).m148964r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m120053k0(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            this.f92781a.m68056e2();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m120054A0() {
        act().startActivity(new Intent(act(), (Class<?>) NewAccountSecureAct.class));
    }

    /* JADX INFO: renamed from: C0 */
    public void m120055C0() {
        CoreDlg.m46161D1(act(), NavigationIntent.menu, jyb.m147507f0(LinkChannel.get("wechat-moments")));
        this.f92781a.m68056e2();
    }

    /* JADX INFO: renamed from: D0 */
    public void m120056D0() {
        i4g0.m138520r("e_surprisebox_navigation", this.f92781a.pageId());
        if (gra.m131600M2()) {
            Intent intent = new Intent(this.f92781a, (Class<?>) NewMainAct.class);
            intent.putExtra("extra_show_surprise_box_dialog", true);
            this.f92781a.startActivity(intent);
            this.f92781a.m68056e2();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m120057E0() {
        i4g0.m138520r("e_task_entrance", "p_my_page");
        SidesSlipActivity sidesSlipActivity = this.f92781a;
        sidesSlipActivity.startActivity(TaskCenterAct.m44620Z1(sidesSlipActivity));
    }

    /* JADX INFO: renamed from: F0 */
    public void m120058F0() {
        i4g0.m138520r("e_avatarVerification_main_entrance_click", this.f92781a.pageId());
        SidesSlipActivity sidesSlipActivity = this.f92781a;
        sidesSlipActivity.startActivity(VerificationCenterAct.m57174Y1(sidesSlipActivity, false));
    }

    /* JADX INFO: renamed from: G0 */
    public void m120059G0() {
        CoreModule.m30934Q().mo68412M6().mo127347r(this.f92781a, null);
    }

    /* JADX INFO: renamed from: H0 */
    public void m120060H0() {
        sfj0.m185596c("e_wallet", this.f92781a.pageId(), new sfj0.C20032a[0]);
        this.f92781a.startActivity(TanTanCoinAct.m59260Y1(act()));
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m120061J0() {
        return (xxv.m213594u() || xxv.m213593t()) && !aw90.m100562F().m100604N();
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m120062L0() {
        return !C9012b.f36749m2.get().booleanValue() && NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.closed;
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m120063N0() {
        if (m120061J0()) {
            return true;
        }
        return gra.m131555D2() && m120062L0();
    }

    /* JADX INFO: renamed from: O0 */
    public void m120064O0() {
        CoreModule.f18264c.f20353U1.f98890R.put(Boolean.TRUE);
        ((kaf0) this.viewModel).m148953B(12, false);
        eu4.m122523b().m122526d(this.f92781a);
        i4g0.m138520r("e_my_chat_assist_entrance", "p_my_page");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.aaf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69138a.m120052j0((Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.baf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75686a.m120053k0((C4470c) obj);
            }
        }));
        if (gra.m131778z()) {
            this.f92781a.duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).map(new qcj() { // from class: l.caf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return user.riskAuditUser(CoreModule.f18264c.f20381e0.m116503Pa("fake_risk_audit_default_" + user.f56859id));
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.daf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f85870a.m120066l0((User) obj);
                }
            }));
        }
        m120065i0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m120066l0(User user) {
        ((kaf0) this.viewModel).m148971z(user);
    }

    /* JADX INFO: renamed from: m0 */
    public void m120067m0() {
        this.f92781a.startActivity(new Intent(this.f92781a, (Class<?>) AboutTantanAct.class));
    }

    /* JADX INFO: renamed from: n0 */
    public void m120068n0() {
        CoreModule.f18264c.f20405m0.f20179o1.put(Boolean.FALSE);
        i4g0.m138520r("e_mypage_checkin", "p_my_page");
        ((kaf0) this.viewModel).m148953B(10, false);
    }

    /* JADX INFO: renamed from: o0 */
    public void m120069o0() {
        sfj0.m185596c("e_presentwall", this.f92781a.pageId(), new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public void m120070p0() {
        sfj0.m185596c("e_my_group_chat", this.f92781a.pageId(), new sfj0.C20032a[0]);
        act().startActivity(WebViewAct.m81347a2(act(), "", jek.m144584p()));
    }

    /* JADX INFO: renamed from: q0 */
    public void m120071q0() {
        sfj0.m185596c("e_my_chat_assist_entrance", "p_my_page", new sfj0.C20032a[0]);
        ebm.m120180a().f92940h.put(Boolean.TRUE);
        this.f92781a.startActivity(WebViewAct.m81347a2(act(), "", ebm.m120181b()));
    }

    /* JADX INFO: renamed from: r0 */
    public void m120072r0() {
        CoreModule.f18264c.f20405m0.f20176n1.put(Boolean.FALSE);
        ((kaf0) this.viewModel).m148953B(8, false);
    }

    /* JADX INFO: renamed from: s0 */
    public void m120073s0() {
        CoreModule.m30934Q().mo68434Z8(this.f92781a, null);
    }

    /* JADX INFO: renamed from: t0 */
    public void m120074t0(String str, String str2) {
        i4g0.m138523u("e_oms_slot", this.f92781a.pageId(), jyb.m147494Y("oms_trace", str2));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        xwa.m213304D(act(), Uri.parse(str));
    }

    /* JADX INFO: renamed from: u0 */
    public void m120075u0() {
        i4g0.m138520r("e_opening_entrance", "p_my_page");
        SidesSlipActivity sidesSlipActivity = this.f92781a;
        sidesSlipActivity.startActivity(MkWebViewAct.m81423g2(sidesSlipActivity, "", hcm.m134471p(!CoreModule.f18264c.f20384f0.f20602G1.get().booleanValue()), true, true, true, true, null));
        CoreModule.f18264c.f20384f0.f20602G1.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: x0 */
    public void m120076x0() {
        new dtf0(act()).m117853a();
        m120077y0();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m120077y0() {
        f92780b.put(Boolean.TRUE);
        ((kaf0) this.viewModel).m148953B(4, false);
        this.f92781a.m68056e2();
    }

    /* JADX INFO: renamed from: z0 */
    public void m120078z0(boolean z) {
        if (!z) {
            i4g0.m138521s("e_red_dot_me_settings", this.f92781a.pageId(), i6e.m138812d());
        } else if (m120061J0()) {
            i4g0.m138521s("e_red_dot_me_settings", this.f92781a.pageId(), i6e.m138811c("red_dot", "red_dot_normal", "setting_tab", "navigation_view_page", "no_location_permission_tips"));
        } else {
            i4g0.m138521s("e_red_dot_me_settings", this.f92781a.pageId(), i6e.m138811c("red_dot", "red_dot_normal", "setting_tab", "navigation_view_page", "sub_page_unread"));
        }
        if (m120061J0()) {
            aw90.m100562F().m100626p0(true);
        }
        ((kaf0) this.viewModel).m148953B(0, m120063N0());
        m120047I0(SettingsFragOld.class);
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: i0 */
    public void m120065i0() {
    }
}
