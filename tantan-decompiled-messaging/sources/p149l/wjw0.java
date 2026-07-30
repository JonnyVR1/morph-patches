package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wjw0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f186689a;

    public wjw0(Iterator it) {
        it.getClass();
        this.f186689a = it;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo13485a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f186689a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo13485a(this.f186689a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f186689a.remove();
    }
}
