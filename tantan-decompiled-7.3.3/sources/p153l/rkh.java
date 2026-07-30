package p153l;

import android.provider.Settings;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class rkh {
    /* JADX INFO: renamed from: a */
    public static boolean m181857a(x20 x20Var) {
        if (m181860d()) {
            return true;
        }
        if (!NullChecker.m82486a(x20Var)) {
            return false;
        }
        x20Var.call();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m181858b() {
        if (m181860d()) {
            return !qxv.m178618c() || m181859c();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m181859c() {
        try {
            return Settings.Secure.getInt(FeedModule.f39700a.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m181860d() {
        return PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }
}
