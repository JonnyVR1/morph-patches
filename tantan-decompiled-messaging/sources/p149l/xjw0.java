package p149l;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xjw0 extends wjw0 implements ListIterator {
    public xjw0(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f186689a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f186689a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo13485a(((ListIterator) this.f186689a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f186689a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
