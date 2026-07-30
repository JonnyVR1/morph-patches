package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class j3y0 {
    /* JADX INFO: renamed from: a */
    public static int m143368a(int i, int i2, String str) {
        String strM171287a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM171287a = p8y0.m171287a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                za50.m219101a("negative size: ", i2);
                return 0;
            }
            strM171287a = p8y0.m171287a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM171287a);
    }

    /* JADX INFO: renamed from: b */
    public static int m143369b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        kym.m151996a(m143371d(i, i2, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m143370c(int i, int i2, int i3) {
        String strM143371d;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM143371d = m143371d(i, i3, "start index");
            } else {
                strM143371d = (i2 < 0 || i2 > i3) ? m143371d(i2, i3, "end index") : p8y0.m171287a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM143371d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m143371d(int i, int i2, String str) {
        if (i < 0) {
            return p8y0.m171287a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return p8y0.m171287a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        za50.m219101a("negative size: ", i2);
        return null;
    }
}
