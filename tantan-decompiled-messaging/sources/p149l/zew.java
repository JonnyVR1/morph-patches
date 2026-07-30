package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class zew<K, V> {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<K, V> f202864a;

    /* JADX INFO: renamed from: b */
    public int f202865b;

    /* JADX INFO: renamed from: c */
    public int f202866c;

    /* JADX INFO: renamed from: d */
    public int f202867d;

    /* JADX INFO: renamed from: e */
    public int f202868e;

    /* JADX INFO: renamed from: f */
    public int f202869f;

    /* JADX INFO: renamed from: g */
    public int f202870g;

    /* JADX INFO: renamed from: h */
    public int f202871h;

    public zew(int i) {
        if (i <= 0) {
            ig3.m135964a("maxSize <= 0");
            throw null;
        }
        this.f202866c = i;
        this.f202864a = new LinkedHashMap<>(0, 0.75f, true);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public V mo141716a(@NonNull K k) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m218419c() {
        m218426j(-1);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final V m218420d(@NonNull K k) {
        V vPut;
        if (k == null) {
            jfd0.m141176a("key == null");
            return null;
        }
        synchronized (this) {
            try {
                V v2 = this.f202864a.get(k);
                if (v2 != null) {
                    this.f202870g++;
                    return v2;
                }
                this.f202871h++;
                V vMo141716a = mo141716a(k);
                if (vMo141716a == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f202868e++;
                        vPut = this.f202864a.put(k, vMo141716a);
                        if (vPut != null) {
                            this.f202864a.put(k, vPut);
                        } else {
                            this.f202865b += m218423g(k, vMo141716a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vPut != null) {
                    m218418b(false, k, vMo141716a, vPut);
                    return vPut;
                }
                m218426j(this.f202866c);
                return vMo141716a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final V m218421e(@NonNull K k, @NonNull V v2) {
        V vPut;
        if (k == null || v2 == null) {
            jfd0.m141176a("key == null || value == null");
            return null;
        }
        synchronized (this) {
            try {
                this.f202867d++;
                this.f202865b += m218423g(k, v2);
                vPut = this.f202864a.put(k, v2);
                if (vPut != null) {
                    this.f202865b -= m218423g(k, vPut);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            m218418b(false, k, vPut, v2);
        }
        m218426j(this.f202866c);
        return vPut;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final V m218422f(@NonNull K k) {
        V vRemove;
        if (k == null) {
            jfd0.m141176a("key == null");
            return null;
        }
        synchronized (this) {
            try {
                vRemove = this.f202864a.remove(k);
                if (vRemove != null) {
                    this.f202865b -= m218423g(k, vRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            m218418b(false, k, vRemove, null);
        }
        return vRemove;
    }

    /* JADX INFO: renamed from: g */
    public final int m218423g(K k, V v2) {
        int iM218424h = m218424h(k, v2);
        if (iM218424h >= 0) {
            return iM218424h;
        }
        hjd0.m131368a("Negative size: ", k, "=", v2);
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int m218424h(@NonNull K k, @NonNull V v2) {
        return 1;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized Map<K, V> m218425i() {
        return new LinkedHashMap(this.f202864a);
    }

    /* JADX INFO: renamed from: j */
    public void m218426j(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f202865b < 0 || (this.f202864a.isEmpty() && this.f202865b != 0)) {
                        break;
                    }
                    if (this.f202865b > i && !this.f202864a.isEmpty()) {
                        Map.Entry<K, V> next = this.f202864a.entrySet().iterator().next();
                        key = next.getKey();
                        value = next.getValue();
                        this.f202864a.remove(key);
                        this.f202865b -= m218423g(key, value);
                        this.f202869f++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            m218418b(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        try {
            i = this.f202870g;
            i2 = this.f202871h + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f202866c), Integer.valueOf(this.f202870g), Integer.valueOf(this.f202871h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    /* JADX INFO: renamed from: b */
    public void m218418b(boolean z, @NonNull K k, @NonNull V v2, @Nullable V v3) {
    }
}
