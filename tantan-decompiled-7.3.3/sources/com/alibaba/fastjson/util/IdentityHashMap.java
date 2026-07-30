package com.alibaba.fastjson.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class IdentityHashMap<K, V> {
    public static final int DEFAULT_SIZE = 8192;
    private final Entry<K, V>[] buckets;
    private final int indexMask;

    public static final class Entry<K, V> {
        public final int hashCode;
        public final K key;
        public final Entry<K, V> next;
        public V value;

        public Entry(K k, V v2, int i, Entry<K, V> entry) {
            this.key = k;
            this.value = v2;
            this.next = entry;
            this.hashCode = i;
        }
    }

    public IdentityHashMap(int i) {
        this.indexMask = i - 1;
        this.buckets = new Entry[i];
    }

    public void clear() {
        Arrays.fill(this.buckets, (Object) null);
    }

    public Class findClass(String str) {
        int i = 0;
        while (true) {
            Entry<K, V>[] entryArr = this.buckets;
            if (i >= entryArr.length) {
                return null;
            }
            Entry<K, V> entry = entryArr[i];
            if (entry != null) {
                for (Entry<K, V> entry2 = entry; entry2 != null; entry2 = entry2.next) {
                    K k = entry.key;
                    if (k instanceof Class) {
                        Class cls = (Class) k;
                        if (cls.getName().equals(str)) {
                            return cls;
                        }
                    }
                }
            }
            i++;
        }
    }

    public final V get(K k) {
        for (Entry<K, V> entry = this.buckets[System.identityHashCode(k) & this.indexMask]; entry != null; entry = entry.next) {
            if (k == entry.key) {
                return entry.value;
            }
        }
        return null;
    }

    public boolean put(K k, V v2) {
        int iIdentityHashCode = System.identityHashCode(k);
        int i = this.indexMask & iIdentityHashCode;
        for (Entry<K, V> entry = this.buckets[i]; entry != null; entry = entry.next) {
            if (k == entry.key) {
                entry.value = v2;
                return true;
            }
        }
        this.buckets[i] = new Entry<>(k, v2, iIdentityHashCode, this.buckets[i]);
        return false;
    }

    public IdentityHashMap() {
        this(8192);
    }
}
