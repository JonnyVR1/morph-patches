package p149l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
public final class fty0 {

    /* JADX INFO: renamed from: a */
    public int f99293a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f99294b;

    /* JADX INFO: renamed from: c */
    public final bbv0 f99295c;

    public fty0(bbv0 bbv0Var) {
        this.f99294b = new SparseArray();
        this.f99295c = bbv0Var;
        this.f99293a = -1;
    }

    /* JADX INFO: renamed from: a */
    public final Object m123124a(int i) {
        if (this.f99293a == -1) {
            this.f99293a = 0;
        }
        while (true) {
            int i2 = this.f99293a;
            if (i2 <= 0 || i >= this.f99294b.keyAt(i2)) {
                break;
            }
            this.f99293a--;
        }
        while (this.f99293a < this.f99294b.size() - 1 && i >= this.f99294b.keyAt(this.f99293a + 1)) {
            this.f99293a++;
        }
        return this.f99294b.valueAt(this.f99293a);
    }

    /* JADX INFO: renamed from: b */
    public final Object m123125b() {
        return this.f99294b.valueAt(this.f99294b.size() - 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m123126c(int i, Object obj) {
        if (this.f99293a == -1) {
            f5v0.m119535f(this.f99294b.size() == 0);
            this.f99293a = 0;
        }
        if (this.f99294b.size() > 0) {
            SparseArray sparseArray = this.f99294b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            f5v0.m119533d(i >= iKeyAt);
            if (iKeyAt == i) {
                SparseArray sparseArray2 = this.f99294b;
                ysy0.m215957D((wsy0) sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f99294b.append(i, obj);
    }

    /* JADX INFO: renamed from: d */
    public final void m123127d() {
        for (int i = 0; i < this.f99294b.size(); i++) {
            ysy0.m215957D((wsy0) this.f99294b.valueAt(i));
        }
        this.f99293a = -1;
        this.f99294b.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m123128e(int i) {
        int i2 = 0;
        while (i2 < this.f99294b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.f99294b.keyAt(i3)) {
                return;
            }
            ysy0.m215957D((wsy0) this.f99294b.valueAt(i2));
            this.f99294b.removeAt(i2);
            int i4 = this.f99293a;
            if (i4 > 0) {
                this.f99293a = i4 - 1;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m123129f() {
        return this.f99294b.size() == 0;
    }

    public fty0() {
        ety0 ety0Var = new bbv0() { // from class: l.ety0
            @Override // p149l.bbv0
            public final void zza(Object obj) {
            }
        };
        throw null;
    }
}
