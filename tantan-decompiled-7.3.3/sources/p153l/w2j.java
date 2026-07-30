package p153l;

import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: loaded from: classes7.dex */
public abstract class w2j<E> extends l2j<E> implements Queue<E> {
    @Override // p153l.l2j, p153l.v2j
    public abstract Queue<E> delegate();

    @Override // java.util.Queue
    public E element() {
        return delegate().element();
    }

    public boolean offer(E e) {
        return delegate().offer(e);
    }

    @Override // java.util.Queue
    public E peek() {
        return delegate().peek();
    }

    @Override // java.util.Queue
    public E poll() {
        return delegate().poll();
    }

    @Override // java.util.Queue
    public E remove() {
        return delegate().remove();
    }

    public boolean standardOffer(E e) {
        try {
            return add(e);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public E standardPeek() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public E standardPoll() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }
}
