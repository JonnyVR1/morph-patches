package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.service.C14871m;

/* JADX INFO: loaded from: classes2.dex */
public class ynq0 {

    /* JADX INFO: renamed from: a */
    private static coq0 f199201a = null;

    /* JADX INFO: renamed from: b */
    private static int f199202b = -1;

    /* JADX INFO: renamed from: c */
    private static String f199203c;

    /* JADX INFO: renamed from: a */
    private static int m215428a(Context context) {
        String str;
        try {
            hkq0 hkq0VarM126687p = gkq0.m126687p();
            if (hkq0VarM126687p == null) {
                m215437j(null);
                return -1;
            }
            if (hkq0VarM126687p.m131578a() != 0) {
                if (hkq0VarM126687p.m131578a() != 1 && hkq0VarM126687p.m131578a() != 6) {
                    m215437j(null);
                    return -1;
                }
                m215437j("WIFI-ID-UNKNOWN");
                return 1;
            }
            String strM131584h = hkq0VarM126687p.m131584h();
            if (TextUtils.isEmpty(strM131584h) || "UNKNOWN".equalsIgnoreCase(strM131584h)) {
                str = null;
            } else {
                str = "M-" + strM131584h;
            }
            m215437j(str);
            return 0;
        } catch (Exception e) {
            ilq0.m137025B("DisconnectStatsHelper getNetType occurred error: " + e.getMessage());
            m215437j(null);
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    private static synchronized String m215429b() {
        return f199203c;
    }

    /* JADX INFO: renamed from: c */
    public static void m215430c(Context context) {
        if (!m215435h(context)) {
            m215434g("onReconnection shouldSampling = false");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        f199202b = m215428a(context);
        boq0.m102972i(context, jCurrentTimeMillis);
        m215434g("onReconnection connectedNetworkType = " + f199202b);
    }

    /* JADX INFO: renamed from: d */
    public static void m215431d(Context context, String str) {
        if (!m215435h(context)) {
            m215434g("onWifiChanged shouldSampling = false");
            return;
        }
        m215434g("onWifiChanged wifiDigest = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m215437j("W-" + str);
    }

    /* JADX INFO: renamed from: e */
    public static void m215432e(Context context, String str, int i) {
        if (!m215435h(context)) {
            m215434g("onDisconnection shouldSampling = false");
            return;
        }
        boq0.m102974k(context, str, gkq0.m126693v(context), System.currentTimeMillis(), i, C14871m.m86681a(context).m86705b(), m215428a(context), m215429b(), f199202b);
        m215434g("onDisconnection");
    }

    /* JADX INFO: renamed from: f */
    public static void m215433f(Context context, osq0 osq0Var) {
        if (m215435h(context)) {
            if (f199201a == null) {
                f199201a = new coq0(context);
            }
            osq0Var.m165891l(f199201a);
            m215434g("startStats");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m215434g(String str) {
        vnq0.m199050b("Push-DiscntStats", str);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m215435h(Context context) {
        return vnq0.m199051c(context);
    }

    /* JADX INFO: renamed from: i */
    public static void m215436i(Context context, osq0 osq0Var) {
        coq0 coq0Var = f199201a;
        if (coq0Var != null) {
            osq0Var.m165903x(coq0Var);
            f199201a = null;
            m215434g("stopStats");
        }
    }

    /* JADX INFO: renamed from: j */
    private static synchronized void m215437j(String str) {
        try {
            if ("WIFI-ID-UNKNOWN".equals(str)) {
                String str2 = f199203c;
                if (str2 == null || !str2.startsWith("W-")) {
                    f199203c = null;
                }
            } else {
                f199203c = str;
            }
            m215434g("updateNetId new networkId = " + str + ", finally netId = " + f199203c);
        } catch (Throwable th) {
            throw th;
        }
    }
}
