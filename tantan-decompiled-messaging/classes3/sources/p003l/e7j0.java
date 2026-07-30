package p003l;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class e7j0 extends bud0 {
    public static final e7j0 INSTANCE = new e7j0();

    /* JADX INFO: renamed from: l.e7j0$a */
    public static final class C0256a extends bud0.AbstractC0185a implements c4g0 {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f3209a = new AtomicInteger();

        /* JADX INFO: renamed from: b */
        public final PriorityBlockingQueue<C0257b> f3210b = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: c */
        public final u53 f3211c = new u53();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f3212d = new AtomicInteger();

        /* JADX INFO: renamed from: l.e7j0$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0257b f3213a;

            public a(C0257b c0257b) {
                this.f3213a = c0257b;
            }

            @Override // p003l.d30
            public void call() {
                C0256a.this.f3210b.remove(this.f3213a);
            }
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: b */
        public c4g0 mo2914b(d30 d30Var) {
            return m3801e(d30Var, mo3171a());
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: c */
        public c4g0 mo2915c(d30 d30Var, long j, TimeUnit timeUnit) {
            long jMo3171a = mo3171a() + timeUnit.toMillis(j);
            return m3801e(new mjf0(d30Var, this, jMo3171a), jMo3171a);
        }

        /* JADX INFO: renamed from: e */
        public final c4g0 m3801e(d30 d30Var, long j) {
            if (this.f3211c.isUnsubscribed()) {
                return h4g0.m4917d();
            }
            C0257b c0257b = new C0257b(d30Var, Long.valueOf(j), this.f3209a.incrementAndGet());
            this.f3210b.add(c0257b);
            if (this.f3212d.getAndIncrement() != 0) {
                return h4g0.m4914a(new a(c0257b));
            }
            do {
                C0257b c0257bPoll = this.f3210b.poll();
                if (c0257bPoll != null) {
                    c0257bPoll.f3215a.call();
                }
            } while (this.f3212d.decrementAndGet() > 0);
            return h4g0.m4917d();
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f3211c.isUnsubscribed();
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            this.f3211c.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.e7j0$b */
    public static final class C0257b implements Comparable<C0257b> {

        /* JADX INFO: renamed from: a */
        public final d30 f3215a;

        /* JADX INFO: renamed from: b */
        public final Long f3216b;

        /* JADX INFO: renamed from: c */
        public final int f3217c;

        public C0257b(d30 d30Var, Long l2, int i) {
            this.f3215a = d30Var;
            this.f3216b = l2;
            this.f3217c = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0257b c0257b) {
            int iCompareTo = this.f3216b.compareTo(c0257b.f3216b);
            return iCompareTo == 0 ? e7j0.m3800a(this.f3217c, c0257b.f3217c) : iCompareTo;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m3800a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    @Override // p003l.bud0
    public bud0.AbstractC0185a createWorker() {
        return new C0256a();
    }
}
