package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class agy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ isw0 f71298a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xfy0 f71299b;

    public agy0(xfy0 xfy0Var, isw0 isw0Var) {
        this.f71298a = isw0Var;
        this.f71299b = xfy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f71299b) {
            try {
                this.f71299b.f194119a = false;
                if (!this.f71299b.f194121c.m134556a0()) {
                    this.f71299b.f194121c.zzj().m114570z().m153300a("Connected to remote service");
                    this.f71299b.f194121c.m134541J(this.f71298a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
