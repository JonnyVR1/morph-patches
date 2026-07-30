package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class h6a implements ABManager.InterfaceC0104d {
    /* JADX INFO: renamed from: c */
    public static boolean m16049c() {
        if (IntlCountryCodeController.m10k()) {
            return false;
        }
        return RemoteConfig.x().s("ttt_membership_price_diff") || "test1".equals(ABManager.m1258j0("intl_upgrade_privileges")) || !TextUtils.isEmpty(ABManager.m1258j0("intl_subscription_price2"));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16050d() {
        return "_12Months".equals(ABManager.m1258j0("IntlVASPayCools"));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m16051e() {
        return "_1Month".equals(ABManager.m1258j0("IntlVASPayCools"));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m16052f() {
        return "_3Months".equals(ABManager.m1258j0("IntlVASPayCools"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m16053g() {
        if ("_Control".equals(ABManager.m1258j0("IntlVASPayCools"))) {
            return false;
        }
        return m16051e() || m16052f() || m16050d() || m16054h();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m16054h() {
        return "_All".equals(ABManager.m1258j0("IntlVASPayCools"));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m16055i() {
        return !IntlCountryCodeController.m10k();
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: a */
    public void mo1299a() {
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: b */
    public void mo1300b() {
    }
}
