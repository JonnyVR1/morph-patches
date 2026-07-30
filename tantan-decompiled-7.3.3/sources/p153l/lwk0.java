package p153l;

/* JADX INFO: loaded from: classes9.dex */
public class lwk0 {

    /* JADX INFO: renamed from: a */
    public zwk0 f133827a;

    /* JADX INFO: renamed from: l.lwk0$a */
    public static final class C18473a {
        private static final lwk0 INSTANCE = new lwk0();
    }

    /* JADX INFO: renamed from: b */
    public static lwk0 m156066b() {
        return C18473a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void m156067a() {
        zwk0 zwk0Var = this.f133827a;
        if (zwk0Var != null) {
            zwk0Var.m221939u(true);
            this.f133827a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m156068c() {
        zwk0 zwk0Var = this.f133827a;
        return zwk0Var != null && zwk0Var.isShowing();
    }

    /* JADX INFO: renamed from: d */
    public void m156069d() {
        zwk0 zwk0Var = this.f133827a;
        if (zwk0Var != null) {
            zwk0Var.m221938t();
            this.f133827a = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m156070e(xnu xnuVar) {
        if (this.f133827a == null) {
            zwk0 zwk0Var = new zwk0();
            this.f133827a = zwk0Var;
            zwk0Var.m221937r(new axk0());
        }
        return this.f133827a.m221936J(xnuVar);
    }

    public lwk0() {
    }
}
