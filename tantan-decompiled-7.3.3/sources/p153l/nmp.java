package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes9.dex */
public class nmp {
    /* JADX INFO: renamed from: a */
    public static boolean m163832a() {
        return m163833b() || pgj.m172246c();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m163833b() {
        Gender gender;
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        return (userM116593na == null || (gender = userM116593na.gender) == null || !TEnum.equals(gender, "male") || userM116593na.age.intValue() < 18 || IntlCountryCodeController.m29115l()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m163834c() {
        return IntlCountryCodeController.m29115l() && !pgj.m172244a();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m163835d(int i) {
        if (m163834c()) {
            return false;
        }
        return i == -1 || pgj.m172244a() || !rbb0.m180744q() || i > 0;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m163836e() {
        if (d79.m114648G()) {
            return true;
        }
        return (m163833b() && CoreModule.m30930K().getUserSwipeCount() >= 10) || pgj.m172246c();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m163837f() {
        return m163833b() && CoreModule.m30930K().getUserSwipeCount() >= 20;
    }
}
