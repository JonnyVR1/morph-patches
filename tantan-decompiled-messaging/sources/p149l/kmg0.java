package p149l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class kmg0 extends ocg0 {

    /* JADX INFO: renamed from: e */
    public q6g0 f123793e;

    /* JADX INFO: renamed from: f */
    public SparseArray f123794f;

    public kmg0(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m146532a(tfg0 tfg0Var) {
        this.f143037b = tfg0Var;
        this.f143038c = tfg0Var.m188709e();
        SparseArray sparseArray = new SparseArray();
        int size = tfg0Var.f169981g.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(i, Long.valueOf(((sbg0) tfg0Var.f169981g.get(i)).f163536c.get()));
        }
        this.f143039d = sparseArray;
        this.f123793e = new q6g0();
        this.f123794f = new SparseArray();
        int size2 = tfg0Var.f169981g.size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.f123794f.put(i2, new q6g0());
        }
    }
}
