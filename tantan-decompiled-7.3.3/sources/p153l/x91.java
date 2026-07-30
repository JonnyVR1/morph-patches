package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class x91 implements p2g0 {

    /* JADX INFO: renamed from: a */
    public List<a3g0> f192891a;

    /* JADX INFO: renamed from: b */
    public int f192892b;

    /* JADX INFO: renamed from: c */
    public d3g0 f192893c;

    @Override // p153l.p2g0
    /* JADX INFO: renamed from: a */
    public d3g0 mo170350a() {
        return this.f192893c;
    }

    @Override // p153l.p2g0
    /* JADX INFO: renamed from: b */
    public p2g0 mo170351b(d3g0 d3g0Var) {
        if (this.f192892b >= this.f192891a.size()) {
            return this;
        }
        a3g0 a3g0Var = this.f192891a.get(this.f192892b);
        x91 x91VarM209762c = m209762c(this.f192891a, this.f192892b + 1, d3g0Var);
        a3g0Var.mo95802a(x91VarM209762c);
        return x91VarM209762c;
    }

    /* JADX INFO: renamed from: c */
    public x91 m209762c(List<a3g0> list, int i, d3g0 d3g0Var) {
        this.f192891a = list;
        this.f192892b = i;
        this.f192893c = d3g0Var;
        return this;
    }
}
