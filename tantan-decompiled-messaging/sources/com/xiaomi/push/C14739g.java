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
import p149l.fvq0;
import p149l.ikq0;
import p149l.ilq0;

/* JADX INFO: renamed from: com.xiaomi.push.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14739g {

    /* JADX INFO: renamed from: com.xiaomi.push.g$b */
    public enum b {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);


        /* JADX INFO: renamed from: a */
        private final int f61793a;

        b(int i) {
            this.f61793a = i;
        }

        /* JADX INFO: renamed from: a */
        public int m85598a() {
            return this.f61793a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m85581a(Context context) {
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
    public static int m85582b(Context context, String str) {
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
    private static ApplicationInfo m85583c(Context context, String str) {
        if (str.equals(context.getPackageName())) {
            return context.getApplicationInfo();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            ilq0.m137040m("not found app info ".concat(str));
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m85584d(Context context, String str) {
        ApplicationInfo applicationInfoM85583c = m85583c(context, str);
        Drawable drawableLoadIcon = null;
        if (applicationInfoM85583c != null) {
            try {
                drawableLoadIcon = applicationInfoM85583c.loadIcon(context.getPackageManager());
                if (drawableLoadIcon == null) {
                    drawableLoadIcon = applicationInfoM85583c.loadLogo(context.getPackageManager());
                }
            } catch (Exception e) {
                ilq0.m137040m("get app icon drawable failed, " + e);
            }
        }
        return drawableLoadIcon != null ? drawableLoadIcon : new ColorDrawable(0);
    }

    /* JADX INFO: renamed from: e */
    private static b m85585e(Context context, ApplicationInfo applicationInfo) {
        Boolean boolValueOf;
        int i = Build.VERSION.SDK_INT;
        if (applicationInfo == null) {
            return b.UNKNOWN;
        }
        try {
            if (applicationInfo.packageName.equals(context.getPackageName())) {
                boolValueOf = Boolean.valueOf(((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled());
            } else {
                Object objM136882e = i >= 29 ? ikq0.m136882e(context.getSystemService("notification"), "getService", new Object[0]) : context.getSystemService("security");
                boolValueOf = objM136882e != null ? (Boolean) ikq0.m136891n(objM136882e, "areNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid)) : null;
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue() ? b.ALLOWED : b.NOT_ALLOWED;
            }
        } catch (Exception e) {
            ilq0.m137040m("are notifications enabled error " + e);
        }
        return b.UNKNOWN;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: f */
    public static b m85586f(Context context, String str, boolean z) {
        if (context == null || TextUtils.isEmpty(str)) {
            return b.UNKNOWN;
        }
        try {
            ApplicationInfo applicationInfo = str.equals(context.getPackageName()) ? context.getApplicationInfo() : context.getPackageManager().getApplicationInfo(str, 0);
            b bVarM85585e = m85585e(context, applicationInfo);
            b bVar = b.UNKNOWN;
            if (bVarM85585e != bVar) {
                return bVarM85585e;
            }
            Integer num = (Integer) ikq0.m136879b(AppOpsManager.class, "OP_POST_NOTIFICATION");
            if (num == null) {
                return bVar;
            }
            Integer num2 = (Integer) ikq0.m136882e((AppOpsManager) context.getSystemService("appops"), "checkOpNoThrow", num, Integer.valueOf(applicationInfo.uid), str);
            int i = (Integer) ikq0.m136879b(AppOpsManager.class, "MODE_ALLOWED");
            int i2 = (Integer) ikq0.m136879b(AppOpsManager.class, "MODE_IGNORED");
            ilq0.m137050w(String.format("get app mode %s|%s|%s", num2, i, i2));
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
            ilq0.m137040m("get app op error " + th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m85587g() {
        String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : (String) ikq0.m136884g("android.app.ActivityThread", "currentProcessName", new Object[0]);
        return !TextUtils.isEmpty(processName) ? processName : "";
    }

    /* JADX INFO: renamed from: h */
    public static String m85588h(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    /* JADX INFO: renamed from: i */
    public static Map<String, String> m85589i(Context context, String str) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static void m85590j(Context context, ApplicationInfo applicationInfo, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (b.ALLOWED != m85585e(context, applicationInfo)) {
            try {
                Object objM136882e = i >= 29 ? ikq0.m136882e(context.getSystemService("notification"), "getService", new Object[0]) : context.getSystemService("security");
                if (objM136882e != null) {
                    ikq0.m136891n(objM136882e, "setNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid), Boolean.valueOf(z));
                }
            } catch (Exception e) {
                ilq0.m137040m("set notifications enabled error " + e);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m85591k(Context context) {
        String strM85587g = m85587g();
        if (TextUtils.isEmpty(strM85587g) || context == null) {
            return false;
        }
        return strM85587g.equals(context.getPackageName());
    }

    /* JADX INFO: renamed from: l */
    public static boolean m85592l(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || fvq0.m123355i()) {
            return false;
        }
        return context.getPackageName().equals(str);
    }

    /* JADX INFO: renamed from: m */
    public static int m85593m(Context context, String str) {
        ApplicationInfo applicationInfoM85583c = m85583c(context, str);
        if (applicationInfoM85583c == null) {
            return 0;
        }
        int i = applicationInfoM85583c.icon;
        return i == 0 ? applicationInfoM85583c.logo : i;
    }

    /* JADX INFO: renamed from: n */
    public static String m85594n(Context context, String str) {
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
    public static boolean m85595o(Context context, String str) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m85596p(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m85597q(Context context, String str) {
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
