package p149l;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes13.dex */
class rh50 {

    /* JADX INFO: renamed from: a */
    static volatile String f159338a = "";

    /* JADX INFO: renamed from: b */
    private static volatile boolean f159339b;

    /* JADX INFO: renamed from: c */
    static CopyOnWriteArrayList<wyl> f159340c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d */
    static d2m f159341d;

    /* JADX INFO: renamed from: l.rh50$a */
    public class RunnableC19697a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ wyl f159342a;

        public RunnableC19697a(wyl wylVar) {
            this.f159342a = wylVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (rh50.f159339b) {
                this.f159342a.onSuccess(rh50.f159338a);
            } else {
                rh50.f159340c.add(this.f159342a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m179330b(Context context) throws Throwable {
        if (!TextUtils.isEmpty(f159338a)) {
            return f159338a;
        }
        String strM179331c = m179331c(context);
        if (!TextUtils.isEmpty(strM179331c)) {
            fwe0.m123517f(strM179331c);
            return strM179331c;
        }
        String strM123514c = fwe0.m123514c();
        if (!TextUtils.isEmpty(strM123514c)) {
            m179338j(context, strM123514c);
        }
        return strM123514c;
    }

    /* JADX INFO: renamed from: c */
    private static String m179331c(Context context) {
        if (!ik60.m136775b(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            return "";
        }
        try {
            return me2.m154111a(uxf0.m196178b(uxf0.m196177a(uxf0.f178736a)));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m179332d(Context context) {
        String strM179330b = m179330b(context);
        f159339b = m179335g(strM179330b);
        f159338a = strM179330b;
        if (!f159339b) {
            bb20.m100944e(0L, new uh50());
            return;
        }
        Iterator<wyl> it = f159340c.iterator();
        while (it.hasNext()) {
            it.next().onSuccess(f159338a);
        }
        f159340c.clear();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m179333e() {
        return fwe0.m123512a().equals(rqi0.m180458a());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m179334f(long j, long j2) {
        return Math.abs(j - j2) >= 86400000;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m179335g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m179333e() || !m179334f(System.currentTimeMillis(), fwe0.m123513b());
    }

    /* JADX INFO: renamed from: h */
    public static void m179336h(wyl wylVar) {
        oh50.m164325b().m164326a(new RunnableC19697a(wylVar), 0L);
    }

    /* JADX INFO: renamed from: i */
    public static void m179337i(String str) throws Throwable {
        f159338a = str;
        f159339b = true;
        fwe0.m123517f(str);
        m179338j(th50.m188869d(), str);
    }

    /* JADX INFO: renamed from: j */
    public static void m179338j(Context context, String str) throws Throwable {
        String strM154112b;
        if (ik60.m136775b(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            try {
                strM154112b = me2.m154112b(str);
            } catch (Exception unused) {
                strM154112b = "";
            }
            uxf0.m196179c(uxf0.m196177a(uxf0.f178736a), strM154112b);
        }
    }
}
