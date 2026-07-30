package p003l;

import p014rx.C1099c;
import p014rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class wv50 {

    /* JADX INFO: renamed from: a */
    public static final Object f8625a = new Object();

    /* JADX INFO: renamed from: l.wv50$b */
    public static class C0620b implements x9j<Object, Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x9j f8626a;

        public C0620b(x9j x9jVar) {
            this.f8626a = x9jVar;
        }

        @Override // p003l.x9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj, Object obj2) {
            Object obj3 = wv50.f8625a;
            boolean z = obj == obj3;
            boolean z2 = obj2 == obj3;
            if (z && z2) {
                return Boolean.TRUE;
            }
            return (z || z2) ? Boolean.FALSE : (Boolean) this.f8626a.call(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> C1099c<Object> m8584a(C1099c<T> c1099c) {
        return C1099c.concat(c1099c.map(new C0619a()), C1099c.just(f8625a));
    }

    /* JADX INFO: renamed from: b */
    public static <T> C1099c<Boolean> m8585b(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, x9j<? super T, ? super T, Boolean> x9jVar) {
        return C1099c.zip(m8584a(c1099c), m8584a(c1099c2), new C0620b(x9jVar)).all(UtilityFunctions.m9944b());
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.wv50$a */
    public static class C0619a<T> implements w9j<T, Object> {
        @Override // p003l.w9j
        public Object call(T t) {
            return t;
        }
    }
}
