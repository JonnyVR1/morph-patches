package com.cmic.sso.sdk.p015a;

import android.text.TextUtils;
import com.cmic.sso.sdk.p023e.C1394k;

/* JADX INFO: renamed from: com.cmic.sso.sdk.a.d */
/* JADX INFO: loaded from: classes.dex */
class C1343d {
    /* JADX INFO: renamed from: a */
    public static boolean m7092a() {
        return System.currentTimeMillis() >= C1394k.m7327a("sso_config_xf", "client_valid", 0L);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7096b(boolean z) {
        return "1".equals(C1394k.m7329a("sso_config_xf", "CLOSE_IPV6_LIST", !z ? "0" : "1"));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7098c(boolean z) {
        String str = !z ? "0" : "1";
        return "1".equals(C1394k.m7329a("sso_config_xf", "CLOSE_M008_APPID_LIST", str)) || "1".equals(C1394k.m7329a("sso_config_xf", "CLOSE_M008_SDKVERSION_LIST", str));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7099d(boolean z) {
        return C1394k.m7329a("sso_config_xf", "CLOSE_FRIEND_WAPKS", z ? "CU" : "").contains("CU");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m7100e(boolean z) {
        return C1394k.m7329a("sso_config_xf", "CLOSE_FRIEND_WAPKS", z ? "CT" : "").contains("CT");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7101f(boolean z) {
        return "1".equals(C1394k.m7329a("sso_config_xf", "CLOSE_LOGS_VERSION", z ? "1" : "0"));
    }

    /* JADX INFO: renamed from: b */
    public static String m7095b(String str) {
        String strM7329a = C1394k.m7329a("sso_config_xf", "https_get_phone_scrip_host", (String) null);
        return TextUtils.isEmpty(strM7329a) ? str : strM7329a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7093a(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        return "1".equals(C1394k.m7329a("sso_config_xf", "CLOSE_IPV4_LIST", str));
    }

    /* JADX INFO: renamed from: b */
    public static int m7094b(int i) {
        return C1394k.m7325a("sso_config_xf", "pauseTime", i);
    }

    /* JADX INFO: renamed from: a */
    public static String m7091a(String str) {
        String strM7329a = C1394k.m7329a("sso_config_xf", "config_host", (String) null);
        return TextUtils.isEmpty(strM7329a) ? str : strM7329a;
    }

    /* JADX INFO: renamed from: a */
    public static int m7090a(int i) {
        return C1394k.m7325a("sso_config_xf", "maxFailedLogTimes", i);
    }

    /* JADX INFO: renamed from: c */
    public static String m7097c(String str) {
        String strM7329a = C1394k.m7329a("sso_config_xf", "logHost", "");
        return TextUtils.isEmpty(strM7329a) ? str : strM7329a;
    }
}
