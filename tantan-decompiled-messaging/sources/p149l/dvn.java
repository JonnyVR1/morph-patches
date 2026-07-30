package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.location.AbstractC13063a;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class dvn {

    /* JADX INFO: renamed from: a */
    public static int f88085a = -1;

    /* JADX INFO: renamed from: a */
    public static boolean m113808a() {
        if (m113809b()) {
            return false;
        }
        if (isd.f114751b.get().booleanValue()) {
            return true;
        }
        if (CoreModule.f17546d.m200504N() && NullChecker.m81303a(CoreModule.f17545c) && CoreModule.m29931H().signedIn_()) {
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            if (NullChecker.m81303a(userM169520na) && NullChecker.m81303a(userM169520na.settings) && !vwb.m200296J(userM169520na.settings.settingGroups)) {
                SettingGroups settingGroup = userM169520na.settings.getSettingGroup();
                if (NullChecker.m81303a(settingGroup) && NullChecker.m81303a(settingGroup.live)) {
                    return settingGroup.live.intlAdUser.booleanValue();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m113809b() {
        if (f88085a < 0) {
            Location locationM78865q = qib0.f154687E.m78865q();
            if (locationM78865q == null) {
                f88085a = 0;
            } else {
                int i = AbstractC13063a.m78856f(locationM78865q.m78831u(), 1.277438d, locationM78865q.m78833x(), 103.852306d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) > 1000.0d ? 0 : 1;
                f88085a = i;
                if (i > 0) {
                    o6j0.m162870n("e_singapore_fb_hide_live", null, o6j0.C18854a.m162876f("hide_type", 1));
                }
            }
        }
        return f88085a > 0;
    }
}
