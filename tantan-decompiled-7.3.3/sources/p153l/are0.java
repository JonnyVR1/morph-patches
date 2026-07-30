package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class are0<T> extends gcg0<T> {

    /* JADX INFO: renamed from: e */
    public final bb50<T> f72932e;

    public are0(gcg0<? super T> gcg0Var, boolean z) {
        super(gcg0Var, z);
        this.f72932e = new yqe0(gcg0Var);
    }

    @Override // p153l.bb50
    public void onCompleted() {
        this.f72932e.onCompleted();
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        this.f72932e.onError(th);
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        this.f72932e.onNext(t);
    }

    public are0(gcg0<? super T> gcg0Var) {
        this(gcg0Var, true);
    }
}
