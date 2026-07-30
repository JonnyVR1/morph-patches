package p149l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
public final class v6y0 {

    /* JADX INFO: renamed from: a */
    public final uar0 f180244a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f180245b;

    public v6y0(uar0 uar0Var, SparseArray sparseArray) {
        this.f180244a = uar0Var;
        SparseArray sparseArray2 = new SparseArray(uar0Var.m192798b());
        for (int i = 0; i < uar0Var.m192798b(); i++) {
            int iM192797a = uar0Var.m192797a(i);
            s6y0 s6y0Var = (s6y0) sparseArray.get(iM192797a);
            s6y0Var.getClass();
            sparseArray2.append(iM192797a, s6y0Var);
        }
        this.f180245b = sparseArray2;
    }

    /* JADX INFO: renamed from: a */
    public final int m197279a(int i) {
        return this.f180244a.m192797a(i);
    }

    /* JADX INFO: renamed from: b */
    public final int m197280b() {
        return this.f180244a.m192798b();
    }

    /* JADX INFO: renamed from: c */
    public final s6y0 m197281c(int i) {
        s6y0 s6y0Var = (s6y0) this.f180245b.get(i);
        s6y0Var.getClass();
        return s6y0Var;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m197282d(int i) {
        return this.f180244a.m192799c(i);
    }
}
