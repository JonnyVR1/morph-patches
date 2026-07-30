package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class dxr0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bqx0 f88318a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ftr0 f88319b;

    public dxr0(ftr0 ftr0Var, bqx0 bqx0Var) {
        this.f88318a = bqx0Var;
        this.f88319b = ftr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f88318a.zzd();
        if (t2r0.m187058a()) {
            this.f88318a.zzl().m146305w(this);
            return;
        }
        boolean zM123086e = this.f88319b.m123086e();
        this.f88319b.f99259c = 0L;
        if (zM123086e) {
            this.f88319b.mo99212d();
        }
    }
}
