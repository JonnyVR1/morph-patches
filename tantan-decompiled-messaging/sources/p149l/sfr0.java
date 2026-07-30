package p149l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
public final class sfr0 implements m5r0 {

    /* JADX INFO: renamed from: a */
    public final m5r0 f164331a;

    /* JADX INFO: renamed from: b */
    public final pfr0 f164332b;

    /* JADX INFO: renamed from: c */
    public final SparseArray f164333c = new SparseArray();

    public sfr0(m5r0 m5r0Var, pfr0 pfr0Var) {
        this.f164331a = m5r0Var;
        this.f164332b = pfr0Var;
    }

    @Override // p149l.m5r0
    /* JADX INFO: renamed from: c */
    public final void mo129453c() {
        this.f164331a.mo129453c();
    }

    @Override // p149l.m5r0
    /* JADX INFO: renamed from: i */
    public final m7r0 mo129454i(int i, int i2) {
        if (i2 != 3) {
            return this.f164331a.mo129454i(i, i2);
        }
        ufr0 ufr0Var = (ufr0) this.f164333c.get(i);
        if (ufr0Var != null) {
            return ufr0Var;
        }
        ufr0 ufr0Var2 = new ufr0(this.f164331a.mo129454i(i, 3), this.f164332b);
        this.f164333c.put(i, ufr0Var2);
        return ufr0Var2;
    }

    @Override // p149l.m5r0
    /* JADX INFO: renamed from: j */
    public final void mo129455j(v6r0 v6r0Var) {
        this.f164331a.mo129455j(v6r0Var);
    }
}
