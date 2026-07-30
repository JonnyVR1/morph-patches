package com.google.common.util.concurrent;

import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p149l.gaj;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class AtomicLongMap<K> implements Serializable {
    private transient Map<K, Long> asMap;
    private final ConcurrentHashMap<K, AtomicLong> map;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AtomicLongMap$a */
    public class C3058a implements gaj<AtomicLong, Long> {
        public C3058a(AtomicLongMap atomicLongMap) {
        }

        @Override // p149l.gaj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long apply(AtomicLong atomicLong) {
            return Long.valueOf(atomicLong.get());
        }
    }

    private AtomicLongMap(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
        this.map = (ConcurrentHashMap) sf80.m183894p(concurrentHashMap);
    }

    public static <K> AtomicLongMap<K> create() {
        return new AtomicLongMap<>(new ConcurrentHashMap());
    }

    private Map<K, Long> createAsMap() {
        return Collections.unmodifiableMap(Maps.m16015D(this.map, new C3058a(this)));
    }

    public long addAndGet(K k, long j) {
        AtomicLong atomicLongPutIfAbsent;
        long j2;
        long j3;
        do {
            atomicLongPutIfAbsent = this.map.get(k);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k, new AtomicLong(j))) == null) {
                break;
            }
            do {
                j2 = atomicLongPutIfAbsent.get();
                if (j2 != 0) {
                    j3 = j2 + j;
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j2, j3));
            return j3;
        } while (!this.map.replace(k, atomicLongPutIfAbsent, new AtomicLong(j)));
        return j;
    }

    public Map<K, Long> asMap() {
        Map<K, Long> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Long> mapCreateAsMap = createAsMap();
        this.asMap = mapCreateAsMap;
        return mapCreateAsMap;
    }

    public void clear() {
        this.map.clear();
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    public long decrementAndGet(K k) {
        return addAndGet(k, -1L);
    }

    public long get(K k) {
        AtomicLong atomicLong = this.map.get(k);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    public long getAndAdd(K k, long j) {
        AtomicLong atomicLongPutIfAbsent;
        long j2;
        do {
            atomicLongPutIfAbsent = this.map.get(k);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k, new AtomicLong(j))) == null) {
                return 0L;
            }
            do {
                j2 = atomicLongPutIfAbsent.get();
                if (j2 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j2, j2 + j));
            return j2;
        } while (!this.map.replace(k, atomicLongPutIfAbsent, new AtomicLong(j)));
        return 0L;
    }

    public long getAndDecrement(K k) {
        return getAndAdd(k, -1L);
    }

    public long getAndIncrement(K k) {
        return getAndAdd(k, 1L);
    }

    public long incrementAndGet(K k) {
        return addAndGet(k, 1L);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public long put(K k, long j) {
        AtomicLong atomicLongPutIfAbsent;
        long j2;
        do {
            atomicLongPutIfAbsent = this.map.get(k);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k, new AtomicLong(j))) == null) {
                return 0L;
            }
            do {
                j2 = atomicLongPutIfAbsent.get();
                if (j2 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j2, j));
            return j2;
        } while (!this.map.replace(k, atomicLongPutIfAbsent, new AtomicLong(j)));
        return 0L;
    }

    public void putAll(Map<? extends K, ? extends Long> map) {
        for (Map.Entry<? extends K, ? extends Long> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue().longValue());
        }
    }

    public long putIfAbsent(K k, long j) {
        AtomicLong atomicLongPutIfAbsent;
        do {
            atomicLongPutIfAbsent = this.map.get(k);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k, new AtomicLong(j))) == null) {
                return 0L;
            }
            long j2 = atomicLongPutIfAbsent.get();
            if (j2 != 0) {
                return j2;
            }
        } while (!this.map.replace(k, atomicLongPutIfAbsent, new AtomicLong(j)));
        return 0L;
    }

    public boolean remove(K k, long j) {
        AtomicLong atomicLong = this.map.get(k);
        if (atomicLong == null) {
            return false;
        }
        long j2 = atomicLong.get();
        if (j2 != j) {
            return false;
        }
        if (j2 != 0 && !atomicLong.compareAndSet(j2, 0L)) {
            return false;
        }
        this.map.remove(k, atomicLong);
        return true;
    }

    public void removeAllZeros() {
        Iterator<Map.Entry<K, AtomicLong>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    public boolean removeIfZero(K k) {
        return remove(k, 0L);
    }

    public boolean replace(K k, long j, long j2) {
        if (j == 0) {
            return putIfAbsent(k, j2) == 0;
        }
        AtomicLong atomicLong = this.map.get(k);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(j, j2);
    }

    public int size() {
        return this.map.size();
    }

    public long sum() {
        Iterator<AtomicLong> it = this.map.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().get();
        }
        return j;
    }

    public String toString() {
        return this.map.toString();
    }

    public static <K> AtomicLongMap<K> create(Map<? extends K, ? extends Long> map) {
        AtomicLongMap<K> atomicLongMapCreate = create();
        atomicLongMapCreate.putAll(map);
        return atomicLongMapCreate;
    }

    public long remove(K k) {
        long j;
        AtomicLong atomicLong = this.map.get(k);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j = atomicLong.get();
            if (j == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j, 0L));
        this.map.remove(k, atomicLong);
        return j;
    }
}
