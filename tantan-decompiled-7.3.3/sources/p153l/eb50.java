package p153l;

import p137rx.exceptions.OnErrorNotImplementedException;

/* JADX INFO: loaded from: classes3.dex */
public final class eb50 {

    /* JADX INFO: renamed from: a */
    public static final bb50<Object> f92832a = new C16747a();

    /* JADX INFO: renamed from: a */
    public static <T> bb50<T> m120156a() {
        return (bb50<T>) f92832a;
    }

    /* JADX INFO: renamed from: l.eb50$a */
    public static class C16747a implements bb50<Object> {
        @Override // p153l.bb50
        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }

        @Override // p153l.bb50
        public final void onCompleted() {
        }

        @Override // p153l.bb50
        public final void onNext(Object obj) {
        }
    }
}
