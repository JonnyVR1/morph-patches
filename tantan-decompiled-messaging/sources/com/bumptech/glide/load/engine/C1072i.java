package com.bumptech.glide.load.engine;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p149l.hb80;
import p149l.k1k;
import p149l.kxq;
import p149l.ovf0;
import p149l.qf80;
import p149l.rvc0;
import p149l.tvc0;
import p149l.y5f;
import p149l.yvf;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.i */
/* JADX INFO: loaded from: classes.dex */
class C1072i<R> implements DecodeJob.InterfaceC1058b<R>, yvf.InterfaceC21545f {

    /* JADX INFO: renamed from: y */
    private static final c f4495y = new c();

    /* JADX INFO: renamed from: a */
    final e f4496a;

    /* JADX INFO: renamed from: b */
    private final ovf0 f4497b;

    /* JADX INFO: renamed from: c */
    private final C1076m.a f4498c;

    /* JADX INFO: renamed from: d */
    private final hb80<C1072i<?>> f4499d;

    /* JADX INFO: renamed from: e */
    private final c f4500e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1073j f4501f;

    /* JADX INFO: renamed from: g */
    private final k1k f4502g;

    /* JADX INFO: renamed from: h */
    private final k1k f4503h;

    /* JADX INFO: renamed from: i */
    private final k1k f4504i;

    /* JADX INFO: renamed from: j */
    private final k1k f4505j;

    /* JADX INFO: renamed from: k */
    private final AtomicInteger f4506k;

    /* JADX INFO: renamed from: l */
    private kxq f4507l;

    /* JADX INFO: renamed from: m */
    private boolean f4508m;

    /* JADX INFO: renamed from: n */
    private boolean f4509n;

    /* JADX INFO: renamed from: o */
    private boolean f4510o;

    /* JADX INFO: renamed from: p */
    private boolean f4511p;

    /* JADX INFO: renamed from: q */
    private rvc0<?> f4512q;

    /* JADX INFO: renamed from: r */
    DataSource f4513r;

    /* JADX INFO: renamed from: s */
    private boolean f4514s;

    /* JADX INFO: renamed from: t */
    GlideException f4515t;

    /* JADX INFO: renamed from: u */
    private boolean f4516u;

    /* JADX INFO: renamed from: v */
    C1076m<?> f4517v;

    /* JADX INFO: renamed from: w */
    private DecodeJob<R> f4518w;

    /* JADX INFO: renamed from: x */
    private volatile boolean f4519x;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.i$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private final tvc0 f4520a;

        public a(tvc0 tvc0Var) {
            this.f4520a = tvc0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f4520a.mo5643f()) {
                synchronized (C1072i.this) {
                    try {
                        if (C1072i.this.f4496a.m5472c(this.f4520a)) {
                            C1072i.this.m5458f(this.f4520a);
                        }
                        C1072i.this.m5461i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.i$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final tvc0 f4522a;

        public b(tvc0 tvc0Var) {
            this.f4522a = tvc0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f4522a.mo5643f()) {
                synchronized (C1072i.this) {
                    try {
                        if (C1072i.this.f4496a.m5472c(this.f4522a)) {
                            C1072i.this.f4517v.m5476a();
                            C1072i.this.m5459g(this.f4522a);
                            C1072i.this.m5467r(this.f4522a);
                        }
                        C1072i.this.m5461i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.i$c */
    @VisibleForTesting
    public static class c {
        /* JADX INFO: renamed from: a */
        public <R> C1076m<R> m5469a(rvc0<R> rvc0Var, boolean z, kxq kxqVar, C1076m.a aVar) {
            return new C1076m<>(rvc0Var, z, true, kxqVar, aVar);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.i$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        final tvc0 f4524a;

        /* JADX INFO: renamed from: b */
        final Executor f4525b;

        public d(tvc0 tvc0Var, Executor executor) {
            this.f4524a = tvc0Var;
            this.f4525b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f4524a.equals(((d) obj).f4524a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4524a.hashCode();
        }
    }

    @VisibleForTesting
    public C1072i(k1k k1kVar, k1k k1kVar2, k1k k1kVar3, k1k k1kVar4, InterfaceC1073j interfaceC1073j, C1076m.a aVar, hb80<C1072i<?>> hb80Var, c cVar) {
        this.f4496a = new e();
        this.f4497b = ovf0.m166181a();
        this.f4506k = new AtomicInteger();
        this.f4502g = k1kVar;
        this.f4503h = k1kVar2;
        this.f4504i = k1kVar3;
        this.f4505j = k1kVar4;
        this.f4501f = interfaceC1073j;
        this.f4498c = aVar;
        this.f4499d = hb80Var;
        this.f4500e = cVar;
    }

    /* JADX INFO: renamed from: j */
    private k1k m5454j() {
        if (this.f4509n) {
            return this.f4504i;
        }
        return this.f4510o ? this.f4505j : this.f4503h;
    }

    /* JADX INFO: renamed from: m */
    private boolean m5455m() {
        return this.f4516u || this.f4514s || this.f4519x;
    }

    /* JADX INFO: renamed from: q */
    private synchronized void m5456q() {
        if (this.f4507l == null) {
            throw new IllegalArgumentException();
        }
        this.f4496a.clear();
        this.f4507l = null;
        this.f4517v = null;
        this.f4512q = null;
        this.f4516u = false;
        this.f4519x = false;
        this.f4514s = false;
        this.f4518w.m5374B(false);
        this.f4518w = null;
        this.f4515t = null;
        this.f4513r = null;
        this.f4499d.release(this);
    }

    @Override // p149l.yvf.InterfaceC21545f
    @NonNull
    /* JADX INFO: renamed from: a */
    public ovf0 mo5376a() {
        return this.f4497b;
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC1058b
    /* JADX INFO: renamed from: b */
    public void mo5383b(GlideException glideException) {
        synchronized (this) {
            this.f4515t = glideException;
        }
        m5464n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC1058b
    /* JADX INFO: renamed from: c */
    public void mo5384c(rvc0<R> rvc0Var, DataSource dataSource) {
        synchronized (this) {
            this.f4512q = rvc0Var;
            this.f4513r = dataSource;
        }
        m5465o();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC1058b
    /* JADX INFO: renamed from: d */
    public void mo5385d(DecodeJob<?> decodeJob) {
        m5454j().execute(decodeJob);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m5457e(tvc0 tvc0Var, Executor executor) {
        try {
            this.f4497b.mo166183c();
            this.f4496a.m5471a(tvc0Var, executor);
            if (this.f4514s) {
                m5462k(1);
                executor.execute(new b(tvc0Var));
            } else if (this.f4516u) {
                m5462k(1);
                executor.execute(new a(tvc0Var));
            } else {
                qf80.m174273a(!this.f4519x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: f */
    public void m5458f(tvc0 tvc0Var) {
        try {
            tvc0Var.mo5639b(this.f4515t);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: g */
    public void m5459g(tvc0 tvc0Var) {
        try {
            tvc0Var.mo5640c(this.f4517v, this.f4513r);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m5460h() {
        if (m5455m()) {
            return;
        }
        this.f4519x = true;
        this.f4518w.m5380h();
        this.f4501f.mo5444b(this, this.f4507l);
    }

    /* JADX INFO: renamed from: i */
    public void m5461i() {
        C1076m<?> c1076m;
        synchronized (this) {
            try {
                this.f4497b.mo166183c();
                qf80.m174273a(m5455m(), "Not yet complete!");
                int iDecrementAndGet = this.f4506k.decrementAndGet();
                qf80.m174273a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    c1076m = this.f4517v;
                    m5456q();
                } else {
                    c1076m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1076m != null) {
            c1076m.m5479d();
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m5462k(int i) {
        C1076m<?> c1076m;
        qf80.m174273a(m5455m(), "Not yet complete!");
        if (this.f4506k.getAndAdd(i) == 0 && (c1076m = this.f4517v) != null) {
            c1076m.m5476a();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: l */
    public synchronized C1072i<R> m5463l(kxq kxqVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4507l = kxqVar;
        this.f4508m = z;
        this.f4509n = z2;
        this.f4510o = z3;
        this.f4511p = z4;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public void m5464n() {
        synchronized (this) {
            try {
                this.f4497b.mo166183c();
                if (this.f4519x) {
                    m5456q();
                    return;
                }
                if (this.f4496a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f4516u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f4516u = true;
                kxq kxqVar = this.f4507l;
                e eVarM5473f = this.f4496a.m5473f();
                m5462k(eVarM5473f.size() + 1);
                this.f4501f.mo5443a(this, kxqVar, null);
                for (d dVar : eVarM5473f) {
                    dVar.f4525b.execute(new a(dVar.f4524a));
                }
                m5461i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    public void m5465o() {
        synchronized (this) {
            try {
                this.f4497b.mo166183c();
                if (this.f4519x) {
                    this.f4512q.recycle();
                    m5456q();
                    return;
                }
                if (this.f4496a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f4514s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f4517v = this.f4500e.m5469a(this.f4512q, this.f4508m, this.f4507l, this.f4498c);
                this.f4514s = true;
                e eVarM5473f = this.f4496a.m5473f();
                m5462k(eVarM5473f.size() + 1);
                this.f4501f.mo5443a(this, this.f4507l, this.f4517v);
                for (d dVar : eVarM5473f) {
                    dVar.f4525b.execute(new b(dVar.f4524a));
                }
                m5461i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m5466p() {
        return this.f4511p;
    }

    /* JADX INFO: renamed from: r */
    public synchronized void m5467r(tvc0 tvc0Var) {
        try {
            this.f4497b.mo166183c();
            this.f4496a.m5474h(tvc0Var);
            if (this.f4496a.isEmpty()) {
                m5460h();
                if (this.f4514s || this.f4516u) {
                    if (this.f4506k.get() == 0) {
                        m5456q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m5468s(DecodeJob<R> decodeJob) {
        try {
            this.f4518w = decodeJob;
            (decodeJob.m5375K() ? this.f4502g : m5454j()).execute(decodeJob);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.i$e */
    public static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: a */
        private final List<d> f4526a;

        public e() {
            this(new ArrayList(2));
        }

        /* JADX INFO: renamed from: g */
        private static d m5470g(tvc0 tvc0Var) {
            return new d(tvc0Var, y5f.m212983a());
        }

        /* JADX INFO: renamed from: a */
        public void m5471a(tvc0 tvc0Var, Executor executor) {
            this.f4526a.add(new d(tvc0Var, executor));
        }

        /* JADX INFO: renamed from: c */
        public boolean m5472c(tvc0 tvc0Var) {
            return this.f4526a.contains(m5470g(tvc0Var));
        }

        public void clear() {
            this.f4526a.clear();
        }

        /* JADX INFO: renamed from: f */
        public e m5473f() {
            return new e(new ArrayList(this.f4526a));
        }

        /* JADX INFO: renamed from: h */
        public void m5474h(tvc0 tvc0Var) {
            this.f4526a.remove(m5470g(tvc0Var));
        }

        public boolean isEmpty() {
            return this.f4526a.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<d> iterator() {
            return this.f4526a.iterator();
        }

        public int size() {
            return this.f4526a.size();
        }

        public e(List<d> list) {
            this.f4526a = list;
        }
    }

    public C1072i(k1k k1kVar, k1k k1kVar2, k1k k1kVar3, k1k k1kVar4, InterfaceC1073j interfaceC1073j, C1076m.a aVar, hb80<C1072i<?>> hb80Var) {
        this(k1kVar, k1kVar2, k1kVar3, k1kVar4, interfaceC1073j, aVar, hb80Var, f4495y);
    }
}
