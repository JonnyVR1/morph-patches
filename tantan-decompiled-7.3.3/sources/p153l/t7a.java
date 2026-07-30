package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes9.dex */
public class t7a implements ABManager.InterfaceC4829d {
    /* JADX INFO: renamed from: c */
    public static boolean m189547c() {
        if (IntlCountryCodeController.m29114k()) {
            return false;
        }
        return RemoteConfig.m80481x().m80513s("ttt_membership_price_diff") || "test1".equals(ABManager.m30350j0("intl_upgrade_privileges")) || !TextUtils.isEmpty(ABManager.m30350j0("intl_subscription_price2"));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m189548d() {
        return "_12Months".equals(ABManager.m30350j0("IntlVASPayCools"));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m189549e() {
        return "_1Month".equals(ABManager.m30350j0("IntlVASPayCools"));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m189550f() {
        return "_3Months".equals(ABManager.m30350j0("IntlVASPayCools"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m189551g() {
        if ("_Control".equals(ABManager.m30350j0("IntlVASPayCools"))) {
            return false;
        }
        return m189549e() || m189550f() || m189548d() || m189552h();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m189552h() {
        return "_All".equals(ABManager.m30350j0("IntlVASPayCools"));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m189553i() {
        return !IntlCountryCodeController.m29114k();
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: a */
    public void mo30391a() {
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: b */
    public void mo30392b() {
    }
}
