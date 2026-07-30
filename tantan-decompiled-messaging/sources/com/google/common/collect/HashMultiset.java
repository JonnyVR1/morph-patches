package com.google.common.collect;

import java.util.Set;
import p149l.aiq;

/* JADX INFO: loaded from: classes7.dex */
public final class HashMultiset<E> extends AbstractMapBasedMultiset<E> {
    private static final long serialVersionUID = 0;

    public HashMultiset(int i) {
        super(i);
    }

    public static <E> HashMultiset<E> create(Iterable<? extends E> iterable) {
        HashMultiset<E> hashMultisetCreate = create(Multisets.m16097h(iterable));
        aiq.m96875a(hashMultisetCreate, iterable);
        return hashMultisetCreate;
    }

    @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2972k
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultiset
    public C2973l<E> newBackingMap(int i) {
        return new C2973l<>(i);
    }

    public static <E> HashMultiset<E> create(int i) {
        return new HashMultiset<>(i);
    }

    public static <E> HashMultiset<E> create() {
        return create(3);
    }
}
