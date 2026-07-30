package p003l;

import p014rx.exceptions.OnErrorNotImplementedException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class p250 {

    /* JADX INFO: renamed from: a */
    public static final m250<Object> f6306a = new C0465a();

    /* JADX INFO: renamed from: a */
    public static <T> m250<T> m6790a() {
        return (m250<T>) f6306a;
    }

    /* JADX INFO: renamed from: l.p250$a */
    public static class C0465a implements m250<Object> {
        @Override // p003l.m250
        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }

        @Override // p003l.m250
        public final void onCompleted() {
        }

        @Override // p003l.m250
        public final void onNext(Object obj) {
        }
    }
}
