package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes9.dex */
public class nkp {
    /* JADX INFO: renamed from: a */
    public static boolean m159982a() {
        return m159983b() || vdj.m198001c();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m159983b() {
        Gender gender;
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        return (userM169520na == null || (gender = userM169520na.gender) == null || !TEnum.equals(gender, "male") || userM169520na.age.intValue() < 18 || IntlCountryCodeController.m28116l()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m159984c() {
        return IntlCountryCodeController.m28116l() && !vdj.m197999a();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m159985d(int i) {
        if (m159984c()) {
            return false;
        }
        return i == -1 || vdj.m197999a() || !n3b0.m157742q() || i > 0;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m159986e() {
        if (u59.m191797F()) {
            return true;
        }
        return (m159983b() && CoreModule.m29932K().getUserSwipeCount() >= 10) || vdj.m198001c();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m159987f() {
        return m159983b() && CoreModule.m29932K().getUserSwipeCount() >= 20;
    }
}
