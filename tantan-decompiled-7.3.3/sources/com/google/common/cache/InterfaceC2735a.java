package com.google.common.cache;

/* JADX INFO: renamed from: com.google.common.cache.a */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC2735a<K, V> {
    long getAccessTime();

    int getHash();

    K getKey();

    InterfaceC2735a<K, V> getNext();

    InterfaceC2735a<K, V> getNextInAccessQueue();

    InterfaceC2735a<K, V> getNextInWriteQueue();

    InterfaceC2735a<K, V> getPreviousInAccessQueue();

    InterfaceC2735a<K, V> getPreviousInWriteQueue();

    LocalCache.InterfaceC2718s<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long j);

    void setNextInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a);

    void setNextInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a);

    void setPreviousInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a);

    void setPreviousInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a);

    void setValueReference(LocalCache.InterfaceC2718s<K, V> interfaceC2718s);

    void setWriteTime(long j);
}
