package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class lcx0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f127479a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mcx0 f127480b;

    public lcx0(mcx0 mcx0Var) {
        this.f127480b = mcx0Var;
        this.f127479a = mcx0Var.f133192a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f127479a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f127479a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
