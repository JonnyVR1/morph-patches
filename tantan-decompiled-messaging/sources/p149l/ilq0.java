package p149l;

import android.content.Context;
import android.os.Process;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ilq0 {

    /* JADX INFO: renamed from: a */
    private static int f113854a = 2;

    /* JADX INFO: renamed from: b */
    private static Context f113855b = null;

    /* JADX INFO: renamed from: c */
    private static boolean f113856c = false;

    /* JADX INFO: renamed from: d */
    private static boolean f113857d = false;

    /* JADX INFO: renamed from: e */
    private static String f113858e = "XMPush-" + Process.myPid();

    /* JADX INFO: renamed from: f */
    private static cyv f113859f = new C17575a();

    /* JADX INFO: renamed from: g */
    private static final HashMap<Integer, Long> f113860g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    private static final HashMap<Integer, String> f113861h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    private static final Integer f113862i = -1;

    /* JADX INFO: renamed from: j */
    private static AtomicInteger f113863j = new AtomicInteger(1);

    /* JADX INFO: renamed from: l.ilq0$a */
    public static class C17575a implements cyv {

        /* JADX INFO: renamed from: a */
        private String f113864a = ilq0.f113858e;

        @Override // p149l.cyv
        public void log(String str, Throwable th) {
        }

        @Override // p149l.cyv
        public void log(String str) {
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m137024A(String str, String str2) {
        if (m137047t(4)) {
            m137035h(4, m137049v(str, str2));
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m137025B(String str) {
        if (m137047t(4)) {
            m137035h(4, m137031d(str));
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m137026C(String str, String str2) {
        if (f113856c) {
            m137041n(str, str2);
            return;
        }
        m137049v(str, str2);
        if (f113857d) {
            return;
        }
        m137041n(str, str2);
    }

    /* JADX INFO: renamed from: D */
    public static void m137027D(String str) {
        if (f113856c) {
            m137040m(str);
            return;
        }
        m137031d(str);
        if (f113857d) {
            return;
        }
        m137040m(str);
    }

    /* JADX INFO: renamed from: a */
    public static int m137028a() {
        return f113854a;
    }

    /* JADX INFO: renamed from: b */
    public static Integer m137029b(String str) {
        if (f113854a > 1) {
            return f113862i;
        }
        Integer numValueOf = Integer.valueOf(f113863j.incrementAndGet());
        f113860g.put(numValueOf, Long.valueOf(System.currentTimeMillis()));
        f113861h.put(numValueOf, str);
        f113859f.log(str + " starts");
        return numValueOf;
    }

    /* JADX INFO: renamed from: d */
    private static String m137031d(String str) {
        return m137048u() + str;
    }

    /* JADX INFO: renamed from: e */
    public static String m137032e(String str, String str2) {
        return "[" + str + "] " + str2;
    }

    /* JADX INFO: renamed from: f */
    private static String m137033f(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder("[Tid:");
        sb.append(Thread.currentThread().getId());
        sb.append("] [");
        sb.append(str);
        sb.append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static void m137034g(int i) {
        if (i < 0 || i > 5) {
            m137035h(2, "set log level as " + i);
        }
        f113854a = i;
    }

    /* JADX INFO: renamed from: h */
    public static void m137035h(int i, String str) {
        if (i >= f113854a) {
            f113859f.log(str);
        } else {
            m137046s();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m137036i(int i, String str, Throwable th) {
        if (i >= f113854a) {
            f113859f.log(str, th);
        } else {
            m137046s();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m137037j(int i, Throwable th) {
        if (i >= f113854a) {
            f113859f.log("", th);
        } else {
            m137046s();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m137038k(Context context) {
        f113855b = context;
        if (fvq0.m123356j(context)) {
            f113856c = true;
        }
        if (fvq0.m123355i()) {
            f113857d = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m137039l(Integer num) {
        if (f113854a <= 1) {
            HashMap<Integer, Long> map = f113860g;
            if (map.containsKey(num)) {
                long jLongValue = map.remove(num).longValue();
                String strRemove = f113861h.remove(num);
                long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                f113859f.log(strRemove + " ends in " + jCurrentTimeMillis + " ms");
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m137040m(String str) {
        if (m137047t(2)) {
            m137035h(2, m137031d(str));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m137041n(String str, String str2) {
        if (m137047t(2)) {
            m137035h(2, m137049v(str, str2));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m137042o(String str, Throwable th) {
        if (m137047t(4)) {
            m137036i(4, m137031d(str), th);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m137043p(String str, Object... objArr) {
        if (m137047t(2)) {
            m137035h(2, m137033f(str, objArr));
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m137044q(Throwable th) {
        if (m137047t(4)) {
            m137037j(4, th);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m137045r(cyv cyvVar) {
        f113859f = cyvVar;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m137046s() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    private static boolean m137047t(int i) {
        return i >= f113854a || m137046s();
    }

    /* JADX INFO: renamed from: u */
    private static String m137048u() {
        return "[Tid:" + Thread.currentThread().getId() + "] ";
    }

    /* JADX INFO: renamed from: v */
    private static String m137049v(String str, String str2) {
        return m137048u() + m137032e(str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m137050w(String str) {
        if (m137047t(0)) {
            m137035h(0, m137031d(str));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m137051x(String str, String str2) {
        if (m137047t(1)) {
            m137035h(1, m137049v(str, str2));
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m137052y(String str, Object... objArr) {
        if (m137047t(1)) {
            m137035h(1, m137033f(str, objArr));
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m137053z(String str) {
        if (m137047t(0)) {
            m137035h(1, m137031d(str));
        }
    }
}
