package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class xtw0 extends ztw0 {
    public xtw0(hpr hprVar, Class cls, xuw0 xuw0Var) {
        super(hprVar, cls, xuw0Var);
    }

    @Override // p153l.ztw0
    /* JADX INFO: renamed from: D */
    public final /* bridge */ /* synthetic */ Object mo213110D(Object obj, Throwable th) throws Exception {
        xuw0 xuw0Var = (xuw0) obj;
        hpr hprVarZza = xuw0Var.zza(th);
        tow0.m192089d(hprVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", xuw0Var);
        return hprVarZza;
    }

    @Override // p153l.ztw0
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void mo213111E(Object obj) {
        m13079u((hpr) obj);
    }
}
