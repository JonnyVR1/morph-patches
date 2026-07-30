package com.cmic.sso.sdk.p022e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.p015b.C1334a;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.j */
/* JADX INFO: loaded from: classes.dex */
public class C1370j {

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    private static C1370j f5710b;

    /* JADX INFO: renamed from: a */
    private final Context f5711a;

    private C1370j(Context context) {
        this.f5711a = context;
    }

    /* JADX INFO: renamed from: b */
    private String m7265b(String str) {
        str.getClass();
        switch (str) {
            case "46000":
            case "46002":
            case "46004":
            case "46007":
                C1363c.m7232a("SIMUtils", "中国移动");
                return "1";
            case "46001":
            case "46006":
            case "46009":
                C1363c.m7232a("SIMUtils", "中国联通");
                return "2";
            case "46003":
            case "46005":
            case "46011":
                C1363c.m7232a("SIMUtils", "中国电信");
                return "3";
            default:
                return "0";
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7267a(C1316a c1316a) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f5711a.getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperator = telephonyManager.getNetworkOperator();
            C1363c.m7234b("SIMUtils", "NetworkOperator= " + networkOperator);
            c1316a.m6961a("networkOperator", m7265b(networkOperator));
        }
    }

    /* JADX INFO: renamed from: c */
    public String m7269c() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f5711a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        String simOperator = telephonyManager.getSimOperator();
        C1363c.m7234b("SIMUtils", "SysOperator= " + simOperator);
        return simOperator;
    }

    /* JADX INFO: renamed from: a */
    public static C1370j m7263a() {
        return f5710b;
    }

    /* JADX INFO: renamed from: a */
    public String m7266a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m7269c();
        }
        return m7265b(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m7264a(Context context) {
        f5710b = new C1370j(context);
    }

    /* JADX INFO: renamed from: b */
    public String m7268b() {
        try {
            int iM7083a = C1334a.m7074a().m7078b().m7083a();
            if (iM7083a >= 0) {
                return Integer.toString(iM7083a);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
