package p153l;

import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes9.dex */
public class ts9 implements ABManager.InterfaceC4829d {

    /* JADX INFO: renamed from: a */
    public static String f175969a = "intl_tribe_force_jump";

    /* JADX INFO: renamed from: c */
    public static boolean m192571c() {
        return !IntlCountryCodeController.m29114k();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m192572d() {
        if (m192571c()) {
            return "test1".equals(ABManager.m30350j0("intl_see_visitor_paying_close"));
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m192573e() {
        return RemoteConfig.m80481x().m80513s(f175969a);
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
