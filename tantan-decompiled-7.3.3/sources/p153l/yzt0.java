package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class yzt0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lvw0 f202223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzt0 f202224b;

    public yzt0(zzt0 zzt0Var, lvw0 lvw0Var) {
        this.f202223a = lvw0Var;
        this.f202224b = zzt0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        oct0.f146737e.execute(new Runnable() { // from class: l.tzt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f176808a.m222286d();
            }
        });
        this.f202223a.zza(th);
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        oct0.f146737e.execute(new Runnable() { // from class: l.tzt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f176808a.m222286d();
            }
        });
        this.f202223a.zzb((kzt0) obj);
    }
}
