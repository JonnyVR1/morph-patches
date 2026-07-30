package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class y6y0 implements l8y0 {

    /* JADX INFO: renamed from: a */
    public l8y0[] f197725a;

    public y6y0(l8y0... l8y0VarArr) {
        this.f197725a = l8y0VarArr;
    }

    @Override // p153l.l8y0
    public final h9y0 zza(Class<?> cls) {
        for (l8y0 l8y0Var : this.f197725a) {
            if (l8y0Var.zzb(cls)) {
                return l8y0Var.zza(cls);
            }
        }
        pr3.m173429a("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p153l.l8y0
    public final boolean zzb(Class<?> cls) {
        for (l8y0 l8y0Var : this.f197725a) {
            if (l8y0Var.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
