package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class u4y0<K> implements Map.Entry<K, Object> {

    /* JADX INFO: renamed from: a */
    public Map.Entry<K, z4y0> f177566a;

    public u4y0(Map.Entry<K, z4y0> entry) {
        this.f177566a = entry;
    }

    /* JADX INFO: renamed from: a */
    public final z4y0 m194518a() {
        return this.f177566a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f177566a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f177566a.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof m9y0) {
            return this.f177566a.getValue().m184832b((m9y0) obj);
        }
        wg3.m206174a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        return null;
    }
}
