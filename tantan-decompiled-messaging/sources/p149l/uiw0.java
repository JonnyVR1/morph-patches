package p149l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class uiw0 extends pjw0 {

    /* JADX INFO: renamed from: a */
    public final Map f176698a;

    public uiw0(Map map) {
        map.getClass();
        this.f176698a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f176698a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f176698a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f176698a.size();
    }
}
