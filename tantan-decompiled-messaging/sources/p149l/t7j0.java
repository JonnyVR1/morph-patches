package p149l;

import com.google.common.collect.Iterators;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class t7j0<F, T> extends s7j0<F, T> implements ListIterator<T> {
    public t7j0(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public final ListIterator<? extends F> m187467b() {
        return Iterators.m15874d(this.f162917a);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m187467b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m187467b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return mo15897a(m187467b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m187467b().previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
