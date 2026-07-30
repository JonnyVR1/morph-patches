package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class kmr0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final dnr0 f123821a;

    /* JADX INFO: renamed from: b */
    public final jnr0 f123822b;

    /* JADX INFO: renamed from: c */
    public final Runnable f123823c;

    public kmr0(dnr0 dnr0Var, jnr0 jnr0Var, Runnable runnable) {
        this.f123821a = dnr0Var;
        this.f123822b = jnr0Var;
        this.f123823c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f123821a.m112653A();
        jnr0 jnr0Var = this.f123822b;
        boolean zM142388c = jnr0Var.m142388c();
        dnr0 dnr0Var = this.f123821a;
        if (zM142388c) {
            dnr0Var.mo112668s(jnr0Var.f118881a);
        } else {
            dnr0Var.m112667r(jnr0Var.f118883c);
        }
        boolean z = this.f123822b.f118884d;
        dnr0 dnr0Var2 = this.f123821a;
        if (z) {
            dnr0Var2.m112666q("intermediate-response");
        } else {
            dnr0Var2.m112669t("done");
        }
        Runnable runnable = this.f123823c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
