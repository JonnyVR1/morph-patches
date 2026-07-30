package p153l;

/* JADX INFO: loaded from: classes8.dex */
public class b410 {

    /* JADX INFO: renamed from: a */
    private static a410 f74854a;

    /* JADX INFO: renamed from: b */
    private static final Object f74855b = new Object();

    /* JADX INFO: renamed from: a */
    public static void m102397a(int i, int i2, int i3, Object obj) {
        if (f74854a != null) {
            synchronized (f74855b) {
                try {
                    a410 a410Var = f74854a;
                    if (a410Var != null) {
                        f74854a.sendMessage(a410Var.obtainMessage(i, i2, i3, obj));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m102398b(a410 a410Var) {
        synchronized (f74855b) {
            f74854a = a410Var;
        }
    }
}
