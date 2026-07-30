package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class h7u0 implements icu0 {

    /* JADX INFO: renamed from: c */
    public static final Object f106337c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile icu0 f106338a;

    /* JADX INFO: renamed from: b */
    public volatile Object f106339b = f106337c;

    public h7u0(icu0 icu0Var) {
        this.f106338a = icu0Var;
    }

    /* JADX INFO: renamed from: a */
    public static icu0 m129796a(icu0 icu0Var) {
        return icu0Var instanceof h7u0 ? icu0Var : new h7u0(icu0Var);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Object m129797b() {
        try {
            Object obj = this.f106339b;
            Object obj2 = f106337c;
            if (obj != obj2) {
                return obj;
            }
            Object objZza = this.f106338a.zza();
            Object obj3 = this.f106339b;
            if (obj3 != obj2 && obj3 != objZza) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
            }
            this.f106339b = objZza;
            this.f106338a = null;
            return objZza;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.veu0
    public final Object zza() {
        Object obj = this.f106339b;
        return obj == f106337c ? m129797b() : obj;
    }
}
