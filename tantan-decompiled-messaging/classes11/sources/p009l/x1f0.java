package p009l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipActivity;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.task.TaskCenterAct;
import com.p000p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.account.NewAccountSecureAct;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.settings.AboutTantanAct;
import com.p1.mobile.putong.core.ui.settings.SettingsFragOld;
import com.p1.mobile.putong.core.ui.settings.b;
import com.p1.mobile.putong.core.ui.verification.VerificationCenterAct;
import com.p1.mobile.putong.core.ui.wallet.TanTanCoinAct;
import com.p1.mobile.putong.data.LinkChannel;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.hpd0;
import l.j760;
import l.jq2;
import l.lva;
import l.mkd0;
import l.o6j0;
import l.r9m;
import l.tbk;
import l.ukf0;
import l.upa;
import l.vwb;
import l.w9j;
import l.wvv;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class x1f0 extends jq2<d2f0> {

    /* JADX INFO: renamed from: b */
    public static hpd0 f22398b = new hpd0("NEW_UI_1_FEEDBACK_CLICKED", Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public SidesSlipActivity f22399a;

    public x1f0(SidesSlipActivity sidesSlipActivity) {
        super(sidesSlipActivity);
        this.f22399a = sidesSlipActivity;
    }

    /* JADX INFO: renamed from: I0 */
    private void m24645I0(Class<? extends PutongFrag> cls) {
        Intent intent = new Intent((Context) act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", cls.getSimpleName());
        this.f22399a.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m24650j0(Bundle bundle) {
        ((d2f0) ((jq2) this).viewModel).m12913E(true);
        ((d2f0) ((jq2) this).viewModel).m12923r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m24651k0(c cVar) {
        if (cVar == c.j) {
            this.f22399a.finish();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m24652A0() {
        act().startActivity(new Intent((Context) act(), (Class<?>) NewAccountSecureAct.class));
    }

    /* JADX INFO: renamed from: C0 */
    public void m24653C0() {
        CoreDlg.D1(act(), "menu", vwb.f0(new LinkChannel[]{LinkChannel.get("wechat-moments")}));
        this.f22399a.finish();
    }

    /* JADX INFO: renamed from: D0 */
    public void m24654D0() {
        zvf0.r("e_surprisebox_navigation", this.f22399a.pageId());
        if (upa.M2()) {
            Intent intent = new Intent((Context) this.f22399a, (Class<?>) NewMainAct.class);
            intent.putExtra("extra_show_surprise_box_dialog", true);
            this.f22399a.startActivity(intent);
            this.f22399a.finish();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m24655E0() {
        zvf0.r("e_task_entrance", "p_my_page");
        PutongMvpAct putongMvpAct = this.f22399a;
        putongMvpAct.startActivity(TaskCenterAct.m7673Y1(putongMvpAct));
    }

    /* JADX INFO: renamed from: F0 */
    public void m24656F0() {
        zvf0.r("e_avatarVerification_main_entrance_click", this.f22399a.pageId());
        PutongMvpAct putongMvpAct = this.f22399a;
        putongMvpAct.startActivity(VerificationCenterAct.X1(putongMvpAct, false));
    }

    /* JADX INFO: renamed from: G0 */
    public void m24657G0() {
        CoreModule.Q().m9019M6().m12099r(this.f22399a, null);
    }

    /* JADX INFO: renamed from: H0 */
    public void m24658H0() {
        o6j0.c("e_wallet", this.f22399a.pageId(), new o6j0.a[0]);
        this.f22399a.startActivity(TanTanCoinAct.X1(act()));
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m24659J0() {
        return (wvv.u() || wvv.t()) && !wn90.m24339F().m24381N();
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m24660L0() {
        return !((Boolean) b.m2.get()).booleanValue() && NotificationCheckerCommon.m9539a() == NotificationCheckerCommon.State.closed;
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m24661N0() {
        if (m24659J0()) {
            return true;
        }
        return upa.D2() && m24660L0();
    }

    /* JADX INFO: renamed from: O0 */
    public void m24662O0() {
        CoreModule.c.U1.R.put(Boolean.TRUE);
        ((d2f0) ((jq2) this).viewModel).m12910B(12, false);
        ft4.m14580b().m14583d(this.f22399a);
        zvf0.r("e_my_chat_assist_entrance", "p_my_page");
    }

    /* JADX INFO: renamed from: a0 */
    public void m24663a0() {
        super.a0();
        creates(new e30() { // from class: l.t1f0
            public final void call(Object obj) {
                this.f20517a.m24650j0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.u1f0
            public final void call(Object obj) {
                this.f20958a.m24651k0((c) obj);
            }
        }));
        if (upa.z()) {
            this.f22399a.duringCreated(CoreModule.c.e0.o9()).map(new w9j() { // from class: l.v1f0
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return user.riskAuditUser(CoreModule.c.e0.Pa("fake_risk_audit_default_" + ((DbObject) user).id));
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.w1f0
                public final void call(Object obj) {
                    this.f21840a.m24665l0((User) obj);
                }
            }));
        }
        m24664i0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m24665l0(User user) {
        ((d2f0) ((jq2) this).viewModel).m12930z(user);
    }

    /* JADX INFO: renamed from: m0 */
    public void m24666m0() {
        this.f22399a.startActivity(new Intent((Context) this.f22399a, (Class<?>) AboutTantanAct.class));
    }

    /* JADX INFO: renamed from: n0 */
    public void m24667n0() {
        CoreModule.c.m0.o1.put(Boolean.FALSE);
        zvf0.r("e_mypage_checkin", "p_my_page");
        ((d2f0) ((jq2) this).viewModel).m12910B(10, false);
    }

    /* JADX INFO: renamed from: o0 */
    public void m24668o0() {
        o6j0.c("e_presentwall", this.f22399a.pageId(), new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public void m24669p0() {
        o6j0.c("e_my_group_chat", this.f22399a.pageId(), new o6j0.a[0]);
        act().startActivity(WebViewAct.m10498Z1(act(), "", tbk.p()));
    }

    /* JADX INFO: renamed from: q0 */
    public void m24670q0() {
        o6j0.c("e_my_chat_assist_entrance", "p_my_page", new o6j0.a[0]);
        o8m.m19650a().f17879h.put(Boolean.TRUE);
        this.f22399a.startActivity(WebViewAct.m10498Z1(act(), "", o8m.m19651b()));
    }

    /* JADX INFO: renamed from: r0 */
    public void m24671r0() {
        CoreModule.c.m0.n1.put(Boolean.FALSE);
        ((d2f0) ((jq2) this).viewModel).m12910B(8, false);
    }

    /* JADX INFO: renamed from: s0 */
    public void m24672s0() {
        CoreModule.Q().m9036Z8(this.f22399a, null);
    }

    /* JADX INFO: renamed from: t0 */
    public void m24673t0(String str, String str2) {
        zvf0.u("e_oms_slot", this.f22399a.pageId(), new j760[]{vwb.Y("oms_trace", str2)});
        if (TextUtils.isEmpty(str)) {
            return;
        }
        lva.D(act(), Uri.parse(str));
    }

    /* JADX INFO: renamed from: u0 */
    public void m24674u0() {
        zvf0.r("e_opening_entrance", "p_my_page");
        PutongMvpAct putongMvpAct = this.f22399a;
        putongMvpAct.startActivity(MkWebViewAct.m10587e2(putongMvpAct, "", r9m.p(!((Boolean) CoreModule.c.f0.G1.get()).booleanValue()), true, true, true, true, null));
        CoreModule.c.f0.G1.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: x0 */
    public void m24675x0() {
        new ukf0(act()).a();
        m24676y0();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m24676y0() {
        f22398b.put(Boolean.TRUE);
        ((d2f0) ((jq2) this).viewModel).m12910B(4, false);
        this.f22399a.finish();
    }

    /* JADX INFO: renamed from: z0 */
    public void m24677z0(boolean z) {
        if (!z) {
            zvf0.s("e_red_dot_me_settings", this.f22399a.pageId(), u4e.m22747d());
        } else if (m24659J0()) {
            zvf0.s("e_red_dot_me_settings", this.f22399a.pageId(), u4e.m22746c("red_dot", "red_dot_normal", "setting_tab", "navigation_view_page", "no_location_permission_tips"));
        } else {
            zvf0.s("e_red_dot_me_settings", this.f22399a.pageId(), u4e.m22746c("red_dot", "red_dot_normal", "setting_tab", "navigation_view_page", "sub_page_unread"));
        }
        if (m24659J0()) {
            wn90.m24339F().m24403p0(true);
        }
        ((d2f0) ((jq2) this).viewModel).m12910B(0, m24661N0());
        m24645I0(SettingsFragOld.class);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: i0 */
    public void m24664i0() {
    }
}
