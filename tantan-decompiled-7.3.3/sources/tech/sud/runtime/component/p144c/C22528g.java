package tech.sud.runtime.component.p144c;

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
public class C22528g {

    /* JADX INFO: renamed from: a */
    private static int f208571a = -1;

    /* JADX INFO: renamed from: b */
    private static int f208572b = -1;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.g$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f208573a;

        static {
            int[] iArr = new int[C22523b.a.values().length];
            f208573a = iArr;
            try {
                iArr[C22523b.a.huawei.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f208573a[C22523b.a.xiaomi.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f208573a[C22523b.a.oppo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f208573a[C22523b.a.vivo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f208573a[C22523b.a.smartisan.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m222947a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return m222949b(context);
        }
        if (i < 26) {
            return false;
        }
        int i2 = AnonymousClass1.f208573a[C22523b.m222864a().ordinal()];
        if (i2 == 1) {
            return m222951c(context);
        }
        if (i2 == 2) {
            return m222946a();
        }
        if (i2 == 3) {
            return m222954f(context);
        }
        if (i2 == 4) {
            return m222955g(context);
        }
        if (i2 != 5) {
            return false;
        }
        return m222956h(context);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m222949b(Context context) {
        DisplayCutout displayCutout;
        WindowInsets rootWindowInsets = ((Activity) context).getWindow().getDecorView().getRootWindowInsets();
        return (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || displayCutout.getBoundingRects() == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m222951c(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m222952d(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "display_notch_status", 0) != 1;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m222953e(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "force_black", 0) != 1;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m222954f(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m222955g(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m222956h(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("smartisanos.api.DisplayUtilsSmt");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 1)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int[] m222957i(Context context) {
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
            int i2 = AnonymousClass1.f208573a[C22523b.m222864a().ordinal()];
            if (i2 == 1) {
                int[] iArrM222958j = m222958j(context);
                iArr[0] = iArrM222958j[0];
                iArr[1] = iArrM222958j[1];
            } else {
                if (i2 == 2) {
                    iArr[0] = m222959k(context);
                    iArr[1] = m222960l(context);
                    return iArr;
                }
                if (i2 == 3 || i2 == 4) {
                    iArr[1] = m222961m(context);
                    return iArr;
                }
                if (i2 == 5) {
                    iArr[0] = m222950c();
                    iArr[1] = m222948b();
                    return iArr;
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: j */
    public static int[] m222958j(Context context) {
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
    public static int m222959k(Context context) {
        int identifier;
        if (f208571a == -1 && (identifier = context.getResources().getIdentifier("notch_width", "dimen", "android")) > 0) {
            f208571a = context.getResources().getDimensionPixelSize(identifier);
        }
        return f208571a;
    }

    /* JADX INFO: renamed from: l */
    public static int m222960l(Context context) {
        int identifier;
        if (f208572b == -1 && (identifier = context.getResources().getIdentifier("notch_height", "dimen", "android")) > 0) {
            f208572b = context.getResources().getDimensionPixelSize(identifier);
        }
        return f208572b;
    }

    /* JADX INFO: renamed from: m */
    public static int m222961m(Context context) {
        int identifier;
        if (f208572b == -1 && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            f208572b = context.getResources().getDimensionPixelSize(identifier);
        }
        return f208572b;
    }

    /* JADX INFO: renamed from: n */
    public static void m222962n(Context context) {
        Window window = ((Activity) context).getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = 2;
        window.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: o */
    public static void m222963o(Context context) {
        Window window = ((Activity) context).getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        window.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: p */
    public static void m222964p(Context context) {
        try {
            Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(((Activity) context).getWindow(), 1792);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m222965q(Context context) {
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
    public static int m222948b() {
        return 82;
    }

    /* JADX INFO: renamed from: c */
    public static int m222950c() {
        return 104;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m222946a() {
        return C22531j.m222982a().m222984a("ro.miui.notch").equals("1");
    }
}
