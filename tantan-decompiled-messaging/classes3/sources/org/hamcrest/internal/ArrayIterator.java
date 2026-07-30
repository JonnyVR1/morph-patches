package org.hamcrest.internal;

import java.lang.reflect.Array;
import java.util.Iterator;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ArrayIterator implements Iterator<Object> {
    private final Object array;
    private int currentIndex = 0;

    public ArrayIterator(Object obj) {
        if (obj.getClass().isArray()) {
            this.array = obj;
        } else {
            ig3.a("not an array");
            throw null;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.currentIndex < Array.getLength(this.array);
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.array;
        int i = this.currentIndex;
        this.currentIndex = i + 1;
        return Array.get(obj, i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }
}
