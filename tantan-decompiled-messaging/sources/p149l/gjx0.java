package p149l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class gjx0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f103110a;

    public gjx0(Iterator it) {
        this.f103110a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f103110a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f103110a.next();
        return entry.getValue() instanceof njx0 ? new bjx0(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f103110a.remove();
    }
}
