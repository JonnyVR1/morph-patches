package com.google.common.collect;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import p153l.auf0;

/* JADX INFO: renamed from: com.google.common.collect.p */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC3000p<E> extends InterfaceC2995k, auf0<E> {
    Comparator<? super E> comparator();

    InterfaceC3000p<E> descendingMultiset();

    @Override // com.google.common.collect.InterfaceC2995k
    NavigableSet<E> elementSet();

    @Override // com.google.common.collect.InterfaceC2995k
    Set<InterfaceC2995k.a<E>> entrySet();

    InterfaceC2995k.a<E> firstEntry();

    InterfaceC3000p<E> headMultiset(E e, BoundType boundType);

    InterfaceC2995k.a<E> lastEntry();

    InterfaceC2995k.a<E> pollFirstEntry();

    InterfaceC2995k.a<E> pollLastEntry();

    InterfaceC3000p<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2);

    InterfaceC3000p<E> tailMultiset(E e, BoundType boundType);
}
