package p153l;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public interface hsb<K, V> extends mpy<K, V>, fqy {

    /* JADX INFO: renamed from: l.hsb$a */
    @VisibleForTesting
    public static class C17568a<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f111428a;

        /* JADX INFO: renamed from: b */
        public final fb5<V> f111429b;

        /* JADX INFO: renamed from: e */
        public final InterfaceC17569b<K> f111432e;

        /* JADX INFO: renamed from: g */
        public int f111434g;

        /* JADX INFO: renamed from: c */
        public int f111430c = 0;

        /* JADX INFO: renamed from: d */
        public boolean f111431d = false;

        /* JADX INFO: renamed from: f */
        public int f111433f = 0;

        public C17568a(K k, fb5<V> fb5Var, InterfaceC17569b<K> interfaceC17569b, int i) {
            this.f111428a = (K) wn80.m207182g(k);
            this.f111429b = (fb5) wn80.m207182g(fb5.m124872t(fb5Var));
            this.f111432e = interfaceC17569b;
            this.f111434g = i;
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: a */
        public static <K, V> C17568a<K, V> m136965a(K k, fb5<V> fb5Var, int i, InterfaceC17569b<K> interfaceC17569b) {
            return new C17568a<>(k, fb5Var, interfaceC17569b, i);
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: b */
        public static <K, V> C17568a<K, V> m136966b(K k, fb5<V> fb5Var, InterfaceC17569b<K> interfaceC17569b) {
            return m136965a(k, fb5Var, -1, interfaceC17569b);
        }
    }

    /* JADX INFO: renamed from: l.hsb$b */
    public interface InterfaceC17569b<K> {
        /* JADX INFO: renamed from: a */
        void mo136967a(K k, boolean z);
    }

    /* JADX INFO: renamed from: e */
    fb5<V> mo136963e(K k);

    /* JADX INFO: renamed from: f */
    fb5<V> mo136964f(K k, fb5<V> fb5Var, InterfaceC17569b<K> interfaceC17569b);
}
