package tech.sud.runtime.component.p140c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.view.DisplayCutout;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.List;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.g */
/* JADX INFO: loaded from: classes3.dex */
public class C22413g {

    /* JADX INFO: renamed from: a */
    private static int f207649a = -1;

    /* JADX INFO: renamed from: b */
    private static int f207650b = -1;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.g$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f207651a;

        static {
            int[] iArr = new int[C22408b.a.values().length];
            f207651a = iArr;
            try {
                iArr[C22408b.a.huawei.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f207651a[C22408b.a.xiaomi.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f207651a[C22408b.a.oppo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f207651a[C22408b.a.vivo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f207651a[C22408b.a.smartisan.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m221701a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return m221703b(context);
        }
        if (i < 26) {
            return false;
        }
        int i2 = AnonymousClass1.f207651a[C22408b.m221618a().ordinal()];
        if (i2 == 1) {
            return m221705c(context);
        }
        if (i2 == 2) {
            return m221700a();
        }
        if (i2 == 3) {
            return m221708f(context);
        }
        if (i2 == 4) {
            return m221709g(context);
        }
        if (i2 != 5) {
            return false;
        }
        return m221710h(context);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m221703b(Context context) {
        DisplayCutout displayCutout;
        WindowInsets rootWindowInsets = ((Activity) context).getWindow().getDecorView().getRootWindowInsets();
        return (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || displayCutout.getBoundingRects() == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m221705c(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m221706d(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "display_notch_status", 0) != 1;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m221707e(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "force_black", 0) != 1;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m221708f(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m221709g(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m221710h(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("smartisanos.api.DisplayUtilsSmt");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 1)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int[] m221711i(Context context) {
        DisplayCutout displayCutout;
        List boundingRects;
        Rect rect;
        int[] iArr = {0, 0};
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            WindowInsets rootWindowInsets = ((Activity) context).getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && boundingRects.size() > 0 && (rect = (Rect) boundingRects.get(0)) != null) {
                iArr[0] = rect.width();
                iArr[1] = rect.height();
                return iArr;
            }
        } else if (i >= 26) {
            int i2 = AnonymousClass1.f207651a[C22408b.m221618a().ordinal()];
            if (i2 == 1) {
                int[] iArrM221712j = m221712j(context);
                iArr[0] = iArrM221712j[0];
                iArr[1] = iArrM221712j[1];
            } else {
                if (i2 == 2) {
                    iArr[0] = m221713k(context);
                    iArr[1] = m221714l(context);
                    return iArr;
                }
                if (i2 == 3 || i2 == 4) {
                    iArr[1] = m221715m(context);
                    return iArr;
                }
                if (i2 == 5) {
                    iArr[0] = m221704c();
                    iArr[1] = m221702b();
                    return iArr;
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: j */
    public static int[] m221712j(Context context) {
        int[] iArr = {0, 0};
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return (int[]) clsLoadClass.getMethod("getNotchSize", null).invoke(clsLoadClass, null);
        } catch (Exception e) {
            e.printStackTrace();
            return iArr;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m221713k(Context context) {
        int identifier;
        if (f207649a == -1 && (identifier = context.getResources().getIdentifier("notch_width", "dimen", "android")) > 0) {
            f207649a = context.getResources().getDimensionPixelSize(identifier);
        }
        return f207649a;
    }

    /* JADX INFO: renamed from: l */
    public static int m221714l(Context context) {
        int identifier;
        if (f207650b == -1 && (identifier = context.getResources().getIdentifier("notch_height", "dimen", "android")) > 0) {
            f207650b = context.getResources().getDimensionPixelSize(identifier);
        }
        return f207650b;
    }

    /* JADX INFO: renamed from: m */
    public static int m221715m(Context context) {
        int identifier;
        if (f207650b == -1 && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            f207650b = context.getResources().getDimensionPixelSize(identifier);
        }
        return f207650b;
    }

    /* JADX INFO: renamed from: n */
    public static void m221716n(Context context) {
        Window window = ((Activity) context).getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = 2;
        window.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: o */
    public static void m221717o(Context context) {
        Window window = ((Activity) context).getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        window.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: p */
    public static void m221718p(Context context) {
        try {
            Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(((Activity) context).getWindow(), 1792);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m221719q(Context context) {
        Window window = ((Activity) context).getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
            cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 65536);
            ((Activity) context).getWindowManager().updateViewLayout(window.getDecorView(), window.getDecorView().getLayoutParams());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m221702b() {
        return 82;
    }

    /* JADX INFO: renamed from: c */
    public static int m221704c() {
        return 104;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m221700a() {
        return C22416j.m221736a().m221738a("ro.miui.notch").equals("1");
    }
}
