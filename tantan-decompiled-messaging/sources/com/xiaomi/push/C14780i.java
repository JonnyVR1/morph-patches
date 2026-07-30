package com.xiaomi.push;

import android.os.SystemClock;
import com.xiaomi.push.service.C14842am;
import com.xiaomi.push.service.XMPushService;
import java.util.Hashtable;
import p149l.gkq0;
import p149l.ilq0;

/* JADX INFO: renamed from: com.xiaomi.push.i */
/* JADX INFO: loaded from: classes2.dex */
public class C14780i {

    /* JADX INFO: renamed from: a */
    private static final int f62673a = EnumC14733ei.PING_RTT.m85528a();

    /* JADX INFO: renamed from: b */
    private static long f62674b = 0;

    /* JADX INFO: renamed from: com.xiaomi.push.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        static Hashtable<Integer, Long> f62675a = new Hashtable<>();
    }

    /* JADX INFO: renamed from: a */
    public static void m86243a() {
        if (f62674b == 0 || SystemClock.elapsedRealtime() - f62674b > 7200000) {
            f62674b = SystemClock.elapsedRealtime();
            m86245c(0, f62673a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m86244b(int i) {
        C14734ej c14734ejM85877a = C14761h.m85875f().m85877a();
        c14734ejM85877a.m85531a(EnumC14733ei.CHANNEL_STATS_COUNTER.m85528a());
        c14734ejM85877a.m85543c(i);
        C14761h.m85875f().m85880i(c14734ejM85877a);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m86245c(int i, int i2) {
        try {
            if (i2 < 16777215) {
                a.f62675a.put(Integer.valueOf((i << 24) | i2), Long.valueOf(System.currentTimeMillis()));
            } else {
                ilq0.m137025B("stats key should less than 16777215");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m86246d(int i, int i2, int i3, String str, int i4) {
        C14734ej c14734ejM85877a = C14761h.m85875f().m85877a();
        c14734ejM85877a.m85530a((byte) i);
        c14734ejM85877a.m85531a(i2);
        c14734ejM85877a.m85538b(i3);
        c14734ejM85877a.m85539b(str);
        c14734ejM85877a.m85543c(i4);
        C14761h.m85875f().m85880i(c14734ejM85877a);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m86247e(int i, int i2, String str, int i3) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i4 = (i << 24) | i2;
            if (a.f62675a.containsKey(Integer.valueOf(i4))) {
                C14734ej c14734ejM85877a = C14761h.m85875f().m85877a();
                c14734ejM85877a.m85531a(i2);
                c14734ejM85877a.m85538b((int) (jCurrentTimeMillis - a.f62675a.get(Integer.valueOf(i4)).longValue()));
                c14734ejM85877a.m85539b(str);
                if (i3 > -1) {
                    c14734ejM85877a.m85543c(i3);
                }
                C14761h.m85875f().m85880i(c14734ejM85877a);
                a.f62675a.remove(Integer.valueOf(i2));
            } else {
                ilq0.m137025B("stats key not found");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m86248f(XMPushService xMPushService, C14842am.b bVar) {
        new C14728b(xMPushService, bVar).m85460a();
    }

    /* JADX INFO: renamed from: g */
    public static void m86249g(String str, int i, Exception exc) {
        C14734ej c14734ejM85877a = C14761h.m85875f().m85877a();
        if (C14761h.m85874e() != null && C14761h.m85874e().f61756a != null) {
            c14734ejM85877a.m85543c(gkq0.m126693v(C14761h.m85874e().f61756a) ? 1 : 0);
        }
        if (i > 0) {
            c14734ejM85877a.m85531a(EnumC14733ei.GSLB_REQUEST_SUCCESS.m85528a());
            c14734ejM85877a.m85539b(str);
            c14734ejM85877a.m85538b(i);
            C14761h.m85875f().m85880i(c14734ejM85877a);
            return;
        }
        try {
            C14731e.a aVarM85521a = C14731e.m85521a(exc);
            c14734ejM85877a.m85531a(aVarM85521a.f61654a.m85528a());
            c14734ejM85877a.m85544c(aVarM85521a.f61655b);
            c14734ejM85877a.m85539b(str);
            C14761h.m85875f().m85880i(c14734ejM85877a);
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m86250h(String str, Exception exc) {
        try {
            C14731e.a aVarM85523c = C14731e.m85523c(exc);
            C14734ej c14734ejM85877a = C14761h.m85875f().m85877a();
            c14734ejM85877a.m85531a(aVarM85523c.f61654a.m85528a());
            c14734ejM85877a.m85544c(aVarM85523c.f61655b);
            c14734ejM85877a.m85539b(str);
            if (C14761h.m85874e() != null && C14761h.m85874e().f61756a != null) {
                c14734ejM85877a.m85543c(gkq0.m126693v(C14761h.m85874e().f61756a) ? 1 : 0);
            }
            C14761h.m85875f().m85880i(c14734ejM85877a);
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m86251i() {
        C14735ek c14735ekM85878c = C14761h.m85875f().m85878c();
        if (c14735ekM85878c != null) {
            return C14788m.m86277e(c14735ekM85878c);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static void m86252j() {
        m86247e(0, f62673a, null, -1);
    }

    /* JADX INFO: renamed from: k */
    public static void m86253k(String str, Exception exc) {
        try {
            C14731e.a aVarM85525e = C14731e.m85525e(exc);
            C14734ej c14734ejM85877a = C14761h.m85875f().m85877a();
            c14734ejM85877a.m85531a(aVarM85525e.f61654a.m85528a());
            c14734ejM85877a.m85544c(aVarM85525e.f61655b);
            c14734ejM85877a.m85539b(str);
            if (C14761h.m85874e() != null && C14761h.m85874e().f61756a != null) {
                c14734ejM85877a.m85543c(gkq0.m126693v(C14761h.m85874e().f61756a) ? 1 : 0);
            }
            C14761h.m85875f().m85880i(c14734ejM85877a);
        } catch (NullPointerException unused) {
        }
    }
}
