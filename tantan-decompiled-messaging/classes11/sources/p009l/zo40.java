package p009l;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import com.tantanapp.common.utils.NullChecker;
import l.bne0;
import l.ecq0;
import l.h7q0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zo40 {
    /* JADX INFO: renamed from: a */
    public static int m25888a(Activity activity) {
        if (m25895h(activity)) {
            if (Build.VERSION.SDK_INT >= 28) {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (NullChecker.a(rootWindowInsets)) {
                    DisplayCutout displayCutoutA = h7q0.a(rootWindowInsets);
                    if (NullChecker.a(displayCutoutA)) {
                        return ecq0.a(displayCutoutA);
                    }
                }
            } else {
                if (ane0.m11525v()) {
                    return m25889b(activity);
                }
                if (bne0.j()) {
                    return m25893f(activity);
                }
                if (bne0.l()) {
                    return m25891d(activity);
                }
                if (bne0.m()) {
                    return m25892e(activity);
                }
                if (bne0.g()) {
                    return m25890c(activity);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m25889b(Context context) {
        int[] iArr = {0, 0};
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            iArr = (int[]) clsLoadClass.getMethod("getNotchSize", null).invoke(clsLoadClass, null);
        } catch (Exception unused) {
        }
        return iArr[1];
    }

    /* JADX INFO: renamed from: c */
    public static int m25890c(Context context) {
        int identifier = context.getResources().getIdentifier("fringe_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m25891d(Context context) {
        return 80;
    }

    /* JADX INFO: renamed from: e */
    public static int m25892e(Context context) {
        return t100.d(27.0f);
    }

    /* JADX INFO: renamed from: f */
    public static int m25893f(Context context) {
        int identifier = context.getResources().getIdentifier("notch_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m25894g(Activity activity) {
        try {
            Class<?> clsLoadClass = activity.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m25895h(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            if (NullChecker.a(rootWindowInsets)) {
                return NullChecker.a(h7q0.a(rootWindowInsets));
            }
            return false;
        }
        if (ane0.m11525v()) {
            return m25894g(activity);
        }
        if (bne0.j()) {
            return m25899l(activity);
        }
        if (bne0.l()) {
            return m25897j(activity);
        }
        if (bne0.m()) {
            return m25898k(activity);
        }
        if (bne0.g()) {
            return m25896i(activity);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m25896i(Activity activity) {
        try {
            return ((Boolean) Class.forName("flyme.config.FlymeFeature").getDeclaredField("IS_FRINGE_DEVICE").get(null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m25897j(Activity activity) {
        return activity.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m25898k(Activity activity) {
        try {
            Class<?> cls = Class.forName("android.util.FtFeature");
            return ((Boolean) cls.getMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m25899l(Activity activity) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "ro.miui.notch", 0)).intValue() == 1;
        } catch (Exception unused) {
        }
    }
}
