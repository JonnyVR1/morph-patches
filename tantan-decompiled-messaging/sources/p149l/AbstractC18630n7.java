package p149l;

/* JADX INFO: renamed from: l.n7 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18630n7<E> extends fpj0<E> {

    /* JADX INFO: renamed from: a */
    public final int f137471a;

    /* JADX INFO: renamed from: b */
    public int f137472b;

    public AbstractC18630n7(int i, int i2) {
        sf80.m183897s(i2, i);
        this.f137471a = i;
        this.f137472b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract E mo15608a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f137472b < this.f137471a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f137472b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f137472b;
        this.f137472b = i + 1;
        return mo15608a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f137472b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f137472b - 1;
        this.f137472b = i;
        return mo15608a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f137472b - 1;
    }

    public AbstractC18630n7(int i) {
        this(i, 0);
    }
}
