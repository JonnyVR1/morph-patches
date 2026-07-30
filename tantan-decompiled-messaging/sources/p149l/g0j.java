package p149l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g0j<E> extends e0j<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // p149l.e0j, p149l.qzi, p149l.a0j
    public abstract SortedSet<E> delegate();

    @Override // java.util.SortedSet
    public E first() {
        return delegate().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e) {
        return delegate().headSet(e);
    }

    @Override // java.util.SortedSet
    public E last() {
        return delegate().last();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.qzi
    public boolean standardContains(Object obj) {
        try {
            return f0j.unsafeCompare(comparator(), tailSet(obj).first(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.qzi
    public boolean standardRemove(Object obj) {
        try {
            Iterator<E> it = tailSet(obj).iterator();
            if (it.hasNext()) {
                if (f0j.unsafeCompare(comparator(), it.next(), obj) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public SortedSet<E> standardSubSet(E e, E e2) {
        return tailSet(e).headSet(e2);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e, E e2) {
        return delegate().subSet(e, e2);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e) {
        return delegate().tailSet(e);
    }
}
