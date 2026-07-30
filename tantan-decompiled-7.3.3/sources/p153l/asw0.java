package p153l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class asw0 extends vsw0 {

    /* JADX INFO: renamed from: a */
    public final Map f73185a;

    public asw0(Map map) {
        map.getClass();
        this.f73185a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f73185a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f73185a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f73185a.size();
    }
}
