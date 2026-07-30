package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class hsx0 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Map.Entry f111490a;

    /* JADX INFO: renamed from: a */
    public final tsx0 m137055a() {
        return (tsx0) this.f111490a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f111490a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((tsx0) this.f111490a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof yvx0) {
            return ((tsx0) this.f111490a.getValue()).m14841c((yvx0) obj);
        }
        wg3.m206174a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        return null;
    }
}
