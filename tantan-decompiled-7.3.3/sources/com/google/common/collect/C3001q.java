package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import p153l.mor;

/* JADX INFO: renamed from: com.google.common.collect.q */
/* JADX INFO: loaded from: classes7.dex */
public final class C3001q {

    /* JADX INFO: renamed from: com.google.common.collect.q$a */
    public static class a<E> extends Multisets.AbstractC2921c<E> implements SortedSet<E> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC3000p<E> f11257a;

        public a(InterfaceC3000p<E> interfaceC3000p) {
            this.f11257a = interfaceC3000p;
        }

        @Override // com.google.common.collect.Multisets.AbstractC2921c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3000p<E> mo16161a() {
            return this.f11257a;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return mo16161a().comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) C3001q.m16374d(mo16161a().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e) {
            return mo16161a().headMultiset(e, BoundType.OPEN).elementSet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Multisets.m16148e(mo16161a().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public E last() {
            return (E) C3001q.m16374d(mo16161a().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
            return mo16161a().subMultiset(e, BoundType.CLOSED, e2, BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
            return mo16161a().tailMultiset(e, BoundType.CLOSED).elementSet();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.q$b */
    public static class b<E> extends a<E> implements NavigableSet<E> {
        public b(InterfaceC3000p<E> interfaceC3000p) {
            super(interfaceC3000p);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
            return (E) C3001q.m16373c(mo16161a().tailMultiset(e, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new b(mo16161a().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        public E floor(E e) {
            return (E) C3001q.m16373c(mo16161a().headMultiset(e, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            return new b(mo16161a().headMultiset(e, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableSet
        public E higher(E e) {
            return (E) C3001q.m16373c(mo16161a().tailMultiset(e, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public E lower(E e) {
            return (E) C3001q.m16373c(mo16161a().headMultiset(e, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) C3001q.m16373c(mo16161a().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) C3001q.m16373c(mo16161a().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return new b(mo16161a().subMultiset(e, BoundType.forBoolean(z), e2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            return new b(mo16161a().tailMultiset(e, BoundType.forBoolean(z)));
        }
    }

    /* JADX INFO: renamed from: c */
    public static <E> E m16373c(InterfaceC2995k.a<E> aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.getElement();
    }

    /* JADX INFO: renamed from: d */
    public static <E> E m16374d(InterfaceC2995k.a<E> aVar) {
        if (aVar != null) {
            return aVar.getElement();
        }
        mor.m159308a();
        return null;
    }
}
