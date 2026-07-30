package p149l;

import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundFrameLayout;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class d0l0 extends p3l {

    /* JADX INFO: renamed from: f */
    public RoundFrameLayout f83193f;

    /* JADX INFO: renamed from: g */
    public VImage f83194g;

    /* JADX INFO: renamed from: h */
    public VText f83195h;

    /* JADX INFO: renamed from: i */
    public VImage f83196i;

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m109514G(d30 d30Var, View view) {
        zvf0.m220396r("e_avatarverification_banner_click", OMSDialogPositon.p_suggest_user_profile_info_view);
        d30Var.call();
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (!user.isMe()) {
            m109522O(this.f83193f, 0, true, new d30() { // from class: l.zzk0
                @Override // p149l.d30
                public final void call() {
                    this.f205806a.m109518K();
                }
            }, this.f83195h, m167252w().string(R$string.f17774Gr));
            return;
        }
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81304b(verificationCenterM31612k4.picVerificationInfo)) {
            m109521N(verificationCenterM31612k4.picVerificationInfo.status);
        } else {
            xdl0.m208345M0(this.f83193f, true);
            m109522O(this.f83193f, 0, true, new d30() { // from class: l.yzk0
                @Override // p149l.d30
                public final void call() {
                    this.f200896a.m109517J();
                }
            }, this.f83195h, m167252w().string(R$string.f17744Fr));
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m109516I(View view) {
        e0l0.m114296a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m109517J() {
        tvf.m190736n();
        m167252w().startActivity(VerificationCenterAct.m55991X1(m167252w(), false));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m109518K() {
        tvf.m190736n();
        m167252w().startActivity(VerificationCenterAct.m55991X1(m167252w(), false));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m109519L() {
        m167252w().startActivity(VerificationCenterAct.m55991X1(m167252w(), false));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m109520M() {
        tvf.m190736n();
        m167252w().startActivity(VerificationCenterAct.m55991X1(m167252w(), false));
    }

    /* JADX INFO: renamed from: N */
    public final void m109521N(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            xdl0.m208344M(this.f83193f, false);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            xdl0.m208345M0(this.f83193f, true);
            m109522O(this.f83193f, 0, true, new d30() { // from class: l.b0l0
                @Override // p149l.d30
                public final void call() {
                    this.f72448a.m109519L();
                }
            }, this.f83195h, m167252w().string(R$string.f17684Dr));
            xdl0.m208344M(this.f83196i, false);
        } else {
            String strString = TEnum.equals(studentVerificationStatus, "rejected") ? m167252w().string(R$string.f17714Er) : m167252w().string(R$string.f17744Fr);
            xdl0.m208345M0(this.f83193f, true);
            m109522O(this.f83193f, 0, true, new d30() { // from class: l.c0l0
                @Override // p149l.d30
                public final void call() {
                    this.f78160a.m109520M();
                }
            }, this.f83195h, strString);
            xdl0.m208344M(this.f83196i, true);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m109522O(View view, int i, boolean z, final d30 d30Var, TextView textView, String str) {
        view.setVisibility(i);
        if (z) {
            view.setEnabled(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.a0l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d0l0.m109514G(d30Var, view2);
                }
            });
        } else {
            view.setEnabled(false);
            view.setOnClickListener(null);
        }
        textView.setText(str);
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m109516I(view);
    }
}
