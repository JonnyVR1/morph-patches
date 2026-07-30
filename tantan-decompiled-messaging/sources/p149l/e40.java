package p149l;

/* JADX INFO: loaded from: classes3.dex */
public final class e40<T> extends z3g0<T> {

    /* JADX INFO: renamed from: e */
    public final e30<? super T> f89235e;

    /* JADX INFO: renamed from: f */
    public final e30<Throwable> f89236f;

    /* JADX INFO: renamed from: g */
    public final d30 f89237g;

    public e40(e30<? super T> e30Var, e30<Throwable> e30Var2, d30 d30Var) {
        this.f89235e = e30Var;
        this.f89236f = e30Var2;
        this.f89237g = d30Var;
    }

    @Override // p149l.m250
    public void onCompleted() {
        this.f89237g.call();
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        this.f89236f.call(th);
    }

    @Override // p149l.m250
    public void onNext(T t) {
        this.f89235e.call(t);
    }
}
