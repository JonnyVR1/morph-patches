package p153l;

import p137rx.Notification;

/* JADX INFO: loaded from: classes3.dex */
public final class p30<T> implements bb50<T> {

    /* JADX INFO: renamed from: a */
    public final y20<Notification<? super T>> f150349a;

    public p30(y20<Notification<? super T>> y20Var) {
        this.f150349a = y20Var;
    }

    @Override // p153l.bb50
    public void onCompleted() {
        this.f150349a.call(Notification.m222536a());
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        this.f150349a.call(Notification.m222537b(th));
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        this.f150349a.call(Notification.m222538c(t));
    }
}
