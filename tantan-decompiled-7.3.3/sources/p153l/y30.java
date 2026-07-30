package p153l;

/* JADX INFO: loaded from: classes3.dex */
public final class y30<T> extends gcg0<T> {

    /* JADX INFO: renamed from: e */
    public final y20<? super T> f197293e;

    /* JADX INFO: renamed from: f */
    public final y20<Throwable> f197294f;

    /* JADX INFO: renamed from: g */
    public final x20 f197295g;

    public y30(y20<? super T> y20Var, y20<Throwable> y20Var2, x20 x20Var) {
        this.f197293e = y20Var;
        this.f197294f = y20Var2;
        this.f197295g = x20Var;
    }

    @Override // p153l.bb50
    public void onCompleted() {
        this.f197295g.call();
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        this.f197294f.call(th);
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        this.f197293e.call(t);
    }
}
