package p149l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.lite.CrashType;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hrq0 {

    /* JADX INFO: renamed from: a */
    private static Context f109238a = null;

    /* JADX INFO: renamed from: b */
    private static Application f109239b = null;

    /* JADX INFO: renamed from: c */
    private static long f109240c = 0;

    /* JADX INFO: renamed from: d */
    private static boolean f109241d = false;

    /* JADX INFO: renamed from: e */
    @SuppressLint({"StaticFieldLeak"})
    private static uoq0 f109242e;

    /* JADX INFO: renamed from: h */
    private static volatile ConcurrentHashMap<Integer, String> f109245h;

    /* JADX INFO: renamed from: m */
    private static volatile String f109250m;

    /* JADX INFO: renamed from: f */
    private static jv5 f109243f = new jv5();

    /* JADX INFO: renamed from: g */
    private static miq0 f109244g = new miq0();

    /* JADX INFO: renamed from: i */
    private static iwq0 f109246i = null;

    /* JADX INFO: renamed from: j */
    private static volatile String f109247j = null;

    /* JADX INFO: renamed from: k */
    private static Object f109248k = new Object();

    /* JADX INFO: renamed from: l */
    private static volatile int f109249l = 0;

    /* JADX INFO: renamed from: n */
    private static int f109251n = 0;

    /* JADX INFO: renamed from: o */
    private static boolean f109252o = true;

    /* JADX INFO: renamed from: p */
    private static boolean f109253p = false;

    /* JADX INFO: renamed from: q */
    private static boolean f109254q = true;

    /* JADX INFO: renamed from: a */
    public static String m132692a(long j, CrashType crashType, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(m132699h());
        sb.append('_');
        sb.append(z ? "oom_" : "normal_");
        sb.append(m132703l());
        sb.append('_');
        sb.append(z2 ? "ignore_" : "normal_");
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append("G");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static uoq0 m132693b() {
        if (f109242e == null) {
            f109242e = kuq0.m147291a(f109238a);
        }
        return f109242e;
    }

    /* JADX INFO: renamed from: c */
    public static void m132694c(Application application, Context context) {
        if (f109239b == null) {
            f109240c = System.currentTimeMillis();
            f109238a = context;
            f109239b = application;
            f109247j = Long.toHexString(new Random().nextLong()) + "G";
        }
    }

    /* JADX INFO: renamed from: d */
    public static miq0 m132695d() {
        return f109244g;
    }

    /* JADX INFO: renamed from: e */
    public static iwq0 m132696e() {
        if (f109246i == null) {
            synchronized (hrq0.class) {
                f109246i = new iwq0(f109238a);
            }
        }
        return f109246i;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m132697f() {
        return m132702k().m143408l() && m132707p().contains("local_test");
    }

    /* JADX INFO: renamed from: g */
    public static String m132698g() {
        return m132699h() + '_' + Long.toHexString(new Random().nextLong()) + "G";
    }

    /* JADX INFO: renamed from: h */
    public static String m132699h() {
        if (f109247j == null) {
            synchronized (f109248k) {
                try {
                    if (f109247j == null) {
                        f109247j = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f109247j;
    }

    /* JADX INFO: renamed from: i */
    public static Context m132700i() {
        return f109238a;
    }

    /* JADX INFO: renamed from: j */
    public static Application m132701j() {
        return f109239b;
    }

    /* JADX INFO: renamed from: k */
    public static jv5 m132702k() {
        return f109243f;
    }

    /* JADX INFO: renamed from: l */
    public static long m132703l() {
        return f109240c;
    }

    /* JADX INFO: renamed from: m */
    public static String m132704m() {
        return "default";
    }

    /* JADX INFO: renamed from: n */
    public static int m132705n() {
        return f109251n;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m132706o() {
        return f109241d;
    }

    /* JADX INFO: renamed from: p */
    public static String m132707p() {
        Object obj = m132693b().m194560b().get("channel");
        return obj == null ? "unknown" : String.valueOf(obj);
    }

    /* JADX INFO: renamed from: q */
    public static ConcurrentHashMap<Integer, String> m132708q() {
        return f109245h;
    }

    /* JADX INFO: renamed from: r */
    public static int m132709r() {
        return f109249l;
    }

    /* JADX INFO: renamed from: s */
    public static String m132710s() {
        return f109250m;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m132711t() {
        return f109253p;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m132712u() {
        return f109254q;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m132713v() {
        return f109252o;
    }
}
