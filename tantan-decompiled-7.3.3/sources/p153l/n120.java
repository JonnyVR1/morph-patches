package p153l;

import android.os.Handler;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class n120 {

    /* JADX INFO: renamed from: a */
    private static volatile zz10 f139704a = null;

    /* JADX INFO: renamed from: b */
    private static volatile Handler f139705b = null;

    /* JADX INFO: renamed from: c */
    private static String f139706c = null;

    /* JADX INFO: renamed from: d */
    private static int f139707d = 0;

    /* JADX INFO: renamed from: e */
    private static int f139708e = 0;

    /* JADX INFO: renamed from: f */
    private static boolean f139709f = true;

    /* JADX INFO: renamed from: g */
    private static boolean f139710g = false;

    /* JADX INFO: renamed from: h */
    private static boolean f139711h = false;

    /* JADX INFO: renamed from: i */
    private static long f139712i = 0;

    /* JADX INFO: renamed from: j */
    private static long f139713j = -2;

    /* JADX INFO: renamed from: k */
    private static List<Object> f139714k;

    /* JADX INFO: renamed from: a */
    private static void m161057a() {
        List<Object> list = f139714k;
        if (list != null) {
            list.clear();
            f139714k = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m161058b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static long m161059c() {
        return f139713j;
    }

    /* JADX INFO: renamed from: d */
    public static zz10 m161060d(boolean z) {
        if (f139704a == null) {
            synchronized (n120.class) {
                try {
                    if (f139704a == null) {
                        f139704a = new zz10(m161058b(), z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f139704a;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m161061e(String str, int i, int i2) {
        return str != null && str.equals(f139706c) && i == f139707d && i2 == f139708e;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m161062f() {
        return f139704a != null && f139704a.m222221h() && f139710g;
    }

    /* JADX INFO: renamed from: g */
    public static void m161063g() {
        m161064h(-111L);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m161064h(long j) {
        MDLog.m7443d("MusicUtils---xfy---", "pause " + f139710g);
        long j2 = f139713j;
        if (j2 != j && j2 != Long.MIN_VALUE) {
            return false;
        }
        if (m161062f()) {
            f139704a.m222222i();
            f139710g = false;
            f139711h = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static void m161065i() {
        if (f139705b != null) {
            f139705b.removeCallbacksAndMessages(null);
        }
        f139705b = null;
        m161066j();
        m161057a();
        if (f139704a != null) {
            if (f139704a.m222221h()) {
                f139704a.m222222i();
            }
            f139704a.m222223j();
        }
        f139704a = null;
        f139712i = 0L;
    }

    /* JADX INFO: renamed from: j */
    public static void m161066j() {
        m161067k();
        f139706c = null;
        f139710g = false;
        f139711h = false;
    }

    /* JADX INFO: renamed from: k */
    private static void m161067k() {
        if (f139704a != null) {
            f139704a.m222224k();
        }
        f139709f = true;
        f139710g = false;
        f139711h = false;
    }

    /* JADX INFO: renamed from: l */
    public static void m161068l(float f) throws IllegalStateException {
        m161069m(f139713j, f);
    }

    /* JADX INFO: renamed from: m */
    private static void m161069m(long j, float f) {
        f139713j = j;
        if (f139704a == null || f139709f) {
            return;
        }
        f139704a.m222225l(f);
        f139710g = true;
        f139711h = false;
    }

    /* JADX INFO: renamed from: n */
    public static void m161070n(int i) {
        if (f139704a != null) {
            f139704a.m222228o(i);
        }
    }

    /* JADX INFO: renamed from: o */
    private static boolean m161071o(String str, int i, int i2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (f139706c != null && m161061e(str, i, i2)) {
            return true;
        }
        m161060d(z);
        m161066j();
        f139706c = str;
        f139707d = i;
        f139708e = i2;
        try {
            boolean zM222226m = f139704a.m222226m(f139706c);
            f139709f = false;
            return zM222226m;
        } catch (IOException e) {
            MDLog.printErrStackTrace("MusicUtils---xfy---", e);
            f139709f = true;
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m161072p(long j, int i, int i2, boolean z, float f) throws IllegalStateException {
        StringBuilder sb = new StringBuilder("start ");
        sb.append(f139709f);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(f139704a != null);
        MDLog.m7443d("MusicUtils---xfy---", sb.toString());
        f139713j = j;
        if (f139704a == null || f139709f) {
            return;
        }
        f139704a.m222229p(i, i2, z, f);
        f139710g = true;
        f139711h = false;
    }

    /* JADX INFO: renamed from: q */
    private static long m161073q(String str, long j, int i, int i2, float f, boolean z) {
        if (m161058b() || str == null) {
            return 0L;
        }
        boolean zM161061e = m161061e(str, i, i2);
        if (!zM161061e) {
            m161071o(str, i, i2, z);
        }
        m161072p(j, i, i2, zM161061e, f);
        return j;
    }

    /* JADX INFO: renamed from: r */
    public static long m161074r(String str, int i, int i2, float f, boolean z) {
        MDLog.m7449i("SDK_VIDEO_SDK", "startPlayForRecording startOfMs" + i);
        MDLog.m7449i("SDK_VIDEO_SDK", "startPlayForRecording endOfMs" + i2);
        return m161073q(str, -111L, i, i2, f, z);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m161075s(long j) {
        long j2 = f139713j;
        if (j2 != j && j2 != Long.MIN_VALUE) {
            return false;
        }
        if (f139704a != null) {
            f139704a.m222230q();
            f139710g = false;
            f139711h = false;
        }
        f139706c = null;
        return true;
    }
}
