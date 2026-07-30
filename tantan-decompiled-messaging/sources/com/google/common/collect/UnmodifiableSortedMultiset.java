package com.google.common.collect;

import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes7.dex */
final class UnmodifiableSortedMultiset<E> extends Multisets.UnmodifiableMultiset<E> implements InterfaceC2977p<E> {
    private static final long serialVersionUID = 0;
    private transient UnmodifiableSortedMultiset<E> descendingMultiset;

    public UnmodifiableSortedMultiset(InterfaceC2977p<E> interfaceC2977p) {
        super(interfaceC2977p);
    }

    @Override // com.google.common.collect.InterfaceC2977p, p149l.rlf0
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset
    public NavigableSet<E> createElementSet() {
        return Sets.m16128m(delegate().elementSet());
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.AbstractC2970i, p149l.qzi, p149l.a0j
    public InterfaceC2977p<E> delegate() {
        return (InterfaceC2977p) super.delegate();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2977p<E> descendingMultiset() {
        UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset = this.descendingMultiset;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset2 = new UnmodifiableSortedMultiset<>(delegate().descendingMultiset());
        unmodifiableSortedMultiset2.descendingMultiset = this;
        this.descendingMultiset = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.AbstractC2970i, com.google.common.collect.InterfaceC2972k
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2972k.a<E> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2977p<E> headMultiset(E e, BoundType boundType) {
        return Multisets.m16105p(delegate().headMultiset(e, boundType));
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2972k.a<E> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2972k.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2972k.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2977p<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        return Multisets.m16105p(delegate().subMultiset(e, boundType, e2, boundType2));
    }

    @Override // com.google.common.collect.InterfaceC2977p
    public InterfaceC2977p<E> tailMultiset(E e, BoundType boundType) {
        return Multisets.m16105p(delegate().tailMultiset(e, boundType));
    }
}
