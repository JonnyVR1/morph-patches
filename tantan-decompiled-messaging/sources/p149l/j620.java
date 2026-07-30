package p149l;

/* JADX INFO: loaded from: classes6.dex */
public class j620 {

    /* JADX INFO: renamed from: a */
    public static k620 f116376a;

    /* JADX INFO: renamed from: a */
    public static void m139876a(k620 k620Var) {
        synchronized (j620.class) {
            try {
                if (f116376a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f116376a = k620Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m139877b(k620 k620Var) {
        if (m139878c()) {
            return;
        }
        m139876a(k620Var);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m139878c() {
        boolean z;
        synchronized (j620.class) {
            z = f116376a != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m139879d(String str) {
        return m139880e(str, 0);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m139880e(String str, int i) {
        k620 k620Var;
        synchronized (j620.class) {
            k620Var = f116376a;
            if (k620Var == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return k620Var.mo144574a(str, i);
    }
}
