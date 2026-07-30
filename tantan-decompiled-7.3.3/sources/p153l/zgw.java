package p153l;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class zgw<K, V> implements hsb<K, V>, mpy<K, V> {

    /* JADX INFO: renamed from: a */
    public final hsb.InterfaceC17569b<K> f204346a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final gsb<K, hsb.C17568a<K, V>> f204347b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public final gsb<K, hsb.C17568a<K, V>> f204348c;

    /* JADX INFO: renamed from: e */
    public final x0l0<V> f204350e;

    /* JADX INFO: renamed from: f */
    public final mpy.InterfaceC18667a f204351f;

    /* JADX INFO: renamed from: g */
    public final a7h0<npy> f204352g;

    /* JADX INFO: renamed from: h */
    public npy f204353h;

    /* JADX INFO: renamed from: j */
    public final boolean f204355j;

    /* JADX INFO: renamed from: k */
    public final boolean f204356k;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final Map<Bitmap, Object> f204349d = new WeakHashMap();

    /* JADX INFO: renamed from: i */
    public long f204354i = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: l.zgw$a */
    public class C21805a implements x0l0<hsb.C17568a<K, V>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x0l0 f204357a;

        public C21805a(x0l0 x0l0Var) {
            this.f204357a = x0l0Var;
        }

        @Override // p153l.x0l0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo127073a(hsb.C17568a<K, V> c17568a) {
            return zgw.this.f204355j ? c17568a.f111434g : this.f204357a.mo127073a(c17568a.f111429b.m124875B());
        }
    }

    /* JADX INFO: renamed from: l.zgw$b */
    public class C21806b implements w4d0<V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ hsb.C17568a f204359a;

        public C21806b(hsb.C17568a c17568a) {
            this.f204359a = c17568a;
        }

        @Override // p153l.w4d0
        public void release(V v2) {
            zgw.this.m219674y(this.f204359a);
        }
    }

    public zgw(x0l0<V> x0l0Var, mpy.InterfaceC18667a interfaceC18667a, a7h0<npy> a7h0Var, hsb.InterfaceC17569b<K> interfaceC17569b, boolean z, boolean z2) {
        this.f204350e = x0l0Var;
        this.f204347b = new gsb<>(m219659A(x0l0Var));
        this.f204348c = new gsb<>(m219659A(x0l0Var));
        this.f204351f = interfaceC18667a;
        this.f204352g = a7h0Var;
        this.f204353h = (npy) wn80.m207183h(a7h0Var.get(), "mMemoryCacheParamsSupplier returned null");
        this.f204346a = interfaceC17569b;
        this.f204355j = z;
        this.f204356k = z2;
    }

    /* JADX INFO: renamed from: s */
    public static <K, V> void m219657s(hsb.C17568a<K, V> c17568a) {
        hsb.InterfaceC17569b<K> interfaceC17569b;
        if (c17568a == null || (interfaceC17569b = c17568a.f111432e) == null) {
            return;
        }
        interfaceC17569b.mo136967a(c17568a.f111428a, true);
    }

    /* JADX INFO: renamed from: u */
    public static <K, V> void m219658u(hsb.C17568a<K, V> c17568a) {
        hsb.InterfaceC17569b<K> interfaceC17569b;
        if (c17568a == null || (interfaceC17569b = c17568a.f111432e) == null) {
            return;
        }
        interfaceC17569b.mo136967a(c17568a.f111428a, false);
    }

    /* JADX INFO: renamed from: A */
    public final x0l0<hsb.C17568a<K, V>> m219659A(x0l0<V> x0l0Var) {
        return new C21805a(x0l0Var);
    }

    @Override // p153l.mpy
    /* JADX INFO: renamed from: a */
    public void mo137755a(K k) {
        wn80.m207182g(k);
        synchronized (this) {
            try {
                hsb.C17568a<K, V> c17568aM132020i = this.f204347b.m132020i(k);
                if (c17568aM132020i != null) {
                    this.f204347b.m132019h(k, c17568aM132020i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.mpy
    /* JADX INFO: renamed from: b */
    public fb5<V> mo137756b(K k, fb5<V> fb5Var) {
        return mo136964f(k, fb5Var, this.f204346a);
    }

    @Override // p153l.mpy
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo137757c(up80<K> up80Var) {
        return !this.f204348c.m132016e(up80Var).isEmpty();
    }

    @Override // p153l.mpy
    public synchronized boolean contains(K k) {
        return this.f204348c.m132012a(k);
    }

    @Override // p153l.mpy
    /* JADX INFO: renamed from: d */
    public int mo137758d(up80<K> up80Var) {
        ArrayList<hsb.C17568a<K, V>> arrayListM132021j;
        ArrayList<hsb.C17568a<K, V>> arrayListM132021j2;
        synchronized (this) {
            arrayListM132021j = this.f204347b.m132021j(up80Var);
            arrayListM132021j2 = this.f204348c.m132021j(up80Var);
            m219666o(arrayListM132021j2);
        }
        m219668q(arrayListM132021j2);
        m219670t(arrayListM132021j);
        m219671v();
        m219669r();
        return arrayListM132021j2.size();
    }

    @Override // p153l.hsb
    /* JADX INFO: renamed from: e */
    public fb5<V> mo136963e(K k) {
        hsb.C17568a<K, V> c17568aM132020i;
        boolean z;
        fb5<V> fb5Var;
        wn80.m207182g(k);
        synchronized (this) {
            try {
                c17568aM132020i = this.f204347b.m132020i(k);
                z = false;
                if (c17568aM132020i != null) {
                    hsb.C17568a<K, V> c17568aM132020i2 = this.f204348c.m132020i(k);
                    wn80.m207182g(c17568aM132020i2);
                    wn80.m207184i(c17568aM132020i2.f111430c == 0);
                    fb5Var = c17568aM132020i2.f111429b;
                    z = true;
                } else {
                    fb5Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m219658u(c17568aM132020i);
        }
        return fb5Var;
    }

    @Override // p153l.hsb
    /* JADX INFO: renamed from: f */
    public fb5<V> mo136964f(K k, fb5<V> fb5Var, hsb.InterfaceC17569b<K> interfaceC17569b) {
        hsb.C17568a<K, V> c17568aM132020i;
        fb5<V> fb5VarM219672w;
        fb5<V> fb5VarM219673x;
        wn80.m207182g(k);
        wn80.m207182g(fb5Var);
        m219671v();
        synchronized (this) {
            try {
                c17568aM132020i = this.f204347b.m132020i(k);
                hsb.C17568a<K, V> c17568aM132020i2 = this.f204348c.m132020i(k);
                fb5VarM219672w = null;
                if (c17568aM132020i2 != null) {
                    m219665n(c17568aM132020i2);
                    fb5VarM219673x = m219673x(c17568aM132020i2);
                } else {
                    fb5VarM219673x = null;
                }
                int iMo127073a = this.f204350e.mo127073a(fb5Var.m124875B());
                if (m219660i(iMo127073a)) {
                    hsb.C17568a<K, V> c17568aM136965a = this.f204355j ? hsb.C17568a.m136965a(k, fb5Var, iMo127073a, interfaceC17569b) : hsb.C17568a.m136966b(k, fb5Var, interfaceC17569b);
                    this.f204348c.m132019h(k, c17568aM136965a);
                    fb5VarM219672w = m219672w(c17568aM136965a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        fb5.m124874v(fb5VarM219673x);
        m219658u(c17568aM132020i);
        m219669r();
        return fb5VarM219672w;
    }

    @Override // p153l.mpy
    public fb5<V> get(K k) {
        hsb.C17568a<K, V> c17568aM132020i;
        fb5<V> fb5VarM219672w;
        wn80.m207182g(k);
        synchronized (this) {
            try {
                c17568aM132020i = this.f204347b.m132020i(k);
                hsb.C17568a<K, V> c17568aM132013b = this.f204348c.m132013b(k);
                fb5VarM219672w = c17568aM132013b != null ? m219672w(c17568aM132013b) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        m219658u(c17568aM132020i);
        m219671v();
        m219669r();
        return fb5VarM219672w;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX INFO: renamed from: i */
    public final synchronized boolean m219660i(int i) {
        boolean z;
        if (i <= this.f204353h.maxCacheEntrySize) {
            z = m219662k() <= this.f204353h.maxCacheEntries - 1 && m219663l() <= this.f204353h.maxCacheSize - i;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m219661j(hsb.C17568a<K, V> c17568a) {
        wn80.m207182g(c17568a);
        wn80.m207184i(c17568a.f111430c > 0);
        c17568a.f111430c--;
    }

    /* JADX INFO: renamed from: k */
    public synchronized int m219662k() {
        return this.f204348c.m132014c() - this.f204347b.m132014c();
    }

    /* JADX INFO: renamed from: l */
    public synchronized int m219663l() {
        return this.f204348c.m132017f() - this.f204347b.m132017f();
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m219664m(hsb.C17568a<K, V> c17568a) {
        wn80.m207182g(c17568a);
        wn80.m207184i(!c17568a.f111431d);
        c17568a.f111430c++;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m219665n(hsb.C17568a<K, V> c17568a) {
        wn80.m207182g(c17568a);
        wn80.m207184i(!c17568a.f111431d);
        c17568a.f111431d = true;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m219666o(ArrayList<hsb.C17568a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<hsb.C17568a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m219665n(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final synchronized boolean m219667p(hsb.C17568a<K, V> c17568a) {
        if (c17568a.f111431d || c17568a.f111430c != 0) {
            return false;
        }
        this.f204347b.m132019h(c17568a.f111428a, c17568a);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m219668q(ArrayList<hsb.C17568a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<hsb.C17568a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                fb5.m124874v(m219673x(it.next()));
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m219669r() {
        ArrayList<hsb.C17568a<K, V>> arrayListM219675z;
        synchronized (this) {
            npy npyVar = this.f204353h;
            int iMin = Math.min(npyVar.maxEvictionQueueEntries, npyVar.maxCacheEntries - m219662k());
            npy npyVar2 = this.f204353h;
            arrayListM219675z = m219675z(iMin, Math.min(npyVar2.maxEvictionQueueSize, npyVar2.maxCacheSize - m219663l()));
            m219666o(arrayListM219675z);
        }
        m219668q(arrayListM219675z);
        m219670t(arrayListM219675z);
    }

    /* JADX INFO: renamed from: t */
    public final void m219670t(ArrayList<hsb.C17568a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<hsb.C17568a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m219658u(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m219671v() {
        if (this.f204354i + this.f204353h.paramsCheckIntervalMs > SystemClock.uptimeMillis()) {
            return;
        }
        this.f204354i = SystemClock.uptimeMillis();
        this.f204353h = (npy) wn80.m207183h(this.f204352g.get(), "mMemoryCacheParamsSupplier returned null");
    }

    /* JADX INFO: renamed from: w */
    public final synchronized fb5<V> m219672w(hsb.C17568a<K, V> c17568a) {
        m219664m(c17568a);
        return fb5.m124867Z(c17568a.f111429b.m124875B(), new C21806b(c17568a));
    }

    /* JADX INFO: renamed from: x */
    public final synchronized fb5<V> m219673x(hsb.C17568a<K, V> c17568a) {
        wn80.m207182g(c17568a);
        return (c17568a.f111431d && c17568a.f111430c == 0) ? c17568a.f111429b : null;
    }

    /* JADX INFO: renamed from: y */
    public final void m219674y(hsb.C17568a<K, V> c17568a) {
        boolean zM219667p;
        fb5<V> fb5VarM219673x;
        wn80.m207182g(c17568a);
        synchronized (this) {
            m219661j(c17568a);
            zM219667p = m219667p(c17568a);
            fb5VarM219673x = m219673x(c17568a);
        }
        fb5.m124874v(fb5VarM219673x);
        if (!zM219667p) {
            c17568a = null;
        }
        m219657s(c17568a);
        m219671v();
        m219669r();
    }

    /* JADX INFO: renamed from: z */
    public final synchronized ArrayList<hsb.C17568a<K, V>> m219675z(int i, int i2) {
        int iMax = Math.max(i, 0);
        int iMax2 = Math.max(i2, 0);
        if (this.f204347b.m132014c() <= iMax && this.f204347b.m132017f() <= iMax2) {
            return null;
        }
        ArrayList<hsb.C17568a<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f204347b.m132014c() <= iMax && this.f204347b.m132017f() <= iMax2) {
                break;
            }
            K kM132015d = this.f204347b.m132015d();
            if (kM132015d == null) {
                if (!this.f204356k) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f204347b.m132014c()), Integer.valueOf(this.f204347b.m132017f())));
                }
                this.f204347b.m132022k();
                break;
            }
            this.f204347b.m132020i(kM132015d);
            arrayList.add(this.f204348c.m132020i(kM132015d));
        }
        return arrayList;
    }
}
