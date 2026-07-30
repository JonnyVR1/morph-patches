package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import p153l.akq;
import p153l.w2j;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class EvictingQueue<E> extends w2j<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Queue<E> delegate;
    final int maxSize;

    private EvictingQueue(int i) {
        xn80.m212101f(i >= 0, "maxSize (%s) must >= 0", i);
        this.delegate = new ArrayDeque(i);
        this.maxSize = i;
    }

    public static <E> EvictingQueue<E> create(int i) {
        return new EvictingQueue<>(i);
    }

    @Override // p153l.l2j, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        xn80.m212111p(e);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e);
        return true;
    }

    @Override // p153l.l2j, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return standardAddAll(collection);
        }
        clear();
        return akq.m98593a(this, akq.m98606n(collection, size - this.maxSize));
    }

    @Override // p153l.w2j, java.util.Queue
    public boolean offer(E e) {
        return add(e);
    }

    public int remainingCapacity() {
        return this.maxSize - size();
    }

    @Override // p153l.l2j, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return super.toArray();
    }

    @Override // p153l.w2j, p153l.l2j, p153l.v2j
    public Queue<E> delegate() {
        return this.delegate;
    }
}
