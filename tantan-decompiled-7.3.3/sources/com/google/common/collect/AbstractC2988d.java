package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import p153l.xn80;

/* JADX INFO: renamed from: com.google.common.collect.d */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2988d<E> extends AbstractC2986b<E> implements InterfaceC3000p<E> {
    final Comparator<? super E> comparator;
    private transient InterfaceC3000p<E> descendingMultiset;

    /* JADX INFO: renamed from: com.google.common.collect.d$a */
    public class a extends AbstractC2992h<E> {
        public a() {
        }

        @Override // com.google.common.collect.AbstractC2992h
        /* JADX INFO: renamed from: c */
        public Iterator<InterfaceC2995k.a<E>> mo16307c() {
            return AbstractC2988d.this.descendingEntryIterator();
        }

        @Override // com.google.common.collect.AbstractC2992h
        /* JADX INFO: renamed from: f */
        public InterfaceC3000p<E> mo16308f() {
            return AbstractC2988d.this;
        }

        @Override // p153l.l2j, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return AbstractC2988d.this.descendingIterator();
        }
    }

    public AbstractC2988d(Comparator<? super E> comparator) {
        this.comparator = (Comparator) xn80.m212111p(comparator);
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public InterfaceC3000p<E> createDescendingMultiset() {
        return new a();
    }

    @Override // com.google.common.collect.AbstractC2986b
    public NavigableSet<E> createElementSet() {
        return new C3001q.b(this);
    }

    public abstract Iterator<InterfaceC2995k.a<E>> descendingEntryIterator();

    public Iterator<E> descendingIterator() {
        return Multisets.m16152i(descendingMultiset());
    }

    public InterfaceC3000p<E> descendingMultiset() {
        InterfaceC3000p<E> interfaceC3000p = this.descendingMultiset;
        if (interfaceC3000p != null) {
            return interfaceC3000p;
        }
        InterfaceC3000p<E> interfaceC3000pCreateDescendingMultiset = createDescendingMultiset();
        this.descendingMultiset = interfaceC3000pCreateDescendingMultiset;
        return interfaceC3000pCreateDescendingMultiset;
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }

    public InterfaceC2995k.a<E> firstEntry() {
        Iterator<InterfaceC2995k.a<E>> itEntryIterator = entryIterator();
        if (itEntryIterator.hasNext()) {
            return itEntryIterator.next();
        }
        return null;
    }

    public InterfaceC2995k.a<E> lastEntry() {
        Iterator<InterfaceC2995k.a<E>> itDescendingEntryIterator = descendingEntryIterator();
        if (itDescendingEntryIterator.hasNext()) {
            return itDescendingEntryIterator.next();
        }
        return null;
    }

    public InterfaceC2995k.a<E> pollFirstEntry() {
        Iterator<InterfaceC2995k.a<E>> itEntryIterator = entryIterator();
        if (!itEntryIterator.hasNext()) {
            return null;
        }
        InterfaceC2995k.a<E> next = itEntryIterator.next();
        InterfaceC2995k.a<E> aVarM16150g = Multisets.m16150g(next.getElement(), next.getCount());
        itEntryIterator.remove();
        return aVarM16150g;
    }

    public InterfaceC2995k.a<E> pollLastEntry() {
        Iterator<InterfaceC2995k.a<E>> itDescendingEntryIterator = descendingEntryIterator();
        if (!itDescendingEntryIterator.hasNext()) {
            return null;
        }
        InterfaceC2995k.a<E> next = itDescendingEntryIterator.next();
        InterfaceC2995k.a<E> aVarM16150g = Multisets.m16150g(next.getElement(), next.getCount());
        itDescendingEntryIterator.remove();
        return aVarM16150g;
    }

    public InterfaceC3000p<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        xn80.m212111p(boundType);
        xn80.m212111p(boundType2);
        return tailMultiset(e, boundType).headMultiset(e2, boundType2);
    }

    public AbstractC2988d() {
        this(Ordering.natural());
    }
}
