package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class rkw0 extends tkw0 {
    public rkw0(gnr gnrVar, Class cls, rlw0 rlw0Var) {
        super(gnrVar, cls, rlw0Var);
    }

    @Override // p149l.tkw0
    /* JADX INFO: renamed from: D */
    public final /* bridge */ /* synthetic */ Object mo179771D(Object obj, Throwable th) throws Exception {
        rlw0 rlw0Var = (rlw0) obj;
        gnr gnrVarZza = rlw0Var.zza(th);
        nfw0.m159282d(gnrVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", rlw0Var);
        return gnrVarZza;
    }

    @Override // p149l.tkw0
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void mo179772E(Object obj) {
        m13025u((gnr) obj);
    }
}
