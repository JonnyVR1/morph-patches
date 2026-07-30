package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;

/* JADX INFO: loaded from: classes11.dex */
public class w1g {

    /* JADX INFO: renamed from: a */
    public static String f184001a = "FakePardonHelper";

    /* JADX INFO: renamed from: a */
    public static boolean m200928a() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null) {
            return false;
        }
        if (vwb.m200296J(userM169527p9.status)) {
            hfw.m130790a(f184001a, "user fake status is empty");
            return true;
        }
        hfw.m130790a(f184001a, "fake status:" + userM169527p9.status.toString());
        if (userM169527p9.status.contains(UserStatus.get(UserStatus.violation))) {
            return false;
        }
        long jMo67284sd = CoreModule.m29936Q().mo67284sd();
        if (userM169527p9.hierarchy == null && jMo67284sd == 0) {
            hfw.m130790a(f184001a, "user hierarchy  is null");
            return false;
        }
        hfw.m130790a(f184001a, "fake user hierarchy:" + userM169527p9.hierarchy.grade + Constants.SEPARATOR_COMMA + jMo67284sd);
        return userM169527p9.hierarchy.grade >= ((long) CoreModule.m29936Q().mo67260c8()) || jMo67284sd >= ((long) CoreModule.m29936Q().mo67260c8());
    }
}
