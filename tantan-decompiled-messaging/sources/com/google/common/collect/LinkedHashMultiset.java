package com.google.common.collect;

import java.util.Set;
import p149l.aiq;
import p149l.k050;

/* JADX INFO: loaded from: classes7.dex */
public final class LinkedHashMultiset<E> extends AbstractMapBasedMultiset<E> {
    public LinkedHashMultiset(int i) {
        super(i);
    }

    public static <E> LinkedHashMultiset<E> create(Iterable<? extends E> iterable) {
        LinkedHashMultiset<E> linkedHashMultisetCreate = create(Multisets.m16097h(iterable));
        aiq.m96875a(linkedHashMultisetCreate, iterable);
        return linkedHashMultisetCreate;
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
        return new k050(i);
    }

    public static <E> LinkedHashMultiset<E> create(int i) {
        return new LinkedHashMultiset<>(i);
    }

    public static <E> LinkedHashMultiset<E> create() {
        return create(3);
    }
}
