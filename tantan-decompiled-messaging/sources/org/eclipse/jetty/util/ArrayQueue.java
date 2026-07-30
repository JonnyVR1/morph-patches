package org.eclipse.jetty.util;

import java.util.AbstractList;
import java.util.NoSuchElementException;
import java.util.Queue;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class ArrayQueue<E> extends AbstractList<E> implements Queue<E> {
    public static final int DEFAULT_CAPACITY = 64;
    public static final int DEFAULT_GROWTH = 32;
    protected Object[] _elements;
    protected final int _growCapacity;
    protected final Object _lock;
    protected int _nextE;
    protected int _nextSlot;
    protected int _size;

    public ArrayQueue(int i, int i2, Object obj) {
        this._lock = obj == null ? this : obj;
        this._growCapacity = i2;
        this._elements = new Object[i];
    }

    /* JADX INFO: renamed from: at */
    private E m221098at(int i) {
        return (E) this._elements[i];
    }

    private E dequeue() {
        E eM221098at = m221098at(this._nextE);
        Object[] objArr = this._elements;
        int i = this._nextE;
        objArr[i] = null;
        this._size--;
        int i2 = i + 1;
        this._nextE = i2;
        if (i2 == objArr.length) {
            this._nextE = 0;
        }
        return eM221098at;
    }

    private boolean enqueue(E e) {
        if (this._size == this._elements.length && !grow()) {
            return false;
        }
        this._size++;
        Object[] objArr = this._elements;
        int i = this._nextSlot;
        int i2 = i + 1;
        this._nextSlot = i2;
        objArr[i] = e;
        if (i2 == objArr.length) {
            this._nextSlot = 0;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        synchronized (this._lock) {
            if (i >= 0) {
                try {
                    int i2 = this._size;
                    if (i <= i2) {
                        if (i2 == this._elements.length && !grow()) {
                            throw new IllegalStateException("Full");
                        }
                        int i3 = this._size;
                        if (i == i3) {
                            add(e);
                        } else {
                            int length = this._nextE + i;
                            Object[] objArr = this._elements;
                            if (length >= objArr.length) {
                                length -= objArr.length;
                            }
                            this._size = i3 + 1;
                            int i4 = this._nextSlot + 1;
                            this._nextSlot = i4;
                            if (i4 == objArr.length) {
                                this._nextSlot = 0;
                            }
                            int i5 = this._nextSlot;
                            if (length < i5) {
                                System.arraycopy(objArr, length, objArr, length + 1, i5 - length);
                                this._elements[length] = e;
                            } else {
                                if (i5 > 0) {
                                    System.arraycopy(objArr, 0, objArr, 1, i5);
                                    Object[] objArr2 = this._elements;
                                    objArr2[0] = objArr2[objArr2.length - 1];
                                }
                                Object[] objArr3 = this._elements;
                                System.arraycopy(objArr3, length, objArr3, length + 1, (objArr3.length - length) - 1);
                                this._elements[length] = e;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this._size + ")");
        }
    }

    public void addUnsafe(E e) {
        if (enqueue(e)) {
            return;
        }
        qkq0.m175383a("Full");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        synchronized (this._lock) {
            this._size = 0;
            this._nextE = 0;
            this._nextSlot = 0;
        }
    }

    @Override // java.util.Queue
    public E element() {
        E eM221098at;
        synchronized (this._lock) {
            try {
                if (isEmpty()) {
                    throw new NoSuchElementException();
                }
                eM221098at = m221098at(this._nextE);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eM221098at;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        E unsafe;
        synchronized (this._lock) {
            if (i >= 0) {
                try {
                    if (i < this._size) {
                        unsafe = getUnsafe(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this._size + ")");
        }
        return unsafe;
    }

    public int getCapacity() {
        int length;
        synchronized (this._lock) {
            length = this._elements.length;
        }
        return length;
    }

    public E getUnsafe(int i) {
        return m221098at((this._nextE + i) % this._elements.length);
    }

    public boolean grow() {
        synchronized (this._lock) {
            try {
                int i = this._growCapacity;
                if (i <= 0) {
                    return false;
                }
                Object[] objArr = this._elements;
                Object[] objArr2 = new Object[objArr.length + i];
                int length = objArr.length;
                int i2 = this._nextE;
                int i3 = length - i2;
                if (i3 > 0) {
                    System.arraycopy(objArr, i2, objArr2, 0, i3);
                }
                if (this._nextE != 0) {
                    System.arraycopy(this._elements, 0, objArr2, i3, this._nextSlot);
                }
                this._elements = objArr2;
                this._nextE = 0;
                this._nextSlot = this._size;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        boolean z;
        synchronized (this._lock) {
            z = this._size == 0;
        }
        return z;
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        boolean zEnqueue;
        synchronized (this._lock) {
            zEnqueue = enqueue(e);
        }
        return zEnqueue;
    }

    @Override // java.util.Queue
    public E peek() {
        synchronized (this._lock) {
            try {
                if (isEmpty()) {
                    return null;
                }
                return m221098at(this._nextE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.Queue
    public E poll() {
        synchronized (this._lock) {
            try {
                if (this._size == 0) {
                    return null;
                }
                return dequeue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        E eM221098at;
        synchronized (this._lock) {
            if (i >= 0) {
                try {
                    if (i < this._size) {
                        int length = (this._nextE + i) % this._elements.length;
                        eM221098at = m221098at(length);
                        int i2 = this._nextSlot;
                        Object[] objArr = this._elements;
                        if (length < i2) {
                            System.arraycopy(objArr, length + 1, objArr, length, i2 - length);
                            this._nextSlot--;
                            this._size--;
                        } else {
                            System.arraycopy(objArr, length + 1, objArr, length, (objArr.length - length) - 1);
                            int i3 = this._nextSlot;
                            Object[] objArr2 = this._elements;
                            if (i3 > 0) {
                                objArr2[objArr2.length - 1] = objArr2[0];
                                System.arraycopy(objArr2, 1, objArr2, 0, i3 - 1);
                                this._nextSlot--;
                            } else {
                                this._nextSlot = objArr2.length - 1;
                            }
                            this._size--;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this._size + ")");
        }
        return eM221098at;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        E eM221098at;
        synchronized (this._lock) {
            if (i >= 0) {
                try {
                    if (i < this._size) {
                        int length = this._nextE + i;
                        Object[] objArr = this._elements;
                        if (length >= objArr.length) {
                            length -= objArr.length;
                        }
                        eM221098at = m221098at(length);
                        this._elements[length] = e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this._size + ")");
        }
        return eM221098at;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        int i;
        synchronized (this._lock) {
            i = this._size;
        }
        return i;
    }

    public ArrayQueue(int i) {
        this(i, -1);
    }

    public ArrayQueue(int i, int i2) {
        this(i, i2, null);
    }

    public ArrayQueue() {
        this(64, -1);
    }

    @Override // java.util.Queue
    public E remove() {
        E eDequeue;
        synchronized (this._lock) {
            try {
                if (this._size != 0) {
                    eDequeue = dequeue();
                } else {
                    throw new NoSuchElementException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eDequeue;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Queue
    public boolean add(E e) {
        if (offer(e)) {
            return true;
        }
        qkq0.m175383a("Full");
        return false;
    }
}
