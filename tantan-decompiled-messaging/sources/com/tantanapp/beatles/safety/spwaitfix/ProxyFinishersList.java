package com.tantanapp.beatles.safety.spwaitfix;

import androidx.annotation.Nullable;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes13.dex */
public class ProxyFinishersList<T> extends LinkedList<T> {
    private final LinkedList<T> sFinishers;

    public ProxyFinishersList(LinkedList<T> linkedList) {
        this.sFinishers = linkedList;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(T t) {
        return this.sFinishers.add(t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    @Nullable
    public T poll() {
        return null;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public boolean remove(@Nullable Object obj) {
        return this.sFinishers.remove(obj);
    }
}
