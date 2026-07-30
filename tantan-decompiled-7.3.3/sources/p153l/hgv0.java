package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class hgv0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q6w0 f109443a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ igv0 f109444b;

    public hgv0(igv0 igv0Var, q6w0 q6w0Var) {
        this.f109443a = q6w0Var;
        this.f109444b = igv0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        synchronized (this.f109444b) {
            try {
                this.f109444b.f114822h.m144797b(th, this.f109443a);
                if (this.f109444b.f114822h.m144800e()) {
                    igv0 igv0Var = this.f109444b;
                    igv0Var.m139962e(igv0Var.f114822h.m144796a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        fhv0 fhv0Var = (fhv0) obj;
        synchronized (this.f109444b) {
            try {
                this.f109444b.f114822h.m144798c(fhv0Var, this.f109443a);
                if (this.f109444b.f114822h.m144800e()) {
                    igv0 igv0Var = this.f109444b;
                    igv0Var.m139962e(igv0Var.f114822h.m144796a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
