package p153l;

import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundFrameLayout;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class i9l0 extends f6l {

    /* JADX INFO: renamed from: f */
    public RoundFrameLayout f113485f;

    /* JADX INFO: renamed from: g */
    public VImage f113486g;

    /* JADX INFO: renamed from: h */
    public VText f113487h;

    /* JADX INFO: renamed from: i */
    public VImage f113488i;

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m139117G(x20 x20Var, View view) {
        i4g0.m138520r("e_avatarverification_banner_click", OMSDialogPositon.p_suggest_user_profile_info_view);
        x20Var.call();
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (!user.isMe()) {
            m139125O(this.f113485f, 0, true, new x20() { // from class: l.e9l0
                @Override // p153l.x20
                public final void call() {
                    this.f92652a.m139121K();
                }
            }, this.f113487h, m124283w().string(R$string.f19167cs));
            return;
        }
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82487b(verificationCenterM32615k4.picVerificationInfo)) {
            m139124N(verificationCenterM32615k4.picVerificationInfo.status);
        } else {
            bnl0.m105525M0(this.f113485f, true);
            m139125O(this.f113485f, 0, true, new x20() { // from class: l.d9l0
                @Override // p153l.x20
                public final void call() {
                    this.f85793a.m139120J();
                }
            }, this.f113487h, m124283w().string(R$string.f19136bs));
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m139119I(View view) {
        j9l0.m143946a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m139120J() {
        hxf.m137593n();
        m124283w().startActivity(VerificationCenterAct.m57174Y1(m124283w(), false));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m139121K() {
        hxf.m137593n();
        m124283w().startActivity(VerificationCenterAct.m57174Y1(m124283w(), false));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m139122L() {
        m124283w().startActivity(VerificationCenterAct.m57174Y1(m124283w(), false));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m139123M() {
        hxf.m137593n();
        m124283w().startActivity(VerificationCenterAct.m57174Y1(m124283w(), false));
    }

    /* JADX INFO: renamed from: N */
    public final void m139124N(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            bnl0.m105524M(this.f113485f, false);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            bnl0.m105525M0(this.f113485f, true);
            m139125O(this.f113485f, 0, true, new x20() { // from class: l.g9l0
                @Override // p153l.x20
                public final void call() {
                    this.f102864a.m139122L();
                }
            }, this.f113487h, m124283w().string(R$string.f19074Zr));
            bnl0.m105524M(this.f113488i, false);
        } else {
            String strString = TEnum.equals(studentVerificationStatus, "rejected") ? m124283w().string(R$string.f19105as) : m124283w().string(R$string.f19136bs);
            bnl0.m105525M0(this.f113485f, true);
            m139125O(this.f113485f, 0, true, new x20() { // from class: l.h9l0
                @Override // p153l.x20
                public final void call() {
                    this.f108416a.m139123M();
                }
            }, this.f113487h, strString);
            bnl0.m105524M(this.f113488i, true);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m139125O(View view, int i, boolean z, final x20 x20Var, TextView textView, String str) {
        view.setVisibility(i);
        if (z) {
            view.setEnabled(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.f9l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i9l0.m139117G(x20Var, view2);
                }
            });
        } else {
            view.setEnabled(false);
            view.setOnClickListener(null);
        }
        textView.setText(str);
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m139119I(view);
    }
}
