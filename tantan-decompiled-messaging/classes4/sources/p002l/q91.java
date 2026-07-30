package p002l;

import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q91 implements guf0 {

    /* JADX INFO: renamed from: a */
    public List<ruf0> f17867a;

    /* JADX INFO: renamed from: b */
    public int f17868b;

    /* JADX INFO: renamed from: c */
    public uuf0 f17869c;

    @Override // p002l.guf0
    /* JADX INFO: renamed from: a */
    public uuf0 mo14046a() {
        return this.f17869c;
    }

    @Override // p002l.guf0
    /* JADX INFO: renamed from: b */
    public guf0 mo14047b(uuf0 uuf0Var) {
        if (this.f17868b >= this.f17867a.size()) {
            return this;
        }
        ruf0 ruf0Var = this.f17867a.get(this.f17868b);
        q91 q91VarM21105c = m21105c(this.f17867a, this.f17868b + 1, uuf0Var);
        ruf0Var.mo10063a(q91VarM21105c);
        return q91VarM21105c;
    }

    /* JADX INFO: renamed from: c */
    public q91 m21105c(List<ruf0> list, int i, uuf0 uuf0Var) {
        this.f17867a = list;
        this.f17868b = i;
        this.f17869c = uuf0Var;
        return this;
    }
}
