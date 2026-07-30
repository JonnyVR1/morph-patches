package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class rlx0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f163810a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ slx0 f163811b;

    public rlx0(slx0 slx0Var) {
        this.f163811b = slx0Var;
        this.f163810a = slx0Var.f169464a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f163810a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f163810a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
