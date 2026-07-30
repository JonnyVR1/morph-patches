package p153l;

import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes13.dex */
public class msh0 {

    /* JADX INFO: renamed from: a */
    public static osh0 f138480a;

    /* JADX INFO: renamed from: b */
    public static xwl f138481b;

    /* JADX INFO: renamed from: c */
    public static boolean f138482c;

    /* JADX INFO: renamed from: d */
    public static zyv f138483d;

    /* JADX INFO: renamed from: e */
    public static xwl f138484e;

    /* JADX INFO: renamed from: f */
    public static xwl f138485f;

    /* JADX INFO: renamed from: g */
    public static xwl f138486g;

    /* JADX INFO: renamed from: a */
    public static String m159786a() {
        return f138480a.m168991a();
    }

    /* JADX INFO: renamed from: b */
    public static long m159787b() {
        return f138480a.m168995e();
    }

    /* JADX INFO: renamed from: c */
    public static String m159788c() {
        return f138480a.m168998h();
    }

    /* JADX INFO: renamed from: d */
    public static String m159789d() {
        return f138480a.m168999i();
    }

    /* JADX INFO: renamed from: e */
    public static x4m m159790e() {
        return f138480a.m168993c();
    }

    /* JADX INFO: renamed from: f */
    public static ThreadPoolExecutor m159791f() {
        return f138480a.m169001k();
    }

    /* JADX INFO: renamed from: g */
    public static int m159792g() {
        return f138480a.m169002l();
    }

    /* JADX INFO: renamed from: h */
    public static int m159793h() {
        return f138480a.m169003m();
    }

    /* JADX INFO: renamed from: i */
    public static void m159794i(osh0 osh0Var) {
        if (f138482c) {
            return;
        }
        f138480a = osh0Var;
        f138481b = new jej0(osh0Var);
        f138485f = new os10(osh0Var);
        f138484e = new lc60(osh0Var);
        f138483d = new ezv(osh0Var);
        f138486g = new u4c0(osh0Var);
        f138482c = true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m159795j() {
        return f138480a.m169004n();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m159796k(nyv nyvVar) {
        return f138482c && !m159797l(nyvVar);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m159797l(nyv nyvVar) {
        Iterator<a1j0> it = f138480a.m168994d().iterator();
        while (it.hasNext()) {
            if (it.next().mo95515a(nyvVar) == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static void m159798m(nyv nyvVar) {
        if (m159796k(nyvVar) && f138480a.m169006p()) {
            xwl xwlVar = f138485f;
            xwlVar.m213364f(uyv.m198711a(xwlVar.m213362c(nyvVar)));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m159799n(nyv nyvVar) {
        if (m159796k(nyvVar) && f138480a.m169008r()) {
            xwl xwlVar = f138484e;
            xwlVar.m213364f(uyv.m198711a(xwlVar.m213362c(nyvVar)));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m159800o() {
        if (f138482c) {
            f138483d.mo123426b();
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m159801p() {
        if (f138482c) {
            f138483d.mo123425a();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m159802q(nyv nyvVar) {
        if (m159796k(nyvVar) && f138480a.m169007q()) {
            xwl xwlVar = f138481b;
            xwlVar.m213364f(uyv.m198711a(xwlVar.m213362c(nyvVar)));
        }
    }
}
