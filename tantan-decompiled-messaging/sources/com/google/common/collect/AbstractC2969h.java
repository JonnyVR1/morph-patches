package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.collect.h */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2969h<E> extends AbstractC2970i<E> implements InterfaceC2977p<E> {

    /* JADX INFO: renamed from: a */
    public transient Comparator<? super E> f11202a;

    /* JADX INFO: renamed from: b */
    public transient NavigableSet<E> f11203b;

    /* JADX INFO: renamed from: c */
    public transient Set<InterfaceC2972k.a<E>> f11204c;

    /* JADX INFO: renamed from: com.google.common.collect.h$a */
    public class a extends Multisets.AbstractC2899d<E> {
        public a() {
        }

        @Override // com.google.common.collect.Multisets.AbstractC2899d
        /* JADX INFO: renamed from: a */
        public InterfaceC2972k<E> mo15633a() {
            return AbstractC2969h.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<InterfaceC2972k.a<E>> iterator() {
            return AbstractC2969h.this.mo16253c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC2969h.this.mo16254f().entrySet().size();
        }
    }

    /* JADX INFO: renamed from: a */
    public Set<InterfaceC2972k.a<E>> m16263a() {
        return new a();
    }

    /* JADX INFO: renamed from: c */
    public abstract Iterator<InterfaceC2972k.a<E>> mo16253c();

    @Override // com.google.common.collect.InterfaceC2977p, p149l.rlf0
    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f11202a;
        if (comparator != null) {
            return comparator;
        }
        Ordering orderingReverse = Ordering.from(mo16254f().comparator()).reverse();
        this.f11202a = orderingReverse;
        return orderingReverse;
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2977p<E> descendingMultiset() {
        return mo16254f();
    }

    @Override // com.google.common.collect.AbstractC2970i, com.google.common.collect.InterfaceC2972k
    public NavigableSet<E> elementSet() {
        NavigableSet<E> navigableSet = this.f11203b;
        if (navigableSet != null) {
            return navigableSet;
        }
        C2978q.b bVar = new C2978q.b(this);
        this.f11203b = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.AbstractC2970i, com.google.common.collect.InterfaceC2972k
    public Set<InterfaceC2972k.a<E>> entrySet() {
        Set<InterfaceC2972k.a<E>> set = this.f11204c;
        if (set != null) {
            return set;
        }
        Set<InterfaceC2972k.a<E>> setM16263a = m16263a();
        this.f11204c = setM16263a;
        return setM16263a;
    }

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC2977p<E> mo16254f();

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2972k.a<E> firstEntry() {
        return mo16254f().lastEntry();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2977p<E> headMultiset(E e, BoundType boundType) {
        return mo16254f().tailMultiset(e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2972k.a<E> lastEntry() {
        return mo16254f().firstEntry();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2972k.a<E> pollFirstEntry() {
        return mo16254f().pollLastEntry();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2972k.a<E> pollLastEntry() {
        return mo16254f().pollFirstEntry();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2977p<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        return mo16254f().subMultiset(e2, boundType2, e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2977p<E> tailMultiset(E e, BoundType boundType) {
        return mo16254f().headMultiset(e, boundType).descendingMultiset();
    }

    @Override // p149l.qzi, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return standardToArray();
    }

    @Override // p149l.a0j
    public String toString() {
        return entrySet().toString();
    }

    @Override // p149l.qzi, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) standardToArray(tArr);
    }

    @Override // com.google.common.collect.AbstractC2970i, p149l.qzi, p149l.a0j
    public InterfaceC2972k<E> delegate() {
        return mo16254f();
    }
}
