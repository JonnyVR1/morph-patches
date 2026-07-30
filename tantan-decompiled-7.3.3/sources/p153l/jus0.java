package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class jus0 implements vct0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ avs0 f122737a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rdw0 f122738b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvs0 f122739c;

    public jus0(bvs0 bvs0Var, avs0 avs0Var, rdw0 rdw0Var) {
        this.f122737a = avs0Var;
        this.f122738b = rdw0Var;
        this.f122739c = bvs0Var;
    }

    @Override // p153l.vct0
    public final void zza() {
        d2v0.m113737k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.f122739c.f78623a) {
            try {
                d2v0.m113737k("loadNewJavascriptEngine (failure): Lock acquired");
                this.f122739c.f78631i = 1;
                d2v0.m113737k("Failed loading new engine. Marking new engine destroyable.");
                this.f122737a.m100516g();
                if (((Boolean) ris0.f163392d.m149974e()).booleanValue()) {
                    bvs0 bvs0Var = this.f122739c;
                    if (bvs0Var.f78627e != null) {
                        hew0 hew0Var = bvs0Var.f78627e;
                        rdw0 rdw0Var = this.f122738b;
                        rdw0Var.zzc("Failed loading new engine");
                        rdw0Var.mo162910S(false);
                        hew0Var.m134677b(rdw0Var.zzl());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d2v0.m113737k("loadNewJavascriptEngine (failure): Lock released");
    }
}
