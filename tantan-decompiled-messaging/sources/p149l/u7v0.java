package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class u7v0 extends h7v0 {

    /* JADX INFO: renamed from: a */
    public final xbt0 f175075a;

    /* JADX INFO: renamed from: b */
    public final kwt0 f175076b;

    /* JADX INFO: renamed from: c */
    public final h4u0 f175077c;

    /* JADX INFO: renamed from: d */
    public final y7v0 f175078d;

    /* JADX INFO: renamed from: e */
    public final wxv0 f175079e;

    /* JADX INFO: renamed from: f */
    public final n3v0 f175080f;

    public u7v0(xbt0 xbt0Var, kwt0 kwt0Var, h4u0 h4u0Var, wxv0 wxv0Var, y7v0 y7v0Var, n3v0 n3v0Var) {
        this.f175075a = xbt0Var;
        this.f175076b = kwt0Var;
        this.f175077c = h4u0Var;
        this.f175079e = wxv0Var;
        this.f175078d = y7v0Var;
        this.f175080f = n3v0Var;
    }

    @Override // p149l.h7v0
    /* JADX INFO: renamed from: c */
    public final gnr mo119844c(iyv0 iyv0Var, Bundle bundle, kxv0 kxv0Var, vxv0 vxv0Var) {
        wxv0 wxv0Var;
        kwt0 kwt0Var = this.f175076b;
        kwt0Var.m147648i(iyv0Var);
        kwt0Var.m147645f(bundle);
        kwt0Var.m147646g(new tut0(vxv0Var, kxv0Var, this.f175078d));
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132381r3)).booleanValue() && (wxv0Var = this.f175079e) != null) {
            this.f175076b.m147647h(wxv0Var);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132394s3)).booleanValue()) {
            this.f175076b.m147643d(this.f175080f);
        }
        xbt0 xbt0Var = this.f175075a;
        kwt0 kwt0Var2 = this.f175076b;
        iju0 iju0VarMo135803n = xbt0Var.mo135803n();
        iju0VarMo135803n.mo136751d(kwt0Var2.m147649j());
        iju0VarMo135803n.mo136750a(this.f175077c);
        trt0 trt0VarZzb = iju0VarMo135803n.zze().zzb();
        return trt0VarZzb.m190444i(trt0VarZzb.m190445j());
    }
}
