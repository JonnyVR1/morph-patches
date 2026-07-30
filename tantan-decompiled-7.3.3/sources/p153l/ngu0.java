package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class ngu0 implements olu0 {

    /* JADX INFO: renamed from: c */
    public static final Object f141860c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile olu0 f141861a;

    /* JADX INFO: renamed from: b */
    public volatile Object f141862b = f141860c;

    public ngu0(olu0 olu0Var) {
        this.f141861a = olu0Var;
    }

    /* JADX INFO: renamed from: a */
    public static olu0 m163011a(olu0 olu0Var) {
        return olu0Var instanceof ngu0 ? olu0Var : new ngu0(olu0Var);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Object m163012b() {
        try {
            Object obj = this.f141862b;
            Object obj2 = f141860c;
            if (obj != obj2) {
                return obj;
            }
            Object objZza = this.f141861a.zza();
            Object obj3 = this.f141862b;
            if (obj3 != obj2 && obj3 != objZza) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
            }
            this.f141862b = objZza;
            this.f141861a = null;
            return objZza;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.bou0
    public final Object zza() {
        Object obj = this.f141862b;
        return obj == f141860c ? m163012b() : obj;
    }
}
