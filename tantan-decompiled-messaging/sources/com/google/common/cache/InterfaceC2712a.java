package com.google.common.cache;

/* JADX INFO: renamed from: com.google.common.cache.a */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC2712a<K, V> {
    long getAccessTime();

    int getHash();

    K getKey();

    InterfaceC2712a<K, V> getNext();

    InterfaceC2712a<K, V> getNextInAccessQueue();

    InterfaceC2712a<K, V> getNextInWriteQueue();

    InterfaceC2712a<K, V> getPreviousInAccessQueue();

    InterfaceC2712a<K, V> getPreviousInWriteQueue();

    LocalCache.InterfaceC2695s<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long j);

    void setNextInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a);

    void setNextInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a);

    void setPreviousInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a);

    void setPreviousInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a);

    void setValueReference(LocalCache.InterfaceC2695s<K, V> interfaceC2695s);

    void setWriteTime(long j);
}
