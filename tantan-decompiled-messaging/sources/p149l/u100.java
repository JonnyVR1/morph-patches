package p149l;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.momo.mcamera.mask.BigEyeFilter;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.io.UnsupportedEncodingException;
import java.net.NetworkInterface;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u100 {

    /* JADX INFO: renamed from: l.u100$b */
    public static final class C20331b {

        /* JADX INFO: renamed from: a */
        private Intent f172959a;

        private C20331b(Context context) {
            this.f172959a = ii5.m136342l(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public int m191396e() {
            return this.f172959a.getIntExtra(FirebaseAnalytics.Param.LEVEL, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public int m191397f() {
            return this.f172959a.getIntExtra(BigEyeFilter.UNIFORM_SCALE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public int m191398g() {
            return this.f172959a.getIntExtra("temperature", 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public int m191399h() {
            return this.f172959a.getIntExtra("voltage", 0);
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m191369a(Context context) {
        String strM191370b;
        JSONObject jSONObject = new JSONObject();
        try {
            String strM191384p = m191384p();
            if (!TextUtils.isEmpty(strM191384p)) {
                jSONObject.put("os", strM191384p);
            }
            String strM191377i = m191377i(context);
            if (!TextUtils.isEmpty(strM191377i)) {
                jSONObject.put(Device.IMEI, strM191377i);
            }
            String strM191381m = m191381m(context);
            if (!TextUtils.isEmpty(strM191381m)) {
                jSONObject.put(Device.MEID, strM191381m);
            }
            String strM191378j = m191378j(context);
            if (!TextUtils.isEmpty(strM191378j)) {
                jSONObject.put("imsi", strM191378j);
            }
            String strM191379k = m191379k(context);
            if (!TextUtils.isEmpty(strM191379k)) {
                jSONObject.put("mac", strM191379k);
            }
            String strM191376h = m191376h(context);
            if (!TextUtils.isEmpty(strM191376h)) {
                jSONObject.put("iccid", strM191376h);
            }
            String strM191387s = m191387s();
            if (!TextUtils.isEmpty(strM191387s)) {
                jSONObject.put("serial", strM191387s);
            }
            String strM191371c = m191371c(context);
            if (!TextUtils.isEmpty(strM191371c)) {
                jSONObject.put("androidid", strM191371c);
            }
            String strM191374f = m191374f();
            if (!TextUtils.isEmpty(strM191374f)) {
                jSONObject.put("cpu", strM191374f);
            }
            String strM191383o = m191383o();
            if (!TextUtils.isEmpty(strM191383o)) {
                jSONObject.put("model", strM191383o);
            }
            String strM191386r = m191386r();
            if (!TextUtils.isEmpty(strM191386r)) {
                jSONObject.put("sdcard", strM191386r);
            }
            String strM191385q = m191385q(context);
            if (!TextUtils.isEmpty(strM191385q)) {
                jSONObject.put("resolution", strM191385q);
            }
            String strM191389u = m191389u(context);
            if (!TextUtils.isEmpty(strM191389u)) {
                jSONObject.put("ssid", strM191389u);
            }
            String strM191390v = m191390v(context);
            if (!TextUtils.isEmpty(strM191390v)) {
                jSONObject.put("bssid", strM191390v);
            }
            String strM191375g = m191375g();
            if (!TextUtils.isEmpty(strM191375g)) {
                jSONObject.put("deviceName", strM191375g);
            }
            String strM191373e = m191373e(context);
            if (!TextUtils.isEmpty(strM191373e)) {
                jSONObject.put("connecttype", strM191373e);
            }
            try {
                strM191370b = m191370b(context);
            } catch (Exception e) {
                e.printStackTrace();
                strM191370b = "";
            }
            if (!TextUtils.isEmpty(strM191370b)) {
                jSONObject.put("ua", strM191370b);
            }
            double dM191372d = m191372d(context);
            jSONObject.put("batterymaxcapacity", String.valueOf(dM191372d));
            jSONObject.put("batterycurrentcapacity", String.valueOf(dM191372d));
            C20331b c20331b = new C20331b(context);
            jSONObject.put("batterycurrentvoltage", c20331b.m191399h());
            jSONObject.put("batterycurrenttemperature", c20331b.m191398g());
            jSONObject.put("batterycurrentcapacity", (dM191372d * ((double) c20331b.m191396e())) / ((double) c20331b.m191397f()));
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m191370b(Context context) {
        StringBuilder sb = new StringBuilder();
        String packageName = context.getPackageName();
        String str = (TextUtils.isEmpty(packageName) || !packageName.contains("com.sina.weibo")) ? "ssosdk" : "weibo";
        sb.append(Build.MANUFACTURER);
        sb.append("-");
        sb.append(Build.MODEL);
        sb.append("__");
        sb.append(str);
        sb.append("__");
        try {
            sb.append("1.0".replaceAll("\\s+", "_"));
        } catch (Exception unused) {
            sb.append("unknown");
        }
        sb.append("__android__android");
        sb.append(Build.VERSION.RELEASE);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private static String m191371c(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    private static double m191372d(Context context) {
        Object objNewInstance;
        try {
            objNewInstance = Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(context);
        } catch (Exception unused) {
            objNewInstance = null;
        }
        try {
            return ((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getAveragePower", String.class).invoke(objNewInstance, "battery.capacity")).doubleValue();
        } catch (Exception unused2) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m191373e(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 0) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return "2G";
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return "3G";
                        case 13:
                            return "4G";
                        default:
                            return "none";
                    }
                }
                if (activeNetworkInfo.getType() == 1) {
                    return "wifi";
                }
            }
        } catch (Exception unused) {
        }
        return "none";
    }

    /* JADX INFO: renamed from: f */
    private static String m191374f() {
        try {
            return Build.CPU_ABI;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m191375g() {
        try {
            return Build.BRAND;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    private static String m191376h(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    private static String m191377i(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    private static String m191378j(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    private static String m191379k(Context context) {
        return m191380l();
    }

    /* JADX INFO: renamed from: l */
    private static String m191380l() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b : hardwareAddress) {
                        sb.append(String.format("%02X:", Byte.valueOf(b)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    private static String m191381m(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m191382n(Context context) {
        try {
            return new String(m191369a(context).getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: o */
    private static String m191383o() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: p */
    private static String m191384p() {
        try {
            return "Android " + Build.VERSION.RELEASE;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: q */
    private static String m191385q(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getMetrics(displayMetrics);
            return String.valueOf(displayMetrics.widthPixels) + "*" + String.valueOf(displayMetrics.heightPixels);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: r */
    private static String m191386r() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.toString(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: s */
    private static String m191387s() {
        if (Build.VERSION.SDK_INT >= 26) {
            return m191388t();
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.serialno", "unknown");
        } catch (Exception unused) {
            return "";
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: t */
    private static String m191388t() {
        try {
            return Build.getSerial();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: u */
    private static String m191389u(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            return connectionInfo != null ? connectionInfo.getSSID() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: v */
    public static String m191390v(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            return connectionInfo != null ? connectionInfo.getBSSID() : "";
        } catch (SecurityException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m191391w(Context context) {
    }
}
