package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class s7v0 extends h7v0 {

    /* JADX INFO: renamed from: a */
    public final xbt0 f162946a;

    /* JADX INFO: renamed from: b */
    public final kwt0 f162947b;

    /* JADX INFO: renamed from: c */
    public final oav0 f162948c;

    /* JADX INFO: renamed from: d */
    public final h4u0 f162949d;

    /* JADX INFO: renamed from: e */
    public final y7v0 f162950e;

    /* JADX INFO: renamed from: f */
    public final n3v0 f162951f;

    public s7v0(xbt0 xbt0Var, kwt0 kwt0Var, oav0 oav0Var, h4u0 h4u0Var, y7v0 y7v0Var, n3v0 n3v0Var) {
        this.f162946a = xbt0Var;
        this.f162947b = kwt0Var;
        this.f162948c = oav0Var;
        this.f162949d = h4u0Var;
        this.f162950e = y7v0Var;
        this.f162951f = n3v0Var;
    }

    @Override // p149l.h7v0
    /* JADX INFO: renamed from: c */
    public final gnr mo119844c(iyv0 iyv0Var, Bundle bundle, kxv0 kxv0Var, vxv0 vxv0Var) {
        kwt0 kwt0Var = this.f162947b;
        kwt0Var.m147648i(iyv0Var);
        kwt0Var.m147645f(bundle);
        kwt0Var.m147646g(new tut0(vxv0Var, kxv0Var, this.f162950e));
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132394s3)).booleanValue()) {
            this.f162947b.m147643d(this.f162951f);
        }
        xbt0 xbt0Var = this.f162946a;
        kwt0 kwt0Var2 = this.f162947b;
        i9u0 i9u0VarMo135801l = xbt0Var.mo135801l();
        i9u0VarMo135801l.mo106788n(kwt0Var2.m147649j());
        i9u0VarMo135801l.mo106784i(this.f162949d);
        i9u0VarMo135801l.mo106787m(this.f162948c);
        trt0 trt0VarMo116363a = i9u0VarMo135801l.zzf().mo116363a();
        return trt0VarMo116363a.m190444i(trt0VarMo116363a.m190445j());
    }
}
