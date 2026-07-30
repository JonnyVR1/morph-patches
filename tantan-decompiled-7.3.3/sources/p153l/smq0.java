package p153l;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public class smq0 {

    /* JADX INFO: renamed from: a */
    public static volatile Integer f169604a = null;

    /* JADX INFO: renamed from: b */
    public static volatile int f169605b = -1;

    /* JADX INFO: renamed from: c */
    public static volatile int f169606c = -1;

    /* JADX INFO: renamed from: d */
    public static volatile long f169607d = -1;

    /* JADX INFO: renamed from: a */
    public static int m186832a(Context context) {
        ArrayList arrayList = new ArrayList();
        m186834c(arrayList, m186838g());
        m186834c(arrayList, m186837f());
        m186834c(arrayList, m186840i(context));
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
    public static int m186833b(Context context) {
        long jM186841j = m186841j(context);
        if (jM186841j == -1) {
            return m186832a(context);
        }
        if (jM186841j <= 805306368) {
            return m186839h() <= 1 ? 2009 : 2010;
        }
        if (jM186841j <= 1073741824) {
            return m186836e() < 1300000 ? 2011 : 2012;
        }
        if (jM186841j <= 1610612736) {
            return a0e.m95334b() < 1800000 ? 2012 : 2013;
        }
        if (jM186841j <= 2147483648L) {
            return 2013;
        }
        if (jM186841j <= 3221225472L) {
            return 2014;
        }
        if (jM186841j <= OSSConstants.DEFAULT_FILE_SIZE_LIMIT) {
            return 2015;
        }
        return TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC;
    }

    /* JADX INFO: renamed from: c */
    public static void m186834c(ArrayList<Integer> arrayList, int i) {
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m186835d(Context context) {
        if (f169604a == null) {
            synchronized (smq0.class) {
                try {
                    if (f169604a == null) {
                        f169604a = Integer.valueOf(m186833b(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f169604a.intValue();
    }

    /* JADX INFO: renamed from: e */
    public static long m186836e() {
        if (f169606c == -1) {
            f169606c = a0e.m95334b();
        }
        return f169606c;
    }

    /* JADX INFO: renamed from: f */
    public static int m186837f() {
        long jM95334b = a0e.m95334b();
        if (jM95334b == -1) {
            return -1;
        }
        if (jM95334b <= 528000) {
            return 2008;
        }
        if (jM95334b <= 620000) {
            return 2009;
        }
        if (jM95334b <= 1020000) {
            return 2010;
        }
        if (jM95334b <= 1220000) {
            return 2011;
        }
        if (jM95334b <= 1520000) {
            return 2012;
        }
        return jM95334b <= 2020000 ? 2013 : 2014;
    }

    /* JADX INFO: renamed from: g */
    public static int m186838g() throws Throwable {
        int iM95338f = a0e.m95338f();
        if (iM95338f < 1) {
            return -1;
        }
        if (iM95338f == 1) {
            return 2008;
        }
        return iM95338f <= 3 ? 2011 : 2012;
    }

    /* JADX INFO: renamed from: h */
    public static int m186839h() {
        if (f169605b == -1) {
            f169605b = a0e.m95338f();
        }
        return f169605b;
    }

    /* JADX INFO: renamed from: i */
    public static int m186840i(Context context) {
        long jM95339g = a0e.m95339g(context);
        if (jM95339g <= 0) {
            return -1;
        }
        if (jM95339g <= 201326592) {
            return 2008;
        }
        if (jM95339g <= 304087040) {
            return 2009;
        }
        if (jM95339g <= 536870912) {
            return 2010;
        }
        if (jM95339g <= 1073741824) {
            return 2011;
        }
        if (jM95339g <= 1610612736) {
            return 2012;
        }
        return jM95339g <= 2147483648L ? 2013 : 2014;
    }

    /* JADX INFO: renamed from: j */
    public static long m186841j(Context context) {
        if (f169607d == -1) {
            f169607d = a0e.m95339g(context);
        }
        return f169607d;
    }
}
