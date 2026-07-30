package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class xgw<K, V> {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<K, V> f194247a;

    /* JADX INFO: renamed from: b */
    public int f194248b;

    /* JADX INFO: renamed from: c */
    public int f194249c;

    /* JADX INFO: renamed from: d */
    public int f194250d;

    /* JADX INFO: renamed from: e */
    public int f194251e;

    /* JADX INFO: renamed from: f */
    public int f194252f;

    /* JADX INFO: renamed from: g */
    public int f194253g;

    /* JADX INFO: renamed from: h */
    public int f194254h;

    public xgw(int i) {
        if (i <= 0) {
            wg3.m206174a("maxSize <= 0");
            throw null;
        }
        this.f194249c = i;
        this.f194247a = new LinkedHashMap<>(0, 0.75f, true);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public V mo173578a(@NonNull K k) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m210953c() {
        m210960j(-1);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final V m210954d(@NonNull K k) {
        V vPut;
        if (k == null) {
            mnd0.m159157a("key == null");
            return null;
        }
        synchronized (this) {
            try {
                V v2 = this.f194247a.get(k);
                if (v2 != null) {
                    this.f194253g++;
                    return v2;
                }
                this.f194254h++;
                V vMo173578a = mo173578a(k);
                if (vMo173578a == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f194251e++;
                        vPut = this.f194247a.put(k, vMo173578a);
                        if (vPut != null) {
                            this.f194247a.put(k, vPut);
                        } else {
                            this.f194248b += m210957g(k, vMo173578a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vPut != null) {
                    m210952b(false, k, vMo173578a, vPut);
                    return vPut;
                }
                m210960j(this.f194249c);
                return vMo173578a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final V m210955e(@NonNull K k, @NonNull V v2) {
        V vPut;
        if (k == null || v2 == null) {
            mnd0.m159157a("key == null || value == null");
            return null;
        }
        synchronized (this) {
            try {
                this.f194250d++;
                this.f194248b += m210957g(k, v2);
                vPut = this.f194247a.put(k, v2);
                if (vPut != null) {
                    this.f194248b -= m210957g(k, vPut);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            m210952b(false, k, vPut, v2);
        }
        m210960j(this.f194249c);
        return vPut;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final V m210956f(@NonNull K k) {
        V vRemove;
        if (k == null) {
            mnd0.m159157a("key == null");
            return null;
        }
        synchronized (this) {
            try {
                vRemove = this.f194247a.remove(k);
                if (vRemove != null) {
                    this.f194248b -= m210957g(k, vRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            m210952b(false, k, vRemove, null);
        }
        return vRemove;
    }

    /* JADX INFO: renamed from: g */
    public final int m210957g(K k, V v2) {
        int iM210958h = m210958h(k, v2);
        if (iM210958h >= 0) {
            return iM210958h;
        }
        krd0.m151025a("Negative size: ", k, "=", v2);
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int m210958h(@NonNull K k, @NonNull V v2) {
        return 1;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized Map<K, V> m210959i() {
        return new LinkedHashMap(this.f194247a);
    }

    /* JADX INFO: renamed from: j */
    public void m210960j(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f194248b < 0 || (this.f194247a.isEmpty() && this.f194248b != 0)) {
                        break;
                    }
                    if (this.f194248b > i && !this.f194247a.isEmpty()) {
                        Map.Entry<K, V> next = this.f194247a.entrySet().iterator().next();
                        key = next.getKey();
                        value = next.getValue();
                        this.f194247a.remove(key);
                        this.f194248b -= m210957g(key, value);
                        this.f194252f++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            m210952b(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        try {
            i = this.f194253g;
            i2 = this.f194254h + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f194249c), Integer.valueOf(this.f194253g), Integer.valueOf(this.f194254h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    /* JADX INFO: renamed from: b */
    public void m210952b(boolean z, @NonNull K k, @NonNull V v2, @Nullable V v3) {
    }
}
