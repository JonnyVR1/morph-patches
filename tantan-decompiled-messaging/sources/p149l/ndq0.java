package p149l;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public class ndq0 {

    /* JADX INFO: renamed from: a */
    public static volatile Integer f138303a = null;

    /* JADX INFO: renamed from: b */
    public static volatile int f138304b = -1;

    /* JADX INFO: renamed from: c */
    public static volatile int f138305c = -1;

    /* JADX INFO: renamed from: d */
    public static volatile long f138306d = -1;

    /* JADX INFO: renamed from: a */
    public static int m159016a(Context context) {
        ArrayList arrayList = new ArrayList();
        m159018c(arrayList, m159022g());
        m159018c(arrayList, m159021f());
        m159018c(arrayList, m159024i(context));
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
    public static int m159017b(Context context) {
        long jM159025j = m159025j(context);
        if (jM159025j == -1) {
            return m159016a(context);
        }
        if (jM159025j <= 805306368) {
            return m159023h() <= 1 ? 2009 : 2010;
        }
        if (jM159025j <= 1073741824) {
            return m159020e() < 1300000 ? 2011 : 2012;
        }
        if (jM159025j <= 1610612736) {
            return nyd.m161985b() < 1800000 ? 2012 : 2013;
        }
        if (jM159025j <= 2147483648L) {
            return 2013;
        }
        if (jM159025j <= 3221225472L) {
            return 2014;
        }
        if (jM159025j <= OSSConstants.DEFAULT_FILE_SIZE_LIMIT) {
            return 2015;
        }
        return TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC;
    }

    /* JADX INFO: renamed from: c */
    public static void m159018c(ArrayList<Integer> arrayList, int i) {
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m159019d(Context context) {
        if (f138303a == null) {
            synchronized (ndq0.class) {
                try {
                    if (f138303a == null) {
                        f138303a = Integer.valueOf(m159017b(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f138303a.intValue();
    }

    /* JADX INFO: renamed from: e */
    public static long m159020e() {
        if (f138305c == -1) {
            f138305c = nyd.m161985b();
        }
        return f138305c;
    }

    /* JADX INFO: renamed from: f */
    public static int m159021f() {
        long jM161985b = nyd.m161985b();
        if (jM161985b == -1) {
            return -1;
        }
        if (jM161985b <= 528000) {
            return 2008;
        }
        if (jM161985b <= 620000) {
            return 2009;
        }
        if (jM161985b <= 1020000) {
            return 2010;
        }
        if (jM161985b <= 1220000) {
            return 2011;
        }
        if (jM161985b <= 1520000) {
            return 2012;
        }
        return jM161985b <= 2020000 ? 2013 : 2014;
    }

    /* JADX INFO: renamed from: g */
    public static int m159022g() throws Throwable {
        int iM161989f = nyd.m161989f();
        if (iM161989f < 1) {
            return -1;
        }
        if (iM161989f == 1) {
            return 2008;
        }
        return iM161989f <= 3 ? 2011 : 2012;
    }

    /* JADX INFO: renamed from: h */
    public static int m159023h() {
        if (f138304b == -1) {
            f138304b = nyd.m161989f();
        }
        return f138304b;
    }

    /* JADX INFO: renamed from: i */
    public static int m159024i(Context context) {
        long jM161990g = nyd.m161990g(context);
        if (jM161990g <= 0) {
            return -1;
        }
        if (jM161990g <= 201326592) {
            return 2008;
        }
        if (jM161990g <= 304087040) {
            return 2009;
        }
        if (jM161990g <= 536870912) {
            return 2010;
        }
        if (jM161990g <= 1073741824) {
            return 2011;
        }
        if (jM161990g <= 1610612736) {
            return 2012;
        }
        return jM161990g <= 2147483648L ? 2013 : 2014;
    }

    /* JADX INFO: renamed from: j */
    public static long m159025j(Context context) {
        if (f138306d == -1) {
            f138306d = nyd.m161990g(context);
        }
        return f138306d;
    }
}
