package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class fpn0 {

    /* JADX INFO: renamed from: a */
    public static String f98721a = "templateTypeA";

    /* JADX INFO: renamed from: b */
    public static String f98722b = "templateTypeB";

    /* JADX INFO: renamed from: c */
    public static fpn0 f98723c;

    /* JADX INFO: renamed from: d */
    public static es2 f98724d;

    /* JADX INFO: renamed from: e */
    public static cs2 f98725e;

    /* JADX INFO: renamed from: f */
    public static uvn0 f98726f;

    /* JADX INFO: renamed from: g */
    public static vvn0 f98727g;

    public fpn0() {
        if (m122618h()) {
            f98724d = new yvn0();
            f98725e = new qnn0();
        } else {
            f98724d = new zvn0();
            f98725e = new rnn0();
        }
    }

    /* JADX INFO: renamed from: a */
    public static cs2 m122611a() {
        m122613c();
        m122621k(false);
        return f98725e;
    }

    /* JADX INFO: renamed from: b */
    public static cs2 m122612b(boolean z) {
        m122613c();
        m122621k(z);
        return f98725e;
    }

    /* JADX INFO: renamed from: c */
    public static fpn0 m122613c() {
        if (f98723c == null) {
            synchronized (fpn0.class) {
                try {
                    if (f98723c == null) {
                        f98723c = new fpn0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f98723c;
    }

    /* JADX INFO: renamed from: d */
    public static int m122614d() {
        return m122620j() ? 3001 : 3002;
    }

    /* JADX INFO: renamed from: e */
    public static ds2 m122615e(String str) {
        if (m122619i(str)) {
            if (f98726f == null) {
                f98726f = new uvn0();
            }
            return f98726f;
        }
        if (f98727g == null) {
            f98727g = new vvn0();
        }
        return f98727g;
    }

    /* JADX INFO: renamed from: f */
    public static es2 m122616f() {
        m122613c();
        m122621k(false);
        return f98724d;
    }

    /* JADX INFO: renamed from: g */
    public static es2 m122617g(boolean z) {
        m122613c();
        m122621k(z);
        return f98724d;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m122618h() {
        String strM195936rb = s9s.f163228b.m195936rb();
        return f98721a.equals(strM195936rb) || f98722b.equals(strM195936rb);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m122619i(String str) {
        if ("intlVoiceLive".equals(str)) {
            return m122618h();
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m122620j() {
        return f98721a.equals(s9s.f163228b.m195936rb());
    }

    /* JADX INFO: renamed from: k */
    public static void m122621k(boolean z) {
        if (z) {
            boolean z2 = f98724d instanceof zvn0;
            boolean z3 = f98725e instanceof rnn0;
            if (!z2) {
                f98724d = new zvn0();
            }
            if (z3) {
                return;
            }
            f98725e = new rnn0();
            return;
        }
        if (m122618h()) {
            boolean z4 = f98724d instanceof yvn0;
            boolean z5 = f98725e instanceof qnn0;
            if (!z4) {
                f98724d = new yvn0();
            }
            if (z5) {
                return;
            }
            f98725e = new qnn0();
            return;
        }
        boolean z6 = f98724d instanceof zvn0;
        boolean z7 = f98725e instanceof rnn0;
        if (!z6) {
            f98724d = new zvn0();
        }
        if (z7) {
            return;
        }
        f98725e = new rnn0();
    }
}
