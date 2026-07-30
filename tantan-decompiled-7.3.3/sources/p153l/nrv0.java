package p153l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class nrv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f143444a;

    /* JADX INFO: renamed from: b */
    public final j0v0 f143445b;

    public nrv0(xvw0 xvw0Var, j0v0 j0v0Var) {
        this.f143444a = xvw0Var;
        this.f143445b = j0v0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ urv0 m164533a() throws Exception {
        j0v0 j0v0Var = this.f143445b;
        String strM143038c = j0v0Var.m143038c();
        boolean zM143052q = j0v0Var.m143052q();
        boolean zM114543l = bxy0.m106937u().m114543l();
        j0v0 j0v0Var2 = this.f143445b;
        return new urv0(strM143038c, zM143052q, zM114543l, j0v0Var2.m143050o(), j0v0Var2.m143053r());
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 23;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f143444a.mo155969R(new Callable() { // from class: l.mrv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f138421a.m164533a();
            }
        });
    }
}
