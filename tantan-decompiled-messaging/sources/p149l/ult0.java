package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class ult0 {
    /* JADX INFO: renamed from: a */
    public static int m194265a(int i, int i2, String str) {
        String strM107833a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM107833a = cnt0.m107833a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                k250.m144273a("negative size: ", i2);
                return 0;
            }
            strM107833a = cnt0.m107833a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM107833a);
    }

    /* JADX INFO: renamed from: b */
    public static int m194266b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        jwm.m143661a(m194268d(i, i2, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m194267c(int i, int i2, int i3) {
        String strM194268d;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM194268d = m194268d(i, i3, "start index");
            } else {
                strM194268d = (i2 < 0 || i2 > i3) ? m194268d(i2, i3, "end index") : cnt0.m107833a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM194268d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m194268d(int i, int i2, String str) {
        if (i < 0) {
            return cnt0.m107833a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return cnt0.m107833a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        k250.m144273a("negative size: ", i2);
        return null;
    }
}
