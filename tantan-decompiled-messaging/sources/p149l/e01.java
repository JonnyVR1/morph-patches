package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class e01<K, V> extends hgf0<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: h */
    @Nullable
    ztw<K, V> f88531h;

    /* JADX INFO: renamed from: l.e01$a */
    public class C16510a extends ztw<K, V> {
        public C16510a() {
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: a */
        public void mo114144a() {
            e01.this.clear();
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: b */
        public Object mo114145b(int i, int i2) {
            return e01.this.f107596b[(i << 1) + i2];
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: c */
        public Map<K, V> mo114146c() {
            return e01.this;
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: d */
        public int mo114147d() {
            return e01.this.f107597c;
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: e */
        public int mo114148e(Object obj) {
            return e01.this.m130820f(obj);
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: f */
        public int mo114149f(Object obj) {
            return e01.this.m130822h(obj);
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: g */
        public void mo114150g(K k, V v2) {
            e01.this.put(k, v2);
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: h */
        public void mo114151h(int i) {
            e01.this.mo130825k(i);
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: i */
        public V mo114152i(int i, V v2) {
            return e01.this.mo130826l(i, v2);
        }
    }

    public e01() {
    }

    /* JADX INFO: renamed from: n */
    private ztw<K, V> m114142n() {
        if (this.f88531h == null) {
            this.f88531h = new C16510a();
        }
        return this.f88531h;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m114142n().m220147l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m114142n().m220148m();
    }

    /* JADX INFO: renamed from: o */
    public boolean m114143o(@NonNull Collection<?> collection) {
        return ztw.m220146p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m130818c(this.f107597c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m114142n().m220149n();
    }

    public e01(int i) {
        super(i);
    }

    public e01(hgf0 hgf0Var) {
        super(hgf0Var);
    }
}
