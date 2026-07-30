package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.collect.h */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2992h<E> extends AbstractC2993i<E> implements InterfaceC3000p<E> {

    /* JADX INFO: renamed from: a */
    public transient Comparator<? super E> f11239a;

    /* JADX INFO: renamed from: b */
    public transient NavigableSet<E> f11240b;

    /* JADX INFO: renamed from: c */
    public transient Set<InterfaceC2995k.a<E>> f11241c;

    /* JADX INFO: renamed from: com.google.common.collect.h$a */
    public class a extends Multisets.AbstractC2922d<E> {
        public a() {
        }

        @Override // com.google.common.collect.Multisets.AbstractC2922d
        /* JADX INFO: renamed from: a */
        public InterfaceC2995k<E> mo15687a() {
            return AbstractC2992h.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<InterfaceC2995k.a<E>> iterator() {
            return AbstractC2992h.this.mo16307c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC2992h.this.mo16308f().entrySet().size();
        }
    }

    /* JADX INFO: renamed from: a */
    public Set<InterfaceC2995k.a<E>> m16317a() {
        return new a();
    }

    /* JADX INFO: renamed from: c */
    public abstract Iterator<InterfaceC2995k.a<E>> mo16307c();

    @Override // com.google.common.collect.InterfaceC3000p, p153l.auf0
    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f11239a;
        if (comparator != null) {
            return comparator;
        }
        Ordering orderingReverse = Ordering.from(mo16308f().comparator()).reverse();
        this.f11239a = orderingReverse;
        return orderingReverse;
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC3000p<E> descendingMultiset() {
        return mo16308f();
    }

    @Override // com.google.common.collect.AbstractC2993i, com.google.common.collect.InterfaceC2995k
    public NavigableSet<E> elementSet() {
        NavigableSet<E> navigableSet = this.f11240b;
        if (navigableSet != null) {
            return navigableSet;
        }
        C3001q.b bVar = new C3001q.b(this);
        this.f11240b = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.AbstractC2993i, com.google.common.collect.InterfaceC2995k
    public Set<InterfaceC2995k.a<E>> entrySet() {
        Set<InterfaceC2995k.a<E>> set = this.f11241c;
        if (set != null) {
            return set;
        }
        Set<InterfaceC2995k.a<E>> setM16317a = m16317a();
        this.f11241c = setM16317a;
        return setM16317a;
    }

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC3000p<E> mo16308f();

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC2995k.a<E> firstEntry() {
        return mo16308f().lastEntry();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC3000p<E> headMultiset(E e, BoundType boundType) {
        return mo16308f().tailMultiset(e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC2995k.a<E> lastEntry() {
        return mo16308f().firstEntry();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC2995k.a<E> pollFirstEntry() {
        return mo16308f().pollLastEntry();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC2995k.a<E> pollLastEntry() {
        return mo16308f().pollFirstEntry();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC3000p<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        return mo16308f().subMultiset(e2, boundType2, e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC3000p<E> tailMultiset(E e, BoundType boundType) {
        return mo16308f().headMultiset(e, boundType).descendingMultiset();
    }

    @Override // p153l.l2j, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return standardToArray();
    }

    @Override // p153l.v2j
    public String toString() {
        return entrySet().toString();
    }

    @Override // p153l.l2j, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) standardToArray(tArr);
    }

    @Override // com.google.common.collect.AbstractC2993i, p153l.l2j, p153l.v2j
    public InterfaceC2995k<E> delegate() {
        return mo16308f();
    }
}
