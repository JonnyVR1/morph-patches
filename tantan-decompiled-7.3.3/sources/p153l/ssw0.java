package p153l;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ssw0 extends xsw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Set f170525a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f170526b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssw0(Set set, Set set2) {
        super(null);
        this.f170525a = set;
        this.f170526b = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f170525a.contains(obj) && this.f170526b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f170525a.containsAll(collection) && this.f170526b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f170526b, this.f170525a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new rsw0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f170525a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f170526b.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
