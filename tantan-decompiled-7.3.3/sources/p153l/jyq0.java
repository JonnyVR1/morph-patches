package p153l;

/* JADX INFO: loaded from: classes2.dex */
public class jyq0 {

    /* JADX INFO: renamed from: b */
    private static volatile jyq0 f123193b;

    /* JADX INFO: renamed from: a */
    private iyq0 f123194a;

    /* JADX INFO: renamed from: b */
    public static jyq0 m147615b() {
        if (f123193b == null) {
            synchronized (jyq0.class) {
                try {
                    if (f123193b == null) {
                        f123193b = new jyq0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f123193b;
    }

    /* JADX INFO: renamed from: a */
    public iyq0 m147616a() {
        return this.f123194a;
    }

    /* JADX INFO: renamed from: c */
    public void m147617c(iyq0 iyq0Var) {
        this.f123194a = iyq0Var;
    }
}
