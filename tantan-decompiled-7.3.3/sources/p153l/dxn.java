package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.location.AbstractC13226a;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class dxn {

    /* JADX INFO: renamed from: a */
    public static int f91096a = -1;

    /* JADX INFO: renamed from: a */
    public static boolean m118506a() {
        if (m118507b()) {
            return false;
        }
        if (wtd.f190739b.get().booleanValue()) {
            return true;
        }
        if (CoreModule.f18265d.m217950N() && NullChecker.m82486a(CoreModule.f18264c) && CoreModule.m30929H().signedIn_()) {
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            if (NullChecker.m82486a(userM116593na) && NullChecker.m82486a(userM116593na.settings) && !jyb.m147479J(userM116593na.settings.settingGroups)) {
                SettingGroups settingGroup = userM116593na.settings.getSettingGroup();
                if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.live)) {
                    return settingGroup.live.intlAdUser.booleanValue();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m118507b() {
        if (f91096a < 0) {
            Location locationM80048q = uqb0.f180370E.m80048q();
            if (locationM80048q == null) {
                f91096a = 0;
            } else {
                int i = AbstractC13226a.m80039f(locationM80048q.m80014u(), 1.277438d, locationM80048q.m80016x(), 103.852306d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) > 1000.0d ? 0 : 1;
                f91096a = i;
                if (i > 0) {
                    sfj0.m185607n("e_singapore_fb_hide_live", null, sfj0.C20032a.m185613f("hide_type", 1));
                }
            }
        }
        return f91096a > 0;
    }
}
