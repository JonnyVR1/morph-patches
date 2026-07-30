package org.eclipse.jetty.util;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p153l.fig0;
import p153l.mor;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class BlockingArrayQueue<E> extends AbstractList<E> implements BlockingQueue<E> {
    private volatile int _capacity;
    private Object[] _elements;
    private final int _growCapacity;
    private int _head;
    private final ReentrantLock _headLock;
    private final int _limit;
    private final Condition _notEmpty;
    private long _space0;
    private long _space1;
    private long _space2;
    private long _space3;
    private long _space4;
    private long _space5;
    private long _space6;
    private long _space7;
    private int _tail;
    private final ReentrantLock _tailLock;
    public final int DEFAULT_CAPACITY = 128;
    public final int DEFAULT_GROWTH = 64;
    private final AtomicInteger _size = new AtomicInteger();

    public BlockingArrayQueue(int i, int i2, int i3) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this._headLock = reentrantLock;
        this._notEmpty = reentrantLock.newCondition();
        this._tailLock = new ReentrantLock();
        if (i > i3) {
            fig0.m125680a();
            throw null;
        }
        Object[] objArr = new Object[i];
        this._elements = objArr;
        this._capacity = objArr.length;
        this._growCapacity = i2;
        this._limit = i3;
    }

    private boolean grow() {
        int i;
        if (this._growCapacity <= 0) {
            return false;
        }
        this._tailLock.lock();
        try {
            this._headLock.lock();
            try {
                int i2 = this._head;
                int i3 = this._tail;
                Object[] objArr = new Object[this._capacity + this._growCapacity];
                if (i2 < i3) {
                    i = i3 - i2;
                    System.arraycopy(this._elements, i2, objArr, 0, i);
                } else if (i2 > i3 || this._size.get() > 0) {
                    int i4 = (this._capacity + i3) - i2;
                    int i5 = this._capacity - i2;
                    System.arraycopy(this._elements, i2, objArr, 0, i5);
                    System.arraycopy(this._elements, 0, objArr, i5, i3);
                    i = i4;
                } else {
                    i = 0;
                }
                this._elements = objArr;
                this._capacity = objArr.length;
                this._head = 0;
                this._tail = i;
                this._headLock.unlock();
                this._tailLock.unlock();
                return true;
            } catch (Throwable th) {
                this._headLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this._tailLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        e.getClass();
        this._tailLock.lock();
        try {
            this._headLock.lock();
            if (i >= 0) {
                try {
                    if (i <= this._size.get()) {
                        if (i == this._size.get()) {
                            add(e);
                        } else {
                            if (this._tail == this._head && !grow()) {
                                throw new IllegalStateException("full");
                            }
                            int i2 = this._head + i;
                            if (i2 >= this._capacity) {
                                i2 -= this._capacity;
                            }
                            this._size.incrementAndGet();
                            int i3 = (this._tail + 1) % this._capacity;
                            this._tail = i3;
                            if (i2 < i3) {
                                Object[] objArr = this._elements;
                                System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
                                this._elements[i2] = e;
                            } else {
                                if (i3 > 0) {
                                    Object[] objArr2 = this._elements;
                                    System.arraycopy(objArr2, 0, objArr2, 1, i3);
                                    Object[] objArr3 = this._elements;
                                    objArr3[0] = objArr3[this._capacity - 1];
                                }
                                Object[] objArr4 = this._elements;
                                System.arraycopy(objArr4, i2, objArr4, i2 + 1, (this._capacity - i2) - 1);
                                this._elements[i2] = e;
                            }
                        }
                        this._headLock.unlock();
                        this._tailLock.unlock();
                        return;
                    }
                } catch (Throwable th) {
                    this._headLock.unlock();
                    throw th;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this._size + ")");
        } catch (Throwable th2) {
            this._tailLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this._tailLock.lock();
        try {
            this._headLock.lock();
            try {
                this._head = 0;
                this._tail = 0;
                this._size.set(0);
                this._headLock.unlock();
                this._tailLock.unlock();
            } catch (Throwable th) {
                this._headLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this._tailLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public E element() {
        E ePeek = peek();
        if (ePeek != null) {
            return ePeek;
        }
        mor.m159308a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        this._tailLock.lock();
        try {
            this._headLock.lock();
            if (i >= 0) {
                try {
                    if (i < this._size.get()) {
                        int i2 = this._head + i;
                        if (i2 >= this._capacity) {
                            i2 -= this._capacity;
                        }
                        E e = (E) this._elements[i2];
                        this._headLock.unlock();
                        this._tailLock.unlock();
                        return e;
                    }
                } catch (Throwable th) {
                    this._headLock.unlock();
                    throw th;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this._size + ")");
        } catch (Throwable th2) {
            this._tailLock.unlock();
            throw th2;
        }
    }

    public int getCapacity() {
        return this._capacity;
    }

    public int getLimit() {
        return this._limit;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this._size.get() == 0;
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Queue
    public boolean offer(E e) {
        e.getClass();
        this._tailLock.lock();
        try {
            if (this._size.get() < this._limit) {
                if (this._size.get() == this._capacity) {
                    this._headLock.lock();
                    try {
                        boolean zGrow = grow();
                        ReentrantLock reentrantLock = this._headLock;
                        if (zGrow) {
                            reentrantLock.unlock();
                        } else {
                            reentrantLock.unlock();
                        }
                    } catch (Throwable th) {
                        this._headLock.unlock();
                        throw th;
                    }
                }
                Object[] objArr = this._elements;
                int i = this._tail;
                objArr[i] = e;
                this._tail = (i + 1) % this._capacity;
                boolean z = this._size.getAndIncrement() == 0;
                this._tailLock.unlock();
                if (z) {
                    this._headLock.lock();
                    try {
                        this._notEmpty.signal();
                    } finally {
                        this._headLock.unlock();
                    }
                }
                return true;
            }
            this._tailLock.unlock();
            return false;
        } catch (Throwable th2) {
            this._tailLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.Queue
    public E peek() {
        E e = null;
        if (this._size.get() == 0) {
            return null;
        }
        this._headLock.lock();
        try {
            if (this._size.get() > 0) {
                e = (E) this._elements[this._head];
            }
            return e;
        } finally {
            this._headLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j);
        this._headLock.lockInterruptibly();
        while (this._size.get() == 0) {
            try {
                try {
                    if (nanos <= 0) {
                        this._headLock.unlock();
                        return null;
                    }
                    nanos = this._notEmpty.awaitNanos(nanos);
                } catch (InterruptedException e) {
                    this._notEmpty.signal();
                    throw e;
                }
            } catch (Throwable th) {
                this._headLock.unlock();
                throw th;
            }
        }
        Object[] objArr = this._elements;
        int i = this._head;
        E e2 = (E) objArr[i];
        objArr[i] = null;
        this._head = (i + 1) % this._capacity;
        if (this._size.decrementAndGet() > 0) {
            this._notEmpty.signal();
        }
        this._headLock.unlock();
        return e2;
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e) throws InterruptedException {
        if (add(e)) {
            return;
        }
        wtq0.m207906a("full");
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        this._tailLock.lock();
        try {
            this._headLock.lock();
            try {
                int capacity = getCapacity() - size();
                this._headLock.unlock();
                this._tailLock.unlock();
                return capacity;
            } catch (Throwable th) {
                this._headLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this._tailLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        this._tailLock.lock();
        try {
            this._headLock.lock();
            if (i >= 0) {
                try {
                    if (i < this._size.get()) {
                        int i2 = this._head + i;
                        if (i2 >= this._capacity) {
                            i2 -= this._capacity;
                        }
                        Object[] objArr = this._elements;
                        E e = (E) objArr[i2];
                        int i3 = this._tail;
                        if (i2 < i3) {
                            System.arraycopy(objArr, i2 + 1, objArr, i2, i3 - i2);
                            this._tail--;
                            this._size.decrementAndGet();
                        } else {
                            System.arraycopy(objArr, i2 + 1, objArr, i2, (this._capacity - i2) - 1);
                            if (this._tail > 0) {
                                Object[] objArr2 = this._elements;
                                int i4 = this._capacity;
                                Object[] objArr3 = this._elements;
                                objArr2[i4] = objArr3[0];
                                System.arraycopy(objArr3, 1, objArr3, 0, this._tail - 1);
                                this._tail--;
                            } else {
                                this._tail = this._capacity - 1;
                            }
                            this._size.decrementAndGet();
                        }
                        this._headLock.unlock();
                        this._tailLock.unlock();
                        return e;
                    }
                } catch (Throwable th) {
                    this._headLock.unlock();
                    throw th;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this._size + ")");
        } catch (Throwable th2) {
            this._tailLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        e.getClass();
        this._tailLock.lock();
        try {
            this._headLock.lock();
            if (i >= 0) {
                try {
                    if (i < this._size.get()) {
                        int i2 = this._head + i;
                        if (i2 >= this._capacity) {
                            i2 -= this._capacity;
                        }
                        Object[] objArr = this._elements;
                        E e2 = (E) objArr[i2];
                        objArr[i2] = e;
                        this._headLock.unlock();
                        this._tailLock.unlock();
                        return e2;
                    }
                } catch (Throwable th) {
                    this._headLock.unlock();
                    throw th;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this._size + ")");
        } catch (Throwable th2) {
            this._tailLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this._size.get();
    }

    public long sumOfSpace() {
        long j = this._space0;
        this._space0 = j + 1;
        long j2 = this._space1;
        this._space1 = j2 + 1;
        long j3 = j + j2;
        long j4 = this._space2;
        this._space2 = j4 + 1;
        long j5 = j3 + j4;
        long j6 = this._space3;
        this._space3 = j6 + 1;
        long j7 = j5 + j6;
        long j8 = this._space4;
        this._space4 = j8 + 1;
        long j9 = j7 + j8;
        long j10 = this._space5;
        this._space5 = j10 + 1;
        long j11 = j9 + j10;
        long j12 = this._space6;
        this._space6 = j12 + 1;
        long j13 = j11 + j12;
        long j14 = this._space7;
        this._space7 = 1 + j14;
        return j13 + j14;
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        this._headLock.lockInterruptibly();
        while (this._size.get() == 0) {
            try {
                try {
                    this._notEmpty.await();
                } catch (InterruptedException e) {
                    this._notEmpty.signal();
                    throw e;
                }
            } catch (Throwable th) {
                this._headLock.unlock();
                throw th;
            }
        }
        int i = this._head;
        Object[] objArr = this._elements;
        E e2 = (E) objArr[i];
        objArr[i] = null;
        this._head = (i + 1) % this._capacity;
        if (this._size.decrementAndGet() > 0) {
            this._notEmpty.signal();
        }
        this._headLock.unlock();
        return e2;
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i) {
        throw new UnsupportedOperationException();
    }

    public BlockingArrayQueue(int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this._headLock = reentrantLock;
        this._notEmpty = reentrantLock.newCondition();
        this._tailLock = new ReentrantLock();
        Object[] objArr = new Object[i];
        this._elements = objArr;
        this._capacity = objArr.length;
        this._growCapacity = -1;
        this._limit = i;
    }

    public BlockingArrayQueue(int i, int i2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this._headLock = reentrantLock;
        this._notEmpty = reentrantLock.newCondition();
        this._tailLock = new ReentrantLock();
        Object[] objArr = new Object[i];
        this._elements = objArr;
        this._capacity = objArr.length;
        this._growCapacity = i2;
        this._limit = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public BlockingArrayQueue() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this._headLock = reentrantLock;
        this._notEmpty = reentrantLock.newCondition();
        this._tailLock = new ReentrantLock();
        Object[] objArr = new Object[128];
        this._elements = objArr;
        this._growCapacity = 64;
        this._capacity = objArr.length;
        this._limit = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // java.util.Queue
    public E poll() {
        E e = null;
        if (this._size.get() == 0) {
            return null;
        }
        this._headLock.lock();
        try {
            if (this._size.get() > 0) {
                int i = this._head;
                Object[] objArr = this._elements;
                Object obj = objArr[i];
                objArr[i] = null;
                this._head = (i + 1) % this._capacity;
                if (this._size.decrementAndGet() > 0) {
                    this._notEmpty.signal();
                }
                e = (E) obj;
            }
            return e;
        } finally {
            this._headLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public E remove() {
        E ePoll = poll();
        if (ePoll != null) {
            return ePoll;
        }
        mor.m159308a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.concurrent.BlockingQueue, java.util.Queue
    public boolean add(E e) {
        return offer(e);
    }
}
