package p153l;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.apm.lite.nativecrash.NativeImpl;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class s4r0 {

    /* JADX INFO: renamed from: a */
    private static boolean f166262a = false;

    /* JADX INFO: renamed from: b */
    private static boolean f166263b = false;

    /* JADX INFO: renamed from: c */
    private static boolean f166264c = false;

    /* JADX INFO: renamed from: d */
    private static boolean f166265d = false;

    /* JADX INFO: renamed from: e */
    private static owq0 f166266e = new owq0();

    /* JADX INFO: renamed from: f */
    private static volatile boolean f166267f = false;

    /* JADX INFO: renamed from: g */
    private static boolean f166268g = false;

    /* JADX INFO: renamed from: l.s4r0$a */
    public static class RunnableC19982a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f166269a;

        /* JADX INFO: renamed from: l.s4r0$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean unused = s4r0.f166267f = true;
                NativeImpl.m5181s();
            }
        }

        public RunnableC19982a(boolean z) {
            this.f166269a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n0r0.m161024k().m169533p() && this.f166269a && !s4r0.f166267f) {
                new Handler(Looper.getMainLooper()).post(new a());
            }
            s4r0.m184581j(this.f166269a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static owq0 m184572a() {
        return f166266e;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m184573b(Application application, Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (f166262a) {
                return;
            }
            f166262a = true;
            if (context == null || application == null) {
                throw new IllegalArgumentException("context or Application must be not null.");
            }
            if (!n0r0.m161033t() || (!m184575d(application) && !m184576e(application) && !m184586o())) {
                n0r0.m161016c(application, context);
                if (z || z2) {
                    frq0 frq0VarM126955e = frq0.m126955e();
                    if (z2) {
                        frq0VarM126955e.m126974j(new duq0(context));
                    }
                    if (z) {
                        frq0VarM126955e.m126975m(new sxq0(context));
                    }
                    f166263b = true;
                }
                NativeImpl.m5178p();
                if (z3) {
                    f166265d = NativeImpl.m5185w(context);
                }
                if (z4 && n0r0.m161024k().m169533p() && Looper.myLooper() == Looper.getMainLooper()) {
                    f166267f = true;
                    NativeImpl.m5181s();
                }
                m184580i(z4);
                q5r0.m175511a("Npth.init takes " + (SystemClock.uptimeMillis() - jUptimeMillis) + " ms.");
                return;
            }
            Log.e("apminsight", "Inner npth checked.");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m184574c(Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        Application applicationM161023j;
        try {
            if (n0r0.m161023j() != null) {
                applicationM161023j = n0r0.m161023j();
            } else if (context instanceof Application) {
                applicationM161023j = (Application) context;
                if (applicationM161023j.getBaseContext() == null) {
                    throw new IllegalArgumentException("Application not attach.");
                }
            } else {
                try {
                    applicationM161023j = (Application) context.getApplicationContext();
                    if (applicationM161023j == null) {
                        throw new IllegalArgumentException("no Application.");
                    }
                    if (applicationM161023j.getBaseContext() != null) {
                        context = applicationM161023j.getBaseContext();
                    }
                } catch (Throwable unused) {
                    throw new IllegalArgumentException("no Application.");
                }
            }
            m184573b(applicationM161023j, context, z, z2, z3, z4, j);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m184575d(Context context) {
        try {
            return new File(j5r0.m143557E(context), "npth").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    private static boolean m184576e(Context context) {
        try {
            return new File(context.getApplicationInfo().nativeLibraryDir, "libnpth.so").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m184579h() {
        return f166262a;
    }

    /* JADX INFO: renamed from: i */
    private static void m184580i(boolean z) {
        c5r0.m108080b().m179946f(new RunnableC19982a(z), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static void m184581j(boolean z) {
        Context contextM161022i = n0r0.m161022i();
        k0r0.m147834d();
        NativeImpl.m5165c();
        dsq0.m117772a().m117774b(contextM161022i);
        h3r0.m133518a(contextM161022i);
        if (z) {
            vxq0.m203869a(contextM161022i).m203874d();
            f166264c = z;
            if (n0r0.m161024k().m169533p()) {
                NativeImpl.m5186x();
            }
        }
        f4r0.m124032g();
        NativeImpl.m5175m();
        h5r0.m133674d("afterNpthInitAsync", "noValue");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m184582k() {
        return frq0.m126959n() || NativeImpl.m5173k();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m184583l() {
        return frq0.m126964t() || NativeImpl.m5173k();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m184584m() {
        return f166268g;
    }

    /* JADX INFO: renamed from: o */
    private static boolean m184586o() {
        return false;
    }
}
