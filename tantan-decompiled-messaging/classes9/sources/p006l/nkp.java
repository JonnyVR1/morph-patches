package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.n3b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nkp {
    /* JADX INFO: renamed from: a */
    public static boolean m20155a() {
        return m20156b() || vdj.m25806c();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20156b() {
        Gender gender;
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        return (userM21483na == null || (gender = userM21483na.gender) == null || !TEnum.equals(gender, "male") || userM21483na.age.intValue() < 18 || IntlCountryCodeController.m11l()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m20157c() {
        return IntlCountryCodeController.m11l() && !vdj.m25804a();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m20158d(int i) {
        if (m20157c()) {
            return false;
        }
        return i == -1 || vdj.m25804a() || !n3b0.q() || i > 0;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m20159e() {
        if (u59.m24968F()) {
            return true;
        }
        return (m20156b() && CoreModule.m1851K().getUserSwipeCount() >= 10) || vdj.m25806c();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m20160f() {
        return m20156b() && CoreModule.m1851K().getUserSwipeCount() >= 20;
    }
}
