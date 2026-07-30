package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
public final class rf80 {
    /* JADX INFO: renamed from: a */
    public static String m179110a(int i, int i2, String str) {
        if (i < 0) {
            return m179120k("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return m179120k("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        k250.m144273a("negative size: ", i2);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m179111b(Boolean bool) {
        if (bool == null || bool.booleanValue()) {
            return;
        }
        x9g0.m207497a();
    }

    /* JADX INFO: renamed from: c */
    public static void m179112c(boolean z, Object obj) {
        if (z) {
            return;
        }
        pf80.m168601a(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m179113d(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        ig3.m135964a(m179120k(str, objArr));
    }

    /* JADX INFO: renamed from: e */
    public static int m179114e(int i, int i2) {
        return m179115f(i, i2, FirebaseAnalytics.Param.INDEX);
    }

    /* JADX INFO: renamed from: f */
    public static int m179115f(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        jwm.m143661a(m179110a(i, i2, str));
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m179116g(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: h */
    public static <T> T m179117h(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: i */
    public static void m179118i(boolean z) {
        if (z) {
            return;
        }
        ohg0.m164364a();
    }

    /* JADX INFO: renamed from: j */
    public static void m179119j(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m179120k(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i2)) != -1) {
            sb.append(strValueOf.substring(i2, iIndexOf));
            sb.append(objArr[i]);
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append(strValueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
