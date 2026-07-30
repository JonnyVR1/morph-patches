package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class nfw0 {
    /* JADX INFO: renamed from: a */
    public static int m159279a(int i, int i2, String str) {
        String strM214594b;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM214594b = yfw0.m214594b("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                k250.m144273a("negative size: ", i2);
                return 0;
            }
            strM214594b = yfw0.m214594b("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM214594b);
    }

    /* JADX INFO: renamed from: b */
    public static int m159280b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        jwm.m143661a(m159289k(i, i2, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static Object m159281c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        jfd0.m141176a((String) obj2);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Object m159282d(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        jfd0.m141176a(yfw0.m214594b(str, obj2));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static void m159283e(boolean z) {
        if (z) {
            return;
        }
        x9g0.m207497a();
    }

    /* JADX INFO: renamed from: f */
    public static void m159284f(boolean z, Object obj) {
        if (z) {
            return;
        }
        ig3.m135964a((String) obj);
    }

    /* JADX INFO: renamed from: g */
    public static void m159285g(boolean z, String str, long j) {
        if (z) {
            return;
        }
        ig3.m135964a(yfw0.m214594b(str, Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: h */
    public static void m159286h(int i, int i2, int i3) {
        String strM159289k;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM159289k = m159289k(i, i3, "start index");
            } else {
                strM159289k = (i2 < 0 || i2 > i3) ? m159289k(i2, i3, "end index") : yfw0.m214594b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM159289k);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m159287i(boolean z) {
        if (z) {
            return;
        }
        ohg0.m164364a();
    }

    /* JADX INFO: renamed from: j */
    public static void m159288j(boolean z, Object obj) {
        if (z) {
            return;
        }
        qkq0.m175383a((String) obj);
    }

    /* JADX INFO: renamed from: k */
    public static String m159289k(int i, int i2, String str) {
        if (i < 0) {
            return yfw0.m214594b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return yfw0.m214594b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        k250.m144273a("negative size: ", i2);
        return null;
    }
}
