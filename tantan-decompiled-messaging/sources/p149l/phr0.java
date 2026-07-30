package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class phr0 implements Iterator<ymr0> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterator f149041a;

    public phr0(Iterator it) {
        this.f149041a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f149041a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ ymr0 next() {
        return new ppr0((String) this.f149041a.next());
    }
}
