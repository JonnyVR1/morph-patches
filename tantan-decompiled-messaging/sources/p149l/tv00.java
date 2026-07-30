package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class tv00 {

    /* JADX INFO: renamed from: a */
    private static sv00 f172239a;

    /* JADX INFO: renamed from: b */
    private static final Object f172240b = new Object();

    /* JADX INFO: renamed from: a */
    public static void m190718a(int i, int i2, int i3, Object obj) {
        if (f172239a != null) {
            synchronized (f172240b) {
                try {
                    sv00 sv00Var = f172239a;
                    if (sv00Var != null) {
                        f172239a.sendMessage(sv00Var.obtainMessage(i, i2, i3, obj));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m190719b(sv00 sv00Var) {
        synchronized (f172240b) {
            f172239a = sv00Var;
        }
    }
}
