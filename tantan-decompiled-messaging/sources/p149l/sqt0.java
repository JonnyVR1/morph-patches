package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class sqt0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fmw0 f166021a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tqt0 f166022b;

    public sqt0(tqt0 tqt0Var, fmw0 fmw0Var) {
        this.f166021a = fmw0Var;
        this.f166022b = tqt0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        i3t0.f111376e.execute(new Runnable() { // from class: l.nqt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f140099a.m190159d();
            }
        });
        this.f166021a.zza(th);
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        i3t0.f111376e.execute(new Runnable() { // from class: l.nqt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f140099a.m190159d();
            }
        });
        this.f166021a.zzb((eqt0) obj);
    }
}
