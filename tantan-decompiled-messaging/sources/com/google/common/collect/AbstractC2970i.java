package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p149l.qzi;
import p149l.v050;

/* JADX INFO: renamed from: com.google.common.collect.i */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2970i<E> extends qzi<E> implements InterfaceC2972k<E> {
    public int add(E e, int i) {
        return delegate().add(e, i);
    }

    @Override // com.google.common.collect.InterfaceC2972k
    public int count(Object obj) {
        return delegate().count(obj);
    }

    @Override // p149l.qzi, p149l.a0j
    public abstract InterfaceC2972k<E> delegate();

    public Set<E> elementSet() {
        return delegate().elementSet();
    }

    public Set<InterfaceC2972k.a<E>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.InterfaceC2972k
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.InterfaceC2972k
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

    @Override // p149l.qzi
    public boolean standardAddAll(Collection<? extends E> collection) {
        return Multisets.m16092c(this, collection);
    }

    @Override // p149l.qzi
    public void standardClear() {
        Iterators.m15875e(entrySet().iterator());
    }

    @Override // p149l.qzi
    public boolean standardContains(Object obj) {
        return count(obj) > 0;
    }

    public int standardCount(Object obj) {
        for (InterfaceC2972k.a<E> aVar : entrySet()) {
            if (v050.m196470a(aVar.getElement(), obj)) {
                return aVar.getCount();
            }
        }
        return 0;
    }

    public boolean standardEquals(Object obj) {
        return Multisets.m16095f(this, obj);
    }

    public int standardHashCode() {
        return entrySet().hashCode();
    }

    public Iterator<E> standardIterator() {
        return Multisets.m16098i(this);
    }

    @Override // p149l.qzi
    public boolean standardRemove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // p149l.qzi
    public boolean standardRemoveAll(Collection<?> collection) {
        return Multisets.m16100k(this, collection);
    }

    @Override // p149l.qzi
    public boolean standardRetainAll(Collection<?> collection) {
        return Multisets.m16101l(this, collection);
    }

    public int standardSetCount(E e, int i) {
        return Multisets.m16102m(this, e, i);
    }

    public int standardSize() {
        return Multisets.m16099j(this);
    }

    @Override // p149l.qzi
    public String standardToString() {
        return entrySet().toString();
    }

    public boolean standardSetCount(E e, int i, int i2) {
        return Multisets.m16103n(this, e, i, i2);
    }

    public boolean setCount(E e, int i, int i2) {
        return delegate().setCount(e, i, i2);
    }
}
