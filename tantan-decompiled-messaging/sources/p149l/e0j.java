package p149l;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e0j<E> extends qzi<E> implements Set<E> {
    @Override // p149l.qzi, p149l.a0j
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
        return Sets.m16116a(this, obj);
    }

    public int standardHashCode() {
        return Sets.m16119d(this);
    }

    @Override // p149l.qzi
    public boolean standardRemoveAll(Collection<?> collection) {
        return Sets.m16125j(this, (Collection) sf80.m183894p(collection));
    }
}
