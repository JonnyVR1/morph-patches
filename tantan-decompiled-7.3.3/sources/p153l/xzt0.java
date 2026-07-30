package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class xzt0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lvw0 f196921a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzt0 f196922b;

    public xzt0(zzt0 zzt0Var, lvw0 lvw0Var) {
        this.f196921a = lvw0Var;
        this.f196922b = zzt0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        this.f196921a.zza(th);
        oct0.f146737e.execute(new Runnable() { // from class: l.tzt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f176808a.m222286d();
            }
        });
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzt0.m222283b(this.f196922b, ((szt0) obj).f171418a, this.f196921a);
    }
}
