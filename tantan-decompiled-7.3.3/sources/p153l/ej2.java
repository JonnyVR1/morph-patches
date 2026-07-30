package p153l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class ej2 {

    /* JADX INFO: renamed from: a */
    public static String f94242a = null;

    /* JADX INFO: renamed from: b */
    public static String f94243b = null;

    /* JADX INFO: renamed from: c */
    public static String f94244c = null;

    /* JADX INFO: renamed from: d */
    public static String f94245d = null;

    /* JADX INFO: renamed from: e */
    private static String f94246e = "";

    /* JADX INFO: renamed from: a */
    public static long m120956a() {
        ActivityManager activityManager = (ActivityManager) lv0.m155971a().getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    /* JADX INFO: renamed from: b */
    public static String m120957b() {
        WifiInfo connectionInfo = ((WifiManager) lv0.m155971a().getSystemService("wifi")).getConnectionInfo();
        return connectionInfo != null ? connectionInfo.getBSSID() : "";
    }

    /* JADX INFO: renamed from: c */
    public static String m120958c() {
        if (!TextUtils.isEmpty(f94245d)) {
            return f94245d;
        }
        String str = Build.BRAND;
        f94245d = str;
        if (TextUtils.isEmpty(str)) {
            f94245d = "unknown";
        }
        return f94245d;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: d */
    public static String m120959d() {
        if (!TextUtils.isEmpty(f94246e)) {
            return f94246e;
        }
        if (m120964i("android.permission.READ_PHONE_STATE")) {
            try {
                f94246e = ((TelephonyManager) lv0.m155971a().getSystemService("phone")).getSimSerialNumber();
            } catch (Exception unused) {
            }
        }
        return f94246e;
    }

    /* JADX INFO: renamed from: e */
    public static String m120960e() {
        if (!TextUtils.isEmpty(f94242a)) {
            return f94242a;
        }
        String strM120963h = Build.MODEL;
        if (TextUtils.isEmpty(strM120963h)) {
            return "unknown";
        }
        if (m120967l(strM120963h)) {
            strM120963h = m120963h(strM120963h);
        }
        f94242a = strM120963h;
        return strM120963h;
    }

    /* JADX INFO: renamed from: f */
    public static int m120961f() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX INFO: renamed from: g */
    public static long m120962g() {
        if (m120965j()) {
            ActivityManager activityManager = (ActivityManager) lv0.m155971a().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            try {
                String line = bufferedReader2.readLine();
                long jIntValue = line != null ? Integer.valueOf(line.split("\\s+")[1]).intValue() / 1024 : 0L;
                n1m.m161127b(bufferedReader2);
                return jIntValue;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                n1m.m161127b(bufferedReader);
                return -1L;
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: h */
    private static String m120963h(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return "momo";
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m120964i(String str) {
        return j26.m143188a(lv0.m155971a(), str) == 0;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m120965j() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m120966k() {
        return Build.MANUFACTURER.equalsIgnoreCase(HardwareEarMonitorUtils.MANUFACTURER_XIAOMI);
    }

    /* JADX INFO: renamed from: l */
    private static boolean m120967l(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (char c : str.toCharArray()) {
                if (c <= 31 || c >= 127) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m120968m(Activity activity, boolean z) {
        if (m120966k()) {
            Class<?> cls = activity.getWindow().getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Class cls3 = Integer.TYPE;
                cls.getMethod("setExtraFlags", cls3, cls3).invoke(activity.getWindow(), Integer.valueOf(z ? i : 0), Integer.valueOf(i));
                return true;
            } catch (Exception e) {
                Log.e("BaseDeviceUtils", "", e);
            }
        }
        return false;
    }
}
