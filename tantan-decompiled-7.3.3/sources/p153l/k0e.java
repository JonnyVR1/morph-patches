package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes11.dex */
public class k0e {
    /* JADX INFO: renamed from: a */
    public static String m147776a(Context context) {
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
    public static String m147777b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            xu80.m213121b(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m147778c() {
        return Build.BRAND;
    }

    /* JADX INFO: renamed from: d */
    public static String m147779d(Context context) {
        if (context == null) {
            return "";
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: e */
    public static String m147780e(Context context, int i) {
        TelephonyManager telephonyManager;
        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return "";
        }
        try {
            if (os60.m168962a(context, "android.permission.READ_PHONE_STATE")) {
                return Build.VERSION.SDK_INT >= 26 ? telephonyManager.getImei(i) : telephonyManager.getDeviceId();
            }
            return "";
        } catch (Exception e) {
            xu80.m213121b(e);
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: f */
    public static String m147781f(Context context) {
        TelephonyManager telephonyManager;
        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return "";
        }
        try {
            if (os60.m168962a(context, "android.permission.READ_PHONE_STATE")) {
                return Build.VERSION.SDK_INT >= 26 ? telephonyManager.getMeid() : telephonyManager.getDeviceId();
            }
            return "";
        } catch (Exception e) {
            xu80.m213121b(e);
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: g */
    public static String m147782g() {
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
