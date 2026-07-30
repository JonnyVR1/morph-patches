package com.google.common.cache;

import com.google.common.base.C2654a;
import com.google.common.base.Equivalence;
import com.google.common.base.Suppliers;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p149l.C15535a7;
import p149l.InterfaceC15818b7;
import p149l.b11;
import p149l.cqi0;
import p149l.ix3;
import p149l.mnp0;
import p149l.sf80;
import p149l.tyg0;
import p149l.vqc0;
import p149l.vrv;
import p149l.vw3;

/* JADX INFO: loaded from: classes7.dex */
public final class CacheBuilder<K, V> {

    /* JADX INFO: renamed from: q */
    public static final tyg0<? extends InterfaceC15818b7> f10636q = Suppliers.m15425b(new C2656a());

    /* JADX INFO: renamed from: r */
    public static final ix3 f10637r = new ix3(0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: s */
    public static final tyg0<InterfaceC15818b7> f10638s = new C2657b();

    /* JADX INFO: renamed from: t */
    public static final cqi0 f10639t = new C2658c();

    /* JADX INFO: renamed from: u */
    public static final Logger f10640u = Logger.getLogger(CacheBuilder.class.getName());

    /* JADX INFO: renamed from: f */
    public mnp0<? super K, ? super V> f10646f;

    /* JADX INFO: renamed from: g */
    public LocalCache.Strength f10647g;

    /* JADX INFO: renamed from: h */
    public LocalCache.Strength f10648h;

    /* JADX INFO: renamed from: l */
    public Equivalence<Object> f10652l;

    /* JADX INFO: renamed from: m */
    public Equivalence<Object> f10653m;

    /* JADX INFO: renamed from: n */
    public vqc0<? super K, ? super V> f10654n;

    /* JADX INFO: renamed from: o */
    public cqi0 f10655o;

    /* JADX INFO: renamed from: a */
    public boolean f10641a = true;

    /* JADX INFO: renamed from: b */
    public int f10642b = -1;

    /* JADX INFO: renamed from: c */
    public int f10643c = -1;

    /* JADX INFO: renamed from: d */
    public long f10644d = -1;

    /* JADX INFO: renamed from: e */
    public long f10645e = -1;

    /* JADX INFO: renamed from: i */
    public long f10649i = -1;

    /* JADX INFO: renamed from: j */
    public long f10650j = -1;

    /* JADX INFO: renamed from: k */
    public long f10651k = -1;

    /* JADX INFO: renamed from: p */
    public tyg0<? extends InterfaceC15818b7> f10656p = f10636q;

    public enum NullListener implements vqc0<Object, Object> {
        INSTANCE;

        @Override // p149l.vqc0
        public void onRemoval(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    public enum OneWeigher implements mnp0<Object, Object> {
        INSTANCE;

        @Override // p149l.mnp0
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.CacheBuilder$a */
    public class C2656a implements InterfaceC15818b7 {
        @Override // p149l.InterfaceC15818b7
        /* JADX INFO: renamed from: a */
        public void mo15479a(int i) {
        }

        @Override // p149l.InterfaceC15818b7
        /* JADX INFO: renamed from: b */
        public void mo15480b() {
        }

        @Override // p149l.InterfaceC15818b7
        /* JADX INFO: renamed from: c */
        public void mo15481c(long j) {
        }

        @Override // p149l.InterfaceC15818b7
        /* JADX INFO: renamed from: d */
        public void mo15482d(int i) {
        }

        @Override // p149l.InterfaceC15818b7
        /* JADX INFO: renamed from: e */
        public void mo15483e(long j) {
        }

        @Override // p149l.InterfaceC15818b7
        /* JADX INFO: renamed from: f */
        public ix3 mo15484f() {
            return CacheBuilder.f10637r;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.CacheBuilder$b */
    public class C2657b implements tyg0<InterfaceC15818b7> {
        @Override // p149l.tyg0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC15818b7 get() {
            return new C15535a7();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.CacheBuilder$c */
    public class C2658c extends cqi0 {
        @Override // p149l.cqi0
        /* JADX INFO: renamed from: a */
        public long mo15486a() {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: y */
    public static CacheBuilder<Object, Object> m15448y() {
        return new CacheBuilder<>();
    }

    /* JADX INFO: renamed from: A */
    public CacheBuilder<K, V> m15449A(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.f10647g;
        sf80.m183904z(strength2 == null, "Key strength was already set to %s", strength2);
        this.f10647g = (LocalCache.Strength) sf80.m183894p(strength);
        return this;
    }

    /* JADX INFO: renamed from: B */
    public CacheBuilder<K, V> m15450B(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.f10648h;
        sf80.m183904z(strength2 == null, "Value strength was already set to %s", strength2);
        this.f10648h = (LocalCache.Strength) sf80.m183894p(strength);
        return this;
    }

    /* JADX INFO: renamed from: C */
    public CacheBuilder<K, V> m15451C(cqi0 cqi0Var) {
        sf80.m183900v(this.f10655o == null);
        this.f10655o = (cqi0) sf80.m183894p(cqi0Var);
        return this;
    }

    /* JADX INFO: renamed from: D */
    public CacheBuilder<K, V> m15452D(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f10653m;
        sf80.m183904z(equivalence2 == null, "value equivalence was already set to %s", equivalence2);
        this.f10653m = (Equivalence) sf80.m183894p(equivalence);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> m15453E(mnp0<? super K1, ? super V1> mnp0Var) {
        sf80.m183900v(this.f10646f == null);
        if (this.f10641a) {
            long j = this.f10644d;
            sf80.m183903y(j == -1, "weigher can not be combined with maximum size", j);
        }
        this.f10646f = (mnp0) sf80.m183894p(mnp0Var);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public <K1 extends K, V1 extends V> vw3<K1, V1> m15454a() {
        m15457d();
        m15456c();
        return new LocalCache.LocalManualCache(this);
    }

    /* JADX INFO: renamed from: b */
    public <K1 extends K, V1 extends V> vrv<K1, V1> m15455b(CacheLoader<? super K1, V1> cacheLoader) {
        m15457d();
        return new LocalCache.LocalLoadingCache(this, cacheLoader);
    }

    /* JADX INFO: renamed from: c */
    public final void m15456c() {
        sf80.m183901w(this.f10651k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    /* JADX INFO: renamed from: d */
    public final void m15457d() {
        if (this.f10646f == null) {
            sf80.m183901w(this.f10645e == -1, "maximumWeight requires weigher");
            return;
        }
        boolean z = this.f10641a;
        long j = this.f10645e;
        if (z) {
            sf80.m183901w(j != -1, "weigher requires maximumWeight");
        } else if (j == -1) {
            f10640u.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    /* JADX INFO: renamed from: e */
    public CacheBuilder<K, V> m15458e(int i) {
        int i2 = this.f10643c;
        sf80.m183902x(i2 == -1, "concurrency level was already set to %s", i2);
        sf80.m183882d(i > 0);
        this.f10643c = i;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public CacheBuilder<K, V> m15459f(long j, TimeUnit timeUnit) {
        long j2 = this.f10650j;
        sf80.m183903y(j2 == -1, "expireAfterAccess was already set to %s ns", j2);
        sf80.m183888j(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.f10650j = timeUnit.toNanos(j);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public CacheBuilder<K, V> m15460g(long j, TimeUnit timeUnit) {
        long j2 = this.f10649i;
        sf80.m183903y(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        sf80.m183888j(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.f10649i = timeUnit.toNanos(j);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public int m15461h() {
        int i = this.f10643c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public long m15462i() {
        long j = this.f10650j;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: j */
    public long m15463j() {
        long j = this.f10649i;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: k */
    public int m15464k() {
        int i = this.f10642b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    public Equivalence<Object> m15465l() {
        return (Equivalence) C2654a.m15426a(this.f10652l, m15466m().defaultEquivalence());
    }

    /* JADX INFO: renamed from: m */
    public LocalCache.Strength m15466m() {
        return (LocalCache.Strength) C2654a.m15426a(this.f10647g, LocalCache.Strength.STRONG);
    }

    /* JADX INFO: renamed from: n */
    public long m15467n() {
        if (this.f10649i == 0 || this.f10650j == 0) {
            return 0L;
        }
        return this.f10646f == null ? this.f10644d : this.f10645e;
    }

    /* JADX INFO: renamed from: o */
    public long m15468o() {
        long j = this.f10651k;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: p */
    public <K1 extends K, V1 extends V> vqc0<K1, V1> m15469p() {
        return (vqc0) C2654a.m15426a(this.f10654n, NullListener.INSTANCE);
    }

    /* JADX INFO: renamed from: q */
    public tyg0<? extends InterfaceC15818b7> m15470q() {
        return this.f10656p;
    }

    /* JADX INFO: renamed from: r */
    public cqi0 m15471r(boolean z) {
        cqi0 cqi0Var = this.f10655o;
        if (cqi0Var != null) {
            return cqi0Var;
        }
        return z ? cqi0.m108276b() : f10639t;
    }

    /* JADX INFO: renamed from: s */
    public Equivalence<Object> m15472s() {
        return (Equivalence) C2654a.m15426a(this.f10653m, m15473t().defaultEquivalence());
    }

    /* JADX INFO: renamed from: t */
    public LocalCache.Strength m15473t() {
        return (LocalCache.Strength) C2654a.m15426a(this.f10648h, LocalCache.Strength.STRONG);
    }

    public String toString() {
        C2654a.b bVarM15427b = C2654a.m15427b(this);
        int i = this.f10642b;
        if (i != -1) {
            bVarM15427b.m15430b("initialCapacity", i);
        }
        int i2 = this.f10643c;
        if (i2 != -1) {
            bVarM15427b.m15430b("concurrencyLevel", i2);
        }
        long j = this.f10644d;
        if (j != -1) {
            bVarM15427b.m15431c("maximumSize", j);
        }
        long j2 = this.f10645e;
        if (j2 != -1) {
            bVarM15427b.m15431c("maximumWeight", j2);
        }
        long j3 = this.f10649i;
        if (j3 != -1) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(j3);
            sb.append("ns");
            bVarM15427b.m15432d("expireAfterWrite", sb.toString());
        }
        long j4 = this.f10650j;
        if (j4 != -1) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append(j4);
            sb2.append("ns");
            bVarM15427b.m15432d("expireAfterAccess", sb2.toString());
        }
        LocalCache.Strength strength = this.f10647g;
        if (strength != null) {
            bVarM15427b.m15432d("keyStrength", b11.m99804e(strength.toString()));
        }
        LocalCache.Strength strength2 = this.f10648h;
        if (strength2 != null) {
            bVarM15427b.m15432d("valueStrength", b11.m99804e(strength2.toString()));
        }
        if (this.f10652l != null) {
            bVarM15427b.m15438j("keyEquivalence");
        }
        if (this.f10653m != null) {
            bVarM15427b.m15438j("valueEquivalence");
        }
        if (this.f10654n != null) {
            bVarM15427b.m15438j("removalListener");
        }
        return bVarM15427b.toString();
    }

    /* JADX INFO: renamed from: u */
    public <K1 extends K, V1 extends V> mnp0<K1, V1> m15474u() {
        return (mnp0) C2654a.m15426a(this.f10646f, OneWeigher.INSTANCE);
    }

    /* JADX INFO: renamed from: v */
    public CacheBuilder<K, V> m15475v(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f10652l;
        sf80.m183904z(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f10652l = (Equivalence) sf80.m183894p(equivalence);
        return this;
    }

    /* JADX INFO: renamed from: w */
    public CacheBuilder<K, V> m15476w(long j) {
        long j2 = this.f10644d;
        sf80.m183903y(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.f10645e;
        sf80.m183903y(j3 == -1, "maximum weight was already set to %s", j3);
        sf80.m183901w(this.f10646f == null, "maximum size can not be combined with weigher");
        sf80.m183883e(j >= 0, "maximum size must not be negative");
        this.f10644d = j;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public CacheBuilder<K, V> m15477x(long j) {
        long j2 = this.f10645e;
        sf80.m183903y(j2 == -1, "maximum weight was already set to %s", j2);
        long j3 = this.f10644d;
        sf80.m183903y(j3 == -1, "maximum size was already set to %s", j3);
        sf80.m183883e(j >= 0, "maximum weight must not be negative");
        this.f10645e = j;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> m15478z(vqc0<? super K1, ? super V1> vqc0Var) {
        sf80.m183900v(this.f10654n == null);
        this.f10654n = (vqc0) sf80.m183894p(vqc0Var);
        return this;
    }
}
