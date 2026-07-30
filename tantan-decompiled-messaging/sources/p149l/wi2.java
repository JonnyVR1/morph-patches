package p149l;

import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class wi2 {

    /* JADX INFO: renamed from: a */
    public static String f186497a;

    /* JADX INFO: renamed from: a */
    public static String m203270a() {
        String str = Build.BRAND;
        return TextUtils.isEmpty(str) ? "unknown" : str;
    }

    /* JADX INFO: renamed from: b */
    public static String m203271b() {
        if (!TextUtils.isEmpty(f186497a)) {
            return f186497a;
        }
        String str = Build.MODEL;
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return m203275f(str) ? m203274e(str) : str;
    }

    /* JADX INFO: renamed from: c */
    public static String m203272c() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: d */
    public static String m203273d() {
        TelephonyManager telephonyManager = (TelephonyManager) ev0.m118233a().getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimOperator() : "";
    }

    /* JADX INFO: renamed from: e */
    private static String m203274e(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return "momo";
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m203275f(String str) {
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
