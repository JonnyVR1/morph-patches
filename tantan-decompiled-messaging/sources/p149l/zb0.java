package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AgeVerificationInfo;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.verification.age.AgeVerificationAct;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes9.dex */
public class zb0 {
    /* JADX INFO: renamed from: b */
    public static boolean m217805b() {
        return m217809f() && !TEnum.equals(m217806c(), "verified");
    }

    /* JADX INFO: renamed from: c */
    public static StudentVerificationStatus m217806c() {
        AgeVerificationInfo ageVerificationInfo;
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        return (verificationCenterM31612k4 == null || (ageVerificationInfo = verificationCenterM31612k4.ageVerificationInfo) == null) ? StudentVerificationStatus.get("unknown_") : ageVerificationInfo.status;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m217807d() {
        return m217809f() && TEnum.equals(m217806c(), "pending");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m217808e() {
        return m217809f() && TEnum.equals(m217806c(), "verified");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m217809f() {
        return IntlCountryCodeController.m28118n();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m217810g(String str) {
        return (!m217809f() || User.isTeamAccount(str) || TextUtils.isEmpty(str) || u59.m191843n0(CoreModule.f17545c.f19639e0.m169430Pa(str)) || TEnum.equals(m217806c(), "verified")) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m217811h(String str) {
        return (!m217809f() || User.isTeamAccount(str) || TextUtils.equals(str, User.ID_INTL_LIVE_VIP_SERVICE) || CoreModule.m29931H().userId().equals(str) || TextUtils.isEmpty(str) || u59.m191843n0(CoreModule.f17545c.f19639e0.m169430Pa(str)) || TEnum.equals(m217806c(), "verified")) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static void m217812i(final Act act, String str) {
        CoreDlg.m45044Z1(act, new d30() { // from class: l.yb0
            @Override // p149l.d30
            public final void call() {
                Act act2 = act;
                act2.startActivity(AgeVerificationAct.m56065Y1(act2, "from_age_verification_dlg"));
            }
        }, str);
    }
}
