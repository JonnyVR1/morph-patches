package p149l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class vhv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f181534a;

    public vhv0(rmw0 rmw0Var) {
        this.f181534a = rmw0Var;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 20;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f181534a.mo122102R(new Callable() { // from class: l.uhv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new whv0(vny0.m199083u().m211389b(), vny0.m199083u().m211400m());
            }
        });
    }
}
