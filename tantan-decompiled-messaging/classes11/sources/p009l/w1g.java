package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import l.hfw;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w1g {

    /* JADX INFO: renamed from: a */
    public static String f21841a = "FakePardonHelper";

    /* JADX INFO: renamed from: a */
    public static boolean m23770a() {
        User userP9 = CoreModule.c.e0.p9();
        if (userP9 == null) {
            return false;
        }
        if (vwb.J(userP9.status)) {
            hfw.a(f21841a, "user fake status is empty");
            return true;
        }
        hfw.a(f21841a, "fake status:" + userP9.status.toString());
        if (userP9.status.contains(UserStatus.get("violation"))) {
            return false;
        }
        long jM9069sd = CoreModule.Q().m9069sd();
        if (userP9.hierarchy == null && jM9069sd == 0) {
            hfw.a(f21841a, "user hierarchy  is null");
            return false;
        }
        hfw.a(f21841a, "fake user hierarchy:" + userP9.hierarchy.grade + "," + jM9069sd);
        return userP9.hierarchy.grade >= ((long) CoreModule.Q().m9045c8()) || jM9069sd >= ((long) CoreModule.Q().m9045c8());
    }
}
