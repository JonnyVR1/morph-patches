package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class zo40 {
    /* JADX INFO: renamed from: a */
    public static int m219544a(Activity activity) {
        if (m219551h(activity)) {
            if (Build.VERSION.SDK_INT >= 28) {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (NullChecker.m81303a(rootWindowInsets)) {
                    DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                    if (NullChecker.m81303a(displayCutout)) {
                        return displayCutout.getSafeInsetTop();
                    }
                }
            } else {
                if (ane0.m97750v()) {
                    return m219545b(activity);
                }
                if (bne0.m102781j()) {
                    return m219549f(activity);
                }
                if (bne0.m102783l()) {
                    return m219547d(activity);
                }
                if (bne0.m102784m()) {
                    return m219548e(activity);
                }
                if (bne0.m102778g()) {
                    return m219546c(activity);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m219545b(Context context) {
        int[] iArr = {0, 0};
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            iArr = (int[]) clsLoadClass.getMethod("getNotchSize", null).invoke(clsLoadClass, null);
        } catch (Exception unused) {
        }
        return iArr[1];
    }

    /* JADX INFO: renamed from: c */
    public static int m219546c(Context context) {
        int identifier = context.getResources().getIdentifier("fringe_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m219547d(Context context) {
        return 80;
    }

    /* JADX INFO: renamed from: e */
    public static int m219548e(Context context) {
        return t100.m186890d(27.0f);
    }

    /* JADX INFO: renamed from: f */
    public static int m219549f(Context context) {
        int identifier = context.getResources().getIdentifier("notch_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m219550g(Activity activity) {
        try {
            Class<?> clsLoadClass = activity.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m219551h(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            if (NullChecker.m81303a(rootWindowInsets)) {
                return NullChecker.m81303a(rootWindowInsets.getDisplayCutout());
            }
            return false;
        }
        if (ane0.m97750v()) {
            return m219550g(activity);
        }
        if (bne0.m102781j()) {
            return m219555l(activity);
        }
        if (bne0.m102783l()) {
            return m219553j(activity);
        }
        if (bne0.m102784m()) {
            return m219554k(activity);
        }
        if (bne0.m102778g()) {
            return m219552i(activity);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m219552i(Activity activity) {
        try {
            return ((Boolean) Class.forName("flyme.config.FlymeFeature").getDeclaredField("IS_FRINGE_DEVICE").get(null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m219553j(Activity activity) {
        return activity.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m219554k(Activity activity) {
        try {
            Class<?> cls = Class.forName("android.util.FtFeature");
            return ((Boolean) cls.getMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m219555l(Activity activity) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "ro.miui.notch", 0)).intValue() == 1;
        } catch (Exception unused) {
        }
    }
}
