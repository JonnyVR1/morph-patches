package p149l;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.room.RoomDatabase;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ouq0 {

    /* JADX INFO: renamed from: a */
    private static String f145719a;

    /* JADX INFO: renamed from: b */
    private static String f145720b;

    /* JADX INFO: renamed from: c */
    private static String f145721c;

    /* JADX INFO: renamed from: d */
    private static final String f145722d = String.valueOf((char) 2);

    /* JADX INFO: renamed from: e */
    private static final String[] f145723e = {"--", "a-", "u-", "v-", "o-", "g-", "d-"};

    /* JADX INFO: renamed from: f */
    private static final Set<String> f145724f;

    /* JADX INFO: renamed from: g */
    private static boolean f145725g;

    static {
        HashSet hashSet = new HashSet();
        f145724f = hashSet;
        hashSet.add("com.xiaomi.xmsf");
        hashSet.add("com.xiaomi.finddevice");
        hashSet.add("com.miui.securitycenter");
        f145725g = true;
    }

    /* JADX INFO: renamed from: A */
    public static synchronized String m166087A(Context context) {
        return vlq0.m198848k(m166107p(context) + ((String) null));
    }

    /* JADX INFO: renamed from: B */
    public static String m166088B(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    @Deprecated
    /* JADX INFO: renamed from: C */
    private static String m166089C(Context context) {
        return "";
    }

    /* JADX INFO: renamed from: D */
    private static String m166090D(Context context) {
        String string = context.getSharedPreferences("device_info", 0).getString("default_id", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strM166091E = m166091E(context);
        m166100i(context, strM166091E);
        return strM166091E;
    }

    /* JADX INFO: renamed from: E */
    private static String m166091E(Context context) {
        return jkq0.m141907a(Build.BRAND + "_" + kvq0.m147391a() + "_" + Build.VERSION.SDK_INT + "_" + Build.VERSION.RELEASE + "_" + Build.VERSION.INCREMENTAL + "_" + m166094c() + "_" + context.getPackageName() + "_" + System.currentTimeMillis() + "_" + vlq0.m198838a(16));
    }

    /* JADX INFO: renamed from: a */
    private static double m166092a(double d) {
        int i = 1;
        while (true) {
            double d2 = i;
            if (d2 >= d) {
                return d2;
            }
            i <<= 1;
        }
    }

    /* JADX INFO: renamed from: b */
    private static float m166093b(int i) {
        float f = (((((i + ShareConstants.MD5_FILE_BUF_LENGTH) / 524288) + 1) * 524288) / 1024.0f) / 1024.0f;
        double d = f;
        return d > 0.5d ? (float) Math.ceil(d) : f;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: c */
    public static int m166094c() {
        Object objM136884g = ikq0.m136884g("android.os.UserHandle", "myUserId", new Object[0]);
        if (objM136884g == null) {
            return -1;
        }
        return ((Integer) Integer.class.cast(objM136884g)).intValue();
    }

    /* JADX INFO: renamed from: d */
    private static long m166095d(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    /* JADX INFO: renamed from: e */
    public static String m166096e() {
        return m166093b(m166105n()) + "GB";
    }

    /* JADX INFO: renamed from: f */
    private static String m166097f(int i) {
        if (i > 0) {
            String[] strArr = f145723e;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return f145723e[0];
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static String m166098g(Context context) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static synchronized String m166099h(Context context, boolean z) {
        int i;
        try {
            if (f145720b == null) {
                String strM166107p = m166107p(context);
                String strM166111t = "";
                if (!fvq0.m123366t()) {
                    strM166111t = z ? m166111t(context) : m166089C(context);
                }
                String strM166098g = m166098g(context);
                if (Build.VERSION.SDK_INT >= 26 && m166109r(strM166111t) && m166109r(strM166098g)) {
                    String strM215087f = yjq0.m215084c(context).m215087f();
                    if (TextUtils.isEmpty(strM215087f)) {
                        String strMo97174a = yjq0.m215084c(context).mo97174a();
                        if (!TextUtils.isEmpty(strMo97174a) && !strMo97174a.startsWith("00000000-0000-0000-0000-000000000000")) {
                            i = 4;
                            strM166107p = strMo97174a;
                        } else if (TextUtils.isEmpty(strM166107p)) {
                            strM166107p = m166090D(context);
                            i = 6;
                        } else {
                            i = 5;
                        }
                    } else {
                        strM166107p = strM215087f + strM166107p;
                        i = 2;
                    }
                } else {
                    strM166107p = strM166111t + strM166107p + strM166098g;
                    i = 1;
                }
                ilq0.m137050w("devid rule select:" + i);
                if (i == 3) {
                    f145720b = strM166107p;
                } else {
                    f145720b = m166097f(i) + vlq0.m198848k(strM166107p);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f145720b;
    }

    /* JADX INFO: renamed from: i */
    private static void m166100i(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info", 0);
        if (TextUtils.isEmpty(sharedPreferences.getString("default_id", null))) {
            sharedPreferences.edit().putString("default_id", str).apply();
        } else {
            ilq0.m137040m("default_id exist,do not change it.");
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m166101j() {
        return m166094c() <= 0;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m166102k(Context context) {
        Intent intentM200201c = vvq0.m200201c(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, null);
        if (intentM200201c == null) {
            return false;
        }
        int intExtra = intentM200201c.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m166103l(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo = (PackageInfo) ikq0.m136882e(context.getPackageManager(), "getPackageInfoAsUser", str, 0, Integer.valueOf(RoomDatabase.MAX_BIND_PARAMETER_CNT));
        return packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 8388608) != 8388608;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m166104m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = f145723e;
            if (i >= strArr.length) {
                return false;
            }
            if (str.startsWith(strArr[i])) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m166105n() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        String[] strArrSplit;
        int i = 0;
        if (new File("/proc/meminfo").exists()) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
                    try {
                        String line = bufferedReader.readLine();
                        if (!TextUtils.isEmpty(line) && (strArrSplit = line.split("\\s+")) != null && strArrSplit.length >= 2 && TextUtils.isDigitsOnly(strArrSplit[1])) {
                            i = Integer.parseInt(strArrSplit[1]);
                        }
                        bufferedReader.close();
                    } catch (Exception unused) {
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        return i;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (Exception unused4) {
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: o */
    public static String m166106o() {
        return m166092a(((m166095d(Environment.getDataDirectory()) / 1024.0d) / 1024.0d) / 1024.0d) + "GB";
    }

    /* JADX INFO: renamed from: p */
    public static String m166107p(Context context) {
        String str = f145719a;
        if (str != null || !f145725g) {
            return str;
        }
        boolean zM166112u = m166112u(context);
        f145725g = zM166112u;
        if (!zM166112u) {
            return null;
        }
        try {
            f145719a = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            ilq0.m137040m("failure to get androidId: " + th);
        }
        return f145719a;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m166108q(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isScreenOn();
    }

    /* JADX INFO: renamed from: r */
    private static boolean m166109r(String str) {
        if (str == null) {
            return true;
        }
        String strTrim = str.trim();
        return strTrim.length() == 0 || strTrim.equalsIgnoreCase("null") || strTrim.equalsIgnoreCase("unknown");
    }

    /* JADX INFO: renamed from: s */
    public static String m166110s() {
        return m166105n() + "KB";
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static String m166111t(Context context) {
        return null;
    }

    /* JADX INFO: renamed from: u */
    private static boolean m166112u(Context context) {
        Bundle bundle;
        ApplicationInfo applicationInfo;
        Bundle bundle2;
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && (bundle2 = applicationInfo.metaData) != null && bundle2.containsKey("supportGetAndroidID")) {
                boolean z = packageInfo.applicationInfo.metaData.getBoolean("supportGetAndroidID", true);
                ilq0.m137051x("DeviceInfo", "Get supportGetAndroidID from app metaData: " + z);
                return z;
            }
        } catch (Exception e) {
            ilq0.m137024A("DeviceInfo", "Check supportGetAndroidID from app metaData error: " + e.getMessage());
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = new ComponentName(context.getPackageName(), "com.xiaomi.push.service.XMPushService");
            intent.setComponent(componentName);
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(componentName, 128);
            if (serviceInfo != null && (bundle = serviceInfo.metaData) != null && bundle.containsKey("supportGetAndroidID")) {
                ilq0.m137051x("DeviceInfo", "The metaData of XMPushService contains key supportGetAndroidID,so return false.");
                return false;
            }
        } catch (Exception e2) {
            ilq0.m137024A("DeviceInfo", "Check supportGetAndroidID from XMPushService metaData error: " + e2.getMessage());
        }
        ilq0.m137051x("DeviceInfo", "Not configure the metaData key of supportGetAndroidID，return true by default.");
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static String m166113v() {
        return (m166095d(Environment.getDataDirectory()) / 1024) + "KB";
    }

    @Deprecated
    /* JADX INFO: renamed from: w */
    public static String m166114w(Context context) {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: x */
    public static String m166115x(Context context) {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static String m166116y(Context context) {
        return "";
    }

    /* JADX INFO: renamed from: z */
    public static synchronized String m166117z(Context context) {
        String str = f145721c;
        if (str != null) {
            return str;
        }
        String strM198848k = vlq0.m198848k(m166107p(context) + m166098g(context));
        f145721c = strM198848k;
        return strM198848k;
    }
}
