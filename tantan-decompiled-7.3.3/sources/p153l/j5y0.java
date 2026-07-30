package p153l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class j5y0<K> implements Iterator<Map.Entry<K, Object>> {

    /* JADX INFO: renamed from: a */
    public Iterator<Map.Entry<K, Object>> f118508a;

    public j5y0(Iterator<Map.Entry<K, Object>> it) {
        this.f118508a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f118508a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f118508a.next();
        return next.getValue() instanceof z4y0 ? new u4y0(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f118508a.remove();
    }
}
