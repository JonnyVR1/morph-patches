package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ctw0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f83767a;

    public ctw0(Iterator it) {
        it.getClass();
        this.f83767a = it;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo13539a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f83767a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo13539a(this.f83767a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f83767a.remove();
    }
}
