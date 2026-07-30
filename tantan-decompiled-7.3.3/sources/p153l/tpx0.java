package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class tpx0 implements dqx0, kpx0 {

    /* JADX INFO: renamed from: c */
    public static final Object f175662c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile dqx0 f175663a;

    /* JADX INFO: renamed from: b */
    public volatile Object f175664b = f175662c;

    public tpx0(dqx0 dqx0Var) {
        this.f175663a = dqx0Var;
    }

    /* JADX INFO: renamed from: a */
    public static kpx0 m192217a(dqx0 dqx0Var) {
        return dqx0Var instanceof kpx0 ? (kpx0) dqx0Var : new tpx0(dqx0Var);
    }

    /* JADX INFO: renamed from: b */
    public static dqx0 m192218b(dqx0 dqx0Var) {
        return dqx0Var instanceof tpx0 ? dqx0Var : new tpx0(dqx0Var);
    }

    @Override // p153l.kqx0
    public final Object zzb() {
        Object objZzb;
        Object obj = this.f175664b;
        Object obj2 = f175662c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZzb = this.f175664b;
                if (objZzb == obj2) {
                    objZzb = this.f175663a.zzb();
                    Object obj3 = this.f175664b;
                    if (obj3 != obj2 && obj3 != objZzb) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
                    }
                    this.f175664b = objZzb;
                    this.f175663a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZzb;
    }
}
