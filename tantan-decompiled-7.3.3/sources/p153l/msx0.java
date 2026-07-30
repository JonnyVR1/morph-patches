package p153l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class msx0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f138529a;

    public msx0(Iterator it) {
        this.f138529a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f138529a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f138529a.next();
        return entry.getValue() instanceof tsx0 ? new hsx0(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f138529a.remove();
    }
}
