package p153l;

import android.content.Context;
import android.os.Process;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ouq0 {

    /* JADX INFO: renamed from: a */
    private static int f149187a = 2;

    /* JADX INFO: renamed from: b */
    private static Context f149188b = null;

    /* JADX INFO: renamed from: c */
    private static boolean f149189c = false;

    /* JADX INFO: renamed from: d */
    private static boolean f149190d = false;

    /* JADX INFO: renamed from: e */
    private static String f149191e = "XMPush-" + Process.myPid();

    /* JADX INFO: renamed from: f */
    private static zzv f149192f = new C19223a();

    /* JADX INFO: renamed from: g */
    private static final HashMap<Integer, Long> f149193g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    private static final HashMap<Integer, String> f149194h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    private static final Integer f149195i = -1;

    /* JADX INFO: renamed from: j */
    private static AtomicInteger f149196j = new AtomicInteger(1);

    /* JADX INFO: renamed from: l.ouq0$a */
    public static class C19223a implements zzv {

        /* JADX INFO: renamed from: a */
        private String f149197a = ouq0.f149191e;

        @Override // p153l.zzv
        public void log(String str, Throwable th) {
        }

        @Override // p153l.zzv
        public void log(String str) {
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m169377A(String str, String str2) {
        if (m169400t(4)) {
            m169388h(4, m169402v(str, str2));
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m169378B(String str) {
        if (m169400t(4)) {
            m169388h(4, m169384d(str));
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m169379C(String str, String str2) {
        if (f149189c) {
            m169394n(str, str2);
            return;
        }
        m169402v(str, str2);
        if (f149190d) {
            return;
        }
        m169394n(str, str2);
    }

    /* JADX INFO: renamed from: D */
    public static void m169380D(String str) {
        if (f149189c) {
            m169393m(str);
            return;
        }
        m169384d(str);
        if (f149190d) {
            return;
        }
        m169393m(str);
    }

    /* JADX INFO: renamed from: a */
    public static int m169381a() {
        return f149187a;
    }

    /* JADX INFO: renamed from: b */
    public static Integer m169382b(String str) {
        if (f149187a > 1) {
            return f149195i;
        }
        Integer numValueOf = Integer.valueOf(f149196j.incrementAndGet());
        f149193g.put(numValueOf, Long.valueOf(System.currentTimeMillis()));
        f149194h.put(numValueOf, str);
        f149192f.log(str + " starts");
        return numValueOf;
    }

    /* JADX INFO: renamed from: d */
    private static String m169384d(String str) {
        return m169401u() + str;
    }

    /* JADX INFO: renamed from: e */
    public static String m169385e(String str, String str2) {
        return "[" + str + "] " + str2;
    }

    /* JADX INFO: renamed from: f */
    private static String m169386f(String str, Object... objArr) {
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
    public static void m169387g(int i) {
        if (i < 0 || i > 5) {
            m169388h(2, "set log level as " + i);
        }
        f149187a = i;
    }

    /* JADX INFO: renamed from: h */
    public static void m169388h(int i, String str) {
        if (i >= f149187a) {
            f149192f.log(str);
        } else {
            m169399s();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m169389i(int i, String str, Throwable th) {
        if (i >= f149187a) {
            f149192f.log(str, th);
        } else {
            m169399s();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m169390j(int i, Throwable th) {
        if (i >= f149187a) {
            f149192f.log("", th);
        } else {
            m169399s();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m169391k(Context context) {
        f149188b = context;
        if (l4r0.m152825j(context)) {
            f149189c = true;
        }
        if (l4r0.m152824i()) {
            f149190d = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m169392l(Integer num) {
        if (f149187a <= 1) {
            HashMap<Integer, Long> map = f149193g;
            if (map.containsKey(num)) {
                long jLongValue = map.remove(num).longValue();
                String strRemove = f149194h.remove(num);
                long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                f149192f.log(strRemove + " ends in " + jCurrentTimeMillis + " ms");
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m169393m(String str) {
        if (m169400t(2)) {
            m169388h(2, m169384d(str));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m169394n(String str, String str2) {
        if (m169400t(2)) {
            m169388h(2, m169402v(str, str2));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m169395o(String str, Throwable th) {
        if (m169400t(4)) {
            m169389i(4, m169384d(str), th);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m169396p(String str, Object... objArr) {
        if (m169400t(2)) {
            m169388h(2, m169386f(str, objArr));
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m169397q(Throwable th) {
        if (m169400t(4)) {
            m169390j(4, th);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m169398r(zzv zzvVar) {
        f149192f = zzvVar;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m169399s() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    private static boolean m169400t(int i) {
        return i >= f149187a || m169399s();
    }

    /* JADX INFO: renamed from: u */
    private static String m169401u() {
        return "[Tid:" + Thread.currentThread().getId() + "] ";
    }

    /* JADX INFO: renamed from: v */
    private static String m169402v(String str, String str2) {
        return m169401u() + m169385e(str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m169403w(String str) {
        if (m169400t(0)) {
            m169388h(0, m169384d(str));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m169404x(String str, String str2) {
        if (m169400t(1)) {
            m169388h(1, m169402v(str, str2));
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m169405y(String str, Object... objArr) {
        if (m169400t(1)) {
            m169388h(1, m169386f(str, objArr));
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m169406z(String str) {
        if (m169400t(0)) {
            m169388h(1, m169384d(str));
        }
    }
}
