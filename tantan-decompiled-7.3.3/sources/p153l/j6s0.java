package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class j6s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hzx0 f118596a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l2s0 f118597b;

    public j6s0(l2s0 l2s0Var, hzx0 hzx0Var) {
        this.f118596a = hzx0Var;
        this.f118597b = l2s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f118596a.zzd();
        if (zbr0.m219217a()) {
            this.f118596a.zzl().m177841w(this);
            return;
        }
        boolean zM152634e = this.f118597b.m152634e();
        this.f118597b.f129799c = 0L;
        if (zM152634e) {
            this.f118597b.mo114571d();
        }
    }
}
