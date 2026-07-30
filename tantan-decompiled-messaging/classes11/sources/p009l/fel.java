package p009l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fel<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: a */
    public final List<T> f12967a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<T> f12968b;

    /* JADX INFO: renamed from: c */
    public int f12969c;

    public fel(List<T> list, int i) {
        this.f12968b = list;
        int iMin = Math.min(i, list.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            this.f12967a.add(list.get(i2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14412a(int i) {
        if (i >= this.f12967a.size()) {
            int iMin = Math.min((i + 50) - this.f12969c, this.f12968b.size());
            for (int size = this.f12967a.size() - this.f12969c; size < iMin; size++) {
                this.f12967a.add(this.f12968b.get(size));
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        m14412a(i);
        this.f12967a.add(i, t);
        this.f12969c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        m14412a(i);
        return this.f12967a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        boolean zRemove = this.f12967a.remove(obj);
        if (zRemove) {
            this.f12969c--;
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12968b.size() + this.f12969c;
    }
}
