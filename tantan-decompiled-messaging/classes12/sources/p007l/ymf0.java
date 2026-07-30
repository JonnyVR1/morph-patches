package p007l;

import android.util.SparseArray;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ymf0<E> extends AbstractList<E> {

    /* JADX INFO: renamed from: a */
    public final List<E> f15474a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<E> f15475b;

    public ymf0(List<E> list, SparseArray<E> sparseArray) {
        this.f15474a = list;
        this.f15475b = sparseArray;
    }

    /* JADX INFO: renamed from: a */
    public final int m17179a(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f15475b.size(); i3++) {
            if (i > this.f15475b.keyAt(i3)) {
                i2++;
            }
        }
        return i - i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        int iIndexOfKey = this.f15475b.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return this.f15475b.valueAt(iIndexOfKey);
        }
        return this.f15474a.get(m17179a(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        int size = this.f15474a.size();
        int size2 = this.f15475b.size();
        for (int i = 0; i < size2; i++) {
            if (this.f15475b.keyAt(i) <= size) {
                size++;
            }
        }
        return size;
    }
}
