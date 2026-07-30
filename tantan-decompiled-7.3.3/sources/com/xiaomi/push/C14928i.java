package com.xiaomi.push;

import android.os.SystemClock;
import com.xiaomi.push.service.C14990am;
import com.xiaomi.push.service.XMPushService;
import java.util.Hashtable;
import p153l.mtq0;
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.i */
/* JADX INFO: loaded from: classes2.dex */
public class C14928i {

    /* JADX INFO: renamed from: a */
    private static final int f63520a = EnumC14881ei.PING_RTT.m86699a();

    /* JADX INFO: renamed from: b */
    private static long f63521b = 0;

    /* JADX INFO: renamed from: com.xiaomi.push.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        static Hashtable<Integer, Long> f63522a = new Hashtable<>();
    }

    /* JADX INFO: renamed from: a */
    public static void m87414a() {
        if (f63521b == 0 || SystemClock.elapsedRealtime() - f63521b > 7200000) {
            f63521b = SystemClock.elapsedRealtime();
            m87416c(0, f63520a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m87415b(int i) {
        C14882ej c14882ejM87048a = C14909h.m87046f().m87048a();
        c14882ejM87048a.m86702a(EnumC14881ei.CHANNEL_STATS_COUNTER.m86699a());
        c14882ejM87048a.m86714c(i);
        C14909h.m87046f().m87051i(c14882ejM87048a);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m87416c(int i, int i2) {
        try {
            if (i2 < 16777215) {
                a.f63522a.put(Integer.valueOf((i << 24) | i2), Long.valueOf(System.currentTimeMillis()));
            } else {
                ouq0.m169378B("stats key should less than 16777215");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m87417d(int i, int i2, int i3, String str, int i4) {
        C14882ej c14882ejM87048a = C14909h.m87046f().m87048a();
        c14882ejM87048a.m86701a((byte) i);
        c14882ejM87048a.m86702a(i2);
        c14882ejM87048a.m86709b(i3);
        c14882ejM87048a.m86710b(str);
        c14882ejM87048a.m86714c(i4);
        C14909h.m87046f().m87051i(c14882ejM87048a);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m87418e(int i, int i2, String str, int i3) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i4 = (i << 24) | i2;
            if (a.f63522a.containsKey(Integer.valueOf(i4))) {
                C14882ej c14882ejM87048a = C14909h.m87046f().m87048a();
                c14882ejM87048a.m86702a(i2);
                c14882ejM87048a.m86709b((int) (jCurrentTimeMillis - a.f63522a.get(Integer.valueOf(i4)).longValue()));
                c14882ejM87048a.m86710b(str);
                if (i3 > -1) {
                    c14882ejM87048a.m86714c(i3);
                }
                C14909h.m87046f().m87051i(c14882ejM87048a);
                a.f63522a.remove(Integer.valueOf(i2));
            } else {
                ouq0.m169378B("stats key not found");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m87419f(XMPushService xMPushService, C14990am.b bVar) {
        new C14876b(xMPushService, bVar).m86631a();
    }

    /* JADX INFO: renamed from: g */
    public static void m87420g(String str, int i, Exception exc) {
        C14882ej c14882ejM87048a = C14909h.m87046f().m87048a();
        if (C14909h.m87045e() != null && C14909h.m87045e().f62603a != null) {
            c14882ejM87048a.m86714c(mtq0.m160046v(C14909h.m87045e().f62603a) ? 1 : 0);
        }
        if (i > 0) {
            c14882ejM87048a.m86702a(EnumC14881ei.GSLB_REQUEST_SUCCESS.m86699a());
            c14882ejM87048a.m86710b(str);
            c14882ejM87048a.m86709b(i);
            C14909h.m87046f().m87051i(c14882ejM87048a);
            return;
        }
        try {
            C14879e.a aVarM86692a = C14879e.m86692a(exc);
            c14882ejM87048a.m86702a(aVarM86692a.f62501a.m86699a());
            c14882ejM87048a.m86715c(aVarM86692a.f62502b);
            c14882ejM87048a.m86710b(str);
            C14909h.m87046f().m87051i(c14882ejM87048a);
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m87421h(String str, Exception exc) {
        try {
            C14879e.a aVarM86694c = C14879e.m86694c(exc);
            C14882ej c14882ejM87048a = C14909h.m87046f().m87048a();
            c14882ejM87048a.m86702a(aVarM86694c.f62501a.m86699a());
            c14882ejM87048a.m86715c(aVarM86694c.f62502b);
            c14882ejM87048a.m86710b(str);
            if (C14909h.m87045e() != null && C14909h.m87045e().f62603a != null) {
                c14882ejM87048a.m86714c(mtq0.m160046v(C14909h.m87045e().f62603a) ? 1 : 0);
            }
            C14909h.m87046f().m87051i(c14882ejM87048a);
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m87422i() {
        C14883ek c14883ekM87049c = C14909h.m87046f().m87049c();
        if (c14883ekM87049c != null) {
            return C14936m.m87448e(c14883ekM87049c);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static void m87423j() {
        m87418e(0, f63520a, null, -1);
    }

    /* JADX INFO: renamed from: k */
    public static void m87424k(String str, Exception exc) {
        try {
            C14879e.a aVarM86696e = C14879e.m86696e(exc);
            C14882ej c14882ejM87048a = C14909h.m87046f().m87048a();
            c14882ejM87048a.m86702a(aVarM86696e.f62501a.m86699a());
            c14882ejM87048a.m86715c(aVarM86696e.f62502b);
            c14882ejM87048a.m86710b(str);
            if (C14909h.m87045e() != null && C14909h.m87045e().f62603a != null) {
                c14882ejM87048a.m86714c(mtq0.m160046v(C14909h.m87045e().f62603a) ? 1 : 0);
            }
            C14909h.m87046f().m87051i(c14882ejM87048a);
        } catch (NullPointerException unused) {
        }
    }
}
