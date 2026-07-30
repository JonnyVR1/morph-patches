package p009l;

import android.view.View;
import android.widget.TextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundFrameLayout;
import com.p1.mobile.putong.core.ui.verification.VerificationCenterAct;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e0l0;
import l.tvf;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class d0l0 extends p3l {

    /* JADX INFO: renamed from: f */
    public RoundFrameLayout f10837f;

    /* JADX INFO: renamed from: g */
    public VImage f10838g;

    /* JADX INFO: renamed from: h */
    public VText f10839h;

    /* JADX INFO: renamed from: i */
    public VImage f10840i;

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m12882G(d30 d30Var, View view) {
        zvf0.r("e_avatarverification_banner_click", "p_suggest_user_profile_info_view");
        d30Var.call();
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (!user.isMe()) {
            m12890O(this.f10837f, 0, true, new d30() { // from class: l.zzk0
                public final void call() {
                    this.f24056a.m12886K();
                }
            }, this.f10839h, m20098w().string(R.string.Gr));
            return;
        }
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && NullChecker.b(verificationCenterK4.picVerificationInfo)) {
            m12889N(verificationCenterK4.picVerificationInfo.status);
        } else {
            xdl0.M0(this.f10837f, true);
            m12890O(this.f10837f, 0, true, new d30() { // from class: l.yzk0
                public final void call() {
                    this.f23307a.m12885J();
                }
            }, this.f10839h, m20098w().string(R.string.Fr));
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m12884I(View view) {
        e0l0.a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m12885J() {
        tvf.n();
        m20098w().startActivity(VerificationCenterAct.X1(m20098w(), false));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m12886K() {
        tvf.n();
        m20098w().startActivity(VerificationCenterAct.X1(m20098w(), false));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m12887L() {
        m20098w().startActivity(VerificationCenterAct.X1(m20098w(), false));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m12888M() {
        tvf.n();
        m20098w().startActivity(VerificationCenterAct.X1(m20098w(), false));
    }

    /* JADX INFO: renamed from: N */
    public final void m12889N(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            xdl0.M(this.f10837f, false);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            xdl0.M0(this.f10837f, true);
            m12890O(this.f10837f, 0, true, new d30() { // from class: l.b0l0
                public final void call() {
                    this.f9783a.m12887L();
                }
            }, this.f10839h, m20098w().string(R.string.Dr));
            xdl0.M(this.f10840i, false);
        } else {
            String strString = TEnum.equals(studentVerificationStatus, "rejected") ? m20098w().string(R.string.Er) : m20098w().string(R.string.Fr);
            xdl0.M0(this.f10837f, true);
            m12890O(this.f10837f, 0, true, new d30() { // from class: l.c0l0
                public final void call() {
                    this.f10371a.m12888M();
                }
            }, this.f10839h, strString);
            xdl0.M(this.f10840i, true);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m12890O(View view, int i, boolean z, final d30 d30Var, TextView textView, String str) {
        view.setVisibility(i);
        if (z) {
            view.setEnabled(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.a0l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d0l0.m12882G(d30Var, view2);
                }
            });
        } else {
            view.setEnabled(false);
            view.setOnClickListener(null);
        }
        textView.setText(str);
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m12884I(view);
    }
}
