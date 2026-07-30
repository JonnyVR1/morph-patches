package p003l;

import p014rx.Notification;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class v30<T> implements m250<T> {

    /* JADX INFO: renamed from: a */
    public final e30<Notification<? super T>> f8187a;

    public v30(e30<Notification<? super T>> e30Var) {
        this.f8187a = e30Var;
    }

    @Override // p003l.m250
    public void onCompleted() {
        this.f8187a.call(Notification.m9747a());
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        this.f8187a.call(Notification.m9748b(th));
    }

    @Override // p003l.m250
    public void onNext(T t) {
        this.f8187a.call(Notification.m9749c(t));
    }
}
