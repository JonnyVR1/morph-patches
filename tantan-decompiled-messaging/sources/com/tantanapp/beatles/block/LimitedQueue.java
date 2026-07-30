package com.tantanapp.beatles.block;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes13.dex */
public class LimitedQueue<T> extends LinkedList<T> {
    private final int size;

    public LimitedQueue(int i) {
        this.size = i;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(T t) {
        super.add(t);
        while (size() > this.size) {
            super.remove();
        }
        return true;
    }
}
