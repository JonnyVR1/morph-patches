package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes13.dex */
public class xyd {
    /* JADX INFO: renamed from: a */
    public static String m211753a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m211754b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            tm80.m189642b(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m211755c() {
        return Build.BRAND;
    }

    /* JADX INFO: renamed from: d */
    public static String m211756d(Context context) {
        if (context == null) {
            return "";
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: e */
    public static String m211757e(Context context, int i) {
        TelephonyManager telephonyManager;
        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return "";
        }
        try {
            if (ik60.m136774a(context, "android.permission.READ_PHONE_STATE")) {
                return Build.VERSION.SDK_INT >= 26 ? telephonyManager.getImei(i) : telephonyManager.getDeviceId();
            }
            return "";
        } catch (Exception e) {
            tm80.m189642b(e);
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: f */
    public static String m211758f(Context context) {
        TelephonyManager telephonyManager;
        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return "";
        }
        try {
            if (ik60.m136774a(context, "android.permission.READ_PHONE_STATE")) {
                return Build.VERSION.SDK_INT >= 26 ? telephonyManager.getMeid() : telephonyManager.getDeviceId();
            }
            return "";
        } catch (Exception e) {
            tm80.m189642b(e);
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: g */
    public static String m211759g() {
        if (Build.VERSION.SDK_INT < 28) {
            return Build.SERIAL;
        }
        try {
            return Build.getSerial();
        } catch (Exception unused) {
            return "";
        }
    }
}
