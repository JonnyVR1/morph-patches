package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class hpw0 implements fpw0 {

    /* JADX INFO: renamed from: c */
    public static final fpw0 f111053c = new fpw0() { // from class: l.gpw0
        @Override // p153l.fpw0
        public final Object zza() {
            throw new IllegalStateException();
        }
    };

    /* JADX INFO: renamed from: a */
    public volatile fpw0 f111054a;

    /* JADX INFO: renamed from: b */
    public Object f111055b;

    public hpw0(fpw0 fpw0Var) {
        this.f111054a = fpw0Var;
    }

    public final String toString() {
        Object obj = this.f111054a;
        if (obj == f111053c) {
            obj = "<supplier that returned " + String.valueOf(this.f111055b) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // p153l.fpw0
    public final Object zza() {
        fpw0 fpw0Var = this.f111054a;
        fpw0 fpw0Var2 = f111053c;
        if (fpw0Var != fpw0Var2) {
            synchronized (this) {
                try {
                    if (this.f111054a != fpw0Var2) {
                        Object objZza = this.f111054a.zza();
                        this.f111055b = objZza;
                        this.f111054a = fpw0Var2;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f111055b;
    }
}
