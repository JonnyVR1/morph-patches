package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class o250<T> extends z3g0<T> {

    /* JADX INFO: renamed from: e */
    public final m250<? super T> f6025e;

    public o250(m250<? super T> m250Var) {
        this.f6025e = m250Var;
    }

    @Override // p003l.m250
    public void onCompleted() {
        this.f6025e.onCompleted();
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        this.f6025e.onError(th);
    }

    @Override // p003l.m250
    public void onNext(T t) {
        this.f6025e.onNext(t);
    }
}
