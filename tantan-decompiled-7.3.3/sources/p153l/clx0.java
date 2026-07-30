package p153l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
public final class clx0 implements Iterator {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
