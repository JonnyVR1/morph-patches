package p153l;

/* JADX INFO: renamed from: l.i7 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC17659i7<E> extends iyj0<E> {

    /* JADX INFO: renamed from: a */
    public final int f113210a;

    /* JADX INFO: renamed from: b */
    public int f113211b;

    public AbstractC17659i7(int i, int i2) {
        xn80.m212114s(i2, i);
        this.f113210a = i;
        this.f113211b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract E mo15662a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f113211b < this.f113210a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f113211b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        int i = this.f113211b;
        this.f113211b = i + 1;
        return mo15662a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f113211b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            mor.m159308a();
            return null;
        }
        int i = this.f113211b - 1;
        this.f113211b = i;
        return mo15662a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f113211b - 1;
    }

    public AbstractC17659i7(int i) {
        this(i, 0);
    }
}
