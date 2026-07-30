package p149l;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes6.dex */
public final class kcx0 implements ListIterator {

    /* JADX INFO: renamed from: a */
    public final ListIterator f122517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f122518b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mcx0 f122519c;

    public kcx0(mcx0 mcx0Var, int i) {
        this.f122518b = i;
        this.f122519c = mcx0Var;
        this.f122517a = mcx0Var.f133192a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f122517a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f122517a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f122517a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f122517a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f122517a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f122517a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
