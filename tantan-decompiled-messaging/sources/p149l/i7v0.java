package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class i7v0 extends h7v0 {

    /* JADX INFO: renamed from: a */
    public final xbt0 f111949a;

    /* JADX INFO: renamed from: b */
    public final kwt0 f111950b;

    /* JADX INFO: renamed from: c */
    public final h4u0 f111951c;

    /* JADX INFO: renamed from: d */
    public final y7v0 f111952d;

    /* JADX INFO: renamed from: e */
    public final n3v0 f111953e;

    public i7v0(xbt0 xbt0Var, kwt0 kwt0Var, h4u0 h4u0Var, y7v0 y7v0Var, n3v0 n3v0Var) {
        this.f111949a = xbt0Var;
        this.f111950b = kwt0Var;
        this.f111951c = h4u0Var;
        this.f111952d = y7v0Var;
        this.f111953e = n3v0Var;
    }

    @Override // p149l.h7v0
    /* JADX INFO: renamed from: c */
    public final gnr mo119844c(iyv0 iyv0Var, Bundle bundle, kxv0 kxv0Var, vxv0 vxv0Var) {
        kwt0 kwt0Var = this.f111950b;
        kwt0Var.m147648i(iyv0Var);
        kwt0Var.m147645f(bundle);
        kwt0Var.m147646g(new tut0(vxv0Var, kxv0Var, this.f111952d));
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132394s3)).booleanValue()) {
            this.f111950b.m147643d(this.f111953e);
        }
        xbt0 xbt0Var = this.f111949a;
        kwt0 kwt0Var2 = this.f111950b;
        smt0 smt0VarMo135798i = xbt0Var.mo135798i();
        smt0VarMo135798i.mo154313d(kwt0Var2.m147649j());
        smt0VarMo135798i.mo154312a(this.f111951c);
        trt0 trt0VarZzb = smt0VarMo135798i.zze().zzb();
        return trt0VarZzb.m190444i(trt0VarZzb.m190445j());
    }
}
