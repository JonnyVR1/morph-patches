package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes6.dex */
@NullMarked
public final class tuy0 {
    /* JADX INFO: renamed from: a */
    public static int m192766a(int i, int i2, String str) {
        String strM108086a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM108086a = c5z0.m108086a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                za50.m219101a("negative size: ", i2);
                return 0;
            }
            strM108086a = c5z0.m108086a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM108086a);
    }

    /* JADX INFO: renamed from: b */
    public static int m192767b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        kym.m151996a(m192769d(i, i2, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m192768c(int i, int i2, int i3) {
        String strM192769d;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM192769d = m192769d(i, i3, "start index");
            } else {
                strM192769d = (i2 < 0 || i2 > i3) ? m192769d(i2, i3, "end index") : c5z0.m108086a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM192769d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m192769d(int i, int i2, String str) {
        if (i < 0) {
            return c5z0.m108086a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return c5z0.m108086a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        za50.m219101a("negative size: ", i2);
        return null;
    }
}
