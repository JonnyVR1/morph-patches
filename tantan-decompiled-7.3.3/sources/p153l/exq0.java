package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.service.C15019m;

/* JADX INFO: loaded from: classes2.dex */
public class exq0 {

    /* JADX INFO: renamed from: a */
    private static ixq0 f96323a = null;

    /* JADX INFO: renamed from: b */
    private static int f96324b = -1;

    /* JADX INFO: renamed from: c */
    private static String f96325c;

    /* JADX INFO: renamed from: a */
    private static int m123087a(Context context) {
        String str;
        try {
            ntq0 ntq0VarM160040p = mtq0.m160040p();
            if (ntq0VarM160040p == null) {
                m123096j(null);
                return -1;
            }
            if (ntq0VarM160040p.m164750a() != 0) {
                if (ntq0VarM160040p.m164750a() != 1 && ntq0VarM160040p.m164750a() != 6) {
                    m123096j(null);
                    return -1;
                }
                m123096j("WIFI-ID-UNKNOWN");
                return 1;
            }
            String strM164756h = ntq0VarM160040p.m164756h();
            if (TextUtils.isEmpty(strM164756h) || "UNKNOWN".equalsIgnoreCase(strM164756h)) {
                str = null;
            } else {
                str = "M-" + strM164756h;
            }
            m123096j(str);
            return 0;
        } catch (Exception e) {
            ouq0.m169378B("DisconnectStatsHelper getNetType occurred error: " + e.getMessage());
            m123096j(null);
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    private static synchronized String m123088b() {
        return f96325c;
    }

    /* JADX INFO: renamed from: c */
    public static void m123089c(Context context) {
        if (!m123094h(context)) {
            m123093g("onReconnection shouldSampling = false");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        f96324b = m123087a(context);
        hxq0.m137641i(context, jCurrentTimeMillis);
        m123093g("onReconnection connectedNetworkType = " + f96324b);
    }

    /* JADX INFO: renamed from: d */
    public static void m123090d(Context context, String str) {
        if (!m123094h(context)) {
            m123093g("onWifiChanged shouldSampling = false");
            return;
        }
        m123093g("onWifiChanged wifiDigest = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m123096j("W-" + str);
    }

    /* JADX INFO: renamed from: e */
    public static void m123091e(Context context, String str, int i) {
        if (!m123094h(context)) {
            m123093g("onDisconnection shouldSampling = false");
            return;
        }
        hxq0.m137643k(context, str, mtq0.m160046v(context), System.currentTimeMillis(), i, C15019m.m87852a(context).m87876b(), m123087a(context), m123088b(), f96324b);
        m123093g("onDisconnection");
    }

    /* JADX INFO: renamed from: f */
    public static void m123092f(Context context, u1r0 u1r0Var) {
        if (m123094h(context)) {
            if (f96323a == null) {
                f96323a = new ixq0(context);
            }
            u1r0Var.m194101l(f96323a);
            m123093g("startStats");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m123093g(String str) {
        bxq0.m106901b("Push-DiscntStats", str);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m123094h(Context context) {
        return bxq0.m106902c(context);
    }

    /* JADX INFO: renamed from: i */
    public static void m123095i(Context context, u1r0 u1r0Var) {
        ixq0 ixq0Var = f96323a;
        if (ixq0Var != null) {
            u1r0Var.m194108x(ixq0Var);
            f96323a = null;
            m123093g("stopStats");
        }
    }

    /* JADX INFO: renamed from: j */
    private static synchronized void m123096j(String str) {
        try {
            if ("WIFI-ID-UNKNOWN".equals(str)) {
                String str2 = f96325c;
                if (str2 == null || !str2.startsWith("W-")) {
                    f96325c = null;
                }
            } else {
                f96325c = str;
            }
            m123093g("updateNetId new networkId = " + str + ", finally netId = " + f96325c);
        } catch (Throwable th) {
            throw th;
        }
    }
}
