package p153l;

import com.google.common.collect.Iterators;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xgj0<F, T> extends wgj0<F, T> implements ListIterator<T> {
    public xgj0(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public final ListIterator<? extends F> m210899b() {
        return Iterators.m15928d(this.f188981a);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m210899b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m210899b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return mo15951a(m210899b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m210899b().previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
