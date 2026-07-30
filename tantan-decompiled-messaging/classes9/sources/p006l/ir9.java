package p006l;

import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ir9 implements ABManager.InterfaceC0104d {

    /* JADX INFO: renamed from: a */
    public static String f14715a = "intl_tribe_force_jump";

    /* JADX INFO: renamed from: c */
    public static boolean m16906c() {
        return !IntlCountryCodeController.m10k();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16907d() {
        if (m16906c()) {
            return "test1".equals(ABManager.m1258j0("intl_see_visitor_paying_close"));
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m16908e() {
        return RemoteConfig.x().s(f14715a);
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
