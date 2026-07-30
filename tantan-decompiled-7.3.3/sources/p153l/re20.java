package p153l;

/* JADX INFO: loaded from: classes6.dex */
public class re20 {

    /* JADX INFO: renamed from: a */
    public static se20 f162387a;

    /* JADX INFO: renamed from: a */
    public static void m180960a(se20 se20Var) {
        synchronized (re20.class) {
            try {
                if (f162387a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f162387a = se20Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m180961b(se20 se20Var) {
        if (m180962c()) {
            return;
        }
        m180960a(se20Var);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m180962c() {
        boolean z;
        synchronized (re20.class) {
            z = f162387a != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m180963d(String str) {
        return m180964e(str, 0);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m180964e(String str, int i) {
        se20 se20Var;
        synchronized (re20.class) {
            se20Var = f162387a;
            if (se20Var == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return se20Var.mo121861a(str, i);
    }
}
