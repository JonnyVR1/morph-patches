package p149l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class ugv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f176457a;

    public ugv0(rmw0 rmw0Var) {
        this.f176457a = rmw0Var;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 55;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f176457a.mo122102R(new Callable() { // from class: l.tgv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new vgv0(vny0.m199064b().currentTimeMillis() - vny0.m199079q().m212279i().zzh().m182042a());
            }
        });
    }
}
