package p149l;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.apm.lite.nativecrash.NativeImpl;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class mvq0 {

    /* JADX INFO: renamed from: a */
    private static boolean f135960a = false;

    /* JADX INFO: renamed from: b */
    private static boolean f135961b = false;

    /* JADX INFO: renamed from: c */
    private static boolean f135962c = false;

    /* JADX INFO: renamed from: d */
    private static boolean f135963d = false;

    /* JADX INFO: renamed from: e */
    private static inq0 f135964e = new inq0();

    /* JADX INFO: renamed from: f */
    private static volatile boolean f135965f = false;

    /* JADX INFO: renamed from: g */
    private static boolean f135966g = false;

    /* JADX INFO: renamed from: l.mvq0$a */
    public static class RunnableC18570a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f135967a;

        /* JADX INFO: renamed from: l.mvq0$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean unused = mvq0.f135965f = true;
                NativeImpl.m5171s();
            }
        }

        public RunnableC18570a(boolean z) {
            this.f135967a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (hrq0.m132702k().m143412p() && this.f135967a && !mvq0.f135965f) {
                new Handler(Looper.getMainLooper()).post(new a());
            }
            mvq0.m156587j(this.f135967a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static inq0 m156578a() {
        return f135964e;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m156579b(Application application, Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (f135960a) {
                return;
            }
            f135960a = true;
            if (context == null || application == null) {
                throw new IllegalArgumentException("context or Application must be not null.");
            }
            if (!hrq0.m132711t() || (!m156581d(application) && !m156582e(application) && !m156592o())) {
                hrq0.m132694c(application, context);
                if (z || z2) {
                    aiq0 aiq0VarM96898e = aiq0.m96898e();
                    if (z2) {
                        aiq0VarM96898e.m96917j(new xkq0(context));
                    }
                    if (z) {
                        aiq0VarM96898e.m96918m(new moq0(context));
                    }
                    f135961b = true;
                }
                NativeImpl.m5168p();
                if (z3) {
                    f135963d = NativeImpl.m5175w(context);
                }
                if (z4 && hrq0.m132702k().m143412p() && Looper.myLooper() == Looper.getMainLooper()) {
                    f135965f = true;
                    NativeImpl.m5171s();
                }
                m156586i(z4);
                kwq0.m147628a("Npth.init takes " + (SystemClock.uptimeMillis() - jUptimeMillis) + " ms.");
                return;
            }
            Log.e("apminsight", "Inner npth checked.");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m156580c(Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        Application applicationM132701j;
        try {
            if (hrq0.m132701j() != null) {
                applicationM132701j = hrq0.m132701j();
            } else if (context instanceof Application) {
                applicationM132701j = (Application) context;
                if (applicationM132701j.getBaseContext() == null) {
                    throw new IllegalArgumentException("Application not attach.");
                }
            } else {
                try {
                    applicationM132701j = (Application) context.getApplicationContext();
                    if (applicationM132701j == null) {
                        throw new IllegalArgumentException("no Application.");
                    }
                    if (applicationM132701j.getBaseContext() != null) {
                        context = applicationM132701j.getBaseContext();
                    }
                } catch (Throwable unused) {
                    throw new IllegalArgumentException("no Application.");
                }
            }
            m156579b(applicationM132701j, context, z, z2, z3, z4, j);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m156581d(Context context) {
        try {
            return new File(dwq0.m113905E(context), "npth").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    private static boolean m156582e(Context context) {
        try {
            return new File(context.getApplicationInfo().nativeLibraryDir, "libnpth.so").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m156585h() {
        return f135960a;
    }

    /* JADX INFO: renamed from: i */
    private static void m156586i(boolean z) {
        wvq0.m205758b().m151993f(new RunnableC18570a(z), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static void m156587j(boolean z) {
        Context contextM132700i = hrq0.m132700i();
        erq0.m117871d();
        NativeImpl.m5155c();
        yiq0.m215005a().m215007b(contextM132700i);
        buq0.m103989a(contextM132700i);
        if (z) {
            poq0.m170634a(contextM132700i).m170639d();
            f135962c = z;
            if (hrq0.m132702k().m143412p()) {
                NativeImpl.m5176x();
            }
        }
        zuq0.m220245g();
        NativeImpl.m5165m();
        bwq0.m104241d("afterNpthInitAsync", "noValue");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m156588k() {
        return aiq0.m96902n() || NativeImpl.m5163k();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m156589l() {
        return aiq0.m96907t() || NativeImpl.m5163k();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m156590m() {
        return f135966g;
    }

    /* JADX INFO: renamed from: o */
    private static boolean m156592o() {
        return false;
    }
}
