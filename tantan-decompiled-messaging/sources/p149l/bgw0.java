package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class bgw0 implements zfw0 {

    /* JADX INFO: renamed from: c */
    public static final zfw0 f75531c = new zfw0() { // from class: l.agw0
        @Override // p149l.zfw0
        public final Object zza() {
            throw new IllegalStateException();
        }
    };

    /* JADX INFO: renamed from: a */
    public volatile zfw0 f75532a;

    /* JADX INFO: renamed from: b */
    public Object f75533b;

    public bgw0(zfw0 zfw0Var) {
        this.f75532a = zfw0Var;
    }

    public final String toString() {
        Object obj = this.f75532a;
        if (obj == f75531c) {
            obj = "<supplier that returned " + String.valueOf(this.f75533b) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // p149l.zfw0
    public final Object zza() {
        zfw0 zfw0Var = this.f75532a;
        zfw0 zfw0Var2 = f75531c;
        if (zfw0Var != zfw0Var2) {
            synchronized (this) {
                try {
                    if (this.f75532a != zfw0Var2) {
                        Object objZza = this.f75532a.zza();
                        this.f75533b = objZza;
                        this.f75532a = zfw0Var2;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f75533b;
    }
}
