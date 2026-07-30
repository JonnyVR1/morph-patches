package p149l;

import android.provider.Settings;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class cjh {
    /* JADX INFO: renamed from: a */
    public static boolean m107155a(d30 d30Var) {
        if (m107158d()) {
            return true;
        }
        if (!NullChecker.m81303a(d30Var)) {
            return false;
        }
        d30Var.call();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m107156b() {
        if (m107158d()) {
            return !pvv.m171693c() || m107157c();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m107157c() {
        try {
            return Settings.Secure.getInt(FeedModule.f38852a.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m107158d() {
        return PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }
}
