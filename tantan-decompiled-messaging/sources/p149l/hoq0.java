package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class hoq0 {

    /* JADX INFO: renamed from: a */
    private static int f108838a = 0;

    /* JADX INFO: renamed from: b */
    private static boolean f108839b = true;

    /* JADX INFO: renamed from: l.hoq0$a */
    public static class RunnableC17363a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f108840a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f108841b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f108842c;

        public RunnableC17363a(Context context, long j, boolean z) {
            this.f108840a = context;
            this.f108841b = j;
            this.f108842c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                hoq0.m132244r(this.f108840a, this.f108841b, this.f108842c);
            } catch (Exception e) {
                ilq0.m137040m("PowerStatsSP onSendMsg exception: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: l.hoq0$b */
    public static class RunnableC17364b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f108843a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f108844b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f108845c;

        public RunnableC17364b(Context context, long j, boolean z) {
            this.f108843a = context;
            this.f108844b = j;
            this.f108845c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                hoq0.m132245s(this.f108843a, this.f108844b, this.f108845c);
            } catch (Exception e) {
                ilq0.m137040m("PowerStatsSP onReceiveMsg exception: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: l.hoq0$c */
    public static class RunnableC17365c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f108846a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f108847b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f108848c;

        public RunnableC17365c(Context context, long j, boolean z) {
            this.f108846a = context;
            this.f108847b = j;
            this.f108848c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                hoq0.m132246t(this.f108846a, this.f108847b, this.f108848c);
            } catch (Exception e) {
                ilq0.m137040m("PowerStatsSP onPing exception: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: l.hoq0$d */
    public static class RunnableC17366d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f108849a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f108850b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f108851c;

        public RunnableC17366d(Context context, long j, boolean z) {
            this.f108849a = context;
            this.f108850b = j;
            this.f108851c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                hoq0.m132247u(this.f108849a, this.f108850b, this.f108851c);
            } catch (Exception e) {
                ilq0.m137040m("PowerStatsSP onPong exception: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m132227a(Context context) {
        if (f108838a <= 0) {
            f108838a = fvq0.m123358l(context);
        }
        return f108838a;
    }

    /* JADX INFO: renamed from: b */
    private static int m132228b(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: renamed from: c */
    private static SharedPreferences m132229c(Context context) {
        return context.getSharedPreferences("sp_power_stats", 0);
    }

    /* JADX INFO: renamed from: d */
    private static foq0 m132230d(Context context) {
        SharedPreferences sharedPreferencesM132229c = m132229c(context);
        foq0 foq0Var = new foq0();
        foq0Var.m122492c(sharedPreferencesM132229c.getInt("off_up_count", 0));
        foq0Var.m122496g(sharedPreferencesM132229c.getInt("off_down_count", 0));
        foq0Var.m122500k(sharedPreferencesM132229c.getInt("off_ping_count", 0));
        foq0Var.m122504o(sharedPreferencesM132229c.getInt("off_pong_count", 0));
        foq0Var.m122493d(sharedPreferencesM132229c.getLong("off_duration", 0L));
        foq0Var.m122507r(sharedPreferencesM132229c.getInt("on_up_count", 0));
        foq0Var.m122509t(sharedPreferencesM132229c.getInt("on_down_count", 0));
        foq0Var.m122511v(sharedPreferencesM132229c.getInt("on_ping_count", 0));
        foq0Var.m122513x(sharedPreferencesM132229c.getInt("on_pong_count", 0));
        foq0Var.m122497h(sharedPreferencesM132229c.getLong("on_duration", 0L));
        foq0Var.m122501l(sharedPreferencesM132229c.getLong("start_time", 0L));
        foq0Var.m122505p(sharedPreferencesM132229c.getLong("end_time", 0L));
        foq0Var.m122515z(sharedPreferencesM132229c.getInt("xmsf_vc", 0));
        foq0Var.m122489B(sharedPreferencesM132229c.getInt("android_vc", 0));
        return foq0Var;
    }

    /* JADX INFO: renamed from: e */
    private static void m132231e(Context context, long j, int i) {
        eoq0.m117502c("upload");
        new goq0().m127287a(context, m132230d(context));
        m132236j(context, j, i);
    }

    /* JADX INFO: renamed from: f */
    private static void m132232f(Context context, long j, long j2, int i, int i2) {
        if (j > 0) {
            if (m132235i(context) || i >= 1073741823 || j2 - j >= 86400000) {
                m132229c(context).edit().putLong("end_time", j2).apply();
                m132231e(context, j2, i2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m132233g(Context context, long j, boolean z) {
        njq0.m159772f(context).m159773g(new RunnableC17363a(context, j, z));
    }

    /* JADX INFO: renamed from: h */
    private static void m132234h(Context context, SharedPreferences sharedPreferences, long j, int i) {
        eoq0.m117502c("recordInit");
        sharedPreferences.edit().putLong("start_time", j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", m132227a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    /* JADX INFO: renamed from: i */
    private static boolean m132235i(Context context) {
        boolean z = false;
        if (f108839b) {
            f108839b = false;
            SharedPreferences sharedPreferencesM132229c = m132229c(context);
            int i = sharedPreferencesM132229c.getInt("xmsf_vc", 0);
            int i2 = sharedPreferencesM132229c.getInt("android_vc", 0);
            if (i != 0 && i2 != 0 && (i != m132227a(context) || i2 != Build.VERSION.SDK_INT)) {
                z = true;
            }
        }
        eoq0.m117502c("isVcChanged = " + z);
        return z;
    }

    /* JADX INFO: renamed from: j */
    private static void m132236j(Context context, long j, int i) {
        eoq0.m117502c("reset");
        m132229c(context).edit().clear().putLong("start_time", j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", m132227a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    /* JADX INFO: renamed from: k */
    public static void m132237k(Context context, long j, boolean z) {
        njq0.m159772f(context).m159773g(new RunnableC17364b(context, j, z));
    }

    /* JADX INFO: renamed from: l */
    public static void m132238l(Context context, long j, boolean z) {
        njq0.m159772f(context).m159773g(new RunnableC17365c(context, j, z));
    }

    /* JADX INFO: renamed from: m */
    public static void m132239m(Context context, long j, boolean z) {
        njq0.m159772f(context).m159773g(new RunnableC17366d(context, j, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static synchronized void m132244r(Context context, long j, boolean z) {
        int i;
        try {
            eoq0.m117502c("recordSendMsg start");
            int iM132228b = m132228b(z);
            SharedPreferences sharedPreferencesM132229c = m132229c(context);
            long j2 = sharedPreferencesM132229c.getLong("start_time", 0L);
            if (j2 <= 0) {
                m132234h(context, sharedPreferencesM132229c, j, iM132228b);
            }
            if (iM132228b == 1) {
                i = sharedPreferencesM132229c.getInt("on_up_count", 0) + 1;
                sharedPreferencesM132229c.edit().putInt("on_up_count", i).apply();
            } else {
                i = sharedPreferencesM132229c.getInt("off_up_count", 0) + 1;
                sharedPreferencesM132229c.edit().putInt("off_up_count", i).apply();
            }
            m132232f(context, j2, j, i, iM132228b);
            eoq0.m117502c("recordSendMsg complete");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static synchronized void m132245s(Context context, long j, boolean z) {
        int i;
        try {
            eoq0.m117502c("recordReceiveMsg start");
            int iM132228b = m132228b(z);
            SharedPreferences sharedPreferencesM132229c = m132229c(context);
            long j2 = sharedPreferencesM132229c.getLong("start_time", 0L);
            if (j2 <= 0) {
                m132234h(context, sharedPreferencesM132229c, j, iM132228b);
            }
            if (iM132228b == 1) {
                i = sharedPreferencesM132229c.getInt("on_down_count", 0) + 1;
                sharedPreferencesM132229c.edit().putInt("on_down_count", i).apply();
            } else {
                i = sharedPreferencesM132229c.getInt("off_down_count", 0) + 1;
                sharedPreferencesM132229c.edit().putInt("off_down_count", i).apply();
            }
            m132232f(context, j2, j, i, iM132228b);
            eoq0.m117502c("recordReceiveMsg complete");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static synchronized void m132246t(Context context, long j, boolean z) {
        int i;
        try {
            eoq0.m117502c("recordPing start");
            int iM132228b = m132228b(z);
            SharedPreferences sharedPreferencesM132229c = m132229c(context);
            long j2 = sharedPreferencesM132229c.getLong("start_time", 0L);
            if (j2 <= 0) {
                m132234h(context, sharedPreferencesM132229c, j, iM132228b);
            }
            if (iM132228b == 1) {
                i = sharedPreferencesM132229c.getInt("on_ping_count", 0) + 1;
                sharedPreferencesM132229c.edit().putInt("on_ping_count", i).apply();
            } else {
                i = sharedPreferencesM132229c.getInt("off_ping_count", 0) + 1;
                sharedPreferencesM132229c.edit().putInt("off_ping_count", i).apply();
            }
            m132232f(context, j2, j, i, iM132228b);
            eoq0.m117502c("recordPing complete");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static synchronized void m132247u(Context context, long j, boolean z) {
        int i;
        try {
            eoq0.m117502c("recordPong start");
            int iM132228b = m132228b(z);
            SharedPreferences sharedPreferencesM132229c = m132229c(context);
            long j2 = sharedPreferencesM132229c.getLong("start_time", 0L);
            if (j2 <= 0) {
                m132234h(context, sharedPreferencesM132229c, j, iM132228b);
            }
            if (iM132228b == 1) {
                i = sharedPreferencesM132229c.getInt("on_pong_count", 0) + 1;
                sharedPreferencesM132229c.edit().putInt("on_pong_count", i).apply();
            } else {
                i = sharedPreferencesM132229c.getInt("off_pong_count", 0) + 1;
                sharedPreferencesM132229c.edit().putInt("off_pong_count", i).apply();
            }
            m132232f(context, j2, j, i, iM132228b);
            eoq0.m117502c("recordPong complete");
        } catch (Throwable th) {
            throw th;
        }
    }
}
