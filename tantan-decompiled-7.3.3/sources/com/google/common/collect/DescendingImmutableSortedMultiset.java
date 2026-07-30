package com.google.common.collect;

/* JADX INFO: loaded from: classes7.dex */
final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    private final transient ImmutableSortedMultiset<E> forward;

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.forward = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableSortedMultisetFauxverideShim, com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2995k
    public int count(Object obj) {
        return this.forward.count(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2995k
    public ImmutableSortedSet<E> elementSet() {
        return this.forward.elementSet().descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.InterfaceC3000p
    public InterfaceC2995k.a<E> firstEntry() {
        return this.forward.lastEntry();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public InterfaceC2995k.a<E> getEntry(int i) {
        return this.forward.entrySet().asList().reverse().get(i);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.InterfaceC3000p
    public ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType) {
        return this.forward.tailMultiset((Object) e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.forward.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.InterfaceC3000p
    public InterfaceC2995k.a<E> lastEntry() {
        return this.forward.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2995k
    public int size() {
        return this.forward.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.InterfaceC3000p
    public ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        return this.forward.headMultiset((Object) e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.InterfaceC3000p
    public ImmutableSortedMultiset<E> descendingMultiset() {
        return this.forward;
    }
}
