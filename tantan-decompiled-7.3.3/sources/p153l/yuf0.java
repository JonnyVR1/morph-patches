package p153l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class yuf0<V> {

    /* JADX INFO: renamed from: a */
    public int f201615a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<V> f201616b;

    /* JADX INFO: renamed from: c */
    public final a16<V> f201617c;

    public yuf0(a16<V> a16Var) {
        this.f201616b = new SparseArray<>();
        this.f201617c = a16Var;
        this.f201615a = -1;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m217375a(Object obj) {
    }

    /* JADX INFO: renamed from: b */
    public void m217376b(int i, V v2) {
        if (this.f201615a == -1) {
            w11.m204371g(this.f201616b.size() == 0);
            this.f201615a = 0;
        }
        if (this.f201616b.size() > 0) {
            SparseArray<V> sparseArray = this.f201616b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            w11.m204365a(i >= iKeyAt);
            if (iKeyAt == i) {
                a16<V> a16Var = this.f201617c;
                SparseArray<V> sparseArray2 = this.f201616b;
                a16Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f201616b.append(i, v2);
    }

    /* JADX INFO: renamed from: c */
    public void m217377c() {
        for (int i = 0; i < this.f201616b.size(); i++) {
            this.f201617c.accept(this.f201616b.valueAt(i));
        }
        this.f201615a = -1;
        this.f201616b.clear();
    }

    /* JADX INFO: renamed from: d */
    public void m217378d(int i) {
        for (int size = this.f201616b.size() - 1; size >= 0 && i < this.f201616b.keyAt(size); size--) {
            this.f201617c.accept(this.f201616b.valueAt(size));
            this.f201616b.removeAt(size);
        }
        this.f201615a = this.f201616b.size() > 0 ? Math.min(this.f201615a, this.f201616b.size() - 1) : -1;
    }

    /* JADX INFO: renamed from: e */
    public void m217379e(int i) {
        int i2 = 0;
        while (i2 < this.f201616b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.f201616b.keyAt(i3)) {
                return;
            }
            this.f201617c.accept(this.f201616b.valueAt(i2));
            this.f201616b.removeAt(i2);
            int i4 = this.f201615a;
            if (i4 > 0) {
                this.f201615a = i4 - 1;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: f */
    public V m217380f(int i) {
        if (this.f201615a == -1) {
            this.f201615a = 0;
        }
        while (true) {
            int i2 = this.f201615a;
            if (i2 <= 0 || i >= this.f201616b.keyAt(i2)) {
                break;
            }
            this.f201615a--;
        }
        while (this.f201615a < this.f201616b.size() - 1 && i >= this.f201616b.keyAt(this.f201615a + 1)) {
            this.f201615a++;
        }
        return this.f201616b.valueAt(this.f201615a);
    }

    /* JADX INFO: renamed from: g */
    public V m217381g() {
        SparseArray<V> sparseArray = this.f201616b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* JADX INFO: renamed from: h */
    public boolean m217382h() {
        return this.f201616b.size() == 0;
    }

    public yuf0() {
        this(new a16() { // from class: l.xuf0
            @Override // p153l.a16
            public final void accept(Object obj) {
                yuf0.m217375a(obj);
            }
        });
    }
}
