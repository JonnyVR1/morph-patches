package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class mwy0 {
    /* JADX INFO: renamed from: a */
    public static int m160610a(int i, int i2, String str) {
        String strM113256a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM113256a = cyy0.m113256a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                za50.m219101a("negative size: ", i2);
                return 0;
            }
            strM113256a = cyy0.m113256a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM113256a);
    }

    /* JADX INFO: renamed from: b */
    public static int m160611b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        kym.m151996a(m160613d(i, i2, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m160612c(int i, int i2, int i3) {
        String strM160613d;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM160613d = m160613d(i, i3, "start index");
            } else {
                strM160613d = (i2 < 0 || i2 > i3) ? m160613d(i2, i3, "end index") : cyy0.m113256a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM160613d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m160613d(int i, int i2, String str) {
        if (i < 0) {
            return cyy0.m113256a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return cyy0.m113256a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        za50.m219101a("negative size: ", i2);
        return null;
    }
}
