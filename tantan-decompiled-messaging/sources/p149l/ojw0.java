package p149l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes6.dex */
public final class ojw0 extends njw0 implements SortedSet {
    public ojw0(SortedSet sortedSet, ofw0 ofw0Var) {
        super(sortedSet, ofw0Var);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f143926a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f143926a.iterator();
        it.getClass();
        ofw0 ofw0Var = this.f143927b;
        ofw0Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (ofw0Var.zza(next)) {
                return next;
            }
        }
        lmr.m150601a();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new ojw0(((SortedSet) this.f143926a).headSet(obj), this.f143927b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f143926a;
        while (true) {
            ofw0 ofw0Var = this.f143927b;
            Object objLast = sortedSetHeadSet.last();
            if (ofw0Var.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new ojw0(((SortedSet) this.f143926a).subSet(obj, obj2), this.f143927b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new ojw0(((SortedSet) this.f143926a).tailSet(obj), this.f143927b);
    }
}
