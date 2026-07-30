package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ovx0<K> implements Map.Entry<K, Object> {

    /* JADX INFO: renamed from: a */
    public Map.Entry<K, tvx0> f145892a;

    public ovx0(Map.Entry<K, tvx0> entry) {
        this.f145892a = entry;
    }

    /* JADX INFO: renamed from: a */
    public final tvx0 m166210a() {
        return this.f145892a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f145892a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f145892a.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof g0y0) {
            return this.f145892a.getValue().m156777b((g0y0) obj);
        }
        ig3.m135964a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        return null;
    }
}
