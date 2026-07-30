package tech.sud.runtime.component.p021c;

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
import l.h7q0;
import l.hvy0;
import l.jvy0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.g */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1206g {

    /* JADX INFO: renamed from: a */
    private static int f11274a = -1;

    /* JADX INFO: renamed from: b */
    private static int f11275b = -1;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.g$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f11276a;

        static {
            int[] iArr = new int[C1201b.a.values().length];
            f11276a = iArr;
            try {
                iArr[C1201b.a.huawei.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11276a[C1201b.a.xiaomi.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11276a[C1201b.a.oppo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11276a[C1201b.a.vivo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11276a[C1201b.a.smartisan.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10172a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return m10174b(context);
        }
        if (i < 26) {
            return false;
        }
        int i2 = AnonymousClass1.f11276a[C1201b.m10089a().ordinal()];
        if (i2 == 1) {
            return m10176c(context);
        }
        if (i2 == 2) {
            return m10171a();
        }
        if (i2 == 3) {
            return m10179f(context);
        }
        if (i2 == 4) {
            return m10180g(context);
        }
        if (i2 != 5) {
            return false;
        }
        return m10181h(context);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10174b(Context context) {
        DisplayCutout displayCutoutA;
        WindowInsets rootWindowInsets = ((Activity) context).getWindow().getDecorView().getRootWindowInsets();
        return (rootWindowInsets == null || (displayCutoutA = h7q0.a(rootWindowInsets)) == null || hvy0.a(displayCutoutA) == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m10176c(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10177d(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "display_notch_status", 0) != 1;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m10178e(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "force_black", 0) != 1;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m10179f(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m10180g(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m10181h(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("smartisanos.api.DisplayUtilsSmt");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 1)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int[] m10182i(Context context) {
        DisplayCutout displayCutoutA;
        List listA;
        Rect rect;
        int[] iArr = {0, 0};
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            WindowInsets rootWindowInsets = ((Activity) context).getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null && (displayCutoutA = h7q0.a(rootWindowInsets)) != null && (listA = hvy0.a(displayCutoutA)) != null && listA.size() > 0 && (rect = (Rect) listA.get(0)) != null) {
                iArr[0] = rect.width();
                iArr[1] = rect.height();
                return iArr;
            }
        } else if (i >= 26) {
            int i2 = AnonymousClass1.f11276a[C1201b.m10089a().ordinal()];
            if (i2 == 1) {
                int[] iArrM10183j = m10183j(context);
                iArr[0] = iArrM10183j[0];
                iArr[1] = iArrM10183j[1];
            } else {
                if (i2 == 2) {
                    iArr[0] = m10184k(context);
                    iArr[1] = m10185l(context);
                    return iArr;
                }
                if (i2 == 3 || i2 == 4) {
                    iArr[1] = m10186m(context);
                    return iArr;
                }
                if (i2 == 5) {
                    iArr[0] = m10175c();
                    iArr[1] = m10173b();
                    return iArr;
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: j */
    public static int[] m10183j(Context context) {
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
    public static int m10184k(Context context) {
        int identifier;
        if (f11274a == -1 && (identifier = context.getResources().getIdentifier("notch_width", "dimen", "android")) > 0) {
            f11274a = context.getResources().getDimensionPixelSize(identifier);
        }
        return f11274a;
    }

    /* JADX INFO: renamed from: l */
    public static int m10185l(Context context) {
        int identifier;
        if (f11275b == -1 && (identifier = context.getResources().getIdentifier("notch_height", "dimen", "android")) > 0) {
            f11275b = context.getResources().getDimensionPixelSize(identifier);
        }
        return f11275b;
    }

    /* JADX INFO: renamed from: m */
    public static int m10186m(Context context) {
        int identifier;
        if (f11275b == -1 && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            f11275b = context.getResources().getDimensionPixelSize(identifier);
        }
        return f11275b;
    }

    /* JADX INFO: renamed from: n */
    public static void m10187n(Context context) {
        Window window = ((Activity) context).getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        jvy0.a(attributes, 2);
        window.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: o */
    public static void m10188o(Context context) {
        Window window = ((Activity) context).getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        jvy0.a(attributes, 1);
        window.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: p */
    public static void m10189p(Context context) {
        try {
            Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(((Activity) context).getWindow(), 1792);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m10190q(Context context) {
        Window window = ((Activity) context).getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
            cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes), Integer.valueOf(PKIFailureInfo.notAuthorized));
            ((Activity) context).getWindowManager().updateViewLayout(window.getDecorView(), window.getDecorView().getLayoutParams());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m10173b() {
        return 82;
    }

    /* JADX INFO: renamed from: c */
    public static int m10175c() {
        return 104;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10171a() {
        return C1209j.m10207a().m10209a("ro.miui.notch").equals("1");
    }
}
