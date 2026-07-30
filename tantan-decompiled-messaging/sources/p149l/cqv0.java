package p149l;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class cqv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f82120a;

    /* JADX INFO: renamed from: b */
    public final List f82121b;

    /* JADX INFO: renamed from: c */
    public final q6s0 f82122c;

    public cqv0(q6s0 q6s0Var, rmw0 rmw0Var, List list) {
        this.f82122c = q6s0Var;
        this.f82120a = rmw0Var;
        this.f82121b = list;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 48;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f82120a.mo122102R(new Callable() { // from class: l.bqv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new dqv0(this.f76819a.f82121b);
            }
        });
    }
}
