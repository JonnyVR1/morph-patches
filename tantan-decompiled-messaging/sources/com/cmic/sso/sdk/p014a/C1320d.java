package com.cmic.sso.sdk.p014a;

import android.text.TextUtils;
import com.cmic.sso.sdk.p022e.C1371k;

/* JADX INFO: renamed from: com.cmic.sso.sdk.a.d */
/* JADX INFO: loaded from: classes.dex */
class C1320d {
    /* JADX INFO: renamed from: a */
    public static boolean m7038a() {
        return System.currentTimeMillis() >= C1371k.m7273a("sso_config_xf", "client_valid", 0L);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7042b(boolean z) {
        return "1".equals(C1371k.m7275a("sso_config_xf", "CLOSE_IPV6_LIST", !z ? "0" : "1"));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7044c(boolean z) {
        String str = !z ? "0" : "1";
        return "1".equals(C1371k.m7275a("sso_config_xf", "CLOSE_M008_APPID_LIST", str)) || "1".equals(C1371k.m7275a("sso_config_xf", "CLOSE_M008_SDKVERSION_LIST", str));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7045d(boolean z) {
        return C1371k.m7275a("sso_config_xf", "CLOSE_FRIEND_WAPKS", z ? "CU" : "").contains("CU");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m7046e(boolean z) {
        return C1371k.m7275a("sso_config_xf", "CLOSE_FRIEND_WAPKS", z ? "CT" : "").contains("CT");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7047f(boolean z) {
        return "1".equals(C1371k.m7275a("sso_config_xf", "CLOSE_LOGS_VERSION", z ? "1" : "0"));
    }

    /* JADX INFO: renamed from: b */
    public static String m7041b(String str) {
        String strM7275a = C1371k.m7275a("sso_config_xf", "https_get_phone_scrip_host", (String) null);
        return TextUtils.isEmpty(strM7275a) ? str : strM7275a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7039a(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        return "1".equals(C1371k.m7275a("sso_config_xf", "CLOSE_IPV4_LIST", str));
    }

    /* JADX INFO: renamed from: b */
    public static int m7040b(int i) {
        return C1371k.m7271a("sso_config_xf", "pauseTime", i);
    }

    /* JADX INFO: renamed from: a */
    public static String m7037a(String str) {
        String strM7275a = C1371k.m7275a("sso_config_xf", "config_host", (String) null);
        return TextUtils.isEmpty(strM7275a) ? str : strM7275a;
    }

    /* JADX INFO: renamed from: a */
    public static int m7036a(int i) {
        return C1371k.m7271a("sso_config_xf", "maxFailedLogTimes", i);
    }

    /* JADX INFO: renamed from: c */
    public static String m7043c(String str) {
        String strM7275a = C1371k.m7275a("sso_config_xf", "logHost", "");
        return TextUtils.isEmpty(strM7275a) ? str : strM7275a;
    }
}
