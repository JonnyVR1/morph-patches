package p153l;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class f4z0 extends mbu0 {

    /* JADX INFO: renamed from: r */
    public boolean f97167r;

    /* JADX INFO: renamed from: s */
    public boolean f97168s;

    /* JADX INFO: renamed from: t */
    public boolean f97169t;

    /* JADX INFO: renamed from: u */
    public boolean f97170u;

    /* JADX INFO: renamed from: v */
    public boolean f97171v;

    /* JADX INFO: renamed from: w */
    public boolean f97172w;

    /* JADX INFO: renamed from: x */
    public boolean f97173x;

    /* JADX INFO: renamed from: y */
    public final SparseArray f97174y;

    /* JADX INFO: renamed from: z */
    public final SparseBooleanArray f97175z;

    public /* synthetic */ f4z0(h4z0 h4z0Var, e4z0 e4z0Var) {
        super(h4z0Var);
        this.f97167r = h4z0Var.f107862k0;
        this.f97168s = h4z0Var.f107864m0;
        this.f97169t = h4z0Var.f107866o0;
        this.f97170u = h4z0Var.f107871t0;
        this.f97171v = h4z0Var.f107872u0;
        this.f97172w = h4z0Var.f107873v0;
        this.f97173x = h4z0Var.f107875x0;
        SparseArray sparseArray = h4z0Var.f107876y0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.f97174y = sparseArray2;
        this.f97175z = h4z0Var.f107877z0.clone();
    }

    @Override // p153l.mbu0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mbu0 mo124103f(int i, int i2, boolean z) {
        super.mo124103f(i, i2, true);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final f4z0 m124104p(int i, boolean z) {
        if (this.f97175z.get(i) == z) {
            return this;
        }
        SparseBooleanArray sparseBooleanArray = this.f97175z;
        if (z) {
            sparseBooleanArray.put(i, true);
            return this;
        }
        sparseBooleanArray.delete(i);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final void m124105x() {
        this.f97167r = true;
        this.f97168s = true;
        this.f97169t = true;
        this.f97170u = true;
        this.f97171v = true;
        this.f97172w = true;
        this.f97173x = true;
    }

    public f4z0(Context context) {
        super.m157897e(context);
        Point pointM159397J = mpw0.m159397J(context);
        mo124103f(pointM159397J.x, pointM159397J.y, true);
        this.f97174y = new SparseArray();
        this.f97175z = new SparseBooleanArray();
        m124105x();
    }

    @Deprecated
    public f4z0() {
        this.f97174y = new SparseArray();
        this.f97175z = new SparseBooleanArray();
        m124105x();
    }
}
