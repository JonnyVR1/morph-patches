package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class gsb<K, V> {

    /* JADX INFO: renamed from: a */
    public final x0l0<V> f106263a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap<K, V> f106264b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c */
    public int f106265c = 0;

    public gsb(x0l0<V> x0l0Var) {
        this.f106263a = x0l0Var;
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m132012a(K k) {
        return this.f106264b.containsKey(k);
    }

    /* JADX INFO: renamed from: b */
    public synchronized V m132013b(K k) {
        return this.f106264b.get(k);
    }

    /* JADX INFO: renamed from: c */
    public synchronized int m132014c() {
        return this.f106264b.size();
    }

    /* JADX INFO: renamed from: d */
    public synchronized K m132015d() {
        return this.f106264b.isEmpty() ? null : this.f106264b.keySet().iterator().next();
    }

    /* JADX INFO: renamed from: e */
    public synchronized ArrayList<Map.Entry<K, V>> m132016e(up80<K> up80Var) {
        ArrayList<Map.Entry<K, V>> arrayList;
        try {
            arrayList = new ArrayList<>(this.f106264b.entrySet().size());
            for (Map.Entry<K, V> entry : this.f106264b.entrySet()) {
                if (up80Var == null || up80Var.apply(entry.getKey())) {
                    arrayList.add(entry);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public synchronized int m132017f() {
        return this.f106265c;
    }

    /* JADX INFO: renamed from: g */
    public final int m132018g(V v2) {
        if (v2 == null) {
            return 0;
        }
        return this.f106263a.mo127073a(v2);
    }

    /* JADX INFO: renamed from: h */
    public synchronized V m132019h(K k, V v2) {
        V vRemove;
        vRemove = this.f106264b.remove(k);
        this.f106265c -= m132018g(vRemove);
        this.f106264b.put(k, v2);
        this.f106265c += m132018g(v2);
        return vRemove;
    }

    /* JADX INFO: renamed from: i */
    public synchronized V m132020i(K k) {
        V vRemove;
        vRemove = this.f106264b.remove(k);
        this.f106265c -= m132018g(vRemove);
        return vRemove;
    }

    /* JADX INFO: renamed from: j */
    public synchronized ArrayList<V> m132021j(up80<K> up80Var) {
        ArrayList<V> arrayList;
        try {
            arrayList = new ArrayList<>();
            Iterator<Map.Entry<K, V>> it = this.f106264b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (up80Var == null || up80Var.apply(next.getKey())) {
                    arrayList.add(next.getValue());
                    this.f106265c -= m132018g(next.getValue());
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m132022k() {
        if (this.f106264b.isEmpty()) {
            this.f106265c = 0;
        }
    }
}
