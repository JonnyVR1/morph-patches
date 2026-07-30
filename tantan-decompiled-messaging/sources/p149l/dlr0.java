package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dlr0 {

    /* JADX INFO: renamed from: a */
    public final List f86851a;

    /* JADX INFO: renamed from: b */
    public final m7r0[] f86852b;

    public dlr0(List list) {
        this.f86851a = list;
        this.f86852b = new m7r0[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public final void m112412a(long j, v6w0 v6w0Var) {
        if (v6w0Var.m197268q() < 9) {
            return;
        }
        int iM197273v = v6w0Var.m197273v();
        int iM197273v2 = v6w0Var.m197273v();
        int iM197238B = v6w0Var.m197238B();
        if (iM197273v == 434 && iM197273v2 == 1195456820 && iM197238B == 3) {
            w4r0.m201560b(j, v6w0Var, this.f86852b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m112413b(m5r0 m5r0Var, alr0 alr0Var) {
        for (int i = 0; i < this.f86852b.length; i++) {
            alr0Var.m97444c();
            m7r0 m7r0VarMo129454i = m5r0Var.mo129454i(alr0Var.m97442a(), 3);
            mhr0 mhr0Var = (mhr0) this.f86851a.get(i);
            String str = mhr0Var.f133892l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            f5v0.m119534e(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            ter0 ter0Var = new ter0();
            ter0Var.m188604k(alr0Var.m97443b());
            ter0Var.m188618w(str);
            ter0Var.m188620y(mhr0Var.f133884d);
            ter0Var.m188609n(mhr0Var.f133883c);
            ter0Var.m188601i0(mhr0Var.f133877D);
            ter0Var.m188606l(mhr0Var.f133894n);
            m7r0VarMo129454i.mo134531d(ter0Var.m188591D());
            this.f86852b[i] = m7r0VarMo129454i;
        }
    }
}
