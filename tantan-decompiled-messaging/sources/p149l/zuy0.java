package p149l;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class zuy0 extends g2u0 {

    /* JADX INFO: renamed from: r */
    public boolean f204916r;

    /* JADX INFO: renamed from: s */
    public boolean f204917s;

    /* JADX INFO: renamed from: t */
    public boolean f204918t;

    /* JADX INFO: renamed from: u */
    public boolean f204919u;

    /* JADX INFO: renamed from: v */
    public boolean f204920v;

    /* JADX INFO: renamed from: w */
    public boolean f204921w;

    /* JADX INFO: renamed from: x */
    public boolean f204922x;

    /* JADX INFO: renamed from: y */
    public final SparseArray f204923y;

    /* JADX INFO: renamed from: z */
    public final SparseBooleanArray f204924z;

    public /* synthetic */ zuy0(bvy0 bvy0Var, yuy0 yuy0Var) {
        super(bvy0Var);
        this.f204916r = bvy0Var.f77527k0;
        this.f204917s = bvy0Var.f77529m0;
        this.f204918t = bvy0Var.f77531o0;
        this.f204919u = bvy0Var.f77536t0;
        this.f204920v = bvy0Var.f77537u0;
        this.f204921w = bvy0Var.f77538v0;
        this.f204922x = bvy0Var.f77540x0;
        SparseArray sparseArray = bvy0Var.f77541y0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.f204923y = sparseArray2;
        this.f204924z = bvy0Var.f77542z0.clone();
    }

    @Override // p149l.g2u0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ g2u0 mo124188f(int i, int i2, boolean z) {
        super.mo124188f(i, i2, true);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final zuy0 m220284p(int i, boolean z) {
        if (this.f204924z.get(i) == z) {
            return this;
        }
        SparseBooleanArray sparseBooleanArray = this.f204924z;
        if (z) {
            sparseBooleanArray.put(i, true);
            return this;
        }
        sparseBooleanArray.delete(i);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final void m220285x() {
        this.f204916r = true;
        this.f204917s = true;
        this.f204918t = true;
        this.f204919u = true;
        this.f204920v = true;
        this.f204921w = true;
        this.f204922x = true;
    }

    public zuy0(Context context) {
        super.m124187e(context);
        Point pointM126053J = ggw0.m126053J(context);
        mo124188f(pointM126053J.x, pointM126053J.y, true);
        this.f204923y = new SparseArray();
        this.f204924z = new SparseBooleanArray();
        m220285x();
    }

    @Deprecated
    public zuy0() {
        this.f204923y = new SparseArray();
        this.f204924z = new SparseBooleanArray();
        m220285x();
    }
}
