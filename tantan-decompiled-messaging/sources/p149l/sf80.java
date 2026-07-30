package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes7.dex */
public final class sf80 {
    /* JADX INFO: renamed from: A */
    public static void m183878A(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        qkq0.m175383a(k0g0.m144049c(str, obj, obj2));
    }

    /* JADX INFO: renamed from: a */
    public static String m183879a(int i, int i2, String str) {
        if (i < 0) {
            return k0g0.m144049c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return k0g0.m144049c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        of80.m164058a(26, "negative size: ", i2);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m183880b(int i, int i2, String str) {
        if (i < 0) {
            return k0g0.m144049c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return k0g0.m144049c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        of80.m164058a(26, "negative size: ", i2);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m183881c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m183880b(i, i3, "start index");
        }
        return (i2 < 0 || i2 > i3) ? m183880b(i2, i3, "end index") : k0g0.m144049c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: d */
    public static void m183882d(boolean z) {
        if (z) {
            return;
        }
        x9g0.m207497a();
    }

    /* JADX INFO: renamed from: e */
    public static void m183883e(boolean z, Object obj) {
        if (z) {
            return;
        }
        pf80.m168601a(obj);
    }

    /* JADX INFO: renamed from: f */
    public static void m183884f(boolean z, String str, int i) {
        if (z) {
            return;
        }
        ig3.m135964a(k0g0.m144049c(str, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: g */
    public static void m183885g(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        ig3.m135964a(k0g0.m144049c(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: h */
    public static void m183886h(boolean z, String str, long j) {
        if (z) {
            return;
        }
        ig3.m135964a(k0g0.m144049c(str, Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: i */
    public static void m183887i(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        ig3.m135964a(k0g0.m144049c(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    /* JADX INFO: renamed from: j */
    public static void m183888j(boolean z, String str, long j, Object obj) {
        if (z) {
            return;
        }
        ig3.m135964a(k0g0.m144049c(str, Long.valueOf(j), obj));
    }

    /* JADX INFO: renamed from: k */
    public static void m183889k(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        ig3.m135964a(k0g0.m144049c(str, obj));
    }

    /* JADX INFO: renamed from: l */
    public static void m183890l(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        ig3.m135964a(k0g0.m144049c(str, obj, obj2));
    }

    /* JADX INFO: renamed from: m */
    public static void m183891m(boolean z, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (z) {
            return;
        }
        ig3.m135964a(k0g0.m144049c(str, obj, obj2, obj3, obj4));
    }

    /* JADX INFO: renamed from: n */
    public static int m183892n(int i, int i2) {
        return m183893o(i, i2, FirebaseAnalytics.Param.INDEX);
    }

    /* JADX INFO: renamed from: o */
    public static int m183893o(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        jwm.m143661a(m183879a(i, i2, str));
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public static <T> T m183894p(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: q */
    public static <T> T m183895q(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: r */
    public static <T> T m183896r(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        jfd0.m141176a(k0g0.m144049c(str, obj));
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static int m183897s(int i, int i2) {
        return m183898t(i, i2, FirebaseAnalytics.Param.INDEX);
    }

    /* JADX INFO: renamed from: t */
    public static int m183898t(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        jwm.m143661a(m183880b(i, i2, str));
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public static void m183899u(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            jwm.m143661a(m183881c(i, i2, i3));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m183900v(boolean z) {
        if (z) {
            return;
        }
        ohg0.m164364a();
    }

    /* JADX INFO: renamed from: w */
    public static void m183901w(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m183902x(boolean z, String str, int i) {
        if (z) {
            return;
        }
        qkq0.m175383a(k0g0.m144049c(str, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: y */
    public static void m183903y(boolean z, String str, long j) {
        if (z) {
            return;
        }
        qkq0.m175383a(k0g0.m144049c(str, Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: z */
    public static void m183904z(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        qkq0.m175383a(k0g0.m144049c(str, obj));
    }
}
