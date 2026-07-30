package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class sjx0 implements dkx0 {

    /* JADX INFO: renamed from: a */
    public final dkx0[] f169196a;

    public sjx0(dkx0... dkx0VarArr) {
        this.f169196a = dkx0VarArr;
    }

    @Override // p153l.dkx0
    public final ckx0 zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            dkx0 dkx0Var = this.f169196a[i];
            if (dkx0Var.zzc(cls)) {
                return dkx0Var.zzb(cls);
            }
        }
        pr3.m173429a("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p153l.dkx0
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.f169196a[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
