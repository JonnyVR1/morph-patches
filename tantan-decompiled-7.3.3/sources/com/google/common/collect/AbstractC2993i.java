package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p153l.k950;
import p153l.l2j;

/* JADX INFO: renamed from: com.google.common.collect.i */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2993i<E> extends l2j<E> implements InterfaceC2995k<E> {
    public int add(E e, int i) {
        return delegate().add(e, i);
    }

    @Override // com.google.common.collect.InterfaceC2995k
    public int count(Object obj) {
        return delegate().count(obj);
    }

    @Override // p153l.l2j, p153l.v2j
    public abstract InterfaceC2995k<E> delegate();

    public Set<E> elementSet() {
        return delegate().elementSet();
    }

    public Set<InterfaceC2995k.a<E>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.InterfaceC2995k
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.InterfaceC2995k
    public int hashCode() {
        return delegate().hashCode();
    }

    public int remove(Object obj, int i) {
        return delegate().remove(obj, i);
    }

    public int setCount(E e, int i) {
        return delegate().setCount(e, i);
    }

    public boolean standardAdd(E e) {
        add(e, 1);
        return true;
    }

    @Override // p153l.l2j
    public boolean standardAddAll(Collection<? extends E> collection) {
        return Multisets.m16146c(this, collection);
    }

    @Override // p153l.l2j
    public void standardClear() {
        Iterators.m15929e(entrySet().iterator());
    }

    @Override // p153l.l2j
    public boolean standardContains(Object obj) {
        return count(obj) > 0;
    }

    public int standardCount(Object obj) {
        for (InterfaceC2995k.a<E> aVar : entrySet()) {
            if (k950.m148863a(aVar.getElement(), obj)) {
                return aVar.getCount();
            }
        }
        return 0;
    }

    public boolean standardEquals(Object obj) {
        return Multisets.m16149f(this, obj);
    }

    public int standardHashCode() {
        return entrySet().hashCode();
    }

    public Iterator<E> standardIterator() {
        return Multisets.m16152i(this);
    }

    @Override // p153l.l2j
    public boolean standardRemove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // p153l.l2j
    public boolean standardRemoveAll(Collection<?> collection) {
        return Multisets.m16154k(this, collection);
    }

    @Override // p153l.l2j
    public boolean standardRetainAll(Collection<?> collection) {
        return Multisets.m16155l(this, collection);
    }

    public int standardSetCount(E e, int i) {
        return Multisets.m16156m(this, e, i);
    }

    public int standardSize() {
        return Multisets.m16153j(this);
    }

    @Override // p153l.l2j
    public String standardToString() {
        return entrySet().toString();
    }

    public boolean standardSetCount(E e, int i, int i2) {
        return Multisets.m16157n(this, e, i, i2);
    }

    public boolean setCount(E e, int i, int i2) {
        return delegate().setCount(e, i, i2);
    }
}
