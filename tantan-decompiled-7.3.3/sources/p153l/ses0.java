package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class ses0 {
    /* JADX INFO: renamed from: a */
    public static int m185566a(int i, int i2, String str) {
        String strM162939a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM162939a = nfs0.m162939a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                za50.m219101a("negative size: ", i2);
                return 0;
            }
            strM162939a = nfs0.m162939a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM162939a);
    }

    /* JADX INFO: renamed from: b */
    public static int m185567b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        kym.m151996a(m185571f(i, i2, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static Object m185568c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        mnd0.m159157a((String) obj2);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m185569d(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        wg3.m206174a(nfs0.m162939a(str, obj, obj2));
    }

    /* JADX INFO: renamed from: e */
    public static void m185570e(int i, int i2, int i3) {
        String strM185571f;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM185571f = m185571f(i, i3, "start index");
            } else {
                strM185571f = (i2 < 0 || i2 > i3) ? m185571f(i2, i3, "end index") : nfs0.m162939a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM185571f);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m185571f(int i, int i2, String str) {
        if (i < 0) {
            return nfs0.m162939a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return nfs0.m162939a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        za50.m219101a("negative size: ", i2);
        return null;
    }
}
