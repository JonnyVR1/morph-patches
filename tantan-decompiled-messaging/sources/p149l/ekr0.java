package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ekr0 {

    /* JADX INFO: renamed from: a */
    public final List f92007a;

    /* JADX INFO: renamed from: b */
    public final m7r0[] f92008b;

    public ekr0(List list) {
        this.f92007a = list;
        this.f92008b = new m7r0[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public final void m116992a(long j, v6w0 v6w0Var) {
        w4r0.m201559a(j, v6w0Var, this.f92008b);
    }

    /* JADX INFO: renamed from: b */
    public final void m116993b(m5r0 m5r0Var, alr0 alr0Var) {
        for (int i = 0; i < this.f92008b.length; i++) {
            alr0Var.m97444c();
            m7r0 m7r0VarMo129454i = m5r0Var.mo129454i(alr0Var.m97442a(), 3);
            mhr0 mhr0Var = (mhr0) this.f92007a.get(i);
            String str = mhr0Var.f133892l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            f5v0.m119534e(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String strM97443b = mhr0Var.f133881a;
            if (strM97443b == null) {
                strM97443b = alr0Var.m97443b();
            }
            ter0 ter0Var = new ter0();
            ter0Var.m188604k(strM97443b);
            ter0Var.m188618w(str);
            ter0Var.m188620y(mhr0Var.f133884d);
            ter0Var.m188609n(mhr0Var.f133883c);
            ter0Var.m188601i0(mhr0Var.f133877D);
            ter0Var.m188606l(mhr0Var.f133894n);
            m7r0VarMo129454i.mo134531d(ter0Var.m188591D());
            this.f92008b[i] = m7r0VarMo129454i;
        }
    }
}
