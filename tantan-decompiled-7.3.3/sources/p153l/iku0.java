package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class iku0 {
    /* JADX INFO: renamed from: a */
    public static int m140416a(int i, int i2, String str) {
        String strM172884a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM172884a = plu0.m172884a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                za50.m219101a("negative size: ", i2);
                return 0;
            }
            strM172884a = plu0.m172884a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM172884a);
    }

    /* JADX INFO: renamed from: b */
    public static int m140417b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        kym.m151996a(m140419d(i, i2, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m140418c(int i, int i2, int i3) {
        String strM140419d;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM140419d = m140419d(i, i3, "start index");
            } else {
                strM140419d = (i2 < 0 || i2 > i3) ? m140419d(i2, i3, "end index") : plu0.m172884a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM140419d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m140419d(int i, int i2, String str) {
        if (i < 0) {
            return plu0.m172884a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return plu0.m172884a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        za50.m219101a("negative size: ", i2);
        return null;
    }
}
