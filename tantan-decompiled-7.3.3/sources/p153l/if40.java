package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class if40 extends ar2<mf40> {

    /* JADX INFO: renamed from: a */
    public PrivacyMembershipSetting f114645a;

    /* JADX INFO: renamed from: b */
    public boolean f114646b;

    public if40(Act act) {
        super(act);
        this.f114646b = false;
    }

    /* JADX INFO: renamed from: U0 */
    private void m139679U0(Runnable runnable, String str) {
        m139711V0(runnable, str, true);
    }

    /* JADX INFO: renamed from: X0 */
    private void m139680X0() {
        if (NullChecker.m82486a(this.f114645a)) {
            if (joa.m146361M3() || CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
                duringCreated(CoreModule.f18264c.f20303E0.m141076R3(this.f114645a)).subscribe(psd0.m173597H(new y20() { // from class: l.ve40
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        if40.m139693q0((uxj0) obj);
                    }
                }, new y20() { // from class: l.we40
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        bsj0.m106246D((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m139693q0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m139695A0(View view) {
        m139679U0(new Runnable() { // from class: l.hf40
            @Override // java.lang.Runnable
            public final void run() {
                this.f109216a.m139696C0();
            }
        }, "hide_svip");
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m139696C0() {
        if (NullChecker.m82486a(this.f114645a) && !this.f114645a.hideIcon.booleanValue() && (!gta.m132210e().m132214d().mo34758U9() || !wj90.m206618a("new_privacy_presenter"))) {
            o1j0.m165651y(act().getString(R$string.f28617Q3));
        }
        ((mf40) this.viewModel).m158120k();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m139697D0(View view) {
        ((mf40) this.viewModel).m158121l();
        i4g0.m138524v("e_privacy", ((mf40) this.viewModel).m158125q(), jyb.m147494Y("privacy_type", "freeze_activetime"));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m139698E0() {
        if (NullChecker.m82486a(this.f114645a) && !this.f114645a.frozenActivity.booleanValue()) {
            new th0.C20312a(act()).m191150i(R$string.f28607O3).m191146e(R$string.f28597M3).m191158q(R$string.f28602N3).m191156o(new View.OnClickListener() { // from class: l.ye40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f198663a.m139697D0(view);
                }
            }).m191142a().m191141g();
        } else {
            i4g0.m138524v("e_privacy", ((mf40) this.viewModel).m158131x(), jyb.m147494Y("privacy_type", "freeze_activetime"));
            ((mf40) this.viewModel).m158121l();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m139699F0(View view) {
        m139711V0(new Runnable() { // from class: l.ff40
            @Override // java.lang.Runnable
            public final void run() {
                this.f98742a.m139698E0();
            }
        }, "freeze_activetime", false);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m139700G0() {
        if (NullChecker.m82486a(this.f114645a) && !this.f114645a.hideAge.booleanValue()) {
            o1j0.m165651y(act().getString(R$string.f28612P3));
        }
        ((mf40) this.viewModel).m158122m();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m139701H0(View view) {
        m139679U0(new Runnable() { // from class: l.gf40
            @Override // java.lang.Runnable
            public final void run() {
                this.f103880a.m139700G0();
            }
        }, "hide_age");
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m139702I0() {
        if (NullChecker.m82486a(this.f114645a) && !this.f114645a.hideLocation.booleanValue()) {
            o1j0.m165651y(act().getString(R$string.f28622R3));
        }
        ((mf40) this.viewModel).m158123n();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m139703J0(View view) {
        m139679U0(new Runnable() { // from class: l.df40
            @Override // java.lang.Runnable
            public final void run() {
                this.f88115a.m139702I0();
            }
        }, "hide_location");
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m139704L0() {
        ((mf40) this.viewModel).m158124p();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m139705N0(View view) {
        m139711V0(new Runnable() { // from class: l.ef40
            @Override // java.lang.Runnable
            public final void run() {
                this.f93698a.m139704L0();
            }
        }, "show_to_mylikes_only", false);
    }

    /* JADX INFO: renamed from: O0 */
    public View.OnClickListener m139706O0() {
        return new View.OnClickListener() { // from class: l.bf40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76448a.m139695A0(view);
            }
        };
    }

    /* JADX INFO: renamed from: P0 */
    public View.OnClickListener m139707P0() {
        return new View.OnClickListener() { // from class: l.ze40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203973a.m139699F0(view);
            }
        };
    }

    /* JADX INFO: renamed from: Q0 */
    public View.OnClickListener m139708Q0() {
        return new View.OnClickListener() { // from class: l.ue40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178630a.m139701H0(view);
            }
        };
    }

    /* JADX INFO: renamed from: R0 */
    public View.OnClickListener m139709R0() {
        return new View.OnClickListener() { // from class: l.af40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70849a.m139703J0(view);
            }
        };
    }

    /* JADX INFO: renamed from: S0 */
    public View.OnClickListener m139710S0() {
        return new View.OnClickListener() { // from class: l.cf40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81479a.m139705N0(view);
            }
        };
    }

    /* JADX INFO: renamed from: V0 */
    public final void m139711V0(Runnable runnable, String str, boolean z) {
        boolean zIsConnected = Network.isConnected(CoreModule.f18263b);
        i4g0.m138523u("e_privacy", ((mf40) this.viewModel).m158131x(), jyb.m147494Y("privacy_type", str));
        if (zIsConnected && NullChecker.m82486a(this.f114645a) && joa.m146361M3()) {
            if (z) {
                i4g0.m138524v("e_privacy", ((mf40) this.viewModel).m158131x(), jyb.m147494Y("privacy_type", str));
            }
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        if (zIsConnected && NullChecker.m82486a(this.f114645a)) {
            CoreModule.f18276o.m132214d().mo34855ip(act(), TextUtils.equals(((mf40) this.viewModel).m158125q(), "p_setting_privacy_manage") ? "p_setting_privacy_manage,privacy" : "p_home_filter,privacy", Privilege.privacy_membership);
        } else {
            o1j0.m165634h(R$string.f28564G0);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m139712W0() {
        if (this.f114646b) {
            m139680X0();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m139713Y0(PrivacyMembershipSetting privacyMembershipSetting) {
        this.f114645a = privacyMembershipSetting;
        ((mf40) this.viewModel).m158127s(privacyMembershipSetting);
    }

    /* JADX INFO: renamed from: a1 */
    public void m139714a1(boolean z) {
        this.f114646b = z;
    }

    /* JADX INFO: renamed from: b1 */
    public void m139715b1(boolean z) {
        this.f114645a.showMeToMyLike = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: s0 */
    public void m139716s0(boolean z) {
        this.f114645a.frozenActivity = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: t0 */
    public void m139717t0(boolean z) {
        this.f114645a.hideAge = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: u0 */
    public void m139718u0(boolean z) {
        this.f114645a.hideLocation = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: x0 */
    public void m139719x0(boolean z) {
        this.f114645a.hideIcon = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: y0 */
    public void m139720y0() {
        duringCreated(CoreModule.f18264c.f20303E0.m141080V3()).subscribe(psd0.m173596G(new y20() { // from class: l.xe40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193668a.m139721z0((PrivacyMembershipSetting) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m139721z0(PrivacyMembershipSetting privacyMembershipSetting) {
        if (NullChecker.m82486a(privacyMembershipSetting)) {
            PrivacyMembershipSetting privacyMembershipSettingMo225055clone = privacyMembershipSetting.mo225055clone();
            this.f114645a = privacyMembershipSettingMo225055clone;
            m139713Y0(privacyMembershipSettingMo225055clone);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
