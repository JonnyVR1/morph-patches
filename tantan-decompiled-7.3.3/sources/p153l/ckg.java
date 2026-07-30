package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ckg<K, V> extends kwd0<K, V> {

    /* JADX INFO: renamed from: e */
    public final HashMap<K, kwd0.C18284c<K, V>> f82282e = new HashMap<>();

    @Override // p153l.kwd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public kwd0.C18284c<K, V> mo110333c(K k) {
        return this.f82282e.get(k);
    }

    public boolean contains(K k) {
        return this.f82282e.containsKey(k);
    }

    @Override // p153l.kwd0
    /* JADX INFO: renamed from: i */
    public V mo110334i(@NonNull K k, @NonNull V v2) {
        kwd0.C18284c<K, V> c18284cMo110333c = mo110333c(k);
        if (c18284cMo110333c != null) {
            return c18284cMo110333c.f129054b;
        }
        this.f82282e.put(k, m151693h(k, v2));
        return null;
    }

    @Override // p153l.kwd0
    /* JADX INFO: renamed from: j */
    public V mo110335j(@NonNull K k) {
        V v2 = (V) super.mo110335j(k);
        this.f82282e.remove(k);
        return v2;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public Map.Entry<K, V> m110336l(K k) {
        if (contains(k)) {
            return this.f82282e.get(k).f129056d;
        }
        return null;
    }
}
