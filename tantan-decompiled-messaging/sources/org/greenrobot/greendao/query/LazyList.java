package org.greenrobot.greendao.query;

import android.database.Cursor;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.InternalQueryDaoAccess;
import p149l.lmr;

/* JADX INFO: loaded from: classes3.dex */
public class LazyList<E> implements List<E>, Closeable {
    private final Cursor cursor;
    private final InternalQueryDaoAccess<E> daoAccess;
    private final List<E> entities;
    private volatile int loadedCount;
    private final ReentrantLock lock;
    private final int size;

    public class LazyIterator implements CloseableListIterator<E> {
        private final boolean closeWhenDone;
        private int index;

        public LazyIterator(int i, boolean z) {
            this.index = i;
            this.closeWhenDone = z;
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            LazyList.this.close();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < LazyList.this.size;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.index >= LazyList.this.size) {
                lmr.m150601a();
                return null;
            }
            E e = (E) LazyList.this.get(this.index);
            int i = this.index + 1;
            this.index = i;
            if (i == LazyList.this.size && this.closeWhenDone) {
                close();
            }
            return e;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i = this.index;
            if (i <= 0) {
                lmr.m150601a();
                return null;
            }
            int i2 = i - 1;
            this.index = i2;
            return (E) LazyList.this.get(i2);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException();
        }
    }

    public LazyList(InternalQueryDaoAccess<E> internalQueryDaoAccess, Cursor cursor, boolean z) {
        this.cursor = cursor;
        this.daoAccess = internalQueryDaoAccess;
        int count = cursor.getCount();
        this.size = count;
        if (z) {
            this.entities = new ArrayList(count);
            for (int i = 0; i < this.size; i++) {
                this.entities.add(null);
            }
        } else {
            this.entities = null;
        }
        if (this.size == 0) {
            cursor.close();
        }
        this.lock = new ReentrantLock();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public void checkCached() {
        if (this.entities == null) {
            throw new DaoException("This operation only works with cached lazy lists");
        }
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cursor.close();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        loadRemaining();
        return this.entities.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        loadRemaining();
        return this.entities.containsAll(collection);
    }

    @Override // java.util.List
    public E get(int i) {
        List<E> list = this.entities;
        if (list == null) {
            this.lock.lock();
            try {
                return loadEntity(i);
            } finally {
                this.lock.unlock();
            }
        }
        E e = list.get(i);
        if (e != null) {
            return e;
        }
        this.lock.lock();
        try {
            E eLoadEntity = this.entities.get(i);
            if (eLoadEntity == null) {
                eLoadEntity = loadEntity(i);
                this.entities.set(i, eLoadEntity);
                this.loadedCount++;
                if (this.loadedCount == this.size) {
                    this.cursor.close();
                }
            }
            return eLoadEntity;
        } finally {
            this.lock.unlock();
        }
    }

    public int getLoadedCount() {
        return this.loadedCount;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        loadRemaining();
        return this.entities.indexOf(obj);
    }

    public boolean isClosed() {
        return this.cursor.isClosed();
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isLoadedCompletely() {
        return this.loadedCount == this.size;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new LazyIterator(0, false);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        loadRemaining();
        return this.entities.lastIndexOf(obj);
    }

    @Override // java.util.List
    public CloseableListIterator<E> listIterator() {
        return new LazyIterator(0, false);
    }

    public CloseableListIterator<E> listIteratorAutoClose() {
        return new LazyIterator(0, true);
    }

    public E loadEntity(int i) {
        if (!this.cursor.moveToPosition(i)) {
            throw new DaoException("Could not move to cursor location " + i);
        }
        E eLoadCurrent = this.daoAccess.loadCurrent(this.cursor, 0, true);
        if (eLoadCurrent != null) {
            return eLoadCurrent;
        }
        throw new DaoException("Loading of entity failed (null) at position " + i);
    }

    public void loadRemaining() {
        checkCached();
        int size = this.entities.size();
        for (int i = 0; i < size; i++) {
            get(i);
        }
    }

    public E peak(int i) {
        List<E> list = this.entities;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.size;
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        checkCached();
        for (int i3 = i; i3 < i2; i3++) {
            get(i3);
        }
        return this.entities.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        loadRemaining();
        return this.entities.toArray();
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new LazyIterator(i, false);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        loadRemaining();
        return (T[]) this.entities.toArray(tArr);
    }
}
