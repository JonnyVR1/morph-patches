package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class u640 extends jq2<y640> {

    /* JADX INFO: renamed from: a */
    public PrivacyMembershipSetting f174795a;

    /* JADX INFO: renamed from: b */
    public boolean f174796b;

    public u640(Act act) {
        super(act);
        this.f174796b = false;
    }

    /* JADX INFO: renamed from: U0 */
    private void m191911U0(Runnable runnable, String str) {
        m191943V0(runnable, str, true);
    }

    /* JADX INFO: renamed from: X0 */
    private void m191912X0() {
        if (NullChecker.m81303a(this.f174795a)) {
            if (xma.m210047L3() || CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
                duringCreated(CoreModule.f17545c.f19561E0.m203788R3(this.f174795a)).subscribe(mkd0.m154956H(new e30() { // from class: l.h640
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        u640.m191925q0((roj0) obj);
                    }
                }, new e30() { // from class: l.i640
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        yij0.m214926D((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m191925q0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m191927A0(View view) {
        m191911U0(new Runnable() { // from class: l.t640
            @Override // java.lang.Runnable
            public final void run() {
                this.f167922a.m191928C0();
            }
        }, "hide_svip");
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m191928C0() {
        if (NullChecker.m81303a(this.f174795a) && !this.f174795a.hideIcon.booleanValue() && (!ura.m195053e().m195057d().mo33755U9() || !sb90.m183205a("new_privacy_presenter"))) {
            lsi0.m151595y(act().getString(R$string.f27769Q3));
        }
        ((y640) this.viewModel).m213082k();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m191929D0(View view) {
        ((y640) this.viewModel).m213083l();
        zvf0.m220400v("e_privacy", ((y640) this.viewModel).m213087q(), vwb.m200311Y("privacy_type", "freeze_activetime"));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m191930E0() {
        if (NullChecker.m81303a(this.f174795a) && !this.f174795a.frozenActivity.booleanValue()) {
            new xh0.C21150a(act()).m208730i(R$string.f27759O3).m208726e(R$string.f27749M3).m208738q(R$string.f27754N3).m208736o(new View.OnClickListener() { // from class: l.k640
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f121262a.m191929D0(view);
                }
            }).m208722a().m208721g();
        } else {
            zvf0.m220400v("e_privacy", ((y640) this.viewModel).m213091x(), vwb.m200311Y("privacy_type", "freeze_activetime"));
            ((y640) this.viewModel).m213083l();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m191931F0(View view) {
        m191943V0(new Runnable() { // from class: l.r640
            @Override // java.lang.Runnable
            public final void run() {
                this.f157892a.m191930E0();
            }
        }, "freeze_activetime", false);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m191932G0() {
        if (NullChecker.m81303a(this.f174795a) && !this.f174795a.hideAge.booleanValue()) {
            lsi0.m151595y(act().getString(R$string.f27764P3));
        }
        ((y640) this.viewModel).m213084m();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m191933H0(View view) {
        m191911U0(new Runnable() { // from class: l.s640
            @Override // java.lang.Runnable
            public final void run() {
                this.f162614a.m191932G0();
            }
        }, "hide_age");
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m191934I0() {
        if (NullChecker.m81303a(this.f174795a) && !this.f174795a.hideLocation.booleanValue()) {
            lsi0.m151595y(act().getString(R$string.f27774R3));
        }
        ((y640) this.viewModel).m213085n();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m191935J0(View view) {
        m191911U0(new Runnable() { // from class: l.p640
            @Override // java.lang.Runnable
            public final void run() {
                this.f147366a.m191934I0();
            }
        }, "hide_location");
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m191936L0() {
        ((y640) this.viewModel).m213086p();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m191937N0(View view) {
        m191943V0(new Runnable() { // from class: l.q640
            @Override // java.lang.Runnable
            public final void run() {
                this.f152851a.m191936L0();
            }
        }, "show_to_mylikes_only", false);
    }

    /* JADX INFO: renamed from: O0 */
    public View.OnClickListener m191938O0() {
        return new View.OnClickListener() { // from class: l.n640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137268a.m191927A0(view);
            }
        };
    }

    /* JADX INFO: renamed from: P0 */
    public View.OnClickListener m191939P0() {
        return new View.OnClickListener() { // from class: l.l640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126230a.m191931F0(view);
            }
        };
    }

    /* JADX INFO: renamed from: Q0 */
    public View.OnClickListener m191940Q0() {
        return new View.OnClickListener() { // from class: l.g640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101224a.m191933H0(view);
            }
        };
    }

    /* JADX INFO: renamed from: R0 */
    public View.OnClickListener m191941R0() {
        return new View.OnClickListener() { // from class: l.m640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131444a.m191935J0(view);
            }
        };
    }

    /* JADX INFO: renamed from: S0 */
    public View.OnClickListener m191942S0() {
        return new View.OnClickListener() { // from class: l.o640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141974a.m191937N0(view);
            }
        };
    }

    /* JADX INFO: renamed from: V0 */
    public final void m191943V0(Runnable runnable, String str, boolean z) {
        boolean zIsConnected = Network.isConnected(CoreModule.f17544b);
        zvf0.m220399u("e_privacy", ((y640) this.viewModel).m213091x(), vwb.m200311Y("privacy_type", str));
        if (zIsConnected && NullChecker.m81303a(this.f174795a) && xma.m210047L3()) {
            if (z) {
                zvf0.m220400v("e_privacy", ((y640) this.viewModel).m213091x(), vwb.m200311Y("privacy_type", str));
            }
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        if (zIsConnected && NullChecker.m81303a(this.f174795a)) {
            CoreModule.f17557o.m195057d().mo33852ip(act(), TextUtils.equals(((y640) this.viewModel).m213087q(), "p_setting_privacy_manage") ? "p_setting_privacy_manage,privacy" : "p_home_filter,privacy", Privilege.privacy_membership);
        } else {
            lsi0.m151578h(R$string.f27716G0);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m191944W0() {
        if (this.f174796b) {
            m191912X0();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m191945Y0(PrivacyMembershipSetting privacyMembershipSetting) {
        this.f174795a = privacyMembershipSetting;
        ((y640) this.viewModel).m213088s(privacyMembershipSetting);
    }

    /* JADX INFO: renamed from: a1 */
    public void m191946a1(boolean z) {
        this.f174796b = z;
    }

    /* JADX INFO: renamed from: b1 */
    public void m191947b1(boolean z) {
        this.f174795a.showMeToMyLike = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: s0 */
    public void m191948s0(boolean z) {
        this.f174795a.frozenActivity = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: t0 */
    public void m191949t0(boolean z) {
        this.f174795a.hideAge = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: u0 */
    public void m191950u0(boolean z) {
        this.f174795a.hideLocation = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: x0 */
    public void m191951x0(boolean z) {
        this.f174795a.hideIcon = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: y0 */
    public void m191952y0() {
        duringCreated(CoreModule.f17545c.f19561E0.m203792V3()).subscribe(mkd0.m154955G(new e30() { // from class: l.j640
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116387a.m191953z0((PrivacyMembershipSetting) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m191953z0(PrivacyMembershipSetting privacyMembershipSetting) {
        if (NullChecker.m81303a(privacyMembershipSetting)) {
            PrivacyMembershipSetting privacyMembershipSettingMo223809clone = privacyMembershipSetting.mo223809clone();
            this.f174795a = privacyMembershipSettingMo223809clone;
            m191945Y0(privacyMembershipSettingMo223809clone);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
