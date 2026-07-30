package com.google.common.cache;

import com.google.common.base.C2677a;
import com.google.common.base.Equivalence;
import com.google.common.base.Suppliers;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p153l.C21256x6;
import p153l.InterfaceC21523y6;
import p153l.azc0;
import p153l.b7h0;
import p153l.fzi0;
import p153l.hy3;
import p153l.i11;
import p153l.qwp0;
import p153l.ux3;
import p153l.wtv;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class CacheBuilder<K, V> {

    /* JADX INFO: renamed from: q */
    public static final b7h0<? extends InterfaceC21523y6> f10673q = Suppliers.m15479b(new C2679a());

    /* JADX INFO: renamed from: r */
    public static final hy3 f10674r = new hy3(0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: s */
    public static final b7h0<InterfaceC21523y6> f10675s = new C2680b();

    /* JADX INFO: renamed from: t */
    public static final fzi0 f10676t = new C2681c();

    /* JADX INFO: renamed from: u */
    public static final Logger f10677u = Logger.getLogger(CacheBuilder.class.getName());

    /* JADX INFO: renamed from: f */
    public qwp0<? super K, ? super V> f10683f;

    /* JADX INFO: renamed from: g */
    public LocalCache.Strength f10684g;

    /* JADX INFO: renamed from: h */
    public LocalCache.Strength f10685h;

    /* JADX INFO: renamed from: l */
    public Equivalence<Object> f10689l;

    /* JADX INFO: renamed from: m */
    public Equivalence<Object> f10690m;

    /* JADX INFO: renamed from: n */
    public azc0<? super K, ? super V> f10691n;

    /* JADX INFO: renamed from: o */
    public fzi0 f10692o;

    /* JADX INFO: renamed from: a */
    public boolean f10678a = true;

    /* JADX INFO: renamed from: b */
    public int f10679b = -1;

    /* JADX INFO: renamed from: c */
    public int f10680c = -1;

    /* JADX INFO: renamed from: d */
    public long f10681d = -1;

    /* JADX INFO: renamed from: e */
    public long f10682e = -1;

    /* JADX INFO: renamed from: i */
    public long f10686i = -1;

    /* JADX INFO: renamed from: j */
    public long f10687j = -1;

    /* JADX INFO: renamed from: k */
    public long f10688k = -1;

    /* JADX INFO: renamed from: p */
    public b7h0<? extends InterfaceC21523y6> f10693p = f10673q;

    public enum NullListener implements azc0<Object, Object> {
        INSTANCE;

        @Override // p153l.azc0
        public void onRemoval(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    public enum OneWeigher implements qwp0<Object, Object> {
        INSTANCE;

        @Override // p153l.qwp0
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.CacheBuilder$a */
    public class C2679a implements InterfaceC21523y6 {
        @Override // p153l.InterfaceC21523y6
        /* JADX INFO: renamed from: a */
        public void mo15533a(int i) {
        }

        @Override // p153l.InterfaceC21523y6
        /* JADX INFO: renamed from: b */
        public void mo15534b() {
        }

        @Override // p153l.InterfaceC21523y6
        /* JADX INFO: renamed from: c */
        public void mo15535c(long j) {
        }

        @Override // p153l.InterfaceC21523y6
        /* JADX INFO: renamed from: d */
        public void mo15536d(int i) {
        }

        @Override // p153l.InterfaceC21523y6
        /* JADX INFO: renamed from: e */
        public void mo15537e(long j) {
        }

        @Override // p153l.InterfaceC21523y6
        /* JADX INFO: renamed from: f */
        public hy3 mo15538f() {
            return CacheBuilder.f10674r;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.CacheBuilder$b */
    public class C2680b implements b7h0<InterfaceC21523y6> {
        @Override // p153l.b7h0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC21523y6 get() {
            return new C21256x6();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.CacheBuilder$c */
    public class C2681c extends fzi0 {
        @Override // p153l.fzi0
        /* JADX INFO: renamed from: a */
        public long mo15540a() {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: y */
    public static CacheBuilder<Object, Object> m15502y() {
        return new CacheBuilder<>();
    }

    /* JADX INFO: renamed from: A */
    public CacheBuilder<K, V> m15503A(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.f10684g;
        xn80.m212121z(strength2 == null, "Key strength was already set to %s", strength2);
        this.f10684g = (LocalCache.Strength) xn80.m212111p(strength);
        return this;
    }

    /* JADX INFO: renamed from: B */
    public CacheBuilder<K, V> m15504B(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.f10685h;
        xn80.m212121z(strength2 == null, "Value strength was already set to %s", strength2);
        this.f10685h = (LocalCache.Strength) xn80.m212111p(strength);
        return this;
    }

    /* JADX INFO: renamed from: C */
    public CacheBuilder<K, V> m15505C(fzi0 fzi0Var) {
        xn80.m212117v(this.f10692o == null);
        this.f10692o = (fzi0) xn80.m212111p(fzi0Var);
        return this;
    }

    /* JADX INFO: renamed from: D */
    public CacheBuilder<K, V> m15506D(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f10690m;
        xn80.m212121z(equivalence2 == null, "value equivalence was already set to %s", equivalence2);
        this.f10690m = (Equivalence) xn80.m212111p(equivalence);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> m15507E(qwp0<? super K1, ? super V1> qwp0Var) {
        xn80.m212117v(this.f10683f == null);
        if (this.f10678a) {
            long j = this.f10681d;
            xn80.m212120y(j == -1, "weigher can not be combined with maximum size", j);
        }
        this.f10683f = (qwp0) xn80.m212111p(qwp0Var);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public <K1 extends K, V1 extends V> ux3<K1, V1> m15508a() {
        m15511d();
        m15510c();
        return new LocalCache.LocalManualCache(this);
    }

    /* JADX INFO: renamed from: b */
    public <K1 extends K, V1 extends V> wtv<K1, V1> m15509b(CacheLoader<? super K1, V1> cacheLoader) {
        m15511d();
        return new LocalCache.LocalLoadingCache(this, cacheLoader);
    }

    /* JADX INFO: renamed from: c */
    public final void m15510c() {
        xn80.m212118w(this.f10688k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    /* JADX INFO: renamed from: d */
    public final void m15511d() {
        if (this.f10683f == null) {
            xn80.m212118w(this.f10682e == -1, "maximumWeight requires weigher");
            return;
        }
        boolean z = this.f10678a;
        long j = this.f10682e;
        if (z) {
            xn80.m212118w(j != -1, "weigher requires maximumWeight");
        } else if (j == -1) {
            f10677u.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    /* JADX INFO: renamed from: e */
    public CacheBuilder<K, V> m15512e(int i) {
        int i2 = this.f10680c;
        xn80.m212119x(i2 == -1, "concurrency level was already set to %s", i2);
        xn80.m212099d(i > 0);
        this.f10680c = i;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public CacheBuilder<K, V> m15513f(long j, TimeUnit timeUnit) {
        long j2 = this.f10687j;
        xn80.m212120y(j2 == -1, "expireAfterAccess was already set to %s ns", j2);
        xn80.m212105j(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.f10687j = timeUnit.toNanos(j);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public CacheBuilder<K, V> m15514g(long j, TimeUnit timeUnit) {
        long j2 = this.f10686i;
        xn80.m212120y(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        xn80.m212105j(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.f10686i = timeUnit.toNanos(j);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public int m15515h() {
        int i = this.f10680c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public long m15516i() {
        long j = this.f10687j;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: j */
    public long m15517j() {
        long j = this.f10686i;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: k */
    public int m15518k() {
        int i = this.f10679b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    public Equivalence<Object> m15519l() {
        return (Equivalence) C2677a.m15480a(this.f10689l, m15520m().defaultEquivalence());
    }

    /* JADX INFO: renamed from: m */
    public LocalCache.Strength m15520m() {
        return (LocalCache.Strength) C2677a.m15480a(this.f10684g, LocalCache.Strength.STRONG);
    }

    /* JADX INFO: renamed from: n */
    public long m15521n() {
        if (this.f10686i == 0 || this.f10687j == 0) {
            return 0L;
        }
        return this.f10683f == null ? this.f10681d : this.f10682e;
    }

    /* JADX INFO: renamed from: o */
    public long m15522o() {
        long j = this.f10688k;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: p */
    public <K1 extends K, V1 extends V> azc0<K1, V1> m15523p() {
        return (azc0) C2677a.m15480a(this.f10691n, NullListener.INSTANCE);
    }

    /* JADX INFO: renamed from: q */
    public b7h0<? extends InterfaceC21523y6> m15524q() {
        return this.f10693p;
    }

    /* JADX INFO: renamed from: r */
    public fzi0 m15525r(boolean z) {
        fzi0 fzi0Var = this.f10692o;
        if (fzi0Var != null) {
            return fzi0Var;
        }
        return z ? fzi0.m128190b() : f10676t;
    }

    /* JADX INFO: renamed from: s */
    public Equivalence<Object> m15526s() {
        return (Equivalence) C2677a.m15480a(this.f10690m, m15527t().defaultEquivalence());
    }

    /* JADX INFO: renamed from: t */
    public LocalCache.Strength m15527t() {
        return (LocalCache.Strength) C2677a.m15480a(this.f10685h, LocalCache.Strength.STRONG);
    }

    public String toString() {
        C2677a.b bVarM15481b = C2677a.m15481b(this);
        int i = this.f10679b;
        if (i != -1) {
            bVarM15481b.m15484b("initialCapacity", i);
        }
        int i2 = this.f10680c;
        if (i2 != -1) {
            bVarM15481b.m15484b("concurrencyLevel", i2);
        }
        long j = this.f10681d;
        if (j != -1) {
            bVarM15481b.m15485c("maximumSize", j);
        }
        long j2 = this.f10682e;
        if (j2 != -1) {
            bVarM15481b.m15485c("maximumWeight", j2);
        }
        long j3 = this.f10686i;
        if (j3 != -1) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(j3);
            sb.append("ns");
            bVarM15481b.m15486d("expireAfterWrite", sb.toString());
        }
        long j4 = this.f10687j;
        if (j4 != -1) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append(j4);
            sb2.append("ns");
            bVarM15481b.m15486d("expireAfterAccess", sb2.toString());
        }
        LocalCache.Strength strength = this.f10684g;
        if (strength != null) {
            bVarM15481b.m15486d("keyStrength", i11.m138051e(strength.toString()));
        }
        LocalCache.Strength strength2 = this.f10685h;
        if (strength2 != null) {
            bVarM15481b.m15486d("valueStrength", i11.m138051e(strength2.toString()));
        }
        if (this.f10689l != null) {
            bVarM15481b.m15492j("keyEquivalence");
        }
        if (this.f10690m != null) {
            bVarM15481b.m15492j("valueEquivalence");
        }
        if (this.f10691n != null) {
            bVarM15481b.m15492j("removalListener");
        }
        return bVarM15481b.toString();
    }

    /* JADX INFO: renamed from: u */
    public <K1 extends K, V1 extends V> qwp0<K1, V1> m15528u() {
        return (qwp0) C2677a.m15480a(this.f10683f, OneWeigher.INSTANCE);
    }

    /* JADX INFO: renamed from: v */
    public CacheBuilder<K, V> m15529v(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f10689l;
        xn80.m212121z(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f10689l = (Equivalence) xn80.m212111p(equivalence);
        return this;
    }

    /* JADX INFO: renamed from: w */
    public CacheBuilder<K, V> m15530w(long j) {
        long j2 = this.f10681d;
        xn80.m212120y(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.f10682e;
        xn80.m212120y(j3 == -1, "maximum weight was already set to %s", j3);
        xn80.m212118w(this.f10683f == null, "maximum size can not be combined with weigher");
        xn80.m212100e(j >= 0, "maximum size must not be negative");
        this.f10681d = j;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public CacheBuilder<K, V> m15531x(long j) {
        long j2 = this.f10682e;
        xn80.m212120y(j2 == -1, "maximum weight was already set to %s", j2);
        long j3 = this.f10681d;
        xn80.m212120y(j3 == -1, "maximum size was already set to %s", j3);
        xn80.m212100e(j >= 0, "maximum weight must not be negative");
        this.f10682e = j;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> m15532z(azc0<? super K1, ? super V1> azc0Var) {
        xn80.m212117v(this.f10691n == null);
        this.f10691n = (azc0) xn80.m212111p(azc0Var);
        return this;
    }
}
