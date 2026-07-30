package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
public final class wn80 {
    /* JADX INFO: renamed from: a */
    public static String m207176a(int i, int i2, String str) {
        if (i < 0) {
            return m207186k("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return m207186k("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        za50.m219101a("negative size: ", i2);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m207177b(Boolean bool) {
        if (bool == null || bool.booleanValue()) {
            return;
        }
        fig0.m125680a();
    }

    /* JADX INFO: renamed from: c */
    public static void m207178c(boolean z, Object obj) {
        if (z) {
            return;
        }
        un80.m196830a(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m207179d(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        wg3.m206174a(m207186k(str, objArr));
    }

    /* JADX INFO: renamed from: e */
    public static int m207180e(int i, int i2) {
        return m207181f(i, i2, FirebaseAnalytics.Param.INDEX);
    }

    /* JADX INFO: renamed from: f */
    public static int m207181f(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        kym.m151996a(m207176a(i, i2, str));
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m207182g(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: h */
    public static <T> T m207183h(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: i */
    public static void m207184i(boolean z) {
        if (z) {
            return;
        }
        wpg0.m207458a();
    }

    /* JADX INFO: renamed from: j */
    public static void m207185j(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m207186k(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i2)) != -1) {
            sb.append(strValueOf.substring(i2, iIndexOf));
            sb.append(objArr[i]);
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append(strValueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
