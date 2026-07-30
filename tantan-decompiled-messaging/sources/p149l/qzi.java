package p149l;

import com.google.common.collect.C2968g;
import com.google.common.collect.Iterators;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qzi<E> extends a0j implements Collection<E> {
    public boolean add(E e) {
        return delegate().add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    public void clear() {
        delegate().clear();
    }

    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    @Override // p149l.a0j
    public abstract Collection<E> delegate();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Iterator<E> iterator() {
        return delegate().iterator();
    }

    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return delegate().size();
    }

    public boolean standardAddAll(Collection<? extends E> collection) {
        return Iterators.m15871a(this, collection.iterator());
    }

    public void standardClear() {
        Iterators.m15875e(iterator());
    }

    public boolean standardContains(Object obj) {
        return Iterators.m15877g(iterator(), obj);
    }

    public boolean standardContainsAll(Collection<?> collection) {
        return C2968g.m16258a(this, collection);
    }

    public boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    public boolean standardRemove(Object obj) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (v050.m196470a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean standardRemoveAll(Collection<?> collection) {
        return Iterators.m15892v(iterator(), collection);
    }

    public boolean standardRetainAll(Collection<?> collection) {
        return Iterators.m15894x(iterator(), collection);
    }

    public Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    public String standardToString() {
        return C2968g.m16262e(this);
    }

    public Object[] toArray() {
        return delegate().toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return (T[]) delegate().toArray(tArr);
    }

    public <T> T[] standardToArray(T[] tArr) {
        return (T[]) j050.m139135g(this, tArr);
    }
}
