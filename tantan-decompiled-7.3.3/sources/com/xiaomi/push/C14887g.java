package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.Map;
import p153l.l4r0;
import p153l.otq0;
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14887g {

    /* JADX INFO: renamed from: com.xiaomi.push.g$b */
    public enum b {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);


        /* JADX INFO: renamed from: a */
        private final int f62640a;

        b(int i) {
            this.f62640a = i;
        }

        /* JADX INFO: renamed from: a */
        public int m86769a() {
            return this.f62640a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m86752a(Context context) {
        Bundle bundle;
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.android.systemui", 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("SupportForPushVersionCode");
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m86753b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    private static ApplicationInfo m86754c(Context context, String str) {
        if (str.equals(context.getPackageName())) {
            return context.getApplicationInfo();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            ouq0.m169393m("not found app info ".concat(str));
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m86755d(Context context, String str) {
        ApplicationInfo applicationInfoM86754c = m86754c(context, str);
        Drawable drawableLoadIcon = null;
        if (applicationInfoM86754c != null) {
            try {
                drawableLoadIcon = applicationInfoM86754c.loadIcon(context.getPackageManager());
                if (drawableLoadIcon == null) {
                    drawableLoadIcon = applicationInfoM86754c.loadLogo(context.getPackageManager());
                }
            } catch (Exception e) {
                ouq0.m169393m("get app icon drawable failed, " + e);
            }
        }
        return drawableLoadIcon != null ? drawableLoadIcon : new ColorDrawable(0);
    }

    /* JADX INFO: renamed from: e */
    private static b m86756e(Context context, ApplicationInfo applicationInfo) {
        Boolean boolValueOf;
        int i = Build.VERSION.SDK_INT;
        if (applicationInfo == null) {
            return b.UNKNOWN;
        }
        try {
            if (applicationInfo.packageName.equals(context.getPackageName())) {
                boolValueOf = Boolean.valueOf(((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled());
            } else {
                Object objM169167e = i >= 29 ? otq0.m169167e(context.getSystemService("notification"), "getService", new Object[0]) : context.getSystemService("security");
                boolValueOf = objM169167e != null ? (Boolean) otq0.m169176n(objM169167e, "areNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid)) : null;
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue() ? b.ALLOWED : b.NOT_ALLOWED;
            }
        } catch (Exception e) {
            ouq0.m169393m("are notifications enabled error " + e);
        }
        return b.UNKNOWN;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: f */
    public static b m86757f(Context context, String str, boolean z) {
        if (context == null || TextUtils.isEmpty(str)) {
            return b.UNKNOWN;
        }
        try {
            ApplicationInfo applicationInfo = str.equals(context.getPackageName()) ? context.getApplicationInfo() : context.getPackageManager().getApplicationInfo(str, 0);
            b bVarM86756e = m86756e(context, applicationInfo);
            b bVar = b.UNKNOWN;
            if (bVarM86756e != bVar) {
                return bVarM86756e;
            }
            Integer num = (Integer) otq0.m169164b(AppOpsManager.class, "OP_POST_NOTIFICATION");
            if (num == null) {
                return bVar;
            }
            Integer num2 = (Integer) otq0.m169167e((AppOpsManager) context.getSystemService("appops"), "checkOpNoThrow", num, Integer.valueOf(applicationInfo.uid), str);
            int i = (Integer) otq0.m169164b(AppOpsManager.class, "MODE_ALLOWED");
            int i2 = (Integer) otq0.m169164b(AppOpsManager.class, "MODE_IGNORED");
            ouq0.m169403w(String.format("get app mode %s|%s|%s", num2, i, i2));
            if (i == null) {
                i = 0;
            }
            if (i2 == null) {
                i2 = 1;
            }
            if (num2 != null) {
                if (z) {
                    return !num2.equals(i2) ? b.ALLOWED : b.NOT_ALLOWED;
                }
                return num2.equals(i) ? b.ALLOWED : b.NOT_ALLOWED;
            }
            return b.UNKNOWN;
        } catch (Throwable th) {
            ouq0.m169393m("get app op error " + th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m86758g() {
        String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : (String) otq0.m169169g("android.app.ActivityThread", "currentProcessName", new Object[0]);
        return !TextUtils.isEmpty(processName) ? processName : "";
    }

    /* JADX INFO: renamed from: h */
    public static String m86759h(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    /* JADX INFO: renamed from: i */
    public static Map<String, String> m86760i(Context context, String str) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static void m86761j(Context context, ApplicationInfo applicationInfo, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (b.ALLOWED != m86756e(context, applicationInfo)) {
            try {
                Object objM169167e = i >= 29 ? otq0.m169167e(context.getSystemService("notification"), "getService", new Object[0]) : context.getSystemService("security");
                if (objM169167e != null) {
                    otq0.m169176n(objM169167e, "setNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid), Boolean.valueOf(z));
                }
            } catch (Exception e) {
                ouq0.m169393m("set notifications enabled error " + e);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m86762k(Context context) {
        String strM86758g = m86758g();
        if (TextUtils.isEmpty(strM86758g) || context == null) {
            return false;
        }
        return strM86758g.equals(context.getPackageName());
    }

    /* JADX INFO: renamed from: l */
    public static boolean m86763l(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || l4r0.m152824i()) {
            return false;
        }
        return context.getPackageName().equals(str);
    }

    /* JADX INFO: renamed from: m */
    public static int m86764m(Context context, String str) {
        ApplicationInfo applicationInfoM86754c = m86754c(context, str);
        if (applicationInfoM86754c == null) {
            return 0;
        }
        int i = applicationInfoM86754c.icon;
        return i == 0 ? applicationInfoM86754c.logo : i;
    }

    /* JADX INFO: renamed from: n */
    public static String m86765n(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                return packageManager.getApplicationLabel(applicationInfo).toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return str;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m86766o(Context context, String str) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m86767p(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m86768q(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "freeform_window_state", -1) >= 0) {
                return str.equals(Settings.Secure.getString(context.getContentResolver(), "freeform_package_name"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
