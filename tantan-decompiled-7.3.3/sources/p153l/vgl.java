package p153l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class vgl<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: a */
    public final List<T> f184041a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<T> f184042b;

    /* JADX INFO: renamed from: c */
    public int f184043c;

    public vgl(List<T> list, int i) {
        this.f184042b = list;
        int iMin = Math.min(i, list.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            this.f184041a.add(list.get(i2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m201235a(int i) {
        if (i >= this.f184041a.size()) {
            int iMin = Math.min((i + 50) - this.f184043c, this.f184042b.size());
            for (int size = this.f184041a.size() - this.f184043c; size < iMin; size++) {
                this.f184041a.add(this.f184042b.get(size));
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        m201235a(i);
        this.f184041a.add(i, t);
        this.f184043c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        m201235a(i);
        return this.f184041a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        boolean zRemove = this.f184041a.remove(obj);
        if (zRemove) {
            this.f184043c--;
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f184042b.size() + this.f184043c;
    }
}
