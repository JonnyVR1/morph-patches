package com.cosmos.photon.push.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.net.URLEncoder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class DeviceUtils {
    private static final long CHECK_INSTALL_INTERVAL = 180000;
    private static String manufacturer;
    private static String model;
    private static final Map<String, Boolean> installMap = new ConcurrentHashMap();
    private static long lastCheckInstallTime = System.currentTimeMillis();

    /* JADX INFO: renamed from: a */
    private static final String f5811a = Build.BRAND;
    public static final String HUAWEI = ThirdPushManager.VENDOR_TYPE_HUAWEI.toLowerCase();
    public static final String HONOR = HardwareEarMonitorUtils.MANUFACTURER_HONOR.toLowerCase();
    private static final String XIAOMI = ThirdPushManager.VENDOR_TYPE_XIAOMI.toLowerCase();

    public static boolean checkHWDevice(Context context) {
        int i;
        try {
            String str = HUAWEI;
            String str2 = f5811a;
            if (!TextUtils.equals(str, str2.toLowerCase()) && !TextUtils.equals(HONOR, str2.toLowerCase())) {
                return false;
            }
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 0);
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                i = Integer.parseInt((String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.build.hw_emui_api_level"));
            } catch (Throwable unused) {
                i = 0;
            }
            return packageInfo != null && packageInfo.versionCode >= 20401300 && i > 9;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public static boolean checkMZDevice() {
        try {
            if (!isMeizu()) {
                return false;
            }
            String str = Build.DISPLAY;
            if (!TextUtils.isEmpty(str) && (str.startsWith("Flyme OS") || str.startsWith("Flyme"))) {
                try {
                    return Integer.valueOf(str.replaceAll("Flyme OS", "").replaceAll("Flyme", "").trim().split("\\.")[0]).intValue() >= 5;
                } catch (Throwable unused) {
                }
            }
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public static boolean checkXMDevice(Context context) {
        PackageInfo packageInfo;
        try {
            return TextUtils.equals(XIAOMI, Build.BRAND.toLowerCase()) && (packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0)) != null && packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
        }
    }

    public static synchronized void clearAppInstallCache() {
        installMap.clear();
    }

    public static String getManufacturer() {
        if (!TextUtils.isEmpty(manufacturer)) {
            return manufacturer;
        }
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            str = "unknow manufacturer";
        }
        return needEncode(str) ? getUTF8String(str) : str;
    }

    public static String getModle() {
        if (!TextUtils.isEmpty(model)) {
            return model;
        }
        String str = Build.MODEL;
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return needEncode(str) ? getUTF8String(str) : str;
    }

    private static String getUTF8String(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return "momo";
        }
    }

    public static synchronized boolean isAppInstalled(String str) {
        try {
            if (Math.abs(System.currentTimeMillis() - lastCheckInstallTime) > CHECK_INSTALL_INTERVAL) {
                installMap.clear();
                lastCheckInstallTime = System.currentTimeMillis();
            }
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Map<String, Boolean> map = installMap;
            if (!map.containsKey(str)) {
                try {
                    AppContext.getContext().getPackageManager().getPackageInfo(str, 1);
                    map.put(str, Boolean.TRUE);
                } catch (PackageManager.NameNotFoundException unused) {
                    installMap.put(str, Boolean.FALSE);
                }
            }
            try {
                return installMap.get(str).booleanValue();
            } catch (NullPointerException unused2) {
                return true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean isMeizu() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            if (TextUtils.isEmpty((String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.meizu.product.model"))) {
                String str = Build.BRAND;
                if (!"meizu".equalsIgnoreCase(str) && !"22c4185e".equalsIgnoreCase(str)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            String str2 = Build.BRAND;
            return "meizu".equalsIgnoreCase(str2) || "22c4185e".equalsIgnoreCase(str2);
        }
    }

    private static boolean needEncode(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (char c : str.toCharArray()) {
                if (c <= 31 || c >= 127) {
                    return true;
                }
            }
        }
        return false;
    }
}
