package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class oig<K, V> extends iod0<K, V> {

    /* JADX INFO: renamed from: e */
    public final HashMap<K, iod0.C17585c<K, V>> f144113e = new HashMap<>();

    @Override // p149l.iod0
    @Nullable
    /* JADX INFO: renamed from: c */
    public iod0.C17585c<K, V> mo137320c(K k) {
        return this.f144113e.get(k);
    }

    public boolean contains(K k) {
        return this.f144113e.containsKey(k);
    }

    @Override // p149l.iod0
    /* JADX INFO: renamed from: i */
    public V mo137324i(@NonNull K k, @NonNull V v2) {
        iod0.C17585c<K, V> c17585cMo137320c = mo137320c(k);
        if (c17585cMo137320c != null) {
            return c17585cMo137320c.f114143b;
        }
        this.f144113e.put(k, m137323h(k, v2));
        return null;
    }

    @Override // p149l.iod0
    /* JADX INFO: renamed from: j */
    public V mo137325j(@NonNull K k) {
        V v2 = (V) super.mo137325j(k);
        this.f144113e.remove(k);
        return v2;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public Map.Entry<K, V> m164510l(K k) {
        if (contains(k)) {
            return this.f144113e.get(k).f114145d;
        }
        return null;
    }
}
