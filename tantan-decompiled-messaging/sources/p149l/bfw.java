package p149l;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class bfw<K, V> implements tqb<K, V>, pgy<K, V> {

    /* JADX INFO: renamed from: a */
    public final tqb.InterfaceC20245b<K> f75371a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final sqb<K, tqb.C20244a<K, V>> f75372b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public final sqb<K, tqb.C20244a<K, V>> f75373c;

    /* JADX INFO: renamed from: e */
    public final rrk0<V> f75375e;

    /* JADX INFO: renamed from: f */
    public final pgy.InterfaceC19209a f75376f;

    /* JADX INFO: renamed from: g */
    public final syg0<qgy> f75377g;

    /* JADX INFO: renamed from: h */
    public qgy f75378h;

    /* JADX INFO: renamed from: j */
    public final boolean f75380j;

    /* JADX INFO: renamed from: k */
    public final boolean f75381k;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final Map<Bitmap, Object> f75374d = new WeakHashMap();

    /* JADX INFO: renamed from: i */
    public long f75379i = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: l.bfw$a */
    public class C15850a implements rrk0<tqb.C20244a<K, V>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rrk0 f75382a;

        public C15850a(rrk0 rrk0Var) {
            this.f75382a = rrk0Var;
        }

        @Override // p149l.rrk0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo101613a(tqb.C20244a<K, V> c20244a) {
            return bfw.this.f75380j ? c20244a.f171569g : this.f75382a.mo101613a(c20244a.f171564b.m120155B());
        }
    }

    /* JADX INFO: renamed from: l.bfw$b */
    public class C15851b implements twc0<V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ tqb.C20244a f75384a;

        public C15851b(tqb.C20244a c20244a) {
            this.f75384a = c20244a;
        }

        @Override // p149l.twc0
        public void release(V v2) {
            bfw.this.m101611y(this.f75384a);
        }
    }

    public bfw(rrk0<V> rrk0Var, pgy.InterfaceC19209a interfaceC19209a, syg0<qgy> syg0Var, tqb.InterfaceC20245b<K> interfaceC20245b, boolean z, boolean z2) {
        this.f75375e = rrk0Var;
        this.f75372b = new sqb<>(m101590A(rrk0Var));
        this.f75373c = new sqb<>(m101590A(rrk0Var));
        this.f75376f = interfaceC19209a;
        this.f75377g = syg0Var;
        this.f75378h = (qgy) rf80.m179117h(syg0Var.get(), "mMemoryCacheParamsSupplier returned null");
        this.f75371a = interfaceC20245b;
        this.f75380j = z;
        this.f75381k = z2;
    }

    /* JADX INFO: renamed from: s */
    public static <K, V> void m101588s(tqb.C20244a<K, V> c20244a) {
        tqb.InterfaceC20245b<K> interfaceC20245b;
        if (c20244a == null || (interfaceC20245b = c20244a.f171567e) == null) {
            return;
        }
        interfaceC20245b.mo155851a(c20244a.f171563a, true);
    }

    /* JADX INFO: renamed from: u */
    public static <K, V> void m101589u(tqb.C20244a<K, V> c20244a) {
        tqb.InterfaceC20245b<K> interfaceC20245b;
        if (c20244a == null || (interfaceC20245b = c20244a.f171567e) == null) {
            return;
        }
        interfaceC20245b.mo155851a(c20244a.f171563a, false);
    }

    /* JADX INFO: renamed from: A */
    public final rrk0<tqb.C20244a<K, V>> m101590A(rrk0<V> rrk0Var) {
        return new C15850a(rrk0Var);
    }

    @Override // p149l.pgy
    /* JADX INFO: renamed from: a */
    public void mo101591a(K k) {
        rf80.m179116g(k);
        synchronized (this) {
            try {
                tqb.C20244a<K, V> c20244aM185486i = this.f75372b.m185486i(k);
                if (c20244aM185486i != null) {
                    this.f75372b.m185485h(k, c20244aM185486i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.pgy
    /* JADX INFO: renamed from: b */
    public fa5<V> mo101592b(K k, fa5<V> fa5Var) {
        return mo101596f(k, fa5Var, this.f75371a);
    }

    @Override // p149l.pgy
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo101593c(ph80<K> ph80Var) {
        return !this.f75373c.m185482e(ph80Var).isEmpty();
    }

    @Override // p149l.pgy
    public synchronized boolean contains(K k) {
        return this.f75373c.m185478a(k);
    }

    @Override // p149l.pgy
    /* JADX INFO: renamed from: d */
    public int mo101594d(ph80<K> ph80Var) {
        ArrayList<tqb.C20244a<K, V>> arrayListM185487j;
        ArrayList<tqb.C20244a<K, V>> arrayListM185487j2;
        synchronized (this) {
            arrayListM185487j = this.f75372b.m185487j(ph80Var);
            arrayListM185487j2 = this.f75373c.m185487j(ph80Var);
            m101603o(arrayListM185487j2);
        }
        m101605q(arrayListM185487j2);
        m101607t(arrayListM185487j);
        m101608v();
        m101606r();
        return arrayListM185487j2.size();
    }

    @Override // p149l.tqb
    /* JADX INFO: renamed from: e */
    public fa5<V> mo101595e(K k) {
        tqb.C20244a<K, V> c20244aM185486i;
        boolean z;
        fa5<V> fa5Var;
        rf80.m179116g(k);
        synchronized (this) {
            try {
                c20244aM185486i = this.f75372b.m185486i(k);
                z = false;
                if (c20244aM185486i != null) {
                    tqb.C20244a<K, V> c20244aM185486i2 = this.f75373c.m185486i(k);
                    rf80.m179116g(c20244aM185486i2);
                    rf80.m179118i(c20244aM185486i2.f171565c == 0);
                    fa5Var = c20244aM185486i2.f171564b;
                    z = true;
                } else {
                    fa5Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m101589u(c20244aM185486i);
        }
        return fa5Var;
    }

    @Override // p149l.tqb
    /* JADX INFO: renamed from: f */
    public fa5<V> mo101596f(K k, fa5<V> fa5Var, tqb.InterfaceC20245b<K> interfaceC20245b) {
        tqb.C20244a<K, V> c20244aM185486i;
        fa5<V> fa5VarM101609w;
        fa5<V> fa5VarM101610x;
        rf80.m179116g(k);
        rf80.m179116g(fa5Var);
        m101608v();
        synchronized (this) {
            try {
                c20244aM185486i = this.f75372b.m185486i(k);
                tqb.C20244a<K, V> c20244aM185486i2 = this.f75373c.m185486i(k);
                fa5VarM101609w = null;
                if (c20244aM185486i2 != null) {
                    m101602n(c20244aM185486i2);
                    fa5VarM101610x = m101610x(c20244aM185486i2);
                } else {
                    fa5VarM101610x = null;
                }
                int iMo101613a = this.f75375e.mo101613a(fa5Var.m120155B());
                if (m101597i(iMo101613a)) {
                    tqb.C20244a<K, V> c20244aM190087a = this.f75380j ? tqb.C20244a.m190087a(k, fa5Var, iMo101613a, interfaceC20245b) : tqb.C20244a.m190088b(k, fa5Var, interfaceC20245b);
                    this.f75373c.m185485h(k, c20244aM190087a);
                    fa5VarM101609w = m101609w(c20244aM190087a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        fa5.m120154v(fa5VarM101610x);
        m101589u(c20244aM185486i);
        m101606r();
        return fa5VarM101609w;
    }

    @Override // p149l.pgy
    public fa5<V> get(K k) {
        tqb.C20244a<K, V> c20244aM185486i;
        fa5<V> fa5VarM101609w;
        rf80.m179116g(k);
        synchronized (this) {
            try {
                c20244aM185486i = this.f75372b.m185486i(k);
                tqb.C20244a<K, V> c20244aM185479b = this.f75373c.m185479b(k);
                fa5VarM101609w = c20244aM185479b != null ? m101609w(c20244aM185479b) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        m101589u(c20244aM185486i);
        m101608v();
        m101606r();
        return fa5VarM101609w;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX INFO: renamed from: i */
    public final synchronized boolean m101597i(int i) {
        boolean z;
        if (i <= this.f75378h.maxCacheEntrySize) {
            z = m101599k() <= this.f75378h.maxCacheEntries - 1 && m101600l() <= this.f75378h.maxCacheSize - i;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m101598j(tqb.C20244a<K, V> c20244a) {
        rf80.m179116g(c20244a);
        rf80.m179118i(c20244a.f171565c > 0);
        c20244a.f171565c--;
    }

    /* JADX INFO: renamed from: k */
    public synchronized int m101599k() {
        return this.f75373c.m185480c() - this.f75372b.m185480c();
    }

    /* JADX INFO: renamed from: l */
    public synchronized int m101600l() {
        return this.f75373c.m185483f() - this.f75372b.m185483f();
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m101601m(tqb.C20244a<K, V> c20244a) {
        rf80.m179116g(c20244a);
        rf80.m179118i(!c20244a.f171566d);
        c20244a.f171565c++;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m101602n(tqb.C20244a<K, V> c20244a) {
        rf80.m179116g(c20244a);
        rf80.m179118i(!c20244a.f171566d);
        c20244a.f171566d = true;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m101603o(ArrayList<tqb.C20244a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<tqb.C20244a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m101602n(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final synchronized boolean m101604p(tqb.C20244a<K, V> c20244a) {
        if (c20244a.f171566d || c20244a.f171565c != 0) {
            return false;
        }
        this.f75372b.m185485h(c20244a.f171563a, c20244a);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m101605q(ArrayList<tqb.C20244a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<tqb.C20244a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                fa5.m120154v(m101610x(it.next()));
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m101606r() {
        ArrayList<tqb.C20244a<K, V>> arrayListM101612z;
        synchronized (this) {
            qgy qgyVar = this.f75378h;
            int iMin = Math.min(qgyVar.maxEvictionQueueEntries, qgyVar.maxCacheEntries - m101599k());
            qgy qgyVar2 = this.f75378h;
            arrayListM101612z = m101612z(iMin, Math.min(qgyVar2.maxEvictionQueueSize, qgyVar2.maxCacheSize - m101600l()));
            m101603o(arrayListM101612z);
        }
        m101605q(arrayListM101612z);
        m101607t(arrayListM101612z);
    }

    /* JADX INFO: renamed from: t */
    public final void m101607t(ArrayList<tqb.C20244a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<tqb.C20244a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m101589u(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m101608v() {
        if (this.f75379i + this.f75378h.paramsCheckIntervalMs > SystemClock.uptimeMillis()) {
            return;
        }
        this.f75379i = SystemClock.uptimeMillis();
        this.f75378h = (qgy) rf80.m179117h(this.f75377g.get(), "mMemoryCacheParamsSupplier returned null");
    }

    /* JADX INFO: renamed from: w */
    public final synchronized fa5<V> m101609w(tqb.C20244a<K, V> c20244a) {
        m101601m(c20244a);
        return fa5.m120147Y(c20244a.f171564b.m120155B(), new C15851b(c20244a));
    }

    /* JADX INFO: renamed from: x */
    public final synchronized fa5<V> m101610x(tqb.C20244a<K, V> c20244a) {
        rf80.m179116g(c20244a);
        return (c20244a.f171566d && c20244a.f171565c == 0) ? c20244a.f171564b : null;
    }

    /* JADX INFO: renamed from: y */
    public final void m101611y(tqb.C20244a<K, V> c20244a) {
        boolean zM101604p;
        fa5<V> fa5VarM101610x;
        rf80.m179116g(c20244a);
        synchronized (this) {
            m101598j(c20244a);
            zM101604p = m101604p(c20244a);
            fa5VarM101610x = m101610x(c20244a);
        }
        fa5.m120154v(fa5VarM101610x);
        if (!zM101604p) {
            c20244a = null;
        }
        m101588s(c20244a);
        m101608v();
        m101606r();
    }

    /* JADX INFO: renamed from: z */
    public final synchronized ArrayList<tqb.C20244a<K, V>> m101612z(int i, int i2) {
        int iMax = Math.max(i, 0);
        int iMax2 = Math.max(i2, 0);
        if (this.f75372b.m185480c() <= iMax && this.f75372b.m185483f() <= iMax2) {
            return null;
        }
        ArrayList<tqb.C20244a<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f75372b.m185480c() <= iMax && this.f75372b.m185483f() <= iMax2) {
                break;
            }
            K kM185481d = this.f75372b.m185481d();
            if (kM185481d == null) {
                if (!this.f75381k) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f75372b.m185480c()), Integer.valueOf(this.f75372b.m185483f())));
                }
                this.f75372b.m185488k();
                break;
            }
            this.f75372b.m185486i(kM185481d);
            arrayList.add(this.f75373c.m185486i(kM185481d));
        }
        return arrayList;
    }
}
