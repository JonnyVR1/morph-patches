package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;

/* JADX INFO: loaded from: classes11.dex */
public class k3g {

    /* JADX INFO: renamed from: a */
    public static String f123711a = "FakePardonHelper";

    /* JADX INFO: renamed from: a */
    public static boolean m148016a() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            return false;
        }
        if (jyb.m147479J(userM116600p9.status)) {
            fhw.m125605a(f123711a, "user fake status is empty");
            return true;
        }
        fhw.m125605a(f123711a, "fake status:" + userM116600p9.status.toString());
        if (userM116600p9.status.contains(UserStatus.get(UserStatus.violation))) {
            return false;
        }
        long jMo68467sd = CoreModule.m30934Q().mo68467sd();
        if (userM116600p9.hierarchy == null && jMo68467sd == 0) {
            fhw.m125605a(f123711a, "user hierarchy  is null");
            return false;
        }
        fhw.m125605a(f123711a, "fake user hierarchy:" + userM116600p9.hierarchy.grade + Constants.SEPARATOR_COMMA + jMo68467sd);
        return userM116600p9.hierarchy.grade >= ((long) CoreModule.m30934Q().mo68443c8()) || jMo68467sd >= ((long) CoreModule.m30934Q().mo68443c8());
    }
}
