package p149l;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public interface tqb<K, V> extends pgy<K, V>, ihy {

    /* JADX INFO: renamed from: l.tqb$a */
    @VisibleForTesting
    public static class C20244a<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f171563a;

        /* JADX INFO: renamed from: b */
        public final fa5<V> f171564b;

        /* JADX INFO: renamed from: e */
        public final InterfaceC20245b<K> f171567e;

        /* JADX INFO: renamed from: g */
        public int f171569g;

        /* JADX INFO: renamed from: c */
        public int f171565c = 0;

        /* JADX INFO: renamed from: d */
        public boolean f171566d = false;

        /* JADX INFO: renamed from: f */
        public int f171568f = 0;

        public C20244a(K k, fa5<V> fa5Var, InterfaceC20245b<K> interfaceC20245b, int i) {
            this.f171563a = (K) rf80.m179116g(k);
            this.f171564b = (fa5) rf80.m179116g(fa5.m120152t(fa5Var));
            this.f171567e = interfaceC20245b;
            this.f171569g = i;
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: a */
        public static <K, V> C20244a<K, V> m190087a(K k, fa5<V> fa5Var, int i, InterfaceC20245b<K> interfaceC20245b) {
            return new C20244a<>(k, fa5Var, interfaceC20245b, i);
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: b */
        public static <K, V> C20244a<K, V> m190088b(K k, fa5<V> fa5Var, InterfaceC20245b<K> interfaceC20245b) {
            return m190087a(k, fa5Var, -1, interfaceC20245b);
        }
    }

    /* JADX INFO: renamed from: l.tqb$b */
    public interface InterfaceC20245b<K> {
        /* JADX INFO: renamed from: a */
        void mo155851a(K k, boolean z);
    }

    /* JADX INFO: renamed from: e */
    fa5<V> mo101595e(K k);

    /* JADX INFO: renamed from: f */
    fa5<V> mo101596f(K k, fa5<V> fa5Var, InterfaceC20245b<K> interfaceC20245b);
}
