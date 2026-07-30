package p153l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class i0j0 {

    /* JADX INFO: renamed from: a */
    public final SparseArray<h0j0> f112377a = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public h0j0 m137972a(int i) {
        h0j0 h0j0Var = this.f112377a.get(i);
        if (h0j0Var != null) {
            return h0j0Var;
        }
        h0j0 h0j0Var2 = new h0j0(9223372036854775806L);
        this.f112377a.put(i, h0j0Var2);
        return h0j0Var2;
    }

    /* JADX INFO: renamed from: b */
    public void m137973b() {
        this.f112377a.clear();
    }
}
