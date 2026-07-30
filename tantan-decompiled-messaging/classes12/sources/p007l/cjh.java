package p007l;

import android.provider.Settings;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.pvv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cjh {
    /* JADX INFO: renamed from: a */
    public static boolean m9191a(d30 d30Var) {
        if (m9194d()) {
            return true;
        }
        if (!NullChecker.a(d30Var)) {
            return false;
        }
        d30Var.call();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9192b() {
        if (m9194d()) {
            return !pvv.c() || m9193c();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9193c() {
        try {
            return Settings.Secure.getInt(FeedModule.f313a.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9194d() {
        return PermissionHelper.b(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }
}
