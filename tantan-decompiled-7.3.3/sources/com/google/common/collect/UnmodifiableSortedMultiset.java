package com.google.common.collect;

import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes7.dex */
final class UnmodifiableSortedMultiset<E> extends Multisets.UnmodifiableMultiset<E> implements InterfaceC3000p<E> {
    private static final long serialVersionUID = 0;
    private transient UnmodifiableSortedMultiset<E> descendingMultiset;

    public UnmodifiableSortedMultiset(InterfaceC3000p<E> interfaceC3000p) {
        super(interfaceC3000p);
    }

    @Override // com.google.common.collect.InterfaceC3000p, p153l.auf0
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset
    public NavigableSet<E> createElementSet() {
        return Sets.m16182m(delegate().elementSet());
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.AbstractC2993i, p153l.l2j, p153l.v2j
    public InterfaceC3000p<E> delegate() {
        return (InterfaceC3000p) super.delegate();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC3000p<E> descendingMultiset() {
        UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset = this.descendingMultiset;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset2 = new UnmodifiableSortedMultiset<>(delegate().descendingMultiset());
        unmodifiableSortedMultiset2.descendingMultiset = this;
        this.descendingMultiset = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.AbstractC2993i, com.google.common.collect.InterfaceC2995k
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC2995k.a<E> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC3000p<E> headMultiset(E e, BoundType boundType) {
        return Multisets.m16159p(delegate().headMultiset(e, boundType));
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC2995k.a<E> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC2995k.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC2995k.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC3000p<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        return Multisets.m16159p(delegate().subMultiset(e, boundType, e2, boundType2));
    }

    @Override // com.google.common.collect.InterfaceC3000p
    public InterfaceC3000p<E> tailMultiset(E e, BoundType boundType) {
        return Multisets.m16159p(delegate().tailMultiset(e, boundType));
    }
}
