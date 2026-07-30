package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class u6y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cjw0 f174897a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r6y0 f174898b;

    public u6y0(r6y0 r6y0Var, cjw0 cjw0Var) {
        this.f174897a = cjw0Var;
        this.f174898b = r6y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f174898b) {
            try {
                this.f174898b.f157990a = false;
                if (!this.f174898b.f157992c.m100156a0()) {
                    this.f174898b.f157992c.zzj().m211424z().m123936a("Connected to remote service");
                    this.f174898b.f157992c.m100141J(this.f174897a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
