package p153l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class z4f extends f2e0 implements j2e0 {

    /* JADX INFO: renamed from: d */
    public static final int f202937d;

    /* JADX INFO: renamed from: e */
    public static final C21764c f202938e;

    /* JADX INFO: renamed from: f */
    public static final C21763b f202939f;

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f202940b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<C21763b> f202941c = new AtomicReference<>(f202939f);

    /* JADX INFO: renamed from: l.z4f$a */
    public static final class C21762a extends f2e0.AbstractC16877a {

        /* JADX INFO: renamed from: a */
        public final ocg0 f202942a;

        /* JADX INFO: renamed from: b */
        public final ft5 f202943b;

        /* JADX INFO: renamed from: c */
        public final ocg0 f202944c;

        /* JADX INFO: renamed from: d */
        public final C21764c f202945d;

        /* JADX INFO: renamed from: l.z4f$a$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ x20 f202946a;

            public a(x20 x20Var) {
                this.f202946a = x20Var;
            }

            @Override // p153l.x20
            public void call() {
                if (C21762a.this.isUnsubscribed()) {
                    return;
                }
                this.f202946a.call();
            }
        }

        /* JADX INFO: renamed from: l.z4f$a$b */
        public class b implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ x20 f202948a;

            public b(x20 x20Var) {
                this.f202948a = x20Var;
            }

            @Override // p153l.x20
            public void call() {
                if (C21762a.this.isUnsubscribed()) {
                    return;
                }
                this.f202948a.call();
            }
        }

        public C21762a(C21764c c21764c) {
            ocg0 ocg0Var = new ocg0();
            this.f202942a = ocg0Var;
            ft5 ft5Var = new ft5();
            this.f202943b = ft5Var;
            this.f202944c = new ocg0(ocg0Var, ft5Var);
            this.f202945d = c21764c;
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: b */
        public kcg0 mo102836b(x20 x20Var) {
            return isUnsubscribed() ? pcg0.m171651d() : this.f202945d.m154464k(new a(x20Var), 0L, null, this.f202942a);
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: c */
        public kcg0 mo102837c(x20 x20Var, long j, TimeUnit timeUnit) {
            return isUnsubscribed() ? pcg0.m171651d() : this.f202945d.m154463j(new b(x20Var), j, timeUnit, this.f202943b);
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f202944c.isUnsubscribed();
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            this.f202944c.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.z4f$b */
    public static final class C21763b {

        /* JADX INFO: renamed from: a */
        public final int f202950a;

        /* JADX INFO: renamed from: b */
        public final C21764c[] f202951b;

        /* JADX INFO: renamed from: c */
        public long f202952c;

        public C21763b(ThreadFactory threadFactory, int i) {
            this.f202950a = i;
            this.f202951b = new C21764c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f202951b[i2] = new C21764c(threadFactory);
            }
        }

        /* JADX INFO: renamed from: a */
        public C21764c m218581a() {
            int i = this.f202950a;
            if (i == 0) {
                return z4f.f202938e;
            }
            C21764c[] c21764cArr = this.f202951b;
            long j = this.f202952c;
            this.f202952c = 1 + j;
            return c21764cArr[(int) (j % ((long) i))];
        }

        /* JADX INFO: renamed from: b */
        public void m218582b() {
            for (C21764c c21764c : this.f202951b) {
                c21764c.unsubscribe();
            }
        }
    }

    /* JADX INFO: renamed from: l.z4f$c */
    public static final class C21764c extends lj40 {
        public C21764c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int iIntValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iIntValue <= 0 || iIntValue > iAvailableProcessors) {
            iIntValue = iAvailableProcessors;
        }
        f202937d = iIntValue;
        C21764c c21764c = new C21764c(RxThreadFactory.NONE);
        f202938e = c21764c;
        c21764c.unsubscribe();
        f202939f = new C21763b(null, 0);
    }

    public z4f(ThreadFactory threadFactory) {
        this.f202940b = threadFactory;
        start();
    }

    /* JADX INFO: renamed from: a */
    public kcg0 m218580a(x20 x20Var) {
        return this.f202941c.get().m218581a().m154462i(x20Var, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // p153l.f2e0
    public f2e0.AbstractC16877a createWorker() {
        return new C21762a(this.f202941c.get().m218581a());
    }

    @Override // p153l.j2e0
    public void shutdown() {
        C21763b c21763b;
        C21763b c21763b2;
        do {
            c21763b = this.f202941c.get();
            c21763b2 = f202939f;
            if (c21763b == c21763b2) {
                return;
            }
        } while (!m31.m156916a(this.f202941c, c21763b, c21763b2));
        c21763b.m218582b();
    }

    @Override // p153l.j2e0
    public void start() {
        C21763b c21763b = new C21763b(this.f202940b, f202937d);
        if (m31.m156916a(this.f202941c, f202939f, c21763b)) {
            return;
        }
        c21763b.m218582b();
    }
}
