package com.cmic.sso.sdk.p022e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.cmic.sso.sdk.C1316a;
import com.p046p1.mobile.putong.data.User;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.m */
/* JADX INFO: loaded from: classes.dex */
public class C1373m {

    /* JADX INFO: renamed from: a */
    private static final String f5714a = Build.BRAND;

    /* JADX INFO: renamed from: b */
    private static final String f5715b = Build.MODEL;

    /* JADX INFO: renamed from: c */
    private static final String f5716c = "android" + Build.VERSION.RELEASE;

    /* JADX INFO: renamed from: d */
    private static final boolean f5717d;

    static {
        f5717d = Build.VERSION.SDK_INT <= 28;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7293a(ConnectivityManager connectivityManager, Context context, C1316a c1316a) {
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            boolean zBooleanValue = ((Boolean) declaredMethod.invoke(connectivityManager, null)).booleanValue();
            C1363c.m7234b("TelephonyUtils", "data is on ---------" + zBooleanValue);
            if (Build.VERSION.SDK_INT < 26) {
                c1316a.m6961a("networkTypeByAPI", User.ID_TEAM_ACCOUNT);
                return zBooleanValue;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && C1367g.m7246a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                if (telephonyManager.createForSubscriptionId(SubscriptionManager.getDefaultSubscriptionId()).isDataEnabled()) {
                    c1316a.m6961a("networkTypeByAPI", "1");
                    return zBooleanValue;
                }
                c1316a.m6961a("networkTypeByAPI", "0");
            }
            return zBooleanValue;
        } catch (Exception unused) {
            C1363c.m7232a("TelephonyUtils", "isMobileEnabled ----反射出错-----");
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m7294b() {
        return f5715b;
    }

    /* JADX INFO: renamed from: c */
    public static String m7295c() {
        return f5716c;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7296d() {
        return f5717d;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m7297e() {
        String str = f5714a;
        C1363c.m7232a("brand", str);
        return "HUAWEI".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7298f() {
        String str = f5714a;
        C1363c.m7232a("brand", str);
        return "HONOR".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: a */
    public static int m7290a(Context context, boolean z, C1316a c1316a) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 1) {
                    if (type == 0) {
                        C1363c.m7234b("TelephonyUtils", "流量");
                        return 1;
                    }
                    return 0;
                }
                C1363c.m7234b("TelephonyUtils", "WIFI");
                boolean zM7246a = C1367g.m7246a(context, "android.permission.CHANGE_NETWORK_STATE");
                C1363c.m7232a("TelephonyUtils", "CHANGE_NETWORK_STATE=" + zM7246a);
                if (!zM7246a || !z || !m7293a(connectivityManager, context, c1316a)) {
                    return 2;
                }
                C1363c.m7234b("TelephonyUtils", "流量数据 WIFI 同开");
                return 3;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m7291a() {
        return f5714a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7292a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager == null || 1 != telephonyManager.getSimState();
    }
}
