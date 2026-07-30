package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class q91 implements guf0 {

    /* JADX INFO: renamed from: a */
    public List<ruf0> f153353a;

    /* JADX INFO: renamed from: b */
    public int f153354b;

    /* JADX INFO: renamed from: c */
    public uuf0 f153355c;

    @Override // p149l.guf0
    /* JADX INFO: renamed from: a */
    public uuf0 mo128030a() {
        return this.f153355c;
    }

    @Override // p149l.guf0
    /* JADX INFO: renamed from: b */
    public guf0 mo128031b(uuf0 uuf0Var) {
        if (this.f153354b >= this.f153353a.size()) {
            return this;
        }
        ruf0 ruf0Var = this.f153353a.get(this.f153354b);
        q91 q91VarM173581c = m173581c(this.f153353a, this.f153354b + 1, uuf0Var);
        ruf0Var.mo98305a(q91VarM173581c);
        return q91VarM173581c;
    }

    /* JADX INFO: renamed from: c */
    public q91 m173581c(List<ruf0> list, int i, uuf0 uuf0Var) {
        this.f153353a = list;
        this.f153354b = i;
        this.f153355c = uuf0Var;
        return this;
    }
}
