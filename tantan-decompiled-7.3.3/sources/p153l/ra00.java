package p153l;

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
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.io.UnsupportedEncodingException;
import java.net.NetworkInterface;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ra00 {

    /* JADX INFO: renamed from: l.ra00$b */
    public static final class C19801b {

        /* JADX INFO: renamed from: a */
        private Intent f161884a;

        private C19801b(Context context) {
            this.f161884a = jj5.m145018l(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public int m180691e() {
            return this.f161884a.getIntExtra(FirebaseAnalytics.Param.LEVEL, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public int m180692f() {
            return this.f161884a.getIntExtra(BigEyeFilter.UNIFORM_SCALE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public int m180693g() {
            return this.f161884a.getIntExtra("temperature", 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public int m180694h() {
            return this.f161884a.getIntExtra("voltage", 0);
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m180664a(Context context) {
        String strM180665b;
        JSONObject jSONObject = new JSONObject();
        try {
            String strM180679p = m180679p();
            if (!TextUtils.isEmpty(strM180679p)) {
                jSONObject.put("os", strM180679p);
            }
            String strM180672i = m180672i(context);
            if (!TextUtils.isEmpty(strM180672i)) {
                jSONObject.put(Device.IMEI, strM180672i);
            }
            String strM180676m = m180676m(context);
            if (!TextUtils.isEmpty(strM180676m)) {
                jSONObject.put(Device.MEID, strM180676m);
            }
            String strM180673j = m180673j(context);
            if (!TextUtils.isEmpty(strM180673j)) {
                jSONObject.put("imsi", strM180673j);
            }
            String strM180674k = m180674k(context);
            if (!TextUtils.isEmpty(strM180674k)) {
                jSONObject.put("mac", strM180674k);
            }
            String strM180671h = m180671h(context);
            if (!TextUtils.isEmpty(strM180671h)) {
                jSONObject.put("iccid", strM180671h);
            }
            String strM180682s = m180682s();
            if (!TextUtils.isEmpty(strM180682s)) {
                jSONObject.put("serial", strM180682s);
            }
            String strM180666c = m180666c(context);
            if (!TextUtils.isEmpty(strM180666c)) {
                jSONObject.put("androidid", strM180666c);
            }
            String strM180669f = m180669f();
            if (!TextUtils.isEmpty(strM180669f)) {
                jSONObject.put("cpu", strM180669f);
            }
            String strM180678o = m180678o();
            if (!TextUtils.isEmpty(strM180678o)) {
                jSONObject.put("model", strM180678o);
            }
            String strM180681r = m180681r();
            if (!TextUtils.isEmpty(strM180681r)) {
                jSONObject.put("sdcard", strM180681r);
            }
            String strM180680q = m180680q(context);
            if (!TextUtils.isEmpty(strM180680q)) {
                jSONObject.put("resolution", strM180680q);
            }
            String strM180684u = m180684u(context);
            if (!TextUtils.isEmpty(strM180684u)) {
                jSONObject.put("ssid", strM180684u);
            }
            String strM180685v = m180685v(context);
            if (!TextUtils.isEmpty(strM180685v)) {
                jSONObject.put("bssid", strM180685v);
            }
            String strM180670g = m180670g();
            if (!TextUtils.isEmpty(strM180670g)) {
                jSONObject.put("deviceName", strM180670g);
            }
            String strM180668e = m180668e(context);
            if (!TextUtils.isEmpty(strM180668e)) {
                jSONObject.put("connecttype", strM180668e);
            }
            try {
                strM180665b = m180665b(context);
            } catch (Exception e) {
                e.printStackTrace();
                strM180665b = "";
            }
            if (!TextUtils.isEmpty(strM180665b)) {
                jSONObject.put("ua", strM180665b);
            }
            double dM180667d = m180667d(context);
            jSONObject.put("batterymaxcapacity", String.valueOf(dM180667d));
            jSONObject.put("batterycurrentcapacity", String.valueOf(dM180667d));
            C19801b c19801b = new C19801b(context);
            jSONObject.put("batterycurrentvoltage", c19801b.m180694h());
            jSONObject.put("batterycurrenttemperature", c19801b.m180693g());
            jSONObject.put("batterycurrentcapacity", (dM180667d * ((double) c19801b.m180691e())) / ((double) c19801b.m180692f()));
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m180665b(Context context) {
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
    private static String m180666c(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    private static double m180667d(Context context) {
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
    private static String m180668e(Context context) {
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
    private static String m180669f() {
        try {
            return Build.CPU_ABI;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m180670g() {
        try {
            return Build.BRAND;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    private static String m180671h(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    private static String m180672i(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    private static String m180673j(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    private static String m180674k(Context context) {
        return m180675l();
    }

    /* JADX INFO: renamed from: l */
    private static String m180675l() {
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
    private static String m180676m(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m180677n(Context context) {
        try {
            return new String(m180664a(context).getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: o */
    private static String m180678o() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: p */
    private static String m180679p() {
        try {
            return "Android " + Build.VERSION.RELEASE;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: q */
    private static String m180680q(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getMetrics(displayMetrics);
            return String.valueOf(displayMetrics.widthPixels) + "*" + String.valueOf(displayMetrics.heightPixels);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: r */
    private static String m180681r() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.toString(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: s */
    private static String m180682s() {
        if (Build.VERSION.SDK_INT >= 26) {
            return m180683t();
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
    private static String m180683t() {
        try {
            return Build.getSerial();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: u */
    private static String m180684u(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            return connectionInfo != null ? connectionInfo.getSSID() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: v */
    public static String m180685v(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            return connectionInfo != null ? connectionInfo.getBSSID() : "";
        } catch (SecurityException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m180686w(Context context) {
    }
}
