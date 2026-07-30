package p149l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class gev0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f102307a;

    /* JADX INFO: renamed from: b */
    public final iyv0 f102308b;

    /* JADX INFO: renamed from: c */
    public final wyv0 f102309c;

    public gev0(rmw0 rmw0Var, iyv0 iyv0Var, wyv0 wyv0Var) {
        this.f102307a = rmw0Var;
        this.f102308b = iyv0Var;
        this.f102309c = wyv0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hev0 m125857a() throws Exception {
        String strM206229a = null;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132268i7)).booleanValue() && "requester_type_2".equals(kpv0.m146888b(this.f102308b.f115494d))) {
            strM206229a = wyv0.m206229a();
        }
        return new hev0(strM206229a);
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 5;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f102307a.mo122102R(new Callable() { // from class: l.fev0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f97161a.m125857a();
            }
        });
    }
}
