package com.tantanapp.common.utils.collections;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Iterator;
import p153l.mor;

/* JADX INFO: loaded from: classes11.dex */
public final class TripleElementSet<E> extends AbstractSet<E> implements Serializable {
    final E element1;
    final E element2;
    final E element3;

    /* JADX INFO: renamed from: com.tantanapp.common.utils.collections.TripleElementSet$a */
    public class C13800a implements Iterator<E> {

        /* JADX INFO: renamed from: a */
        public int f56939a = 0;

        public C13800a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f56939a <= 2;
        }

        @Override // java.util.Iterator
        public E next() {
            int i = this.f56939a;
            if (i == 0) {
                this.f56939a = 1;
                return TripleElementSet.this.element1;
            }
            if (i == 1) {
                this.f56939a = 2;
                return TripleElementSet.this.element2;
            }
            if (i == 2) {
                this.f56939a = 3;
                return TripleElementSet.this.element3;
            }
            mor.m159308a();
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public TripleElementSet(E e, E e2, E e3) {
        this.element1 = e;
        this.element2 = e2;
        this.element3 = e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        E e = this.element1;
        if (obj == null) {
            return e == null || this.element2 == null || this.element3 == null;
        }
        return obj.equals(e) || obj.equals(this.element2) || obj.equals(this.element3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NonNull
    public Iterator<E> iterator() {
        return new C13800a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 3;
    }
}
