package p149l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class dwx0<K> implements Iterator<Map.Entry<K, Object>> {

    /* JADX INFO: renamed from: a */
    public Iterator<Map.Entry<K, Object>> f88223a;

    public dwx0(Iterator<Map.Entry<K, Object>> it) {
        this.f88223a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f88223a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f88223a.next();
        return next.getValue() instanceof tvx0 ? new ovx0(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f88223a.remove();
    }
}
