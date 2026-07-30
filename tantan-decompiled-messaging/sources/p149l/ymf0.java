package p149l;

import android.util.SparseArray;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ymf0<E> extends AbstractList<E> {

    /* JADX INFO: renamed from: a */
    public final List<E> f198997a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<E> f198998b;

    public ymf0(List<E> list, SparseArray<E> sparseArray) {
        this.f198997a = list;
        this.f198998b = sparseArray;
    }

    /* JADX INFO: renamed from: a */
    public final int m215351a(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f198998b.size(); i3++) {
            if (i > this.f198998b.keyAt(i3)) {
                i2++;
            }
        }
        return i - i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        int iIndexOfKey = this.f198998b.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return this.f198998b.valueAt(iIndexOfKey);
        }
        return this.f198997a.get(m215351a(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        int size = this.f198997a.size();
        int size2 = this.f198998b.size();
        for (int i = 0; i < size2; i++) {
            if (this.f198998b.keyAt(i) <= size) {
                size++;
            }
        }
        return size;
    }
}
