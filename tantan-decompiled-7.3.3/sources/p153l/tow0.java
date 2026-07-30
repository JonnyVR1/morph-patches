package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class tow0 {
    /* JADX INFO: renamed from: a */
    public static int m192086a(int i, int i2, String str) {
        String strM121873b;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM121873b = epw0.m121873b("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                za50.m219101a("negative size: ", i2);
                return 0;
            }
            strM121873b = epw0.m121873b("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM121873b);
    }

    /* JADX INFO: renamed from: b */
    public static int m192087b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        kym.m151996a(m192096k(i, i2, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static Object m192088c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        mnd0.m159157a((String) obj2);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Object m192089d(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        mnd0.m159157a(epw0.m121873b(str, obj2));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static void m192090e(boolean z) {
        if (z) {
            return;
        }
        fig0.m125680a();
    }

    /* JADX INFO: renamed from: f */
    public static void m192091f(boolean z, Object obj) {
        if (z) {
            return;
        }
        wg3.m206174a((String) obj);
    }

    /* JADX INFO: renamed from: g */
    public static void m192092g(boolean z, String str, long j) {
        if (z) {
            return;
        }
        wg3.m206174a(epw0.m121873b(str, Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: h */
    public static void m192093h(int i, int i2, int i3) {
        String strM192096k;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM192096k = m192096k(i, i3, "start index");
            } else {
                strM192096k = (i2 < 0 || i2 > i3) ? m192096k(i2, i3, "end index") : epw0.m121873b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM192096k);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m192094i(boolean z) {
        if (z) {
            return;
        }
        wpg0.m207458a();
    }

    /* JADX INFO: renamed from: j */
    public static void m192095j(boolean z, Object obj) {
        if (z) {
            return;
        }
        wtq0.m207906a((String) obj);
    }

    /* JADX INFO: renamed from: k */
    public static String m192096k(int i, int i2, String str) {
        if (i < 0) {
            return epw0.m121873b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return epw0.m121873b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        za50.m219101a("negative size: ", i2);
        return null;
    }
}
