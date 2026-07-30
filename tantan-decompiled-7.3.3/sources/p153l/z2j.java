package p153l;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class z2j<E> extends l2j<E> implements Set<E> {
    @Override // p153l.l2j, p153l.v2j
    public abstract Set<E> delegate();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean standardEquals(Object obj) {
        return Sets.m16170a(this, obj);
    }

    public int standardHashCode() {
        return Sets.m16173d(this);
    }

    @Override // p153l.l2j
    public boolean standardRemoveAll(Collection<?> collection) {
        return Sets.m16179j(this, (Collection) xn80.m212111p(collection));
    }
}
