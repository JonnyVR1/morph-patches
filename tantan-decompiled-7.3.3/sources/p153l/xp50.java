package p153l;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
class xp50 {

    /* JADX INFO: renamed from: a */
    static volatile String f195685a = "";

    /* JADX INFO: renamed from: b */
    private static volatile boolean f195686b;

    /* JADX INFO: renamed from: c */
    static CopyOnWriteArrayList<r1m> f195687c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d */
    static w4m f195688d;

    /* JADX INFO: renamed from: l.xp50$a */
    public class RunnableC21404a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ r1m f195689a;

        public RunnableC21404a(r1m r1mVar) {
            this.f195689a = r1mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (xp50.f195686b) {
                this.f195689a.onSuccess(xp50.f195685a);
            } else {
                xp50.f195687c.add(this.f195689a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m212630b(Context context) throws Throwable {
        if (!TextUtils.isEmpty(f195685a)) {
            return f195685a;
        }
        String strM212631c = m212631c(context);
        if (!TextUtils.isEmpty(strM212631c)) {
            m4f0.m157013f(strM212631c);
            return strM212631c;
        }
        String strM157010c = m4f0.m157010c();
        if (!TextUtils.isEmpty(strM157010c)) {
            m212638j(context, strM157010c);
        }
        return strM157010c;
    }

    /* JADX INFO: renamed from: c */
    private static String m212631c(Context context) {
        if (!os60.m168963b(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            return "";
        }
        try {
            return ue2.m195596a(c6g0.m108136b(c6g0.m108135a(c6g0.f79958a)));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m212632d(Context context) {
        String strM212630b = m212630b(context);
        f195686b = m212635g(strM212630b);
        f195685a = strM212630b;
        if (!f195686b) {
            kj20.m150007e(0L, new aq50());
            return;
        }
        Iterator<r1m> it = f195687c.iterator();
        while (it.hasNext()) {
            it.next().onSuccess(f195685a);
        }
        f195687c.clear();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m212633e() {
        return m4f0.m157008a().equals(uzi0.m198838a());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m212634f(long j, long j2) {
        return Math.abs(j - j2) >= 86400000;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m212635g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m212633e() || !m212634f(System.currentTimeMillis(), m4f0.m157009b());
    }

    /* JADX INFO: renamed from: h */
    public static void m212636h(r1m r1mVar) {
        up50.m197046b().m197047a(new RunnableC21404a(r1mVar), 0L);
    }

    /* JADX INFO: renamed from: i */
    public static void m212637i(String str) throws Throwable {
        f195685a = str;
        f195686b = true;
        m4f0.m157013f(str);
        m212638j(zp50.m220815d(), str);
    }

    /* JADX INFO: renamed from: j */
    public static void m212638j(Context context, String str) throws Throwable {
        String strM195597b;
        if (os60.m168963b(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            try {
                strM195597b = ue2.m195597b(str);
            } catch (Exception unused) {
                strM195597b = "";
            }
            c6g0.m108137c(c6g0.m108135a(c6g0.f79958a), strM195597b);
        }
    }
}
