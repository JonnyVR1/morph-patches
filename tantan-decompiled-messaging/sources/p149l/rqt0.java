package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class rqt0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fmw0 f160693a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tqt0 f160694b;

    public rqt0(tqt0 tqt0Var, fmw0 fmw0Var) {
        this.f160693a = fmw0Var;
        this.f160694b = tqt0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        this.f160693a.zza(th);
        i3t0.f111376e.execute(new Runnable() { // from class: l.nqt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f140099a.m190159d();
            }
        });
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        tqt0.m190156b(this.f160694b, ((mqt0) obj).f135293a, this.f160693a);
    }
}
