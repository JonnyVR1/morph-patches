package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class max0 implements xax0 {

    /* JADX INFO: renamed from: a */
    public final xax0[] f132968a;

    public max0(xax0... xax0VarArr) {
        this.f132968a = xax0VarArr;
    }

    @Override // p149l.xax0
    public final wax0 zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            xax0 xax0Var = this.f132968a[i];
            if (xax0Var.zzc(cls)) {
                return xax0Var.zzb(cls);
            }
        }
        qq3.m175877a("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p149l.xax0
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.f132968a[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
