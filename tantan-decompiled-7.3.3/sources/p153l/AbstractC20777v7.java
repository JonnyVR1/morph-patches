package p153l;

/* JADX INFO: renamed from: l.v7 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC20777v7<T> extends gyj0<T> {

    /* JADX INFO: renamed from: a */
    public T f182712a;

    public AbstractC20777v7(T t) {
        this.f182712a = t;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo15593a(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f182712a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.f182712a;
        if (t != null) {
            this.f182712a = mo15593a(t);
            return t;
        }
        mor.m159308a();
        return null;
    }
}
