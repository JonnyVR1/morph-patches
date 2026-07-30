package org.greenrobot.greendao.internal;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import org.greenrobot.greendao.DaoLog;

/* JADX INFO: loaded from: classes3.dex */
public final class LongHashMap<T> {
    private int capacity;
    private int size;
    private Entry<T>[] table;
    private int threshold;

    public static final class Entry<T> {
        final long key;
        Entry<T> next;
        T value;

        public Entry(long j, T t, Entry<T> entry) {
            this.key = j;
            this.value = t;
            this.next = entry;
        }
    }

    public LongHashMap(int i) {
        this.capacity = i;
        this.threshold = (i * 4) / 3;
        this.table = new Entry[i];
    }

    public void clear() {
        this.size = 0;
        Arrays.fill(this.table, (Object) null);
    }

    public boolean containsKey(long j) {
        for (Entry<T> entry = this.table[((((int) (j >>> 32)) ^ ((int) j)) & Api.BaseClientBuilder.API_PRIORITY_OTHER) % this.capacity]; entry != null; entry = entry.next) {
            if (entry.key == j) {
                return true;
            }
        }
        return false;
    }

    public T get(long j) {
        for (Entry<T> entry = this.table[((((int) (j >>> 32)) ^ ((int) j)) & Api.BaseClientBuilder.API_PRIORITY_OTHER) % this.capacity]; entry != null; entry = entry.next) {
            if (entry.key == j) {
                return entry.value;
            }
        }
        return null;
    }

    public void logStats() {
        int i = 0;
        for (Entry<T> entry : this.table) {
            while (entry != null) {
                entry = entry.next;
                if (entry == null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        DaoLog.m221099d("load: " + (this.size / this.capacity) + ", size: " + this.size + ", capa: " + this.capacity + ", collisions: " + i + ", collision ratio: " + (i / this.size));
    }

    public T put(long j, T t) {
        int i = ((((int) (j >>> 32)) ^ ((int) j)) & Api.BaseClientBuilder.API_PRIORITY_OTHER) % this.capacity;
        Entry<T> entry = this.table[i];
        for (Entry<T> entry2 = entry; entry2 != null; entry2 = entry2.next) {
            if (entry2.key == j) {
                T t2 = entry2.value;
                entry2.value = t;
                return t2;
            }
        }
        this.table[i] = new Entry<>(j, t, entry);
        int i2 = this.size + 1;
        this.size = i2;
        if (i2 <= this.threshold) {
            return null;
        }
        setCapacity(this.capacity * 2);
        return null;
    }

    public T remove(long j) {
        int i = ((((int) (j >>> 32)) ^ ((int) j)) & Api.BaseClientBuilder.API_PRIORITY_OTHER) % this.capacity;
        Entry<T> entry = this.table[i];
        Entry<T> entry2 = null;
        while (entry != null) {
            Entry<T> entry3 = entry.next;
            if (entry.key == j) {
                if (entry2 == null) {
                    this.table[i] = entry3;
                } else {
                    entry2.next = entry3;
                }
                this.size--;
                return entry.value;
            }
            entry2 = entry;
            entry = entry3;
        }
        return null;
    }

    public void reserveRoom(int i) {
        setCapacity((i * 5) / 3);
    }

    public void setCapacity(int i) {
        Entry<T>[] entryArr = new Entry[i];
        int length = this.table.length;
        for (int i2 = 0; i2 < length; i2++) {
            Entry<T> entry = this.table[i2];
            while (entry != null) {
                long j = entry.key;
                int i3 = ((((int) j) ^ ((int) (j >>> 32))) & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i;
                Entry<T> entry2 = entry.next;
                entry.next = entryArr[i3];
                entryArr[i3] = entry;
                entry = entry2;
            }
        }
        this.table = entryArr;
        this.capacity = i;
        this.threshold = (i * 4) / 3;
    }

    public int size() {
        return this.size;
    }

    public LongHashMap() {
        this(16);
    }
}
