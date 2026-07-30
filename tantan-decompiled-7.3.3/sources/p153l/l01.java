package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class l01<K, V> extends oof0<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: h */
    @Nullable
    yww<K, V> f129484h;

    /* JADX INFO: renamed from: l.l01$a */
    public class C18319a extends yww<K, V> {
        public C18319a() {
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: a */
        public void mo152244a() {
            l01.this.clear();
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: b */
        public Object mo152245b(int i, int i2) {
            return l01.this.f148358b[(i << 1) + i2];
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: c */
        public Map<K, V> mo152246c() {
            return l01.this;
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: d */
        public int mo152247d() {
            return l01.this.f148359c;
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: e */
        public int mo152248e(Object obj) {
            return l01.this.m168579f(obj);
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: f */
        public int mo152249f(Object obj) {
            return l01.this.m168581h(obj);
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: g */
        public void mo152250g(K k, V v2) {
            l01.this.put(k, v2);
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: h */
        public void mo152251h(int i) {
            l01.this.mo147463k(i);
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: i */
        public V mo152252i(int i, V v2) {
            return l01.this.mo147464l(i, v2);
        }
    }

    public l01() {
    }

    /* JADX INFO: renamed from: n */
    private yww<K, V> m152242n() {
        if (this.f129484h == null) {
            this.f129484h = new C18319a();
        }
        return this.f129484h;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m152242n().m217658l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m152242n().m217659m();
    }

    /* JADX INFO: renamed from: o */
    public boolean m152243o(@NonNull Collection<?> collection) {
        return yww.m217657p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m168577c(this.f148359c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m152242n().m217660n();
    }

    public l01(int i) {
        super(i);
    }

    public l01(oof0 oof0Var) {
        super(oof0Var);
    }
}
