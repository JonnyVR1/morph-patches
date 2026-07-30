package p153l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class sug0 extends wkg0 {

    /* JADX INFO: renamed from: e */
    public yeg0 f170685e;

    /* JADX INFO: renamed from: f */
    public SparseArray f170686f;

    public sug0(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m188025a(bog0 bog0Var) {
        this.f189548b = bog0Var;
        this.f189549c = bog0Var.m105681e();
        SparseArray sparseArray = new SparseArray();
        int size = bog0Var.f77680g.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(i, Long.valueOf(((akg0) bog0Var.f77680g.get(i)).f72005c.get()));
        }
        this.f189550d = sparseArray;
        this.f170685e = new yeg0();
        this.f170686f = new SparseArray();
        int size2 = bog0Var.f77680g.size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.f170686f.put(i2, new yeg0());
        }
    }
}
