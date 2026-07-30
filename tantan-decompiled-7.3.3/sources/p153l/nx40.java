package p153l;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class nx40 {
    /* JADX INFO: renamed from: a */
    public static int m165085a(Activity activity) {
        if (m165092h(activity)) {
            if (Build.VERSION.SDK_INT >= 28) {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (NullChecker.m82486a(rootWindowInsets)) {
                    DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                    if (NullChecker.m82486a(displayCutout)) {
                        return displayCutout.getSafeInsetTop();
                    }
                }
            } else {
                if (hve0.m137320v()) {
                    return m165086b(activity);
                }
                if (ive0.m142296j()) {
                    return m165090f(activity);
                }
                if (ive0.m142298l()) {
                    return m165088d(activity);
                }
                if (ive0.m142299m()) {
                    return m165089e(activity);
                }
                if (ive0.m142293g()) {
                    return m165087c(activity);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m165086b(Context context) {
        int[] iArr = {0, 0};
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            iArr = (int[]) clsLoadClass.getMethod("getNotchSize", null).invoke(clsLoadClass, null);
        } catch (Exception unused) {
        }
        return iArr[1];
    }

    /* JADX INFO: renamed from: c */
    public static int m165087c(Context context) {
        int identifier = context.getResources().getIdentifier("fringe_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m165088d(Context context) {
        return 80;
    }

    /* JADX INFO: renamed from: e */
    public static int m165089e(Context context) {
        return qa00.m175859d(27.0f);
    }

    /* JADX INFO: renamed from: f */
    public static int m165090f(Context context) {
        int identifier = context.getResources().getIdentifier("notch_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m165091g(Activity activity) {
        try {
            Class<?> clsLoadClass = activity.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m165092h(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            if (NullChecker.m82486a(rootWindowInsets)) {
                return NullChecker.m82486a(rootWindowInsets.getDisplayCutout());
            }
            return false;
        }
        if (hve0.m137320v()) {
            return m165091g(activity);
        }
        if (ive0.m142296j()) {
            return m165096l(activity);
        }
        if (ive0.m142298l()) {
            return m165094j(activity);
        }
        if (ive0.m142299m()) {
            return m165095k(activity);
        }
        if (ive0.m142293g()) {
            return m165093i(activity);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m165093i(Activity activity) {
        try {
            return ((Boolean) Class.forName("flyme.config.FlymeFeature").getDeclaredField("IS_FRINGE_DEVICE").get(null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m165094j(Activity activity) {
        return activity.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m165095k(Activity activity) {
        try {
            Class<?> cls = Class.forName("android.util.FtFeature");
            return ((Boolean) cls.getMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m165096l(Activity activity) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "ro.miui.notch", 0)).intValue() == 1;
        } catch (Exception unused) {
        }
    }
}
