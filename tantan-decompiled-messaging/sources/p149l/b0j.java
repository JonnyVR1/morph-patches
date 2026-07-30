package p149l;

import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b0j<E> extends qzi<E> implements Queue<E> {
    @Override // p149l.qzi, p149l.a0j
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
