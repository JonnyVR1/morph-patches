package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class yzi<K, V> extends a0j implements Map.Entry<K, V> {
    /* JADX INFO: renamed from: a */
    public abstract Map.Entry<K, V> mo15564a();

    public boolean equals(Object obj) {
        return mo15564a().equals(obj);
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return mo15564a().getKey();
    }

    public V getValue() {
        return mo15564a().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return mo15564a().hashCode();
    }

    public V setValue(V v2) {
        return mo15564a().setValue(v2);
    }

    public boolean standardEquals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (v050.m196470a(getKey(), entry.getKey()) && v050.m196470a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }
}
