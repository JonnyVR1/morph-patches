package p133rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.internal.schedulers.C22356a;
import p149l.bud0;
import p149l.e7j0;
import p149l.ejd0;
import p149l.f31;
import p149l.fud0;
import p149l.jjd0;
import p149l.kjd0;
import p149l.mjm;
import p149l.rjd0;
import p149l.v5f;

/* JADX INFO: loaded from: classes3.dex */
public final class Schedulers {
    private static final AtomicReference<Schedulers> INSTANCE = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public final bud0 f207450a;

    /* JADX INFO: renamed from: b */
    public final bud0 f207451b;

    /* JADX INFO: renamed from: c */
    public final bud0 f207452c;

    public Schedulers() {
        kjd0 kjd0VarM141795f = jjd0.m141790c().m141795f();
        bud0 bud0VarM146224g = kjd0VarM141795f.m146224g();
        if (bud0VarM146224g != null) {
            this.f207450a = bud0VarM146224g;
        } else {
            this.f207450a = kjd0.m146217a();
        }
        bud0 bud0VarM146225i = kjd0VarM141795f.m146225i();
        if (bud0VarM146225i != null) {
            this.f207451b = bud0VarM146225i;
        } else {
            this.f207451b = kjd0.m146219c();
        }
        bud0 bud0VarM146226j = kjd0VarM141795f.m146226j();
        if (bud0VarM146226j != null) {
            this.f207452c = bud0VarM146226j;
        } else {
            this.f207452c = kjd0.m146221e();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Schedulers m221492a() {
        while (true) {
            AtomicReference<Schedulers> atomicReference = INSTANCE;
            Schedulers schedulers = atomicReference.get();
            if (schedulers != null) {
                return schedulers;
            }
            Schedulers schedulers2 = new Schedulers();
            if (f31.m119248a(atomicReference, null, schedulers2)) {
                return schedulers2;
            }
            schedulers2.m221494b();
        }
    }

    public static bud0 computation() {
        return ejd0.m116789f(m221492a().f207450a);
    }

    public static bud0 from(Executor executor) {
        return new v5f(executor);
    }

    public static bud0 immediate() {
        return mjm.INSTANCE;
    }

    /* JADX INFO: renamed from: io */
    public static bud0 m221493io() {
        return ejd0.m116794k(m221492a().f207451b);
    }

    public static bud0 newThread() {
        return ejd0.m116795l(m221492a().f207452c);
    }

    public static void reset() {
        Schedulers andSet = INSTANCE.getAndSet(null);
        if (andSet != null) {
            andSet.m221494b();
        }
    }

    public static void shutdown() {
        Schedulers schedulersM221492a = m221492a();
        schedulersM221492a.m221494b();
        synchronized (schedulersM221492a) {
            C22356a.INSTANCE.shutdown();
            rjd0.f159671h.shutdown();
            rjd0.f159672i.shutdown();
        }
    }

    public static void start() {
        Schedulers schedulersM221492a = m221492a();
        schedulersM221492a.m221495c();
        synchronized (schedulersM221492a) {
            C22356a.INSTANCE.start();
            rjd0.f159671h.start();
            rjd0.f159672i.start();
        }
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static bud0 trampoline() {
        return e7j0.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m221494b() {
        try {
            Object obj = this.f207450a;
            if (obj instanceof fud0) {
                ((fud0) obj).shutdown();
            }
            Object obj2 = this.f207451b;
            if (obj2 instanceof fud0) {
                ((fud0) obj2).shutdown();
            }
            Object obj3 = this.f207452c;
            if (obj3 instanceof fud0) {
                ((fud0) obj3).shutdown();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m221495c() {
        try {
            Object obj = this.f207450a;
            if (obj instanceof fud0) {
                ((fud0) obj).start();
            }
            Object obj2 = this.f207451b;
            if (obj2 instanceof fud0) {
                ((fud0) obj2).start();
            }
            Object obj3 = this.f207452c;
            if (obj3 instanceof fud0) {
                ((fud0) obj3).start();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
