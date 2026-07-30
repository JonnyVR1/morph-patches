package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class glw0 extends ilw0 {
    public glw0(gnr gnrVar, rlw0 rlw0Var) {
        super(gnrVar, rlw0Var);
    }

    @Override // p149l.ilw0
    /* JADX INFO: renamed from: D */
    public final /* bridge */ /* synthetic */ Object mo126924D(Object obj, Object obj2) throws Exception {
        rlw0 rlw0Var = (rlw0) obj;
        gnr gnrVarZza = rlw0Var.zza(obj2);
        nfw0.m159282d(gnrVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", rlw0Var);
        return gnrVarZza;
    }

    @Override // p149l.ilw0
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void mo126925E(Object obj) {
        m13025u((gnr) obj);
    }
}
