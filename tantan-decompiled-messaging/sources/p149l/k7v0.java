package p149l;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class k7v0 extends h7v0 {

    /* JADX INFO: renamed from: a */
    public final xbt0 f121638a;

    /* JADX INFO: renamed from: b */
    public final kwt0 f121639b;

    /* JADX INFO: renamed from: c */
    public final oav0 f121640c;

    /* JADX INFO: renamed from: d */
    public final h4u0 f121641d;

    /* JADX INFO: renamed from: e */
    public final fau0 f121642e;

    /* JADX INFO: renamed from: f */
    public final l0u0 f121643f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f121644g;

    /* JADX INFO: renamed from: h */
    public final f3u0 f121645h;

    /* JADX INFO: renamed from: i */
    public final y7v0 f121646i;

    /* JADX INFO: renamed from: j */
    public final n3v0 f121647j;

    public k7v0(xbt0 xbt0Var, kwt0 kwt0Var, oav0 oav0Var, h4u0 h4u0Var, fau0 fau0Var, l0u0 l0u0Var, @Nullable ViewGroup viewGroup, @Nullable f3u0 f3u0Var, y7v0 y7v0Var, n3v0 n3v0Var) {
        this.f121638a = xbt0Var;
        this.f121639b = kwt0Var;
        this.f121640c = oav0Var;
        this.f121641d = h4u0Var;
        this.f121642e = fau0Var;
        this.f121643f = l0u0Var;
        this.f121644g = viewGroup;
        this.f121645h = f3u0Var;
        this.f121646i = y7v0Var;
        this.f121647j = n3v0Var;
    }

    @Override // p149l.h7v0
    /* JADX INFO: renamed from: c */
    public final gnr mo119844c(iyv0 iyv0Var, Bundle bundle, kxv0 kxv0Var, vxv0 vxv0Var) {
        kwt0 kwt0Var = this.f121639b;
        kwt0Var.m147648i(iyv0Var);
        kwt0Var.m147645f(bundle);
        kwt0Var.m147646g(new tut0(vxv0Var, kxv0Var, this.f121646i));
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132394s3)).booleanValue()) {
            this.f121639b.m147643d(this.f121647j);
        }
        xbt0 xbt0Var = this.f121638a;
        kwt0 kwt0Var2 = this.f121639b;
        sot0 sot0VarMo135799j = xbt0Var.mo135799j();
        sot0VarMo135799j.mo185302o(kwt0Var2.m147649j());
        sot0VarMo135799j.mo185301g(this.f121641d);
        sot0VarMo135799j.mo185303p(this.f121640c);
        sot0VarMo135799j.mo185298c(this.f121642e);
        sot0VarMo135799j.mo185299e(new ppt0(this.f121643f, this.f121645h));
        sot0VarMo135799j.mo185297b(new lnt0(this.f121644g));
        trt0 trt0VarMo189931d = sot0VarMo135799j.zzk().mo189931d();
        return trt0VarMo189931d.m190444i(trt0VarMo189931d.m190445j());
    }
}
