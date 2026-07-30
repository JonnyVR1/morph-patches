package p149l;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public class th50 {

    /* JADX INFO: renamed from: a */
    private static Context f170201a = null;

    /* JADX INFO: renamed from: b */
    private static boolean f170202b = false;

    /* JADX INFO: renamed from: c */
    static boolean f170203c = false;

    /* JADX INFO: renamed from: d */
    private static rml f170204d;

    /* JADX INFO: renamed from: l.th50$a */
    public class RunnableC20174a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            rh50.m179332d(th50.f170201a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m188867b(Context context, rml rmlVar) {
        if (context == null) {
            return;
        }
        f170204d = rmlVar;
        f170201a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: c */
    public static rml m188868c() {
        return f170204d;
    }

    /* JADX INFO: renamed from: d */
    public static Context m188869d() {
        return f170201a;
    }

    /* JADX INFO: renamed from: e */
    public static String m188870e() {
        if (f170201a == null) {
            return "";
        }
        return TextUtils.isEmpty(rh50.f159338a) ? fwe0.m123514c() : rh50.f159338a;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m188871f() {
        return f170202b;
    }

    /* JADX INFO: renamed from: g */
    public static void m188872g() {
        if (f170201a == null) {
            return;
        }
        oh50.m164325b().m164326a(new RunnableC20174a(), 0L);
    }

    /* JADX INFO: renamed from: h */
    public static void m188873h(wyl wylVar) {
        rh50.m179336h(wylVar);
    }

    /* JADX INFO: renamed from: i */
    public static void m188874i(d2m d2mVar) {
        rh50.f159341d = d2mVar;
    }

    /* JADX INFO: renamed from: j */
    public static void m188875j(boolean z) {
        f170203c = z;
    }
}
