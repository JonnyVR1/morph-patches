package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class m5s0 {
    /* JADX INFO: renamed from: a */
    public static int m153142a(int i, int i2, String str) {
        String strM129526a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM129526a = h6s0.m129526a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                k250.m144273a("negative size: ", i2);
                return 0;
            }
            strM129526a = h6s0.m129526a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM129526a);
    }

    /* JADX INFO: renamed from: b */
    public static int m153143b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        jwm.m143661a(m153147f(i, i2, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static Object m153144c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        jfd0.m141176a((String) obj2);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m153145d(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        ig3.m135964a(h6s0.m129526a(str, obj, obj2));
    }

    /* JADX INFO: renamed from: e */
    public static void m153146e(int i, int i2, int i3) {
        String strM153147f;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM153147f = m153147f(i, i3, "start index");
            } else {
                strM153147f = (i2 < 0 || i2 > i3) ? m153147f(i2, i3, "end index") : h6s0.m129526a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM153147f);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m153147f(int i, int i2, String str) {
        if (i < 0) {
            return h6s0.m129526a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return h6s0.m129526a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        k250.m144273a("negative size: ", i2);
        return null;
    }
}
