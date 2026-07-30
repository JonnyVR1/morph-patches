package p153l;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.cosmos.photon.push.thirdparty.RomUtil;

/* JADX INFO: loaded from: classes11.dex */
public class gbl {
    /* JADX INFO: renamed from: a */
    public static String m129798a() {
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("HUAWEI") && !"HONOR".equals(str)) {
            if (str.equalsIgnoreCase("XIAOMI")) {
                return "force_fsg_nav_bar";
            }
            if (str.equalsIgnoreCase(RomUtil.ROM_VIVO)) {
                return "navigation_gesture_on";
            }
            if (str.equalsIgnoreCase(RomUtil.ROM_OPPO)) {
                return "hide_navigationbar_enable";
            }
            if (str.equalsIgnoreCase("samsung")) {
                return "navigationbar_hide_bar_enabled";
            }
            if (str.equalsIgnoreCase("Nokia")) {
                return Build.VERSION.SDK_INT < 28 ? "navigation_bar_can_hiden" : "swipe_up_to_switch_apps_enabled";
            }
        }
        return "navigationbar_is_min";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m129799b(Context context) {
        return !m129801d(context);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m129800c(Context context) {
        return m129799b(context);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: d */
    public static boolean m129801d(Context context) {
        int i = Settings.Global.getInt(context.getContentResolver(), m129798a(), 0);
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str) && (str.equalsIgnoreCase(RomUtil.ROM_OPPO) || str.equalsIgnoreCase(RomUtil.ROM_VIVO))) {
            i = Settings.Secure.getInt(context.getContentResolver(), m129798a(), 0);
        }
        return i != 0;
    }
}
