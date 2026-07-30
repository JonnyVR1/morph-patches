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
import p153l.a4k;
import p153l.e7f;
import p153l.kzq;
import p153l.mxf;
import p153l.nj80;
import p153l.u3d0;
import p153l.vn80;
import p153l.w3d0;
import p153l.x3g0;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.i */
/* JADX INFO: loaded from: classes.dex */
class C1082i<R> implements DecodeJob.InterfaceC1068b<R>, mxf.InterfaceC18738f {

    /* JADX INFO: renamed from: z */
    private static final c f4506z = new c();

    /* JADX INFO: renamed from: a */
    final e f4507a;

    /* JADX INFO: renamed from: b */
    private final x3g0 f4508b;

    /* JADX INFO: renamed from: c */
    private final C1086m.a f4509c;

    /* JADX INFO: renamed from: d */
    private final nj80<C1082i<?>> f4510d;

    /* JADX INFO: renamed from: e */
    private final c f4511e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1083j f4512f;

    /* JADX INFO: renamed from: g */
    private final a4k f4513g;

    /* JADX INFO: renamed from: h */
    private final a4k f4514h;

    /* JADX INFO: renamed from: i */
    private final a4k f4515i;

    /* JADX INFO: renamed from: j */
    private final a4k f4516j;

    /* JADX INFO: renamed from: k */
    private final AtomicInteger f4517k;

    /* JADX INFO: renamed from: l */
    private kzq f4518l;

    /* JADX INFO: renamed from: m */
    private boolean f4519m;

    /* JADX INFO: renamed from: n */
    private boolean f4520n;

    /* JADX INFO: renamed from: o */
    private boolean f4521o;

    /* JADX INFO: renamed from: p */
    private boolean f4522p;

    /* JADX INFO: renamed from: q */
    private u3d0<?> f4523q;

    /* JADX INFO: renamed from: r */
    DataSource f4524r;

    /* JADX INFO: renamed from: s */
    private boolean f4525s;

    /* JADX INFO: renamed from: t */
    GlideException f4526t;

    /* JADX INFO: renamed from: u */
    private boolean f4527u;

    /* JADX INFO: renamed from: v */
    C1086m<?> f4528v;

    /* JADX INFO: renamed from: w */
    private DecodeJob<R> f4529w;

    /* JADX INFO: renamed from: x */
    private volatile boolean f4530x;

    /* JADX INFO: renamed from: y */
    private boolean f4531y;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.i$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private final w3d0 f4532a;

        public a(w3d0 w3d0Var) {
            this.f4532a = w3d0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f4532a.mo5697f()) {
                synchronized (C1082i.this) {
                    try {
                        if (C1082i.this.f4507a.m5498c(this.f4532a)) {
                            C1082i.this.m5484f(this.f4532a);
                        }
                        C1082i.this.m5487i();
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
        private final w3d0 f4534a;

        public b(w3d0 w3d0Var) {
            this.f4534a = w3d0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f4534a.mo5697f()) {
                synchronized (C1082i.this) {
                    try {
                        if (C1082i.this.f4507a.m5498c(this.f4534a)) {
                            C1082i.this.f4528v.m5502a();
                            C1082i.this.m5485g(this.f4534a);
                            C1082i.this.m5493r(this.f4534a);
                        }
                        C1082i.this.m5487i();
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
        public <R> C1086m<R> m5495a(u3d0<R> u3d0Var, boolean z, kzq kzqVar, C1086m.a aVar) {
            return new C1086m<>(u3d0Var, z, true, kzqVar, aVar);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.i$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        final w3d0 f4536a;

        /* JADX INFO: renamed from: b */
        final Executor f4537b;

        public d(w3d0 w3d0Var, Executor executor) {
            this.f4536a = w3d0Var;
            this.f4537b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f4536a.equals(((d) obj).f4536a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4536a.hashCode();
        }
    }

    @VisibleForTesting
    public C1082i(a4k a4kVar, a4k a4kVar2, a4k a4kVar3, a4k a4kVar4, InterfaceC1083j interfaceC1083j, C1086m.a aVar, nj80<C1082i<?>> nj80Var, c cVar) {
        this.f4507a = new e();
        this.f4508b = x3g0.m209209a();
        this.f4517k = new AtomicInteger();
        this.f4513g = a4kVar;
        this.f4514h = a4kVar2;
        this.f4515i = a4kVar3;
        this.f4516j = a4kVar4;
        this.f4512f = interfaceC1083j;
        this.f4509c = aVar;
        this.f4510d = nj80Var;
        this.f4511e = cVar;
    }

    /* JADX INFO: renamed from: j */
    private a4k m5480j() {
        if (this.f4520n) {
            return this.f4515i;
        }
        return this.f4521o ? this.f4516j : this.f4514h;
    }

    /* JADX INFO: renamed from: m */
    private boolean m5481m() {
        return this.f4527u || this.f4525s || this.f4530x;
    }

    /* JADX INFO: renamed from: q */
    private synchronized void m5482q() {
        if (this.f4518l == null) {
            throw new IllegalArgumentException();
        }
        this.f4507a.clear();
        this.f4518l = null;
        this.f4528v = null;
        this.f4523q = null;
        this.f4527u = false;
        this.f4530x = false;
        this.f4525s = false;
        this.f4531y = false;
        this.f4529w.m5399B(false);
        this.f4529w = null;
        this.f4526t = null;
        this.f4524r = null;
        this.f4510d.release(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC1068b
    /* JADX INFO: renamed from: a */
    public void mo5408a(u3d0<R> u3d0Var, DataSource dataSource, boolean z) {
        synchronized (this) {
            this.f4523q = u3d0Var;
            this.f4524r = dataSource;
            this.f4531y = z;
        }
        m5491o();
    }

    @Override // p153l.mxf.InterfaceC18738f
    @NonNull
    /* JADX INFO: renamed from: b */
    public x3g0 mo5402b() {
        return this.f4508b;
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC1068b
    /* JADX INFO: renamed from: c */
    public void mo5409c(GlideException glideException) {
        synchronized (this) {
            this.f4526t = glideException;
        }
        m5490n();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC1068b
    /* JADX INFO: renamed from: d */
    public void mo5410d(DecodeJob<?> decodeJob) {
        m5480j().execute(decodeJob);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m5483e(w3d0 w3d0Var, Executor executor) {
        try {
            this.f4508b.mo209211c();
            this.f4507a.m5497a(w3d0Var, executor);
            if (this.f4525s) {
                m5488k(1);
                executor.execute(new b(w3d0Var));
            } else if (this.f4527u) {
                m5488k(1);
                executor.execute(new a(w3d0Var));
            } else {
                vn80.m201941a(!this.f4530x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: f */
    public void m5484f(w3d0 w3d0Var) {
        try {
            w3d0Var.mo5694c(this.f4526t);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: g */
    public void m5485g(w3d0 w3d0Var) {
        try {
            w3d0Var.mo5693a(this.f4528v, this.f4524r, this.f4531y);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m5486h() {
        if (m5481m()) {
            return;
        }
        this.f4530x = true;
        this.f4529w.m5401a();
        this.f4512f.mo5470b(this, this.f4518l);
    }

    /* JADX INFO: renamed from: i */
    public void m5487i() {
        C1086m<?> c1086m;
        synchronized (this) {
            try {
                this.f4508b.mo209211c();
                vn80.m201941a(m5481m(), "Not yet complete!");
                int iDecrementAndGet = this.f4517k.decrementAndGet();
                vn80.m201941a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    c1086m = this.f4528v;
                    m5482q();
                } else {
                    c1086m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1086m != null) {
            c1086m.m5505d();
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m5488k(int i) {
        C1086m<?> c1086m;
        vn80.m201941a(m5481m(), "Not yet complete!");
        if (this.f4517k.getAndAdd(i) == 0 && (c1086m = this.f4528v) != null) {
            c1086m.m5502a();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: l */
    public synchronized C1082i<R> m5489l(kzq kzqVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4518l = kzqVar;
        this.f4519m = z;
        this.f4520n = z2;
        this.f4521o = z3;
        this.f4522p = z4;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public void m5490n() {
        synchronized (this) {
            try {
                this.f4508b.mo209211c();
                if (this.f4530x) {
                    m5482q();
                    return;
                }
                if (this.f4507a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f4527u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f4527u = true;
                kzq kzqVar = this.f4518l;
                e eVarM5499f = this.f4507a.m5499f();
                m5488k(eVarM5499f.size() + 1);
                this.f4512f.mo5469a(this, kzqVar, null);
                for (d dVar : eVarM5499f) {
                    dVar.f4537b.execute(new a(dVar.f4536a));
                }
                m5487i();
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
    public void m5491o() {
        synchronized (this) {
            try {
                this.f4508b.mo209211c();
                if (this.f4530x) {
                    this.f4523q.recycle();
                    m5482q();
                    return;
                }
                if (this.f4507a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f4525s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f4528v = this.f4511e.m5495a(this.f4523q, this.f4519m, this.f4518l, this.f4509c);
                this.f4525s = true;
                e eVarM5499f = this.f4507a.m5499f();
                m5488k(eVarM5499f.size() + 1);
                this.f4512f.mo5469a(this, this.f4518l, this.f4528v);
                for (d dVar : eVarM5499f) {
                    dVar.f4537b.execute(new b(dVar.f4536a));
                }
                m5487i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m5492p() {
        return this.f4522p;
    }

    /* JADX INFO: renamed from: r */
    public synchronized void m5493r(w3d0 w3d0Var) {
        try {
            this.f4508b.mo209211c();
            this.f4507a.m5500h(w3d0Var);
            if (this.f4507a.isEmpty()) {
                m5486h();
                if (this.f4525s || this.f4527u) {
                    if (this.f4517k.get() == 0) {
                        m5482q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m5494s(DecodeJob<R> decodeJob) {
        try {
            this.f4529w = decodeJob;
            (decodeJob.m5400K() ? this.f4513g : m5480j()).execute(decodeJob);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.i$e */
    public static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: a */
        private final List<d> f4538a;

        public e() {
            this(new ArrayList(2));
        }

        /* JADX INFO: renamed from: g */
        private static d m5496g(w3d0 w3d0Var) {
            return new d(w3d0Var, e7f.m119706a());
        }

        /* JADX INFO: renamed from: a */
        public void m5497a(w3d0 w3d0Var, Executor executor) {
            this.f4538a.add(new d(w3d0Var, executor));
        }

        /* JADX INFO: renamed from: c */
        public boolean m5498c(w3d0 w3d0Var) {
            return this.f4538a.contains(m5496g(w3d0Var));
        }

        public void clear() {
            this.f4538a.clear();
        }

        /* JADX INFO: renamed from: f */
        public e m5499f() {
            return new e(new ArrayList(this.f4538a));
        }

        /* JADX INFO: renamed from: h */
        public void m5500h(w3d0 w3d0Var) {
            this.f4538a.remove(m5496g(w3d0Var));
        }

        public boolean isEmpty() {
            return this.f4538a.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<d> iterator() {
            return this.f4538a.iterator();
        }

        public int size() {
            return this.f4538a.size();
        }

        public e(List<d> list) {
            this.f4538a = list;
        }
    }

    public C1082i(a4k a4kVar, a4k a4kVar2, a4k a4kVar3, a4k a4kVar4, InterfaceC1083j interfaceC1083j, C1086m.a aVar, nj80<C1082i<?>> nj80Var) {
        this(a4kVar, a4kVar2, a4kVar3, a4kVar4, interfaceC1083j, aVar, nj80Var, f4506z);
    }
}
