package p149l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class fel<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: a */
    public final List<T> f97138a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<T> f97139b;

    /* JADX INFO: renamed from: c */
    public int f97140c;

    public fel(List<T> list, int i) {
        this.f97139b = list;
        int iMin = Math.min(i, list.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            this.f97138a.add(list.get(i2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m121041a(int i) {
        if (i >= this.f97138a.size()) {
            int iMin = Math.min((i + 50) - this.f97140c, this.f97139b.size());
            for (int size = this.f97138a.size() - this.f97140c; size < iMin; size++) {
                this.f97138a.add(this.f97139b.get(size));
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        m121041a(i);
        this.f97138a.add(i, t);
        this.f97140c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        m121041a(i);
        return this.f97138a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        boolean zRemove = this.f97138a.remove(obj);
        if (zRemove) {
            this.f97140c--;
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f97139b.size() + this.f97140c;
    }
}
