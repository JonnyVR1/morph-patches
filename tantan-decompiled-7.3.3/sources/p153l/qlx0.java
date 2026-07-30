package p153l;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes6.dex */
public final class qlx0 implements ListIterator {

    /* JADX INFO: renamed from: a */
    public final ListIterator f158277a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f158278b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ slx0 f158279c;

    public qlx0(slx0 slx0Var, int i) {
        this.f158278b = i;
        this.f158279c = slx0Var;
        this.f158277a = slx0Var.f169464a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f158277a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f158277a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f158277a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f158277a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f158277a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f158277a.previousIndex();
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
