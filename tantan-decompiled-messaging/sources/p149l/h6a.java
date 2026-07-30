package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes9.dex */
public class h6a implements ABManager.InterfaceC4678d {
    /* JADX INFO: renamed from: c */
    public static boolean m129470c() {
        if (IntlCountryCodeController.m28115k()) {
            return false;
        }
        return RemoteConfig.m79298x().m79330s("ttt_membership_price_diff") || "test1".equals(ABManager.m29352j0("intl_upgrade_privileges")) || !TextUtils.isEmpty(ABManager.m29352j0("intl_subscription_price2"));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m129471d() {
        return "_12Months".equals(ABManager.m29352j0("IntlVASPayCools"));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m129472e() {
        return "_1Month".equals(ABManager.m29352j0("IntlVASPayCools"));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m129473f() {
        return "_3Months".equals(ABManager.m29352j0("IntlVASPayCools"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m129474g() {
        if ("_Control".equals(ABManager.m29352j0("IntlVASPayCools"))) {
            return false;
        }
        return m129472e() || m129473f() || m129471d() || m129475h();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m129475h() {
        return "_All".equals(ABManager.m29352j0("IntlVASPayCools"));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m129476i() {
        return !IntlCountryCodeController.m28115k();
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: a */
    public void mo29393a() {
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: b */
    public void mo29394b() {
    }
}
