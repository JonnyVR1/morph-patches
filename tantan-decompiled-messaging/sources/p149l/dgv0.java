package p149l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class dgv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f86175a;

    public dgv0(rmw0 rmw0Var) {
        this.f86175a = rmw0Var;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 54;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f86175a.mo122102R(new Callable() { // from class: l.cgv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return egv0.m116367b();
            }
        });
    }
}
