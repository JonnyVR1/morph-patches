package com.google.common.collect;

import java.util.Set;
import p153l.akq;
import p153l.z850;

/* JADX INFO: loaded from: classes7.dex */
public final class LinkedHashMultiset<E> extends AbstractMapBasedMultiset<E> {
    public LinkedHashMultiset(int i) {
        super(i);
    }

    public static <E> LinkedHashMultiset<E> create(Iterable<? extends E> iterable) {
        LinkedHashMultiset<E> linkedHashMultisetCreate = create(Multisets.m16151h(iterable));
        akq.m98593a(linkedHashMultisetCreate, iterable);
        return linkedHashMultisetCreate;
    }

    @Override // com.google.common.collect.AbstractC2986b, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2995k
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC2986b, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultiset
    public C2996l<E> newBackingMap(int i) {
        return new z850(i);
    }

    public static <E> LinkedHashMultiset<E> create(int i) {
        return new LinkedHashMultiset<>(i);
    }

    public static <E> LinkedHashMultiset<E> create() {
        return create(3);
    }
}
