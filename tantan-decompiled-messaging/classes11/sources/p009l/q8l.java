package p009l;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class q8l {
    /* JADX INFO: renamed from: a */
    public static String m20836a() {
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("HUAWEI") && !"HONOR".equals(str)) {
            if (str.equalsIgnoreCase("XIAOMI")) {
                return "force_fsg_nav_bar";
            }
            if (str.equalsIgnoreCase("VIVO")) {
                return "navigation_gesture_on";
            }
            if (str.equalsIgnoreCase("OPPO")) {
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
    public static boolean m20837b(Context context) {
        return !m20839d(context);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m20838c(Context context) {
        return m20837b(context);
    }

    @TargetApi(MediaPickerParamsObject.FROM_PROFILE_PET)
    /* JADX INFO: renamed from: d */
    public static boolean m20839d(Context context) {
        int i = Settings.Global.getInt(context.getContentResolver(), m20836a(), 0);
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str) && (str.equalsIgnoreCase("OPPO") || str.equalsIgnoreCase("VIVO"))) {
            i = Settings.Secure.getInt(context.getContentResolver(), m20836a(), 0);
        }
        return i != 0;
    }
}
