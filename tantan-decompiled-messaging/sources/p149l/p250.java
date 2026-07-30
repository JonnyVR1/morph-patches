package p149l;

import p133rx.exceptions.OnErrorNotImplementedException;

/* JADX INFO: loaded from: classes3.dex */
public final class p250 {

    /* JADX INFO: renamed from: a */
    public static final m250<Object> f146802a = new C19110a();

    /* JADX INFO: renamed from: a */
    public static <T> m250<T> m167128a() {
        return (m250<T>) f146802a;
    }

    /* JADX INFO: renamed from: l.p250$a */
    public static class C19110a implements m250<Object> {
        @Override // p149l.m250
        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }

        @Override // p149l.m250
        public final void onCompleted() {
        }

        @Override // p149l.m250
        public final void onNext(Object obj) {
        }
    }
}
