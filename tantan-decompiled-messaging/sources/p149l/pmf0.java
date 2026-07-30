package p149l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class pmf0<V> {

    /* JADX INFO: renamed from: a */
    public int f150217a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<V> f150218b;

    /* JADX INFO: renamed from: c */
    public final vz5<V> f150219c;

    public pmf0(vz5<V> vz5Var) {
        this.f150218b = new SparseArray<>();
        this.f150219c = vz5Var;
        this.f150217a = -1;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m170323a(Object obj) {
    }

    /* JADX INFO: renamed from: b */
    public void m170324b(int i, V v2) {
        if (this.f150217a == -1) {
            p11.m167013g(this.f150218b.size() == 0);
            this.f150217a = 0;
        }
        if (this.f150218b.size() > 0) {
            SparseArray<V> sparseArray = this.f150218b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            p11.m167007a(i >= iKeyAt);
            if (iKeyAt == i) {
                vz5<V> vz5Var = this.f150219c;
                SparseArray<V> sparseArray2 = this.f150218b;
                vz5Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f150218b.append(i, v2);
    }

    /* JADX INFO: renamed from: c */
    public void m170325c() {
        for (int i = 0; i < this.f150218b.size(); i++) {
            this.f150219c.accept(this.f150218b.valueAt(i));
        }
        this.f150217a = -1;
        this.f150218b.clear();
    }

    /* JADX INFO: renamed from: d */
    public void m170326d(int i) {
        for (int size = this.f150218b.size() - 1; size >= 0 && i < this.f150218b.keyAt(size); size--) {
            this.f150219c.accept(this.f150218b.valueAt(size));
            this.f150218b.removeAt(size);
        }
        this.f150217a = this.f150218b.size() > 0 ? Math.min(this.f150217a, this.f150218b.size() - 1) : -1;
    }

    /* JADX INFO: renamed from: e */
    public void m170327e(int i) {
        int i2 = 0;
        while (i2 < this.f150218b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.f150218b.keyAt(i3)) {
                return;
            }
            this.f150219c.accept(this.f150218b.valueAt(i2));
            this.f150218b.removeAt(i2);
            int i4 = this.f150217a;
            if (i4 > 0) {
                this.f150217a = i4 - 1;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: f */
    public V m170328f(int i) {
        if (this.f150217a == -1) {
            this.f150217a = 0;
        }
        while (true) {
            int i2 = this.f150217a;
            if (i2 <= 0 || i >= this.f150218b.keyAt(i2)) {
                break;
            }
            this.f150217a--;
        }
        while (this.f150217a < this.f150218b.size() - 1 && i >= this.f150218b.keyAt(this.f150217a + 1)) {
            this.f150217a++;
        }
        return this.f150218b.valueAt(this.f150217a);
    }

    /* JADX INFO: renamed from: g */
    public V m170329g() {
        SparseArray<V> sparseArray = this.f150218b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* JADX INFO: renamed from: h */
    public boolean m170330h() {
        return this.f150218b.size() == 0;
    }

    public pmf0() {
        this(new vz5() { // from class: l.omf0
            @Override // p149l.vz5
            public final void accept(Object obj) {
                pmf0.m170323a(obj);
            }
        });
    }
}
