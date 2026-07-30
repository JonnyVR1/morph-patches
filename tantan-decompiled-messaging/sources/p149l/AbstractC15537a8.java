package p149l;

/* JADX INFO: renamed from: l.a8 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC15537a8<T> extends dpj0<T> {

    /* JADX INFO: renamed from: a */
    public T f67967a;

    public AbstractC15537a8(T t) {
        this.f67967a = t;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo15539a(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67967a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.f67967a;
        if (t != null) {
            this.f67967a = mo15539a(t);
            return t;
        }
        lmr.m150601a();
        return null;
    }
}
