package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class aew0 extends xdw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sei0 f69125b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xdw0 f69126c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mew0 f69127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aew0(mew0 mew0Var, sei0 sei0Var, sei0 sei0Var2, xdw0 xdw0Var) {
        super(sei0Var);
        this.f69125b = sei0Var2;
        this.f69126c = xdw0Var;
        this.f69127d = mew0Var;
    }

    @Override // p149l.xdw0
    /* JADX INFO: renamed from: a */
    public final void mo96146a() {
        synchronized (this.f69127d.f133509f) {
            try {
                mew0.m154327n(this.f69127d, this.f69125b);
                if (this.f69127d.f133514k.getAndIncrement() > 0) {
                    this.f69127d.f133505b.m202813c("Already connected to the service.", new Object[0]);
                }
                mew0.m154329p(this.f69127d, this.f69126c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
