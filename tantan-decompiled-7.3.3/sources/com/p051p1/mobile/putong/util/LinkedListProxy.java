package com.p051p1.mobile.putong.util;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes10.dex */
class LinkedListProxy<E> extends LinkedList<E> {
    public LinkedList<Runnable> finishers;

    public LinkedListProxy(LinkedList<Runnable> linkedList) {
        this.finishers = linkedList;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(E e) {
        return this.finishers.add((Runnable) e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    public E poll() {
        return null;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public boolean remove(Object obj) {
        return this.finishers.remove(obj);
    }
}
