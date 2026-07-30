package p149l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class ygv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f198248a;

    /* JADX INFO: renamed from: b */
    public final glu0 f198249b;

    /* JADX INFO: renamed from: c */
    public final String f198250c;

    /* JADX INFO: renamed from: d */
    public final iyv0 f198251d;

    public ygv0(rmw0 rmw0Var, glu0 glu0Var, iyv0 iyv0Var, String str) {
        this.f198248a = rmw0Var;
        this.f198249b = glu0Var;
        this.f198251d = iyv0Var;
        this.f198250c = str;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zgv0 m214774a() throws Exception {
        iyv0 iyv0Var = this.f198251d;
        glu0 glu0Var = this.f198249b;
        return new zgv0(glu0Var.m126918b(iyv0Var.f115496f, this.f198250c), glu0Var.m126917a());
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 17;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f198248a.mo122102R(new Callable() { // from class: l.xgv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f192800a.m214774a();
            }
        });
    }
}
