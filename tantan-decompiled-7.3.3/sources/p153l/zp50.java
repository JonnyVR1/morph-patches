package p153l;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class zp50 {

    /* JADX INFO: renamed from: a */
    private static Context f205423a = null;

    /* JADX INFO: renamed from: b */
    private static boolean f205424b = false;

    /* JADX INFO: renamed from: c */
    static boolean f205425c = false;

    /* JADX INFO: renamed from: d */
    private static cpl f205426d;

    /* JADX INFO: renamed from: l.zp50$a */
    public class RunnableC21849a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            xp50.m212632d(zp50.f205423a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m220813b(Context context, cpl cplVar) {
        if (context == null) {
            return;
        }
        f205426d = cplVar;
        f205423a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: c */
    public static cpl m220814c() {
        return f205426d;
    }

    /* JADX INFO: renamed from: d */
    public static Context m220815d() {
        return f205423a;
    }

    /* JADX INFO: renamed from: e */
    public static String m220816e() {
        if (f205423a == null) {
            return "";
        }
        return TextUtils.isEmpty(xp50.f195685a) ? m4f0.m157010c() : xp50.f195685a;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m220817f() {
        return f205424b;
    }

    /* JADX INFO: renamed from: g */
    public static void m220818g() {
        if (f205423a == null) {
            return;
        }
        up50.m197046b().m197047a(new RunnableC21849a(), 0L);
    }

    /* JADX INFO: renamed from: h */
    public static void m220819h(r1m r1mVar) {
        xp50.m212636h(r1mVar);
    }

    /* JADX INFO: renamed from: i */
    public static void m220820i(w4m w4mVar) {
        xp50.f195688d = w4mVar;
    }

    /* JADX INFO: renamed from: j */
    public static void m220821j(boolean z) {
        f205425c = z;
    }
}
