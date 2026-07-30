package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.collect.b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2986b<E> extends AbstractCollection<E> implements InterfaceC2995k<E> {
    private transient Set<E> elementSet;
    private transient Set<InterfaceC2995k.a<E>> entrySet;

    /* JADX INFO: renamed from: com.google.common.collect.b$a */
    public class a extends Multisets.AbstractC2921c<E> {
        public a() {
        }

        @Override // com.google.common.collect.Multisets.AbstractC2921c
        /* JADX INFO: renamed from: a */
        public InterfaceC2995k<E> mo16161a() {
            return AbstractC2986b.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return AbstractC2986b.this.elementIterator();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.b$b */
    public class b extends Multisets.AbstractC2922d<E> {
        public b() {
        }

        @Override // com.google.common.collect.Multisets.AbstractC2922d
        /* JADX INFO: renamed from: a */
        public InterfaceC2995k<E> mo15687a() {
            return AbstractC2986b.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<InterfaceC2995k.a<E>> iterator() {
            return AbstractC2986b.this.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC2986b.this.distinctElements();
        }
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.m16146c(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2995k
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    public Set<E> createElementSet() {
        return new a();
    }

    public Set<InterfaceC2995k.a<E>> createEntrySet() {
        return new b();
    }

    public abstract int distinctElements();

    public abstract Iterator<E> elementIterator();

    public Set<E> elementSet() {
        Set<E> set = this.elementSet;
        if (set != null) {
            return set;
        }
        Set<E> setCreateElementSet = createElementSet();
        this.elementSet = setCreateElementSet;
        return setCreateElementSet;
    }

    public abstract Iterator<InterfaceC2995k.a<E>> entryIterator();

    public Set<InterfaceC2995k.a<E>> entrySet() {
        Set<InterfaceC2995k.a<E>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set<InterfaceC2995k.a<E>> setCreateEntrySet = createEntrySet();
        this.entrySet = setCreateEntrySet;
        return setCreateEntrySet;
    }

    @Override // java.util.Collection, com.google.common.collect.InterfaceC2995k
    public final boolean equals(Object obj) {
        return Multisets.m16149f(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.InterfaceC2995k
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2995k
    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return Multisets.m16154k(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return Multisets.m16155l(this, collection);
    }

    public int setCount(E e, int i) {
        return Multisets.m16156m(this, e, i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    public boolean setCount(E e, int i, int i2) {
        return Multisets.m16157n(this, e, i, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }
}
