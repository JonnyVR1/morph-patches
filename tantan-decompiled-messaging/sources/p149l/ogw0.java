package p149l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ogw0 extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final Collection f143926a;

    /* JADX INFO: renamed from: b */
    public final ofw0 f143927b;

    public ogw0(Collection collection, ofw0 ofw0Var) {
        this.f143926a = collection;
        this.f143927b = ofw0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        nfw0.m159283e(this.f143927b.zza(obj));
        return this.f143926a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            nfw0.m159283e(this.f143927b.zza(it.next()));
        }
        return this.f143926a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        niw0.m159576b(this.f143926a, this.f143927b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (pgw0.m168924a(this.f143926a, obj)) {
            return this.f143927b.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        ofw0 ofw0Var = this.f143927b;
        Iterator it = this.f143926a.iterator();
        nfw0.m159281c(ofw0Var, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (ofw0Var.zza(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f143926a.iterator();
        it.getClass();
        ofw0 ofw0Var = this.f143927b;
        ofw0Var.getClass();
        return new oiw0(it, ofw0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f143926a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f143926a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f143927b.zza(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f143926a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f143927b.zza(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f143926a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f143927b.zza(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        qiw0.m174922c(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        qiw0.m174922c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
