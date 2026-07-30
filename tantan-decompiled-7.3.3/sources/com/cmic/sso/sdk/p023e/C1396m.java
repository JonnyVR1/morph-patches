package com.cmic.sso.sdk.p023e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.cmic.sso.sdk.C1339a;
import com.p051p1.mobile.putong.data.User;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.m */
/* JADX INFO: loaded from: classes.dex */
public class C1396m {

    /* JADX INFO: renamed from: a */
    private static final String f5751a = Build.BRAND;

    /* JADX INFO: renamed from: b */
    private static final String f5752b = Build.MODEL;

    /* JADX INFO: renamed from: c */
    private static final String f5753c = "android" + Build.VERSION.RELEASE;

    /* JADX INFO: renamed from: d */
    private static final boolean f5754d;

    static {
        f5754d = Build.VERSION.SDK_INT <= 28;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7347a(ConnectivityManager connectivityManager, Context context, C1339a c1339a) {
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            boolean zBooleanValue = ((Boolean) declaredMethod.invoke(connectivityManager, null)).booleanValue();
            C1386c.m7288b("TelephonyUtils", "data is on ---------" + zBooleanValue);
            if (Build.VERSION.SDK_INT < 26) {
                c1339a.m7015a("networkTypeByAPI", User.ID_TEAM_ACCOUNT);
                return zBooleanValue;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && C1390g.m7300a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                if (telephonyManager.createForSubscriptionId(SubscriptionManager.getDefaultSubscriptionId()).isDataEnabled()) {
                    c1339a.m7015a("networkTypeByAPI", "1");
                    return zBooleanValue;
                }
                c1339a.m7015a("networkTypeByAPI", "0");
            }
            return zBooleanValue;
        } catch (Exception unused) {
            C1386c.m7286a("TelephonyUtils", "isMobileEnabled ----反射出错-----");
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m7348b() {
        return f5752b;
    }

    /* JADX INFO: renamed from: c */
    public static String m7349c() {
        return f5753c;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7350d() {
        return f5754d;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m7351e() {
        String str = f5751a;
        C1386c.m7286a("brand", str);
        return "HUAWEI".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7352f() {
        String str = f5751a;
        C1386c.m7286a("brand", str);
        return "HONOR".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: a */
    public static int m7344a(Context context, boolean z, C1339a c1339a) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 1) {
                    if (type == 0) {
                        C1386c.m7288b("TelephonyUtils", "流量");
                        return 1;
                    }
                    return 0;
                }
                C1386c.m7288b("TelephonyUtils", "WIFI");
                boolean zM7300a = C1390g.m7300a(context, "android.permission.CHANGE_NETWORK_STATE");
                C1386c.m7286a("TelephonyUtils", "CHANGE_NETWORK_STATE=" + zM7300a);
                if (!zM7300a || !z || !m7347a(connectivityManager, context, c1339a)) {
                    return 2;
                }
                C1386c.m7288b("TelephonyUtils", "流量数据 WIFI 同开");
                return 3;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m7345a() {
        return f5751a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7346a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager == null || 1 != telephonyManager.getSimState();
    }
}
