package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes7.dex */
public final class xn80 {
    /* JADX INFO: renamed from: A */
    public static void m212095A(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        wtq0.m207906a(r8g0.m180204c(str, obj, obj2));
    }

    /* JADX INFO: renamed from: a */
    public static String m212096a(int i, int i2, String str) {
        if (i < 0) {
            return r8g0.m180204c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return r8g0.m180204c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        tn80.m191877a(26, "negative size: ", i2);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m212097b(int i, int i2, String str) {
        if (i < 0) {
            return r8g0.m180204c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return r8g0.m180204c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        tn80.m191877a(26, "negative size: ", i2);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m212098c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m212097b(i, i3, "start index");
        }
        return (i2 < 0 || i2 > i3) ? m212097b(i2, i3, "end index") : r8g0.m180204c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: d */
    public static void m212099d(boolean z) {
        if (z) {
            return;
        }
        fig0.m125680a();
    }

    /* JADX INFO: renamed from: e */
    public static void m212100e(boolean z, Object obj) {
        if (z) {
            return;
        }
        un80.m196830a(obj);
    }

    /* JADX INFO: renamed from: f */
    public static void m212101f(boolean z, String str, int i) {
        if (z) {
            return;
        }
        wg3.m206174a(r8g0.m180204c(str, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: g */
    public static void m212102g(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        wg3.m206174a(r8g0.m180204c(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: h */
    public static void m212103h(boolean z, String str, long j) {
        if (z) {
            return;
        }
        wg3.m206174a(r8g0.m180204c(str, Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: i */
    public static void m212104i(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        wg3.m206174a(r8g0.m180204c(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    /* JADX INFO: renamed from: j */
    public static void m212105j(boolean z, String str, long j, Object obj) {
        if (z) {
            return;
        }
        wg3.m206174a(r8g0.m180204c(str, Long.valueOf(j), obj));
    }

    /* JADX INFO: renamed from: k */
    public static void m212106k(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        wg3.m206174a(r8g0.m180204c(str, obj));
    }

    /* JADX INFO: renamed from: l */
    public static void m212107l(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        wg3.m206174a(r8g0.m180204c(str, obj, obj2));
    }

    /* JADX INFO: renamed from: m */
    public static void m212108m(boolean z, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (z) {
            return;
        }
        wg3.m206174a(r8g0.m180204c(str, obj, obj2, obj3, obj4));
    }

    /* JADX INFO: renamed from: n */
    public static int m212109n(int i, int i2) {
        return m212110o(i, i2, FirebaseAnalytics.Param.INDEX);
    }

    /* JADX INFO: renamed from: o */
    public static int m212110o(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        kym.m151996a(m212096a(i, i2, str));
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public static <T> T m212111p(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: q */
    public static <T> T m212112q(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: r */
    public static <T> T m212113r(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        mnd0.m159157a(r8g0.m180204c(str, obj));
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static int m212114s(int i, int i2) {
        return m212115t(i, i2, FirebaseAnalytics.Param.INDEX);
    }

    /* JADX INFO: renamed from: t */
    public static int m212115t(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        kym.m151996a(m212097b(i, i2, str));
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public static void m212116u(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            kym.m151996a(m212098c(i, i2, i3));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m212117v(boolean z) {
        if (z) {
            return;
        }
        wpg0.m207458a();
    }

    /* JADX INFO: renamed from: w */
    public static void m212118w(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m212119x(boolean z, String str, int i) {
        if (z) {
            return;
        }
        wtq0.m207906a(r8g0.m180204c(str, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: y */
    public static void m212120y(boolean z, String str, long j) {
        if (z) {
            return;
        }
        wtq0.m207906a(r8g0.m180204c(str, Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: z */
    public static void m212121z(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        wtq0.m207906a(r8g0.m180204c(str, obj));
    }
}
