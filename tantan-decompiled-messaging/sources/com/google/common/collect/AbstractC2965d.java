package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import p149l.sf80;

/* JADX INFO: renamed from: com.google.common.collect.d */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2965d<E> extends AbstractC2963b<E> implements InterfaceC2977p<E> {
    final Comparator<? super E> comparator;
    private transient InterfaceC2977p<E> descendingMultiset;

    /* JADX INFO: renamed from: com.google.common.collect.d$a */
    public class a extends AbstractC2969h<E> {
        public a() {
        }

        @Override // com.google.common.collect.AbstractC2969h
        /* JADX INFO: renamed from: c */
        public Iterator<InterfaceC2972k.a<E>> mo16253c() {
            return AbstractC2965d.this.descendingEntryIterator();
        }

        @Override // com.google.common.collect.AbstractC2969h
        /* JADX INFO: renamed from: f */
        public InterfaceC2977p<E> mo16254f() {
            return AbstractC2965d.this;
        }

        @Override // p149l.qzi, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return AbstractC2965d.this.descendingIterator();
        }
    }

    public AbstractC2965d(Comparator<? super E> comparator) {
        this.comparator = (Comparator) sf80.m183894p(comparator);
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public InterfaceC2977p<E> createDescendingMultiset() {
        return new a();
    }

    @Override // com.google.common.collect.AbstractC2963b
    public NavigableSet<E> createElementSet() {
        return new C2978q.b(this);
    }

    public abstract Iterator<InterfaceC2972k.a<E>> descendingEntryIterator();

    public Iterator<E> descendingIterator() {
        return Multisets.m16098i(descendingMultiset());
    }

    public InterfaceC2977p<E> descendingMultiset() {
        InterfaceC2977p<E> interfaceC2977p = this.descendingMultiset;
        if (interfaceC2977p != null) {
            return interfaceC2977p;
        }
        InterfaceC2977p<E> interfaceC2977pCreateDescendingMultiset = createDescendingMultiset();
        this.descendingMultiset = interfaceC2977pCreateDescendingMultiset;
        return interfaceC2977pCreateDescendingMultiset;
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }

    public InterfaceC2972k.a<E> firstEntry() {
        Iterator<InterfaceC2972k.a<E>> itEntryIterator = entryIterator();
        if (itEntryIterator.hasNext()) {
            return itEntryIterator.next();
        }
        return null;
    }

    public InterfaceC2972k.a<E> lastEntry() {
        Iterator<InterfaceC2972k.a<E>> itDescendingEntryIterator = descendingEntryIterator();
        if (itDescendingEntryIterator.hasNext()) {
            return itDescendingEntryIterator.next();
        }
        return null;
    }

    public InterfaceC2972k.a<E> pollFirstEntry() {
        Iterator<InterfaceC2972k.a<E>> itEntryIterator = entryIterator();
        if (!itEntryIterator.hasNext()) {
            return null;
        }
        InterfaceC2972k.a<E> next = itEntryIterator.next();
        InterfaceC2972k.a<E> aVarM16096g = Multisets.m16096g(next.getElement(), next.getCount());
        itEntryIterator.remove();
        return aVarM16096g;
    }

    public InterfaceC2972k.a<E> pollLastEntry() {
        Iterator<InterfaceC2972k.a<E>> itDescendingEntryIterator = descendingEntryIterator();
        if (!itDescendingEntryIterator.hasNext()) {
            return null;
        }
        InterfaceC2972k.a<E> next = itDescendingEntryIterator.next();
        InterfaceC2972k.a<E> aVarM16096g = Multisets.m16096g(next.getElement(), next.getCount());
        itDescendingEntryIterator.remove();
        return aVarM16096g;
    }

    public InterfaceC2977p<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        sf80.m183894p(boundType);
        sf80.m183894p(boundType2);
        return tailMultiset(e, boundType).headMultiset(e2, boundType2);
    }

    public AbstractC2965d() {
        this(Ordering.natural());
    }
}
