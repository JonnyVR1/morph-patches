package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class nxq0 {

    /* JADX INFO: renamed from: a */
    private static int f144225a = 0;

    /* JADX INFO: renamed from: b */
    private static boolean f144226b = true;

    /* JADX INFO: renamed from: l.nxq0$a */
    public static class RunnableC18986a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f144227a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f144228b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f144229c;

        public RunnableC18986a(Context context, long j, boolean z) {
            this.f144227a = context;
            this.f144228b = j;
            this.f144229c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                nxq0.m165265r(this.f144227a, this.f144228b, this.f144229c);
            } catch (Exception e) {
                ouq0.m169393m("PowerStatsSP onSendMsg exception: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: l.nxq0$b */
    public static class RunnableC18987b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f144230a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f144231b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f144232c;

        public RunnableC18987b(Context context, long j, boolean z) {
            this.f144230a = context;
            this.f144231b = j;
            this.f144232c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                nxq0.m165266s(this.f144230a, this.f144231b, this.f144232c);
            } catch (Exception e) {
                ouq0.m169393m("PowerStatsSP onReceiveMsg exception: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: l.nxq0$c */
    public static class RunnableC18988c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f144233a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f144234b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f144235c;

        public RunnableC18988c(Context context, long j, boolean z) {
            this.f144233a = context;
            this.f144234b = j;
            this.f144235c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                nxq0.m165267t(this.f144233a, this.f144234b, this.f144235c);
            } catch (Exception e) {
                ouq0.m169393m("PowerStatsSP onPing exception: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: l.nxq0$d */
    public static class RunnableC18989d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f144236a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f144237b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f144238c;

        public RunnableC18989d(Context context, long j, boolean z) {
            this.f144236a = context;
            this.f144237b = j;
            this.f144238c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                nxq0.m165268u(this.f144236a, this.f144237b, this.f144238c);
            } catch (Exception e) {
                ouq0.m169393m("PowerStatsSP onPong exception: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m165248a(Context context) {
        if (f144225a <= 0) {
            f144225a = l4r0.m152827l(context);
        }
        return f144225a;
    }

    /* JADX INFO: renamed from: b */
    private static int m165249b(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: renamed from: c */
    private static SharedPreferences m165250c(Context context) {
        return context.getSharedPreferences("sp_power_stats", 0);
    }

    /* JADX INFO: renamed from: d */
    private static lxq0 m165251d(Context context) {
        SharedPreferences sharedPreferencesM165250c = m165250c(context);
        lxq0 lxq0Var = new lxq0();
        lxq0Var.m156211c(sharedPreferencesM165250c.getInt("off_up_count", 0));
        lxq0Var.m156215g(sharedPreferencesM165250c.getInt("off_down_count", 0));
        lxq0Var.m156219k(sharedPreferencesM165250c.getInt("off_ping_count", 0));
        lxq0Var.m156223o(sharedPreferencesM165250c.getInt("off_pong_count", 0));
        lxq0Var.m156212d(sharedPreferencesM165250c.getLong("off_duration", 0L));
        lxq0Var.m156226r(sharedPreferencesM165250c.getInt("on_up_count", 0));
        lxq0Var.m156228t(sharedPreferencesM165250c.getInt("on_down_count", 0));
        lxq0Var.m156230v(sharedPreferencesM165250c.getInt("on_ping_count", 0));
        lxq0Var.m156232x(sharedPreferencesM165250c.getInt("on_pong_count", 0));
        lxq0Var.m156216h(sharedPreferencesM165250c.getLong("on_duration", 0L));
        lxq0Var.m156220l(sharedPreferencesM165250c.getLong("start_time", 0L));
        lxq0Var.m156224p(sharedPreferencesM165250c.getLong("end_time", 0L));
        lxq0Var.m156234z(sharedPreferencesM165250c.getInt("xmsf_vc", 0));
        lxq0Var.m156208B(sharedPreferencesM165250c.getInt("android_vc", 0));
        return lxq0Var;
    }

    /* JADX INFO: renamed from: e */
    private static void m165252e(Context context, long j, int i) {
        kxq0.m151850c("upload");
        new mxq0().m160695a(context, m165251d(context));
        m165257j(context, j, i);
    }

    /* JADX INFO: renamed from: f */
    private static void m165253f(Context context, long j, long j2, int i, int i2) {
        if (j > 0) {
            if (m165256i(context) || i >= 1073741823 || j2 - j >= 86400000) {
                m165250c(context).edit().putLong("end_time", j2).apply();
                m165252e(context, j2, i2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m165254g(Context context, long j, boolean z) {
        tsq0.m192627f(context).m192628g(new RunnableC18986a(context, j, z));
    }

    /* JADX INFO: renamed from: h */
    private static void m165255h(Context context, SharedPreferences sharedPreferences, long j, int i) {
        kxq0.m151850c("recordInit");
        sharedPreferences.edit().putLong("start_time", j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", m165248a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    /* JADX INFO: renamed from: i */
    private static boolean m165256i(Context context) {
        boolean z = false;
        if (f144226b) {
            f144226b = false;
            SharedPreferences sharedPreferencesM165250c = m165250c(context);
            int i = sharedPreferencesM165250c.getInt("xmsf_vc", 0);
            int i2 = sharedPreferencesM165250c.getInt("android_vc", 0);
            if (i != 0 && i2 != 0 && (i != m165248a(context) || i2 != Build.VERSION.SDK_INT)) {
                z = true;
            }
        }
        kxq0.m151850c("isVcChanged = " + z);
        return z;
    }

    /* JADX INFO: renamed from: j */
    private static void m165257j(Context context, long j, int i) {
        kxq0.m151850c("reset");
        m165250c(context).edit().clear().putLong("start_time", j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", m165248a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    /* JADX INFO: renamed from: k */
    public static void m165258k(Context context, long j, boolean z) {
        tsq0.m192627f(context).m192628g(new RunnableC18987b(context, j, z));
    }

    /* JADX INFO: renamed from: l */
    public static void m165259l(Context context, long j, boolean z) {
        tsq0.m192627f(context).m192628g(new RunnableC18988c(context, j, z));
    }

    /* JADX INFO: renamed from: m */
    public static void m165260m(Context context, long j, boolean z) {
        tsq0.m192627f(context).m192628g(new RunnableC18989d(context, j, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static synchronized void m165265r(Context context, long j, boolean z) {
        int i;
        try {
            kxq0.m151850c("recordSendMsg start");
            int iM165249b = m165249b(z);
            SharedPreferences sharedPreferencesM165250c = m165250c(context);
            long j2 = sharedPreferencesM165250c.getLong("start_time", 0L);
            if (j2 <= 0) {
                m165255h(context, sharedPreferencesM165250c, j, iM165249b);
            }
            if (iM165249b == 1) {
                i = sharedPreferencesM165250c.getInt("on_up_count", 0) + 1;
                sharedPreferencesM165250c.edit().putInt("on_up_count", i).apply();
            } else {
                i = sharedPreferencesM165250c.getInt("off_up_count", 0) + 1;
                sharedPreferencesM165250c.edit().putInt("off_up_count", i).apply();
            }
            m165253f(context, j2, j, i, iM165249b);
            kxq0.m151850c("recordSendMsg complete");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static synchronized void m165266s(Context context, long j, boolean z) {
        int i;
        try {
            kxq0.m151850c("recordReceiveMsg start");
            int iM165249b = m165249b(z);
            SharedPreferences sharedPreferencesM165250c = m165250c(context);
            long j2 = sharedPreferencesM165250c.getLong("start_time", 0L);
            if (j2 <= 0) {
                m165255h(context, sharedPreferencesM165250c, j, iM165249b);
            }
            if (iM165249b == 1) {
                i = sharedPreferencesM165250c.getInt("on_down_count", 0) + 1;
                sharedPreferencesM165250c.edit().putInt("on_down_count", i).apply();
            } else {
                i = sharedPreferencesM165250c.getInt("off_down_count", 0) + 1;
                sharedPreferencesM165250c.edit().putInt("off_down_count", i).apply();
            }
            m165253f(context, j2, j, i, iM165249b);
            kxq0.m151850c("recordReceiveMsg complete");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static synchronized void m165267t(Context context, long j, boolean z) {
        int i;
        try {
            kxq0.m151850c("recordPing start");
            int iM165249b = m165249b(z);
            SharedPreferences sharedPreferencesM165250c = m165250c(context);
            long j2 = sharedPreferencesM165250c.getLong("start_time", 0L);
            if (j2 <= 0) {
                m165255h(context, sharedPreferencesM165250c, j, iM165249b);
            }
            if (iM165249b == 1) {
                i = sharedPreferencesM165250c.getInt("on_ping_count", 0) + 1;
                sharedPreferencesM165250c.edit().putInt("on_ping_count", i).apply();
            } else {
                i = sharedPreferencesM165250c.getInt("off_ping_count", 0) + 1;
                sharedPreferencesM165250c.edit().putInt("off_ping_count", i).apply();
            }
            m165253f(context, j2, j, i, iM165249b);
            kxq0.m151850c("recordPing complete");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static synchronized void m165268u(Context context, long j, boolean z) {
        int i;
        try {
            kxq0.m151850c("recordPong start");
            int iM165249b = m165249b(z);
            SharedPreferences sharedPreferencesM165250c = m165250c(context);
            long j2 = sharedPreferencesM165250c.getLong("start_time", 0L);
            if (j2 <= 0) {
                m165255h(context, sharedPreferencesM165250c, j, iM165249b);
            }
            if (iM165249b == 1) {
                i = sharedPreferencesM165250c.getInt("on_pong_count", 0) + 1;
                sharedPreferencesM165250c.edit().putInt("on_pong_count", i).apply();
            } else {
                i = sharedPreferencesM165250c.getInt("off_pong_count", 0) + 1;
                sharedPreferencesM165250c.edit().putInt("off_pong_count", i).apply();
            }
            m165253f(context, j2, j, i, iM165249b);
            kxq0.m151850c("recordPong complete");
        } catch (Throwable th) {
            throw th;
        }
    }
}
