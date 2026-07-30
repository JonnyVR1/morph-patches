package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.C1055c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p149l.hb80;
import p149l.ig3;
import p149l.k1k;
import p149l.kxq;
import p149l.kxv;
import p149l.l2e;
import p149l.m2e;
import p149l.ogy;
import p149l.p2e;
import p149l.p7j0;
import p149l.px50;
import p149l.qf80;
import p149l.rvc0;
import p149l.tvc0;
import p149l.yvf;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.h */
/* JADX INFO: loaded from: classes.dex */
public class C1071h implements InterfaceC1073j, ogy.InterfaceC18933a, C1076m.a {

    /* JADX INFO: renamed from: i */
    private static final boolean f4469i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a */
    private final C1077n f4470a;

    /* JADX INFO: renamed from: b */
    private final C1075l f4471b;

    /* JADX INFO: renamed from: c */
    private final ogy f4472c;

    /* JADX INFO: renamed from: d */
    private final b f4473d;

    /* JADX INFO: renamed from: e */
    private final C1082s f4474e;

    /* JADX INFO: renamed from: f */
    private final c f4475f;

    /* JADX INFO: renamed from: g */
    private final a f4476g;

    /* JADX INFO: renamed from: h */
    private final C1064a f4477h;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$a */
    @VisibleForTesting
    public static class a {

        /* JADX INFO: renamed from: a */
        final DecodeJob.InterfaceC1061e f4478a;

        /* JADX INFO: renamed from: b */
        final hb80<DecodeJob<?>> f4479b = yvf.m216209d(150, new C22661a());

        /* JADX INFO: renamed from: c */
        private int f4480c;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$a$a, reason: collision with other inner class name */
        public class C22661a implements yvf.InterfaceC21543d<DecodeJob<?>> {
            public C22661a() {
            }

            @Override // p149l.yvf.InterfaceC21543d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public DecodeJob<?> create() {
                a aVar = a.this;
                return new DecodeJob<>(aVar.f4478a, aVar.f4479b);
            }
        }

        public a(DecodeJob.InterfaceC1061e interfaceC1061e) {
            this.f4478a = interfaceC1061e;
        }

        /* JADX INFO: renamed from: a */
        public <R> DecodeJob<R> m5449a(C1055c c1055c, Object obj, C1074k c1074k, kxq kxqVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, p2e p2eVar, Map<Class<?>, p7j0<?>> map, boolean z, boolean z2, boolean z3, px50 px50Var, DecodeJob.InterfaceC1058b<R> interfaceC1058b) {
            DecodeJob decodeJob = (DecodeJob) qf80.m174276d(this.f4479b.acquire());
            int i3 = this.f4480c;
            this.f4480c = i3 + 1;
            return decodeJob.m5382s(c1055c, obj, c1074k, kxqVar, i, i2, cls, cls2, priority, p2eVar, map, z, z2, z3, px50Var, interfaceC1058b, i3);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$b */
    @VisibleForTesting
    public static class b {

        /* JADX INFO: renamed from: a */
        final k1k f4482a;

        /* JADX INFO: renamed from: b */
        final k1k f4483b;

        /* JADX INFO: renamed from: c */
        final k1k f4484c;

        /* JADX INFO: renamed from: d */
        final k1k f4485d;

        /* JADX INFO: renamed from: e */
        final InterfaceC1073j f4486e;

        /* JADX INFO: renamed from: f */
        final C1076m.a f4487f;

        /* JADX INFO: renamed from: g */
        final hb80<C1072i<?>> f4488g = yvf.m216209d(150, new a());

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$b$a */
        public class a implements yvf.InterfaceC21543d<C1072i<?>> {
            public a() {
            }

            @Override // p149l.yvf.InterfaceC21543d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C1072i<?> create() {
                b bVar = b.this;
                return new C1072i<>(bVar.f4482a, bVar.f4483b, bVar.f4484c, bVar.f4485d, bVar.f4486e, bVar.f4487f, bVar.f4488g);
            }
        }

        public b(k1k k1kVar, k1k k1kVar2, k1k k1kVar3, k1k k1kVar4, InterfaceC1073j interfaceC1073j, C1076m.a aVar) {
            this.f4482a = k1kVar;
            this.f4483b = k1kVar2;
            this.f4484c = k1kVar3;
            this.f4485d = k1kVar4;
            this.f4486e = interfaceC1073j;
            this.f4487f = aVar;
        }

        /* JADX INFO: renamed from: a */
        public <R> C1072i<R> m5451a(kxq kxqVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C1072i) qf80.m174276d(this.f4488g.acquire())).m5463l(kxqVar, z, z2, z3, z4);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$c */
    public static class c implements DecodeJob.InterfaceC1061e {

        /* JADX INFO: renamed from: a */
        private final l2e.InterfaceC18139a f4490a;

        /* JADX INFO: renamed from: b */
        private volatile l2e f4491b;

        public c(l2e.InterfaceC18139a interfaceC18139a) {
            this.f4490a = interfaceC18139a;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC1061e
        /* JADX INFO: renamed from: a */
        public l2e mo5391a() {
            if (this.f4491b == null) {
                synchronized (this) {
                    try {
                        if (this.f4491b == null) {
                            this.f4491b = this.f4490a.build();
                        }
                        if (this.f4491b == null) {
                            this.f4491b = new m2e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f4491b;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$d */
    public class d {

        /* JADX INFO: renamed from: a */
        private final C1072i<?> f4492a;

        /* JADX INFO: renamed from: b */
        private final tvc0 f4493b;

        public d(tvc0 tvc0Var, C1072i<?> c1072i) {
            this.f4493b = tvc0Var;
            this.f4492a = c1072i;
        }

        /* JADX INFO: renamed from: a */
        public void m5453a() {
            synchronized (C1071h.this) {
                this.f4492a.m5467r(this.f4493b);
            }
        }
    }

    @VisibleForTesting
    public C1071h(ogy ogyVar, l2e.InterfaceC18139a interfaceC18139a, k1k k1kVar, k1k k1kVar2, k1k k1kVar3, k1k k1kVar4, C1077n c1077n, C1075l c1075l, C1064a c1064a, b bVar, a aVar, C1082s c1082s, boolean z) {
        this.f4472c = ogyVar;
        c cVar = new c(interfaceC18139a);
        this.f4475f = cVar;
        C1064a c1064a2 = c1064a == null ? new C1064a(z) : c1064a;
        this.f4477h = c1064a2;
        c1064a2.m5403f(this);
        this.f4471b = c1075l == null ? new C1075l() : c1075l;
        this.f4470a = c1077n == null ? new C1077n() : c1077n;
        this.f4473d = bVar == null ? new b(k1kVar, k1kVar2, k1kVar3, k1kVar4, this, this) : bVar;
        this.f4476g = aVar == null ? new a(cVar) : aVar;
        this.f4474e = c1082s == null ? new C1082s() : c1082s;
        ogyVar.mo111503c(this);
    }

    /* JADX INFO: renamed from: e */
    private C1076m<?> m5437e(kxq kxqVar) {
        rvc0<?> rvc0VarMo111505e = this.f4472c.mo111505e(kxqVar);
        if (rvc0VarMo111505e == null) {
            return null;
        }
        return rvc0VarMo111505e instanceof C1076m ? (C1076m) rvc0VarMo111505e : new C1076m<>(rvc0VarMo111505e, true, true, kxqVar, this);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    private C1076m<?> m5438g(kxq kxqVar) {
        C1076m<?> c1076mM5402e = this.f4477h.m5402e(kxqVar);
        if (c1076mM5402e != null) {
            c1076mM5402e.m5476a();
        }
        return c1076mM5402e;
    }

    /* JADX INFO: renamed from: h */
    private C1076m<?> m5439h(kxq kxqVar) {
        C1076m<?> c1076mM5437e = m5437e(kxqVar);
        if (c1076mM5437e != null) {
            c1076mM5437e.m5476a();
            this.f4477h.m5398a(kxqVar, c1076mM5437e);
        }
        return c1076mM5437e;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    private C1076m<?> m5440i(C1074k c1074k, boolean z, long j) {
        if (!z) {
            return null;
        }
        C1076m<?> c1076mM5438g = m5438g(c1074k);
        if (c1076mM5438g != null) {
            if (f4469i) {
                m5441j("Loaded resource from active resources", j, c1074k);
            }
            return c1076mM5438g;
        }
        C1076m<?> c1076mM5439h = m5439h(c1074k);
        if (c1076mM5439h == null) {
            return null;
        }
        if (f4469i) {
            m5441j("Loaded resource from cache", j, c1074k);
        }
        return c1076mM5439h;
    }

    /* JADX INFO: renamed from: j */
    private static void m5441j(String str, long j, kxq kxqVar) {
        kxv.m147807a(j);
        Objects.toString(kxqVar);
    }

    /* JADX INFO: renamed from: l */
    private <R> d m5442l(C1055c c1055c, Object obj, kxq kxqVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, p2e p2eVar, Map<Class<?>, p7j0<?>> map, boolean z, boolean z2, px50 px50Var, boolean z3, boolean z4, boolean z5, boolean z6, tvc0 tvc0Var, Executor executor, C1074k c1074k, long j) {
        C1072i<?> c1072iM5481a = this.f4470a.m5481a(c1074k, z6);
        if (c1072iM5481a != null) {
            c1072iM5481a.m5457e(tvc0Var, executor);
            if (f4469i) {
                m5441j("Added to existing load", j, c1074k);
            }
            return new d(tvc0Var, c1072iM5481a);
        }
        C1072i<R> c1072iM5451a = this.f4473d.m5451a(c1074k, z3, z4, z5, z6);
        DecodeJob<R> decodeJobM5449a = this.f4476g.m5449a(c1055c, obj, c1074k, kxqVar, i, i2, cls, cls2, priority, p2eVar, map, z, z2, z6, px50Var, c1072iM5451a);
        this.f4470a.m5482c(c1074k, c1072iM5451a);
        c1072iM5451a.m5457e(tvc0Var, executor);
        c1072iM5451a.m5468s(decodeJobM5449a);
        if (f4469i) {
            m5441j("Started new load", j, c1074k);
        }
        return new d(tvc0Var, c1072iM5451a);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1073j
    /* JADX INFO: renamed from: a */
    public synchronized void mo5443a(C1072i<?> c1072i, kxq kxqVar, C1076m<?> c1076m) {
        if (c1076m != null) {
            try {
                if (c1076m.m5478c()) {
                    this.f4477h.m5398a(kxqVar, c1076m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4470a.m5483d(kxqVar, c1072i);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1073j
    /* JADX INFO: renamed from: b */
    public synchronized void mo5444b(C1072i<?> c1072i, kxq kxqVar) {
        this.f4470a.m5483d(kxqVar, c1072i);
    }

    @Override // p149l.ogy.InterfaceC18933a
    /* JADX INFO: renamed from: c */
    public void mo5445c(@NonNull rvc0<?> rvc0Var) {
        this.f4474e.m5493a(rvc0Var, true);
    }

    @Override // com.bumptech.glide.load.engine.C1076m.a
    /* JADX INFO: renamed from: d */
    public void mo5446d(kxq kxqVar, C1076m<?> c1076m) {
        this.f4477h.m5401d(kxqVar);
        if (c1076m.m5478c()) {
            this.f4472c.mo111504d(kxqVar, c1076m);
        } else {
            this.f4474e.m5493a(c1076m, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public <R> d m5447f(C1055c c1055c, Object obj, kxq kxqVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, p2e p2eVar, Map<Class<?>, p7j0<?>> map, boolean z, boolean z2, px50 px50Var, boolean z3, boolean z4, boolean z5, boolean z6, tvc0 tvc0Var, Executor executor) {
        long jM147808b = f4469i ? kxv.m147808b() : 0L;
        C1074k c1074kM5475a = this.f4471b.m5475a(obj, kxqVar, i, i2, map, cls, cls2, px50Var);
        synchronized (this) {
            try {
                C1076m<?> c1076mM5440i = m5440i(c1074kM5475a, z3, jM147808b);
                if (c1076mM5440i == null) {
                    return m5442l(c1055c, obj, kxqVar, i, i2, cls, cls2, priority, p2eVar, map, z, z2, px50Var, z3, z4, z5, z6, tvc0Var, executor, c1074kM5475a, jM147808b);
                }
                tvc0Var.mo5640c(c1076mM5440i, DataSource.MEMORY_CACHE);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m5448k(rvc0<?> rvc0Var) {
        if (rvc0Var instanceof C1076m) {
            ((C1076m) rvc0Var).m5479d();
        } else {
            ig3.m135964a("Cannot release anything but an EngineResource");
        }
    }

    public C1071h(ogy ogyVar, l2e.InterfaceC18139a interfaceC18139a, k1k k1kVar, k1k k1kVar2, k1k k1kVar3, k1k k1kVar4, boolean z) {
        this(ogyVar, interfaceC18139a, k1kVar, k1kVar2, k1kVar3, k1kVar4, null, null, null, null, null, null, z);
    }
}
