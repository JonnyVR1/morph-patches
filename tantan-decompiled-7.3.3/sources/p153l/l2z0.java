package p153l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
public final class l2z0 {

    /* JADX INFO: renamed from: a */
    public int f129823a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f129824b;

    /* JADX INFO: renamed from: c */
    public final hkv0 f129825c;

    public l2z0(hkv0 hkv0Var) {
        this.f129824b = new SparseArray();
        this.f129825c = hkv0Var;
        this.f129823a = -1;
    }

    /* JADX INFO: renamed from: a */
    public final Object m152651a(int i) {
        if (this.f129823a == -1) {
            this.f129823a = 0;
        }
        while (true) {
            int i2 = this.f129823a;
            if (i2 <= 0 || i >= this.f129824b.keyAt(i2)) {
                break;
            }
            this.f129823a--;
        }
        while (this.f129823a < this.f129824b.size() - 1 && i >= this.f129824b.keyAt(this.f129823a + 1)) {
            this.f129823a++;
        }
        return this.f129824b.valueAt(this.f129823a);
    }

    /* JADX INFO: renamed from: b */
    public final Object m152652b() {
        return this.f129824b.valueAt(this.f129824b.size() - 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m152653c(int i, Object obj) {
        if (this.f129823a == -1) {
            lev0.m153958f(this.f129824b.size() == 0);
            this.f129823a = 0;
        }
        if (this.f129824b.size() > 0) {
            SparseArray sparseArray = this.f129824b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            lev0.m153956d(i >= iKeyAt);
            if (iKeyAt == i) {
                SparseArray sparseArray2 = this.f129824b;
                e2z0.m119202D((c2z0) sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f129824b.append(i, obj);
    }

    /* JADX INFO: renamed from: d */
    public final void m152654d() {
        for (int i = 0; i < this.f129824b.size(); i++) {
            e2z0.m119202D((c2z0) this.f129824b.valueAt(i));
        }
        this.f129823a = -1;
        this.f129824b.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m152655e(int i) {
        int i2 = 0;
        while (i2 < this.f129824b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.f129824b.keyAt(i3)) {
                return;
            }
            e2z0.m119202D((c2z0) this.f129824b.valueAt(i2));
            this.f129824b.removeAt(i2);
            int i4 = this.f129823a;
            if (i4 > 0) {
                this.f129823a = i4 - 1;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m152656f() {
        return this.f129824b.size() == 0;
    }

    public l2z0() {
        k2z0 k2z0Var = new hkv0() { // from class: l.k2z0
            @Override // p153l.hkv0
            public final void zza(Object obj) {
            }
        };
        throw null;
    }
}
