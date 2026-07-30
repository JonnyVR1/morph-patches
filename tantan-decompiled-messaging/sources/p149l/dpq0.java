package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class dpq0 {

    /* JADX INFO: renamed from: b */
    private static volatile dpq0 f87309b;

    /* JADX INFO: renamed from: a */
    private cpq0 f87310a;

    /* JADX INFO: renamed from: b */
    public static dpq0 m112924b() {
        if (f87309b == null) {
            synchronized (dpq0.class) {
                try {
                    if (f87309b == null) {
                        f87309b = new dpq0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f87309b;
    }

    /* JADX INFO: renamed from: a */
    public cpq0 m112925a() {
        return this.f87310a;
    }

    /* JADX INFO: renamed from: c */
    public void m112926c(cpq0 cpq0Var) {
        this.f87310a = cpq0Var;
    }
}
