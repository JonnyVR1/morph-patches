package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class sxx0 implements fzx0 {

    /* JADX INFO: renamed from: a */
    public fzx0[] f166842a;

    public sxx0(fzx0... fzx0VarArr) {
        this.f166842a = fzx0VarArr;
    }

    @Override // p149l.fzx0
    public final b0y0 zza(Class<?> cls) {
        for (fzx0 fzx0Var : this.f166842a) {
            if (fzx0Var.zzb(cls)) {
                return fzx0Var.zza(cls);
            }
        }
        qq3.m175877a("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p149l.fzx0
    public final boolean zzb(Class<?> cls) {
        for (fzx0 fzx0Var : this.f166842a) {
            if (fzx0Var.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
