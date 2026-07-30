package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class zdw0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cew0 f203949a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rdw0 f203950b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f203951c;

    public zdw0(cew0 cew0Var, rdw0 rdw0Var, boolean z) {
        this.f203949a = cew0Var;
        this.f203950b = rdw0Var;
        this.f203951c = z;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        rdw0 rdw0Var = this.f203950b;
        if (rdw0Var.zzj()) {
            cew0 cew0Var = this.f203949a;
            rdw0Var.mo162912b(th);
            rdw0Var.mo162910S(false);
            cew0Var.m109461a(rdw0Var);
            if (this.f203951c) {
                this.f203949a.m109467g();
            }
        }
    }

    @Override // p153l.lvw0
    public final void zzb(Object obj) {
        rdw0 rdw0Var = this.f203950b;
        rdw0Var.mo162910S(true);
        this.f203949a.m109461a(rdw0Var);
        if (this.f203951c) {
            this.f203949a.m109467g();
        }
    }
}
