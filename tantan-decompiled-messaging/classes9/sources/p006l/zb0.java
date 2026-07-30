package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.verification.age.AgeVerificationAct;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.AgeVerificationInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zb0 {
    /* JADX INFO: renamed from: b */
    public static boolean m28635b() {
        return m28639f() && !TEnum.equals(m28636c(), "verified");
    }

    /* JADX INFO: renamed from: c */
    public static StudentVerificationStatus m28636c() {
        AgeVerificationInfo ageVerificationInfo;
        VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
        return (verificationCenterM3542k4 == null || (ageVerificationInfo = verificationCenterM3542k4.ageVerificationInfo) == null) ? StudentVerificationStatus.get("unknown_") : ageVerificationInfo.status;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m28637d() {
        return m28639f() && TEnum.equals(m28636c(), "pending");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m28638e() {
        return m28639f() && TEnum.equals(m28636c(), "verified");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m28639f() {
        return IntlCountryCodeController.m13n();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m28640g(String str) {
        return (!m28639f() || User.isTeamAccount(str) || TextUtils.isEmpty(str) || u59.m25014n0(CoreModule.f1534c.f3628e0.m21393Pa(str)) || TEnum.equals(m28636c(), "verified")) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m28641h(String str) {
        return (!m28639f() || User.isTeamAccount(str) || TextUtils.equals(str, "-11004") || CoreModule.m1850H().userId().equals(str) || TextUtils.isEmpty(str) || u59.m25014n0(CoreModule.f1534c.f3628e0.m21393Pa(str)) || TEnum.equals(m28636c(), "verified")) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static void m28642i(final Act act, String str) {
        CoreDlg.Z1(act, new d30() { // from class: l.yb0
            public final void call() {
                Act act2 = act;
                act2.startActivity(AgeVerificationAct.m9490Y1(act2, "from_age_verification_dlg"));
            }
        }, str);
    }
}
