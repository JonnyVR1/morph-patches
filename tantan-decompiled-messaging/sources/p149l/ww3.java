package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class ww3<K, V> {

    /* JADX INFO: renamed from: a */
    public hgf0<K, WeakReference<V>> f188323a;

    @Nullable
    /* JADX INFO: renamed from: a */
    public V m205840a(K k) {
        WeakReference<V> weakReference;
        synchronized (this) {
            try {
                hgf0<K, WeakReference<V>> hgf0VarM205841b = m205841b(false);
                if (hgf0VarM205841b == null || (weakReference = hgf0VarM205841b.get(k)) == null) {
                    return null;
                }
                return weakReference.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final hgf0<K, WeakReference<V>> m205841b(boolean z) {
        if (this.f188323a == null && z) {
            this.f188323a = new hgf0<>(1);
        }
        return this.f188323a;
    }

    /* JADX INFO: renamed from: c */
    public void m205842c(K k, @NonNull V v2) {
        if (v2 == null) {
            return;
        }
        synchronized (this) {
            try {
                hgf0<K, WeakReference<V>> hgf0VarM205841b = m205841b(true);
                if (hgf0VarM205841b != null) {
                    hgf0VarM205841b.put(k, new WeakReference<>(v2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
