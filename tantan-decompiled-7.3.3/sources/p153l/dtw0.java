package p153l;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dtw0 extends ctw0 implements ListIterator {
    public dtw0(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f83767a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f83767a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo13539a(((ListIterator) this.f83767a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f83767a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
