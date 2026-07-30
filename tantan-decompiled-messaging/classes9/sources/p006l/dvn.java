package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.location.Location;
import com.p1.mobile.putong.location.a;
import com.tantanapp.common.utils.NullChecker;
import l.o6j0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dvn {

    /* JADX INFO: renamed from: a */
    public static int f10616a = -1;

    /* JADX INFO: renamed from: a */
    public static boolean m14308a() {
        if (m14309b()) {
            return false;
        }
        if (((Boolean) isd.f14740b.get()).booleanValue()) {
            return true;
        }
        if (CoreModule.f1535d.m25983N() && NullChecker.a(CoreModule.f1534c) && CoreModule.m1850H().signedIn_()) {
            User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
            if (NullChecker.a(userM21483na) && NullChecker.a(userM21483na.settings) && !vwb.J(userM21483na.settings.settingGroups)) {
                SettingGroups settingGroup = userM21483na.settings.getSettingGroup();
                if (NullChecker.a(settingGroup) && NullChecker.a(settingGroup.live)) {
                    return settingGroup.live.intlAdUser.booleanValue();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14309b() {
        if (f10616a < 0) {
            Location locationQ = qib0.f19778E.q();
            if (locationQ == null) {
                f10616a = 0;
            } else {
                int i = a.f(locationQ.u(), 1.277438d, locationQ.x(), 103.852306d, 0.0d, 0.0d) > 1000.0d ? 0 : 1;
                f10616a = i;
                if (i > 0) {
                    o6j0.n("e_singapore_fb_hide_live", (String) null, new o6j0.a[]{o6j0.a.f("hide_type", 1)});
                }
            }
        }
        return f10616a > 0;
    }
}
