package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class wgj0<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a */
    public final Iterator<? extends F> f188981a;

    public wgj0(Iterator<? extends F> it) {
        this.f188981a = (Iterator) xn80.m212111p(it);
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo15951a(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f188981a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return mo15951a(this.f188981a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f188981a.remove();
    }
}
