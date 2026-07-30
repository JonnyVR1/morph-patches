package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class mux0 implements pvx0 {

    /* JADX INFO: renamed from: a */
    public final pvx0[] f138859a;

    public mux0(pvx0... pvx0VarArr) {
        this.f138859a = pvx0VarArr;
    }

    @Override // p153l.pvx0
    public final lvx0 zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            pvx0 pvx0Var = this.f138859a[i];
            if (pvx0Var.zzc(cls)) {
                return pvx0Var.zzb(cls);
            }
        }
        pr3.m173429a("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p153l.pvx0
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.f138859a[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
