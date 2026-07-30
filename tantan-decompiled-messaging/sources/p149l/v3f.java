package p149l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class v3f extends bud0 implements fud0 {

    /* JADX INFO: renamed from: d */
    public static final int f179770d;

    /* JADX INFO: renamed from: e */
    public static final C20576c f179771e;

    /* JADX INFO: renamed from: f */
    public static final C20575b f179772f;

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f179773b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<C20575b> f179774c = new AtomicReference<>(f179772f);

    /* JADX INFO: renamed from: l.v3f$a */
    public static final class C20574a extends bud0.AbstractC15976a {

        /* JADX INFO: renamed from: a */
        public final g4g0 f179775a;

        /* JADX INFO: renamed from: b */
        public final bs5 f179776b;

        /* JADX INFO: renamed from: c */
        public final g4g0 f179777c;

        /* JADX INFO: renamed from: d */
        public final C20576c f179778d;

        /* JADX INFO: renamed from: l.v3f$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d30 f179779a;

            public a(d30 d30Var) {
                this.f179779a = d30Var;
            }

            @Override // p149l.d30
            public void call() {
                if (C20574a.this.isUnsubscribed()) {
                    return;
                }
                this.f179779a.call();
            }
        }

        /* JADX INFO: renamed from: l.v3f$a$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d30 f179781a;

            public b(d30 d30Var) {
                this.f179781a = d30Var;
            }

            @Override // p149l.d30
            public void call() {
                if (C20574a.this.isUnsubscribed()) {
                    return;
                }
                this.f179781a.call();
            }
        }

        public C20574a(C20576c c20576c) {
            g4g0 g4g0Var = new g4g0();
            this.f179775a = g4g0Var;
            bs5 bs5Var = new bs5();
            this.f179776b = bs5Var;
            this.f179777c = new g4g0(g4g0Var, bs5Var);
            this.f179778d = c20576c;
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: b */
        public c4g0 mo99201b(d30 d30Var) {
            return isUnsubscribed() ? h4g0.m129243d() : this.f179778d.m207528k(new a(d30Var), 0L, null, this.f179775a);
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: c */
        public c4g0 mo99202c(d30 d30Var, long j, TimeUnit timeUnit) {
            return isUnsubscribed() ? h4g0.m129243d() : this.f179778d.m207527j(new b(d30Var), j, timeUnit, this.f179776b);
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f179777c.isUnsubscribed();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            this.f179777c.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.v3f$b */
    public static final class C20575b {

        /* JADX INFO: renamed from: a */
        public final int f179783a;

        /* JADX INFO: renamed from: b */
        public final C20576c[] f179784b;

        /* JADX INFO: renamed from: c */
        public long f179785c;

        public C20575b(ThreadFactory threadFactory, int i) {
            this.f179783a = i;
            this.f179784b = new C20576c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f179784b[i2] = new C20576c(threadFactory);
            }
        }

        /* JADX INFO: renamed from: a */
        public C20576c m196850a() {
            int i = this.f179783a;
            if (i == 0) {
                return v3f.f179771e;
            }
            C20576c[] c20576cArr = this.f179784b;
            long j = this.f179785c;
            this.f179785c = 1 + j;
            return c20576cArr[(int) (j % ((long) i))];
        }

        /* JADX INFO: renamed from: b */
        public void m196851b() {
            for (C20576c c20576c : this.f179784b) {
                c20576c.unsubscribe();
            }
        }
    }

    /* JADX INFO: renamed from: l.v3f$c */
    public static final class C20576c extends xa40 {
        public C20576c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int iIntValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iIntValue <= 0 || iIntValue > iAvailableProcessors) {
            iIntValue = iAvailableProcessors;
        }
        f179770d = iIntValue;
        C20576c c20576c = new C20576c(RxThreadFactory.NONE);
        f179771e = c20576c;
        c20576c.unsubscribe();
        f179772f = new C20575b(null, 0);
    }

    public v3f(ThreadFactory threadFactory) {
        this.f179773b = threadFactory;
        start();
    }

    /* JADX INFO: renamed from: a */
    public c4g0 m196849a(d30 d30Var) {
        return this.f179774c.get().m196850a().m207526i(d30Var, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // p149l.bud0
    public bud0.AbstractC15976a createWorker() {
        return new C20574a(this.f179774c.get().m196850a());
    }

    @Override // p149l.fud0
    public void shutdown() {
        C20575b c20575b;
        C20575b c20575b2;
        do {
            c20575b = this.f179774c.get();
            c20575b2 = f179772f;
            if (c20575b == c20575b2) {
                return;
            }
        } while (!f31.m119248a(this.f179774c, c20575b, c20575b2));
        c20575b.m196851b();
    }

    @Override // p149l.fud0
    public void start() {
        C20575b c20575b = new C20575b(this.f179773b, f179770d);
        if (f31.m119248a(this.f179774c, f179772f, c20575b)) {
            return;
        }
        c20575b.m196851b();
    }
}
