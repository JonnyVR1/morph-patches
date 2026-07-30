package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class vie0<T> extends z3g0<T> {

    /* JADX INFO: renamed from: e */
    public final m250<T> f8340e;

    public vie0(z3g0<? super T> z3g0Var, boolean z) {
        super(z3g0Var, z);
        this.f8340e = new tie0(z3g0Var);
    }

    @Override // p003l.m250
    public void onCompleted() {
        this.f8340e.onCompleted();
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        this.f8340e.onError(th);
    }

    @Override // p003l.m250
    public void onNext(T t) {
        this.f8340e.onNext(t);
    }

    public vie0(z3g0<? super T> z3g0Var) {
        this(z3g0Var, true);
    }
}
