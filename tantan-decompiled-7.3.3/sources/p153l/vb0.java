package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AgeVerificationInfo;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.verification.age.AgeVerificationAct;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes12.dex */
public class vb0 {
    /* JADX INFO: renamed from: b */
    public static boolean m200640b() {
        return m200644f() && !TEnum.equals(m200641c(), "verified");
    }

    /* JADX INFO: renamed from: c */
    public static StudentVerificationStatus m200641c() {
        AgeVerificationInfo ageVerificationInfo;
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        return (verificationCenterM32615k4 == null || (ageVerificationInfo = verificationCenterM32615k4.ageVerificationInfo) == null) ? StudentVerificationStatus.get("unknown_") : ageVerificationInfo.status;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m200642d() {
        return m200644f() && TEnum.equals(m200641c(), "pending");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m200643e() {
        return m200644f() && TEnum.equals(m200641c(), "verified");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m200644f() {
        return IntlCountryCodeController.m29117n();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m200645g(String str) {
        return (!m200644f() || User.isTeamAccount(str) || TextUtils.isEmpty(str) || d79.m114701r0(CoreModule.f18264c.f20381e0.m116503Pa(str)) || TEnum.equals(m200641c(), "verified")) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m200646h(String str) {
        return (!m200644f() || User.isTeamAccount(str) || TextUtils.equals(str, User.ID_INTL_LIVE_VIP_SERVICE) || CoreModule.m30929H().userId().equals(str) || TextUtils.isEmpty(str) || d79.m114701r0(CoreModule.f18264c.f20381e0.m116503Pa(str)) || TEnum.equals(m200641c(), "verified")) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static void m200647i(final Act act, String str) {
        CoreDlg.m46227Z1(act, new x20() { // from class: l.ub0
            @Override // p153l.x20
            public final void call() {
                Act act2 = act;
                act2.startActivity(AgeVerificationAct.m57248Z1(act2, "from_age_verification_dlg"));
            }
        }, str);
    }
}
