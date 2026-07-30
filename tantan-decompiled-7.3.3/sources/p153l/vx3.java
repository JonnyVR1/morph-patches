package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class vx3<K, V> {

    /* JADX INFO: renamed from: a */
    public oof0<K, WeakReference<V>> f186228a;

    @Nullable
    /* JADX INFO: renamed from: a */
    public V m203831a(K k) {
        WeakReference<V> weakReference;
        synchronized (this) {
            try {
                oof0<K, WeakReference<V>> oof0VarM203832b = m203832b(false);
                if (oof0VarM203832b == null || (weakReference = oof0VarM203832b.get(k)) == null) {
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
    public final oof0<K, WeakReference<V>> m203832b(boolean z) {
        if (this.f186228a == null && z) {
            this.f186228a = new oof0<>(1);
        }
        return this.f186228a;
    }

    /* JADX INFO: renamed from: c */
    public void m203833c(K k, @NonNull V v2) {
        if (v2 == null) {
            return;
        }
        synchronized (this) {
            try {
                oof0<K, WeakReference<V>> oof0VarM203832b = m203832b(true);
                if (oof0VarM203832b != null) {
                    oof0VarM203832b.put(k, new WeakReference<>(v2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
