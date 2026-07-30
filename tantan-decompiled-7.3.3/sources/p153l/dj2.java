package p153l;

import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class dj2 {

    /* JADX INFO: renamed from: a */
    public static String f88773a;

    /* JADX INFO: renamed from: a */
    public static String m116017a() {
        String str = Build.BRAND;
        return TextUtils.isEmpty(str) ? "unknown" : str;
    }

    /* JADX INFO: renamed from: b */
    public static String m116018b() {
        if (!TextUtils.isEmpty(f88773a)) {
            return f88773a;
        }
        String str = Build.MODEL;
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return m116022f(str) ? m116021e(str) : str;
    }

    /* JADX INFO: renamed from: c */
    public static String m116019c() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: d */
    public static String m116020d() {
        TelephonyManager telephonyManager = (TelephonyManager) jv0.m147001a().getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimOperator() : "";
    }

    /* JADX INFO: renamed from: e */
    private static String m116021e(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return "momo";
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m116022f(String str) {
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
