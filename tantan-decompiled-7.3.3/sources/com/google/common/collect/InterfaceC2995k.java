package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.collect.k */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC2995k<E> extends Collection<E> {

    /* JADX INFO: renamed from: com.google.common.collect.k$a */
    public interface a<E> {
        int getCount();

        E getElement();

        String toString();
    }

    int add(E e, int i);

    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    Set<E> elementSet();

    Set<a<E>> entrySet();

    boolean equals(Object obj);

    int hashCode();

    Iterator<E> iterator();

    int remove(Object obj, int i);

    boolean remove(Object obj);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    int size();
}
