package p003l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import p014rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class v3f extends bud0 implements fud0 {

    /* JADX INFO: renamed from: d */
    public static final int f8188d;

    /* JADX INFO: renamed from: e */
    public static final C0596c f8189e;

    /* JADX INFO: renamed from: f */
    public static final C0595b f8190f;

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f8191b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<C0595b> f8192c = new AtomicReference<>(f8190f);

    /* JADX INFO: renamed from: l.v3f$a */
    public static final class C0594a extends bud0.AbstractC0185a {

        /* JADX INFO: renamed from: a */
        public final g4g0 f8193a;

        /* JADX INFO: renamed from: b */
        public final bs5 f8194b;

        /* JADX INFO: renamed from: c */
        public final g4g0 f8195c;

        /* JADX INFO: renamed from: d */
        public final C0596c f8196d;

        /* JADX INFO: renamed from: l.v3f$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d30 f8197a;

            public a(d30 d30Var) {
                this.f8197a = d30Var;
            }

            @Override // p003l.d30
            public void call() {
                if (C0594a.this.isUnsubscribed()) {
                    return;
                }
                this.f8197a.call();
            }
        }

        /* JADX INFO: renamed from: l.v3f$a$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d30 f8199a;

            public b(d30 d30Var) {
                this.f8199a = d30Var;
            }

            @Override // p003l.d30
            public void call() {
                if (C0594a.this.isUnsubscribed()) {
                    return;
                }
                this.f8199a.call();
            }
        }

        public C0594a(C0596c c0596c) {
            g4g0 g4g0Var = new g4g0();
            this.f8193a = g4g0Var;
            bs5 bs5Var = new bs5();
            this.f8194b = bs5Var;
            this.f8195c = new g4g0(g4g0Var, bs5Var);
            this.f8196d = c0596c;
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: b */
        public c4g0 mo2914b(d30 d30Var) {
            return isUnsubscribed() ? h4g0.m4917d() : this.f8196d.m8697k(new a(d30Var), 0L, null, this.f8193a);
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: c */
        public c4g0 mo2915c(d30 d30Var, long j, TimeUnit timeUnit) {
            return isUnsubscribed() ? h4g0.m4917d() : this.f8196d.m8696j(new b(d30Var), j, timeUnit, this.f8194b);
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f8195c.isUnsubscribed();
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            this.f8195c.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.v3f$b */
    public static final class C0595b {

        /* JADX INFO: renamed from: a */
        public final int f8201a;

        /* JADX INFO: renamed from: b */
        public final C0596c[] f8202b;

        /* JADX INFO: renamed from: c */
        public long f8203c;

        public C0595b(ThreadFactory threadFactory, int i) {
            this.f8201a = i;
            this.f8202b = new C0596c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f8202b[i2] = new C0596c(threadFactory);
            }
        }

        /* JADX INFO: renamed from: a */
        public C0596c m8296a() {
            int i = this.f8201a;
            if (i == 0) {
                return v3f.f8189e;
            }
            C0596c[] c0596cArr = this.f8202b;
            long j = this.f8203c;
            this.f8203c = 1 + j;
            return c0596cArr[(int) (j % ((long) i))];
        }

        /* JADX INFO: renamed from: b */
        public void m8297b() {
            for (C0596c c0596c : this.f8202b) {
                c0596c.unsubscribe();
            }
        }
    }

    /* JADX INFO: renamed from: l.v3f$c */
    public static final class C0596c extends xa40 {
        public C0596c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int iIntValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iIntValue <= 0 || iIntValue > iAvailableProcessors) {
            iIntValue = iAvailableProcessors;
        }
        f8188d = iIntValue;
        C0596c c0596c = new C0596c(RxThreadFactory.NONE);
        f8189e = c0596c;
        c0596c.unsubscribe();
        f8190f = new C0595b(null, 0);
    }

    public v3f(ThreadFactory threadFactory) {
        this.f8191b = threadFactory;
        start();
    }

    /* JADX INFO: renamed from: a */
    public c4g0 m8295a(d30 d30Var) {
        return this.f8192c.get().m8296a().m8695i(d30Var, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // p003l.bud0
    public bud0.AbstractC0185a createWorker() {
        return new C0594a(this.f8192c.get().m8296a());
    }

    @Override // p003l.fud0
    public void shutdown() {
        C0595b c0595b;
        C0595b c0595b2;
        do {
            c0595b = this.f8192c.get();
            c0595b2 = f8190f;
            if (c0595b == c0595b2) {
                return;
            }
        } while (!f31.a(this.f8192c, c0595b, c0595b2));
        c0595b.m8297b();
    }

    @Override // p003l.fud0
    public void start() {
        C0595b c0595b = new C0595b(this.f8191b, f8188d);
        if (f31.a(this.f8192c, f8190f, c0595b)) {
            return;
        }
        c0595b.m8297b();
    }
}
