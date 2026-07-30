package p149l;

import p133rx.Notification;

/* JADX INFO: loaded from: classes3.dex */
public final class v30<T> implements m250<T> {

    /* JADX INFO: renamed from: a */
    public final e30<Notification<? super T>> f179616a;

    public v30(e30<Notification<? super T>> e30Var) {
        this.f179616a = e30Var;
    }

    @Override // p149l.m250
    public void onCompleted() {
        this.f179616a.call(Notification.m221290a());
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        this.f179616a.call(Notification.m221291b(th));
    }

    @Override // p149l.m250
    public void onNext(T t) {
        this.f179616a.call(Notification.m221292c(t));
    }
}
