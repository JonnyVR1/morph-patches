package p014rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import p003l.bud0;
import p003l.e7j0;
import p003l.ejd0;
import p003l.fud0;
import p003l.jjd0;
import p003l.kjd0;
import p003l.mjm;
import p003l.rjd0;
import p003l.v5f;
import p014rx.internal.schedulers.C1149a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class Schedulers {
    private static final AtomicReference<Schedulers> INSTANCE = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public final bud0 f11075a;

    /* JADX INFO: renamed from: b */
    public final bud0 f11076b;

    /* JADX INFO: renamed from: c */
    public final bud0 f11077c;

    public Schedulers() {
        kjd0 kjd0VarM5350f = jjd0.m5345c().m5350f();
        bud0 bud0VarM5692g = kjd0VarM5350f.m5692g();
        if (bud0VarM5692g != null) {
            this.f11075a = bud0VarM5692g;
        } else {
            this.f11075a = kjd0.m5685a();
        }
        bud0 bud0VarM5693i = kjd0VarM5350f.m5693i();
        if (bud0VarM5693i != null) {
            this.f11076b = bud0VarM5693i;
        } else {
            this.f11076b = kjd0.m5687c();
        }
        bud0 bud0VarM5694j = kjd0VarM5350f.m5694j();
        if (bud0VarM5694j != null) {
            this.f11077c = bud0VarM5694j;
        } else {
            this.f11077c = kjd0.m5689e();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Schedulers m9949a() {
        while (true) {
            AtomicReference<Schedulers> atomicReference = INSTANCE;
            Schedulers schedulers = atomicReference.get();
            if (schedulers != null) {
                return schedulers;
            }
            Schedulers schedulers2 = new Schedulers();
            if (f31.a(atomicReference, (Object) null, schedulers2)) {
                return schedulers2;
            }
            schedulers2.m9951b();
        }
    }

    public static bud0 computation() {
        return ejd0.m3860f(m9949a().f11075a);
    }

    public static bud0 from(Executor executor) {
        return new v5f(executor);
    }

    public static bud0 immediate() {
        return mjm.INSTANCE;
    }

    /* JADX INFO: renamed from: io */
    public static bud0 m9950io() {
        return ejd0.m3865k(m9949a().f11076b);
    }

    public static bud0 newThread() {
        return ejd0.m3866l(m9949a().f11077c);
    }

    public static void reset() {
        Schedulers andSet = INSTANCE.getAndSet(null);
        if (andSet != null) {
            andSet.m9951b();
        }
    }

    public static void shutdown() {
        Schedulers schedulersM9949a = m9949a();
        schedulersM9949a.m9951b();
        synchronized (schedulersM9949a) {
            C1149a.INSTANCE.shutdown();
            rjd0.f6939h.shutdown();
            rjd0.f6940i.shutdown();
        }
    }

    public static void start() {
        Schedulers schedulersM9949a = m9949a();
        schedulersM9949a.m9952c();
        synchronized (schedulersM9949a) {
            C1149a.INSTANCE.start();
            rjd0.f6939h.start();
            rjd0.f6940i.start();
        }
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static bud0 trampoline() {
        return e7j0.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m9951b() {
        try {
            Object obj = this.f11075a;
            if (obj instanceof fud0) {
                ((fud0) obj).shutdown();
            }
            Object obj2 = this.f11076b;
            if (obj2 instanceof fud0) {
                ((fud0) obj2).shutdown();
            }
            Object obj3 = this.f11077c;
            if (obj3 instanceof fud0) {
                ((fud0) obj3).shutdown();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m9952c() {
        try {
            Object obj = this.f11075a;
            if (obj instanceof fud0) {
                ((fud0) obj).start();
            }
            Object obj2 = this.f11076b;
            if (obj2 instanceof fud0) {
                ((fud0) obj2).start();
            }
            Object obj3 = this.f11077c;
            if (obj3 instanceof fud0) {
                ((fud0) obj3).start();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
