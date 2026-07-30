package p149l;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class mjw0 extends rjw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Set f134259a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f134260b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjw0(Set set, Set set2) {
        super(null);
        this.f134259a = set;
        this.f134260b = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f134259a.contains(obj) && this.f134260b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f134259a.containsAll(collection) && this.f134260b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f134260b, this.f134259a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new ljw0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f134259a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f134260b.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
