package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class hnw0 extends dnw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ snw0 f110839b;

    public hnw0(snw0 snw0Var) {
        this.f110839b = snw0Var;
    }

    @Override // p153l.dnw0
    /* JADX INFO: renamed from: a */
    public final void mo117085a() {
        synchronized (this.f110839b.f169780f) {
            try {
                if (this.f110839b.f169785k.get() > 0 && this.f110839b.f169785k.decrementAndGet() > 0) {
                    this.f110839b.f169776b.m111556c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                snw0 snw0Var = this.f110839b;
                if (snw0Var.f169787m != null) {
                    snw0Var.f169776b.m111556c("Unbind from service.", new Object[0]);
                    snw0 snw0Var2 = this.f110839b;
                    snw0Var2.f169775a.unbindService(snw0Var2.f169786l);
                    this.f110839b.f169781g = false;
                    this.f110839b.f169787m = null;
                    this.f110839b.f169786l = null;
                }
                this.f110839b.m187027w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
