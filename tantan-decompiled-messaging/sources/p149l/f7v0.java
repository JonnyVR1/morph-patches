package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class f7v0 extends h7v0 {

    /* JADX INFO: renamed from: a */
    public final xbt0 f96295a;

    /* JADX INFO: renamed from: b */
    public final fau0 f96296b;

    /* JADX INFO: renamed from: c */
    public final kwt0 f96297c;

    /* JADX INFO: renamed from: d */
    public final h4u0 f96298d;

    /* JADX INFO: renamed from: e */
    public final y7v0 f96299e;

    /* JADX INFO: renamed from: f */
    public final n3v0 f96300f;

    public f7v0(xbt0 xbt0Var, fau0 fau0Var, kwt0 kwt0Var, h4u0 h4u0Var, y7v0 y7v0Var, n3v0 n3v0Var) {
        this.f96295a = xbt0Var;
        this.f96296b = fau0Var;
        this.f96297c = kwt0Var;
        this.f96298d = h4u0Var;
        this.f96299e = y7v0Var;
        this.f96300f = n3v0Var;
    }

    @Override // p149l.h7v0
    /* JADX INFO: renamed from: c */
    public final gnr mo119844c(iyv0 iyv0Var, Bundle bundle, kxv0 kxv0Var, vxv0 vxv0Var) {
        kwt0 kwt0Var = this.f96297c;
        kwt0Var.m147648i(iyv0Var);
        kwt0Var.m147645f(bundle);
        kwt0Var.m147646g(new tut0(vxv0Var, kxv0Var, this.f96299e));
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132394s3)).booleanValue()) {
            this.f96297c.m147643d(this.f96300f);
        }
        xbt0 xbt0Var = this.f96295a;
        kwt0 kwt0Var2 = this.f96297c;
        jau0 jau0VarMo135802m = xbt0Var.mo135802m();
        jau0VarMo135802m.mo140717l(kwt0Var2.m147649j());
        jau0VarMo135802m.mo140716h(this.f96298d);
        jau0VarMo135802m.mo140715c(this.f96296b);
        jau0VarMo135802m.mo140714b(new lnt0(null));
        trt0 trt0VarMo145182a = jau0VarMo135802m.zzg().mo145182a();
        return trt0VarMo145182a.m190444i(trt0VarMo145182a.m190445j());
    }
}
