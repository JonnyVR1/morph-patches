package com.momo.xeengine.xnative;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.WindowManager;
import androidx.annotation.Keep;
import com.appsflyer.internal.s;
import com.appsflyer.internal.t;
import com.momo.xeengine.XEnginePreferences;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class XEDevice {
    public static String getAppName() {
        try {
            Context context = XEnginePreferences.getContext();
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static String getAppVersion() {
        return getAppVersionName(XEnginePreferences.getContext());
    }

    public static String getAppVersionName(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return (Build.VERSION.SDK_INT >= 33 ? t.a(packageManager, context.getPackageName(), s.a(0L)) : packageManager.getPackageInfo(context.getPackageName(), 0)).versionName;
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static int getAvailableProcessors() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static String getCachePath() {
        Context context = XEnginePreferences.getContext();
        if (context == null) {
            return "";
        }
        try {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null && externalCacheDir.exists() && externalCacheDir.canWrite()) {
                return externalCacheDir.getAbsolutePath();
            }
        } catch (Exception unused) {
        }
        try {
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                return cacheDir.getAbsolutePath();
            }
        } catch (Exception unused2) {
        }
        return "";
    }

    public static int getConnectedType() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (XEnginePreferences.getContext() == null || (connectivityManager = (ConnectivityManager) XEnginePreferences.getContext().getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() || !activeNetworkInfo.isAvailable()) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            return type != 1 ? 0 : 2;
        }
        return 1;
    }

    public static String getDeviceId() {
        try {
            return Settings.Secure.getString(XEnginePreferences.getContext().getContentResolver(), "android_id");
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static String getDeviceInfo() {
        return "[Platform] Android [BRAND] " + Build.BRAND + " [Model] " + Build.MODEL + " [System Version] " + Build.VERSION.SDK_INT;
    }

    public static String getDeviceModel() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static String getDeviceSystemVersion() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String getExternalFilesDir() {
        return XEnginePreferences.getContext().getExternalFilesDir(null).getAbsolutePath();
    }

    public static String getPackageName() {
        try {
            return XEnginePreferences.getContext().getPackageName();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public static int getRotation() {
        return ((WindowManager) XEnginePreferences.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static void performHapticFeedback() {
        Context context = XEnginePreferences.getContext();
        if (context != null) {
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(15L);
            }
        }
    }

    public String getLanguage() {
        return Locale.getDefault().getDisplayLanguage();
    }

    public boolean isRtl() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}
