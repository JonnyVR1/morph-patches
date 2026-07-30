package p137rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.internal.schedulers.C22471a;
import p153l.b7f;
import p153l.f2e0;
import p153l.hrd0;
import p153l.igj0;
import p153l.j2e0;
import p153l.m31;
import p153l.mrd0;
import p153l.nrd0;
import p153l.olm;
import p153l.urd0;

/* JADX INFO: loaded from: classes3.dex */
public final class Schedulers {
    private static final AtomicReference<Schedulers> INSTANCE = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public final f2e0 f208372a;

    /* JADX INFO: renamed from: b */
    public final f2e0 f208373b;

    /* JADX INFO: renamed from: c */
    public final f2e0 f208374c;

    public Schedulers() {
        nrd0 nrd0VarM159679f = mrd0.m159674c().m159679f();
        f2e0 f2e0VarM164477g = nrd0VarM159679f.m164477g();
        if (f2e0VarM164477g != null) {
            this.f208372a = f2e0VarM164477g;
        } else {
            this.f208372a = nrd0.m164470a();
        }
        f2e0 f2e0VarM164478i = nrd0VarM159679f.m164478i();
        if (f2e0VarM164478i != null) {
            this.f208373b = f2e0VarM164478i;
        } else {
            this.f208373b = nrd0.m164472c();
        }
        f2e0 f2e0VarM164479j = nrd0VarM159679f.m164479j();
        if (f2e0VarM164479j != null) {
            this.f208374c = f2e0VarM164479j;
        } else {
            this.f208374c = nrd0.m164474e();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Schedulers m222738a() {
        while (true) {
            AtomicReference<Schedulers> atomicReference = INSTANCE;
            Schedulers schedulers = atomicReference.get();
            if (schedulers != null) {
                return schedulers;
            }
            Schedulers schedulers2 = new Schedulers();
            if (m31.m156916a(atomicReference, null, schedulers2)) {
                return schedulers2;
            }
            schedulers2.m222740b();
        }
    }

    public static f2e0 computation() {
        return hrd0.m136788f(m222738a().f208372a);
    }

    public static f2e0 from(Executor executor) {
        return new b7f(executor);
    }

    public static f2e0 immediate() {
        return olm.INSTANCE;
    }

    /* JADX INFO: renamed from: io */
    public static f2e0 m222739io() {
        return hrd0.m136793k(m222738a().f208373b);
    }

    public static f2e0 newThread() {
        return hrd0.m136794l(m222738a().f208374c);
    }

    public static void reset() {
        Schedulers andSet = INSTANCE.getAndSet(null);
        if (andSet != null) {
            andSet.m222740b();
        }
    }

    public static void shutdown() {
        Schedulers schedulersM222738a = m222738a();
        schedulersM222738a.m222740b();
        synchronized (schedulersM222738a) {
            C22471a.INSTANCE.shutdown();
            urd0.f180602h.shutdown();
            urd0.f180603i.shutdown();
        }
    }

    public static void start() {
        Schedulers schedulersM222738a = m222738a();
        schedulersM222738a.m222741c();
        synchronized (schedulersM222738a) {
            C22471a.INSTANCE.start();
            urd0.f180602h.start();
            urd0.f180603i.start();
        }
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static f2e0 trampoline() {
        return igj0.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m222740b() {
        try {
            Object obj = this.f208372a;
            if (obj instanceof j2e0) {
                ((j2e0) obj).shutdown();
            }
            Object obj2 = this.f208373b;
            if (obj2 instanceof j2e0) {
                ((j2e0) obj2).shutdown();
            }
            Object obj3 = this.f208374c;
            if (obj3 instanceof j2e0) {
                ((j2e0) obj3).shutdown();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m222741c() {
        try {
            Object obj = this.f208372a;
            if (obj instanceof j2e0) {
                ((j2e0) obj).start();
            }
            Object obj2 = this.f208373b;
            if (obj2 instanceof j2e0) {
                ((j2e0) obj2).start();
            }
            Object obj3 = this.f208374c;
            if (obj3 instanceof j2e0) {
                ((j2e0) obj3).start();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
