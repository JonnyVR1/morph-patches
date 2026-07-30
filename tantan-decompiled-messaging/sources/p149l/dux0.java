package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class dux0 {
    /* JADX INFO: renamed from: a */
    public static int m113749a(int i, int i2, String str) {
        String strM143966a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM143966a = jzx0.m143966a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                k250.m144273a("negative size: ", i2);
                return 0;
            }
            strM143966a = jzx0.m143966a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM143966a);
    }

    /* JADX INFO: renamed from: b */
    public static int m113750b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        jwm.m143661a(m113752d(i, i2, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m113751c(int i, int i2, int i3) {
        String strM113752d;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM113752d = m113752d(i, i3, "start index");
            } else {
                strM113752d = (i2 < 0 || i2 > i3) ? m113752d(i2, i3, "end index") : jzx0.m143966a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM113752d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m113752d(int i, int i2, String str) {
        if (i < 0) {
            return jzx0.m143966a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return jzx0.m143966a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        k250.m144273a("negative size: ", i2);
        return null;
    }
}
