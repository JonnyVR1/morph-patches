package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class ius0 implements xct0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ avs0 f116978a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rdw0 f116979b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvs0 f116980c;

    public ius0(bvs0 bvs0Var, avs0 avs0Var, rdw0 rdw0Var) {
        this.f116978a = avs0Var;
        this.f116979b = rdw0Var;
        this.f116980c = bvs0Var;
    }

    @Override // p153l.xct0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        d2v0.m113737k("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.f116980c.f78623a) {
            try {
                d2v0.m113737k("loadNewJavascriptEngine (success): Lock acquired");
                this.f116980c.f78631i = 0;
                bvs0 bvs0Var = this.f116980c;
                if (bvs0Var.f78630h != null && this.f116978a != bvs0Var.f78630h) {
                    d2v0.m113737k("New JS engine is loaded, marking previous one as destroyable.");
                    this.f116980c.f78630h.m100516g();
                }
                this.f116980c.f78630h = this.f116978a;
                if (((Boolean) ris0.f163392d.m149974e()).booleanValue()) {
                    bvs0 bvs0Var2 = this.f116980c;
                    if (bvs0Var2.f78627e != null) {
                        hew0 hew0Var = bvs0Var2.f78627e;
                        rdw0 rdw0Var = this.f116979b;
                        rdw0Var.mo162910S(true);
                        hew0Var.m134677b(rdw0Var.zzl());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d2v0.m113737k("loadNewJavascriptEngine (success): Lock released");
    }
}
