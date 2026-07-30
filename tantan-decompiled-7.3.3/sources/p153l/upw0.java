package p153l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class upw0 extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final Collection f180331a;

    /* JADX INFO: renamed from: b */
    public final uow0 f180332b;

    public upw0(Collection collection, uow0 uow0Var) {
        this.f180331a = collection;
        this.f180332b = uow0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        tow0.m192090e(this.f180332b.zza(obj));
        return this.f180331a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            tow0.m192090e(this.f180332b.zza(it.next()));
        }
        return this.f180331a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        trw0.m192528b(this.f180331a, this.f180332b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (vpw0.m202346a(this.f180331a, obj)) {
            return this.f180332b.zza(obj);
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
        uow0 uow0Var = this.f180332b;
        Iterator it = this.f180331a.iterator();
        tow0.m192088c(uow0Var, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (uow0Var.zza(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f180331a.iterator();
        it.getClass();
        uow0 uow0Var = this.f180332b;
        uow0Var.getClass();
        return new urw0(it, uow0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f180331a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f180331a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f180332b.zza(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f180331a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f180332b.zza(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f180331a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f180332b.zza(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        wrw0.m207710c(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        wrw0.m207710c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
