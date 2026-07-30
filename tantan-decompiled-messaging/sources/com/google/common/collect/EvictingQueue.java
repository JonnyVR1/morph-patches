package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import p149l.aiq;
import p149l.b0j;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class EvictingQueue<E> extends b0j<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Queue<E> delegate;
    final int maxSize;

    private EvictingQueue(int i) {
        sf80.m183884f(i >= 0, "maxSize (%s) must >= 0", i);
        this.delegate = new ArrayDeque(i);
        this.maxSize = i;
    }

    public static <E> EvictingQueue<E> create(int i) {
        return new EvictingQueue<>(i);
    }

    @Override // p149l.qzi, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        sf80.m183894p(e);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e);
        return true;
    }

    @Override // p149l.qzi, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return standardAddAll(collection);
        }
        clear();
        return aiq.m96875a(this, aiq.m96888n(collection, size - this.maxSize));
    }

    @Override // p149l.b0j, java.util.Queue
    public boolean offer(E e) {
        return add(e);
    }

    public int remainingCapacity() {
        return this.maxSize - size();
    }

    @Override // p149l.qzi, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return super.toArray();
    }

    @Override // p149l.b0j, p149l.qzi, p149l.a0j
    public Queue<E> delegate() {
        return this.delegate;
    }
}
