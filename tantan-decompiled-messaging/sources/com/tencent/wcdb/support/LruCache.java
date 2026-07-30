package com.tencent.wcdb.support;

import android.annotation.SuppressLint;
import java.util.LinkedHashMap;
import java.util.Map;
import p149l.hjd0;
import p149l.ig3;
import p149l.jfd0;

/* JADX INFO: loaded from: classes2.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i) {
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

    public V create(K k) {
        return null;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public void entryRemoved(boolean z, K k, V v2, V v3) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    public final V get(K k) {
        V vPut;
        if (k == null) {
            jfd0.m141176a("key == null");
            return null;
        }
        synchronized (this) {
            try {
                V v2 = this.map.get(k);
                if (v2 != null) {
                    this.hitCount++;
                    return v2;
                }
                this.missCount++;
                V vCreate = create(k);
                if (vCreate == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.createCount++;
                        vPut = this.map.put(k, vCreate);
                        if (vPut != null) {
                            this.map.put(k, vPut);
                        } else {
                            this.size += safeSizeOf(k, vCreate);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vPut != null) {
                    entryRemoved(false, k, vCreate, vPut);
                    return vPut;
                }
                trimToSize(this.maxSize);
                return vCreate;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final V put(K k, V v2) {
        V vPut;
        if (k == null || v2 == null) {
            jfd0.m141176a("key == null || value == null");
            return null;
        }
        synchronized (this) {
            try {
                this.putCount++;
                this.size += safeSizeOf(k, v2);
                vPut = this.map.put(k, v2);
                if (vPut != null) {
                    this.size -= safeSizeOf(k, vPut);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            entryRemoved(false, k, vPut, v2);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    public final V remove(K k) {
        V vRemove;
        if (k == null) {
            jfd0.m141176a("key == null");
            return null;
        }
        synchronized (this) {
            try {
                vRemove = this.map.remove(k);
                if (vRemove != null) {
                    this.size -= safeSizeOf(k, vRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            entryRemoved(false, k, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int i) {
        if (i <= 0) {
            ig3.m135964a("maxSize <= 0");
            return;
        }
        synchronized (this) {
            this.maxSize = i;
        }
        trimToSize(i);
    }

    public final synchronized int size() {
        return this.size;
    }

    public int sizeOf(K k, V v2) {
        return 1;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.map);
    }

    @SuppressLint({"DefaultLocale"})
    public final synchronized String toString() {
        int i;
        int i2;
        try {
            i = this.hitCount;
            i2 = this.missCount + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    public void trimToSize(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size > i && !this.map.isEmpty()) {
                        Map.Entry<K, V> next = this.map.entrySet().iterator().hasNext() ? this.map.entrySet().iterator().next() : null;
                        if (next == null) {
                            return;
                        }
                        key = next.getKey();
                        value = next.getValue();
                        this.map.remove(key);
                        this.size -= safeSizeOf(key, value);
                        this.evictionCount++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }
}
