package p149l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class fri0 {

    /* JADX INFO: renamed from: a */
    public final SparseArray<eri0> f98978a = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public eri0 m122874a(int i) {
        eri0 eri0Var = this.f98978a.get(i);
        if (eri0Var != null) {
            return eri0Var;
        }
        eri0 eri0Var2 = new eri0(9223372036854775806L);
        this.f98978a.put(i, eri0Var2);
        return eri0Var2;
    }

    /* JADX INFO: renamed from: b */
    public void m122875b() {
        this.f98978a.clear();
    }
}
