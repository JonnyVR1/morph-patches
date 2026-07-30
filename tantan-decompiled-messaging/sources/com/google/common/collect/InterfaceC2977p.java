package com.google.common.collect;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import p149l.rlf0;

/* JADX INFO: renamed from: com.google.common.collect.p */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC2977p<E> extends InterfaceC2972k, rlf0<E> {
    Comparator<? super E> comparator();

    InterfaceC2977p<E> descendingMultiset();

    @Override // com.google.common.collect.InterfaceC2972k
    NavigableSet<E> elementSet();

    @Override // com.google.common.collect.InterfaceC2972k
    Set<InterfaceC2972k.a<E>> entrySet();

    InterfaceC2972k.a<E> firstEntry();

    InterfaceC2977p<E> headMultiset(E e, BoundType boundType);

    InterfaceC2972k.a<E> lastEntry();

    InterfaceC2972k.a<E> pollFirstEntry();

    InterfaceC2972k.a<E> pollLastEntry();

    InterfaceC2977p<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2);

    InterfaceC2977p<E> tailMultiset(E e, BoundType boundType);
}
