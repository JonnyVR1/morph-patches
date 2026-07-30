package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.C1059c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p153l.a4e;
import p153l.a4k;
import p153l.d4e;
import p153l.izv;
import p153l.kzq;
import p153l.lpy;
import p153l.mxf;
import p153l.nj80;
import p153l.tgj0;
import p153l.u3d0;
import p153l.u560;
import p153l.vn80;
import p153l.w3d0;
import p153l.wg3;
import p153l.z3e;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.h */
/* JADX INFO: loaded from: classes.dex */
public class C1081h implements InterfaceC1083j, lpy.InterfaceC18440a, C1086m.a {

    /* JADX INFO: renamed from: i */
    private static final boolean f4480i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a */
    private final C1087n f4481a;

    /* JADX INFO: renamed from: b */
    private final C1085l f4482b;

    /* JADX INFO: renamed from: c */
    private final lpy f4483c;

    /* JADX INFO: renamed from: d */
    private final b f4484d;

    /* JADX INFO: renamed from: e */
    private final C1092s f4485e;

    /* JADX INFO: renamed from: f */
    private final c f4486f;

    /* JADX INFO: renamed from: g */
    private final a f4487g;

    /* JADX INFO: renamed from: h */
    private final C1074a f4488h;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$a */
    @VisibleForTesting
    public static class a {

        /* JADX INFO: renamed from: a */
        final DecodeJob.InterfaceC1071e f4489a;

        /* JADX INFO: renamed from: b */
        final nj80<DecodeJob<?>> f4490b = mxf.m160653d(150, new C22776a());

        /* JADX INFO: renamed from: c */
        private int f4491c;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$a$a, reason: collision with other inner class name */
        public class C22776a implements mxf.InterfaceC18736d<DecodeJob<?>> {
            public C22776a() {
            }

            @Override // p153l.mxf.InterfaceC18736d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public DecodeJob<?> create() {
                a aVar = a.this;
                return new DecodeJob<>(aVar.f4489a, aVar.f4490b);
            }
        }

        public a(DecodeJob.InterfaceC1071e interfaceC1071e) {
            this.f4489a = interfaceC1071e;
        }

        /* JADX INFO: renamed from: a */
        public <R> DecodeJob<R> m5475a(C1059c c1059c, Object obj, C1084k c1084k, kzq kzqVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, d4e d4eVar, Map<Class<?>, tgj0<?>> map, boolean z, boolean z2, boolean z3, u560 u560Var, DecodeJob.InterfaceC1068b<R> interfaceC1068b) {
            DecodeJob decodeJob = (DecodeJob) vn80.m201944d(this.f4490b.acquire());
            int i3 = this.f4491c;
            this.f4491c = i3 + 1;
            return decodeJob.m5407s(c1059c, obj, c1084k, kzqVar, i, i2, cls, cls2, priority, d4eVar, map, z, z2, z3, u560Var, interfaceC1068b, i3);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$b */
    @VisibleForTesting
    public static class b {

        /* JADX INFO: renamed from: a */
        final a4k f4493a;

        /* JADX INFO: renamed from: b */
        final a4k f4494b;

        /* JADX INFO: renamed from: c */
        final a4k f4495c;

        /* JADX INFO: renamed from: d */
        final a4k f4496d;

        /* JADX INFO: renamed from: e */
        final InterfaceC1083j f4497e;

        /* JADX INFO: renamed from: f */
        final C1086m.a f4498f;

        /* JADX INFO: renamed from: g */
        final nj80<C1082i<?>> f4499g = mxf.m160653d(150, new a());

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$b$a */
        public class a implements mxf.InterfaceC18736d<C1082i<?>> {
            public a() {
            }

            @Override // p153l.mxf.InterfaceC18736d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C1082i<?> create() {
                b bVar = b.this;
                return new C1082i<>(bVar.f4493a, bVar.f4494b, bVar.f4495c, bVar.f4496d, bVar.f4497e, bVar.f4498f, bVar.f4499g);
            }
        }

        public b(a4k a4kVar, a4k a4kVar2, a4k a4kVar3, a4k a4kVar4, InterfaceC1083j interfaceC1083j, C1086m.a aVar) {
            this.f4493a = a4kVar;
            this.f4494b = a4kVar2;
            this.f4495c = a4kVar3;
            this.f4496d = a4kVar4;
            this.f4497e = interfaceC1083j;
            this.f4498f = aVar;
        }

        /* JADX INFO: renamed from: a */
        public <R> C1082i<R> m5477a(kzq kzqVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C1082i) vn80.m201944d(this.f4499g.acquire())).m5489l(kzqVar, z, z2, z3, z4);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$c */
    public static class c implements DecodeJob.InterfaceC1071e {

        /* JADX INFO: renamed from: a */
        private final z3e.InterfaceC21755a f4501a;

        /* JADX INFO: renamed from: b */
        private volatile z3e f4502b;

        public c(z3e.InterfaceC21755a interfaceC21755a) {
            this.f4501a = interfaceC21755a;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC1071e
        /* JADX INFO: renamed from: a */
        public z3e mo5416a() {
            if (this.f4502b == null) {
                synchronized (this) {
                    try {
                        if (this.f4502b == null) {
                            this.f4502b = this.f4501a.build();
                        }
                        if (this.f4502b == null) {
                            this.f4502b = new a4e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f4502b;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$d */
    public class d {

        /* JADX INFO: renamed from: a */
        private final C1082i<?> f4503a;

        /* JADX INFO: renamed from: b */
        private final w3d0 f4504b;

        public d(w3d0 w3d0Var, C1082i<?> c1082i) {
            this.f4504b = w3d0Var;
            this.f4503a = c1082i;
        }

        /* JADX INFO: renamed from: a */
        public void m5479a() {
            synchronized (C1081h.this) {
                this.f4503a.m5493r(this.f4504b);
            }
        }
    }

    @VisibleForTesting
    public C1081h(lpy lpyVar, z3e.InterfaceC21755a interfaceC21755a, a4k a4kVar, a4k a4kVar2, a4k a4kVar3, a4k a4kVar4, C1087n c1087n, C1085l c1085l, C1074a c1074a, b bVar, a aVar, C1092s c1092s, boolean z) {
        this.f4483c = lpyVar;
        c cVar = new c(interfaceC21755a);
        this.f4486f = cVar;
        C1074a c1074a2 = c1074a == null ? new C1074a(z) : c1074a;
        this.f4488h = c1074a2;
        c1074a2.m5428f(this);
        this.f4482b = c1085l == null ? new C1085l() : c1085l;
        this.f4481a = c1087n == null ? new C1087n() : c1087n;
        this.f4484d = bVar == null ? new b(a4kVar, a4kVar2, a4kVar3, a4kVar4, this, this) : bVar;
        this.f4487g = aVar == null ? new a(cVar) : aVar;
        this.f4485e = c1092s == null ? new C1092s() : c1092s;
        lpyVar.mo104371c(this);
    }

    /* JADX INFO: renamed from: e */
    private C1086m<?> m5463e(kzq kzqVar) {
        u3d0<?> u3d0VarMo104373e = this.f4483c.mo104373e(kzqVar);
        if (u3d0VarMo104373e == null) {
            return null;
        }
        return u3d0VarMo104373e instanceof C1086m ? (C1086m) u3d0VarMo104373e : new C1086m<>(u3d0VarMo104373e, true, true, kzqVar, this);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    private C1086m<?> m5464g(kzq kzqVar) {
        C1086m<?> c1086mM5427e = this.f4488h.m5427e(kzqVar);
        if (c1086mM5427e != null) {
            c1086mM5427e.m5502a();
        }
        return c1086mM5427e;
    }

    /* JADX INFO: renamed from: h */
    private C1086m<?> m5465h(kzq kzqVar) {
        C1086m<?> c1086mM5463e = m5463e(kzqVar);
        if (c1086mM5463e != null) {
            c1086mM5463e.m5502a();
            this.f4488h.m5423a(kzqVar, c1086mM5463e);
        }
        return c1086mM5463e;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    private C1086m<?> m5466i(C1084k c1084k, boolean z, long j) {
        if (!z) {
            return null;
        }
        C1086m<?> c1086mM5464g = m5464g(c1084k);
        if (c1086mM5464g != null) {
            if (f4480i) {
                m5467j("Loaded resource from active resources", j, c1084k);
            }
            return c1086mM5464g;
        }
        C1086m<?> c1086mM5465h = m5465h(c1084k);
        if (c1086mM5465h == null) {
            return null;
        }
        if (f4480i) {
            m5467j("Loaded resource from cache", j, c1084k);
        }
        return c1086mM5465h;
    }

    /* JADX INFO: renamed from: j */
    private static void m5467j(String str, long j, kzq kzqVar) {
        izv.m142878a(j);
        Objects.toString(kzqVar);
    }

    /* JADX INFO: renamed from: l */
    private <R> d m5468l(C1059c c1059c, Object obj, kzq kzqVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, d4e d4eVar, Map<Class<?>, tgj0<?>> map, boolean z, boolean z2, u560 u560Var, boolean z3, boolean z4, boolean z5, boolean z6, w3d0 w3d0Var, Executor executor, C1084k c1084k, long j) {
        C1082i<?> c1082iM5507a = this.f4481a.m5507a(c1084k, z6);
        if (c1082iM5507a != null) {
            c1082iM5507a.m5483e(w3d0Var, executor);
            if (f4480i) {
                m5467j("Added to existing load", j, c1084k);
            }
            return new d(w3d0Var, c1082iM5507a);
        }
        C1082i<R> c1082iM5477a = this.f4484d.m5477a(c1084k, z3, z4, z5, z6);
        DecodeJob<R> decodeJobM5475a = this.f4487g.m5475a(c1059c, obj, c1084k, kzqVar, i, i2, cls, cls2, priority, d4eVar, map, z, z2, z6, u560Var, c1082iM5477a);
        this.f4481a.m5508c(c1084k, c1082iM5477a);
        c1082iM5477a.m5483e(w3d0Var, executor);
        c1082iM5477a.m5494s(decodeJobM5475a);
        if (f4480i) {
            m5467j("Started new load", j, c1084k);
        }
        return new d(w3d0Var, c1082iM5477a);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1083j
    /* JADX INFO: renamed from: a */
    public synchronized void mo5469a(C1082i<?> c1082i, kzq kzqVar, C1086m<?> c1086m) {
        if (c1086m != null) {
            try {
                if (c1086m.m5504c()) {
                    this.f4488h.m5423a(kzqVar, c1086m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4481a.m5509d(kzqVar, c1082i);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1083j
    /* JADX INFO: renamed from: b */
    public synchronized void mo5470b(C1082i<?> c1082i, kzq kzqVar) {
        this.f4481a.m5509d(kzqVar, c1082i);
    }

    @Override // p153l.lpy.InterfaceC18440a
    /* JADX INFO: renamed from: c */
    public void mo5471c(@NonNull u3d0<?> u3d0Var) {
        this.f4485e.m5519a(u3d0Var, true);
    }

    @Override // com.bumptech.glide.load.engine.C1086m.a
    /* JADX INFO: renamed from: d */
    public void mo5472d(kzq kzqVar, C1086m<?> c1086m) {
        this.f4488h.m5426d(kzqVar);
        if (c1086m.m5504c()) {
            this.f4483c.mo104372d(kzqVar, c1086m);
        } else {
            this.f4485e.m5519a(c1086m, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public <R> d m5473f(C1059c c1059c, Object obj, kzq kzqVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, d4e d4eVar, Map<Class<?>, tgj0<?>> map, boolean z, boolean z2, u560 u560Var, boolean z3, boolean z4, boolean z5, boolean z6, w3d0 w3d0Var, Executor executor) {
        long jM142879b = f4480i ? izv.m142879b() : 0L;
        C1084k c1084kM5501a = this.f4482b.m5501a(obj, kzqVar, i, i2, map, cls, cls2, u560Var);
        synchronized (this) {
            try {
                C1086m<?> c1086mM5466i = m5466i(c1084kM5501a, z3, jM142879b);
                if (c1086mM5466i == null) {
                    return m5468l(c1059c, obj, kzqVar, i, i2, cls, cls2, priority, d4eVar, map, z, z2, u560Var, z3, z4, z5, z6, w3d0Var, executor, c1084kM5501a, jM142879b);
                }
                w3d0Var.mo5693a(c1086mM5466i, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m5474k(u3d0<?> u3d0Var) {
        if (u3d0Var instanceof C1086m) {
            ((C1086m) u3d0Var).m5505d();
        } else {
            wg3.m206174a("Cannot release anything but an EngineResource");
        }
    }

    public C1081h(lpy lpyVar, z3e.InterfaceC21755a interfaceC21755a, a4k a4kVar, a4k a4kVar2, a4k a4kVar3, a4k a4kVar4, boolean z) {
        this(lpyVar, interfaceC21755a, a4kVar, a4kVar2, a4kVar3, a4kVar4, null, null, null, null, null, null, z);
    }
}
