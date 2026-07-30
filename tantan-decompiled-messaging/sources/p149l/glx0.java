package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class glx0 implements jmx0 {

    /* JADX INFO: renamed from: a */
    public final jmx0[] f103413a;

    public glx0(jmx0... jmx0VarArr) {
        this.f103413a = jmx0VarArr;
    }

    @Override // p149l.jmx0
    public final fmx0 zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            jmx0 jmx0Var = this.f103413a[i];
            if (jmx0Var.zzc(cls)) {
                return jmx0Var.zzb(cls);
            }
        }
        qq3.m175877a("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p149l.jmx0
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.f103413a[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
