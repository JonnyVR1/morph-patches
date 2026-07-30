package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.core.data.Reason;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class hxq0 {

    /* JADX INFO: renamed from: a */
    private static int f112031a;

    /* JADX INFO: renamed from: l.hxq0$a */
    public static class RunnableC17591a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f112032a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f112033b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f112034c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ long f112035d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f112036e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ long f112037f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f112038g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ String f112039h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ int f112040i;

        public RunnableC17591a(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
            this.f112032a = context;
            this.f112033b = str;
            this.f112034c = z;
            this.f112035d = j;
            this.f112036e = i;
            this.f112037f = j2;
            this.f112038g = i2;
            this.f112039h = str2;
            this.f112040i = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                hxq0.m137649q(this.f112032a, this.f112033b, this.f112034c, this.f112035d, this.f112036e, this.f112037f, this.f112038g, this.f112039h, this.f112040i);
            } catch (Exception e) {
                ouq0.m169393m("DisconnectStatsSP onDisconnection exception: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: l.hxq0$b */
    public static class RunnableC17592b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f112041a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f112042b;

        public RunnableC17592b(Context context, long j) {
            this.f112041a = context;
            this.f112042b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                hxq0.m137648p(this.f112041a, this.f112042b);
            } catch (Exception e) {
                ouq0.m169393m("DisconnectStatsSP onReconnection exception: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m137633a(Context context) {
        if (f112031a <= 0) {
            f112031a = l4r0.m152827l(context);
        }
        return f112031a;
    }

    /* JADX INFO: renamed from: c */
    private static SharedPreferences m137635c(Context context) {
        return context.getSharedPreferences("sp_disconnect_stats", 0);
    }

    /* JADX INFO: renamed from: d */
    private static String m137636d(String str, int i) {
        return m137638f(str, String.valueOf(i));
    }

    /* JADX INFO: renamed from: e */
    private static String m137637e(String str, long j) {
        return m137638f(str, String.valueOf(j));
    }

    /* JADX INFO: renamed from: f */
    private static String m137638f(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            str2 = "null";
        }
        if (str == null || str.length() <= 0) {
            return str2;
        }
        return str + Constants.PACKNAME_END + str2;
    }

    /* JADX INFO: renamed from: g */
    private static List<fxq0> m137639g(Context context) {
        SharedPreferences sharedPreferencesM137635c = m137635c(context);
        String[] strArrM137644l = m137644l(sharedPreferencesM137635c.getString("host", null));
        if (strArrM137644l == null || strArrM137644l.length <= 0) {
            ouq0.m169393m("DisconnectStatsSP Cached hosts data is empty,drop.");
            return null;
        }
        String[] strArrM137644l2 = m137644l(sharedPreferencesM137635c.getString("network_state", null));
        String[] strArrM137644l3 = m137644l(sharedPreferencesM137635c.getString(Reason.TYPE, null));
        String[] strArrM137644l4 = m137644l(sharedPreferencesM137635c.getString("ping_interval", null));
        String[] strArrM137644l5 = m137644l(sharedPreferencesM137635c.getString("network_type", null));
        String[] strArrM137644l6 = m137644l(sharedPreferencesM137635c.getString("wifi_digest", null));
        String[] strArrM137644l7 = m137644l(sharedPreferencesM137635c.getString("connected_network_type", null));
        String[] strArrM137644l8 = m137644l(sharedPreferencesM137635c.getString("disconnect_time", null));
        String[] strArrM137644l9 = m137644l(sharedPreferencesM137635c.getString("connected_time", null));
        String[] strArrM137644l10 = m137644l(sharedPreferencesM137635c.getString("xmsf_vc", null));
        String[] strArrM137644l11 = m137644l(sharedPreferencesM137635c.getString("android_vc", null));
        if (strArrM137644l2 == null || strArrM137644l3 == null || strArrM137644l4 == null || strArrM137644l5 == null || strArrM137644l6 == null || strArrM137644l7 == null || strArrM137644l8 == null || strArrM137644l9 == null || strArrM137644l10 == null || strArrM137644l11 == null || strArrM137644l.length != strArrM137644l2.length || strArrM137644l.length != strArrM137644l3.length || strArrM137644l.length != strArrM137644l4.length || strArrM137644l.length != strArrM137644l5.length || strArrM137644l.length != strArrM137644l6.length || strArrM137644l.length != strArrM137644l7.length || strArrM137644l.length != strArrM137644l8.length || strArrM137644l.length != strArrM137644l9.length || strArrM137644l.length != strArrM137644l10.length || strArrM137644l.length != strArrM137644l11.length) {
            ouq0.m169393m("DisconnectStatsSP Cached data incorrect,drop.");
            return null;
        }
        ArrayList arrayList = new ArrayList(strArrM137644l.length);
        int i = 0;
        while (i < strArrM137644l.length) {
            fxq0 fxq0Var = new fxq0();
            fxq0Var.m127999d(1);
            fxq0Var.m128001f(strArrM137644l[i]);
            fxq0Var.m128005j(w5r0.m204982a(strArrM137644l2[i], -1));
            fxq0Var.m128010o(w5r0.m204982a(strArrM137644l3[i], -1));
            String[] strArr = strArrM137644l11;
            String[] strArr2 = strArrM137644l2;
            fxq0Var.m128000e(w5r0.m204983b(strArrM137644l4[i], -1L));
            fxq0Var.m128014s(w5r0.m204982a(strArrM137644l5[i], -1));
            fxq0Var.m128007l(strArrM137644l6[i]);
            fxq0Var.m128017v(w5r0.m204982a(strArrM137644l7[i], -1));
            long jM204983b = w5r0.m204983b(strArrM137644l8[i], -1L);
            long jM204983b2 = w5r0.m204983b(strArrM137644l9[i], -1L);
            fxq0Var.m128006k(jM204983b2 - jM204983b);
            fxq0Var.m128011p(jM204983b);
            fxq0Var.m128015t(jM204983b2);
            fxq0Var.m128019x(w5r0.m204982a(strArrM137644l10[i], -1));
            fxq0Var.m128021z(w5r0.m204982a(strArr[i], -1));
            arrayList.add(fxq0Var);
            i++;
            strArrM137644l = strArrM137644l;
            strArrM137644l4 = strArrM137644l4;
            strArrM137644l11 = strArr;
            strArrM137644l2 = strArr2;
            strArrM137644l3 = strArrM137644l3;
            strArrM137644l5 = strArrM137644l5;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    private static void m137640h(Context context) {
        exq0.m123093g("upload");
        new gxq0().m132922a(context, m137639g(context));
        m137645m(context);
    }

    /* JADX INFO: renamed from: i */
    public static void m137641i(Context context, long j) {
        tsq0.m192627f(context).m192628g(new RunnableC17592b(context, j));
    }

    /* JADX INFO: renamed from: j */
    private static void m137642j(Context context, String str, int i, long j, int i2, long j2, int i3, String str2, int i4) {
        exq0.m123093g(String.format(Locale.US, "recordDisconnectInfo host=%s, netState=%d, currentTimeMillis=%d, reason=%d, pingInterval=%d, netType=%d, wifiDigest=%s, connectedNetType=%d", str, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2), Integer.valueOf(i3), str2, Integer.valueOf(i4)));
        SharedPreferences sharedPreferencesM137635c = m137635c(context);
        String string = sharedPreferencesM137635c.getString("host", null);
        String string2 = sharedPreferencesM137635c.getString("network_state", null);
        String string3 = sharedPreferencesM137635c.getString(Reason.TYPE, null);
        String string4 = sharedPreferencesM137635c.getString("ping_interval", null);
        String string5 = sharedPreferencesM137635c.getString("network_type", null);
        String string6 = sharedPreferencesM137635c.getString("wifi_digest", null);
        String string7 = sharedPreferencesM137635c.getString("connected_network_type", null);
        String string8 = sharedPreferencesM137635c.getString("disconnect_time", null);
        String string9 = sharedPreferencesM137635c.getString("xmsf_vc", null);
        String string10 = sharedPreferencesM137635c.getString("android_vc", null);
        String strM137638f = m137638f(string, str);
        String strM137636d = m137636d(string2, i);
        String strM137636d2 = m137636d(string3, i2);
        String strM137637e = m137637e(string4, j2);
        String strM137636d3 = m137636d(string5, i3);
        String strM137638f2 = m137638f(string6, str2);
        String strM137636d4 = m137636d(string7, i4);
        String strM137637e2 = m137637e(string8, j);
        String strM137636d5 = m137636d(string9, m137633a(context));
        sharedPreferencesM137635c.edit().putString("host", strM137638f).putString("network_state", strM137636d).putString(Reason.TYPE, strM137636d2).putString("ping_interval", strM137637e).putString("network_type", strM137636d3).putString("wifi_digest", strM137638f2).putString("connected_network_type", strM137636d4).putString("disconnect_time", strM137637e2).putString("xmsf_vc", strM137636d5).putString("android_vc", m137636d(string10, Build.VERSION.SDK_INT)).apply();
    }

    /* JADX INFO: renamed from: k */
    public static void m137643k(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        tsq0.m192627f(context).m192628g(new RunnableC17591a(context, str, z, j, i, j2, i2, str2, i3));
    }

    /* JADX INFO: renamed from: l */
    private static String[] m137644l(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.split(Constants.PACKNAME_END);
    }

    /* JADX INFO: renamed from: m */
    private static void m137645m(Context context) {
        exq0.m123093g("resetAfterUpload");
        m137635c(context).edit().putString("host", null).putString("network_state", null).putString(Reason.TYPE, null).putString("ping_interval", null).putString("network_type", null).putString("wifi_digest", null).putString("connected_network_type", null).putString("disconnect_time", null).putString("connected_time", null).putLong("last_discnt_time", 0L).putInt("discnt_count", 0).putInt("cnt_count", 0).putString("xmsf_vc", null).putString("android_vc", null).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static synchronized void m137648p(Context context, long j) {
        SharedPreferences sharedPreferencesM137635c = m137635c(context);
        long j2 = sharedPreferencesM137635c.getLong("start_time_for_day", 0L);
        if (j2 == 0) {
            sharedPreferencesM137635c.edit().putLong("start_time_for_day", j).putLong("last_discnt_time", 0L).putInt("discnt_count_in_day", 0).putInt("discnt_count", 0).putInt("cnt_count", 0).apply();
            return;
        }
        int i = sharedPreferencesM137635c.getInt("discnt_count", 0);
        int i2 = sharedPreferencesM137635c.getInt("cnt_count", 0);
        if (i > i2) {
            sharedPreferencesM137635c.edit().putInt("cnt_count", i2 + 1).putString("connected_time", m137637e(sharedPreferencesM137635c.getString("connected_time", null), j)).apply();
        }
        if (j - j2 >= 86400000) {
            sharedPreferencesM137635c.edit().putLong("start_time_for_day", j).putInt("discnt_count_in_day", 0).apply();
            m137640h(context);
        } else if (i >= 10) {
            m137640h(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static synchronized void m137649q(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        SharedPreferences sharedPreferencesM137635c = m137635c(context);
        long j3 = sharedPreferencesM137635c.getLong("start_time_for_day", 0L);
        if (j3 == 0) {
            exq0.m123093g("recordDisconnection not initialized");
            return;
        }
        if (j - sharedPreferencesM137635c.getLong("last_discnt_time", 0L) < com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS) {
            exq0.m123093g("recordDisconnection anti-shake");
            return;
        }
        if (j - j3 < 86400000) {
            int i4 = sharedPreferencesM137635c.getInt("discnt_count_in_day", 0);
            if (i4 > 100) {
                exq0.m123093g("recordDisconnection count > 100 in 24H cycle,abandon.");
                return;
            } else {
                sharedPreferencesM137635c.edit().putInt("discnt_count_in_day", i4 + 1).apply();
            }
        } else {
            exq0.m123093g("recordDisconnection with the current time exceeds 24H cycle, go on.");
        }
        int i5 = sharedPreferencesM137635c.getInt("discnt_count", 0);
        if (i5 == sharedPreferencesM137635c.getInt("cnt_count", 0)) {
            m137642j(context, str, m137634b(z), j, i, j2, i2, str2, i3);
            sharedPreferencesM137635c.edit().putLong("last_discnt_time", j).putInt("discnt_count", i5 + 1).apply();
        }
        exq0.m123093g("recordDisconnection complete");
    }

    /* JADX INFO: renamed from: b */
    private static int m137634b(boolean z) {
        return z ? 1 : 0;
    }
}
