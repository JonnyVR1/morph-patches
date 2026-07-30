package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.core.data.Reason;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class boq0 {

    /* JADX INFO: renamed from: a */
    private static int f76542a;

    /* JADX INFO: renamed from: l.boq0$a */
    public static class RunnableC15918a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f76543a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f76544b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f76545c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ long f76546d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f76547e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ long f76548f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f76549g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ String f76550h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ int f76551i;

        public RunnableC15918a(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
            this.f76543a = context;
            this.f76544b = str;
            this.f76545c = z;
            this.f76546d = j;
            this.f76547e = i;
            this.f76548f = j2;
            this.f76549g = i2;
            this.f76550h = str2;
            this.f76551i = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boq0.m102980q(this.f76543a, this.f76544b, this.f76545c, this.f76546d, this.f76547e, this.f76548f, this.f76549g, this.f76550h, this.f76551i);
            } catch (Exception e) {
                ilq0.m137040m("DisconnectStatsSP onDisconnection exception: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: l.boq0$b */
    public static class RunnableC15919b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f76552a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f76553b;

        public RunnableC15919b(Context context, long j) {
            this.f76552a = context;
            this.f76553b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boq0.m102979p(this.f76552a, this.f76553b);
            } catch (Exception e) {
                ilq0.m137040m("DisconnectStatsSP onReconnection exception: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m102964a(Context context) {
        if (f76542a <= 0) {
            f76542a = fvq0.m123358l(context);
        }
        return f76542a;
    }

    /* JADX INFO: renamed from: c */
    private static SharedPreferences m102966c(Context context) {
        return context.getSharedPreferences("sp_disconnect_stats", 0);
    }

    /* JADX INFO: renamed from: d */
    private static String m102967d(String str, int i) {
        return m102969f(str, String.valueOf(i));
    }

    /* JADX INFO: renamed from: e */
    private static String m102968e(String str, long j) {
        return m102969f(str, String.valueOf(j));
    }

    /* JADX INFO: renamed from: f */
    private static String m102969f(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            str2 = "null";
        }
        if (str == null || str.length() <= 0) {
            return str2;
        }
        return str + Constants.PACKNAME_END + str2;
    }

    /* JADX INFO: renamed from: g */
    private static List<znq0> m102970g(Context context) {
        SharedPreferences sharedPreferencesM102966c = m102966c(context);
        String[] strArrM102975l = m102975l(sharedPreferencesM102966c.getString("host", null));
        if (strArrM102975l == null || strArrM102975l.length <= 0) {
            ilq0.m137040m("DisconnectStatsSP Cached hosts data is empty,drop.");
            return null;
        }
        String[] strArrM102975l2 = m102975l(sharedPreferencesM102966c.getString("network_state", null));
        String[] strArrM102975l3 = m102975l(sharedPreferencesM102966c.getString(Reason.TYPE, null));
        String[] strArrM102975l4 = m102975l(sharedPreferencesM102966c.getString("ping_interval", null));
        String[] strArrM102975l5 = m102975l(sharedPreferencesM102966c.getString("network_type", null));
        String[] strArrM102975l6 = m102975l(sharedPreferencesM102966c.getString("wifi_digest", null));
        String[] strArrM102975l7 = m102975l(sharedPreferencesM102966c.getString("connected_network_type", null));
        String[] strArrM102975l8 = m102975l(sharedPreferencesM102966c.getString("disconnect_time", null));
        String[] strArrM102975l9 = m102975l(sharedPreferencesM102966c.getString("connected_time", null));
        String[] strArrM102975l10 = m102975l(sharedPreferencesM102966c.getString("xmsf_vc", null));
        String[] strArrM102975l11 = m102975l(sharedPreferencesM102966c.getString("android_vc", null));
        if (strArrM102975l2 == null || strArrM102975l3 == null || strArrM102975l4 == null || strArrM102975l5 == null || strArrM102975l6 == null || strArrM102975l7 == null || strArrM102975l8 == null || strArrM102975l9 == null || strArrM102975l10 == null || strArrM102975l11 == null || strArrM102975l.length != strArrM102975l2.length || strArrM102975l.length != strArrM102975l3.length || strArrM102975l.length != strArrM102975l4.length || strArrM102975l.length != strArrM102975l5.length || strArrM102975l.length != strArrM102975l6.length || strArrM102975l.length != strArrM102975l7.length || strArrM102975l.length != strArrM102975l8.length || strArrM102975l.length != strArrM102975l9.length || strArrM102975l.length != strArrM102975l10.length || strArrM102975l.length != strArrM102975l11.length) {
            ilq0.m137040m("DisconnectStatsSP Cached data incorrect,drop.");
            return null;
        }
        ArrayList arrayList = new ArrayList(strArrM102975l.length);
        int i = 0;
        while (i < strArrM102975l.length) {
            znq0 znq0Var = new znq0();
            znq0Var.m219464d(1);
            znq0Var.m219466f(strArrM102975l[i]);
            znq0Var.m219470j(qwq0.m176890a(strArrM102975l2[i], -1));
            znq0Var.m219475o(qwq0.m176890a(strArrM102975l3[i], -1));
            String[] strArr = strArrM102975l11;
            String[] strArr2 = strArrM102975l2;
            znq0Var.m219465e(qwq0.m176891b(strArrM102975l4[i], -1L));
            znq0Var.m219479s(qwq0.m176890a(strArrM102975l5[i], -1));
            znq0Var.m219472l(strArrM102975l6[i]);
            znq0Var.m219482v(qwq0.m176890a(strArrM102975l7[i], -1));
            long jM176891b = qwq0.m176891b(strArrM102975l8[i], -1L);
            long jM176891b2 = qwq0.m176891b(strArrM102975l9[i], -1L);
            znq0Var.m219471k(jM176891b2 - jM176891b);
            znq0Var.m219476p(jM176891b);
            znq0Var.m219480t(jM176891b2);
            znq0Var.m219484x(qwq0.m176890a(strArrM102975l10[i], -1));
            znq0Var.m219486z(qwq0.m176890a(strArr[i], -1));
            arrayList.add(znq0Var);
            i++;
            strArrM102975l = strArrM102975l;
            strArrM102975l4 = strArrM102975l4;
            strArrM102975l11 = strArr;
            strArrM102975l2 = strArr2;
            strArrM102975l3 = strArrM102975l3;
            strArrM102975l5 = strArrM102975l5;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    private static void m102971h(Context context) {
        ynq0.m215434g("upload");
        new aoq0().m97933a(context, m102970g(context));
        m102976m(context);
    }

    /* JADX INFO: renamed from: i */
    public static void m102972i(Context context, long j) {
        njq0.m159772f(context).m159773g(new RunnableC15919b(context, j));
    }

    /* JADX INFO: renamed from: j */
    private static void m102973j(Context context, String str, int i, long j, int i2, long j2, int i3, String str2, int i4) {
        ynq0.m215434g(String.format(Locale.US, "recordDisconnectInfo host=%s, netState=%d, currentTimeMillis=%d, reason=%d, pingInterval=%d, netType=%d, wifiDigest=%s, connectedNetType=%d", str, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2), Integer.valueOf(i3), str2, Integer.valueOf(i4)));
        SharedPreferences sharedPreferencesM102966c = m102966c(context);
        String string = sharedPreferencesM102966c.getString("host", null);
        String string2 = sharedPreferencesM102966c.getString("network_state", null);
        String string3 = sharedPreferencesM102966c.getString(Reason.TYPE, null);
        String string4 = sharedPreferencesM102966c.getString("ping_interval", null);
        String string5 = sharedPreferencesM102966c.getString("network_type", null);
        String string6 = sharedPreferencesM102966c.getString("wifi_digest", null);
        String string7 = sharedPreferencesM102966c.getString("connected_network_type", null);
        String string8 = sharedPreferencesM102966c.getString("disconnect_time", null);
        String string9 = sharedPreferencesM102966c.getString("xmsf_vc", null);
        String string10 = sharedPreferencesM102966c.getString("android_vc", null);
        String strM102969f = m102969f(string, str);
        String strM102967d = m102967d(string2, i);
        String strM102967d2 = m102967d(string3, i2);
        String strM102968e = m102968e(string4, j2);
        String strM102967d3 = m102967d(string5, i3);
        String strM102969f2 = m102969f(string6, str2);
        String strM102967d4 = m102967d(string7, i4);
        String strM102968e2 = m102968e(string8, j);
        String strM102967d5 = m102967d(string9, m102964a(context));
        sharedPreferencesM102966c.edit().putString("host", strM102969f).putString("network_state", strM102967d).putString(Reason.TYPE, strM102967d2).putString("ping_interval", strM102968e).putString("network_type", strM102967d3).putString("wifi_digest", strM102969f2).putString("connected_network_type", strM102967d4).putString("disconnect_time", strM102968e2).putString("xmsf_vc", strM102967d5).putString("android_vc", m102967d(string10, Build.VERSION.SDK_INT)).apply();
    }

    /* JADX INFO: renamed from: k */
    public static void m102974k(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        njq0.m159772f(context).m159773g(new RunnableC15918a(context, str, z, j, i, j2, i2, str2, i3));
    }

    /* JADX INFO: renamed from: l */
    private static String[] m102975l(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.split(Constants.PACKNAME_END);
    }

    /* JADX INFO: renamed from: m */
    private static void m102976m(Context context) {
        ynq0.m215434g("resetAfterUpload");
        m102966c(context).edit().putString("host", null).putString("network_state", null).putString(Reason.TYPE, null).putString("ping_interval", null).putString("network_type", null).putString("wifi_digest", null).putString("connected_network_type", null).putString("disconnect_time", null).putString("connected_time", null).putLong("last_discnt_time", 0L).putInt("discnt_count", 0).putInt("cnt_count", 0).putString("xmsf_vc", null).putString("android_vc", null).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static synchronized void m102979p(Context context, long j) {
        SharedPreferences sharedPreferencesM102966c = m102966c(context);
        long j2 = sharedPreferencesM102966c.getLong("start_time_for_day", 0L);
        if (j2 == 0) {
            sharedPreferencesM102966c.edit().putLong("start_time_for_day", j).putLong("last_discnt_time", 0L).putInt("discnt_count_in_day", 0).putInt("discnt_count", 0).putInt("cnt_count", 0).apply();
            return;
        }
        int i = sharedPreferencesM102966c.getInt("discnt_count", 0);
        int i2 = sharedPreferencesM102966c.getInt("cnt_count", 0);
        if (i > i2) {
            sharedPreferencesM102966c.edit().putInt("cnt_count", i2 + 1).putString("connected_time", m102968e(sharedPreferencesM102966c.getString("connected_time", null), j)).apply();
        }
        if (j - j2 >= 86400000) {
            sharedPreferencesM102966c.edit().putLong("start_time_for_day", j).putInt("discnt_count_in_day", 0).apply();
            m102971h(context);
        } else if (i >= 10) {
            m102971h(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static synchronized void m102980q(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        SharedPreferences sharedPreferencesM102966c = m102966c(context);
        long j3 = sharedPreferencesM102966c.getLong("start_time_for_day", 0L);
        if (j3 == 0) {
            ynq0.m215434g("recordDisconnection not initialized");
            return;
        }
        if (j - sharedPreferencesM102966c.getLong("last_discnt_time", 0L) < com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS) {
            ynq0.m215434g("recordDisconnection anti-shake");
            return;
        }
        if (j - j3 < 86400000) {
            int i4 = sharedPreferencesM102966c.getInt("discnt_count_in_day", 0);
            if (i4 > 100) {
                ynq0.m215434g("recordDisconnection count > 100 in 24H cycle,abandon.");
                return;
            } else {
                sharedPreferencesM102966c.edit().putInt("discnt_count_in_day", i4 + 1).apply();
            }
        } else {
            ynq0.m215434g("recordDisconnection with the current time exceeds 24H cycle, go on.");
        }
        int i5 = sharedPreferencesM102966c.getInt("discnt_count", 0);
        if (i5 == sharedPreferencesM102966c.getInt("cnt_count", 0)) {
            m102973j(context, str, m102965b(z), j, i, j2, i2, str2, i3);
            sharedPreferencesM102966c.edit().putLong("last_discnt_time", j).putInt("discnt_count", i5 + 1).apply();
        }
        ynq0.m215434g("recordDisconnection complete");
    }

    /* JADX INFO: renamed from: b */
    private static int m102965b(boolean z) {
        return z ? 1 : 0;
    }
}
