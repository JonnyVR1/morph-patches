package p153l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.lite.CrashType;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n0r0 {

    /* JADX INFO: renamed from: a */
    private static Context f139649a = null;

    /* JADX INFO: renamed from: b */
    private static Application f139650b = null;

    /* JADX INFO: renamed from: c */
    private static long f139651c = 0;

    /* JADX INFO: renamed from: d */
    private static boolean f139652d = false;

    /* JADX INFO: renamed from: e */
    @SuppressLint({"StaticFieldLeak"})
    private static ayq0 f139653e;

    /* JADX INFO: renamed from: h */
    private static volatile ConcurrentHashMap<Integer, String> f139656h;

    /* JADX INFO: renamed from: m */
    private static volatile String f139661m;

    /* JADX INFO: renamed from: f */
    private static ow5 f139654f = new ow5();

    /* JADX INFO: renamed from: g */
    private static rrq0 f139655g = new rrq0();

    /* JADX INFO: renamed from: i */
    private static o5r0 f139657i = null;

    /* JADX INFO: renamed from: j */
    private static volatile String f139658j = null;

    /* JADX INFO: renamed from: k */
    private static Object f139659k = new Object();

    /* JADX INFO: renamed from: l */
    private static volatile int f139660l = 0;

    /* JADX INFO: renamed from: n */
    private static int f139662n = 0;

    /* JADX INFO: renamed from: o */
    private static boolean f139663o = true;

    /* JADX INFO: renamed from: p */
    private static boolean f139664p = false;

    /* JADX INFO: renamed from: q */
    private static boolean f139665q = true;

    /* JADX INFO: renamed from: a */
    public static String m161014a(long j, CrashType crashType, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(m161021h());
        sb.append('_');
        sb.append(z ? "oom_" : "normal_");
        sb.append(m161025l());
        sb.append('_');
        sb.append(z2 ? "ignore_" : "normal_");
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append("G");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static ayq0 m161015b() {
        if (f139653e == null) {
            f139653e = q3r0.m175160a(f139649a);
        }
        return f139653e;
    }

    /* JADX INFO: renamed from: c */
    public static void m161016c(Application application, Context context) {
        if (f139650b == null) {
            f139651c = System.currentTimeMillis();
            f139649a = context;
            f139650b = application;
            f139658j = Long.toHexString(new Random().nextLong()) + "G";
        }
    }

    /* JADX INFO: renamed from: d */
    public static rrq0 m161017d() {
        return f139655g;
    }

    /* JADX INFO: renamed from: e */
    public static o5r0 m161018e() {
        if (f139657i == null) {
            synchronized (n0r0.class) {
                f139657i = new o5r0(f139649a);
            }
        }
        return f139657i;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m161019f() {
        return m161024k().m169529l() && m161029p().contains("local_test");
    }

    /* JADX INFO: renamed from: g */
    public static String m161020g() {
        return m161021h() + '_' + Long.toHexString(new Random().nextLong()) + "G";
    }

    /* JADX INFO: renamed from: h */
    public static String m161021h() {
        if (f139658j == null) {
            synchronized (f139659k) {
                try {
                    if (f139658j == null) {
                        f139658j = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f139658j;
    }

    /* JADX INFO: renamed from: i */
    public static Context m161022i() {
        return f139649a;
    }

    /* JADX INFO: renamed from: j */
    public static Application m161023j() {
        return f139650b;
    }

    /* JADX INFO: renamed from: k */
    public static ow5 m161024k() {
        return f139654f;
    }

    /* JADX INFO: renamed from: l */
    public static long m161025l() {
        return f139651c;
    }

    /* JADX INFO: renamed from: m */
    public static String m161026m() {
        return "default";
    }

    /* JADX INFO: renamed from: n */
    public static int m161027n() {
        return f139662n;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m161028o() {
        return f139652d;
    }

    /* JADX INFO: renamed from: p */
    public static String m161029p() {
        Object obj = m161015b().m100917b().get("channel");
        return obj == null ? "unknown" : String.valueOf(obj);
    }

    /* JADX INFO: renamed from: q */
    public static ConcurrentHashMap<Integer, String> m161030q() {
        return f139656h;
    }

    /* JADX INFO: renamed from: r */
    public static int m161031r() {
        return f139660l;
    }

    /* JADX INFO: renamed from: s */
    public static String m161032s() {
        return f139661m;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m161033t() {
        return f139664p;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m161034u() {
        return f139665q;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m161035v() {
        return f139663o;
    }
}
