package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class e40<T> extends z3g0<T> {

    /* JADX INFO: renamed from: e */
    public final e30<? super T> f3199e;

    /* JADX INFO: renamed from: f */
    public final e30<Throwable> f3200f;

    /* JADX INFO: renamed from: g */
    public final d30 f3201g;

    public e40(e30<? super T> e30Var, e30<Throwable> e30Var2, d30 d30Var) {
        this.f3199e = e30Var;
        this.f3200f = e30Var2;
        this.f3201g = d30Var;
    }

    @Override // p003l.m250
    public void onCompleted() {
        this.f3201g.call();
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        this.f3200f.call(th);
    }

    @Override // p003l.m250
    public void onNext(T t) {
        this.f3199e.call(t);
    }
}
