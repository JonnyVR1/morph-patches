package p149l;

/* JADX INFO: loaded from: classes3.dex */
public final class o250<T> extends z3g0<T> {

    /* JADX INFO: renamed from: e */
    public final m250<? super T> f141507e;

    public o250(m250<? super T> m250Var) {
        this.f141507e = m250Var;
    }

    @Override // p149l.m250
    public void onCompleted() {
        this.f141507e.onCompleted();
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        this.f141507e.onError(th);
    }

    @Override // p149l.m250
    public void onNext(T t) {
        this.f141507e.onNext(t);
    }
}
