package com.google.common.collect;

import p149l.fpj0;

/* JADX INFO: loaded from: classes7.dex */
class RegularImmutableAsList<E> extends ImmutableAsList<E> {
    private final ImmutableCollection<E> delegate;
    private final ImmutableList<? extends E> delegateList;

    public RegularImmutableAsList(ImmutableCollection<E> immutableCollection, ImmutableList<? extends E> immutableList) {
        this.delegate = immutableCollection;
        this.delegateList = immutableList;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        return this.delegateList.copyIntoArray(objArr, i);
    }

    @Override // com.google.common.collect.ImmutableAsList
    public ImmutableCollection<E> delegateCollection() {
        return this.delegate;
    }

    public ImmutableList<? extends E> delegateList() {
        return this.delegateList;
    }

    @Override // java.util.List
    public E get(int i) {
        return this.delegateList.get(i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] internalArray() {
        return this.delegateList.internalArray();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
        return this.delegateList.internalArrayEnd();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
        return this.delegateList.internalArrayStart();
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public fpj0<E> listIterator(int i) {
        return this.delegateList.listIterator(i);
    }

    public RegularImmutableAsList(ImmutableCollection<E> immutableCollection, Object[] objArr) {
        this(immutableCollection, ImmutableList.asImmutableList(objArr));
    }

    public RegularImmutableAsList(ImmutableCollection<E> immutableCollection, Object[] objArr, int i) {
        this(immutableCollection, ImmutableList.asImmutableList(objArr, i));
    }
}
