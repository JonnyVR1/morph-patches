package com.p000p1.mobile.putong.util;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
class ConcurrentLinkedQueueProxy<E> extends ConcurrentLinkedQueue<E> {
    public ConcurrentLinkedQueue<Runnable> workerFinishers;

    public ConcurrentLinkedQueueProxy(ConcurrentLinkedQueue<Runnable> concurrentLinkedQueue) {
        this.workerFinishers = concurrentLinkedQueue;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        return this.workerFinishers.add((Runnable) e);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public E poll() {
        return null;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.workerFinishers.remove(obj);
    }
}
