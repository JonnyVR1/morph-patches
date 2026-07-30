package p149l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipActivity;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.task.TaskCenterAct;
import com.p046p1.mobile.putong.core.p053ui.account.NewAccountSecureAct;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.settings.AboutTantanAct;
import com.p046p1.mobile.putong.core.p053ui.settings.C8849b;
import com.p046p1.mobile.putong.core.p053ui.settings.SettingsFragOld;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinAct;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;

/* JADX INFO: loaded from: classes11.dex */
public class x1f0 extends jq2<d2f0> {

    /* JADX INFO: renamed from: b */
    public static hpd0 f189070b = new hpd0("NEW_UI_1_FEEDBACK_CLICKED", Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public SidesSlipActivity f189071a;

    public x1f0(SidesSlipActivity sidesSlipActivity) {
        super(sidesSlipActivity);
        this.f189071a = sidesSlipActivity;
    }

    /* JADX INFO: renamed from: I0 */
    private void m206709I0(Class<? extends PutongFrag> cls) {
        Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", cls.getSimpleName());
        this.f189071a.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m206714j0(Bundle bundle) {
        ((d2f0) this.viewModel).m109736E(true);
        ((d2f0) this.viewModel).m109745r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m206715k0(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            this.f189071a.m66873d2();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m206716A0() {
        act().startActivity(new Intent(act(), (Class<?>) NewAccountSecureAct.class));
    }

    /* JADX INFO: renamed from: C0 */
    public void m206717C0() {
        CoreDlg.m44978D1(act(), NavigationIntent.menu, vwb.m200324f0(LinkChannel.get("wechat-moments")));
        this.f189071a.m66873d2();
    }

    /* JADX INFO: renamed from: D0 */
    public void m206718D0() {
        zvf0.m220396r("e_surprisebox_navigation", this.f189071a.pageId());
        if (upa.m194669M2()) {
            Intent intent = new Intent(this.f189071a, (Class<?>) NewMainAct.class);
            intent.putExtra("extra_show_surprise_box_dialog", true);
            this.f189071a.startActivity(intent);
            this.f189071a.m66873d2();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m206719E0() {
        zvf0.m220396r("e_task_entrance", "p_my_page");
        SidesSlipActivity sidesSlipActivity = this.f189071a;
        sidesSlipActivity.startActivity(TaskCenterAct.m43434Y1(sidesSlipActivity));
    }

    /* JADX INFO: renamed from: F0 */
    public void m206720F0() {
        zvf0.m220396r("e_avatarVerification_main_entrance_click", this.f189071a.pageId());
        SidesSlipActivity sidesSlipActivity = this.f189071a;
        sidesSlipActivity.startActivity(VerificationCenterAct.m55991X1(sidesSlipActivity, false));
    }

    /* JADX INFO: renamed from: G0 */
    public void m206721G0() {
        CoreModule.m29936Q().mo67229M6().mo102433r(this.f189071a, null);
    }

    /* JADX INFO: renamed from: H0 */
    public void m206722H0() {
        o6j0.m162859c("e_wallet", this.f189071a.pageId(), new o6j0.C18854a[0]);
        this.f189071a.startActivity(TanTanCoinAct.m58077X1(act()));
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m206723J0() {
        return (wvv.m205781u() || wvv.m205780t()) && !wn90.m204602F().m204644N();
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m206724L0() {
        return !C8849b.f35901m2.get().booleanValue() && NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.closed;
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m206725N0() {
        if (m206723J0()) {
            return true;
        }
        return upa.m194624D2() && m206724L0();
    }

    /* JADX INFO: renamed from: O0 */
    public void m206726O0() {
        CoreModule.f17545c.f19611U1.f75277R.put(Boolean.TRUE);
        ((d2f0) this.viewModel).m109734B(12, false);
        ft4.m123008b().m123011d(this.f189071a);
        zvf0.m220396r("e_my_chat_assist_entrance", "p_my_page");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.t1f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167315a.m206714j0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.u1f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173004a.m206715k0((C4319c) obj);
            }
        }));
        if (upa.m194847z()) {
            this.f189071a.duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).map(new w9j() { // from class: l.v1f0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return user.riskAuditUser(CoreModule.f17545c.f19639e0.m169430Pa("fake_risk_audit_default_" + user.f56011id));
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.w1f0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f184000a.m206728l0((User) obj);
                }
            }));
        }
        m206727i0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m206728l0(User user) {
        ((d2f0) this.viewModel).m109752z(user);
    }

    /* JADX INFO: renamed from: m0 */
    public void m206729m0() {
        this.f189071a.startActivity(new Intent(this.f189071a, (Class<?>) AboutTantanAct.class));
    }

    /* JADX INFO: renamed from: n0 */
    public void m206730n0() {
        CoreModule.f17545c.f19663m0.f19437o1.put(Boolean.FALSE);
        zvf0.m220396r("e_mypage_checkin", "p_my_page");
        ((d2f0) this.viewModel).m109734B(10, false);
    }

    /* JADX INFO: renamed from: o0 */
    public void m206731o0() {
        o6j0.m162859c("e_presentwall", this.f189071a.pageId(), new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public void m206732p0() {
        o6j0.m162859c("e_my_group_chat", this.f189071a.pageId(), new o6j0.C18854a[0]);
        act().startActivity(WebViewAct.m80164Z1(act(), "", tbk.m187869p()));
    }

    /* JADX INFO: renamed from: q0 */
    public void m206733q0() {
        o6j0.m162859c("e_my_chat_assist_entrance", "p_my_page", new o6j0.C18854a[0]);
        o8m.m163183a().f142655h.put(Boolean.TRUE);
        this.f189071a.startActivity(WebViewAct.m80164Z1(act(), "", o8m.m163184b()));
    }

    /* JADX INFO: renamed from: r0 */
    public void m206734r0() {
        CoreModule.f17545c.f19663m0.f19434n1.put(Boolean.FALSE);
        ((d2f0) this.viewModel).m109734B(8, false);
    }

    /* JADX INFO: renamed from: s0 */
    public void m206735s0() {
        CoreModule.m29936Q().mo67251Z8(this.f189071a, null);
    }

    /* JADX INFO: renamed from: t0 */
    public void m206736t0(String str, String str2) {
        zvf0.m220399u("e_oms_slot", this.f189071a.pageId(), vwb.m200311Y("oms_trace", str2));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        lva.m151843D(act(), Uri.parse(str));
    }

    /* JADX INFO: renamed from: u0 */
    public void m206737u0() {
        zvf0.m220396r("e_opening_entrance", "p_my_page");
        SidesSlipActivity sidesSlipActivity = this.f189071a;
        sidesSlipActivity.startActivity(MkWebViewAct.m80240e2(sidesSlipActivity, "", r9m.m178394p(!CoreModule.f17545c.f19642f0.f19860G1.get().booleanValue()), true, true, true, true, null));
        CoreModule.f17545c.f19642f0.f19860G1.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: x0 */
    public void m206738x0() {
        new ukf0(act()).m194154a();
        m206739y0();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m206739y0() {
        f189070b.put(Boolean.TRUE);
        ((d2f0) this.viewModel).m109734B(4, false);
        this.f189071a.m66873d2();
    }

    /* JADX INFO: renamed from: z0 */
    public void m206740z0(boolean z) {
        if (!z) {
            zvf0.m220397s("e_red_dot_me_settings", this.f189071a.pageId(), u4e.m191729d());
        } else if (m206723J0()) {
            zvf0.m220397s("e_red_dot_me_settings", this.f189071a.pageId(), u4e.m191728c("red_dot", "red_dot_normal", "setting_tab", "navigation_view_page", "no_location_permission_tips"));
        } else {
            zvf0.m220397s("e_red_dot_me_settings", this.f189071a.pageId(), u4e.m191728c("red_dot", "red_dot_normal", "setting_tab", "navigation_view_page", "sub_page_unread"));
        }
        if (m206723J0()) {
            wn90.m204602F().m204666p0(true);
        }
        ((d2f0) this.viewModel).m109734B(0, m206725N0());
        m206709I0(SettingsFragOld.class);
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: i0 */
    public void m206727i0() {
    }
}
