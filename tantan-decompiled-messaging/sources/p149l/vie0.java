package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class vie0<T> extends z3g0<T> {

    /* JADX INFO: renamed from: e */
    public final m250<T> f181603e;

    public vie0(z3g0<? super T> z3g0Var, boolean z) {
        super(z3g0Var, z);
        this.f181603e = new tie0(z3g0Var);
    }

    @Override // p149l.m250
    public void onCompleted() {
        this.f181603e.onCompleted();
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        this.f181603e.onError(th);
    }

    @Override // p149l.m250
    public void onNext(T t) {
        this.f181603e.onNext(t);
    }

    public vie0(z3g0<? super T> z3g0Var) {
        this(z3g0Var, true);
    }
}
