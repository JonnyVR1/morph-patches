package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class gnw0 extends dnw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sni0 f105168b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dnw0 f105169c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ snw0 f105170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnw0(snw0 snw0Var, sni0 sni0Var, sni0 sni0Var2, dnw0 dnw0Var) {
        super(sni0Var);
        this.f105168b = sni0Var2;
        this.f105169c = dnw0Var;
        this.f105170d = snw0Var;
    }

    @Override // p153l.dnw0
    /* JADX INFO: renamed from: a */
    public final void mo117085a() {
        synchronized (this.f105170d.f169780f) {
            try {
                snw0.m187016n(this.f105170d, this.f105168b);
                if (this.f105170d.f169785k.getAndIncrement() > 0) {
                    this.f105170d.f169776b.m111556c("Already connected to the service.", new Object[0]);
                }
                snw0.m187018p(this.f105170d, this.f105169c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
