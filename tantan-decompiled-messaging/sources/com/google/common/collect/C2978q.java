package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import p149l.lmr;

/* JADX INFO: renamed from: com.google.common.collect.q */
/* JADX INFO: loaded from: classes7.dex */
public final class C2978q {

    /* JADX INFO: renamed from: com.google.common.collect.q$a */
    public static class a<E> extends Multisets.AbstractC2898c<E> implements SortedSet<E> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2977p<E> f11220a;

        public a(InterfaceC2977p<E> interfaceC2977p) {
            this.f11220a = interfaceC2977p;
        }

        @Override // com.google.common.collect.Multisets.AbstractC2898c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2977p<E> mo16107a() {
            return this.f11220a;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return mo16107a().comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) C2978q.m16320d(mo16107a().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e) {
            return mo16107a().headMultiset(e, BoundType.OPEN).elementSet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Multisets.m16094e(mo16107a().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public E last() {
            return (E) C2978q.m16320d(mo16107a().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
            return mo16107a().subMultiset(e, BoundType.CLOSED, e2, BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
            return mo16107a().tailMultiset(e, BoundType.CLOSED).elementSet();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.q$b */
    public static class b<E> extends a<E> implements NavigableSet<E> {
        public b(InterfaceC2977p<E> interfaceC2977p) {
            super(interfaceC2977p);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
            return (E) C2978q.m16319c(mo16107a().tailMultiset(e, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new b(mo16107a().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        public E floor(E e) {
            return (E) C2978q.m16319c(mo16107a().headMultiset(e, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            return new b(mo16107a().headMultiset(e, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableSet
        public E higher(E e) {
            return (E) C2978q.m16319c(mo16107a().tailMultiset(e, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public E lower(E e) {
            return (E) C2978q.m16319c(mo16107a().headMultiset(e, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) C2978q.m16319c(mo16107a().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) C2978q.m16319c(mo16107a().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return new b(mo16107a().subMultiset(e, BoundType.forBoolean(z), e2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            return new b(mo16107a().tailMultiset(e, BoundType.forBoolean(z)));
        }
    }

    /* JADX INFO: renamed from: c */
    public static <E> E m16319c(InterfaceC2972k.a<E> aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.getElement();
    }

    /* JADX INFO: renamed from: d */
    public static <E> E m16320d(InterfaceC2972k.a<E> aVar) {
        if (aVar != null) {
            return aVar.getElement();
        }
        lmr.m150601a();
        return null;
    }
}
