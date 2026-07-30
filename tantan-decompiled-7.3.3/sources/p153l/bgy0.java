package p153l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
public final class bgy0 {

    /* JADX INFO: renamed from: a */
    public final akr0 f76702a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f76703b;

    public bgy0(akr0 akr0Var, SparseArray sparseArray) {
        this.f76702a = akr0Var;
        SparseArray sparseArray2 = new SparseArray(akr0Var.m98614b());
        for (int i = 0; i < akr0Var.m98614b(); i++) {
            int iM98613a = akr0Var.m98613a(i);
            yfy0 yfy0Var = (yfy0) sparseArray.get(iM98613a);
            yfy0Var.getClass();
            sparseArray2.append(iM98613a, yfy0Var);
        }
        this.f76703b = sparseArray2;
    }

    /* JADX INFO: renamed from: a */
    public final int m104286a(int i) {
        return this.f76702a.m98613a(i);
    }

    /* JADX INFO: renamed from: b */
    public final int m104287b() {
        return this.f76702a.m98614b();
    }

    /* JADX INFO: renamed from: c */
    public final yfy0 m104288c(int i) {
        yfy0 yfy0Var = (yfy0) this.f76703b.get(i);
        yfy0Var.getClass();
        return yfy0Var;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m104289d(int i) {
        return this.f76702a.m98615c(i);
    }
}
