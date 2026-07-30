package p153l;

import android.util.SparseArray;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class hvf0<E> extends AbstractList<E> {

    /* JADX INFO: renamed from: a */
    public final List<E> f111756a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<E> f111757b;

    public hvf0(List<E> list, SparseArray<E> sparseArray) {
        this.f111756a = list;
        this.f111757b = sparseArray;
    }

    /* JADX INFO: renamed from: a */
    public final int m137323a(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f111757b.size(); i3++) {
            if (i > this.f111757b.keyAt(i3)) {
                i2++;
            }
        }
        return i - i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        int iIndexOfKey = this.f111757b.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return this.f111757b.valueAt(iIndexOfKey);
        }
        return this.f111756a.get(m137323a(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        int size = this.f111756a.size();
        int size2 = this.f111757b.size();
        for (int i = 0; i < size2; i++) {
            if (this.f111757b.keyAt(i) <= size) {
                size++;
            }
        }
        return size;
    }
}
