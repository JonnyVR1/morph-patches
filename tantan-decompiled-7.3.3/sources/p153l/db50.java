package p153l;

/* JADX INFO: loaded from: classes3.dex */
public final class db50<T> extends gcg0<T> {

    /* JADX INFO: renamed from: e */
    public final bb50<? super T> f85965e;

    public db50(bb50<? super T> bb50Var) {
        this.f85965e = bb50Var;
    }

    @Override // p153l.bb50
    public void onCompleted() {
        this.f85965e.onCompleted();
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        this.f85965e.onError(th);
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        this.f85965e.onNext(t);
    }
}
