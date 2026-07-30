package org.greenrobot.greendao.identityscope;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface IdentityScope<K, T> {
    void clear();

    boolean detach(K k, T t);

    T get(K k);

    T getNoLock(K k);

    void lock();

    void put(K k, T t);

    void putNoLock(K k, T t);

    void remove(Iterable<K> iterable);

    void remove(K k);

    void reserveRoom(int i);

    void unlock();
}
