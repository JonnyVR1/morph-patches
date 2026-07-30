package com.immomo.medialog.util;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes7.dex */
public class LimitedQueue<E> extends ConcurrentLinkedQueue<E> {
    private static final long serialVersionUID = 1;
    private final int limit;

    public LimitedQueue(int i) {
        this.limit = i;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        super.add(e);
        while (size() > this.limit) {
            super.remove();
        }
        return true;
    }
}
