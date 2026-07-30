package p153l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes6.dex */
public final class usw0 extends tsw0 implements SortedSet {
    public usw0(SortedSet sortedSet, uow0 uow0Var) {
        super(sortedSet, uow0Var);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f180331a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f180331a.iterator();
        it.getClass();
        uow0 uow0Var = this.f180332b;
        uow0Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (uow0Var.zza(next)) {
                return next;
            }
        }
        mor.m159308a();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new usw0(((SortedSet) this.f180331a).headSet(obj), this.f180332b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f180331a;
        while (true) {
            uow0 uow0Var = this.f180332b;
            Object objLast = sortedSetHeadSet.last();
            if (uow0Var.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new usw0(((SortedSet) this.f180331a).subSet(obj, obj2), this.f180332b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new usw0(((SortedSet) this.f180331a).tailSet(obj), this.f180332b);
    }
}
