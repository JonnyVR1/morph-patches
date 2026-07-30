package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class qvr0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final jwr0 f159801a;

    /* JADX INFO: renamed from: b */
    public final pwr0 f159802b;

    /* JADX INFO: renamed from: c */
    public final Runnable f159803c;

    public qvr0(jwr0 jwr0Var, pwr0 pwr0Var, Runnable runnable) {
        this.f159801a = jwr0Var;
        this.f159802b = pwr0Var;
        this.f159803c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f159801a.m147191A();
        pwr0 pwr0Var = this.f159802b;
        boolean zM174089c = pwr0Var.m174089c();
        jwr0 jwr0Var = this.f159801a;
        if (zM174089c) {
            jwr0Var.mo147206s(pwr0Var.f154433a);
        } else {
            jwr0Var.m147205r(pwr0Var.f154435c);
        }
        boolean z = this.f159802b.f154436d;
        jwr0 jwr0Var2 = this.f159801a;
        if (z) {
            jwr0Var2.m147204q("intermediate-response");
        } else {
            jwr0Var2.m147207t("done");
        }
        Runnable runnable = this.f159803c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
