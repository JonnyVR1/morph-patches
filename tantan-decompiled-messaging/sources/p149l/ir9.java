package p149l;

import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes9.dex */
public class ir9 implements ABManager.InterfaceC4678d {

    /* JADX INFO: renamed from: a */
    public static String f114593a = "intl_tribe_force_jump";

    /* JADX INFO: renamed from: c */
    public static boolean m137823c() {
        return !IntlCountryCodeController.m28115k();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m137824d() {
        if (m137823c()) {
            return "test1".equals(ABManager.m29352j0("intl_see_visitor_paying_close"));
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m137825e() {
        return RemoteConfig.m79298x().m79330s(f114593a);
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
