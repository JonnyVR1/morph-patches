package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class t2j<K, V> extends v2j implements Map.Entry<K, V> {
    /* JADX INFO: renamed from: a */
    public abstract Map.Entry<K, V> mo15618a();

    public boolean equals(Object obj) {
        return mo15618a().equals(obj);
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return mo15618a().getKey();
    }

    public V getValue() {
        return mo15618a().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return mo15618a().hashCode();
    }

    public V setValue(V v2) {
        return mo15618a().setValue(v2);
    }

    public boolean standardEquals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (k950.m148863a(getKey(), entry.getKey()) && k950.m148863a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }
}
