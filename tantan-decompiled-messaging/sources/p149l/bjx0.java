package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bjx0 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Map.Entry f75950a;

    /* JADX INFO: renamed from: a */
    public final njx0 m102243a() {
        return (njx0) this.f75950a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f75950a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((njx0) this.f75950a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof smx0) {
            return ((njx0) this.f75950a.getValue()).m14787c((smx0) obj);
        }
        ig3.m135964a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        return null;
    }
}
