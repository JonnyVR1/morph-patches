package p153l;

import p137rx.C22421c;
import p137rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes3.dex */
public final class c460 {

    /* JADX INFO: renamed from: a */
    public static final Object f79673a = new Object();

    /* JADX INFO: renamed from: l.c460$b */
    public static class C16178b implements rcj<Object, Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rcj f79674a;

        public C16178b(rcj rcjVar) {
            this.f79674a = rcjVar;
        }

        @Override // p153l.rcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj, Object obj2) {
            Object obj3 = c460.f79673a;
            boolean z = obj == obj3;
            boolean z2 = obj2 == obj3;
            if (z && z2) {
                return Boolean.TRUE;
            }
            return (z || z2) ? Boolean.FALSE : (Boolean) this.f79674a.call(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> C22421c<Object> m107862a(C22421c<T> c22421c) {
        return C22421c.concat(c22421c.map(new C16177a()), C22421c.just(f79673a));
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22421c<Boolean> m107863b(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, rcj<? super T, ? super T, Boolean> rcjVar) {
        return C22421c.zip(m107862a(c22421c), m107862a(c22421c2), new C16178b(rcjVar)).all(UtilityFunctions.m222733b());
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.c460$a */
    public static class C16177a<T> implements qcj<T, Object> {
        @Override // p153l.qcj
        public Object call(T t) {
            return t;
        }
    }
}
