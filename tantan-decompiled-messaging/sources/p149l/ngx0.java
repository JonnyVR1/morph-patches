package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class ngx0 implements xgx0, egx0 {

    /* JADX INFO: renamed from: c */
    public static final Object f138922c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile xgx0 f138923a;

    /* JADX INFO: renamed from: b */
    public volatile Object f138924b = f138922c;

    public ngx0(xgx0 xgx0Var) {
        this.f138923a = xgx0Var;
    }

    /* JADX INFO: renamed from: a */
    public static egx0 m159363a(xgx0 xgx0Var) {
        return xgx0Var instanceof egx0 ? (egx0) xgx0Var : new ngx0(xgx0Var);
    }

    /* JADX INFO: renamed from: b */
    public static xgx0 m159364b(xgx0 xgx0Var) {
        return xgx0Var instanceof ngx0 ? xgx0Var : new ngx0(xgx0Var);
    }

    @Override // p149l.ehx0
    public final Object zzb() {
        Object objZzb;
        Object obj = this.f138924b;
        Object obj2 = f138922c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZzb = this.f138924b;
                if (objZzb == obj2) {
                    objZzb = this.f138923a.zzb();
                    Object obj3 = this.f138924b;
                    if (obj3 != obj2 && obj3 != objZzb) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
                    }
                    this.f138924b = objZzb;
                    this.f138923a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZzb;
    }
}
