package p149l;

import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes13.dex */
public class fkh0 {

    /* JADX INFO: renamed from: a */
    public static hkh0 f98068a;

    /* JADX INFO: renamed from: b */
    public static jul f98069b;

    /* JADX INFO: renamed from: c */
    public static boolean f98070c;

    /* JADX INFO: renamed from: d */
    public static axv f98071d;

    /* JADX INFO: renamed from: e */
    public static jul f98072e;

    /* JADX INFO: renamed from: f */
    public static jul f98073f;

    /* JADX INFO: renamed from: g */
    public static jul f98074g;

    /* JADX INFO: renamed from: a */
    public static String m121855a() {
        return f98068a.m131507a();
    }

    /* JADX INFO: renamed from: b */
    public static long m121856b() {
        return f98068a.m131511e();
    }

    /* JADX INFO: renamed from: c */
    public static String m121857c() {
        return f98068a.m131514h();
    }

    /* JADX INFO: renamed from: d */
    public static String m121858d() {
        return f98068a.m131515i();
    }

    /* JADX INFO: renamed from: e */
    public static e2m m121859e() {
        return f98068a.m131509c();
    }

    /* JADX INFO: renamed from: f */
    public static ThreadPoolExecutor m121860f() {
        return f98068a.m131517k();
    }

    /* JADX INFO: renamed from: g */
    public static int m121861g() {
        return f98068a.m131518l();
    }

    /* JADX INFO: renamed from: h */
    public static int m121862h() {
        return f98068a.m131519m();
    }

    /* JADX INFO: renamed from: i */
    public static void m121863i(hkh0 hkh0Var) {
        if (f98070c) {
            return;
        }
        f98068a = hkh0Var;
        f98069b = new f5j0(hkh0Var);
        f98073f = new ek10(hkh0Var);
        f98072e = new g460(hkh0Var);
        f98071d = new fxv(hkh0Var);
        f98074g = new qwb0(hkh0Var);
        f98070c = true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m121864j() {
        return f98068a.m131520n();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m121865k(nwv nwvVar) {
        return f98070c && !m121866l(nwvVar);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m121866l(nwv nwvVar) {
        Iterator<xri0> it = f98068a.m131510d().iterator();
        while (it.hasNext()) {
            if (it.next().mo138899a(nwvVar) == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static void m121867m(nwv nwvVar) {
        if (m121865k(nwvVar) && f98068a.m131522p()) {
            jul julVar = f98073f;
            julVar.m143334f(uwv.m196141a(julVar.m143332c(nwvVar)));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m121868n(nwv nwvVar) {
        if (m121865k(nwvVar) && f98068a.m131524r()) {
            jul julVar = f98072e;
            julVar.m143334f(uwv.m196141a(julVar.m143332c(nwvVar)));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m121869o() {
        if (f98070c) {
            f98071d.mo99523b();
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m121870p() {
        if (f98070c) {
            f98071d.mo99522a();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m121871q(nwv nwvVar) {
        if (m121865k(nwvVar) && f98068a.m131523q()) {
            jul julVar = f98069b;
            julVar.m143334f(uwv.m196141a(julVar.m143332c(nwvVar)));
        }
    }
}
