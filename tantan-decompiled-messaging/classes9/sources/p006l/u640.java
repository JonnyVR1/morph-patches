package p006l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.profile.R;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.sb90;
import l.vwb;
import l.xh0;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class u640 extends jq2<y640> {

    /* JADX INFO: renamed from: a */
    public PrivacyMembershipSetting f23373a;

    /* JADX INFO: renamed from: b */
    public boolean f23374b;

    public u640(Act act) {
        super(act);
        this.f23374b = false;
    }

    /* JADX INFO: renamed from: U0 */
    private void m25027U0(Runnable runnable, String str) {
        m25059V0(runnable, str, true);
    }

    /* JADX INFO: renamed from: X0 */
    private void m25028X0() {
        if (NullChecker.a(this.f23373a)) {
            if (xma.m27355L3() || CoreModule.f1534c.f3628e0.m21490p9().isVIP()) {
                duringCreated(CoreModule.f1534c.f3550E0.m26480R3(this.f23373a)).subscribe(mkd0.H(new e30() { // from class: l.h640
                    public final void call(Object obj) {
                        u640.m25041q0((roj0) obj);
                    }
                }, new e30() { // from class: l.i640
                    public final void call(Object obj) {
                        yij0.D((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m25041q0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m25043A0(View view) {
        m25027U0(new Runnable() { // from class: l.t640
            @Override // java.lang.Runnable
            public final void run() {
                this.f21895a.m25044C0();
            }
        }, "hide_svip");
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m25044C0() {
        if (NullChecker.a(this.f23373a) && !this.f23373a.hideIcon.booleanValue() && (!ura.m25555e().m25559d().m5692U9() || !sb90.a("new_privacy_presenter"))) {
            lsi0.y(act().getString(R.string.Q3));
        }
        ((y640) ((jq2) this).viewModel).m28105k();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m25045D0(View view) {
        ((y640) ((jq2) this).viewModel).m28106l();
        zvf0.v("e_privacy", ((y640) ((jq2) this).viewModel).m28110q(), new j760[]{vwb.Y("privacy_type", "freeze_activetime")});
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m25046E0() {
        if (NullChecker.a(this.f23373a) && !this.f23373a.frozenActivity.booleanValue()) {
            new xh0.a(act()).i(R.string.O3).e(R.string.M3).q(R.string.N3).o(new View.OnClickListener() { // from class: l.k640
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15622a.m25045D0(view);
                }
            }).a().g();
        } else {
            zvf0.v("e_privacy", ((y640) ((jq2) this).viewModel).m28114x(), new j760[]{vwb.Y("privacy_type", "freeze_activetime")});
            ((y640) ((jq2) this).viewModel).m28106l();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m25047F0(View view) {
        m25059V0(new Runnable() { // from class: l.r640
            @Override // java.lang.Runnable
            public final void run() {
                this.f20380a.m25046E0();
            }
        }, "freeze_activetime", false);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m25048G0() {
        if (NullChecker.a(this.f23373a) && !this.f23373a.hideAge.booleanValue()) {
            lsi0.y(act().getString(R.string.P3));
        }
        ((y640) ((jq2) this).viewModel).m28107m();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m25049H0(View view) {
        m25027U0(new Runnable() { // from class: l.s640
            @Override // java.lang.Runnable
            public final void run() {
                this.f21115a.m25048G0();
            }
        }, "hide_age");
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m25050I0() {
        if (NullChecker.a(this.f23373a) && !this.f23373a.hideLocation.booleanValue()) {
            lsi0.y(act().getString(R.string.R3));
        }
        ((y640) ((jq2) this).viewModel).m28108n();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m25051J0(View view) {
        m25027U0(new Runnable() { // from class: l.p640
            @Override // java.lang.Runnable
            public final void run() {
                this.f18598a.m25050I0();
            }
        }, "hide_location");
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m25052L0() {
        ((y640) ((jq2) this).viewModel).m28109p();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m25053N0(View view) {
        m25059V0(new Runnable() { // from class: l.q640
            @Override // java.lang.Runnable
            public final void run() {
                this.f19644a.m25052L0();
            }
        }, "show_to_mylikes_only", false);
    }

    /* JADX INFO: renamed from: O0 */
    public View.OnClickListener m25054O0() {
        return new View.OnClickListener() { // from class: l.n640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17504a.m25043A0(view);
            }
        };
    }

    /* JADX INFO: renamed from: P0 */
    public View.OnClickListener m25055P0() {
        return new View.OnClickListener() { // from class: l.l640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16242a.m25047F0(view);
            }
        };
    }

    /* JADX INFO: renamed from: Q0 */
    public View.OnClickListener m25056Q0() {
        return new View.OnClickListener() { // from class: l.g640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13063a.m25049H0(view);
            }
        };
    }

    /* JADX INFO: renamed from: R0 */
    public View.OnClickListener m25057R0() {
        return new View.OnClickListener() { // from class: l.m640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16810a.m25051J0(view);
            }
        };
    }

    /* JADX INFO: renamed from: S0 */
    public View.OnClickListener m25058S0() {
        return new View.OnClickListener() { // from class: l.o640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18026a.m25053N0(view);
            }
        };
    }

    /* JADX INFO: renamed from: V0 */
    public final void m25059V0(Runnable runnable, String str, boolean z) {
        boolean zIsConnected = Network.isConnected(CoreModule.f1533b);
        zvf0.u("e_privacy", ((y640) ((jq2) this).viewModel).m28114x(), new j760[]{vwb.Y("privacy_type", str)});
        if (zIsConnected && NullChecker.a(this.f23373a) && xma.m27355L3()) {
            if (z) {
                zvf0.v("e_privacy", ((y640) ((jq2) this).viewModel).m28114x(), new j760[]{vwb.Y("privacy_type", str)});
            }
            if (NullChecker.a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        if (zIsConnected && NullChecker.a(this.f23373a)) {
            CoreModule.f1546o.m25559d().m5789ip(act(), TextUtils.equals(((y640) ((jq2) this).viewModel).m28110q(), "p_setting_privacy_manage") ? "p_setting_privacy_manage,privacy" : "p_home_filter,privacy", Privilege.privacy_membership);
        } else {
            lsi0.h(R.string.G0);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m25060W0() {
        if (this.f23374b) {
            m25028X0();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m25061Y0(PrivacyMembershipSetting privacyMembershipSetting) {
        this.f23373a = privacyMembershipSetting;
        ((y640) ((jq2) this).viewModel).m28111s(privacyMembershipSetting);
    }

    /* JADX INFO: renamed from: a1 */
    public void m25062a1(boolean z) {
        this.f23374b = z;
    }

    /* JADX INFO: renamed from: b1 */
    public void m25063b1(boolean z) {
        this.f23373a.showMeToMyLike = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: s0 */
    public void m25064s0(boolean z) {
        this.f23373a.frozenActivity = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: t0 */
    public void m25065t0(boolean z) {
        this.f23373a.hideAge = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: u0 */
    public void m25066u0(boolean z) {
        this.f23373a.hideLocation = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: x0 */
    public void m25067x0(boolean z) {
        this.f23373a.hideIcon = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: y0 */
    public void m25068y0() {
        duringCreated(CoreModule.f1534c.f3550E0.m26484V3()).subscribe(mkd0.G(new e30() { // from class: l.j640
            public final void call(Object obj) {
                this.f15004a.m25069z0((PrivacyMembershipSetting) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m25069z0(PrivacyMembershipSetting privacyMembershipSetting) {
        if (NullChecker.a(privacyMembershipSetting)) {
            PrivacyMembershipSetting privacyMembershipSettingClone = privacyMembershipSetting.clone();
            this.f23373a = privacyMembershipSettingClone;
            m25061Y0(privacyMembershipSettingClone);
        }
    }

    public void destroy() {
    }
}
