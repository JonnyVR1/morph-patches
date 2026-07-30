package p153l;

/* JADX INFO: loaded from: classes9.dex */
public class jyn0 {

    /* JADX INFO: renamed from: a */
    public static String f123181a = "templateTypeA";

    /* JADX INFO: renamed from: b */
    public static String f123182b = "templateTypeB";

    /* JADX INFO: renamed from: c */
    public static jyn0 f123183c;

    /* JADX INFO: renamed from: d */
    public static us2 f123184d;

    /* JADX INFO: renamed from: e */
    public static ss2 f123185e;

    /* JADX INFO: renamed from: f */
    public static y4o0 f123186f;

    /* JADX INFO: renamed from: g */
    public static z4o0 f123187g;

    public jyn0() {
        if (m147611h()) {
            f123184d = new c5o0();
            f123185e = new uwn0();
        } else {
            f123184d = new d5o0();
            f123185e = new vwn0();
        }
    }

    /* JADX INFO: renamed from: a */
    public static ss2 m147604a() {
        m147606c();
        m147614k(false);
        return f123185e;
    }

    /* JADX INFO: renamed from: b */
    public static ss2 m147605b(boolean z) {
        m147606c();
        m147614k(z);
        return f123185e;
    }

    /* JADX INFO: renamed from: c */
    public static jyn0 m147606c() {
        if (f123183c == null) {
            synchronized (jyn0.class) {
                try {
                    if (f123183c == null) {
                        f123183c = new jyn0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f123183c;
    }

    /* JADX INFO: renamed from: d */
    public static int m147607d() {
        return m147613j() ? 3001 : 3002;
    }

    /* JADX INFO: renamed from: e */
    public static ts2 m147608e(String str) {
        if (m147612i(str)) {
            if (f123186f == null) {
                f123186f = new y4o0();
            }
            return f123186f;
        }
        if (f123187g == null) {
            f123187g = new z4o0();
        }
        return f123187g;
    }

    /* JADX INFO: renamed from: f */
    public static us2 m147609f() {
        m147606c();
        m147614k(false);
        return f123184d;
    }

    /* JADX INFO: renamed from: g */
    public static us2 m147610g(boolean z) {
        m147606c();
        m147614k(z);
        return f123184d;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m147611h() {
        String strM203723rb = tbs.f172989b.m203723rb();
        return f123181a.equals(strM203723rb) || f123182b.equals(strM203723rb);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m147612i(String str) {
        if ("intlVoiceLive".equals(str)) {
            return m147611h();
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m147613j() {
        return f123181a.equals(tbs.f172989b.m203723rb());
    }

    /* JADX INFO: renamed from: k */
    public static void m147614k(boolean z) {
        if (z) {
            boolean z2 = f123184d instanceof d5o0;
            boolean z3 = f123185e instanceof vwn0;
            if (!z2) {
                f123184d = new d5o0();
            }
            if (z3) {
                return;
            }
            f123185e = new vwn0();
            return;
        }
        if (m147611h()) {
            boolean z4 = f123184d instanceof c5o0;
            boolean z5 = f123185e instanceof uwn0;
            if (!z4) {
                f123184d = new c5o0();
            }
            if (z5) {
                return;
            }
            f123185e = new uwn0();
            return;
        }
        boolean z6 = f123184d instanceof d5o0;
        boolean z7 = f123185e instanceof vwn0;
        if (!z6) {
            f123184d = new d5o0();
        }
        if (z7) {
            return;
        }
        f123185e = new vwn0();
    }
}
