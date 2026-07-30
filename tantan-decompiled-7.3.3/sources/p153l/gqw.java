package p153l;

import android.content.Context;
import com.cosmos.mdlog.MDLog;
import com.google.gson.Gson;
import com.immomo.momo.mulog.exception.MULogIllegalStateException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class gqw {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f105960a;

    /* JADX INFO: renamed from: b */
    private static Context f105961b;

    /* JADX INFO: renamed from: c */
    private static boolean f105962c;

    /* JADX INFO: renamed from: d */
    static String f105963d;

    /* JADX INFO: renamed from: e */
    static String f105964e;

    /* JADX INFO: renamed from: f */
    private static yxl f105965f;

    /* JADX INFO: renamed from: g */
    private static tof0 f105966g;

    /* JADX INFO: renamed from: h */
    private static Map<String, ywl> f105967h = new HashMap();

    /* JADX INFO: renamed from: i */
    private static fqw.InterfaceC17040e f105968i;

    /* JADX INFO: renamed from: j */
    private static fqw.AbstractC17039d f105969j;

    /* JADX INFO: renamed from: k */
    private static xxl f105970k;

    /* JADX INFO: renamed from: l */
    private static Gson f105971l;

    /* JADX INFO: renamed from: a */
    public static boolean m131477a() {
        return f105968i.mo126814d();
    }

    /* JADX INFO: renamed from: b */
    public static Context m131478b() {
        return f105961b;
    }

    /* JADX INFO: renamed from: c */
    public static Map m131479c() {
        return f105967h;
    }

    /* JADX INFO: renamed from: d */
    public static tof0 m131480d() {
        return f105966g;
    }

    /* JADX INFO: renamed from: e */
    public static int m131481e() {
        return f105969j.mo126809b();
    }

    /* JADX INFO: renamed from: f */
    public static int m131482f() {
        return f105968i.mo126812a();
    }

    /* JADX INFO: renamed from: g */
    public static int m131483g() {
        return f105968i.mo126813c();
    }

    /* JADX INFO: renamed from: h */
    public static int m131484h() {
        return f105968i.mo126809b();
    }

    /* JADX INFO: renamed from: i */
    public static String[] m131485i() {
        Map<String, ywl> map = f105967h;
        if (map != null) {
            return (String[]) map.keySet().toArray(new String[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static xxl m131486j() {
        return f105970k;
    }

    /* JADX INFO: renamed from: k */
    public static yxl m131487k() {
        return f105965f;
    }

    /* JADX INFO: renamed from: l */
    public static Gson m131488l() {
        if (f105971l == null) {
            f105971l = new Gson();
        }
        return f105971l;
    }

    /* JADX INFO: renamed from: m */
    public static synchronized boolean m131489m() {
        return f105960a;
    }

    /* JADX INFO: renamed from: n */
    public static void m131490n(Context context, fqw fqwVar) {
        if (f105960a) {
            throw new MULogIllegalStateException("method init couldn't be called twice");
        }
        f105961b = context.getApplicationContext();
        f105962c = fqwVar.f100342a;
        f105963d = fqwVar.f100343b;
        f105964e = fqwVar.f100344c;
        f105966g = fqwVar.f100348g;
        f105968i = fqwVar.f100346e;
        f105969j = fqwVar.f100347f;
        f105970k = fqwVar.f100345d;
        f105965f = new tum();
        for (ywl ywlVar : fqwVar.f100349h) {
            if (ywlVar != null) {
                f105967h.put(ywlVar.mo175943b(), ywlVar);
                m131495s(ywlVar.mo175943b() + " registered realtimeEnable = " + ywlVar.mo175942a());
            }
        }
        f105960a = true;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m131491o() {
        return f105962c;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m131492p() {
        return f105969j.mo126810e();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m131493q() {
        return f105968i.mo126810e();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m131494r() {
        return f105969j.f100351a;
    }

    /* JADX INFO: renamed from: s */
    public static void m131495s(String str) {
        if (f105962c) {
            MDLog.m7443d("MULog", str);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m131496t(String str) {
        if (f105962c) {
            MDLog.m7445e("MULog", str);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m131497u(Throwable th) {
        if (f105962c) {
            MDLog.printErrStackTrace("MULog", th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m131498v(String str) {
        if (f105962c) {
            MDLog.m7453w("MUBusinessLog", str);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m131499w(String str) {
        if (f105962c) {
            MDLog.m7453w("MULog", str);
        }
    }
}
