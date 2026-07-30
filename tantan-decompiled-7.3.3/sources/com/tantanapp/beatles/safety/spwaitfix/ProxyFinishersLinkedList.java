package com.tantanapp.beatles.safety.spwaitfix;

import androidx.annotation.Nullable;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes11.dex */
public class ProxyFinishersLinkedList<T> extends ConcurrentLinkedQueue<T> {
    private final ConcurrentLinkedQueue<T> sPendingWorkFinishers;

    public ProxyFinishersLinkedList(ConcurrentLinkedQueue<T> concurrentLinkedQueue) {
        this.sPendingWorkFinishers = concurrentLinkedQueue;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(T t) {
        return this.sPendingWorkFinishers.add(t);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    @Nullable
    public T poll() {
        return null;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public boolean remove(@Nullable Object obj) {
        return this.sPendingWorkFinishers.remove(obj);
    }
}
