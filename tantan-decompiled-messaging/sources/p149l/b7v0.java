package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class b7v0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kxv0 f74021a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c7v0 f74022b;

    public b7v0(c7v0 c7v0Var, kxv0 kxv0Var) {
        this.f74021a = kxv0Var;
        this.f74022b = c7v0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        synchronized (this.f74022b) {
            try {
                this.f74022b.f79658h.m110252b(th, this.f74021a);
                if (this.f74022b.f79658h.m110255e()) {
                    c7v0 c7v0Var = this.f74022b;
                    c7v0Var.m105644e(c7v0Var.f79658h.m110251a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        z7v0 z7v0Var = (z7v0) obj;
        synchronized (this.f74022b) {
            try {
                this.f74022b.f79658h.m110253c(z7v0Var, this.f74021a);
                if (this.f74022b.f79658h.m110255e()) {
                    c7v0 c7v0Var = this.f74022b;
                    c7v0Var.m105644e(c7v0Var.f79658h.m110251a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
