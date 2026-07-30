package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class avt0 {
    /* JADX INFO: renamed from: a */
    public static int m100519a(int i, int i2, String str) {
        String strM142392a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM142392a = iwt0.m142392a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                za50.m219101a("negative size: ", i2);
                return 0;
            }
            strM142392a = iwt0.m142392a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM142392a);
    }

    /* JADX INFO: renamed from: b */
    public static int m100520b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        kym.m151996a(m100522d(i, i2, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m100521c(int i, int i2, int i3) {
        String strM100522d;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM100522d = m100522d(i, i3, "start index");
            } else {
                strM100522d = (i2 < 0 || i2 > i3) ? m100522d(i2, i3, "end index") : iwt0.m142392a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM100522d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m100522d(int i, int i2, String str) {
        if (i < 0) {
            return iwt0.m142392a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return iwt0.m142392a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        za50.m219101a("negative size: ", i2);
        return null;
    }
}
