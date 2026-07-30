package p149l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class hiv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f107983a;

    /* JADX INFO: renamed from: b */
    public final dru0 f107984b;

    public hiv0(rmw0 rmw0Var, dru0 dru0Var) {
        this.f107983a = rmw0Var;
        this.f107984b = dru0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oiv0 m131309a() throws Exception {
        dru0 dru0Var = this.f107984b;
        String strM113341c = dru0Var.m113341c();
        boolean zM113355q = dru0Var.m113355q();
        boolean zM211399l = vny0.m199083u().m211399l();
        dru0 dru0Var2 = this.f107984b;
        return new oiv0(strM113341c, zM113355q, zM211399l, dru0Var2.m113353o(), dru0Var2.m113356r());
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 23;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f107983a.mo122102R(new Callable() { // from class: l.giv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f102976a.m131309a();
            }
        });
    }
}
