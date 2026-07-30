package p149l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class zhv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f203236a;

    /* JADX INFO: renamed from: b */
    public final iyv0 f203237b;

    public zhv0(rmw0 rmw0Var, iyv0 iyv0Var) {
        this.f203236a = rmw0Var;
        this.f203237b = iyv0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ aiv0 m218867a() throws Exception {
        return new aiv0("requester_type_2".equals(kpv0.m146888b(this.f203237b.f115494d)));
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 21;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f203236a.mo122102R(new Callable() { // from class: l.yhv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f198400a.m218867a();
            }
        });
    }
}
