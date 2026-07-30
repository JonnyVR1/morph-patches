package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class sqb<K, V> {

    /* JADX INFO: renamed from: a */
    public final rrk0<V> f165949a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap<K, V> f165950b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c */
    public int f165951c = 0;

    public sqb(rrk0<V> rrk0Var) {
        this.f165949a = rrk0Var;
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m185478a(K k) {
        return this.f165950b.containsKey(k);
    }

    /* JADX INFO: renamed from: b */
    public synchronized V m185479b(K k) {
        return this.f165950b.get(k);
    }

    /* JADX INFO: renamed from: c */
    public synchronized int m185480c() {
        return this.f165950b.size();
    }

    /* JADX INFO: renamed from: d */
    public synchronized K m185481d() {
        return this.f165950b.isEmpty() ? null : this.f165950b.keySet().iterator().next();
    }

    /* JADX INFO: renamed from: e */
    public synchronized ArrayList<Map.Entry<K, V>> m185482e(ph80<K> ph80Var) {
        ArrayList<Map.Entry<K, V>> arrayList;
        try {
            arrayList = new ArrayList<>(this.f165950b.entrySet().size());
            for (Map.Entry<K, V> entry : this.f165950b.entrySet()) {
                if (ph80Var == null || ph80Var.apply(entry.getKey())) {
                    arrayList.add(entry);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public synchronized int m185483f() {
        return this.f165951c;
    }

    /* JADX INFO: renamed from: g */
    public final int m185484g(V v2) {
        if (v2 == null) {
            return 0;
        }
        return this.f165949a.mo101613a(v2);
    }

    /* JADX INFO: renamed from: h */
    public synchronized V m185485h(K k, V v2) {
        V vRemove;
        vRemove = this.f165950b.remove(k);
        this.f165951c -= m185484g(vRemove);
        this.f165950b.put(k, v2);
        this.f165951c += m185484g(v2);
        return vRemove;
    }

    /* JADX INFO: renamed from: i */
    public synchronized V m185486i(K k) {
        V vRemove;
        vRemove = this.f165950b.remove(k);
        this.f165951c -= m185484g(vRemove);
        return vRemove;
    }

    /* JADX INFO: renamed from: j */
    public synchronized ArrayList<V> m185487j(ph80<K> ph80Var) {
        ArrayList<V> arrayList;
        try {
            arrayList = new ArrayList<>();
            Iterator<Map.Entry<K, V>> it = this.f165950b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (ph80Var == null || ph80Var.apply(next.getKey())) {
                    arrayList.add(next.getValue());
                    this.f165951c -= m185484g(next.getValue());
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m185488k() {
        if (this.f165950b.isEmpty()) {
            this.f165951c = 0;
        }
    }
}
