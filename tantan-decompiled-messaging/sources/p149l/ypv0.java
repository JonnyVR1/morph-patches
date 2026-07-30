package p149l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class ypv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f199502a;

    /* JADX INFO: renamed from: b */
    public final String f199503b;

    /* JADX INFO: renamed from: c */
    public final d1t0 f199504c;

    public ypv0(d1t0 d1t0Var, rmw0 rmw0Var, String str) {
        this.f199504c = d1t0Var;
        this.f199502a = rmw0Var;
        this.f199503b = str;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 47;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        final gnr gnrVarM142235h = jmw0.m142235h(null);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132030P5)).booleanValue()) {
            gnrVarM142235h = jmw0.m142235h(null);
        }
        final gnr gnrVarM142235h2 = jmw0.m142235h(null);
        return jmw0.m142230c(gnrVarM142235h, gnrVarM142235h2).m137091a(new Callable() { // from class: l.xpv0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zpv0((String) gnrVarM142235h.get(), (String) gnrVarM142235h2.get());
            }
        }, i3t0.f111372a);
    }
}
