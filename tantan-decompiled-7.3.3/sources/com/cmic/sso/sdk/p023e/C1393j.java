package com.cmic.sso.sdk.p023e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.p016b.C1357a;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.j */
/* JADX INFO: loaded from: classes.dex */
public class C1393j {

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    private static C1393j f5747b;

    /* JADX INFO: renamed from: a */
    private final Context f5748a;

    private C1393j(Context context) {
        this.f5748a = context;
    }

    /* JADX INFO: renamed from: b */
    private String m7319b(String str) {
        str.getClass();
        switch (str) {
            case "46000":
            case "46002":
            case "46004":
            case "46007":
                C1386c.m7286a("SIMUtils", "中国移动");
                return "1";
            case "46001":
            case "46006":
            case "46009":
                C1386c.m7286a("SIMUtils", "中国联通");
                return "2";
            case "46003":
            case "46005":
            case "46011":
                C1386c.m7286a("SIMUtils", "中国电信");
                return "3";
            default:
                return "0";
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7321a(C1339a c1339a) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f5748a.getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperator = telephonyManager.getNetworkOperator();
            C1386c.m7288b("SIMUtils", "NetworkOperator= " + networkOperator);
            c1339a.m7015a("networkOperator", m7319b(networkOperator));
        }
    }

    /* JADX INFO: renamed from: c */
    public String m7323c() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f5748a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        String simOperator = telephonyManager.getSimOperator();
        C1386c.m7288b("SIMUtils", "SysOperator= " + simOperator);
        return simOperator;
    }

    /* JADX INFO: renamed from: a */
    public static C1393j m7317a() {
        return f5747b;
    }

    /* JADX INFO: renamed from: a */
    public String m7320a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m7323c();
        }
        return m7319b(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m7318a(Context context) {
        f5747b = new C1393j(context);
    }

    /* JADX INFO: renamed from: b */
    public String m7322b() {
        try {
            int iM7137a = C1357a.m7128a().m7132b().m7137a();
            if (iM7137a >= 0) {
                return Integer.toString(iM7137a);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
