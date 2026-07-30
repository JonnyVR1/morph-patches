package p009l;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ndq0 {

    /* JADX INFO: renamed from: a */
    public static volatile Integer f17424a = null;

    /* JADX INFO: renamed from: b */
    public static volatile int f17425b = -1;

    /* JADX INFO: renamed from: c */
    public static volatile int f17426c = -1;

    /* JADX INFO: renamed from: d */
    public static volatile long f17427d = -1;

    /* JADX INFO: renamed from: a */
    public static int m18855a(Context context) {
        ArrayList arrayList = new ArrayList();
        m18857c(arrayList, m18861g());
        m18857c(arrayList, m18860f());
        m18857c(arrayList, m18863i(context));
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = arrayList.size() / 2;
        int i = size - 1;
        return ((Integer) arrayList.get(i)).intValue() + ((((Integer) arrayList.get(size)).intValue() - ((Integer) arrayList.get(i)).intValue()) / 2);
    }

    /* JADX INFO: renamed from: b */
    public static int m18856b(Context context) {
        long jM18864j = m18864j(context);
        if (jM18864j == -1) {
            return m18855a(context);
        }
        if (jM18864j <= 805306368) {
            return m18862h() <= 1 ? 2009 : 2010;
        }
        if (jM18864j <= 1073741824) {
            return m18859e() < 1300000 ? 2011 : 2012;
        }
        if (jM18864j <= 1610612736) {
            return nyd.m19534b() < 1800000 ? 2012 : 2013;
        }
        if (jM18864j <= 2147483648L) {
            return 2013;
        }
        if (jM18864j <= 3221225472L) {
            return 2014;
        }
        return jM18864j <= 5368709120L ? 2015 : 2016;
    }

    /* JADX INFO: renamed from: c */
    public static void m18857c(ArrayList<Integer> arrayList, int i) {
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m18858d(Context context) {
        if (f17424a == null) {
            synchronized (ndq0.class) {
                try {
                    if (f17424a == null) {
                        f17424a = Integer.valueOf(m18856b(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17424a.intValue();
    }

    /* JADX INFO: renamed from: e */
    public static long m18859e() {
        if (f17426c == -1) {
            f17426c = nyd.m19534b();
        }
        return f17426c;
    }

    /* JADX INFO: renamed from: f */
    public static int m18860f() {
        long jM19534b = nyd.m19534b();
        if (jM19534b == -1) {
            return -1;
        }
        if (jM19534b <= 528000) {
            return 2008;
        }
        if (jM19534b <= 620000) {
            return 2009;
        }
        if (jM19534b <= 1020000) {
            return 2010;
        }
        if (jM19534b <= 1220000) {
            return 2011;
        }
        if (jM19534b <= 1520000) {
            return 2012;
        }
        return jM19534b <= 2020000 ? 2013 : 2014;
    }

    /* JADX INFO: renamed from: g */
    public static int m18861g() throws Throwable {
        int iM19538f = nyd.m19538f();
        if (iM19538f < 1) {
            return -1;
        }
        if (iM19538f == 1) {
            return 2008;
        }
        return iM19538f <= 3 ? 2011 : 2012;
    }

    /* JADX INFO: renamed from: h */
    public static int m18862h() {
        if (f17425b == -1) {
            f17425b = nyd.m19538f();
        }
        return f17425b;
    }

    /* JADX INFO: renamed from: i */
    public static int m18863i(Context context) {
        long jM19539g = nyd.m19539g(context);
        if (jM19539g <= 0) {
            return -1;
        }
        if (jM19539g <= 201326592) {
            return 2008;
        }
        if (jM19539g <= 304087040) {
            return 2009;
        }
        if (jM19539g <= 536870912) {
            return 2010;
        }
        if (jM19539g <= 1073741824) {
            return 2011;
        }
        if (jM19539g <= 1610612736) {
            return 2012;
        }
        return jM19539g <= 2147483648L ? 2013 : 2014;
    }

    /* JADX INFO: renamed from: j */
    public static long m18864j(Context context) {
        if (f17427d == -1) {
            f17427d = nyd.m19539g(context);
        }
        return f17427d;
    }
}
