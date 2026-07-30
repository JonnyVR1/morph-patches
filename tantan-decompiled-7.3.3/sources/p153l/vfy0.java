package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class vfy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ isw0 f183989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xfy0 f183990b;

    public vfy0(xfy0 xfy0Var, isw0 isw0Var) {
        this.f183989a = isw0Var;
        this.f183990b = xfy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f183990b) {
            try {
                this.f183990b.f194119a = false;
                if (!this.f183990b.f194121c.m134556a0()) {
                    this.f183990b.f194121c.zzj().m114562E().m153300a("Connected to service");
                    this.f183990b.f194121c.m134541J(this.f183989a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
