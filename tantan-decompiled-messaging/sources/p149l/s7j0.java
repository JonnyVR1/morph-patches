package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class s7j0<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a */
    public final Iterator<? extends F> f162917a;

    public s7j0(Iterator<? extends F> it) {
        this.f162917a = (Iterator) sf80.m183894p(it);
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo15897a(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f162917a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return mo15897a(this.f162917a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f162917a.remove();
    }
}
