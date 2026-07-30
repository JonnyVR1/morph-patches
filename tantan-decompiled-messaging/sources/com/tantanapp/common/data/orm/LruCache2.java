package com.tantanapp.common.data.orm;

import java.util.LinkedHashMap;
import java.util.Map;
import p149l.hjd0;
import p149l.ig3;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes13.dex */
public class LruCache2<K, V> {
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache2(int i) {
        if (i <= 0) {
            ig3.m135964a("maxSize <= 0");
            throw null;
        }
        this.maxSize = i;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int safeSizeOf(K k, V v2) {
        int iSizeOf = sizeOf(k, v2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        hjd0.m131368a("Negative size: ", k, "=", v2);
        return 0;
    }

    public final V cache(K k, V v2) {
        if (k == null || v2 == null) {
            throw new NullPointerException("key = " + k + " , value = " + v2);
        }
        this.putCount++;
        this.size += safeSizeOf(k, v2);
        V vPut = this.map.put(k, v2);
        if (vPut != null) {
            this.size -= safeSizeOf(k, vPut);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public final V cached(K k) {
        if (k == null) {
            jfd0.m141176a("key == null");
            return null;
        }
        V v2 = this.map.get(k);
        if (v2 != null) {
            this.hitCount++;
            return v2;
        }
        this.missCount++;
        return null;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        return this.evictionCount;
    }

    public final int hitCount() {
        return this.hitCount;
    }

    public final int maxSize() {
        return this.maxSize;
    }

    public final int missCount() {
        return this.missCount;
    }

    public final int putCount() {
        return this.putCount;
    }

    public final V remove(K k) {
        if (k == null) {
            jfd0.m141176a("key == null");
            return null;
        }
        V vRemove = this.map.remove(k);
        if (vRemove != null) {
            this.size -= safeSizeOf(k, vRemove);
        }
        return vRemove;
    }

    public void resize(int i) {
        if (i <= 0) {
            ig3.m135964a("maxSize <= 0");
        } else {
            this.maxSize = i;
            trimToSize(i);
        }
    }

    public final int size() {
        return this.size;
    }

    public int sizeOf(K k, V v2) {
        return 1;
    }

    public final Map<K, V> snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final String toString() {
        int i = this.hitCount;
        int i2 = this.missCount + i;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    public void trimToSize(int i) {
        while (this.size >= 0 && (!this.map.isEmpty() || this.size == 0)) {
            if (this.size <= i || this.map.isEmpty()) {
                return;
            }
            Map.Entry<K, V> next = this.map.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            this.map.remove(key);
            this.size -= safeSizeOf(key, value);
            this.evictionCount++;
        }
        qkq0.m175383a(getClass().getName().concat(".sizeOf() is reporting inconsistent results!"));
    }
}
