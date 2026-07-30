package p149l;

import p133rx.C22306c;
import p133rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes3.dex */
public final class wv50 {

    /* JADX INFO: renamed from: a */
    public static final Object f188215a = new Object();

    /* JADX INFO: renamed from: l.wv50$b */
    public static class C20972b implements x9j<Object, Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x9j f188216a;

        public C20972b(x9j x9jVar) {
            this.f188216a = x9jVar;
        }

        @Override // p149l.x9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj, Object obj2) {
            Object obj3 = wv50.f188215a;
            boolean z = obj == obj3;
            boolean z2 = obj2 == obj3;
            if (z && z2) {
                return Boolean.TRUE;
            }
            return (z || z2) ? Boolean.FALSE : (Boolean) this.f188216a.call(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> C22306c<Object> m205717a(C22306c<T> c22306c) {
        return C22306c.concat(c22306c.map(new C20971a()), C22306c.just(f188215a));
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22306c<Boolean> m205718b(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, x9j<? super T, ? super T, Boolean> x9jVar) {
        return C22306c.zip(m205717a(c22306c), m205717a(c22306c2), new C20972b(x9jVar)).all(UtilityFunctions.m221487b());
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.wv50$a */
    public static class C20971a<T> implements w9j<T, Object> {
        @Override // p149l.w9j
        public Object call(T t) {
            return t;
        }
    }
}
