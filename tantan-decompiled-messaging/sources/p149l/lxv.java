package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class lxv {

    /* JADX INFO: renamed from: a */
    private static boolean f130444a = false;

    /* JADX INFO: renamed from: a */
    private static boolean m152095a() {
        return qsf.INSTANCE.m176235b() || mei.m154203i() || mei.m154211q();
    }

    /* JADX INFO: renamed from: b */
    public static void m152096b(ve3 ve3Var) {
        if (f130444a && we3.m202829a()) {
            vhw.m198471d().m198477g(ve3Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m152097c(xe3 xe3Var) {
        if (f130444a && we3.m202829a()) {
            vhw.m198471d().m198478h(xe3Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m152098d(String str, String str2) {
        if (f130444a && m152095a()) {
            vhw.m198471d().m198479i(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m152099e() {
        if (f130444a && m152095a()) {
            vhw.m198471d().m198480j();
        }
        vei.m198186e().m198191g();
    }

    /* JADX INFO: renamed from: f */
    public static void m152100f() {
        if (f130444a && m152095a()) {
            vhw.m198471d().m198481k();
        }
        vei.m198186e().m198192h();
    }

    /* JADX INFO: renamed from: g */
    public static void m152101g() {
        f130444a = true;
    }

    /* JADX INFO: renamed from: h */
    public static void m152102h(AbstractC20803w5 abstractC20803w5) {
        if (m152095a()) {
            vhw.m198471d().m198476f(abstractC20803w5);
        } else {
            mxv.m156930e("LogTracker", "global log disable");
        }
    }
}
