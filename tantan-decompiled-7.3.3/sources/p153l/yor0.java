package p153l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
public final class yor0 implements ser0 {

    /* JADX INFO: renamed from: a */
    public final ser0 f201007a;

    /* JADX INFO: renamed from: b */
    public final vor0 f201008b;

    /* JADX INFO: renamed from: c */
    public final SparseArray f201009c = new SparseArray();

    public yor0(ser0 ser0Var, vor0 vor0Var) {
        this.f201007a = ser0Var;
        this.f201008b = vor0Var;
    }

    @Override // p153l.ser0
    /* JADX INFO: renamed from: c */
    public final void mo101544c() {
        this.f201007a.mo101544c();
    }

    @Override // p153l.ser0
    /* JADX INFO: renamed from: i */
    public final sgr0 mo101550i(int i, int i2) {
        if (i2 != 3) {
            return this.f201007a.mo101550i(i, i2);
        }
        apr0 apr0Var = (apr0) this.f201009c.get(i);
        if (apr0Var != null) {
            return apr0Var;
        }
        apr0 apr0Var2 = new apr0(this.f201007a.mo101550i(i, 3), this.f201008b);
        this.f201009c.put(i, apr0Var2);
        return apr0Var2;
    }

    @Override // p153l.ser0
    /* JADX INFO: renamed from: j */
    public final void mo101551j(bgr0 bgr0Var) {
        this.f201007a.mo101551j(bgr0Var);
    }
}
