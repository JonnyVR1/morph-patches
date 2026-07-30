package p153l;

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
public class u3r0 {

    /* JADX INFO: renamed from: a */
    private static String f177361a;

    /* JADX INFO: renamed from: b */
    private static String f177362b;

    /* JADX INFO: renamed from: c */
    private static String f177363c;

    /* JADX INFO: renamed from: d */
    private static final String f177364d = String.valueOf((char) 2);

    /* JADX INFO: renamed from: e */
    private static final String[] f177365e = {"--", "a-", "u-", "v-", "o-", "g-", "d-"};

    /* JADX INFO: renamed from: f */
    private static final Set<String> f177366f;

    /* JADX INFO: renamed from: g */
    private static boolean f177367g;

    static {
        HashSet hashSet = new HashSet();
        f177366f = hashSet;
        hashSet.add("com.xiaomi.xmsf");
        hashSet.add("com.xiaomi.finddevice");
        hashSet.add("com.miui.securitycenter");
        f177367g = true;
    }

    /* JADX INFO: renamed from: A */
    public static synchronized String m194388A(Context context) {
        return bvq0.m106597k(m194408p(context) + ((String) null));
    }

    /* JADX INFO: renamed from: B */
    public static String m194389B(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    @Deprecated
    /* JADX INFO: renamed from: C */
    private static String m194390C(Context context) {
        return "";
    }

    /* JADX INFO: renamed from: D */
    private static String m194391D(Context context) {
        String string = context.getSharedPreferences("device_info", 0).getString("default_id", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strM194392E = m194392E(context);
        m194401i(context, strM194392E);
        return strM194392E;
    }

    /* JADX INFO: renamed from: E */
    private static String m194392E(Context context) {
        return ptq0.m173773a(Build.BRAND + "_" + q4r0.m175256a() + "_" + Build.VERSION.SDK_INT + "_" + Build.VERSION.RELEASE + "_" + Build.VERSION.INCREMENTAL + "_" + m194395c() + "_" + context.getPackageName() + "_" + System.currentTimeMillis() + "_" + bvq0.m106587a(16));
    }

    /* JADX INFO: renamed from: a */
    private static double m194393a(double d) {
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
    private static float m194394b(int i) {
        float f = (((((i + ShareConstants.MD5_FILE_BUF_LENGTH) / 524288) + 1) * 524288) / 1024.0f) / 1024.0f;
        double d = f;
        return d > 0.5d ? (float) Math.ceil(d) : f;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: c */
    public static int m194395c() {
        Object objM169169g = otq0.m169169g("android.os.UserHandle", "myUserId", new Object[0]);
        if (objM169169g == null) {
            return -1;
        }
        return ((Integer) Integer.class.cast(objM169169g)).intValue();
    }

    /* JADX INFO: renamed from: d */
    private static long m194396d(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    /* JADX INFO: renamed from: e */
    public static String m194397e() {
        return m194394b(m194406n()) + "GB";
    }

    /* JADX INFO: renamed from: f */
    private static String m194398f(int i) {
        if (i > 0) {
            String[] strArr = f177365e;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return f177365e[0];
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static String m194399g(Context context) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static synchronized String m194400h(Context context, boolean z) {
        int i;
        try {
            if (f177362b == null) {
                String strM194408p = m194408p(context);
                String strM194412t = "";
                if (!l4r0.m152835t()) {
                    strM194412t = z ? m194412t(context) : m194390C(context);
                }
                String strM194399g = m194399g(context);
                if (Build.VERSION.SDK_INT >= 26 && m194410r(strM194412t) && m194410r(strM194399g)) {
                    String strM122493f = etq0.m122490c(context).m122493f();
                    if (TextUtils.isEmpty(strM122493f)) {
                        String strMo100236a = etq0.m122490c(context).mo100236a();
                        if (!TextUtils.isEmpty(strMo100236a) && !strMo100236a.startsWith("00000000-0000-0000-0000-000000000000")) {
                            i = 4;
                            strM194408p = strMo100236a;
                        } else if (TextUtils.isEmpty(strM194408p)) {
                            strM194408p = m194391D(context);
                            i = 6;
                        } else {
                            i = 5;
                        }
                    } else {
                        strM194408p = strM122493f + strM194408p;
                        i = 2;
                    }
                } else {
                    strM194408p = strM194412t + strM194408p + strM194399g;
                    i = 1;
                }
                ouq0.m169403w("devid rule select:" + i);
                if (i == 3) {
                    f177362b = strM194408p;
                } else {
                    f177362b = m194398f(i) + bvq0.m106597k(strM194408p);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f177362b;
    }

    /* JADX INFO: renamed from: i */
    private static void m194401i(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info", 0);
        if (TextUtils.isEmpty(sharedPreferences.getString("default_id", null))) {
            sharedPreferences.edit().putString("default_id", str).apply();
        } else {
            ouq0.m169393m("default_id exist,do not change it.");
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m194402j() {
        return m194395c() <= 0;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m194403k(Context context) {
        Intent intentM102623c = b5r0.m102623c(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, null);
        if (intentM102623c == null) {
            return false;
        }
        int intExtra = intentM102623c.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m194404l(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo = (PackageInfo) otq0.m169167e(context.getPackageManager(), "getPackageInfoAsUser", str, 0, Integer.valueOf(RoomDatabase.MAX_BIND_PARAMETER_CNT));
        return packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 8388608) != 8388608;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m194405m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = f177365e;
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
    public static int m194406n() throws Throwable {
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
    public static String m194407o() {
        return m194393a(((m194396d(Environment.getDataDirectory()) / 1024.0d) / 1024.0d) / 1024.0d) + "GB";
    }

    /* JADX INFO: renamed from: p */
    public static String m194408p(Context context) {
        String str = f177361a;
        if (str != null || !f177367g) {
            return str;
        }
        boolean zM194413u = m194413u(context);
        f177367g = zM194413u;
        if (!zM194413u) {
            return null;
        }
        try {
            f177361a = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            ouq0.m169393m("failure to get androidId: " + th);
        }
        return f177361a;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m194409q(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isScreenOn();
    }

    /* JADX INFO: renamed from: r */
    private static boolean m194410r(String str) {
        if (str == null) {
            return true;
        }
        String strTrim = str.trim();
        return strTrim.length() == 0 || strTrim.equalsIgnoreCase("null") || strTrim.equalsIgnoreCase("unknown");
    }

    /* JADX INFO: renamed from: s */
    public static String m194411s() {
        return m194406n() + "KB";
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static String m194412t(Context context) {
        return null;
    }

    /* JADX INFO: renamed from: u */
    private static boolean m194413u(Context context) {
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
                ouq0.m169404x("DeviceInfo", "Get supportGetAndroidID from app metaData: " + z);
                return z;
            }
        } catch (Exception e) {
            ouq0.m169377A("DeviceInfo", "Check supportGetAndroidID from app metaData error: " + e.getMessage());
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = new ComponentName(context.getPackageName(), "com.xiaomi.push.service.XMPushService");
            intent.setComponent(componentName);
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(componentName, 128);
            if (serviceInfo != null && (bundle = serviceInfo.metaData) != null && bundle.containsKey("supportGetAndroidID")) {
                ouq0.m169404x("DeviceInfo", "The metaData of XMPushService contains key supportGetAndroidID,so return false.");
                return false;
            }
        } catch (Exception e2) {
            ouq0.m169377A("DeviceInfo", "Check supportGetAndroidID from XMPushService metaData error: " + e2.getMessage());
        }
        ouq0.m169404x("DeviceInfo", "Not configure the metaData key of supportGetAndroidID，return true by default.");
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static String m194414v() {
        return (m194396d(Environment.getDataDirectory()) / 1024) + "KB";
    }

    @Deprecated
    /* JADX INFO: renamed from: w */
    public static String m194415w(Context context) {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: x */
    public static String m194416x(Context context) {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static String m194417y(Context context) {
        return "";
    }

    /* JADX INFO: renamed from: z */
    public static synchronized String m194418z(Context context) {
        String str = f177363c;
        if (str != null) {
            return str;
        }
        String strM106597k = bvq0.m106597k(m194408p(context) + m194399g(context));
        f177363c = strM106597k;
        return strM106597k;
    }
}
