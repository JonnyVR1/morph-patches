package org.greenrobot.greendao.identityscope;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.greenrobot.greendao.internal.LongHashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class IdentityScopeLong<T> implements IdentityScope<Long, T> {
    private final LongHashMap<Reference<T>> map = new LongHashMap<>();
    private final ReentrantLock lock = new ReentrantLock();

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void clear() {
        this.lock.lock();
        try {
            this.map.clear();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public boolean detach(Long l2, T t) {
        ReentrantLock reentrantLock;
        this.lock.lock();
        try {
            if (get(l2) != t || t == null) {
                return false;
            }
            remove(l2);
            return true;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public T get(Long l2) {
        return get2(l2.longValue());
    }

    public T get2(long j) {
        this.lock.lock();
        try {
            Reference<T> reference = this.map.get(j);
            this.lock.unlock();
            if (reference != null) {
                return reference.get();
            }
            return null;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public T get2NoLock(long j) {
        Reference<T> reference = this.map.get(j);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public T getNoLock(Long l2) {
        return get2NoLock(l2.longValue());
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void lock() {
        this.lock.lock();
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void put(Long l2, T t) {
        put2(l2.longValue(), t);
    }

    public void put2(long j, T t) {
        this.lock.lock();
        try {
            this.map.put(j, new WeakReference(t));
        } finally {
            this.lock.unlock();
        }
    }

    public void put2NoLock(long j, T t) {
        this.map.put(j, new WeakReference(t));
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void putNoLock(Long l2, T t) {
        put2NoLock(l2.longValue(), t);
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void remove(Iterable<Long> iterable) {
        this.lock.lock();
        try {
            Iterator<Long> it = iterable.iterator();
            while (it.hasNext()) {
                this.map.remove(it.next().longValue());
            }
            this.lock.unlock();
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void reserveRoom(int i) {
        this.map.reserveRoom(i);
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void unlock() {
        this.lock.unlock();
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void remove(Long l2) {
        this.lock.lock();
        try {
            this.map.remove(l2.longValue());
        } finally {
            this.lock.unlock();
        }
    }
}
