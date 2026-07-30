package p149l;

import android.os.Handler;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ft10 {

    /* JADX INFO: renamed from: a */
    private static volatile rr10 f99123a = null;

    /* JADX INFO: renamed from: b */
    private static volatile Handler f99124b = null;

    /* JADX INFO: renamed from: c */
    private static String f99125c = null;

    /* JADX INFO: renamed from: d */
    private static int f99126d = 0;

    /* JADX INFO: renamed from: e */
    private static int f99127e = 0;

    /* JADX INFO: renamed from: f */
    private static boolean f99128f = true;

    /* JADX INFO: renamed from: g */
    private static boolean f99129g = false;

    /* JADX INFO: renamed from: h */
    private static boolean f99130h = false;

    /* JADX INFO: renamed from: i */
    private static long f99131i = 0;

    /* JADX INFO: renamed from: j */
    private static long f99132j = -2;

    /* JADX INFO: renamed from: k */
    private static List<Object> f99133k;

    /* JADX INFO: renamed from: a */
    private static void m122987a() {
        List<Object> list = f99133k;
        if (list != null) {
            list.clear();
            f99133k = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m122988b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static long m122989c() {
        return f99132j;
    }

    /* JADX INFO: renamed from: d */
    public static rr10 m122990d(boolean z) {
        if (f99123a == null) {
            synchronized (ft10.class) {
                try {
                    if (f99123a == null) {
                        f99123a = new rr10(m122988b(), z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f99123a;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m122991e(String str, int i, int i2) {
        return str != null && str.equals(f99125c) && i == f99126d && i2 == f99127e;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m122992f() {
        return f99123a != null && f99123a.m180501h() && f99129g;
    }

    /* JADX INFO: renamed from: g */
    public static void m122993g() {
        m122994h(-111L);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m122994h(long j) {
        MDLog.m7389d("MusicUtils---xfy---", "pause " + f99129g);
        long j2 = f99132j;
        if (j2 != j && j2 != Long.MIN_VALUE) {
            return false;
        }
        if (m122992f()) {
            f99123a.m180502i();
            f99129g = false;
            f99130h = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static void m122995i() {
        if (f99124b != null) {
            f99124b.removeCallbacksAndMessages(null);
        }
        f99124b = null;
        m122996j();
        m122987a();
        if (f99123a != null) {
            if (f99123a.m180501h()) {
                f99123a.m180502i();
            }
            f99123a.m180503j();
        }
        f99123a = null;
        f99131i = 0L;
    }

    /* JADX INFO: renamed from: j */
    public static void m122996j() {
        m122997k();
        f99125c = null;
        f99129g = false;
        f99130h = false;
    }

    /* JADX INFO: renamed from: k */
    private static void m122997k() {
        if (f99123a != null) {
            f99123a.m180504k();
        }
        f99128f = true;
        f99129g = false;
        f99130h = false;
    }

    /* JADX INFO: renamed from: l */
    public static void m122998l(float f) throws IllegalStateException {
        m122999m(f99132j, f);
    }

    /* JADX INFO: renamed from: m */
    private static void m122999m(long j, float f) {
        f99132j = j;
        if (f99123a == null || f99128f) {
            return;
        }
        f99123a.m180505l(f);
        f99129g = true;
        f99130h = false;
    }

    /* JADX INFO: renamed from: n */
    public static void m123000n(int i) {
        if (f99123a != null) {
            f99123a.m180508o(i);
        }
    }

    /* JADX INFO: renamed from: o */
    private static boolean m123001o(String str, int i, int i2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (f99125c != null && m122991e(str, i, i2)) {
            return true;
        }
        m122990d(z);
        m122996j();
        f99125c = str;
        f99126d = i;
        f99127e = i2;
        try {
            boolean zM180506m = f99123a.m180506m(f99125c);
            f99128f = false;
            return zM180506m;
        } catch (IOException e) {
            MDLog.printErrStackTrace("MusicUtils---xfy---", e);
            f99128f = true;
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m123002p(long j, int i, int i2, boolean z, float f) throws IllegalStateException {
        StringBuilder sb = new StringBuilder("start ");
        sb.append(f99128f);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(f99123a != null);
        MDLog.m7389d("MusicUtils---xfy---", sb.toString());
        f99132j = j;
        if (f99123a == null || f99128f) {
            return;
        }
        f99123a.m180509p(i, i2, z, f);
        f99129g = true;
        f99130h = false;
    }

    /* JADX INFO: renamed from: q */
    private static long m123003q(String str, long j, int i, int i2, float f, boolean z) {
        if (m122988b() || str == null) {
            return 0L;
        }
        boolean zM122991e = m122991e(str, i, i2);
        if (!zM122991e) {
            m123001o(str, i, i2, z);
        }
        m123002p(j, i, i2, zM122991e, f);
        return j;
    }

    /* JADX INFO: renamed from: r */
    public static long m123004r(String str, int i, int i2, float f, boolean z) {
        MDLog.m7395i("SDK_VIDEO_SDK", "startPlayForRecording startOfMs" + i);
        MDLog.m7395i("SDK_VIDEO_SDK", "startPlayForRecording endOfMs" + i2);
        return m123003q(str, -111L, i, i2, f, z);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m123005s(long j) {
        long j2 = f99132j;
        if (j2 != j && j2 != Long.MIN_VALUE) {
            return false;
        }
        if (f99123a != null) {
            f99123a.m180510q();
            f99129g = false;
            f99130h = false;
        }
        f99125c = null;
        return true;
    }
}
